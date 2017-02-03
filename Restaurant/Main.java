public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        Waiter John = new Waiter();
        John.setOrder("Pink Pancakes");
        John.setServeNumber(1);
        John.setIsPaid(true);
        John.orderUp();
        
        Waiter Mike = new Waiter();
        Mike.setOrder("All the food in the kitchen");
        Mike.setServeNumber(2);
        Mike.setIsPaid(false);
        Mike.orderUp();
        
        Chef Willy = new Chef("Willy", John.getOrder());
        Willy.greet();
        Willy.cook();
        
        Chef Bobby = new Chef("Bobby", Mike.getOrder());
        Bobby.greet();
        Bobby.cook();
        
     }
}
