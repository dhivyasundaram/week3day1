package org.system;

public class Desktop extends Computer{
	public void desktopsize() {
		System.out.println("The desktop size is: Medium " );
	}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.ComputerModel();
		d.desktopsize();
	}
		
	}

