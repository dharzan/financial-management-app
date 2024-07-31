package main.java;

import java.util.Scanner;

public class Main {

    private static FinanceManager financeManager = new FinanceManager();

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String args[]){

        boolean quit = false;

        while(!quit){

            System.out.println("\nEnter action: (5 to show available actions)");
            int action = scanner.nextInt();

            scanner.nextLine();

            switch(action){

                case 0:

                    System.out.println("\nShuting down");
                    quit=true;
                    break;

                case 1:

                    String username = scanner.next();

                    User user = new User(username);
                    
                    
                    financeManager.addUser(user);
                    break;


                case 5:

                    printActions();

                break;
            }

        }

    }

    private static void printActions() {
      
        
        System.out.println("0 - to shutdown\n" + "1 - to add an account\n" + "5 - to print a list of available actions");

        System.out.println("Choose your action:");
    }
    
}
