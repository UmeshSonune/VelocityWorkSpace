
package Assignment_17;
import java.io.*;
public class IOStreamDemo  {
	public static void main(String[] args)throws IOException {
		File f  = new File("U:\\abc","abc.txt");
		System.out.println(f.exists());
		//f.mkdir();
		//f.createNewFile();
		//System.out.println(f.isFile());
		//System.out.println(f.isDirectory());
		//-----------------------------
	//	File r = new File("U:\\Download");
		//String[] s = r.list();
		//for(String s1 :s) {
		//System.out.println(s1);}
		//---------------------------------
		//FileWriter fw = new FileWriter(f,true);//construcor
		//fw.write("This is First line repeating");
		//fw.flush();
		FileReader fr = new FileReader(f);
		int s = fr.read();
		
		while(s != -1) {
		System.out.print((char)s);
		s = fr.read();
		}
		System.out.println(f.length()); //REMAINED TO SEE
		//---------------------------------------
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("********************************************");
		System.out.println("****************Program*********************");
		System.out.println();
		
		FileReader fr1 = new FileReader(f);
		int[] vowel = {'A','E','I','O','U','a','e','i','o','u',1,2,3,4,5,6,7,8,9,0};
		char[] ch = new char[(int)f.length()];
		fr1.read(ch);
		int total=0;
		for(char c :ch) { 
			for(int a:vowel) {
				if(a==c) {
					System.out.print(c);
					total++;
				}
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("+++++++++++TOTAL VOWEL AND NUMBER  "+total+"  +++++++++++++++++");
		//------------------------------------------------------------------------
		//PrintWriter out = new PrintWriter(f);
		//out.println(1000);
		//out.println("Durga");
		//out.flush();
		//out.close();
		//-----------------------------------------------------------------------------
		//BufferedWriter bw = new BufferedWriter(fw);
		//bw.write("yyy");
		
		//bw.flush();
		//bw.close();
		//BufferedReader br = new BufferedReader(new FileReader(f));
		//String i = br.readLine();
		//while( i != null) {
			//System.out.println(i);
			// i = br.readLine();
	   //	}
		
		//br.close();
		
		
		
		
		
		
		
		//-------------------------------------------------------------------------
		
		//-----------------------------------------------------------------------------------------
		
		
	}

}
 