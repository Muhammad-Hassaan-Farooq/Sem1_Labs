public class ThreeSort {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int max = Math.max(a,b);
        max = Math.max(max, c);

        int min = Math.min(a,b);
        min =  Math.min(min,c);

        int sum = a + b + c;
        int middle = sum - min -max ;


        System.out.println(min + " " + middle + " " + max);

    }
}
