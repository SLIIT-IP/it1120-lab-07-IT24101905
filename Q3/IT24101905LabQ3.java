import java.util.Scanner;
          public class IT24101905LabQ3 {
               public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

         double discountRate = 0.05;

         for(int i =1; i<=5; i++)  {
                    System.out.println("Customer"+i+":");

       System.out.print("Enter total bill amount:");
       double amount = scanner.nextDouble();

        System.out.print("Enter the payment method(C for cash, O for other):");

        char paymentMode = scanner.next().charAt(0);

       
         if( paymentMode =='c' || paymentMode =='C') {
         

     double discount = amount * discountRate;

     double amountToBePaid = amount - discount;

     System.out.println("Discount is:"+discount);
     System.out.println("Amount to be paid:"+amountToBePaid);

            }
         else if(paymentMode == 'o' || paymentMode == 'O') {

        System.out.println("No discount applicable.Amount to be paid:"+amount);

             
            }
      

          else { 
         System.out.print("Payment mode is not valid");
                 }

          System.out.println();
                  }
              scanner.close();

                      }

          }


      

      

     

      
     
      
