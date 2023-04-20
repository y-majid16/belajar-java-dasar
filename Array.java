public class Array {
    public static void main(String[] args) {

        // String [] arrayName = {
        //     "Yaumul",
        //     "Majid",
        //     "Indonesia",
        // };

        // System.out.println(arrayName[3]);

        // Array Multidimensional

        // String [][] data = new String[3][3];

        // data[0][0] = "Yaumul";
        // data[0][1] = "Majid";
        // data[0][2] = "Indonesia";

        // data[1][0] = "Baji";
        // data[1][1] = "Bana";
        // data[1][2] = "Babia";

        // data[2][0] = "kaka";
        // data[2][1] = "kaki";
        // data[2][2] = "kaku";

        // System.out.println(data[1][1]);
         
        // Array Copy Java

        String[] name = {"Yaumul", "Majid", "Indonesia", "Programer"};
        String[] target = new String[4];

        System.arraycopy(name, 2, target, 1, 2);

        System.out.println(target[0]);
        System.out.println(target[1]);
        System.out.println(target[2]);
        System.out.println(target[3]);
    }
    
}
