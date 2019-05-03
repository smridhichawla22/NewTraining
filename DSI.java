interface Demo{
	default void disp() {
		System.out.println("disp");
	}
	default void disp1() {
		System.out.println("disp1");
	}
	static void show() {
		System.out.println("show");
	}
	static void show1() {
		System.out.println("show1");
	}
}
public class DSI implements Demo{
	public void disp() {
		System.out.println("DSI disp");
	}
	static void show() {
		System.out.println("DSI show");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new DSI();
		d.disp();
		DSI.show();
	}

}

