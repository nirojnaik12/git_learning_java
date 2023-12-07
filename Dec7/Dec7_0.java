class Dec7_0{
    private String name;
    public String getName(){
        return name;

    }
    public void setName(String newName){
        this.name=newName;
    }
    public static void main(String[] args) {
        Dec7_0 myObj= new Dec7_0();
        System.out.println("hello world");
        myObj.setName("robin");
        System.out.println(myObj.getName());

    }
}