public class PalindromeNumber9 {
    public static void main(String[] args) {
        int x = 123321;

        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if ((x < 0) || ((x % 10 == 0) && (x != 0))) {
            return false;
        }

        int revNum = 0;
        while (x > revNum) {
            revNum = revNum * 10 + x % 10;
            x /= 10;
        }

        return (revNum == x) || (revNum / 10 == x);
    }
}
