import java.util.Scanner;

public class Main {
    public static String restoreString(String s, int[] indices) {
        char[] arr_s = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < s.length() - 1 - i; j++) {
                if (indices[j] > indices[j + 1]) {
                    int temp_i;
                    char temp_s;
                    temp_i = indices[j + 1];
                    temp_s = arr_s[j + 1];
                    indices[j + 1] = indices[j];
                    arr_s[j + 1] = arr_s[j];
                    indices[j] = temp_i;
                    arr_s[j] = temp_s;
                }
            }
        }

        s = String.copyValueOf(arr_s);
        return s;

    }

    public static boolean isPalindrome(int x) {
        //                          121
        int vosv = 0;
        while (x > vosv) {
            // 1 > 1
            vosv = vosv * 10 + x % 10;
            // r= 12
            x /= 10;
            // x = 1
        }
        return x == vosv || x == vosv / 10;

    }
    public static int numberOfSteps(int num) {
        if (num <= 0) {
            return num;
        }
        if (num % 2 == 0) {
            return 1 + numberOfSteps(num = num / 2);
        } else {
            return 1 + numberOfSteps(num - 1);
        }

    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str = "";
        String str2 = "";

        for (int i = 0; i < word1.length; i++) {
            str = str.concat(word1[i]);
        }

        for (int i = 0; i < word2.length; i++) {
            str2 = str2.concat(word2[i]);
        }

        if (str != null && str2 != null && str.equals(str2)) {
            return true;
        } else {
            return false;
        }

    }

    public static int sumOddLengthSubarrays(int[] arr) {

        int sum = 0;
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            for (int j = i; j < l; j = j + 2) {
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
            }
        }
        return sum;

    }

    public int[] sumZero(int n) {
        int[] v = new int[n];
        for(int i=0;i<n;i++)
            v[i]= 2*i - n + 1;
        return v;
    }


    public static void main(String[] args) {

        //        try{
//            Scanner in = new Scanner(System.in);
//            int x = in.nextInt();
//            if(x>=30){
//                throw new Exception("Число х должно быть меньше 30");
//            }
//        }
//        catch(Exception ex){
//            System.out.println(ex.getMessage());
//        }


    }
}
