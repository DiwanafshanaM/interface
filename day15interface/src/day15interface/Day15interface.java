package day15interface;

import program_interface.prog_interface.A;
import program_interface.prog_interface.C;
import program_interface.prog_interface.D;

public class Day15interface {
	class A implements C
	{
	
		public void m3() 
		{
			System.out.println("In m3 method");
		}
	
		public void m4() 
		{
			System.out.println("In m4 method");
		}
	}
	abstract class B
	{
		abstract void m1();
		public void m2()
		{
			System.out.println("In m2 method");
		}
	}
	interface C
	{
	
		public void m3();
		public void m4();
	}
		interface D
		{
			
		}
	public class InterfaceDemo implements D
	{
		public static void main(String[] args) 
		{
	         A a=new A();
	         a.m3();
	         a.m4();
		}
	}



}

}
}