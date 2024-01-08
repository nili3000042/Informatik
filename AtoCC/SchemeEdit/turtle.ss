(load "record.ss")

(define scan
  (lambda (file)
    (let* ((in (open-input-file file))    ; Datei muss existieren!
           (out (open-output-file "scan.out" 'replace))
           (scan-error
            (lambda (token)
              (close-output-port out)
              (error 'scan "Fehlerhafte/s ~s" token)))
           (whitespace?
            (lambda (ch)
              (memv ch '(#\space #\return #\newline #\tab))))
           (ziffer->wert
            (let ((null (char->integer #\0)))
              (lambda (ch)
                (- (char->integer ch) null))))
           (buchst? (lambda (ch) (memv ch
                                     '(#\a #\b #\c #\d #\e #\f #\g #\h
                                       #\i #\j #\k #\l #\m #\n #\o #\p
                                       #\q #\r #\s #\t #\u #\v #\w #\x
                                       #\y #\z))))
           (ziffer? (lambda (ch) (memv ch 
                           '(#\1 #\2 #\3 #\4 #\5 #\6 #\7 #\8 #\9 #\0)))))
      (letrec
          ((scan0
            (lambda ()
              (let ((c (read-char in)))
                (display c)
                (cond
                 ((whitespace? c) (scan0))
                 ((eof-object? c) "Scanning finished!")
                 ((buchst? c)
                  (write (scan-var (string c)) out) (scan0))
                 ((ziffer? c)
                  (write (scan-zahl (ziffer->wert c)) out) (scan0))
                 ((and (eq? c #\:)            ; Zuweisungsoperator
                       (let ((ch (read-char in)))
                         (eq? ch #\=)))
                  (write (cons 'zop ':=) out) (scan0))
                 (else
                  (scan-error 'token))))))
           (scan-var
            (lambda (name)
              (let ((next (peek-char in)))
                (cond
                 ((whitespace? next) (cons 'variable name)) ; Variablenamen zuende
                 ((buchst? next)
                  (read-char in)
                  (scan-var (string-append name (string next))))
                 (else
                  (scan-error 'variable))))))
           (scan-zahl
            (lambda (wert)
              (let ((next (peek-char in)))
                (cond
                 ((whitespace? next) (cons 'zahl wert))
                 ((ziffer? next)
                  (read-char in)
                  (scan-zahl (+ (* 10 wert) (ziffer->wert next))))
                 (else
                  (scan-error 'zahl)))))))
        (let ((resultat (scan0)))
          (close-output-port out)
          (close-input-port in)
          resultat)))))
; Aufruf: (scan "x.txt") 

(define-record zuweisung (var zop zahl))
(define-record variable (var))
(define-record zop (operator))
(define-record zahl (n))

(define parse
  (lambda ()
    (let* ((in (open-input-file "scan.out"))
           (out (open-output-file "parse.out" 'replace))
           (parse-error
            (lambda (token)
              (close-output-port out)
              (error 'parse "Syntaxfehler in ~s" token))))
      (letrec
          ((parse0
            (lambda ()
              (zuweisung)))        ; Spitzensymbol         
           (zuweisung
            (lambda ()
              (write
                (let* ((v (variable))(z (zop))(n (zahl)))
                  (make-zuweisung v z n))
                out)))
           (variable
            (lambda ()
              (let ((token (read in)))
                (if (eq? (car token) 'variable)
                    (make-variable (cdr token))
                    (parse-error token)))))
           (zop
            (lambda ()
              (let ((token (read in)))
                (if (eq? (car token) 'zop)
                    (make-zop (cdr token))
                    (parse-error token)))))
           (zahl
            (lambda ()
              (let ((token (read in)))
                (if (eq? (car token) 'zahl)
                    (make-zahl (cdr token))
                    (parse-error token))))))
        (parse0)
        (close-output-port out)
        (close-input-port in)
        "Parsing finished!"))))
; Aufruf: (parse) 


