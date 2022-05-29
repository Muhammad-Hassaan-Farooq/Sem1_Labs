public class Distance {
    public static void main(String[] args){

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        int xsqr = x*x;
        int ysqr = y*y;

        int sum = xsqr + ysqr;
        double distance = Math.sqrt(sum);

        System.out.println("Distance from (" + x + "," + y + ") to the origin is:" + distance);


    }

}
