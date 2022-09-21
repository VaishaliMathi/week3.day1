package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("My desktop size is 17inch");
	}

	public static void main(String[] args) {
		
         Desktop obj=new Desktop();
         obj.desktopSize();
         obj.computerModel();

	}

}
