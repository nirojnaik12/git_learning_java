import java.util.Arrays;
public class Newport4 {
    //the programme is about the multi array loop
    public static void main(String[] args) {
        int[][] myInteger={{3,4,5},{2,6,7,66},{8,99,9},{5,3,2}};
        for (int[] ints : myInteger) {
            System.out.println(Arrays.toString(ints));
            for (int j = 0; j < ints.length; j++) {
                System.out.println(ints[j]);
            }
        }
        int[] mySoloInteger={3,4,6,23,6,66};
//        for (int ints:mySoloInteger){
//            System.out.println(ints);
//        }

        int[][] myMultiInteger={{3,4,6},{23,6,66}};
        for (int[] intss:myMultiInteger){
            System.out.println(Arrays.toString(intss));
        }

//        System.out.println(Arrays.toString(myMultiInteger[1]));
//        System.out.println(Arrays.toString(mySoloInteger));
    }
}
