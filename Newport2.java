public class Newport2 {
    //this is a method
    static void myMethod(){
        //code should be executed
        System.out.println("I just got executed");
    }


    static void myMethod2(String fname){
        System.out.println(fname+ " Refsnes");

    }

    static void myMethod3(String frname,int age){
        System.out.println(frname+" is "+age);
    }

    static int myMethod4(int x ){
        return 4+x;
    }

    static int myMethod5(int x,int y){
        return x+y;
    }

    static void checkAge(int age){
        //if age is less than 18,print "access denied"
        if (age<18){
            System.out.println("access Denied for boot");
        }
        else{
            System.out.println("you are allow to vote for 2024 election");
        }
    }


    public static void main(String[] args) {
        int a;
//        myMethod();
//        myMethod2("Robin");
//        myMethod3("Niroj",22);
//        System.out.println(myMethod4(33));
//        System.out.println(myMethod5(44,2));
//        checkAge(44);

    }



}
