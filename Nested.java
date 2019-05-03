
//static class, method non-static

class Outer{
	  class Inner{
		   void disp() {
			System.out.println("Hello");
		}
	}
	  void show() {
		  Inner i = new Inner();
		  i.disp();
	  }
}
public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		//Outer.Inner i = o.new Inner();
		o.show();
	}

}
