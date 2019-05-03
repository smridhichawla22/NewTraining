import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		ArrayList ar = new ArrayList();
		do {
			System.out.println("element");
			ar.add(sc.next());
			System.out.println("Wanna Continue????");
			a=sc.nextInt();
		}while(a==1);
		
	}

}
