import java.util.Scanner;
class Student {
    public static void main(String[] args) {
        int roll;
        String name;
        float marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name : ");
        name=sc.nextLine();
        System.out.println("Enter your roll no.: ");
        roll=sc.nextInt();
        System.out.println("Enter your marks : ");
        marks=sc.nextFloat();
        System.out.println("Name: "+name+"\nRoll No.:"+roll+"\nMarks :"+marks);  

            }
}
