package he.hello;
import java.util.Scanner;

class AtmException extends Exception{
	public AtmException(String msg) {
		super(msg);
	}
}
public class Atm{

	void withdraw() throws AtmException {
		Scanner s=new Scanner(System.in);
		System.out.println("enter amount");
		int am=s.nextInt();
	if(am > 4000) {
				throw new AtmException("cannot withdraw money");
				}
				else {
					System.out.println("done");
					
				}
	s.close();
				
			}
	public static void main(String[] args) throws AtmException {
		
		try {
		
		Atm  a = new Atm();
		a.withdraw();
		}catch(AtmException e ) {
			System.out.println("catching errorrrrrrr");
		}
	}
		}