import java.io.IOException;
import java.util.Scanner;

class ParentClass {
  void show(String message) {
    System.out.println("Parent: " + message);
  }
}

class ChildClass extends ParentClass {
  void show(String message) {
    System.out.println("Child: " + message);
  }
}

class MethodOverriding {
  public static void run() {
    Scanner scanner = new Scanner(System.in);
    clearConsole();

    // INTRO
    System.out.println(
        "Welcome to the thrilling world of Java method overriding! Think of it as a grand party where the superclass is the host, and the subclass is the guest who decides to perform their own unique dance routine. The rules of this party are simple: the guest must follow the same basic steps as the host, but they can add their own unique twist to make their performance truly stand out");
    System.out.println("Here's how it looks:\n");
    System.out.println("class ParentClass {");
    System.out.println(
        "  void show() { System.out.println(\"Parent : Say Something\"); }");
    System.out.println("}");
    System.out.println("class ChildClass extends ParentClass {");
    System.out.println(
        "  void show() { System.out.println(\"Child : Say Something\"); }");
    System.out.println("}");
    pressAnyKeyToContinue();
    clearConsole();

    // MAKING PARENT AND CHILD CLASS
    System.out.println(
        "Now, let's get creative! What should we name our parent class?");

    System.out.println("Enter a name for the Parent Class:");
    String parentClassName = scanner.nextLine();
    parentClassName = scanner.nextLine();

    System.out.println("What should the Parent Class say?");
    String parentMessage = scanner.nextLine();

    System.out.println("Alright, let's name our child class");
    System.out.println("Enter a name for the Child Class:");
    String childClassName = scanner.nextLine();

    System.out.println("What should the Child Class say?");
    String childMessage = scanner.nextLine();

    // MAKING THE MAIN CLASS
    clearConsole();
    System.out.println(
        "Now, let's invite our guests to the party. The Main class should look like this:");
    System.out.println("public class Main {");
    System.out.println("  public static void main(String[] args) {");
    System.out.println("    ParentClass parent = new ParentClass();");
    System.out.println("    parent.show();");
    System.out.println("    ParentClass child = new ChildClass ();");
    System.out.println("    child.show();");
    System.out.println("  }");
    System.out.println("}");

    // PARENT INSTANTIATION
    System.out.println(
        "Now, let's do the parent instantiation. Change the <ParentClass> with your Parent Class Name");
    System.out.println("Clue: <ParentClass> parent = new <ParentClass>();");

    String codeParent = "";
    while (!codeParent.equals(parentClassName + " parent = new " +
        parentClassName + "();")) {
      System.out.print("Code: ");
      codeParent = scanner.nextLine();
    }
    System.out.println("\nGreat! This is correct " + codeParent);
    System.out.println("Now call the show() function\nClue: parent.show();");

    String codeParentShow = "";
    while (!codeParentShow.equals("parent.show();")) {
      System.out.print("Code: ");
      codeParentShow = scanner.nextLine();
    }

    // CHILD INSTANTIATION
    clearConsole();
    System.out.println(
        "Now, let's have the Child Class to the party. Change the <ChildClass> with your Child Class Name");
    System.out.println("Clue: <ChildClass> child = new <ChildClass>();");

    String codeChild = "";
    while (!codeChild.equals(childClassName + " child = new " +
        childClassName + "();")) {
      System.out.print("Code: ");
      codeChild = scanner.nextLine();
    }
    System.out.println("\nGreat! This is correct " + codeChild);
    System.out.println("Now run the show() function\n Clue: child.show();");
    String codeChildShow = "";
    while (!codeChildShow.equals("child.show();")) {
      System.out.print("Code: ");
      codeChildShow = scanner.nextLine();
    }

    // PRINT THE CODE
    clearConsole();
    System.out.println("Very Good, This is how your code looks like \n");
    System.out.println("class " + parentClassName + " {");
    System.out.println("  void show() {");
    System.out.println("    System.out.println(\"Parent: " + parentMessage +
        "\");");
    System.out.println("  }");
    System.out.println("}");
    System.out.println("class " + childClassName + " extends " +
        parentClassName + " {");
    System.out.println("  void show() {");
    System.out.println("    System.out.println(\"Child: " + childMessage +
        "\");");
    System.out.println("  }");
    System.out.println("}");
    System.out.println("public class Main {");
    System.out.println("  public static void main(String[] args) {");
    System.out.println("    " + parentClassName + " parent = new " +
        parentClassName + "();");
    System.out.println("    parent.show();");
    System.out.println("    " + parentClassName + " child = new " +
        childClassName + "();");
    System.out.println("    child.show();");

    while (true) {
      System.out.print("\nWould you like to run your code? type yes: ");
      String yes = scanner.nextLine();
      if (yes.equals("yes")) {
        break;
      } else {
        break;
      }
    }
    ParentClass parent = new ParentClass();
    parent.show(parentMessage);
    ParentClass child = new ChildClass();
    child.show(childMessage);
  }

  public static void pressAnyKeyToContinue() {
    System.out.println("Press any key to continue...");
    try {
      System.in.read();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void clearConsole() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
