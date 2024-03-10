import java.util.ArrayList;

public class Newport {
    public static void main(String[] args) {
//        float f1=33e4f;
//        double num1 =44e2d ;
//        System.out.println("hello world"+" "+num1);
//        widening operation in java
//        hello my name is niroj kumar naik
//        int myint= 33;
//        float myfloat= myint;
//        System.out.println(myfloat);
//        double mydouble=myfloat;
//        System.out.println(mydouble);
//        short myshort=(short) mydouble;
//        System.out.println(myshort);
//        String greatings="hello,my name is niroj kumar naik !";
//        System.out.println(greatings.toUpperCase());
//        System.out.println(greatings.length());
//        System.out.println(greatings.toLowerCase());
//        System.out.println(greatings.indexOf("naik"));
//        String respons="how are you";
//        System.out.println(greatings+" "+respons);
//        System.out.println(greatings.concat(respons));
//        String txt = "we are students \f learning \"java\" so after campus we hava a job in java industry";
//        System.out.println(txt);
//        System.out.println(Math.max(22,23));
//        int myNum1=Math.max(22,44);
//        System.out.println(myNum1);
//        System.out.println(Math.min(33,5));
//        System.out.println(Math.sqrt(144));
//        System.out.println(Math.abs(-3));
//        System.out.println(Math.random());
//        double myDouble=Math.random();
//        int randomNum=(int)(Math.random()*44);
//        System.out.println(randomNum);
//        System.out.println(Math.abs());
//        int myNum=22;
//        int yourNum=33;
//        int passNum=10;
//        if (myNum>yourNum){
//            System.out.println("i m the winner");
//
//        }
//
//        else if(myNum>passNum){
//            System.out.println("I M Passed");
//        }
//        else {
//            System.out.println("u r the winner");
//        }
//        String result=(myNum<passNum)?"you failed":"you passed";
//        String result2=(yourNum<passNum)?"you failed":"you passed";
//        System.out.println(result2);
//        int i=22;
//        int j=33;
//
//
//        switch (i){
//            case 11:
//                System.out.println(true);
//                break;
//
//            case 2:
//                System.out.println(false);
//                break;
//
//            case 66:
//                System.out.println("lol");
//
//            default:
//                System.out.println("the current stetment must not be recognised by cases");
//        }
//
//        int a=0;
//        while (a<7){
//            System.out.println(a);
//            a+=1;
//        }
//        for (int i=0; i<6;i++){
//            System.out.println("outer num "+i);
//            for (int j=0;j<4;j++){
//                System.out.print("inner num "+j);
//            }
//        int i=0;
//        do {
//            System.out.println(i);
//            i++;
//        }
//        while (i<5);

//
//        String[] cars={"volvo","BMW","Mazda","Ford"};
//        for (String i:cars){
//            System.out.println(i);
//        }
//        for(int i = 0; i<20;i++){
//
//            if (i==9){
//                continue;
//            }
//            System.out.println(i +" hello,world!");
//        }
//        char[] myChar = {'a','e','i','o','u'};
//        for (char i:myChar){
//            System.out.println(i);
//        }
//        System.out.println(myChar.length);
//        for (int i=0;i<myChar.length;i++){
//            System.out.println(myChar[i]);
//        }
//        int l=0;
//        int[][] myNumbers={{2,34,4,5,2,},{5,6,3,7,23}};
//        System.out.println(myNumbers[0]);
////        for (int[] j:myNumbers){
//            System.out.println(j);

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }


    }
}
