//calculator with 15 functions using switches and one method....
package calculator;
import java.util.Scanner;
public class Calculator {
   
   public static void calculate()
   {
       int i;
       double nber1,nber2,nber3,nber4,nber5,answer;
    int choice;
     Scanner choic=new Scanner(System.in);
     for(;;)
     {
     System.out.println("Enter Your Choice::");
     choice=choic.nextInt();
     switch(choice)
     {
         case 1:
             //addition
             System.out.println("Number 1:");
             nber1=choic.nextDouble();
             System.out.println("Number 2:");
             nber2=choic.nextDouble();
             answer=nber1+nber2;
             System.out.print("The Sum is:\t");
             System.out.println(answer);
         break;
        case 2:
             //division
            System.out.println("Number 1:");
            nber1=choic.nextDouble();
            System.out.println("Number 2:");
             nber2=choic.nextDouble();
             answer=nber1/nber2;
             System.out.print("The Quotient is:\t");
             System.out.println(answer);
        break;
        case 3:
             //multiplication
            System.out.println("Number 1:");
            nber1=choic.nextDouble();
            System.out.println("Number 2:");
             nber2=choic.nextDouble();
             answer=nber1*nber2;
             System.out.print("The Multiplication is:\t");
             System.out.println(answer);
        break;
        case 4:
             //substraction
            System.out.println("Number 1:");
            nber1=choic.nextDouble();
            System.out.println("Number 2:");
             nber2=choic.nextDouble();
             answer=nber1-nber2;
             System.out.print("The answer is:\t");
             System.out.println(answer);
        break;
        case 5:
            //square root 
            System.out.println("Number:");
            nber1=choic.nextDouble();
            answer=Math.sqrt(nber1);
            System.out.print("The Sum is:\t");
            System.out.println(answer);
            
        break;
        case 6:
             //power
            System.out.println("Number:");
            nber1=choic.nextDouble();
            System.out.println("Exponent");
             nber2=choic.nextDouble();
             answer=Math.pow(nber1, nber2);
             System.out.print("The answer is:\t");
             System.out.println(answer);
        break;
        case 7:
             //modulo
            System.out.println("Number:");
            nber1=choic.nextDouble();
            answer=nber1%2;
            System.out.print("The answer is:\t");
            System.out.println(answer);
        break;
        case 8:
             //logarithms
            System.out.println("Number:");
            nber1=choic.nextDouble();
            answer=Math.log(nber1);
            System.out.print("The answer is:\t");
            System.out.println(answer);
        break;
        case 9:
             //cosines
            System.out.println("Number:");
            nber1=choic.nextDouble();
            answer=Math.cos(nber1);
            System.out.print("The answer is:\t");
            System.out.println(answer);
        break;
        case 10:
             //sines
            System.out.println("Number:");
            nber1=choic.nextDouble();
            answer=Math.sin(nber1);
             System.out.print("The answer is:\t");
             System.out.println(answer);
        break;
        case 11:
             //tan
            System.out.println("Number");
            nber1=choic.nextDouble();
            answer=Math.tan(nber1);
             System.out.print("The answer is:\t");
             System.out.println(answer);
        break;
        case 12:
             //percentage
            System.out.println("Number 1:");
            nber1=choic.nextDouble();
            System.out.println("Number 2:");
             nber2=choic.nextDouble();
             answer=nber1*100/nber2;
             System.out.print("The answer is:\t");
             System.out.println(answer);
        break;
        case 13:
             //ln
            System.out.println("Number:");
        nber1=choic.nextDouble();
        answer=Math.log10(nber1);
        System.out.print("The answer is:\t");
        System.out.println(answer);
        break;
        case 14:
             //x2
            System.out.println("Number:");
            nber1=choic.nextDouble();
            answer=Math.pow(nber1, 2);
            System.out.print("The answer is:\t");
            System.out.println(answer);
        break;
        case 15:
             //x3
            System.out.println("Number:");
            nber1=choic.nextDouble();
            answer=Math.pow(nber1, 3);
            System.out.print("The answer is:\t");
            System.out.println(answer);
        break;
        default:
             //message outof choice
            System.out.println("Choice Not Listed, Try Again...");
        break;
     }
     }
   
   }
    public static void main(String[] args) {
        
    
        
        
        System.out.println("1--->Addition:");
        System.out.println("2--->Division:");
        System.out.println("3--->Multiplication:");
        System.out.println("4--->Substraction:");
        System.out.println("5--->Square Root:");
        System.out.println("6--->Power or Exponent:");
        System.out.println("7--->Modulo:");
        System.out.println("8--->Log:");
        System.out.println("9--->Cos:");
        System.out.println("10--->sin:");
        System.out.println("11--->Tan:");
        System.out.println("12--->Percentage or %:");
        System.out.println("13--->Ln:");
        System.out.println("14--->X2:");
        System.out.println("15--->X3:");
     Calculator callfx=new Calculator();
     callfx.calculate();
         
    }
    
}
