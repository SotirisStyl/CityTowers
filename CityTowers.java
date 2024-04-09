/*
 * Author: Sotiris Stylianou (G20967429)
 * Email: sstylianou2@uclan.ac.uk
 * Description: Program builds a house with or without a roof
 * To compile the program: javac CityTowers.java
 * To run the program: java CityTowers
 */

import java.util.Scanner;

public class CityTowers {
    static void printRooftop (int width)                                                                                /* Function of the program */
    {
        for (int i = 1; i<=width; i++) {                                                                                /* Prints the roof */
            for (int j = i; j < width; j++)
                System.out.print(" ");
            for (int a=0; a<i; a++)
                System.out.print("~ ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the width of the tower (3 or wider):");                                                /*  Program reads the values of width and height */
        int width = scan.nextInt();
        System.out.println("Give the height of the tower (3 or higher):");
        int height = scan.nextInt();
        if (width <= 3 || height <= 3)                                                                                  /*  Program check if either the value of width or height is less than 3 */
            System.out.println("Both the width and the height must be 3 or larger.");
        else{                                                                                                           /*  If value of width and height are more than 3 then program ask you if you want roof or no */
            System.out.println("Would you like to draw a rooftop on your tower?");
            System.out.println("Please type [1] for Yes or [0] for No:");
            int decision = scan.nextInt();
            System.out.println("Drawing your City Tower:");


            if (decision == 0) {                                                                                    /*  If you do not want a roof then the program does the code in lines 27 - 38 */
                for (int i = 0; i < width; i++)
                    System.out.print("| ");
                for (int i = 0; i < height - 2; i++) {
                    System.out.print("\n" + "|");
                    for (int j = 0; j < width - 2; j++)
                        System.out.print("  ");
                    System.out.print(" |");
                }
                System.out.println();
                for (int i = 0; i < width; i++)
                    System.out.print("| ");
                System.out.println("\n"+"The width of the tower is: " + width + " and its total height including the rooftop is: " + height);
            }
            if (decision == 1) {                                                                                    /* If you want a roof then the program does the code in line 40 - 58 */
                printRooftop(width);
                for (int d = 0; d < width; d++)
                    System.out.print("| ");
                for (int h = 0; h < height - 2; h++) {
                    System.out.print("\n" + "|");
                    for (int j = 0; j < width - 2; j++)
                        System.out.print("  ");
                    System.out.print(" |");
                }
                System.out.println();
                for (int g = 0; g < width; g++)
                    System.out.print("| ");
                System.out.println("\n"+"The width of the tower is: " + width + " and its total height including the rooftop is: " + (height+width));
            }

        }
    }
}