public class Newport3 {
    static int plusMethod(int x,int y){
        return x+y;
    }
    static double plusMethod(double x,double y){
        return x+y;
    }

    public static void main(String[] args) {
        double result=plusMethod(5.3,5.6);
        int result1=plusMethod(33,5);
        System.out.println(result+result1);
        System.out.println(result1);
    }
}
