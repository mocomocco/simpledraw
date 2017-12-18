class Kinri{
	public static void main(String args[]){
		double okane = 100000.0;
		int year=0;
		while(okane<=200000){
			year+=1;
			okane*=1.05;
			System.out.println("year="+year+" okane="+okane);
		} 
	}
}