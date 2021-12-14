/*
Title: MadLib Project 
Authors: Preston Jackson and Evan Barnes
Date: 12/14/21 
Course: APCSA 
Despcription: A project that focuses on creating madlibs using the JAVA String API 
Preconditions: 
Postconditions: 
*/
import java.util.Scanner;

public class MadLib
{
  public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in); 
 
    String riddle = "The <person> was making their way to the <location> when a dangerous <noun> attacked.";

    //Finds the start and end of the first input 
    int open = riddle.indexOf("<");
    int close = riddle.indexOf(">");

    //Creates a substring that is the word between the <> signs
    String change = riddle.substring(open + 1, close);

    //Prompts the user to input text of the type from the substring
    System.out.println("Enter " + change + ":");

    //calls for scanner class
    String userInput = sc.nextLine();

    //replaces the entire <> text with the users input
    riddle = riddle.replace((riddle.substring(open, close + 1)), userInput);

    //prints out all of the madlib until the end of the most recent user input
    System.out.println(riddle.substring(0,riddle.indexOf(userInput)+ userInput.length()));

    //same code two more times so that three inputs can be in the <>
    open = riddle.indexOf("<");

    close = riddle.indexOf(">");

    change = riddle.substring(open + 1, close);

    System.out.println("Enter " + change + ":");

    userInput = sc.nextLine();

    riddle = riddle.replace((riddle.substring(open, close + 1)), userInput);

    System.out.println(riddle.substring(0,riddle.indexOf(userInput)+ userInput.length()));

    open = riddle.indexOf("<");

    close = riddle.indexOf(">");

    change = riddle.substring(open + 1, close);

    System.out.println("Enter " + change + ":");

    userInput = sc.nextLine();

    riddle = riddle.replace((riddle.substring(open, close + 1)), userInput);

    //final print
    System.out.println(riddle);

    sc.close();
}
}
