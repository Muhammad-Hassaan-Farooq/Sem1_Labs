public class Compute {
    public static void main(String[] args){

        int a = Integer.parseInt(args[0]) ;
        int b = Integer.parseInt(args[1]);

        int sum = a + b;
        int prod = a * b;

        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + prod);
    }
}
