import java .util .Scanner;
abstract class shape
{
int a,b;
abstract void printarea();
abstract void input();
Scanner s=new Scanner (system.in);
}

class rectangle extends shape
{
	void input()
	{
		System.out.println("enter length and breadth");
		a=s.nextInt();
		b=s.nextInt();
	}
	void printarea()
	{
		System.out.println("Area of rectanle is :"+(a*b)+"sq units");
	}
}

class triangle extends shape
{
	void input()
	{
		System.out.println("enter the base and height");
		a=s.nextInt();
		b=s.nextInt();
	}
	void printarea()
	{
		System.out.println("Area of triangleis :"+((a*b)/2)+"sq units");
	}
}

class circle extends shape
{
	void input()
	{
		System.out.println("enter the radius of circle");
		a=s.nextInt();
	}
	void printarea()
	{
		System.ot.println("are of circle is"+(3.14*a*a)+"sq units");
	}
}
class area
{
	public static void main(String args[])
	{
		rectangle r=new rectangle();
		r.input();
		r.printarea();

		triangle t=new triangle();
		t.input();
		t.printarea();

		circle c=new circle();
		c.input();
		c.printarea();
	}
}


