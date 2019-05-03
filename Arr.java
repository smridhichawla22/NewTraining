package he;
class Gen<T>{
	void disp(T a) {
		System.out.println(a);
	}
}
public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<Integer> g = new Gen<Integer>();
		g.disp(10);
		Gen<String> g1 = new Gen<String>();
		g1.disp("Sam");
		Gen<String> g3 = new Gen<String>();
		g3.disp("a");
		//Gen<Char> g2 = new Gen<Char>();
		//g2.disp('a');
	}

}
