
//Anon inner class
abstract class Cloth{
	abstract void price();a 
}
public class Anon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cloth c = new Cloth() {
			void price() {
				System.out.println("Price");
			}
		};
		c.price();
	}

}