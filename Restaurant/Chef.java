public class Chef{
    private String name;
    private String order;
    
    Chef(String Id, String order){
        name = Id;
        this.order = order;
        
    }
    

    public void greet(){
        System.out.println("Hello I am " + name + ".");
    }
    
    public void cook(){
        System.out.println("I will begin making " + order + ".");
    }
    
    
}
