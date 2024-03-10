public class Newport5_3 {
    public void fullThrottle(){
        System.out.println("the car is going as fast as it can");
    }

    public void speed(String maxSpeed){
        System.out.println("max speed is: "+maxSpeed);
    }



    public static void main(String[] args) {
        Newport5_3 myCar = new Newport5_3();
        myCar.fullThrottle();
        myCar.speed("300Kmph");

    }
}
