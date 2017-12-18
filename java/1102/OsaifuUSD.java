public class OsaifuUSD extends Osaifu{
    int kawase=114;
    public void inUSD(int x){
	super.in(x*kawase);
    }

    public int outUSD(int x){
	return super.out(x*kawase)/kawase;
    }

    public void print(){
	super.print();
	int doller=okane/kawase;
	System.out.println("( "+doller+" usd )");
    }

    public static void main(String args[]){
	OsaifuUSD saifu1=new OsaifuUSD();
	OsaifuUSD saifu2=new OsaifuUSD();
	saifu1.in(1000);
	saifu2.inUSD(5);
	saifu1.print();
	saifu2.print();
	saifu2.inUSD(saifu1.outUSD(2));
	saifu1.print();
	saifu2.print();
    }
}
