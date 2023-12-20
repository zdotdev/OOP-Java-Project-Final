import java.io.IOException;
import java.util.Scanner;

class Encapsulation {
  private String secretMessage;

  // Getter
  public String getSecretMessage() { return this.secretMessage; }

  // Setter
  public void setSecretMessage(String secretMessage) {
    this.secretMessage = secretMessage;
  }

  public static void run() {
    Scanner scanner = new Scanner(System.in);
    Encapsulation encapsulation = new Encapsulation();

    System.out.println(
        "Welcome to the thrilling world of Java encapsulation! Think of it as a treasure chest. The class is the chest, and the instance variables are the treasures inside the chest. Encapsulation is like a protective shell that safeguards the treasures, ensuring they're not mishandled or misused.");
    System.out.println("Here's how it looks:\n");
    System.out.println("class Encapsulation {");
    System.out.println(" private String secretMessage;");
    System.out.println("}");
    pressAnyKeyToContinue();
    clearConsole();

    System.out.println(
        "Now, to access the treasure chest. We'll need to create getter and setter methods. These are like the keys to the chest, allowing us to access the treasures inside.");
    System.out.println("Here's how it looks:\n");
    System.out.println("class Encapsulation {");
    System.out.println(" private String secretMessage;");
    System.out.println(" // Getter");
    System.out.println(" public String getSecretMessage() {");
    System.out.println("  return this.secretMessage;");
    System.out.println(" }");
    System.out.println(" // Setter");
    System.out.println(" public void setSecretMessage(String secretMessage) {");
    System.out.println("  this.secretMessage = secretMessage;");
    System.out.println(" }");
    System.out.println("}");

    pressAnyKeyToContinue();
    clearConsole();
    System.out.println(
        "Now, let's do the instantiation. We need to create an instance of Encapsulation and call the getter and setter methods.");
    System.out.println("Here's how it looks:\n");
    System.out.println("public class Main {");
    System.out.println(" public static void main(String[] args) {");
    System.out.println("  Encapsulation encapsulation = new Encapsulation();");
    System.out.println(
        "  encapsulation.setSecretMessage(\"Hello, Encapsulation!\");");
    System.out.println(
        "  System.out.println(encapsulation.getSecretMessage());");
    System.out.println(" }");
    System.out.println("}");
    System.out.println(
        "Lets set a value for the secretMessage, complete the code below\n");

    String secretMessageUser = "";
    while (!secretMessageUser.endsWith("\");")) {
      System.out.print("encapsulation.setSecretMessage(\"");
      secretMessageUser = scanner.nextLine();
    }
    encapsulation.setSecretMessage(
        secretMessageUser.substring(0, secretMessageUser.length() - 3));
    System.out.println("\nGreat! That is correct. Now run the getter function");

    String setSecretMessageUser = "";
    while (!setSecretMessageUser.equals("encapsulation.getSecretMessage();")) {
      System.out.print("Code: ");
      setSecretMessageUser = scanner.nextLine();
    }
    System.out.println("\nYour secret message is: ");
    System.out.println(encapsulation.getSecretMessage());
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
