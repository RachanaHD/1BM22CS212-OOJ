import java.util.Scanner;

class books
{
   String name;
   String author;
   int price;
   int numpages;

books(String name,String author,int price,int numpages)
{
   this.name=name;
   this.author=author;
   this.price=price;
   this.numpages=numpages;
}

public String toString()
{
   String name,author,price,numpages;
   name="book name:"+this.name+"\n";
   author="author name:"+this.author+"\n";
   price="price:"+this.price+"\n";
   numpages="number of pages:"+this.numpages+"\n";
   return name+author+price+numpages;
}
}
class Preeti
{
  public static void main(String args[])
   {
     Scanner s=new Scanner(System.in);
     int n,i;
     String name;
     String author;
     int price;
     int numpages;
     System.out.println("Enter the number of books");
     n=s.nextInt();
     books b[];
     b=new books[n];
     System.out.println("Enter the name,author,price and number of pages of the book");
     for(i=0;i<n;i++)
      {
        name=s.next();
        author=s.next();
        price=s.nextInt();
        numpages=s.nextInt();
        b[i]=new books(name,author,price,numpages);
       }
       for(i=0;i<n;i++)
       {
        System.out.println(b[i]);
       }
    }
}











