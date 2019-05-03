import java.util.LinkedList;

 class MyStack {
private LinkedList list=new LinkedList();
public void push(Object o) {
	list.addFirst(o);
}
public Object top() {
	return list.getFirst();
}
public Object pop() {
	return list.removeFirst();
}
}
public class LL{
	public static void main(String[] args) {
		
		MyStack s=new MyStack();
		s.push(10);
		s.push(20);
		System.out.println(s.pop());
		System.out.println(s.pop());

	}

}
