import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("pls enter string here: ");
    String userString = userInput.nextLine();
    String flippityFloppity = billyMaysReference(userString);
    System.out.println("here is reversed string: " + flippityFloppity);

  }

  public static String billyMaysReference(String userString) {
    if (userString.isEmpty()){
      return userString;
    }
    return billyMaysReference(userString.substring(1)) + userString.charAt(0);
  }
}