package homework2;

import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {
	void HomeWork(int i, String s, boolean b, double d) {
		System.out.println("using integer " + (i+5));
		System.out.println("using String " + s);
		System.out.println("using boolean " + b);
		System.out.println("using double " + (d/i));
		
	}
	void CallingHomeWork (example1 z) {
		z.HomeWork(4, "bye", 6>3, 4.4);
		
	}

	public static void main(String[] args) {
		example1 a =new example1();
		a.HomeWork(2, "Hello", (8>5 && 4>2) && 7>8, 2.2); 
		a.CallingHomeWork(new example1());
		//C:\Users\kasif\Downloads\chromedriver_win32 (1)
		system.setpro
		ChromeDriver driver=new ChromeDriver()

	}

}

