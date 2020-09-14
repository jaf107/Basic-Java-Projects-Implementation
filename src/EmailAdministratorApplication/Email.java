package EmailAdministratorApplication;

import java.util.Random;
import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternativeEmail;
    private String departmentSuffix;
    private String universitySuffix = "du.ac.bd";

    // Constuctor to receive the first name and last name
    public Email(String firstname, String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
//        System.out.println("EMAIL CREATED: " + this.firstname + " " + this.lastname);

        // Call for a method asking for the department   return the department
        this.department = setDepartment();
//        System.out.println("Department: " + this.department);
        this.departmentSuffix = setDepartmentSuffix();

        // Call a method that returns a random password

        this.password = randomPassword(defaultPasswordLength);
//        System.out.println("Your Password is " +this.password);

        // Combine elements to generate an email
        this.email = this.firstname.toLowerCase() + "." + this.lastname.toLowerCase() + "@" + this.departmentSuffix +"." + this.universitySuffix;
//        System.out.println("Your email is : " + this.email );

    }

    // Ask for the department name
    private String setDepartment()
    {
        System.out.println("New Student :"+this.firstname +" "+this.lastname + "\nDepartment CODES:\n1 for IIT\n2 for CSE\n3 for EEE\n\nEnter the department code:");
        Scanner in = new Scanner(System.in);

        int deptChoice = in.nextInt();
//        int deptChoice = 1;
        if(deptChoice == 1)
            return "Software Engineering";
        else if(deptChoice == 2)
            return  "Computers Science and Engineering";
        else if(deptChoice == 3)
            return "Electrical and Electronics Engineering";
        else
            return "";
    }

    // Set department suffix
    private String setDepartmentSuffix()
    {
        if(this.department.equals( "Software Engineering"))
            return "iit";
        else if(this.department.equals("Computers Science and Engineering"))
            return "cse";
        else if(this.department.equals("Electrical and Electronics Engineering"))
            return "eee";
        else return "";
    }


    // Generate a random password
    private String randomPassword(int length)
    {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        String password = "";

        for(int i=0;i<length;i++)
        {
            int rand = (int) (Math.random() * passwordSet.length());

            password += passwordSet.charAt(rand);
        }
        return password;
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // Set the alternative Email
    public void setAlternativeEmail(String alternativeEmail) {
        this.alternativeEmail = alternativeEmail;
    }


    // Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    // GETTERS
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
    public String getAlternativeEmail() {
        return alternativeEmail;
    }
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "\n\nEmail{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", \npassword='" + password + '\'' +
                ", \ndepartment='" + department + '\'' +
                ", \nemail='" + email + '\'' +
                ", \nmailboxCapacity=" + mailboxCapacity +
//                ", \ndefaultPasswordLength=" + defaultPasswordLength +
                ", \nalternativeEmail='" + alternativeEmail + '\'' +
//                ", \ndepartmentSuffix='" + departmentSuffix + '\'' +
//                ", \nuniversitySuffix='" + universitySuffix + '\'' +
                '}';
    }
}
