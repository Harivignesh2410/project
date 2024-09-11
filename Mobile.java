package Abstraction;

abstract public  class Mobile {
//	abstract public void call();
//	abstract public void text();
	Mobile(){
		System.out.println("hello");
	}
}

class Vivo extends Mobile{
	public void call()
	{
		System.out.println("Calling.... from vivo");
	}
	public void text()
	{
		System.out.println("message..... from vivo");
	}
}

class Oppo extends Vivo{
	public void call() {
		System.out.println("calling.....from Oppo");
	}
	public void text()
	{
		System.out.println("message..from Oppo");
	}
}

class Driver
{
	static int a=10;
	public static void main(String arg[]) {
		a=20;
		Vivo ref=new Oppo();
		Oppo ref1=(Oppo)ref;
		ref1.call();
		ref1.text(); 
	}
}
