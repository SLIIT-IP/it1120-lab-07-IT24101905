import java.util.Scanner;
      public class IT24101905Lab7Q1B {
        public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
       double mark1, mark2,mark3,mark4, tot,avg ;

for(int student = 1; student <=3; student++) {
    System.out.println("Student " + student);
    
      System.out.print("Enter marks: ");
         mark1 = scanner.nextDouble();
         mark2 = scanner.nextDouble();
         mark3 = scanner.nextDouble();
         mark4 = scanner.nextDouble();

     tot = mark1 + mark2 + mark3 + mark4;
     avg = tot / 4;

   System.out.println("Average "+ avg);

   if(avg >=75 && avg <=100) {
       System.out.println("Overall Grade is = Distinction");
  
     } else if (avg >=50 && avg <75){
        System.out.println("Overall Grade is = Credit");
     
      } else if (avg >=0 && avg < 50) {
        System.out.println("Overall Grade is = Fail");

      }  else {
            System.out.println("Invalid mark entered");
      } 
     
   }
          
           scanner.close();

      }

}