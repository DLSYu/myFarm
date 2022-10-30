public class Tools {
    private String name;
    private String description;
    private int amount;
    private boolean consumable;

    public Tools(String name, String description, int amount, boolean consumable){
        this.name= name;
        this.description= description;
        this.amount = amount;
        this.consumable= consumable;
    }

    public void consumeTool(){
        if(this.consumable && this.amount>0) {
            this.amount--;
        }
    }
}
