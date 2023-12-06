package Dec5;
public class Dec5_0
{
    private String name= "are bhai how r u";
    public String getName(){
        return name;

    }
    public void setName(String newName){
        this.name=newName;
    }
    public static void main(String[]args){
        System.out.println("hello world");
        Dec5_0 myObj= new Dec5_0();
        System.out.println(myObj.getName());
        myObj.setName("gone");
        System.out.print(myObj.getName());

    }
        
    
}