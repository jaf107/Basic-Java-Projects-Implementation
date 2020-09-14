package StudentManagementSystem;

import java.util.Scanner;

public class Student {

    private String firstname;
    private String lastname;
    private int gradeYear;
//    private String courses[];
    private int studentID;
    private int tutionBalance;
    private static int costOfCourse = 600;

    // Prompt the student to give name and year
    public Student()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student first name:");
        this.firstname = in.nextLine();

        System.out.print("Enter Student last name:");
        this.lastname = in.nextLine();

        System.out.print("\n1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter Student class level:");
        this.gradeYear = in.nextInt();

        System.out.println(firstname + " " +lastname +  " " + gradeYear);








    }

    // Generate an ID

    // Enroll in courses

    // Check Balance

    // Pay Tution

    // See student status

    //
}
