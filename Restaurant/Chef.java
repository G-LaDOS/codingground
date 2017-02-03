public class Chef{
    private String name;
    
    Chef(String Id){
        name = Id;
    }
    
    public void greet(){
        System.out.println("Hello I am " + name + ".");
    }
}
