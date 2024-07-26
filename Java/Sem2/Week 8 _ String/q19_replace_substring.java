import java.util.Scanner;

public class q19_replace_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("Enter the string to be replaced and to replace : ");
        String subStrToBeReplaced = sc.next();
        String subStrToReplace = sc.next();

        String newStr = str.replace(subStrToBeReplaced, subStrToReplace);

        System.out.println(str);
        System.out.println(newStr);
        sc.close();
    }
}