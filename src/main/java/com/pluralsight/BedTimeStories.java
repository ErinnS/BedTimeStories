package com.pluralsight;
import java.io.*;
import java.util.Scanner;
public class BedTimeStories {

    public static void main(String[] args) {
        int userInput = 0;
        String user;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a number, 1)Goldilocks, 2)Hansel and 3)Gretel or Mary had a little lamb): ");
        userInput = myScanner.nextInt();


        if (userInput == 1)
            try {
                FileInputStream fis = new FileInputStream("src/main/resources/goldilocks.txt");
                Scanner myscanner = new Scanner(fis);


                while (myscanner.hasNextLine()) {
                    user = myscanner.nextLine();
                    System.out.println(user);
                }
                myscanner.close();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);


            }

        else if (userInput == 2) {
            try {
                FileInputStream fis = new FileInputStream("src/main/resources/hansel_and_gretel.txt");
                Scanner myscanner = new Scanner(fis);

                while (myscanner.hasNextLine()) {
                    user = myscanner.nextLine();
                    System.out.println(user);

                }
                myscanner.close();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);


            }

        } else if (userInput == 3) {
            try {
                FileInputStream fis = new FileInputStream("src/main/resources/mary_had_a_little_lamb.txt");
                Scanner myscanner = new Scanner(fis);

                while (myscanner.hasNextLine()) {
                    user = myscanner.nextLine();
                    System.out.println(user);

                }
                myscanner.close();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);


            }

        }

    }


    }