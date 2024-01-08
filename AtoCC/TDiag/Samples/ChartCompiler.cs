using System;
using System.IO;
using System.Collections;
using System.Text.RegularExpressions;

namespace VCCCompiler
{
        /// <summary>
        /// Zusammenfassung für MyCompiler.
        /// </summary>
        class MyCompiler
        {
                YYARec[] yya;
                YYARec[] yyg;
                YYRRec[] yyr;
                int[] yyd;
                int[] yyal;
                int[] yyah;
                int[] yygl;
                int[] yygh;

                int yyn = 0;
                int yystate = 0;
                int yychar = -1;
                int yynerrs = 0;
                int yyerrflag = 0;
                int yysp = 0;
                int yymaxdepth = 1024;
                int yyflag = 0;
                int yyfnone   = 0;
                int[] yys = new int[1024];
                string[] yyv = new string[1024];

                string yyval = "";

                FileStream OutputStream;
                StreamWriter Output;

                class YYARec
                {
                        public int sym;
                        public int act;
                        public YYARec (int s, int a){ sym = s; act = a; }
                }

                class YYRRec
                {
                        public int len;
                        public int sym;
                        public YYRRec (int l, int s){ sym = s; len = l; }
                }

                ////////////////////////////////////////////////////////////////
                /// Constant values / tokens
                ////////////////////////////////////////////////////////////////
                int token_ignore = 256;
                int token_zahl = 257;
                int token_trenner = 258;
///////////////////////////////////////////////////////////
/// Global settings: 
///////////////////////////////////////////////////////////
// Chart Compiler
//
// use ChartCompiler.exe in.txt out.jpg
//
// in.txt use integer or float values one per line

// Sample in.txt:
//
// 25,46
// 44,00
// 12
// 123,897


ArrayList a = new ArrayList();

///////////////////////////////////////////////////////////


                /// <summary>
                /// Der Haupteinstiegspunkt für die Anwendung.
                /// </summary>
                [STAThread]
                static void Main(string[] args)
                {

                        bool ShowTokens = false;
                        string InputFilename = "";
                        string OutputFilename = "";

                        foreach (string s in args)
                        {
                                if (s.ToLower() == "-t")
                                {
                                        ShowTokens = true;
                                }
                                else
                                {
                                        if (InputFilename == "")  InputFilename = s; else
                                        if (OutputFilename == "") OutputFilename = s; else
                                        {
                                                Console.WriteLine("Too many arguments!");
                                                return;
                                        }
                                }
                        }
                        if (InputFilename == "")
                        {
                                System.Console.WriteLine("You need to specify input and outputfile: compiler.exe input.txt output.txt");
                                return;
                        }

                        StreamReader in_s = File.OpenText(InputFilename);
                        string inputstream = in_s.ReadToEnd();
                        in_s.Close();

                        ////////////////////////////////////////////////////////////////
                        /// Compiler Code:
                        ////////////////////////////////////////////////////////////////
                        MyCompiler compiler = new MyCompiler();
                        compiler.Output = null;
                        if (OutputFilename != "")
                        {
                                File.Delete(OutputFilename);
                                compiler.OutputStream = File.OpenWrite(OutputFilename);
                                compiler.Output = new StreamWriter(compiler.OutputStream);
                        }
                        else
                        {
                                compiler.Output = new StreamWriter(Console.OpenStandardOutput());

                        }

                        compiler.Scanner(inputstream);
                        if (ShowTokens)
                        {
                                foreach (AToken t in compiler.TokenList)
                                {
                                        Console.WriteLine("TokenID: "+t.token+"  =  "+t.val);
                                }
                        }
                        compiler.InitTables();
                        compiler.yyparse();

                        if (compiler.Output != null) compiler.Output.Close();
                }
                public void yyaction (int yyruleno)
                {
                        switch (yyruleno)
                        {
                                ////////////////////////////////////////////////////////////////
                                /// YYAction code:
                                ////////////////////////////////////////////////////////////////
							case    1 : 
         System.Drawing.Font f = new System.Drawing.Font("Arial",10);
         Random rnd = new Random();
         
         float maxvalue = 0;
         int   maxscale = 1;
         
         for (int i = 0; i< a.Count; i++)
         if (maxvalue < (float)a[i]) maxvalue = (float)a[i];
         
         maxvalue = maxvalue + maxvalue/10;
         
         while (maxvalue > 1){
         maxvalue = maxvalue / 10;
         maxscale = maxscale * 10;
         }
         
         System.Drawing.Bitmap b = new System.Drawing.Bitmap(40+a.Count*70,200);
         System.Drawing.Graphics g = System.Drawing.Graphics.FromImage(b);
         
         g.Clear(System.Drawing.Color.White);
         g.DrawRectangle(System.Drawing.Pens.Black,0,0,40+a.Count*70-2,198);
         g.DrawLine(System.Drawing.Pens.Black,10,10,10,190);
         g.DrawString(maxscale.ToString(),f,System.Drawing.Brushes.Black,12,7);
         g.DrawString((maxscale/2).ToString(),f,System.Drawing.Brushes.Black,12,92);
         g.DrawString("0",f,System.Drawing.Brushes.Black,12,173);
         for (int i=0; i<a.Count; i++)
         {
         	int h = (int)(180 * (float)a[i] /maxscale);
         	g.FillRectangle(new System.Drawing.SolidBrush(System.Drawing.Color.FromArgb(rnd.Next(100)+100,rnd.Next(100)+100,rnd.Next(100)+100)),30+i*70,190-h,50,h);
         	g.DrawString((i+1).ToString(),f,System.Drawing.Brushes.Black,30+i*70+22,190-h-17);
         }
         g.DrawLine(System.Drawing.Pens.Black,10,190,30+a.Count*70-2,190);
         
         // Save to OutputStream as jpg
         b.Save(Output.BaseStream,System.Drawing.Imaging.ImageFormat.Jpeg);
         
       break;
							case    2 : 
         
       break;
							case    3 : 
         
       break;
							case    4 : 
         a.Add(float.Parse(yyv[yysp-0]));
         
       break;
                                default : return;
                        }
                }

                public void InitTables()
                {
                        ////////////////////////////////////////////////////////////////
                        /// Init Table code:
                        ////////////////////////////////////////////////////////////////

					int yynacts   = 5;
					int yyngotos  = 5;
					int yynstates = 7;
					int yynrules  = 4;
					yya = new YYARec[yynacts+1];  int yyac = 1;
					yyg = new YYARec[yyngotos+1]; int yygc = 1;
					yyr = new YYRRec[yynrules+1]; int yyrc = 1;

					yya[yyac] = new YYARec(257,4);yyac++; 
					yya[yyac] = new YYARec(258,5);yyac++; 
					yya[yyac] = new YYARec(0,-2 );yyac++; 
					yya[yyac] = new YYARec(0,0);yyac++; 
					yya[yyac] = new YYARec(257,4);yyac++;

					yyg[yygc] = new YYARec(-4,1);yygc++; 
					yyg[yygc] = new YYARec(-3,2);yygc++; 
					yyg[yygc] = new YYARec(-2,3);yygc++; 
					yyg[yygc] = new YYARec(-4,1);yygc++; 
					yyg[yygc] = new YYARec(-3,6);yygc++;

					yyd = new int[yynstates];
					yyd[0] = 0;  
					yyd[1] = 0;  
					yyd[2] = -1;  
					yyd[3] = 0;  
					yyd[4] = -4;  
					yyd[5] = 0;  
					yyd[6] = -3; 

					yyal = new int[yynstates];
					yyal[0] = 1;  
					yyal[1] = 2;  
					yyal[2] = 4;  
					yyal[3] = 4;  
					yyal[4] = 5;  
					yyal[5] = 5;  
					yyal[6] = 6; 

					yyah = new int[yynstates];
					yyah[0] = 1;  
					yyah[1] = 3;  
					yyah[2] = 3;  
					yyah[3] = 4;  
					yyah[4] = 4;  
					yyah[5] = 5;  
					yyah[6] = 5; 

					yygl = new int[yynstates];
					yygl[0] = 1;  
					yygl[1] = 4;  
					yygl[2] = 4;  
					yygl[3] = 4;  
					yygl[4] = 4;  
					yygl[5] = 4;  
					yygl[6] = 6; 

					yygh = new int[yynstates];
					yygh[0] = 3;  
					yygh[1] = 3;  
					yygh[2] = 3;  
					yygh[3] = 3;  
					yygh[4] = 3;  
					yygh[5] = 5;  
					yygh[6] = 5; 

					yyr[yyrc] = new YYRRec(1,-2);yyrc++; 
					yyr[yyrc] = new YYRRec(1,-3);yyrc++; 
					yyr[yyrc] = new YYRRec(3,-3);yyrc++; 
					yyr[yyrc] = new YYRRec(1,-4);yyrc++;
                }

                public bool yyact(int state, int sym , ref int act)
                {
                        int k = yyal[state];
                        while ( k <= yyah[state] && yya[k].sym != sym) k++;
                        if (k > yyah[state]) return false;
                        act = yya[k].act;
                        return true;
                }
                public bool yygoto(int state, int sym , ref int nstate)
                {
                        int k = yygl[state];
                        while ( k <= yygh[state] && yyg[k].sym != sym) k++;
                        if (k > yygh[state]) return false;
                        nstate = yyg[k].act;
                        return true;
                }

                public void yyerror (string s)
                {
                        System.Console.Write(s);
                }

                int yylexpos = -1;
                string yylval = "";

                public int yylex ()
                {
                        yylexpos++;
                        if(yylexpos >= TokenList.Count)
                        {
                                yylval = "";
                                return 0;
                        }
                        else
                        {
                                yylval = ((AToken)TokenList[yylexpos]).val;
                                return ((AToken)TokenList[yylexpos]).token;
                        }
                }

                public bool yyparse ()
                {

                        parse:

                                yysp++;
                        if (yysp>yymaxdepth)
                        {
                                yyerror("yyparse stack overflow");
                                goto abort;
                        }

                        yys[yysp] = yystate;
                        yyv[yysp] = yyval;

                        next:

                                if (yyd[yystate]==0 && yychar==-1)
                                {
                                        yychar = yylex();
                                        if (yychar<0) yychar = 0;
                                }

                        yyn = yyd[yystate];
                        if (yyn != 0) goto reduce;


                        if (! yyact(yystate, yychar, ref yyn)) goto error;
                        else if (yyn>0) goto shift;
                        else if (yyn<0) goto reduce;
                        else            goto accept;

                        error:

                                if (yyerrflag==0) yyerror("syntax error");

                        errlab:

                                if (yyerrflag==0) yynerrs++;

                        if (yyerrflag<=2)
                        {
                                yyerrflag = 3;
                                while (yysp>0 && !yyact(yys[yysp], 255, ref yyn) && yyn > 0) yysp--;

                                if (yysp==0) goto abort;
                                yystate = yyn;
                                goto parse;
                        }
                        else
                        {
                                if (yychar==0) goto abort;
                                yychar = -1; goto next;
                        }

                        shift:

                        yystate = yyn;
                        yychar = -1;
                        yyval = yylval;
                        if (yyerrflag>0) yyerrflag--;
                        goto parse;

                        reduce:

                        yyflag = yyfnone;
                        yyaction(-yyn);
                        yysp -= yyr[-yyn].len;

                        if (yygoto(yys[yysp], yyr[-yyn].sym, ref yyn)) yystate = yyn;

                        switch (yyflag)
                        {
                                case 1 : goto accept;
                                case 2 : goto abort;
                                case 3 : goto errlab;
                        }

                        goto parse;

                        accept:

                                return true;

                        abort:

                                return false;
                }
		////////////////////////////////////////////////////////////////
		/// Scanner
		////////////////////////////////////////////////////////////////

		public class AToken
		{
			public int token;
			public string val;
		}

		ArrayList TokenList = new ArrayList();

		public void Scanner (string Input)
		{
			TokenList = new ArrayList();
			while (1==1)
			{
				AToken lasttoken = FindToken(Input);
				if (lasttoken.token == 0) break;
				if (lasttoken.token != token_ignore) TokenList.Add(lasttoken);
				if (Input.Length > lasttoken.val.Length)
				Input = Input.Substring(lasttoken.val.Length); else return;
			}
                      System.Console.WriteLine(Input);
			System.Console.WriteLine();
			System.Console.WriteLine("No matching token found!");
		}
		public AToken FindToken (string Rest)
		{
			ArrayList Results  = new ArrayList();
			ArrayList ResultsV = new ArrayList();
                      try{

			if (Regex.IsMatch(Rest,"^[0-9]+\\,?[0-9]*",RegexOptions.IgnoreCase)){
				Results.Add (token_zahl);
				ResultsV.Add(Regex.Match(Rest,"^[0-9]+\\,?[0-9]*",RegexOptions.IgnoreCase).Value);}

			if (Regex.IsMatch(Rest,"^[\\r\\s\\t\\n]+",RegexOptions.IgnoreCase)){
				Results.Add (token_trenner);
				ResultsV.Add(Regex.Match(Rest,"^[\\r\\s\\t\\n]+",RegexOptions.IgnoreCase).Value);}

			}catch{}
			int maxlength = 0;
			int besttoken = 0;
			AToken ret = new AToken();
		        ret.token = besttoken;
			for (int i = 0; i < Results.Count; i++){
				if (ResultsV[i].ToString().Length > maxlength)
				{
					maxlength = ResultsV[i].ToString().Length;
					besttoken = (int)Results[i];
		         	        ret.token = besttoken;
		                  	if (besttoken != 0)
			                ret.val   = ResultsV[i].ToString();
				}
			}
			return ret;
		}

	}
}
