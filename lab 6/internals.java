

package cie;

import java.util.Scanner;
public class internals extends student
{
protected int marks[]=new int[5];
public void inputciemarks()
{
Scanner s =new Scanner(System.in);
System.out.println("enter the marks ");
for(int i=0;i<5;i++)
{
marks[i]=s.nextInt();
}
}
}