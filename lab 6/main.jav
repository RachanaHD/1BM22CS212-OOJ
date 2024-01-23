import see.externals;

class main
{
public static void main(String args[])
{
int numofstudents=2;
externlas finalmarks[]=new externals[numofstudents];
for(int i=0;i<numofstudents;i++)
{
finalmarks[i]=new externals();
finalmarks[i].inputstudentdetails();
System.out.println("enter cie marks");
finalmarks[i].inputciemarks();
System.out.println("enter see marks");
finalmarks[i].inputseemarks();

}
system.out.println("displaying data;\n");
for(int  i=0;i<numofstudents;i++)
{
finalmarks[i].calculatefinalmarks();
finalmarks[i].dispalyfinalmarks();
}
}
}
