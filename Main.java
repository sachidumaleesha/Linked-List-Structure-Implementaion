// Implemet stack with the hhelp of listlist Data Structure

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    linkList l = new linkList();

    for (int i = 0; i < 5; i++) {
      System.err.println("Enter a number: ");
      l.insertFirst(scanner.nextInt());
    }

    scanner.close();

  }
}