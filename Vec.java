import java.util.Vector;

public class Vec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		System.out.println("Capacity "+v.capacity());
		v.addElement(1);//1.0v
		v.add(2);//1.2v
		v.add("abc");
		v.add(2.4f);
		v.add(4);
		v.add(5);
		v.add(7);
		v.add(6);
		v.add(8);
		v.add(12);
		v.add(112);
		System.out.println("Capacity "+v.capacity());
		for(Object ob:v) {
			System.out.println(ob);
		}
	}

}
