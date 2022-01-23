package revpro;
import java.util.Scanner;

public class W1D1 {

	public static void main(String[] args) {
		String a[] = new String[4];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<4;i++) {
			a[i]=sc.nextLine();
		}
		int len=sc.nextInt();
		int count=0;
		for(int i=0;i<4;i++) {
			if(a[i].length()==len)
				count++;
		}
		System.out.println(count);

	}

}
