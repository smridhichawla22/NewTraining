class Parent{
	
	Parent(){
				System.out.println("Parent cons");
			}
	Parent(int i){
					System.out.println("Parent param cons " +i);
				}

}
class Child extends Parent{
		Child(){super(0);
System.out.println("Child const");}
Child(int a){System.out.println("Child param cons "+a);
}
}
public class Inheritance{
public static void main(String args[]){
//Child c = (Child) new Parent();
//Child c1 = new Child(10);
	Parent c1 = new Child(10);
}
}