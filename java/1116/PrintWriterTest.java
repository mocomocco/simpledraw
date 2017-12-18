import java. io.*;

public class PrintWriterTest{
    public static void main (String[] args){

	try{
	    FileWriter fwriter = new FileWriter("writer.txt");
	    PrintWriter pwriter = new PrintWriter(fwriter);

	    int x=2016;
	    String s="Java教科書";

	    pwriter.println(x);
	    pwriter.println(s);

	    pwriter.println(x+s+"です");
	    fwriter.write(s);
	    pwriter.close();

	    FileReader freader =new FileReader("writer.txt");
	    BufferedReader breader=new BufferedReader(freader);

	    String tmp=null;

	    while((tmp=breader.readLine())!=null){
		System.out.println(tmp);
	    }
	    breader.close();
	}catch(IOException e){
	    System.out.println(e);
	}

    }
}
