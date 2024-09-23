import java.util.Scanner;
    public class IT24101905Lab7Q1{
      public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);
      double mark1,mark2,mark3,mark4,tot,avg;
      
     System.out.println("Enter marks for four subjects :");

     System.out.print("Enter subject Mark 1 :");
     mark1 = scanner.nextDouble();

     System.out.print("Enter subject Mark 2 :");
     mark2 = scanner.nextDouble();

     System.out.print("Enter subject Mark 3 :");
     mark3 = scanner.nextDouble();

     System.out.print("Enter subject Mark 4 :");
     mark4 = scanner.nextDouble();
    
    tot = mark1 + mark2 + mark3 + mark4 ;
    avg = tot/4;
    System.out.println("Average is: "+ avg);      
         
if(avg >=75 && avg <=100) 
       {System.out.println("Overall Grade is = Distinction");}
  
      else if (avg >=50 && avg <75)
        {System.out.println("Overall Grade is = Credit");}
     
       else if (avg >=0 && avg < 50)
        {System.out.println("Overall Grade is = Fail");}

       else 
            {System.out.println("Invalid mark entered");}

     
          scanner.close();

        }

  }