import java.io.*;

public class DoutTest {
	public static void main (String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("dout.dat");
			DataOutputStream dout = new DataOutputStream(fout);
			int i;
			for(i=1;i<=100;i++){
			dout.writeInt(i);
			}
			dout.close();

			FileInputStream finput = new FileInputStream("dout.dat");
			DataInputStream dinput = new DataInputStream(finput);
			for(i=1;i<=100;i++){
			System.out.println(dinput.readInt());
			}
			dinput.close();
			
		}catch (FileNotFoundException e) {
			System.out.println(e);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
