
import java.util.Scanner;

public class Spiel
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    public static int Leben = 0;
    public static int Schlüssel = 0;
    public static int Flasche = 0;
    public static int S = 0;
    public static int T = 0;
    public static int Helm = 0;
    public static int Schwert = 0;
    public static int Kugel = 0;
    public static int H = 0;
    public static int Z = 0;
    public static int G = 0;
    public static int W = 0;

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
        System.out.println("Du stehst nun vor dem Haus. Es ist aus einfachen Holzbalken gebaut und wirkt wie eine Jägerhütte.");
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
            
            T++;
            
            if ( S == 0)
            {
                System.out.println("Als nächstes betrachtest du den Schrank");
                Schrank();
            }
            
        }
        else if (antwort == 0)
        {
            System.out.println("Du lässt den Schlüssel dort liegen.");
            
            T++;
            
            if (S == 0)
            {
                System.out.println("Als nächstes betrachtest du den Schrank");
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
            
            S++;
            
            if (T == 0)
            {
                System.out.println("Als nächstes betrachtest du den Tisch");
                Tisch();
            }
        }
        else if (antwort == 0)
        {
            System.out.println("Du lässt den >Heiltrank< misstrauisch stehen");
            
            S++;
            
            if (T == 0)
            {
                System.out.println("Als nächstes betrachtest du den Tisch");
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
        System.out.println("Du besitzt " +Schwert+ " Schwert");
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
        System.out.println("Als du dich näher umsiehst, entdeckst du eine Fackel an der Wand.");
        System.out.println("Gut, denkst du, hätte ich jetzt etwas zum anzünden, könnte ich meinen Weg beleuchten.");
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
                Helm++;
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
                System.out.println("Du hast noch " +Flasche+ " Heiltränke. Möchtest du einen einsetzten?");
                
                antwort = scan.nextInt();
                if(antwort == 1)
                {
                    Leben++;
                    System.out.println("Du hast " +Leben+ " Leben.");
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
        System.out.println("Neugierig steigst du den neuen Weg nach oben und betrittst die Wendeltreppe.");
        
        Schloss();
    }
    
    public static void Schloss()
    {
        System.out.println("Auf der Wendeltreppe wird es immer heller, je weiter du nach oben kommst. Das Licht wirkt jedoch künstlich, nicht als würdest du gleich wieder in der freien Natur stehen.");
        System.out.println("Ewigkeiten geht es immer weiter hinauf, und so langsam fragst du dich, ob das wirklich noch ein Ende hat. ");
        System.out.println("Gerade dann kommt endlich ein Ende in Sicht. Nur noch ein paar Stufen und du stehst ganz oben an der Wendeltreppe, endlich hast du Zeit zum durchatmen. ");
        System.out.println("Erst jetzt fällt dir auf, wie erschöpft du bist. ");
        System.out.println("Der Raum, in dem du dich jetzt befindest, ist groß und hat hohe Decken. ");
        System.out.println("An den Seiten hängen lange Wandteppiche, beleuchtet wir er durch einige Fenster und vielen hundert Kerzen, die überall von der Decke hängen oder in edlen Kerzenständern an den Seiten des Saals stehen.");
        System.out.println("In der Mitte des Raums steht ein großer, massiver Holztisch. Er wirkt, als würde er jeden Tag gewischt und poliert, da er in dem Kerzenlicht glänzt und schimmert.  ");
        System.out.println("Möchtest du wissen, was sich auf dem Tisch befindet? ");
        
        int antwort;
        Scanner scan = new Scanner(System.in);
        antwort = scan.nextInt();
        if (antwort == 1)
        {
            Tafel();
        }
        
        else if (antwort == 0)
        {
            System.out.println("Uninteressiert lässt du den Tisch so wie er ist. ");
        }
        
        System.out.println("Im Raum erscheinen auf einmal drei Türen. Eine riesige, schwere Holztür auf der einen Seite und zwei kleinere Tore, die sich gegenüber liegen.");
        System.out.println("Von der schweren Pforte wirst du wie magisch angezogen. Blinzelnd realisierst du erst vor der Tür, dass du dich bewegt hast, als sie nun viele Meter über dir emporragt. ");
        System.out.println("Von hier erkennst du, dass in die Tür viele verschiedene Wörter in hunderten von Sprachen eingeritzt sind.");
        System.out.println("Einige kennst du aus deiner Welt, andere sehen aus, als stammten sie aus einem anderen Universum.");
        System.out.println("Was dich jedoch am meisten beunruhigt ist, dass die Wörter mitten auf der Tür verzerrt sind, es wirkt, als wären große und sehr scharfe Krallen in das Holz eingedrungen. ");
        System.out.println("Die Kraft muss enorm sein und das ebenso enorme Tier scheint aus Wut gehandelt zu haben. Ein unheimliches Gefühl beschleicht dich.  ");
        System.out.println("Möchtest du die Tür öffnen? ");
        
        antwort = scan.nextInt();
        if (antwort == 1)
        {
            System.out.println("Vielleicht ist es besser, die Tür noch nicht zu öffnen, nur um sicher zu gehen…  Außerdem sieht es so aus, als bräuchte man verschiedene Dinge, um sie zu öffnen");
        }
        
        System.out.println("Du lässt von der Tür ab und drehst dich um. Dort warten zwei weitere Türen. Eine führt nach links, die andre nach rechts ");
        System.out.println("Durch welche Tür möchtest du den Saal verlassen? ( 1= links, 0= rechts) ");
        
        antwort = scan.nextInt();
        if (antwort == 1)
        {
            Gärten();
            
        }
        
        else if ( antwort == 0)
        {
            Wald();
           
        }
    }
    
    public static void Tafel()
    {
        System.out.println("Du näherst dich also der großen Tafel. Sie erinnert dich an die ganzen Ritterfilme, die du in deinem Leben schon gesehen hast.");
        System.out.println("Ca. zehn Stühle stehen auf jeder Seite und sich gegenüber und vor jedem befindet sich Besteck.");
        System.out.println("Es wirkt neu, gleichzeitig aber auch uralt, als würde es schon ewig hier stehen und nur darauf warten endlich benutzt zu werden.");
        System.out.println("Essen befindet sich jedoch nicht auf dem Tisch. Aber etwas anderes erweckt dein Interesse.");
        System.out.println("Ein Heiltrank! So einer, wie du ihn schon in der Hütte gefunden hast.");
        System.out.println("Möchtest du ihn an dich nehmen? ");
        
        int antwort;
        Scanner scan = new Scanner(System.in);
        antwort = scan.nextInt();
        if( antwort == 1)
        {
            System.out.println("Du nimmst den Trank in die Hand. Du fühlst dieselbe Wärme von der Flasche ausgehen,dasselbe glitzern.");
            Flasche++;
            System.out.println("Du besitzt " +Flasche+ " Heiltränke");
            
            if (Leben < 5)
            {
                System.out.println("Möchtest du den Trank anwenden? ");
                
                antwort = scan.nextInt();
                if (antwort == 1)
                {
                    Leben++;
                    System.out.println("Du hast wieder " +Leben+ " Leben.");
                    Flasche--;
                }
                
                else if (antwort == 0)
                {
                    System.out.println("Vielleicht ist er später ja nützlicher.");
                }
            }
        }
        
        else if (antwort == 0)
        {
            System.out.println("Du lässt den Trank stehen. Das ist dir doch zu ungeheuer und zu auffällig. ");
        }
        
        System.out.println("Sonst befindet sich nichts mehr auf dem Tisch, das sich für dich als wichtig erweisen könnte. ");
        System.out.println("Kerzenständer und das Besteck werden dich wohl nicht viel weiterbringen und nur unnötig behindern. ");
        System.out.println("Du wendest dich wieder dem Saal zu. ");
    }
    
    
    public static void Gärten()
    {
         System.out.println("Du begibst dich durch die linke Tür nach draußen. Dort erwartet dich überraschenderweise ein äußerst gepflegter Garten.");
         System.out.println("Niedrige Hecken sind mit bunten Blumen in kunstvollen Mustern angelegt und ein ordentlicher Kieselweg zieht sich durch die Landschaft.");
         System.out.println("In der Mitte des Gartens befindet sich ein großer See. Davor steht ein kleiner Springbrunnen. ");
         System.out.println("Möchtest du dich weiter umsehen?");
         
         int antwort;
        Scanner scan = new Scanner(System.in);
        antwort = scan.nextInt();
        if ( antwort == 1)
        {
            System.out.println("Du läufst also erstmal zu dem See.");
            System.out.println("Als du dich, da angekommen, das erste Mal umdrehst, bemerkst du, dass du dich in einem großen Schloss befunden hast, mit zahlreichen großen und kleinen Türmchen und endlos vielen Räumen und Treppen");
            System.out.println("Es strahlt jedoch eine     düstere Aura aus, keine freundliche.");
            System.out.println("Unschlüssig läufst du weiter im Garten herum, als du auf einmal ein Rascheln aus der Hecke hörst.");
            System.out.println("Möchtest du nachsehen? ");
            
            antwort = scan.nextInt();
            if (antwort == 1)
            {
                System.out.println("Vorsichtig schaust du also in die Hecke, als dir etwas Glibbriges genau ins Gesicht springt.");
                System.out.println("Du fällst nach hinten, rappelst dich aber schnell wieder auf, um zu sehen, was dich angegriffen hat.");
                System.out.println("Es ist schon wieder einer dieser Schleime, aber der hier ist viel größer, als der von der Wiese. ");
                Leben--;
                System.out.println("Über deinem Arm erscheinen wieder die Herzen. Du hast noch " +Leben+ " Leben. Verdammt!");
                System.out.println("Wütend trittst du wieder nach dem Schleim und als nichts passiert, ziehst du dein Schwert und zerteilst ihn mittig.");
                System.out.println("Er löst sich genauso wie der erste auch in kleine Partikel auf und verschwindet ganz. Da fällt dir etwas auf.");
            }
            
            else if (antwort == 0)
            {
                System.out.println("Mit raschelnden Büschen hast du ganz schlechte Erfahrungen gemacht. Du lässt also von der Hecke ab und läufst noch einmal eine Runde um den kleinen Springbrunnen,");
                System.out.println("der ganz am Anfang des Gartens ist. Da fällt dir etwas auf.");
            }
            
            System.out.println("Auf der Mauer des kleinen Springbrunnens erscheint eine kleine Flasche, glänzend und Wärme abstrahlend. Ein weiterer Heiltrank!");
            Flasche++;
            if (Leben < 5)
            {
                System.out.println("Möchtest du den Trank anwenden? ");
                
                antwort = scan.nextInt();
                if (antwort == 1)
                {
                    Leben++;
                    System.out.println("Du hast wieder " +Leben+ " Leben.");
                    Flasche--;
                }
                
                else if (antwort == 0)
                {
                    System.out.println("Vielleicht ist er später ja nützlicher.");
                }
            }
        }
        
        else if (antwort == 0) 
        {
            System.out.println("Der Garten interessiert dich nicht wirklich. ");
        }
        
        System.out.println("Viel gibt es jetzt auch nicht mehr zu sehen, also drehst du dich wieder um und begibst dich ins Schloss zurück.");
        G++;
    
        if ( W == 0)
        {
            System.out.println("Nun begibst du dich in den Wald.");
            Wald();
            
        }
        else if ( W == 1)
        {
            Thronsaal();
        }
    }
    
    public static void Wald()
    {
        System.out.println("Als du aus der rechten Tür trittst, wirst du von hellem Sonnenschein begrüßt.");
        System.out.println("Ein wenig blendet es dich und so blinzelst du in die Welt, die hinter den Mauern des Saals liegt.");
        System.out.println("Wie dir auffällt befindest du dich an einem Waldrand, der beinahe unmittelbar vor der Wand beginnt. Kurz siehst du dich genauer um.");
        System.out.println("Als du den Wald den Rücken kehrst, wird dir klar, worin du dich befunden hast. Es ist ein gigantisches Schloss mit unendlich vielen kleinen und großen Türmchen, Räumen und Fenstern.");
        System.out.println("Es strahlt jedoch keine machtvolle Aura aus, sondern wirkt gefährlich und unheilvoll. ");
        System.out.println("Gut, dass du jetzt draußen bist.");
        System.out.println("Ein kleiner Pfad führt nun in den grünen Laubwald, und kurzerhand entscheidest du dich ihm zu folgen. Du hast ja nichts Besseres zu tun.");
        System.out.println("Die Vögel zwitschern um dich herum und nach dem du etwas weiter in den Wald gegangen bist, siehst du sogar das ein oder andere Reh, das genüsslich an Rinde knabbert.");
        System.out.println("Dieser Wald wirkt seltsam friedlich. Verdächtig… ");
        System.out.println("Trotzdem läufst du weiter, bis du zu einer Weggabelung gelangst. Ein Schild zeigt dir, dass es nach links zur Hexe geht, nach rechts zum Zauberer.");
        System.out.println("Ähm, okay. Du hast den ganzen Tag niemanden getroffen und auf einmal gibt es hier gleich zwei Personen, die in einem Wald leben und nicht in dieser Hütte?");
        System.out.println("Aber für irgendwen musst du dich entscheiden. ");
        System.out.println("Also nach links (1) zur Hexe oder nach rechts (0) zum Zauberer? ");
        
        int antwort;
        Scanner scan = new Scanner(System.in);
        antwort = scan.nextInt();
        if ( antwort == 1)
        {
            System.out.println("Du folgst also dem Weg zur Hexe. Lange folgst du dem Pfad, der immer kleiner wird und immer mehr Wurzeln erschweren dir den Weg.");
            System.out.println("Die Bäume um dich herum stehen auch immer dichter und das fröhliche Zwitschern der Vögel wird durch das Krähen eines Raben ersetzt.");
            System.out.println("Zunehmend wird es dunkler und als dann auch noch Nebel über den Boden kriecht, hast du endgültig genug. Das kann doch nicht wahr sein! ");
            System.out.println("Unaufmerksam wie du bist, bemerkst du zu spät das grollen hinter dir. Vor Angst halb erstarrt drehst du dich um.");
            System.out.println("Hinter dir steht ein riesenhafter schwarzer Hund und fletscht die Zähne, aus seinem Maul quillt Nebel.");
            System.out.println("Was tust du? 1 -> Du rennst. 0-> du bleibst stehen. ");
            
            antwort = scan.nextInt();
            if (antwort == 1)
            {
                System.out.println("Schnell drehst du dich um und beginnst zu rennen. Der Schweiß tritt nach wenigen Metern auf deine Stirn, das Adrenalin rauscht durch deine Adern.");
                System.out.println("Noch nie im Leben bist du so schnell gerannt. Aber es ist nicht schnell genug.");
                System.out.println("Der Höllenhund holt spielerisch auf. Nur noch wenige Meter trennen dich und die Zähne dieses Tiers.");
                System.out.println("Was tust du? 1 -> Du bleibst stehen. 0-> Du rettest dich auf einen Baum.");
                
                antwort = scan.nextInt();
                if ( antwort == 1)
                {
                    System.out.println("Da ist nichts mehr zu machen. Aufgeben kannst du zwar nicht leiden, aber in diesem Fall muss das die Antwort sein.");
                    System.out.println(" Du wirst langsamer, bis du schließlich stehen bleibst.");
                    System.out.println("Etwas streift deinen Arm, aber da du immer noch keine Schmerzen fühlst, bemerkst du erst später, dass es die Zähne des Hundes sind.");
                    Leben--;
                    System.out.println("Über deinem Arm erscheinen wieder diese Merkwürdigen Herzen. Du hast noch " +Leben+ " Leben");
                    System.out.println("Das Tier baut sich nun donnernd vor dir auf, als etwas anderes gerade rechtzeitig an deinem Kopf vorbei saust.");
                    System.out.println("Ein kleiner goldener Feuerball zischt an dir vorbei und trifft den Hund in die Seite. Dieser winselt auf, lässt den Kopf hängen und rennt davon."); 
                    System.out.println("Du schaust auf, als du eine alte Frau siehst. „Schrecklich diese Fiecher, die werden langsam zur Plage!“");
                    Hexe();
                }
                
                else if ( antwort == 0)
                {
                    System.out.println("Der nächste Baum ist deiner. Du rettest dich auf einen Baum, der stark genug wirkt, dein Gewicht auf den unteren Ästen tragen zu können.");
                    System.out.println("Gerade rechtzeitig ziehst du noch deinen Fuß nach oben, als die Zähne der Kreatur zu schnappen.");
                    System.out.println("Panisch kletterst du noch ein paar weitere Äste nach oben, als du beobachtest wie ein goldener Feuerball das Tier in die Seite trifft,");
                    System.out.println("das daraufhin winselnd den Kopf hängen lässt und in den Wald zurück rennt.");
                    System.out.println("Den Weg entlang kommt nun eine alte Frau.");
                    System.out.println("„Schrecklich, diese Fiecher, die werden langsam zur Plage! Willst du denn nicht vom Baum kommen?“");
                    System.out.println("Damit bist du gemeint. Als du deinen Weg vom Baum beginnst, rutscht du schon im ersten Moment ab und landest hart auf dem Boden.");
                    Leben--;
                    System.out.println("Über deinem Arm erscheinen wieder diese Merkwürdigen Herzen. Du hast noch " +Leben+ " Leben.");
                    Hexe();
                }
            }
            
            else if ( antwort == 0)
            {
              System.out.println("Da ist nichts mehr zu machen. Aufgeben kannst du zwar nicht leiden, aber in diesem Fall muss das die Antwort sein.");
              System.out.println("Du bleibst einfach an der Stelle stehen, an der du dich befindest.");
              System.out.println("Etwas streift deinen Arm, aber da du immer noch keine Schmerzen fühlst, bemerkst du erst später, dass es die Zähne des Hundes sind.");
              Leben--;
              System.out.println("Über deinem Arm erscheinen wieder diese Merkwürdigen Herzen. Du hast noch " +Leben+ " Leben");
              System.out.println("Das Tier baut sich nun donnernd vor dir auf, als etwas anderes gerade rechtzeitig an deinem Kopf vorbei saust.");
              System.out.println("Ein kleiner goldener Feuerball zischt an dir vorbei und trifft den Hund in die Seite. Dieser winselt auf, lässt den Kopf hängen und rennt davon."); 
              System.out.println("Du schaust auf, als du eine alte Frau siehst. „Schrecklich diese Fiecher, die werden langsam zur Plage!“");
              Hexe();  
            }
        }
        
        else if ( antwort == 0)
        {
            System.out.println("Du folgst also dem Weg zum Zauberer. Lange folgst du dem Pfad, der immer kleiner wird und immer mehr Wurzeln erschweren dir den Weg.");
            System.out.println("Die Bäume um dich herum stehen auch immer dichter und das fröhliche Zwitschern der Vögel wird durch das Krähen eines Raben ersetzt.");
            System.out.println("Zunehmend wird es dunkler und als dann auch noch Nebel über den Boden kriecht, hast du endgültig genug. Das kann doch nicht wahr sein! ");
            System.out.println("Unaufmerksam wie du bist, bemerkst du zu spät das grollen hinter dir. Vor Angst halb erstarrt drehst du dich um.");
            System.out.println("Hinter dir steht ein riesenhafter schwarzer Hund und fletscht die Zähne, aus seinem Maul quillt Nebel.");
            System.out.println("Was tust du? 1 -> Du rennst. 0-> du bleibst stehen. ");
            
            antwort = scan.nextInt();
            if (antwort == 1)
            {
                System.out.println("Schnell drehst du dich um und beginnst zu rennen. Der Schweiß tritt nach wenigen Metern auf deine Stirn, das Adrenalin rauscht durch deine Adern.");
                System.out.println("Noch nie im Leben bist du so schnell gerannt. Aber es ist nicht schnell genug.");
                System.out.println("Der Höllenhund holt spielerisch auf. Nur noch wenige Meter trennen dich und die Zähne dieses Tiers.");
                System.out.println("Was tust du? 1 -> Du bleibst stehen. 0-> Du rettest dich auf einen Baum.");
                 
                antwort = scan.nextInt();
                if ( antwort == 1)
                {
                    System.out.println("Da ist nichts mehr zu machen. Aufgeben kannst du zwar nicht leiden, aber in diesem Fall muss das die Antwort sein.");
                    System.out.println(" Du wirst langsamer, bis du schließlich stehen bleibst.");
                    System.out.println("Etwas streift deinen Arm, aber da du immer noch keine Schmerzen fühlst, bemerkst du erst später, dass es die Zähne des Hundes sind.");
                    Leben--;
                    System.out.println("Über deinem Arm erscheinen wieder diese Merkwürdigen Herzen. Du hast noch " +Leben+ " Leben");
                    System.out.println("Das Tier baut sich nun donnernd vor dir auf, als etwas anderes gerade rechtzeitig an deinem Kopf vorbei saust.");
                    System.out.println("Ein kleiner blauer Feuerball zischt an dir vorbei und trifft den Hund in die Seite. Dieser winselt auf, lässt den Kopf hängen und rennt davon."); 
                    System.out.println("Du schaust auf, als du einen alten Mann siehst. Als der beginnt zu rennen, fängst du an, ihn zu verfolgen");
                    Zauberer();
                }
                
                else if ( antwort == 0)
                {
                    System.out.println("Der nächste Baum ist deiner. Du rettest dich auf einen Baum, der stark genug wirkt, dein Gewicht auf den unteren Ästen tragen zu können.");
                    System.out.println("Gerade rechtzeitig ziehst du noch deinen Fuß nach oben, als die Zähne der Kreatur zu schnappen.");
                    System.out.println("Panisch kletterst du noch ein paar weitere Äste nach oben, als du beobachtest wie ein goldener Feuerball das Tier in die Seite trifft,");
                    System.out.println("das daraufhin winselnd den Kopf hängen lässt und in den Wald zurück rennt.");
                    System.out.println("Den Weg entlang rennt eine Person und ist in Sekunden wieder verschwunden");
                    System.out.println("Als du deinen Weg vom Baum beginnst, rutscht du schon im ersten Moment ab und landest hart auf dem Boden.");
                    Leben--;
                    System.out.println("Über deinem Arm erscheinen wieder diese Merkwürdigen Herzen. Du hast noch " +Leben+ " Leben.");
                    System.out.println("Du beschließt, die Peson zu verfolgen");
                    Zauberer();
                }
            }
            else if ( antwort == 0)
            {
                System.out.println("Da ist nichts mehr zu machen. Aufgeben kannst du zwar nicht leiden, aber in diesem Fall muss das die Antwort sein.");
                System.out.println("Du bleibst einfach an der Stelle stehen, an der du dich befindest.");
                System.out.println("Etwas streift deinen Arm, aber da du immer noch keine Schmerzen fühlst, bemerkst du erst später, dass es die Zähne des Hundes sind.");
                Leben--;
                System.out.println("Über deinem Arm erscheinen wieder diese Merkwürdigen Herzen. Du hast noch " +Leben+ " Leben");
                System.out.println("Das Tier baut sich nun donnernd vor dir auf, als etwas anderes gerade rechtzeitig an deinem Kopf vorbei saust.");
                System.out.println("Ein kleiner blauer Feuerball zischt an dir vorbei und trifft den Hund in die Seite. Dieser winselt auf, lässt den Kopf hängen und rennt davon."); 
                System.out.println("Du schaust auf, als du einen alten Mann siehst. Als der beginnt zu rennen, fängst du an, ihn zu verfolgen");
                Zauberer();
            }
        }
        
        System.out.println("Nach diesen zwei merkwürdigen Begegnungen solltest du zum Schloss zurückkehren.");
        System.out.println("Du begibst dich also auf den Pfad zurück während die Sonne am Himmel langsam zu sinken beginnt.");
        System.out.println("Der Weg kommt dir nun deutlich kürzer vor als vorhin noch.");
        System.out.println("Das Schloss erreichst du in zehn Minuten und du begibst dich wieder in die große Halle, in der du nach dem Tunnel gelandet bist.");
        
        W++;
    
        if ( G == 0) 
        {
            Gärten();
            
        }
        else if (G == 1)
        {
            Thronsaal();
        }
    }
    
    public static void Hexe()
    {
        System.out.println("Du folgst der alten Frau eine Weile schweigend. Sie sieht merkwürdig aus, hat lange, lockige graue Haare und geht vorn über gebeugt vor dir her.");
        System.out.println("„Also sind Sie die Hexe, die hier lebt?“ fragst du vorsichtig. Es passiert jedoch nichts. ");
        System.out.println("Schulterzuckend trottest du also weiter hinter ihr her und fragst, dich was du tun sollst. In diesem Moment wird eine winzige Hütte sichtbar, die am Ende des Weges steht.");
        System.out.println("Sie ist mit Moos bewachsen und wirkt uralt, genauso so wie die Frau, die sich nun auf die kleine Veranda des Häuschens positioniert und endlich wieder die Augen auf dich richtet.");
        System.out.println("„Also sind Sie die Hexe, die hier lebt?“ versuchst du es wieder. Dieses Mal nickt sie: „Ja die bin ich. Komm, wir haben nicht viel Zeit.“ ");
        System.out.println("Die Hexe verschwindet in ihrer Hütte. Als du nicht folgst, streckt sich ihr Arm kurz aus der Tür und bedeutet dir zu folgen. ");
        System.out.println("Kurz überlegst du. Sie hat dich schon einmal gerettet, was soll schon passieren.");
        System.out.println("Als du ihr nach drinnen folgst, beschleicht dich ein Gefühl von Zauberei.");
        System.out.println("Drinnen befindet sich, ähnlich wie in der Hütte ganz vom Anfang, nur ein Bett, dafür aber ein großer Tisch, viele kleine Regale und ein Kamin.");
        System.out.println("Und ein Kessel. Wie typisch. Alles steht voll mit Zeug, dass du vielleicht nicht näher betrachten solltest, aber es ist chaotisch und es wirkt antik.");
        System.out.println("„In diesem Land lebten einmal Menschen. Naja, genau genommen tun sie es immer noch, aber ein Großteil ihrer Welt ist zerstört. ");
        System.out.println("Schuld daran ist dieser miese Drache, der eines Tages durch ein Portal auf unsere Welt kam.");
        System.out.println("Ganz ähnlich wie du. Aber er ist nicht zufällig hier gelandet, sondern wurde vermutlich von einem anderen Planeten verstoßen. Und jetzt haben wir das Problem.");
        System.out.println("Beginnt die Hexe schnell zu erzählen. „Und du musst ihn besiegen. Hier nimm das, das wird dir dabei helfen“ ");
        System.out.println("Sie drückt dir eine kleine goldene Kugel in die Hand. „Sag einfach ‚entflamme‘ und es sollte seine Wirkung haben“ „Entflam-?“");
        System.out.println("„Doch nicht hier drin!“ schreit sie dich an. Du hebst entschuldigend die Hände „Okay, okay, Entschuldigung“.");
        System.out.println("„So, und jetzt raus hier, für mich könnte es zu gefährlich werden, noch mehr Zeit mit dir zu verbringen“ Und damit setzt sie dich vor die Tür. ");
        System.out.println("Merkwürdige Frau… Du betrachtest die kleine Kugel, die du gerade so mit deiner Hand umschließen kannst.");
        Kugel++;
        H++;
        
        if ( Z == 0)
        {
            System.out.println("Am Waldrand entdeckst du in diesem Moment eine Bewegung. Jemand läuft wieder tiefer in den Wald hinein. Hat er euch beobachtet?");
            System.out.println("Du entscheidest dich dazu ihm zu folgen.");
            Zauberer();
        }
    }
    
    public static void Zauberer()
    {
        System.out.println("Schnell rennst du hinter der Person her. Als du ein Stück näher kommst bemerkst du, dass es ein großer Mann ist, der einen Umhang aus blauem Stoff trägt.");
        System.out.println("Er sieht sich nicht einmal um, scheint sich nicht einmal dafür zu interessieren, ob du da bist oder nicht.");
        System.out.println("Stehen bleibt er erst eine halbe Ewigkeit später und das vor einem kleinen Schlösschen, das verlassen mitten im Wald steht.");
        System.out.println("„Du hättest mir eigentlich nicht folgen dürfen, aber jetzt, wo du schon mal hier bist, kannst du ruhig deine Frage stellen“ beginnt er ein Gespräch mit dir, den Rücken noch zu dir gewendet.");
        System.out.println("„Wieso wollten Sie nicht, dass ich ihnen folge?“ „Der Kontakt zu Menschen aus anderen Welten ist schädlich für uns, deshalb.“  ");
        System.out.println("„Das heißt, ich befinde mich wirklich in einer anderen Welt? Wie komme ich hier wieder raus?“ ");
        System.out.println("„Ich befürchte dafür musst du den Drachen besiegen, der im Schloss haust. Aber pass auf, er ist sehr gefährlich.“ ");
        System.out.println("„Ich kann sowas aber nicht, ich weiß nicht, wie man kämpft!“ Da dreht sich der Zauberer um. Er hat einen langen weißen Bart und wirkt sehr weise auf dich. ");
        System.out.println("Nimm erstmal das hier.“ Er drückt dir eine kleine Flasche in die Hand. Ein… Heiltrank? Er war derjenige, der dafür gesorgt hat, dass du die Möglichkeit hast, dich zu heilen.");
        Flasche++;
        
        int antwort;
        Scanner scan = new Scanner(System.in);
            if (Leben < 5)
            {
                System.out.println("Möchtest du den Trank anwenden? ");
                
                antwort = scan.nextInt();
                if (antwort == 1)
                {
                    Leben++;
                    System.out.println("Du hast wieder " +Leben+ " Leben.");
                    Flasche--;
                }
                
                else if (antwort == 0)
                {
                    System.out.println("Vielleicht ist er später ja nützlicher.");
                }
            }
            
        System.out.println("„So und jetzt, erschrick dich nicht“ Der Zauberer beginnt einige Sätze zu murmeln und in deinem Körper breitet sich ein merkwürdiges Gefühl aus.");
        System.out.println("Er beginnt zu kribbeln und hebt schließlich ein kleines Stück vom Boden ab");
        System.out.println("„Damit sollte ich dir genug geholfen haben“ sagt der Mann noch. ");
        System.out.println("„Vielen Da-“ setzt du an, doch er ist bereits verschwunden. Komischer Mann. ");
        System.out.println("Aber du fühlst dich bereits viel stärker, als zuvor, und so ziehst du dein Schwert und versuchst einen Hieb.");
        System.out.println(" Es geht deutlich leichter und fühlt sich merkwürdig trainiert an.");
        Z++;
        
        if ( H == 0)
        {
            System.out.println("Am Waldrand entdeckst du in diesem Moment eine Bewegung. Jemand läuft wieder tiefer in den Wald hinein. Hat er euch beobachtet?");
            System.out.println("Du entscheidest dich dazu ihm zu folgen.");
            Hexe();
        }
    }
    
    public static void Thronsaal()
    {
        System.out.println("Nun gibt es keine anderen Wege mehr, und im großen Saal bleibt die einzige Möglichkeit nun die riesenhafte Tür. ");
        System.out.println("Jetzt weißt du, dass sich dort hinter ein Drache befinden muss, und das ist dein einziger Weg wieder in deine Welt zu gelangen. ");
        System.out.println("Komischerweise verspürst du gerade keine Angst. Egal was dieser Zauberer mit dir gemacht hat, es wirkt anscheinend.");
        System.out.println("Bei näherer Betrachtung des Tores fällt dir auf, dass in der Tür nun drei Symbole erscheinen:");
        System.out.println("eine Schlüssel, ein Schwert, und eine kleine Kugel, um die herum Flammen in die höhe lodern.  ");
        System.out.println("Du zählst nach: du besitzt " +Schlüssel+ " Schlüssel, " +Schwert+ " Schwert und " +Kugel+ " Kugel. ");
        
        if(Schlüssel<1 || Schwert<1 || Kugel<1)
        {
            System.out.println("Du musst etwas übersehen haben! Aber wo war es? So kommst du nicht in den Thronsaal");
            System.out.println("game over");
            spielstart();
        }
        
        else if (Schlüssel>0 && Schwert>0 && Kugel>0)
        {
            System.out.println("Es ist alles da. In diesem Moment leuchten die drei Symbole kurz golden auf, nur das des Schlüssels bleibt.");
            System.out.println("Aber auch das verändert sich, bis es nur noch ein Quadrat ist, in dem sich ein Schlüsselloch befindet. ");
            System.out.println("Kurz atmest du durch, dann nimmst du den Schlüssel aus deiner Tasche und steckst ihn hinein. Er passt!");
            System.out.println("Schon bei der ersten Umdrehung gibt die Tür seltsame Geräusche von sich und öffnet sich anschließen nach innen.");
            System.out.println("In dem riesigen Raum dahinter befindet sich ein Thronsaal, zumindest war es mal einer.");
            System.out.println("Jetzt ist es ekelhaft warm darin, die Wände sind mit Krallenspuren übersäht und du nimmst eine starke Präsenz im hinteren Teil wahr. ");
            System.out.println("Nun beginnt doch dein Herz zu schlagen. So weit, so gut. Du kannst das, eine Hexe hat dir eine Feuerkugel gegeben");
            System.out.println("und ein Zauberer unmenschliche Kräfte auf dich übertragen, da ist so ein Drache doch kein Problem mehr! ");
            
            int antwort;
            Scanner scan = new Scanner(System.in);
            
            int d=3;
            while (d>0)
            {
                System.out.println("Sobald du über die Schwelle der Tür trittst hörst du ein lautes Brüllen.");
                System.out.println("Todesmutig wagst du dich weiter in den Raum hinein, da fällt die Tür hinter dir zu und verschwindet vor deinen Augen. ");
                
                if (Helm == 1)
                {
                    System.out.println("Da fällt die etwas ein. Du hast ja noch einen Helm!");
                    System.out.println("Du greifst in deine Tasche und ziehst den Helm aus dem Tunnel heraus.");
                    System.out.println("Kurz entschlossen setzt du ihn auf und wie zuvor ist deine Sicht leicht eingeschränkt. ");
                }
                
                System.out.println("Jetzt bemerkst du, wie lautes Stampfen sich langsam in deine Richtung bewegt.");
                System.out.println("Aus den Schatten im hinteren Raum tritt ein großer, roter Drache hervor. ");
                System.out.println("Seine Flügel wirken zerfetzt, du bist nicht sicher, ob er überhaupt noch fliegen kann. ");
                System.out.println("Noch ehe du etwas tun kannst, erwischt dich wie aus dem Nichts eine große Kralle. Du wirst einige Meter zurückgeschleudert. ");
                System.out.println("Immer noch keine Schmerzen, doch die Herzen erscheinen wieder. ");
                
                if (Helm == 1)
                {
                    System.out.println("Komischerweise ist dieses Mal nichts passiert, aber etwas fühlt sich merkwürdig an. ");
                    System.out.println("Das Gewicht ist von deinem Kopf gewichen und als du ihn vorsichtig betastest merkst du, dass der Helm fehlt. ");
                    System.out.println("Er hat den Schlag abgehalten. ");
                    Helm--;
                    System.out.println("Du hast noch " +Leben+ " Leben. ");
                    
                    if (Leben < 5 && Flasche > 0)
                    {
                        System.out.println("Möchtest du einen Trank anwenden? ");
                
                        antwort = scan.nextInt();
                        if (antwort == 1)
                        {
                        Leben++;
                        System.out.println("Du hast wieder " +Leben+ " Leben.");
                        Flasche--;
                        }
                
                        else if (antwort == 0)
                        {   
                        System.out.println("Vielleicht ist er später ja nützlicher.");
                        }
                    }
                    else if (Leben < 1)
                    {
                        System.out.println("Du hast alle Leben verloren. GAME OVER!");
                        spielstart(); 
                    }
                }
                else if ( Helm == 0)
                {
                    System.out.println("Dein Kopf hat bedeutend Schaden genommen. ");
                    System.out.println("Du hast noch " +Leben+ " Leben. ");
                    
                    if (Leben < 5 && Flasche > 0)
                    {
                        System.out.println("Möchtest du einen Trank anwenden? ");
                
                        antwort = scan.nextInt();
                        if (antwort == 1)
                        {
                        Leben++;
                        System.out.println("Du hast wieder " +Leben+ " Leben.");
                        Flasche--;
                        }
                
                        else if (antwort == 0)
                        {   
                        System.out.println("Vielleicht ist er später ja nützlicher.");
                        }
                    }
                    else if (Leben < 1)
                    {
                        System.out.println("Du hast alle Leben verloren. GAME OVER!");
                        spielstart(); 
                    }
                }
        
                System.out.println("Okay. Dieser Drache ist also schnell und will keine Zeit verlieren, das soll dir recht sein.");
                System.out.println("Dir fällt auf, dass auch über dem Drachen Herzen schweben, drei um genau zu sein.  ");
                System.out.println("Du beginnst nun also selbst einen Gegenangriff: Wenn du jetzt nach links läufst, kannst du vielleicht das Bein des Drachen treffen, ");
                System.out.println("läufst du nach rechts hast du die Chance, direkt das Herz zu treffen. ");
                System.out.println("Links (1) oder rechts (0)? ");
                
                antwort = scan.nextInt();
                if (antwort == 1)
                {
                    System.out.println("Dein Schlag gelingt! Wie durch Zauberhand findet dein Körper die perfekten Bewegungen und trifft das vordere Bein des Drachen.");
                    System.out.println("Das Biest schreit laut auf, als du es mit deinem Schwert schneidest und verlagert sein Gewicht auf das andere Bein.");
                    System.out.println("Eins der Herzen über dem Drachen wird durchscheinend. ");
                    d--;
                    System.out.println("Der Drache hat noch " +d+ "Leben.");
                }
                else if ( antwort == 0)
                {
                    System.out.println("Das wird wohl nichts! Der Weg ist zu weit, und auch obwohl du magische Kampftechniken beherrschst,");
                    System.out.println("kannst du dem Abwehrangriff des Drachen nicht ausweichen.");
                    System.out.println("Schnell reist du dein Schwert in die Höhe und blockst so gerade noch rechtzeitig zumindest das Schlimmste. ");
                    System.out.println("Trotzdem verlierst du ein Leben. ");
                    
                    if (Leben < 5 && Flasche > 0)
                    {
                        System.out.println("Möchtest du einen Trank anwenden? ");
                
                        antwort = scan.nextInt();
                        if (antwort == 1)
                        {
                        Leben++;
                        System.out.println("Du hast wieder " +Leben+ " Leben.");
                        Flasche--;
                        }
                
                        else if (antwort == 0)
                        {   
                        System.out.println("Vielleicht ist er später ja nützlicher.");
                        }
                    }
                    else if (Leben < 1)
                    {
                        System.out.println("Du hast alle Leben verloren. GAME OVER!");
                        spielstart(); 
                    }
                }
                
                System.out.println("Du solltest jetzt ein wenig vorsichtiger sein.");
                System.out.println("Als du deinen nächsten Schritt tust und leichtfertig einem weiteren Hieb des Drachen ausweichst, klirrt etwas in deiner Tasche. ");
                System.out.println("Die kleine Feuerkugel erinnerst du dich.  ");
                System.out.println("Doch noch bevor du sie ergreifen und endlich ausprobieren kannst, greift dich das Biest erneut an. ");
                System.out.println("Du hast die Wahl: abblocken (1) oder einen offenen Angriff starten (0). ");
                
                antwort = scan.nextInt();
                if (antwort == 1)
                {
                    System.out.println("Der Drache ist zu schnell und du schaffst es nicht mehr. ");
                    System.out.println("Du verlierst wieder ein Leben, so langsam wird es knapp. ");
                    
                    if (Leben < 5 && Flasche > 0)
                    {
                        System.out.println("Möchtest du einen Trank anwenden? ");
                
                        antwort = scan.nextInt();
                        if (antwort == 1)
                        {
                        Leben++;
                        System.out.println("Du hast wieder " +Leben+ " Leben.");
                        Flasche--;
                        }
                
                        else if (antwort == 0)
                        {   
                        System.out.println("Vielleicht ist er später ja nützlicher.");
                        }
                    }
                    else if (Leben < 1)
                    {
                        System.out.println("Du hast alle Leben verloren. GAME OVER!");
                        spielstart(); 
                    }
                }
                
                else if ( antwort == 0)
                {
                    System.out.println("Endlich schaffst du einen wirkungsvolleren Angriff und triffst den Drachen genau in die Seite.");
                    System.out.println("Dieser kreischt und weicht nur für einen kurzen Moment zurück. ");
                    System.out.println("Eins der Herzen wird durchscheinend. ");
                    d--;
                    System.out.println("Der Drache hat noch " +d+ " Leben. ");
                }
                
                System.out.println("Du hast eine winzige Pause, die du nutzt, um die Feuerkugel heraus zu kramen. „Entflamme“ sagst du nun laut.");
                System.out.println("Nichts passiert. ");
                System.out.println("„Entflamme“ wiederholst du, dieses Mal jedoch energischer. Es passiert jedoch wieder nichts.");
                System.out.println("Und dann fällt dir etwas auf. Es ist totenstill geworden.");
                System.out.println("Langsam hebst du den Kopf, nur um zu sehen, dass dir der Drache extrem nah gekommen ist.");
                System.out.println("Du hast keine Zeit mehr zu reagieren. Er packt dich mit seinem Maul, schleudert dich umher und katapultiert dich in die nächste Wand.");
                Leben--;
                System.out.println("Du hast noch " +Leben+ " Leben.");
                
                if (Leben < 1)
                    {
                        System.out.println("Du hast alle Leben verloren. GAME OVER!");
                        spielstart(); 
                    }
                    
                System.out.println("Du spürst zwar keine Schmerzen, aber irgendwas stimmt trotzdem nicht mit deinem Körper. ");
                System.out.println("Du kannst dich kaum noch bewegen, dein Schwert liegt auf der anderen Seite des Raumes.");
                System.out.println("Das Einzige das dir bleibt ist die kleine Kugel, die sich wie durch magische Weise immer noch in deiner Hand befindet. ");
                System.out.println("Der Drache schlängelt sich bereits wieder in deine Richtung. Alle Hoffnung ist verloren.");
                System.out.println("Das Letzte, was dir einfällt ist es, die kleine Kugel nun nach dem Drachen zu werfen. Mit letzter Kraft hebst du deinen Arm, holst aus und wirfst. ");
                System.out.println("Die kleine Kugel trifft den Drachen mit einem leisen Plopp, der kurz innehält und dich ein wenig belustigt anschaut.");
                System.out.println("War ja klar, deswegen vertraut man keinen fremden Leuten im Herzen eines Waldes. ");
                System.out.println("Doch dann… ");
                System.out.println("Gerade als du dich deinem Schicksal hingeben möchtest, da verschwindet eins der Herzen über dem Drachen.  ");
                d--;
                
                if ( d>0)
                {
                System.out.println("Oh je, das war aber nicht das letzte Leben. ");
                System.out.println("Der Drache holt noch einmal kräftig aus und befördert dich direkt aus der Tür heraus. Diese fällt mit einem lauten Krachen zu.");
                System.out.println("Du bist nicht tot! Als du deine Leben checkst, leuchten drei davon.");
                Leben=3;
                d=3;
                System.out.println("Du hast noch " +Leben+ " Leben. ");
                System.out.println("Also auf ein Neues! ");
                }
            }
            
            System.out.println("Der bis eben stille Drache fängt fürchterlich an zu brüllen! ");
            System.out.println("Dann beginnen sich kleine Partikel von ihm zu lösen. Die sowieso untauglichen Flügel verschwinden zuerst.");
            System.out.println("Dann fällt er zu Boden bis schließlich nichts mehr von ihm zu sehen ist.");
            System.out.println("Wow, Herzlichen Glückwunsch, du hast das Spiel geschafft. ");
            System.out.println("Als du das nächste Mal blinzelst, ändert sich deine Umgebung. Wo warst du nochmal? ");
            System.out.println("Ach ja, in der Schule. Neben dir liegen Informatikhausaufgaben. Spiele programmieren steht dort als Überschrift. ");
            System.out.println("Als jedoch die Rede von Textadventuren war musstest du das erstmal googeln. Und so bist du über dieses Spiel gestolpert. ");
            System.out.println("Vielen Dank fürs spielen! 😊 ");
        }
    }
}



















