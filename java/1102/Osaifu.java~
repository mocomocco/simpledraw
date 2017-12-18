public class Osaifu{
    int okane=0;

    Osaifu() {okane=0;}

    Osaifu(int x){
	okane=x;
    }

    void in(int x){
	okane+=x;
    }

    int out(int x){
	if(okane>=x){
	    okane-=x;
	}
	else{
	    x=okane;
	    okane=0;
	} 
	return x;
    }
    void print(){
	System.out.println("残金は"+okane+"円");
}

    public static void main(String args[]){
	Osaifu saifu1=new Osaifu(1000);
	Osaifu saifu2=new Osaifu(500);
	saifu1.in(1000);
	saifu2.in(500);
	saifu1.print();
	saifu2.print();
	saifu2.in(saifu1.out(200));
	saifu1.print();
	saifu2.print();
    }
}
