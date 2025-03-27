abstract class Beverages{
    private void pour(int qty){
        System.out.println("pour"+qty+"ml of drink");
    }
    protected abstract void condiments();
    protected void stir(){}
    protected void serve(){
        System.out.println("seerve the drink through waiter");
        
    }
    protected void template(int qty){
        pour(qty);
        condiments();
        stir();
        serve();
    }
}
