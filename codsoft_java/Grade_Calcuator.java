import java.util.Scanner;

public class Grade_Calcuator {
    public static void main(String[] args) {
        float a, b, c, d, e;
        String m, n, o, p,q;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Marks Obtained: ");
        System.out.print("Enter The First Subject: ");
        m = sc.next();
        System.out.print("Enter Marks in "+m+" : ");
        a = sc.nextFloat();
        System.out.print("Enter The Second Subject: ");
        n = sc.next();
        System.out.print("Enter Marks in "+n+" : ");
        b = sc.nextFloat();
        System.out.print("Enter The Third Subject: ");
        o = sc.next();
        System.out.print("Enter Marks in "+o+" : ");
        c = sc.nextFloat();
        System.out.print("Enter The Fourth Subject: ");
        p = sc.next();
        System.out.print("Enter Marks in "+p+" : ");
        d = sc.nextFloat();
        System.out.print("Enter The Fifth Subject: ");
        q = sc.next();
        System.out.print("Enter Marks in "+q+" : ");
        e = sc.nextFloat();
        float sum = a + b + c + d + e;
        System.out.println("Total Marks Obtained : " + sum);
        float avg = sum / 5;
        System.out.println("Average Percentage : " + avg + " %");
        if (avg >= 95) {
            System.out.println("Grade : A+");
        } else if (avg >= 90 && avg < 95) {
            System.out.println("Grade : A");
        } else if (avg >= 80 && avg < 90) {
            System.out.println("Grade : B");
        } else if (avg >= 70 && avg < 80) {
            System.out.println("Grade : C");
        } else if (avg >= 60 && avg < 70) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Poor Performance! ");
        }
    }
}
