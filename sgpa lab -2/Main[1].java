import java.util.Scanner;

class Subject
{
  int Marks;
  int Credits;
  int Grade;
}

class Student
{
 Subject[] Subjects;
 String name;
 String usn;
 double SGPA;
 Scanner s;

  Student()
   {
     int i;
     Subjects=new Subject[10];
     for(i=0;i<8;i++)
       {
          Subjects[i]=new Subject();
       }
      s=new Scanner(System.in);
    }
   void getStudentDetails()
   {
      System.out.println("Enter the name of the student");
      name=s.nextLine();
      System.out.println("Enter the usn of the student");
      usn=s.nextLine();
   }
   void getMarks()
   {
      int i;
      System.out.println("Enter the marks and credits of each subject");
      for(i=0;i<8;i++)
      {
         Subjects[i].Marks=s.nextInt();
          if(Subjects[i].Marks>100)
          Subjects[i].Grade=10;
          else if(Subjects[i].Marks>=90 && Subjects[i].Marks<=100)
            Subjects[i].Grade=10;
          else if(Subjects[i].Marks>=80 && Subjects[i].Marks<90)
            Subjects[i].Grade=9;
          else if(Subjects[i].Marks>=70 && Subjects[i].Marks<80)
            Subjects[i].Grade=8;
          else if(Subjects[i].Marks>=60 && Subjects[i].Marks<70)
            Subjects[i].Grade=7;
          else if(Subjects[i].Marks>=50 && Subjects[i].Marks<60)
            Subjects[i].Grade=6;
          else if(Subjects[i].Marks>=40 && Subjects[i].Marks<50)
            Subjects[i].Grade=5;
          else
            System.out.println("Fail");
       }
       for(i=0;i<8;i++)
       {
           System.out.println("enter the credits");
           Subjects[i].Credits=s.nextInt();
       }
   }
   void computeSGPA()
   {
     int i;
     int n,SGPA;
     int d=20;
     int n_sum=0;
     for(i=0;i<8;i++)
      { 
        n=(Subjects[i].Grade)*(Subjects[i].Credits);
        n_sum=n+n_sum;
      }
     SGPA=(n_sum)/(d);
     System.out.println("SGPA="+SGPA);
   }
 }
 
class Main
{
    public static void main(String args[])
    {
      Student s1=new Student();
      s1.getStudentDetails();
      s1.getMarks();
      s1.computeSGPA();
     }
}

