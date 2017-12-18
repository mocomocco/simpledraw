import java.net.*;
import java.io.*;

public class Readjpeg{
    public static void main(String[] args){
	byte[] data =new byte[512];
	try{
	    URL targetURL =new URL(args[0]);
	    InputStream istream = targetURL.openStream();

	    FileOutputStream fout =new FileOutputStream("cat2.jpg");
	    int datalength;

	    while((datalength=istream.read(data))!=-1){
		fout.write(data,0,datalength);
	    }
	    istream.close();
	    fout.close();
	}catch(IOException e){
	    System.out.println(e);
	}
    }

}
