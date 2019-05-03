package he.hello;

import java.io.Closeable;
import java.io.IOException;

class MyResource1 implements AutoCloseable {
	public void close() throws IOException{
		System.out.print("1 ");
	}
}

class MyResource2 implements Closeable {
	public void close() throws IOException{
		throw new IOException();
	}
}
public class TestRes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(MyResource1 r1 = new MyResource1();MyResource2 r2 = new MyResource2();){
			System.out.print("T ");
		}catch(IOException ioe) {
			System.out.print("IOE ");
		}finally {
			System.out.print("F ");
		}
	}

}
