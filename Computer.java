package org.system;

public class Computer {
	public void computerModel()
	{
		System.out.println("computerModel methood is hp");
	}
}
class Desktop extends Computer{
	public void desktopSize()
	{
		System.out.println("Desktop size is 32 inch");
	}
	public static void main(String[] args) {	
		Desktop sys=new Desktop();
		sys.desktopSize();
		sys.computerModel();
}
}
