import java.util.Scanner;
public class palindromeCheckUsingScanner{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the First String or Number");
        String srt1 = sc.nextLine();
        System.out.println("Please enter  the Second String or Number");
        String srt2 = sc.nextLine();
        String reverse= "";
        for(int i=srt2.length()-1; i>=0; i--){
            reverse = reverse+srt2.charAt(i);
        }
        if (srt1.equalsIgnoreCase(reverse)) {
            System.out.println("It's a palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}