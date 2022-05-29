public class Stats3 {
    public static void main(String[] args){
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        double avg = (a + b + c)/3;

        double max1 = Math.max(a, b);
        double max = Math.max(max1,c);
        System.out.println();
        double min1 = Math.min(a,b);
        double min = Math.min(min1,c);

        System.out.println("Average = " + avg);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);




    }
}
