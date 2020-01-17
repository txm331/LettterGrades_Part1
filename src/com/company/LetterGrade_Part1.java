/*
--------------------------------------------
Tim McCreesh
IST331-Section 001
Lab1-Part1
Converting numerical grades to a letter grade
1-17-19
---------------------------------------------
*/

package com.company;

import java.util.Scanner;

public class LetterGrade_Part1
{

    public static void main(String[] args)
    {

        Scanner scnr = new Scanner(System.in);
        double grades = 0;

        //loop for testing different letter grades, until -1 is entered.
        while(grades != -1)
        {
            try
            {
                System.out.println("Welcome to the student grade book. Enter a grade.");
                grades = scnr.nextDouble();

                //checks for valid input.
                if ((grades > 100) || (grades < 0))
                {
                    System.out.println("Invalid input try another value.");
                }

                //checks for letter grade A.
                else if ((grades <= 100) && (grades >= 93.0000))
                {
                    System.out.println("You received an A.");
                }

                //checks for letter grade A-.
                else if ((grades <= 92.9999) && (grades >= 90.0000))
                {
                    System.out.println("You received an A-.");
                }

                //checks for letter grade B+
                else if ((grades <= 89.9999) && (grades >= 87.0000))
                {
                    System.out.println("You received a B+.");
                }

                //checks for letter grade B.
                else if ((grades <= 86.9999) && (grades >= 83.0000))
                {
                    System.out.println("You received a B.");
                }

                //checks for letter grade B-
                else if ((grades <= 82.9999) && (grades >= 80.0000))
                {
                    System.out.println("You received a B-.");
                }

                //checks for letter grade C+.
                else if ((grades <= 79.9999) && (grades >= 75.0000))
                {
                    System.out.println("You received a C+.");
                }

                //checks for letter grade C.
                else if ((grades <= 74.9999) && (grades >= 70.0000))
                {
                    System.out.println("You received a C.");
                }
                //checks for letter grade D.
                else if ((grades <= 69.9999) && (grades >= 60.0000))
                {
                    System.out.println("You received a D.");
                }

                //checks for letter grade F.
                else if ((grades <= 59.9999) && (grades >= 0))
                {
                    System.out.println("You received an F.");
                }
            }

            //handles exception for invalid character input.
            catch (Exception e)
            {
                System.out.println(e);
                System.out.println("Invalid Input try another value.");
                return;
            }
        }
    }
}
