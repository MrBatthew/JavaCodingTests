//This challege is the next one

//7. Number reversal
 //       This one is a technical interview favorite. For a given input number, return the number in reverse. So, an input of 3956 should return 6593.


public class Java2 {

    static int reverseDigits(int n) {
        int revNum = 0;
        while (n > 0) {
            revNum = revNum * 10 + n % 10;
            n = n / 10;
        }
        return revNum;
    }

    public static void main(String[] args) {
        int num = 4562;
        System.out.println(reverseDigits(num));
    }

}
