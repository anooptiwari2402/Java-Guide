package variables;

public class VariableConvertion {

    public static void main(String[] args) {

        /**
         *  Order
         *
         *  byte > short > char > int > long > float > double
         */


        byte var1 = 4;
        short var2 = 32767;

        /**
         * short -> byte
         */
        byte var4 = (byte) var2;
        System.out.println("Short to byte conversion " +var4);

        /**
         * byte -> short
         */
        short var5 = (short) var1;
        System.out.println("Byte to short conversion "+var5);
    }
}
