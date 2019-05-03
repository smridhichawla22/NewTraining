import java.util.*;
class Que
{
/*private	LinkedList<Integer> list=new LinkedList<Integer>();
public void enqueue(Integer o)
{
	list.addLast(o);
}
public Integer front()
{
	return list.getFirst();

}
public Integer rear()
{
	return list.getLast();
}
public Integer dequeue()
{
	return list.removeFirst();
}*/
public static void main(String []args)
{/*
Que q=new Que();
q.enqueue(10);
q.enqueue(20);
q.enqueue(30);
System.out.println("First element:"+q.front());
System.out.println("Last element:"+q.rear());
System.out.println("Remove First:"+q.dequeue());
System.out.println("New First element:"+q.front());

/*
Stac s = new Stac();
s.push(10);
System.out.println(s.pop());

/*
LinkedList li=new LinkedList();
li.push(1);
li.push(2);
li.push(3);
li.push(4);
for(Object i : li)
{
	System.out.println(i);
}*/

Stack<String> s = new Stack<String>();
s.push("a");
s.push("b");
System.out.println(s.pop());
}
}