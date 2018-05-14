import java.util.Scanner;
class Complex
{
	private int real , im;
	
	Complex(int r, int i)
	{
		real=r;
		im=i;
	}
	
	void display()
	{
		System.out.println(real+" + i"+im);
	}
	
	Complex add(Complex c2)
	{
		Complex obj=new Complex(0,0);
		obj.real = real + c2.real;
		obj.im = im + c2.im;
		return obj;
	}
	
	Complex sub(Complex c2)
	{
		Complex obj=new Complex(0,0);
		obj.real = real - c2.real;
		obj.im = im - c2.im;
		return obj;
	}
}

class ComplexMain
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int r1,i1,r2,i2;
		
		System.out.print("Enter real part: ");
		r1=sc.nextInt();
		System.out.print("Enter imaginary part: ");
		i1=sc.nextInt();
		System.out.print("Enter real part: ");
		r2=sc.nextInt();
		System.out.print("Enter imaginary part: ");
		i2=sc.nextInt();
		
		Complex obj=new Complex(r1,i1), obj2=new Complex(r2,i2);
		System.out.println("\nFirst Complex Number: ");
		obj.display();
		System.out.println("\nSecond Complex Number: ");
		obj2.display();
		
		System.out.println("Addition: ");
		obj.add(obj2).display();
		
		System.out.println("Subtraction: ");
		obj.add(obj2).display();
	}
}
