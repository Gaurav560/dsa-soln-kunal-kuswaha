import java.util.Scanner;

public class q8_SolutionPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please input the string ro check whether it is a palindrome or not:");
        String input = sc.nextLine();
        if (checkPalindrome(input)){
            System.out.println(input+ " is a valid palindrome");
        }
        else{
            System.out.println(input+" is not a palindrome");
        }

    }
        public static boolean checkPalindrome(String str){
            int left=0; int right =str.length()-1;
            while(left<right){
                if (str.charAt(left)!=str.charAt(right)){
                    return  false;

                }
                left++;
                right--;

            } return true;
        }

}
