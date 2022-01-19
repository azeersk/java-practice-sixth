import java.util.Scanner;

class student{
    int studentId;
    String name;
    int rollNo;
    public void SDetails(String name, int studentId, int rollNo){
        this.name = name;
        this.studentId = studentId;
        this.rollNo = rollNo;
        System.out.println("Student details: ");
    }
    public void Main(){
        System.out.println(studentId);
        System.out.println(name);
        System.out.println(rollNo);
    }
}


public class thisClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int id = input.nextInt();
        int roll = input.nextInt();
        student obj = new student();
        obj.SDetails(name,id,roll);
        obj.Main();
    }
}
