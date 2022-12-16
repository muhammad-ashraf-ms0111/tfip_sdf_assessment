package Calculate;

import java.util. *;

public class Main{

  public static void main(String[] args) {
    System.out.println("Welcome.");
    char operator;
    Double number1, number2, result;
    Scanner input = new Scanner(System.in);
    boolean stop = false;

    while(!stop){
    System.out.println("Choose an operator: +, -, *, / or =(to exit)");
    operator = input.next().charAt(0);

    if (operator == '='){
      stop = true;
      System.out.println("exit");
    } else {
    
    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();

    switch (operator) {

      
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;


      default:
        System.out.println("Invalid operator!");
        break;
    } 
  }
  
}
input.close();
System.out.println("Bye bye");
  }
}


