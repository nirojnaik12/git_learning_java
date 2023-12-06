public class Main {
    int x,y,z;
    public void myMethod(){
        System.out.println("lol");
    }

    public static void main(String[] args) {
        Main myObj=new Main();
        myObj.myMethod();
        myObj.x=12;
        System.out.println(myObj.x);
    }
}
