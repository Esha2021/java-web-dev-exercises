package restaurantmenu;

public class Menuitem {

    private Double itemPrice;
    private String itemDescription;
    private String itemCategory;
    private String itemChangeInfo;
    public Menuitem(Double itemPrice,String itemDescription,String itemCategory,String itemChangeInfo){
         this.itemPrice= itemPrice;
         this.itemDescription=itemDescription;
         this.itemCategory=itemCategory;
         this.itemChangeInfo=itemChangeInfo;
     }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getItemChangeInfo() {
        return itemChangeInfo;
    }

    public void setItemChangeInfo(String itemChangeInfo) {
        this.itemChangeInfo = itemChangeInfo;
    }











}
