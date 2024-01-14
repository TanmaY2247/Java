//Java quiz game

//prequisites
/*
 *  1.Introduction to java  (done)
 *      -Display a welcoming message for the the Java quiz game.
 *      -Briefly explain that the quiz will cover basic Java concepts.
 * 
 *  2.JDK, JRE, JVM Overview:  (done)
 *      -Ask Straightforward questions about JDK, JRE, and JVM.
 *      -For example: "What does JDK stand for? a) Java Development Kit b) Java Runtime Environment c) Java Virtual Machine"
 * 
 *  3. Data Types and Code Flow: (done)
 *      -Present easy questions about Java data types and simple code outcomes.
 *      -For example: "What will be printed? int x = 5; double y = 2.5; System.out.println(x + y);"
 * 
 *  4.Decision Making Statements: (done)
 *      -Introduce basic if statements with clear conditions.
 *      -For example:"If it's raining, should you take an umbrella? a) Yes b) No" Move to straightforward if-else scenarios.
•           For example: "Is 10 greater than 5? a) Yes b) No"

    5.Scoring and Feedback: (done)
        -Keep it simple. Give one point for each correct answer. 
        -Provide encouraging feedback after each question.
 */

//importing the Scanner class
import java.util.Scanner;

//starting of class quiz1
public class quiz1
{
    public static void main(String[] args)
    {
            //Creating a scanner class object
            Scanner sc =new Scanner(System.in);

            //To store the points
            int score=0;

        //Introduction
            System.out.println("\n\n*********Swagat he aapka Quiz game me!*********");
            System.out.print("\n\nThis quiz will cover basic java concepts");   
        //End of Introduction

            System.out.print("\n\nLet's start then!! ");
            System.out.println("\n\n*******Phela Padav*******");

        //JDK, JRE, JVM Overview
            System.out.print("\n\nQuestion 1: What does JDK stand for?\n"
            + "           a)Java Development Kit \n           b)Java Runtime Environment \n           c)Java Virtual Machine");
                 
            System.out.print("\n\nEnter your answer: ");//Getting user input
            String choice=sc.nextLine();

            //If-else to choose if the selected option is correct or not.
            if(choice.equalsIgnoreCase("a"))
            {
                System.out.println("\nCorrect answer!!");
                System.out.println("+1 point");
                score+=1;
            }
            else
            {
                System.out.println("Wrong answer :(");
                
            }//End of if-else condition
        //End of JDK, JRE, JVM Overview block

        
        //Data Types and Code Flow
            System.out.println("\n*******Aagla Padav*******");
            System.out.println("\n\nQuestion 2: What will be printed?\n"
                                +"int x = 5; \ndouble y = 2.5; \nSystem.out.println(x + y)");
        
            System.out.print("\nEnter your answer: ");
            double ans=sc.nextDouble();

            //To check if the answer is correct or not.
            if(ans==7.5)
            {
                System.out.println("correct answer! ");
                System.out.println("+1 point\n\n");
                score+=1;
            }
            else
            {
                System.out.println("Wrong answer :(");
            }//end of if-else 
        //End of Data Types and Code Flow


        //Decision Making Statements block
            System.out.println("\n*******Aagla Padav*******");
            System.out.println("\nLet'see your IQ :)");
            System.out.println("Question 3: If it's raining, should you take an umbrella?\n"
                                        +"         a) Yes   b) No");
            System.out.print("Enter your decision: ");
            String ch=sc.next();

            if(ch.equals("a")||ch.equals("A"))
            {
                System.out.println("\nSAAT CRORE!!!!");
                System.out.println("+1 point :)");
                score+=1;
            }
            else
            {
            System.out.println("\n\naap Mumbai nahi aa sakte :( ");
            }
        //End of Decision Making Statements block


        //Scoring and Feedback block
            //to print the scores.
            System.out.print("\n\nYour Scores are(in points) : "+score);
        //End of Scoring and Feedback block
        
        //Closing the Scanner class.
        sc.close();
    }//end of main method

}//end of quiz1 class


/*******Output 1******
 * *********Swagat he aapka Quiz game me!*********


This quiz will cover basic java concepts

Let's start then!! 

*******Phela Padav*******


Question 1: What does JDK stand for?    
           a)Java Development Kit       
           b)Java Runtime Environment   
           c)Java Virtual Machine       

Enter your answer: a

Correct answer!!
+1 point

*******Aagla Padav*******


Question 2: What will be printed?
int x = 5;
double y = 2.5;
System.out.println(x + y)

Enter your answer: 7.5
correct answer! 
+1 point



*******Aagla Padav*******

Let'see your IQ :)
Question 3: If it's raining, should you take an umbrella?
         a) Yes   b) No
Enter your decision: a

SAAT CRORE!!!!
+1 point :)


Your Scores are(in points) : 3
PS H:\Tanmay\3rd yr\6th sem\capabl\Projects\Java Quiz Adventure> 
 



/*******Output 2******
 * 
 * *********Swagat he aapka Quiz game me!*********


This quiz will cover basic java concepts

Let's start then!!

*******Phela Padav*******


Question 1: What does JDK stand for?    
           a)Java Development Kit       
           b)Java Runtime Environment   
           c)Java Virtual Machine       

Enter your answer: a

Correct answer!!
+1 point

*******Aagla Padav*******


Question 2: What will be printed?
int x = 5;
double y = 2.5;
System.out.println(x + y)

Enter your answer: 7.5
correct answer! 
+1 point



*******Aagla Padav*******

Let'see your IQ :)
Question 3: If it's raining, should you take an umbrella?
         a) Yes   b) No
Enter your decision: b


aap Mumbai nahi aa sakte :(


Your Scores are(in points) : 2
PS H:\Tanmay\3rd yr\6th sem\capabl\Projects\Java Quiz Adventure> 
*/
