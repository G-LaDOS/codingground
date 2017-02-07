public class Item {
    private String StackSize;
    private int Health;
    private String name;

    public Item(String name){
        //this.name = name;
        new Registery(name);
    }
    
    public void setStackSize(String StackSize){
        this.StackSize = StackSize;
        
    }
    
    public void setHealth(int Health){
        this.Health = Health;
    }
}
