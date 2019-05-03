import java.util.ArrayList;
import java.util.Iterator;

import java.util.Scanner;

public class Coll{
            public static void main(String args[]){
            	byte ch;
            	ArrayList ar=new ArrayList();
            	try (Scanner s=new Scanner(System.in)) {
            	
            		do {
            			System.out.println("enter element");
            			ar.add(s.nextInt());
            			System.out.println("wanna continue 0/1: ");
            			ch=s.nextByte();
            			}while(ch==1);
            	}
            
            	System.out.println("_____________");
            	Iterator it=ar.iterator();
            	while(it.hasNext()) {
            			int val=(int)it.next();
            			if(val%2!=0)
            				it.remove();
            	}
            	System.out.println("---------");
            	for(Object ob:ar) {
            		System.out.println(ob);
            	}
            		
           }
 }
            	
                
  