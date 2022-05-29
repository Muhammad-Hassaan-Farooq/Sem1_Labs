public class ISBN {
    public static void main(String[] args){

        int Isbn = Integer.parseInt(args[0]);
        int d2 = Isbn % 10;
        int d3 = (Isbn/10) % 10;
        int d4 = (Isbn/100) % 10;
        int d5 = (Isbn/1000) % 10;
        int d6 = (Isbn/10000) % 10;
        int d7 = (Isbn/100000) % 10;
        int d8 = (Isbn/1000000) % 10;
        int d9 = (Isbn/10000000) % 10;

        int checksum = (2*d2)+(3*d3)+(4*d4)+(5*d5)+(6*d6)+(7*d7)+(8*d8)+(9*d9);
        checksum = checksum % 11;
        checksum = 11 - checksum;

        System.out.println(Isbn + "" + checksum);

    }
}
