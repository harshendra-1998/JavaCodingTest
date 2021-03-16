import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Name = scan.nextLine();
        int year_of_graduation = scan.nextInt();
        System.out.println("Name:- "+ Name);
        System.out.println("Year Of Graduation:- "+ year_of_graduation);
    }
}
