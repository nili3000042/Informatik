;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; VCC generated Scheme Code
;;;  - Use (Scanner "Input Text") for scan
;;;  - Use (Parser (Scanner "Input Text")) for parse
;;;  - Use (Compiler "Input.txt" "Output.txt") for file parse
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; Global settings: 
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(define DatenSegment "")
(define CodeSegment "")
(define StringID 0)
(define LabelID 0)
(define nl (string #\return #\linefeed))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; Scanner
;;;  ex.: (Scanner "BEGIN IF X > 5 THEN INC(X); END")
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(load "pregexp.ss")
(define Scanner
  (lambda (Input)
    (letrec
      ((TokenList '())
       (FindToken
          (lambda (RestWord)
            (let ((ls '()) (i "") (Search ""))
                (if (> (string-length RestWord) 0)
                   (begin
                     (set! Search "PROGRAM")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_programmanfang (car i)))))

                     (set! Search "END\\.")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_programmende (car i)))))

                     (set! Search "BEGIN")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_blockanfang (car i)))))

                     (set! Search "END")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_blockende (car i)))))

                     (set! Search ":=")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_zuweisung (car i)))))

                     (set! Search "WHILE")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_while (car i)))))

                     (set! Search "DO")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_do (car i)))))

                     (set! Search "IF")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_if (car i)))))

                     (set! Search "THEN")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_then (car i)))))

                     (set! Search "INC")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_increment (car i)))))

                     (set! Search "DEC")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_decrement (car i)))))

                     (set! Search ",")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_komma (car i)))))

                     (set! Search "GET")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_get (car i)))))

                     (set! Search "PRINT")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_print (car i)))))

                     (set! Search ">")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_groesser (car i)))))

                     (set! Search "<")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_kleiner (car i)))))

                     (set! Search "==")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_gleich (car i)))))

                     (set! Search "!=")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_ungleich (car i)))))

                     (set! Search "\\$A")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_registera (car i)))))

                     (set! Search "\\$B")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_registerb (car i)))))

                     (set! Search "\\$C")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_registerc (car i)))))

                     (set! Search "\\$D")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_registerd (car i)))))

                     (set! Search "\\$E")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_registere (car i)))))

                     (set! Search "0")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_ziffer0 (car i)))))

                     (set! Search "1")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_ziffer1 (car i)))))

                     (set! Search "2")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_ziffer2 (car i)))))

                     (set! Search "3")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_ziffer3 (car i)))))

                     (set! Search "4")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_ziffer4 (car i)))))

                     (set! Search "5")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_ziffer5 (car i)))))

                     (set! Search "6")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_ziffer6 (car i)))))

                     (set! Search "7")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_ziffer7 (car i)))))

                     (set! Search "8")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_ziffer8 (car i)))))

                     (set! Search "9")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_ziffer9 (car i)))))

                     (set! Search "'[^']*'")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_stringzeichenkette (car i)))))

                     (set! Search "[\\s\\t\\r\\n]+")
                     (set! i (pregexp-match Search RestWord))
                     (if (or (eq? i #f) (> (caar (pregexp-match-positions Search RestWord)) 0)) (set! i '("")))
                     (set! ls (append ls (list (cons 'token_ignore (car i)))))

                     (set! ls (sort ls (lambda (x y)
                       (if (> (string-length (cdr x))(string-length (cdr y))) #t #f))))

                     (if (or (= (length ls) 0) (eq? (cdar ls) ""))
                        (begin (write RestWord)(error 'Scanner "No matching token found!")))
                     (if (not(eq? (caar ls) 'token_ignore))
                        (set! TokenList (append TokenList (list (car ls)))))
                     (FindToken (substring RestWord (string-length (cdar ls)) (string-length RestWord)))
                     ))))))
      (FindToken Input) TokenList)))
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; Parser
;;;  ex.: (Parser '((BeginToken . "BEGIN") (IfToken . "IF") ...))
;;;       (Parser (Scanner "BEGIN IF X > 5 THEN INC(X); END"))
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(define token_ignore 256)
(define token_programmanfang 257)
(define token_programmende 258)
(define token_blockanfang 259)
(define token_blockende 260)
(define token_zuweisung 261)
(define token_while 262)
(define token_do 263)
(define token_if 264)
(define token_then 265)
(define token_increment 266)
(define token_decrement 267)
(define token_komma 268)
(define token_get 269)
(define token_print 270)
(define token_groesser 271)
(define token_kleiner 272)
(define token_gleich 273)
(define token_ungleich 274)
(define token_registera 275)
(define token_registerb 276)
(define token_registerc 277)
(define token_registerd 278)
(define token_registere 279)
(define token_ziffer0 280)
(define token_ziffer1 281)
(define token_ziffer2 282)
(define token_ziffer3 283)
(define token_ziffer4 284)
(define token_ziffer5 285)
(define token_ziffer6 286)
(define token_ziffer7 287)
(define token_ziffer8 288)
(define token_ziffer9 289)
(define token_stringzeichenkette 290)
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(define Parser
 (lambda (TokenList)
  (define-syntax while
    (syntax-rules ()
      ((while test statement)
       (letrec ((loop (lambda () (cond (test statement (loop))))))
         (loop)))))
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
  (letrec (
   (yyaction
    (lambda (yyruleno)
     (cond 
      ((= yyruleno    1)
         (set! CodeSegment (list-ref yyv (- yysp 1)))
         (display ";=======================================================================")(newline)
         (display ".MODEL  SMALL")(newline)
         (display ".STACK  100h")(newline)
         (display ";=======================================================================")(newline)
         (display ".DATA")(newline)
         (display "RegisterA  DB 0 ")(newline)
         (display "RegisterB  DB 0 ")(newline)
         (display "RegisterC  DB 0 ")(newline)
         (display "RegisterD  DB 0 ")(newline)
         (display "RegisterE  DB 0 ")(newline)
         (display DatenSegment)(newline)
         (display ";=======================================================================")(newline)
         (display ".CODE")(newline)
         (display "start:")(newline)
         (display "mov ax,@data")(newline)
         (display "mov ds,ax                   ;set DS to point to the data segment")(newline)
         (display "")(newline)
         (display ";;; CODE ;;;")(newline)
         (display CodeSegment)(newline)
         (display "")(newline)
         (display "mov ah,4ch                  ;DOS: terminate program")(newline)
         (display "mov al,0                    ;return code will be 0")(newline)
         (display "int 21h                     ;terminate the program")(newline)
         (display "END start")(newline)
         (display ";=======================================================================")(newline)
         
       )
      ((= yyruleno    2)
         (set! yyval (list-ref yyv (- yysp 0)))
         
       )
      ((= yyruleno    3)
         (set! yyval (string-append (list-ref yyv (- yysp 1)) (list-ref yyv (- yysp 0))))
         
       )
      ((= yyruleno    4)
         (set! yyval (list-ref yyv (- yysp 1)))
         
       )
      ((= yyruleno    5)
         (set! yyval (string-append "mov " (list-ref yyv (- yysp 2)) "," (list-ref yyv (- yysp 0)) nl))
         
       )
      ((= yyruleno    6)
         (set! yyval (string-append "mov al," (list-ref yyv (- yysp 2)) nl "mov " (list-ref yyv (- yysp 0)) ",al" nl ))
         
       )
      ((= yyruleno    7)
         (set! yyval (string-append 
         "Label" (number->string LabelID) ":" nl
         (list-ref yyv (- yysp 0)) nl
         (list-ref yyv (- yysp 2)) " Label" (number->string (+ LabelID 1)) nl
         "jmp Label" (number->string LabelID) nl
         "Label" (number->string (+ LabelID 1)) ":" nl))
         (set! LabelID (+ LabelID 2))
         
       )
      ((= yyruleno    8)
         (set! yyval (string-append 
         (list-ref yyv (- yysp 2)) " Label" (number->string LabelID) nl
         (list-ref yyv (- yysp 0)) nl
         "Label" (number->string LabelID) ":" nl))
         (set! LabelID (+ LabelID 1))
         
       )
      ((= yyruleno    9)
         (set! yyval (string-append "inc " (list-ref yyv (- yysp 0)) nl))
         
       )
      ((= yyruleno   10)
         (set! yyval (string-append "mov al," (list-ref yyv (- yysp 2)) nl "add al," (list-ref yyv (- yysp 0)) nl "mov " (list-ref yyv (- yysp 0)) ",al" nl))
         
       )
      ((= yyruleno   11)
         (set! yyval (string-append "mov al," (list-ref yyv (- yysp 2)) nl "add al," (list-ref yyv (- yysp 0)) nl "mov " (list-ref yyv (- yysp 0)) ",al" nl))
         
       )
      ((= yyruleno   12)
         (set! yyval (string-append "dec " (list-ref yyv (- yysp 0)) nl))
         
       )
      ((= yyruleno   13)
         (set! yyval (string-append "mov al," (list-ref yyv (- yysp 2)) nl "sub al," (list-ref yyv (- yysp 0)) nl "mov " (list-ref yyv (- yysp 0)) ",al" nl))
         
       )
      ((= yyruleno   14)
         (set! yyval (string-append "mov al," (list-ref yyv (- yysp 2)) nl "sub al," (list-ref yyv (- yysp 0)) nl "mov " (list-ref yyv (- yysp 0)) ",al" nl))
         
       )
      ((= yyruleno   15)
         (set! yyval (string-append "mov ah,1" nl "int 21h" nl "mov " (list-ref yyv (- yysp 0)) ",al" nl))
         
       )
      ((= yyruleno   16)
         (set! yyval (string-append
         "mov ah,0" nl
         "mov al," (list-ref yyv (- yysp 0)) nl
         "mov cx,0" nl
         "Label" (number->string LabelID) ":" nl
         "mov dx,0" nl
         "mov bx, 10" nl
         "div bx" nl
         "push dx" nl
         "inc cx" nl
         "cmp ax,0" nl
         "jne Label" (number->string LabelID) nl
         "Label" (number->string (+ LabelID 1)) ":" nl
         "pop ax" nl
         "add al,48" nl
         "mov dh,0" nl
         "mov dl,al" nl
         "mov al,0" nl
         "mov ah,2" nl
         "int 21h" nl
         "dec cx" nl
         "cmp cx,0" nl
         "jne Label" (number->string (+ LabelID 1)) nl))
         (set! LabelID (+ LabelID 2))
         
       )
      ((= yyruleno   17)
         (set! yyval (string-append
         "mov dx,OFFSET " (list-ref yyv (- yysp 0)) "    ;point to string" nl
         "mov ah,9                ;DOS: print string" nl
         "int 21h                 ;display it" nl ))
         
       )
      ((= yyruleno   18)
         (set! yyval (string-append
         "mov al," (list-ref yyv (- yysp 2)) nl
         "cmp al," (list-ref yyv (- yysp 0)) nl (list-ref yyv (- yysp 1)) ))
         
       )
      ((= yyruleno   19)
         (set! yyval (string-append
         "cmp " (list-ref yyv (- yysp 2)) "," (list-ref yyv (- yysp 0)) nl (list-ref yyv (- yysp 1)) ))
         
       )
      ((= yyruleno   20)
         (set! yyval (string-append
         "cmp " (list-ref yyv (- yysp 2)) "," (list-ref yyv (- yysp 0)) nl (list-ref yyv (- yysp 1)) ))
         
       )
      ((= yyruleno   21)
         (set! yyval (string-append
         "cmp " (list-ref yyv (- yysp 2)) "," (list-ref yyv (- yysp 0)) nl (list-ref yyv (- yysp 1)) ))
         
       )
      ((= yyruleno   22)
         (set! yyval "jle") ; // Achtung Bedingungen sind alle Verkehrtherum durch das Sprungverhalten
         
       )
      ((= yyruleno   23)
         (set! yyval "jge")
         
       )
      ((= yyruleno   24)
         (set! yyval "jne")
         
       )
      ((= yyruleno   25)
         (set! yyval "je")
         
       )
      ((= yyruleno   26)
         (set! yyval "RegisterA")
         
       )
      ((= yyruleno   27)
         (set! yyval "RegisterB")
         
       )
      ((= yyruleno   28)
         (set! yyval "RegisterC")
         
       )
      ((= yyruleno   29)
         (set! yyval "RegisterD")
         
       )
      ((= yyruleno   30)
         (set! yyval "RegisterE")
         
       )
      ((= yyruleno   31)
         
       )
      ((= yyruleno   32)
         (set! yyval (string-append (list-ref yyv (- yysp 1)) (list-ref yyv (- yysp 0))))
         
       )
      ((= yyruleno   33)
         
       )
      ((= yyruleno   34)
         
       )
      ((= yyruleno   35)
         
       )
      ((= yyruleno   36)
         
       )
      ((= yyruleno   37)
         
       )
      ((= yyruleno   38)
         
       )
      ((= yyruleno   39)
         
       )
      ((= yyruleno   40)
         
       )
      ((= yyruleno   41)
         
       )
      ((= yyruleno   42)
         
       )
      ((= yyruleno   43)
         (set! DatenSegment (string-append DatenSegment
         "String" (number->string StringID) 
         " db " (list-ref yyv (- yysp 0)) ",13,10,'$'" nl))
         
         (set! yyval (string-append "String" (number->string StringID)))
         
         (set! StringID (+ StringID 1))
         
       )
     )))
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; Temp Variables
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
   (yya  '(( 0 . 0) ( 257 . 2 ) ( 0 . 0 ) ( 262 . 6 ) ( 264 . 7 ) ( 266 . 8 ) ( 267 . 9 ) ( 269 . 10 ) ( 270 . 11 ) ( 275 . 12 ) ( 276 . 13 ) ( 277 . 14 ) ( 278 . 15 ) ( 279 . 16 ) ( 261 . 17 ) ( 262 . 6 ) ( 264 . 7 ) ( 266 . 8 ) ( 267 . 9 ) ( 269 . 10 ) ( 270 . 11 ) ( 275 . 12 ) ( 276 . 13 ) ( 277 . 14 ) ( 278 . 15 ) ( 279 . 16 ) ( 258 . -2 ) ( 260 . -2 ) ( 258 . 19 ) ( 275 . 12 ) ( 276 . 13 ) ( 277 . 14 ) ( 278 . 15 ) ( 279 . 16 ) ( 280 . 24 ) ( 281 . 25 ) ( 282 . 26 ) ( 283 . 27 ) ( 284 . 28 ) ( 285 . 29 ) ( 286 . 30 ) ( 287 . 31 ) ( 288 . 32 ) ( 289 . 33 ) ( 275 . 12 ) ( 276 . 13 ) ( 277 . 14 ) ( 278 . 15 ) ( 279 . 16 ) ( 280 . 24 ) ( 281 . 25 ) ( 282 . 26 ) ( 283 . 27 ) ( 284 . 28 ) ( 285 . 29 ) ( 286 . 30 ) ( 287 . 31 ) ( 288 . 32 ) ( 289 . 33 ) ( 275 . 12 ) ( 276 . 13 ) ( 277 . 14 ) ( 278 . 15 ) ( 279 . 16 ) ( 275 . 12 ) ( 276 . 13 ) ( 277 . 14 ) ( 278 . 15 ) ( 279 . 16 ) ( 275 . 12 ) ( 276 . 13 ) ( 277 . 14 ) ( 278 . 15 ) ( 279 . 16 ) ( 275 . 12 ) ( 276 . 13 ) ( 277 . 14 ) ( 278 . 15 ) ( 279 . 16 ) ( 290 . 40 ) ( 275 . 12 ) ( 276 . 13 ) ( 277 . 14 ) ( 278 . 15 ) ( 279 . 16 ) ( 280 . 24 ) ( 281 . 25 ) ( 282 . 26 ) ( 283 . 27 ) ( 284 . 28 ) ( 285 . 29 ) ( 286 . 30 ) ( 287 . 31 ) ( 288 . 32 ) ( 289 . 33 ) ( 280 . 24 ) ( 281 . 25 ) ( 282 . 26 ) ( 283 . 27 ) ( 284 . 28 ) ( 285 . 29 ) ( 286 . 30 ) ( 287 . 31 ) ( 288 . 32 ) ( 289 . 33 ) ( 258 . -31 ) ( 260 . -31 ) ( 262 . -31 ) ( 263 . -31 ) ( 264 . -31 ) ( 265 . -31 ) ( 266 . -31 ) ( 267 . -31 ) ( 269 . -31 ) ( 270 . -31 ) ( 271 . -31 ) ( 272 . -31 ) ( 273 . -31 ) ( 274 . -31 ) ( 275 . -31 ) ( 276 . -31 ) ( 277 . -31 ) ( 278 . -31 ) ( 279 . -31 ) ( 263 . 44 ) ( 271 . 46 ) ( 272 . 47 ) ( 273 . 48 ) ( 274 . 49 ) ( 271 . 46 ) ( 272 . 47 ) ( 273 . 48 ) ( 274 . 49 ) ( 265 . 51 ) ( 268 . 52 ) ( 258 . -9 ) ( 260 . -9 ) ( 262 . -9 ) ( 264 . -9 ) ( 266 . -9 ) ( 267 . -9 ) ( 269 . -9 ) ( 270 . -9 ) ( 275 . -9 ) ( 276 . -9 ) ( 277 . -9 ) ( 278 . -9 ) ( 279 . -9 ) ( 268 . 53 ) ( 258 . -12 ) ( 260 . -12 ) ( 262 . -12 ) ( 264 . -12 ) ( 266 . -12 ) ( 267 . -12 ) ( 269 . -12 ) ( 270 . -12 ) ( 275 . -12 ) ( 276 . -12 ) ( 277 . -12 ) ( 278 . -12 ) ( 279 . -12 ) ( 259 . 55 ) ( 275 . 12 ) ( 276 . 13 ) ( 277 . 14 ) ( 278 . 15 ) ( 279 . 16 ) ( 280 . 24 ) ( 281 . 25 ) ( 282 . 26 ) ( 283 . 27 ) ( 284 . 28 ) ( 285 . 29 ) ( 286 . 30 ) ( 287 . 31 ) ( 288 . 32 ) ( 289 . 33 ) ( 275 . 12 ) ( 276 . 13 ) ( 277 . 14 ) ( 278 . 15 ) ( 279 . 16 ) ( 280 . 24 ) ( 281 . 25 ) ( 282 . 26 ) ( 283 . 27 ) ( 284 . 28 ) ( 285 . 29 ) ( 286 . 30 ) ( 287 . 31 ) ( 288 . 32 ) ( 289 . 33 ) ( 259 . 55 ) ( 275 . 12 ) ( 276 . 13 ) ( 277 . 14 ) ( 278 . 15 ) ( 279 . 16 ) ( 280 . 24 ) ( 281 . 25 ) ( 282 . 26 ) ( 283 . 27 ) ( 284 . 28 ) ( 285 . 29 ) ( 286 . 30 ) ( 287 . 31 ) ( 288 . 32 ) ( 289 . 33 ) ( 275 . 12 ) ( 276 . 13 ) ( 277 . 14 ) ( 278 . 15 ) ( 279 . 16 ) ( 280 . 24 ) ( 281 . 25 ) ( 282 . 26 ) ( 283 . 27 ) ( 284 . 28 ) ( 285 . 29 ) ( 286 . 30 ) ( 287 . 31 ) ( 288 . 32 ) ( 289 . 33 ) ( 262 . 6 ) ( 264 . 7 ) ( 266 . 8 ) ( 267 . 9 ) ( 269 . 10 ) ( 270 . 11 ) ( 275 . 12 ) ( 276 . 13 ) ( 277 . 14 ) ( 278 . 15 ) ( 279 . 16 ) ( 260 . 66 )))
   (yyg  '(( 0 . 0) ( -2 . 1 ) ( -6 . 3 ) ( -4 . 4 ) ( -3 . 5 ) ( -6 . 3 ) ( -4 . 4 ) ( -3 . 18 ) ( -11 . 20 ) ( -8 . 21 ) ( -7 . 22 ) ( -6 . 23 ) ( -11 . 20 ) ( -8 . 34 ) ( -7 . 22 ) ( -6 . 23 ) ( -6 . 35 ) ( -6 . 36 ) ( -6 . 37 ) ( -9 . 38 ) ( -6 . 39 ) ( -11 . 20 ) ( -7 . 41 ) ( -6 . 42 ) ( -11 . 20 ) ( -7 . 43 ) ( -10 . 45 ) ( -10 . 50 ) ( -5 . 54 ) ( -11 . 20 ) ( -7 . 56 ) ( -6 . 57 ) ( -11 . 20 ) ( -7 . 58 ) ( -6 . 59 ) ( -5 . 60 ) ( -11 . 20 ) ( -7 . 61 ) ( -6 . 62 ) ( -11 . 20 ) ( -7 . 63 ) ( -6 . 64 ) ( -6 . 3 ) ( -4 . 4 ) ( -3 . 65 )))
   (yyd  '(0 0 0 0 0 0 0 0 0 0 0 0 -26 -27 -28 -29 -30 0 -3 -1 0 0 0 0 -33 -34 -35 -36 -37 -38 -39 -40 -41 -42 0 0 0 -15 -17 -16 -43 -5 -6 -32 0 0 -22 -23 -24 -25 0 0 0 0 -7 0 -21 -20 -19 -18 -8 -11 -10 -14 -13 0 -4))
   (yyal '(1 2 3 14 15 28 29 44 59 64 69 74 80 80 80 80 80 80 95 95 95 124 125 129 133 133 133 133 133 133 133 133 133 133 133 134 148 162 162 162 162 162 162 162 162 163 178 178 178 178 178 193 194 209 224 224 235 235 235 235 235 235 235 235 235 235 236))
   (yyah '(1 2 13 14 27 28 43 58 63 68 73 79 79 79 79 79 79 94 94 94 123 124 128 132 132 132 132 132 132 132 132 132 132 132 133 147 161 161 161 161 161 161 161 161 162 177 177 177 177 177 192 193 208 223 223 234 234 234 234 234 234 234 234 234 234 235 235))
   (yygl '(1 2 2 5 5 8 8 12 16 17 18 19 21 21 21 21 21 21 24 24 24 26 26 27 28 28 28 28 28 28 28 28 28 28 28 28 28 28 28 28 28 28 28 28 28 29 32 32 32 32 32 35 36 39 42 42 45 45 45 45 45 45 45 45 45 45 45))
   (yygh '(1 1 4 4 7 7 11 15 16 17 18 20 20 20 20 20 20 23 23 23 25 25 26 27 27 27 27 27 27 27 27 27 27 27 27 27 27 27 27 27 27 27 27 27 28 31 31 31 31 31 34 35 38 41 41 44 44 44 44 44 44 44 44 44 44 44 44))
   (yyr  '(( 0 . 0) ( 3 . -2 ) ( 1 . -3 ) ( 2 . -3 ) ( 3 . -5 ) ( 3 . -4 ) ( 3 . -4 ) ( 4 . -4 ) ( 4 . -4 ) ( 2 . -4 ) ( 4 . -4 ) ( 4 . -4 ) ( 2 . -4 ) ( 4 . -4 ) ( 4 . -4 ) ( 2 . -4 ) ( 2 . -4 ) ( 2 . -4 ) ( 3 . -8 ) ( 3 . -8 ) ( 3 . -8 ) ( 3 . -8 ) ( 1 . -10 ) ( 1 . -10 ) ( 1 . -10 ) ( 1 . -10 ) ( 1 . -6 ) ( 1 . -6 ) ( 1 . -6 ) ( 1 . -6 ) ( 1 . -6 ) ( 1 . -7 ) ( 2 . -7 ) ( 1 . -11 ) ( 1 . -11 ) ( 1 . -11 ) ( 1 . -11 ) ( 1 . -11 ) ( 1 . -11 ) ( 1 . -11 ) ( 1 . -11 ) ( 1 . -11 ) ( 1 . -11 ) ( 1 . -9 )))
   (yystate 0) ;;; State
   (yys '(0))  ;;; Stack
   (yysp 0)    ;;; Stackpointer
   (yyv '(0))  ;;; Valuestack
   (yyval 0)   ;;; Current value
   (yylval 0)  ;;; LexValue
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
   (yyfnone 0)   (yyfaccept 1) (yyfabort 2)     (yyferror 3)
   (yynerrs 0)   (yyactval 0)  (yynstate 0)     (yyerrflag 0) 
   (yylexpos -1) (yyresult #f) (yyflag 0)       (yyn 0)
   (yychar -1) (yymaxdepth 1024)
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
   (list-set!
     (lambda (ls n i)
       (cond 
         ((and (>= n 0) (null? ls)) (append ls (list i)))
         ((null? ls) '())
         ((= n 0) (cons i (list-set! (cdr ls) (- n 1) i)))
         (else (cons (car ls) (list-set! (cdr ls) (- n 1) i))))))
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
   (yyact
     (lambda (state sym act)
       (letrec ((k 0))
         (set! k (list-ref yyal state))
         (while (and (<= k (list-ref yyah state)) 
                     (not (eq? (car (list-ref yya k)) sym)))
                (set! k (+ k 1)))
         (if (> k (list-ref yyah state)) #f
           (begin (set! yyactval (cdr (list-ref yya k))) #t)))))
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
   (yygoto
     (lambda (state sym nstate)
       (letrec ((k 0))
         (set! k (list-ref yygl state))
         (while (and (<= k (list-ref yygh state)) 
                     (not (eq? (car (list-ref yyg k)) sym)))
                (set! k (+ k 1)))
         (if (> k (list-ref yygh state)) #f
           (begin (set! yynstate (cdr (list-ref yyg k))) #t)))))
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
   (yylex
     (lambda ()
       (set! yylexpos (+ yylexpos 1))
       (if (>= yylexpos (length TokenList))
         (begin (set! yylval 0) 0)
         (begin
           (set! yylval (cdr (list-ref TokenList yylexpos)))
           (eval (car (list-ref TokenList yylexpos)))))))
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
   (yyparse
     (lambda ()
       (set! yystate 0) (set! yyn     0) (set! yys '(0))    (set! yyv '(0))
       (set! yyval   0) (set! yylval  0) (set! yyactval  0) (set! yynstate 0)
       (set! yychar -1) (set! yynerrs 0) (set! yyerrflag 0) (set! yysp 0)
       (letrec 
         ((parse   ;;;  (* push state and value: *)
            (lambda ()
              (set! yysp (+ yysp 1))
              (if (> yysp yymaxdepth) 
                (begin (yyerror "Stack overflow!") (abort))
                (begin
                  (set! yys (list-set! yys yysp yystate))
                  (set! yyv (list-set! yyv yysp yyval))
                  (next)))))
          (next    ;;; (* get next symbol *)
            (lambda ()
              (if (and (= (list-ref yyd yystate) 0) (= yychar -1))
                (begin
                  (set! yychar (yylex))
                  (if (< yychar 0) (set! yychar 0))
                  ))
                 (set! yyn (list-ref yyd yystate))
   
              ;(printf "state ~a, char ~a ~n" yystate yychar)

              (if (not (= yyn 0)) (reduce)
                (begin
                  (if (not (yyact yystate yychar yyn))
                    (begin
                      (set! yyn yyactval)
                      (error))
                    (begin
                      (set! yyn yyactval)
                      (cond
                        ((> yyn 0) (shift))
                        ((< yyn 0) (reduce))
                        (else (accept)))))))))
          (error 
            (lambda ()
              (if (= yyerrflag 0) (yyerror "Syntax Error") (errlab))))
          (errlab
            (lambda ()
              (if (= yyerrflag 0) (set! yynerrs (+ yynerrs 1)))
              (if (<= yyerrflag 2) 
                (begin ;; (* incomplete recovery; try again *)
                  (set! yyerrflag 3)
                  (set! yyactval yyn)
                  (while (and (> yysp 0) (not (yyact (list-ref yys yysp) 256 yyn))
                              (> yyactval 0)) 
                      (set! yysp (- yysp 1)))
                  (set! yyn yyactval)
                  (if (= yysp 0) (abort)
                    (begin
                      (set! yystate yyn)
                      (parse))))
                (begin
                  (if (= yychar 0) (abort)
                    (begin
                      (set! yychar -1)
                      (next)))))))
          (shift
            (lambda ()  ;;; (* go to new state, clear lookahead character: *)
              (set! yystate yyn)
              (set! yychar -1)
              (set! yyval yylval)
              (if (> yyerrflag 0) (set! yyerrflag (- yyerrflag 1)))
              (parse)))
          (reduce
            (lambda () ;;; (* execute action, pop rule from stack, and go to next state: *)
              ;(printf "reduce: ~a~n" (- yyn))
              (set! yyflag yyfnone)
              (yyaction (- yyn))
              (set! yysp (- yysp (car (list-ref yyr (- yyn)))))
              (set! yynstate yyn)
              (if (yygoto (list-ref yys yysp) (cdr (list-ref yyr (- yyn))) yyn)
                       (set! yystate yynstate))
              (set! yyn yynstate)
              (cond 
                ((= yyflag yyfaccept) (accept))
                ((= yyflag yyfabort)  (abort))
                ((= yyflag yyferror)  (errlab))
                (else (parse)))))
          (accept (lambda () (set! yyresult #t)))
          (abort  (lambda () (set! yyresult #f)))
       )
    (parse) yyresult)))
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
   (yyerror  (lambda (Message) (display Message)(newline)))
   (yyaccept (lambda () (set! yyflag yyfaccept)))
   (yyabort  (lambda () (set! yyflag yyfabort)))
   (yyerrlab (lambda () (set! yyflag yyferror)))
   (yyerrok  (lambda () (set! yyerrflag 0)))
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
   ) (yyparse))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; Compiler
;;;  ex.: (Compiler "input.txt" "output.txt")
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(define Compiler
  (lambda (InputFile OutputFile)
    (letrec
      ((helper (lambda (p)
                 (if (eof-object? (peek-char p)) ""
                   (string-append (string (read-char p)) (helper p))))))
      (if (not (string=? "" OutputFile))
       (begin (current-output-port (open-output-file OutputFile))
              (Parser (Scanner (call-with-input-file InputFile helper)))
              (close-output-port (current-output-port))
              (current-output-port (console-output-port)))
       (begin (Parser (Scanner (call-with-input-file InputFile helper))))))))
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; Autorun with Command-line-parameters
;;;
;;; petite --script compiler.ss in.txt out.txt
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(if (= (length (command-line)) 3)
  (begin
    (Compiler (car(cdr(command-line))) (car(cdr(cdr(command-line)))))))
(if (= (length (command-line)) 2)
  (begin
    (Compiler (car(cdr(command-line))) "" )))
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
