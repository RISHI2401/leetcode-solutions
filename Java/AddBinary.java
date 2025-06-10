
public class AddBinary {
    public static String AddBinary(String  a, String b){
        StringBuilder result = new StringBuilder();
        int carry = 0;

        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0){
            int digit_a = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digit_b = (j >= 0) ? b.charAt(j) - '0' : 0;

            int total = digit_a + digit_b + carry;

            result.insert(0, total % 2);

            carry = total / 2;

            i-=1;
            j-=1;
        }
        return (result.length() > 0) ? result.toString() : "0";
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";

        System.out.println(AddBinary(a, b));
    }
}
