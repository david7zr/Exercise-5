package exercise;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main{

    public static void main (String[] args){

        //We are going to create variables and scan entrance

        Scanner entrance = new Scanner(System.in);
        float participation, first_midterm_exam, second_midterm_exam, final_exam, total;

        // We get every score from each value

        System.out.print("Insert score of participation: ");
        participation = entrance.nextFloat();

        System.out.print("Insert score of first midterm exam: ");
        first_midterm_exam = entrance.nextFloat();

        System.out.print("Insert score of second midterm exam: ");
        second_midterm_exam = entrance.nextFloat();

        System.out.print("Insert score of final exam: ");
        final_exam = entrance.nextFloat();

        // We are going to get the average of each score.

        participation *= 0.10f;
        first_midterm_exam *= 0.25f;
        second_midterm_exam *= 0.25f;
        final_exam *= 0.40f;

        // We are going to print the total of academic score.

        total = participation+first_midterm_exam+second_midterm_exam+final_exam;
        System.out.println("Final score: " +total);
    }
}