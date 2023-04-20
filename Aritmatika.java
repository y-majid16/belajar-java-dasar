public class Aritmatika {
    public static void main(String[] args) {
        // int result = 2 + 3;
        // System.out.println("2 + 3 = " + result);

        // int original_result = result;

        // result = result - 1;
        // System.out.println(original_result + " - 1 = " + result);
        // original_result = result;

        // result = result * 2;
        // System.out.println(original_result + " * 2 = "+ result);
        // original_result = result;

        // result = result / 2;
        // System.out.println(original_result+ " / 2 = " + result);
        // original_result = result;

        // result = result + 6;
        // System.out.println(original_result + " + 6 = " + result);
        // original_result = result;
        
        // result = result % 7;
        // System.out.println(original_result + " % 7 = " + result);

        // Augment Assignment

        int result = 20 ;
        result += 10;
        System.out.println(result);

        result -=20;
        System.out.println(result);

        result *=2;
        System.out.println(result);


        // Operator Bitwise

        int bitmask = 0x000F;
        int val = 0x2222;

        System.out.println(val & bitmask);

    }    
}
