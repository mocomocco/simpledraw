public class Score {
	public static void main (String argv[]) {
		int i,score;
		char grade;
		for(i=0;i<10;i++) {
			score=(int)(Math.random() * 100);
			if (score>=80) grade='A';
			else if (score>=60) grade ='B';
			else if (score>=40) grade='C';
			else grade='D';
			System.out.println(score+" "+grade);
		}
	}
}