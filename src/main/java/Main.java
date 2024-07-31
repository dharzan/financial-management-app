package main.java;

import java.util.Scanner;

public class Main {

    private static FinanceManager financeManager = new FinanceManager();

    private static Scanner scanner = new Scanner(System.in);

    private static String username ="";

    private static User user = new User();


    public static void main(String args[]){

        boolean quit = false;

        while(!quit){

           
        System.out.println("0 - to shutdown\n" + "1 - to add an account\n" + "2 - get accounts\n");
            int action = scanner.nextInt();

            scanner.nextLine();

            switch(action){

                case 0:

                    System.out.println("\nShuting down");
                    quit=true;
                    break;

                case 1:

                    System.out.println("\nEnter username to add user:\n");

                    username = scanner.next();

                    
                    user.setUsername(username);
                    financeManager.addUser(user);
                    break;

                case 2: 

                //log in option

                case 3:

                // log out

                case 4:

                //get number of accounts

                    System.out.println("\nEnter username ");
                    username = scanner.next();

                    user.getUsername();


                case 6:

                //switch through accounts

                case 5:

                // check balance of an account 


                case 7:

                // sign up
                
            }

        }

    }


    
}
