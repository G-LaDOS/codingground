public class Registery {
    private String name;
    
    public void registerItem(String unlocalizedName){
       unlocalizedName = name;
    }
    
    public void init(){
        System.out.println(name + " is initialized\n");
    }
    
    
}
