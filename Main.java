import static java.lang.System.exit;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    String[] options = {"0 - Exit", "1 - Method Overriding",
                        "2 - Encapsulation"};
    Scanner scanner = new Scanner(System.in);
    int option = 1;
    clearConsole();
    while (option != 0) {
      System.out.println("MAIN MENU");
      printMenu(options);
      try {
        option = scanner.nextInt();
        switch (option) {
        case 0:
          exit(0);
          break;
        case 1:
          option1(scanner);
          break;
        case 2:
          option2(scanner);
          break;
        }
        clearConsole();
      } catch (InputMismatchException ex) {
        clearConsole();
        System.out.println("Please enter an integer value between 0 and " +
                           options.length);
        scanner.next();
      } catch (Exception ex) {
        clearConsole();
        System.out.println("An unexpected error happened. Please try again");
        clearConsole();
      }
    }
  }

  public static void printMenu(String[] options) {
    for (String option : options) {
      System.out.println(option);
    }
    System.out.print("Choose your option : ");
  }

  private static void option1(Scanner scanner) {
    clearConsole();
    while (true) {
      clearConsole();

      MethodOverriding.run();

      System.out.println("\n1 - Run Again");
      System.out.println("0 - Back");
      int choice = scanner.nextInt();
      scanner.nextLine();
      if (choice == 0) {
        break;
      }
    }
  }

  private static void option2(Scanner scanner) {
    clearConsole();
    while (true) {
      clearConsole();
      Encapsulation.run();
      System.out.println("\n1 - Run Again");
      System.out.println("0 - Back");
      int choice = scanner.nextInt();
      scanner.nextLine();
      if (choice == 0) {
        break;
      }
    }
  }

  public static void clearConsole() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
