package javaT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Case1 implements Serializable{
	public String name1 = "name1";					// name1
	public transient String name2 = "name2";		// null
	public final transient String name3 = "name3";	// name3
	private transient String name4 = "name4";		// null
	
	public int number1 = 100;						// 100
	public transient int number2 = 200;				// 0
	public static transient int number3 = 300;		// 300
	private transient int number4 = 400;			// 0
	
	public String getName4() {
		return name4;
	}
	public void setName4(String name4) {
		this.name4 = name4;
	}
	public int getNumber4() {
		return number4;
	}
	public void setNumber4(int number4) {
		this.number4 = number4;
	}
}

public class Test5 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Case1 input = new Case1();
		
		//직렬화
		FileOutputStream fos = new FileOutputStream("file");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(input);
		
		//역직렬화
		FileInputStream fis = new FileInputStream("file");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Case1 output = (Case1)ois.readObject();
		
		System.out.println("name1 = " + output.name1);
		System.out.println("name2 = " + output.name2);
		System.out.println("name3 = " + output.name3);
		System.out.println("name4 = " + output.getName4());
		System.out.println("number1 = " + output.number1);
		System.out.println("number2 = " + output.number2);
		System.out.println("number3 = " + output.number3);
		System.out.println("number4 = " + output.getNumber4());
	}
}