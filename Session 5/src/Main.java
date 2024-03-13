//import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(String str) {
        ListStack<Character> stack = new ListStack<>();

        for (int i=0; i<str.length(); i++) {
            stack.push(str.charAt(i));
        }

        for (int i=0; i<str.length(); i++){
            if (stack.pop() != str.charAt(i)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
       // Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter a words: ");
        //String str = scanner.nextLine();
        String str = " ";

        if (isPalindrome(str)) {
            System.out.println(str + " Is Palindrome");
        } else {
            System.out.println(str + " Is Not Palindrome");
        }

    }
}

