public class StringCharEx {
    public static void main(String args[]) {
        String a = "Palindrome";
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            System.out.println("char at " + i + " index is: " + c);
        }
        int [] y = {1,2,3,5,8,13};{
            for (int left = 0, right = y.length - 1; left < right; left++, right--)
            while( left < right ) {
                int temp = y[left];
                y[left] = y[right];
                y[right] = temp;
            }
        }
    }
}
