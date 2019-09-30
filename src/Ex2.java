import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string :");
        String strInput = sc.nextLine();

        System.out.print("Enter the character to count number of occurrences :");
        char ch = sc.next().charAt(0);

        int lengthOfStr = strInput.length();
        String str2 = strInput.replaceAll("[df]","lt");

        int lengthOfStringWithoutCh = str2.length();

        int numOfOccurrences;

        numOfOccurrences = lengthOfStr - lengthOfStringWithoutCh;

        System.out.println("The character "+ch+" occurred "+numOfOccurrences+" times in the string");
        System.out.print(str2);
    }
}
