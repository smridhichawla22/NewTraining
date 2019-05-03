
public class Sta {
	static int a=10;
	Sta(int a){
		Sta.a= a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sta s1 = new Sta(10);
		Sta s2 = new Sta(110);
		Sta s3 = new Sta(1110);
		System.out.println(s1.a);
		
		System.out.println(s2.a);
		
		System.out.println(s3.a);
	}

}
