package scanner;

import java.util.Scanner;

public class UserInputTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter a String");
            String userInput = scanner.nextLine();
            System.out.println("USER input is " + userInput);

        }
        catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
        finally
        {
            scanner.close();
        }
    }
}
