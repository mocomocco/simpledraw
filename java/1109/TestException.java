public class TestException{
    public static void main(String argv[]){
	try{
	    System.out.println(argv[0]+" "+argv[1]);
	    System.out.println("Nice to meet you.");
	}catch(Exception e){
	    System.out.println("please input 2 words");
	}
    }
}
