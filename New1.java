package he.hello;

class S{
	static {System.out.println("static block");}
	static void disp() {System.out.println("Static class S");}
	void disp(int i) {
		System.out.println("Disp class S");
	}
}

class SS extends S{
	static void disp() {System.out.println("Static class SS");}
}
public class New1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main");
		//S s = new S();
		
		S.disp();
		
		S s = new S();
		//
		s.disp(10);
	}

}
