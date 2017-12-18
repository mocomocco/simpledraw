public class TestString{
    
    public static void main(String argv[]){

	try{
	    String line=argv[0];

	    System.out.println(line);

	    int length=line.length();

	    int i=length;

	    while(--i>0){
		System.out.print(line.charAt(i));
	    }

	    System.out.println(line.charAt(i));
	    
	}catch(Exception e){
	    System.out.println("please input a word");
	}
    }
}
