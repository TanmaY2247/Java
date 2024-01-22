/*
                    *****Student grading system*****

Prequisites:
 * Project Description:
    
    In this project, create a student grading system that allows
    users to input student details and their scores for various
    subjects. The system should calculate the overall grade for
    each student based on their scores and display the result


1.Input student details: Ask the user to enter the student's
                        name, roll number, and the number of subjects.

2.Input subject scores: Based on the number of subjects
                    entered, ask the user to input the scores for each subject.
                    Calculate overall grade: Calculate the overall grade for the
                    student based on their scores. You can use a grading scale
                    such as A+, A, B, C, D, and F.

3.Display result: Display the student's name, roll number,
                subject-wise scores, and overall grade.

4.Repeat for multiple students Allow the user to input details
                        scores for multiple students, and display the results for each student.

*/


// importing the Scanner class
import java.util.Scanner;

// Student 'grading' class
public class grading 
{
 
    // Creating the Scanner class object.
    Scanner sc = new Scanner(System.in);
 
    // Two-dimensional array to store student information
    Student[][]students_info;
 
    // class to represent a student
    public class Student 
    {
        // Instance variables to store the entered data.
        String studentName;
        int roll_no;
        int no_of_subjects;
        int[] scores; // Array to store multiple subjects scores.
        int  Average;
 
        // Constructor to initialize a student
        public Student() 
        {
            Student_Details();
            Subject_Scores();
            Calculate_Percentile();
            // Display the result immediately
            // Display_Result();
        }
 
        //Declaration of methods
            // Getting student details
            public void Student_Details() 
            {
                // To get Student name
                System.out.print("\nEnter the name of student: ");
                studentName = sc.next();
    
                // To get Student's roll number
                System.out.print("Enter the Roll number of student: ");
                roll_no = sc.nextInt();
    
                // To get the number of subjects
                System.out.print("Enter the number of subjects: ");
                no_of_subjects = sc.nextInt();
            }
    
            // getting subject scores
            public void Subject_Scores() 
            {
                System.out.print("\nThere are " + no_of_subjects + " Subjects.");
                System.out.print("\n\nEnter marks for:  \n");
    
                scores = new int[no_of_subjects];
                
                // for loop to get scores for n number of subjects.
                for (int i = 0; i < no_of_subjects; i++) 
                {
                    System.out.print("Subject " + (i + 1) + ": ");
                    scores[i] = sc.nextInt();
                }
            }
    
            // Calculate percentile
            public void Calculate_Percentile() 
            {
                int totalScore = 0;
                for (int i = 0; i < no_of_subjects; i++) 
                {
                    totalScore += scores[i];
                }
                
                Average = totalScore / no_of_subjects;
            }
 
            // Display result for a student
            public void Display_Result() 
            {
                System.out.println("\nName of student: " + studentName + " | Roll number: " + roll_no);
    
                System.out.println("Subject-wise scores are: ");
                for (int i = 0; i < no_of_subjects; i++) 
                {
                    System.out.println("Subject " + (i + 1) + " Score is: " + scores[i]);
                }
    
                System.out.print("Overall grade: ");
                if ( Average >= 95) 
                {
                    System.out.println("A+");
                } 
                else if ( Average >= 85 && Average<95) 
                {
                    System.out.println("A");
                } 
                else if ( Average >= 70 && Average<85) 
                {
                    System.out.println("B");
                } 
                else if ( Average >= 65 && Average<70) 
                {
                    System.out.println("C");
                } 
                else if ( Average >= 40 && Average<65) 
                {
                    System.out.println("D");
                } 
                else 
                {
                    System.out.println("F");
                }
            }// end of display result method.
        // End of declaring methods    
    }// end of student class
 
    
    // Main method
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        grading obj = new grading();

        System.out.println("\n*********** This is the Student grading program *********");
 
        // Create an array to store students information
        obj.students_info = new grading.Student[10][1]; // Assuming a maximum of 10 students.
 
        int studentCount = 0; // Variable to keep track of the number of students
 
        while (true) 
        {
            // Create a new student object for each iteration
            grading.Student student = obj.new Student();

            obj.students_info[studentCount][0] = student; // Store the student object in the array
            studentCount++;
 
            System.out.print("\nDo you want to input details for another student? (yes/no): ");
            String choice = scanner.next();
 
            if (!choice.equalsIgnoreCase("yes")) 
            {
                break;
            }
        }
 
        /*Display results for all students when the user selects "no"
          and Display student details with overall grade. */
        if (studentCount > 0) 
        {
            System.out.println("\n**** Results for "+ studentCount + " students ****");
            
            //for loop to display students details
            for (int i = 0; i < studentCount; i++) 
            {
                obj.students_info[i][0].Display_Result();
            }
        } 
        else 
        {
            System.out.println("\nNo students details are entered. Exiting program.");
        }
        
        //closing scanner class
        scanner.close();
        
    }//end of main method
}//end of student 'grading' class
 

/*      Output 
 PS H:\Tanmay\3rd yr\6th sem\capabl\Projects\Student Grading System> cd "h:\Tanmay\3rd yr\6th sem\capabl\Projects\Student Grading System\" ; if ($?) { javac 
grading.java } ; if ($?) { java grading }

*********** This is the Student grading program *********

Enter the name of student: Student1
Enter the Roll number of student: 15
Enter the number of subjects: 5

There are 5 Subjects.

Enter marks for:     
Subject 1: 99
Subject 2: 98
Subject 3: 77
Subject 4: 65
Subject 5: 70

Do you want to input details for another student? (yes/no): yes

Enter the name of student: student2
Enter the Roll number of student: 5
Enter the number of subjects: 2

There are 2 Subjects.

Enter marks for:
Subject 1: 99
Subject 2: 70

Do you want to input details for another student? (yes/no): yes

Enter the name of student: Student3
Enter the Roll number of student: 05
Enter the number of subjects: 3

There are 3 Subjects.

Enter marks for:
Subject 1: 98
Subject 2: 89
Subject 3: 80

Do you want to input details for another student? (yes/no): no

**** Results for 3 students ****

Name of student: Student1 | Roll number: 15
Subject-wise scores are:
Subject 1 Score is: 99
Subject 2 Score is: 98
Subject 3 Score is: 77
Subject 4 Score is: 65
Subject 5 Score is: 70
Overall grade: B

Name of student: student2 | Roll number: 5
Subject-wise scores are:
Subject 1 Score is: 99
Subject 2 Score is: 70
Overall grade: B

Name of student: Student3 | Roll number: 5
Subject-wise scores are:
Subject 1 Score is: 98
Subject 2 Score is: 89
Subject 3 Score is: 80
Overall grade: A
PS H:\Tanmay\3rd yr\6th sem\capabl\Projects\Student Grading System> 
*/