import java.util.Scanner;

public class Spiel
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    public static int Leben = 0;
    public static int Schlüssel = 0;
    public static int Flasche = 0;
    public static int Schwert = 0;

    /**
     * Konstruktor für Objekte der Klasse Spiel
     */
    public Spiel()
    {
        // Instanzvariable initialisieren
        
    }

    public static void spielstart()
    {
     System.out.println('\u000C'); //Feld leeren
     Leben = 5;
     Schlüssel = 0;
     Flasche = 0;
     String eingabe;
     Scanner scan = new Scanner(System.in);
     System.out.println("Blinzelnd öffnet eine Person die Augen. Über ihr der blaue Himmel, unter ihr das trockene Gras einer hohen Wiese");
     System.out.println("Wie heißt diese Person?");
     eingabe = scan.nextLine();
     System.out.println("Ah,"+eingabe +" also. "+eingabe +" steht auf und sieht sich um. Auf der Wiese steht eine Hütte, dahinter ein Wald und auf einem Hügel ist eine Burg zu sehen.");
     System.out.println("Wieder schaut "+ eingabe + " auf und dieses Mal flimmert die Luft über seinem/ihrem Kopf. Ein Kraftfeld?");
     System.out.println("Verwirrt sieht sich " + eingabe+ " wieder um, als er/sie ein Rascheln aus der Wiese vor ihm/ihr hört. Nervös tritt "+ eingabe+ " einen Schritt zurück");
     System.out.println("Soll "+ eingabe + " nachsehen? (1 = JA, 0 = NEIN)" );
     
     int antwort;
     antwort = scan.nextInt();
     if(antwort== 1)
     {
         System.out.println("Als "+ eingabe + " einen Schritt nach vorne tritt und die Grashalme teilt, springt ihm/ihr ein kleines Wesen entgegen. Ein Schleim?");
     }
     
     else if(antwort== 0)
     {
         System.out.println(eingabe+ " tritt ein paar Schritte zurück. Auf einmal springt ihm/ihr ein kleines Wesen entgegen. Ein Schleim?");
     }
     
     System.out.println("Erschrocken tritt er/sie nach dem glibbrigen Ding und es wird in die Luft geschleudert");
     System.out.println("Dort kann " +eingabe+ " beobachten, wie es sich in kleine Parktikel auflöst und verschwindet."); 
     System.out.println("Das ist ja wie in einem Videospiel!");
     System.out.println("Ratlos sieht " +eingabe+ " sich wieder um. Die Hütte steht nicht all zu weit entfernt, und er/sie beschließt, dort nach Antworten zu suchen.");
     System.out.println("Möchtest du das Abenteuer beginnen?");
     
     antwort = scan.nextInt();
     if(antwort == 1)
     {
         System.out.println("Sehr schön. In diesem Spiel steuerst du alles über Texteingabe, wodurch 1 häufig JA und 0 häufig Nein bedeutet. Du hast von Anfang an 5 Leben, aber vorsicht, die kannst du verlieren!");
         System.out.println("Wenn etwas anderes von dir erwartet wird, wird dieses erklärt");
         Haus();
     }
     else if(antwort == 0)
     {
         System.out.println("Game Over");
     }
    }

    public static void Haus()
    {
        System.out.println("Du stehst nun vor der Haus. Es ist aus einfachen Holzbalken gebaut und wirkt wie eine Jägerhütte.");
        System.out.println("Es ist ziemlich klein, aber drinnen wird wohl genug Platz zum leben sein. Die Tür wirkt verschlossen und etwas gefährliches geht von ihr aus");
        System.out.println("Möchtest du versuchen, sie zu öffnen?");
        
        int antwort;
        Scanner scan = new Scanner(System.in);
        antwort = scan.nextInt();
        if(antwort == 1)
        {
            System.out.println("Du gehst zur Tür und drückst die Klinke runter. Ein Klicken ist zu hören aber sonst passiert nichts. Ratlos schaust du wieder hinter dich, zum Anfang, auf die Wiese");
            System.out.println("Hast du etwas falsch gemacht? Du drehst dich zur verschlossenen Tür, als du etwas Merkwürdiges feststellst... Die Tür hat sich geöffnet!");
            System.out.println("Vorsichtig betrittst du den Raum, als du einen lauten Knall hörst. Schnell drehst du dich weg, aber du spürst wie etwas deinen Arm streift.");
            System.out.println("Keine Schmerzen, interessant. Über diesem befinden sich nun 5 Herzen, 4 davon sind rot, eins davon durchscheinend. Was ist das?! Man kann hier Leben verlieren?!");
            Leben--;
            System.out.println("Du hast noch " +Leben+ " Leben");
        }
        else if(antwort == 0)
        {
            System.out.println("Ratlos siehst du dich weiter um. Dann kommst du auf die Idee, einmal um das Haus zu laufen. An den Seiten gibt es einige Fenster, aber auch die sind verschlossen");
            System.out.println("Vielleicht könnte man sie einwerfen...");
            System.out.println("Möchtest du sie einwerfen?");
            
            antwort = scan.nextInt();
            if (antwort == 1)
            {
                System.out.println("Das Glas zersplittert, als du einen Stein in das Fenster wirfst. Eine Scherbe fliegt genau auf dich zu und schneidet sich in deinen Arm.");
                System.out.println("Keine Schmerzen, interessant. Über diesem befinden sich nun 5 Herzen, 4 davon sind rot, eins davon durchscheinend. Was ist das?!");
                System.out.println("Man kann hier Leben verlieren?!");
                Leben--;
                System.out.println("Du hast noch " +Leben+ " Leben");
                System.out.println("Panisch läufst du wieder vor das Haus, als du dort etwas merkwürdiges feststellst... Die Tür hat sich geöffnet! Vorsichtig betrittst du den Raum");
            }
            
            else if (antwort == 0)
            {
                System.out.println("Auch hinter dem Haus ist nichts zu finden. Verwirrt läufst du auf der anderen Seite wieder vor das Haus, als du dort etwas merkwürdiges feststellst...");
                System.out.println("Die Tür hat sich geöffnet! Vorsichtig betrittst du den Raum.");
            }
        }
        
        System.out.println("Du stehst nun in der kleinen Hütte. Sie ist überschaubar und es gibt nur einen Raum. Hier befindet sich ein Tisch, ein Bett, und ein Schrank.");
        System.out.println("Eine sehr miese Einrichtung, findest du. Trotzdem beginnst du dich umzusehen. Auf dem Bett sind keine Spuren zu finden, es wirkt alles sehr neu, jedoch unbewohnt");
        System.out.println("Möchtest du als nächstes den Tisch oder den Schrank betrachten? (1= Tisch, 0= Schrank)");
        
        antwort = scan.nextInt();
        if (antwort == 1)
        {
            Tisch();
        }
        else if (antwort == 0)
        {
            Schrank();
        }
        
        System.out.println("Im Haus befindet sich nun nichts mehr. Du erinnerst dich an den Wald hinter dem Haus. Als du jedoch zu Tür gehst, bemerkst du eine Klappe im Boden, die vorher nicht da war.");
        System.out.println("Neugierig öffnest du sie. Darunter befindet sich eine Treppe, die in einen Keller zu führen scheint.");
        System.out.println("Möchstest du den Keller betreten?");
        
        antwort = scan.nextInt();
        if ( antwort == 1)
        {
            Keller();
        }
        else if (antwort == 0)
        {
            System.out.println("game over");
        }
    }
    
    public static void Tisch()
    {
        System.out.println("Der Tisch ist kleiner, als du es erwartet hättest, jedoch liegen hier sehr viele Dokumente. Als du sie näher betrachtest, fällt dir auf, dass die Papiere voll mit Codes gedruckt sind");
        System.out.println("Da du keine Ahnung davon hast, tust du sie hab. Dabei entdeckst du jedoch einen Schlüssel zwischen den Dokumenten. Er wirkt alt, rostig und nicht als gehörte er hier her.");
        System.out.println("Du weißt aus Erfahrung, dass falsche Entscheidungen Leben kosten können. Möchtest du den Schlüssel dennoch mitnehmen?");
            
        int antwort;
        Scanner scan = new Scanner(System.in);
        antwort = scan.nextInt();
        if ( antwort == 1)
        {
            Schlüssel++;
            System.out.println("Du erhälst " +Schlüssel+ " Schlüssel.");
            System.out.println("Möchtest du dir jetzt den Schrank ansehen?");
            
            antwort = scan. nextInt();
            if (antwort == 1)
            {
                Schrank();
            }
            
        }
        else if (antwort == 0)
        {
            System.out.println("Du lässt den Schlüssel dort liegen.");
            System.out.println("Möchtest du dir jetzt den Tisch ansehen?");
            
            antwort = scan. nextInt();
            if (antwort == 1)
            {
                Schrank();
            }
            
        }
    }
    
    public static void Schrank()
    {
        System.out.println("Der Schrank ist leer, bis auf eine kleine Flasche, die einen glänzenden Inhalt enthält. Als du sie in die Hand nimmst, fühlst du angenehme Wärme von ihr ausgehen.");
        System.out.println("Auf dem Etikett steht >Heiltrank<. Du überlegst, du weißt, man kann hier Leben verlieren. Möchtest du die Flasche dennoch mitnehmen?");
        
        int antwort;
        Scanner scan = new Scanner(System.in);
        antwort = scan.nextInt();
        if (antwort == 1)
        {
            Flasche++;
            System.out.println("Du erhälst " +Flasche+ " Flasche");
            System.out.println("Sonst lässt sich nichts mehr finden."); 
            
            if (Leben < 5)
            {
                System.out.println("Du hast nur " +Leben+ " Leben. Möchtest du den Heiltrank anwenden?");
                antwort = scan.nextInt();
                if (antwort == 1)
                {
                    Leben++;
                    System.out.println("Du hast wieder " +Leben+ " Leben.");
                    Flasche--;
                }
                else if (antwort == 0)
                {
                    System.out.println("Du steckst den Heiltrank einfach in deine Tasche. Vielleicht ist er später nützlicher");
                }
            }
            
            System.out.println("Möchtest du dir jetzt den Tisch ansehen?");
            
            antwort = scan. nextInt();
            if (antwort == 1)
            {
                Tisch();
            }
        }
        else if (antwort == 0)
        {
            System.out.println("Du lässt den >Heiltrank< misstrauisch stehen");
            
            System.out.println("Möchtest du dir jetzt den Tisch ansehen?");
            
            antwort = scan. nextInt();
            if (antwort == 1)
            {
                Tisch();
            }
        }
    }
    
    public static void Keller()
    {
        System.out.println("Als du am Fuß der Treppe stehst, eröffnet sich dir ein Anblick, den du nicht erwartet hättest. Haufen an Gold und Schätzen türmen sich im Keller und quellen aus Schränken hervor.");
        System.out.println("Aber als du versuchst nach einem der Geldstücke zu greifen, lässt es sich nicht einsammeln und über dir erscheint ein Text: unbewegliches Objekt.");
        System.out.println("Na super, nicht einmal in einem Videospiel, kann man reich werden!");
        System.out.println("Du siehst dich weiter um. Diamanten, Kronen, Zepter… Wo kommt denn all das Zeug her? Weiter hinten im Raum stehen die Schränke wie in einem Labyrinth aufgestellt.");
        System.out.println("Wie magisch wirst du von diesem Rätsel angezogen. Zwei große Schränke bilden den schmalen Eingang dazu. ");
        System.out.println("So langsam wird dir klar, dass der Keller viel größer ist, als das Haus, das darauf steht.");
        System.out.println("Möchtest du das Labyrinth betreten? ");
        
        int antwort;
        Scanner scan = new Scanner(System.in);
        antwort = scan.nextInt();
        if(antwort == 1)
        {
            System.out.println("Also los");
        }
        else if (antwort == 0)
        {
            System.out.println("Du traust es dir nicht zu, durch das Labyrinth zu navigieren, also bleibst du unschlüssig im Raum stehen.");
            System.out.println("Als aber nichts passiert, keine Hilfe erscheint oder sich ein neuer Weg auftut, wird dir klar, dass du tatsächlich da durch musst.");
        }
        
        
        
        int i=0;
        while(i==0)
        {
            System.out.println("Du betrittst vorsichtig das Labyrinth. Es wirkt nicht besonders groß, aber wer weiß, was hier noch passieren kann.");
            System.out.println("Schon nach 5 Schritten stehst du vor der ersten Entscheidung. Vor dir baut sich ein großer Schrank auf, vollgestopft mit Münzen und Ketten.");
            System.out.println("Es geht nach links und rechts weiter.");
            System.out.println("Gehst du links (1) oder rechts (0)?");
            
            antwort = scan.nextInt();
            if (antwort == 1)
            {
                System.out.println("Auch hier läufst du nur ein paar Schritte vorwärts. Wieder steht vor dir eine Wand, aber dieses Mal ist es die Außenwand des Kellers. Du bist auf dem richtigen Weg.");
                System.out.println("Gehst du jetzt links (1) oder rechts (0)?");
                
                antwort = scan.nextInt();
                if ( antwort == 0)
                {
                    System.out.println("Du läufst ein Stück. Die Schränke begrenzen immer noch das Labyrinth, und immer noch quellen sie über mit Schätzen. ");
                    System.out.println("Das hättest du bei dem kleinen, kargen Haus oben drüber gar nicht erwartet. Du läufst einmal um eine rechte Ecke, dann tun sich zwei Wege auf.");
                    System.out.println("Einer führ weiter gerade aus, der andere nach rechts.  ");
                    System.out.println("Gehst du gerade aus (1) oder rechts (0)? ");
                    
                    antwort = scan.nextInt();
                    if ( antwort == 1) 
                    {
                        System.out.println("Links von dir ist immer noch die Kellerwand. So lange du dich daran hälst, wirst du wohl schon den richtigen Weg finden. ");
                        System.out.println("n diesem Moment kommt dir wieder etwas in die Quere. Ein Schrank steht quer zur Wand und führt dich von ihr Weg.");
                        System.out.println("Na toll! Du folgst dem Weg weiter und musst die nächste Entscheidung treffen. ");
                        System.out.println("Gehst du links (1) oder gerade aus (0)? ");
                        
                        antwort = scan.nextInt();
                        if (antwort == 1 )
                        {
                           System.out.println("Mittlerweile läufst du schon ziemlich lange und du fragst dich, wann du endlich das Ende erreichst. Da spaltet sich der Weg.");
                           System.out.println("Beide führen in dieselbe Richtung, aber von dem einen strahlt dir ein helles Licht entgegen, von dem anderen kriecht dunkler Nebel auf deine Füße zu.");
                           System.out.println("Gehst du ins Licht (1) oder in die Dunkelheit (0)? ");
                           
                           antwort = scan.nextInt();
                           if (antwort == 0)
                           {
                               i++; 
                           }
                           
                           else if ( antwort == 1)
                           {
                               System.out.println("Nach ein paar Drehung und Wendungen stehst du in einer Sackgasse. Mit ein bisschen Glück findest du den Weg wieder raus. Auf ein Neues! ");
                           }
                        }
                        
                        else if ( antwort == 0)
                        {
                            System.out.println("Nach ein paar Drehung und Wendungen stehst du in einer Sackgasse. Mit ein bisschen Glück findest du den Weg wieder raus. Auf ein Neues! ");
                        }
                    }
                    
                    else if ( antwort == 0)
                    {
                        System.out.println("Nach ein paar Drehung und Wendungen stehst du in einer Sackgasse. Mit ein bisschen Glück findest du den Weg wieder raus. Auf ein Neues! ");
                    }
                }
                
                else if (antwort == 1)
                {
                    System.out.println("Nach ein paar Drehung und Wendungen stehst du in einer Sackgasse. Mit ein bisschen Glück findest du den Weg wieder raus. Auf ein Neues! ");
                }
            }
            
            else if(antwort == 0)
            {
                System.out.println("Nach ein paar Drehung und Wendungen stehst du in einer Sackgasse. Mit ein bisschen Glück findest du den Weg wieder raus. Auf ein Neues! ");
            }
        }
        
        System.out.println("Du hast es geschafft. Die Dunkelheit war wohl nur dazu da, dich abzuschrecken.");
        System.out.println("Nach dem du deinen Mut bewiesen hast, befindest du dich jetzt in einem sanft erleuchteten Raum.");
        System.out.println("Hier befinden sich keine Schätze mehr, kein Glitzer, kein Gold. ");
        System.out.println("Auf einem Altar liegt nur ein einzelnes Schwert. Ehrfürchtig gehst du auf es zu, und es beginnt zu leuchten.");
        System.out.println("Vorsichtig nimmst du es in die Hand und auf deinem Rücken erscheint automatisch eine Scheide dafür. Du darfst es wohl mitnehmen.");
        Schwert++;
        System.out.println("Du besitzt" +Schwert+ "Schwert");
        System.out.println("Jetzt kann das Abenteuer richtig losgehen! An der Wand hinter dem Altar befindet sich ein Eisentor, das ein Stück weit aufsteht.");
        System.out.println("Möchtest du mit dem Abenteuer fortfahren?");
        
        antwort = scan.nextInt();
        if (antwort == 1)
        {
            Tunnel();
        }
        
        else if ( antwort == 0)
        {
            System.out.println("Game over");
        }
    }
    
    public static void Tunnel()
    {
        System.out.println("Du betrittst den Keller durch das Eisentor.");
        System.out.println("Als du das Tor hinter dir schließt, kannst du hören, wie Wasser in einer Entfernung von der Decke tropft und es riecht stark nach einem alten Keller.");
        System.out.println("Es ist dunkel, aber aus einer nicht erkennbaren Quelle scheint ein diffuses Licht auf dich runter, viel erkennst du im dunklen Gang aber trotzdem nicht.");
        System.out.println(" Als du dich näher umsiehst, entdeckst du eine Fackel an der Wand.");
        System.out.println(" Gut, denkst du, hätte ich jetzt etwas zum anzünden, könnte ich meinen Weg beleuchten.");
        System.out.println("In diesem Moment erscheint neben der Fackel ein kleiner Hebel. So langsam wundert dich hier nichts mehr. Seufzend begibst du dich zu dem Schalter, als du plötzlich erstarrst.");
        System.out.println("War das gerade ein Geräusch aus der Höhle? Es klang wie ein Flattern oder ein Rascheln…");
        System.out.println("Möchtest du das Licht wirklich anmachen?");
        
        int antwort;
        Scanner scan = new Scanner(System.in);
        antwort = scan.nextInt();
        if (antwort == 1)
        {
            System.out.println("Du entscheidest dich also dafür. Als du den Hebel betätigst gehen viele Fackeln nacheinander an und erhellen so den ganzen Gang.");
            System.out.println("Gerade noch rechtzeitig siehst du so, dass sich nun eine wütende Menge Fledermäuse auf den Weg in die Freiheit begibt.");
            System.out.println("Du rettest dich gerade noch rechtzeitig in eine Nische, als der Schwarm an dir vorbei und durch die Luke fliegt. ");
            System.out.println("Als du dich jetzt unter die Falltür stellst und hinauf ins Haus blickst, ist von den Fledermäusen nichts mehr zu sehen. Kopfschüttelnd drehst du dich dem nun orange-rot beleuchteten Gang zu.");
            System.out.println("Etwa in fünf Metern Entfernung liegt ein Blechhelm, der aussieht, als gehöre er zu einer alten Rüstung. Im Dunkeln wärst du ganz sicher dagegen getreten. ");
            System.out.println("Du überlegst, bis jetzt besitzt du keine Waffen und auch sonst keine Form von Schutz… ");
            System.out.println("Möchtest du den Helm mitnehmen? ");
            
            antwort = scan.nextInt();
            if (antwort == 1)
            {
                System.out.println("Du erhältst einen Helm. Als du ihn aufsetzt, ist deine Sicht ein wenig eingeschränkt, aber du fühlst, wie dein Schutz automatisch besser wird."); 
            }
            
            else if (antwort == 0)
            {
                System.out.println("Du lässt den Helm liegen, der wäre dir eh nur im Weg. ");
            }
        }
        
        else if (antwort == 0)
        {
            System.out.println("Du entscheidest dich also dagegen. Was, wenn das Licht irgendwelche Tiere aufgescheucht-");
            System.out.println("Deinen Gedanken kannst du nicht zu ende denken, als du mit dem Fuß gegen einen blechernen Helm trittst.");
            System.out.println("Es wird totenstill, nachdem das Echo des klappernden Geräusch verschallt und du hältst inne. Auch deine Atmung stoppt, in Erwartung, dass irgendwas passiert.");
            System.out.println("Als aber nichts geschieht, entspannt du dich und  richtest dich wieder gerade auf. In diesem Moment stürzt eine wütende Menge Fledermäuse auf dich nieder.");
            System.out.println("Du versuchst dich zu schützen und gehst reflexartig in die Hocke, die Hände über den Kopf gelegt.");
            System.out.println("Der Lärm ist unglaublich und Flügel streifen dich, Krallen graben sich überall in deinen Körper.");
            System.out.println("Auch nachdem es vorüber ist bewegst du dich lange Zeit nicht. Dann gehen plötzlich die Fackeln automatisch an und beleuchten den Gang mit ihrem orange-rotem Schein.");
            System.out.println("Du stellst dich wieder hin und betrachtest deinen Körper. Überall sind Schnitte zu sehen, aber schon Sekunden später bluten sie nicht mehr, und verschwinden schließlich ganz.");
            Leben--;
            System.out.println("Die Herzen erscheinen wieder über deinem Arm. Du hast noch" +Leben+ "Leben. Wenigstens sehe ich jetzt, wo ich hinlaufe, denkst du verärgert.");
            
            if(Flasche > 0)
            {
                System.out.println("Du hast noch" +Flasche+ "Heiltränke. Möchtest du einen einsetzten?");
                
                antwort = scan.nextInt();
                if(antwort == 1)
                {
                    Leben++;
                    System.out.println("Du hast" +Leben+ "Leben.");
                    Flasche--;
                }
            }
            else
            {
                System.out.println("Ein Heiltrank wäre jetzt praktisch...");
            }
        }
        
        System.out.println("Langsam und bedacht begehst du deinen Weg weiter. Im Tunnel ist es nass, kleine Pfützen stehen auf dem Boden, und die Steine wirken sehr alt und verwittert.");
        System.out.println("Sonst befindet sich bis lang nichts im Tunnel und außer deinen wiederhallenden Schritten ist auch nichts mehr zu hören.");
        System.out.println("Nach gefühlten Ewigkeiten erreichst du eine alt wirkende Rüstung. Da ist also der Helm her!");
        System.out.println("Kurz denkst du drüber nach, ob es eine gute Entscheidung wäre, die gesamte Rüstung anzuziehen, aber das erscheint dir doch als unpraktisch.");
        System.out.println("Nach weiteren zehn Metern erscheint nun vor deinen Augen eine Wendeltreppe nach oben. Von dort gelangt ein Licht zu dir in den Tunnel.");
        System.out.println("Neugierig steigst du den neuen Weg nach oben und betrittst… ");
        
        Schloss();
    }
    
    public static void Schloss()
    {
        
    }
}
