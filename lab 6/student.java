
package cie;

import java.util.Scanner;
public class student
{
protected String usn=new String();
protected String name=new String();
protected int sem;

public void inputstudentdetails()
{
Scanner s= new Scanner(System.in);
System.out.println("enter the usn of student");
usn= s.next();
System.out.println("enter the name of the student");
name= s.next();
System.out.println("enter the sem in which student is studying");
sem =s.nextInt();
}
public void displayStudentDetails()
{
System.out.println("usn:"+usn);
System.out.println("Nmae:" +name);
System.out.println("Sem:" +sem);
}
}