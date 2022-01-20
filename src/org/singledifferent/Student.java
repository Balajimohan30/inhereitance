package org.singledifferent;
import org.single.Client;
public class Student extends Client {
	public void studName() {
System.out.println("bala");
	}
	public void studPlace() {
System.out.println("thnj");
	}
	public static void main(String[]args) {
		Student s=new Student ();
		s.comName();
		s.comPlace();
		s.clientName();
		s.clientId();
		s.studName();
		s.studPlace();
	}

}
