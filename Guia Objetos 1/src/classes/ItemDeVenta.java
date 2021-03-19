package classes;

public class ItemDeVenta {
    private int id;
    private String descript;
    private int amount;
    private double unitPrice;

    public ItemDeVenta(int id, String descript, int amount, double unitPrice) {
        this.id = id;
        this.descript = descript;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getunitPrice() {
        return unitPrice;
    }

    public void setunitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public double totalPrice(){
        return unitPrice * amount;
    }

    public void showItem(){
        System.out.println ("ItemVenta [ id = "+ this.id +", descripcion= "+this.descript+", cantidad= "+this.amount+", pUnitario= "+this.unitPrice+", pTotal: "+totalPrice()+"]");
    }

}
