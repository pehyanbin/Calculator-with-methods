import java.util.Scanner; 

public class Main {

  static double add(double num1, double num) {
    num1 += num;
    return num1; 
  }

  static double subtract(double num1, double num) {
    num1 -= num;
    return num1; 
  }

  static double multiply(double num1, double num) {
    num1 *= num;
    return num1; 
  }

  static double divide(double num1, double num) {
    num1 /= num; 
    return num1; 
  }
  
  public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);  

    int new_operation; 
    
    double num1; 
    System.out.println("Num 1 : ");
    num1 = Input.nextDouble(); 

    while(true) {
      System.out.println("Operation\n===========================================\n1. +\n2. -\n3. *\n4. /\n0. break\n");
      int operation = Input.nextInt(); 
      
      if(operation == 0) {
        break;
      }

      System.out.println("Num : "); 
      double num = Input.nextDouble(); 

      switch (operation) {
        case 1:
          num1 = add(num1, num); 
          System.out.println("\nOutput : "+ num1 + "\n"); 
          break;
        case 2:
          num1 = subtract(num1, num); 
          System.out.println("\nOutput : "+ num1 + "\n");
          break; 
        case 3:
          num1 = multiply(num1, num); 
          System.out.println("\nOutput : "+ num1 + "\n");
          break; 
        case 4:
          num1 = divide(num1, num); 
          System.out.println("\nOutput : "+ num1 + "\n");
          break; 
        default :
          System.out.println("Invalid Operation");
          System.out.println("\nOutput : "+ num1 + "\n");
          break; 
      }
    }
    System.out.println("\n\nOutput : "+ num1 + "\n");
    System.out.println("\nEnd Operation. \n\n\n"); 

    System.out.println("New operation ? (1/0)"); 
    new_operation = Input.nextInt(); 

    while (new_operation == 1) {
      System.out.println("Num 1 : ");
      num1 = Input.nextDouble(); 

      while(true) {
        System.out.println("Operation\n===========================================\n1. +\n2. -\n3. *\n4. /\n0. break\n");
        int operation = Input.nextInt(); 

        if(operation == 0) {
          break;
        }

        System.out.println("Num : "); 
        double num = Input.nextDouble(); 

        switch (operation) {
          case 1:
            num1 = add(num1, num); 
            System.out.println("\nOutput : "+ num1 + "\n"); 
            break;
          case 2:
            num1 = subtract(num1, num); 
            System.out.println("\nOutput : "+ num1 + "\n");
            break; 
          case 3:
            num1 = multiply(num1, num); 
            System.out.println("\nOutput : "+ num1 + "\n");
            break; 
          case 4:
            num1 = divide(num1, num); 
            System.out.println("\nOutput : "+ num1 + "\n");
            break; 
          default :
            System.out.println("Invalid Operation");
            System.out.println("\nOutput : "+ num1 + "\n");
            break; 
        }
      }
      System.out.println("\n\nOutput : "+ num1 + "\n");
      System.out.println("\nEnd Operation. \n\n\n"); 

      System.out.println("New operation ? (1/0)"); 
      new_operation = Input.nextInt();
    }
    System.out.println("\n\n\n\nEnd of process ");
  }
}