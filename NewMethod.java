class S{
	static void disp() {System.out.println("Static class S");}
}

class SS extends S{
	static void disp() {System.out.println("Static class SS");}
}
public class NewMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SS ss = new SS();
		ss.disp();
	}

}
