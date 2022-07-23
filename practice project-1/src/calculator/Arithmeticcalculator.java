package calculator;
import java.util.Scanner;
public class Arithmeticcalculator {

	public static void main(String[] args) {
        double a,b,output;
        char choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number1: ");
        a=sc.nextDouble();
        System.out.println("enter number2: ");
        b=sc.nextDouble();
        System.out.println("enter the arithmetic operators +,-,*,/");
        choice = sc.next().charAt(0);
        switch(choice) {
        case '+':output=a+b;
        System.out.println("the output is "+output);
        break;
        case '-':output=a-b;
        System.out.println("the output is "+output);
        break;
        case '*':output=a*b;
        System.out.println("the output is "+output);
        break;
        case '/':output=a/b;
        System.out.println("the output is "+output);
        break;
        default:System.out.println("you have entered the invalid operator");
        break;
        
        }
        
	}

}