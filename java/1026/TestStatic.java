public class testStatic{
    static int a;// class関数
    int b;// instance関数
    static void seta(int x){a=x;}//clssmethod
    void setb(int x){b=x;}

    public static void main(String args[]){
	TestStatic.seta(10);
	Teststatic obj1=new TestStatic();
	Teststatic obj2=new Teststatic();

	Systemout.println("obj1.a="+obj1.a);
    }
}
