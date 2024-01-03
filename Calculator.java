//scans for user input 
import java.util.Scanner;

public class Calculator {

public Calculator() {
}

//adds two intergars and retuns the sum
public int Add(int One, int Two) {
  int sum = One + Two; 
  System.out.println(sum);
  return sum; 
}
//subtracts two intergars and returns result 
public int Sub(int One, int Two) {
  int result = One - Two; 
  System.out.println(result);
  return result; 
}
//multiplies two intergars and returns result 
public int Multiply(int One, int Two) {
  int result = One * Two; 
  System.out.println(result);
  return result; 
}
//divides two intergars and returns result 
public int Divide(int One, int Two) {
  int result = One / Two; 
  System.out.println(result);
  return result; 
}
//finds the remainder of two intergars
public int Modulos(int One, int Two) {
  int result = One % Two; 
  System.out.println(result); 
  return result; 
}

public static void main(String[] args) {
  Calculator testCal = new Calculator(); 



  //created to collect user input 
  Scanner sc = new Scanner(System.in);
  

  //user input for first number
  int i = 0; 
  while (i == 0 || i > 250) {
    System.out.println("Enter a whole number between 1 and 250!"); 
    //stores user input in a varible 
    i = sc.nextInt(); 
  }
  System.out.println("Entered number is " + i); 
  //user input for second number
  int j = 0; 
  while (j == 0 || j > 250) {
    System.out.println("Enter a second whole number between 1 and 250!"); 
    j = sc.nextInt(); 
  }
  System.out.println("Entered number is " + j); 
  System.out.println("below you find the sum and products of " + i + " and " + j + "!");
  testCal.Add(i, j); 
  testCal.Multiply(i, j);
  }
}