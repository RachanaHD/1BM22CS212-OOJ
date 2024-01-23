
package see;

import cie.internals;
import java.util.Scanner;

public class externals extends internals
{
protected int marks[];
protected int finalmarks[];


public  externals()
{
marks= new int[5];
finalmarks=new int[5];
}

public void inputseemarks()
{
 Scanner s=new Scanner(System.in);
 for(int i=0;i<5;i++)
 {
System.out.print("subject"+(i+1)+"marks :");
marks[i]=s.nextInt();
 }
}
public void calcuatefinalmarks()
{
for(int i=0;i<5;i++)
finalmarks[i]=marks[i]/2+ super.marks[i];
}

public void displayfinalmarks()
{
  displayStudentDetails();
for(int i=0; i<5;i++)
System.out.println("subject"+(i+1)+":"+finalmarks[i]);
}
}