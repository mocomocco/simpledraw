import java.net.*;
import java.io.*;

public class URLtest{
    public static void main(String[] args){
	try{
	    URL targetURL =new URL(args[0]);
	    InputStream istream = targetURL.openStream();
	    InputStreamReader isreader = new InputStreamReader(istream);
	    BufferedReader breader = new BufferedReader(isreader);

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
