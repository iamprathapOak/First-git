 import java.util.Scanner;
import java.io.*;

class Employee {
    String name;
    int id;
    byte age;
    String experience;

    Employee(String name, int id, byte age, String experience) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.experience = experience;
    }

    public void show() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Id : " + id);
        System.out.println("Employee Age : " + age);
        System.out.println("Employee Experience : " + experience);
    }
}

 public class Organization1 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        try {
            Employee[] one = new Employee[2];

            for (int i =0;i < one.length;i++) {

                System.out.println("Enter Name");
                String na = sc.nextLine();

                System.out.println("Enter Id");
                int st = sc.nextInt();

                System.out.println("Enter Age");
                byte a = sc.nextByte();
                sc.nextLine();   

                System.out.println("Experience");
                String ex = sc.nextLine();

                one[i] = new Employee(na, st, a, ex);
            }

            System.out.println("____Employee Details_____");

            for (int i =0;i< one.length;i++) {
                one[i].show();
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}