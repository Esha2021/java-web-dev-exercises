package restaurantmenu;

import java.util.Objects;

public class Menuitem {

    private String itemName;
    private Double itemPrice;
    private String itemDescription;
    private String itemCategory;
    private boolean isItemNew;

    public Menuitem(String itemName,Double itemPrice,String itemDescription,String itemCategory,boolean isItemNew){
         this.itemName = itemName;
         this.itemPrice= itemPrice;
         this.itemDescription=itemDescription;
         this.itemCategory=itemCategory;
         this.isItemNew = isItemNew;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public boolean isItemNew() {
        return isItemNew;
    }

    public void setItemNew(boolean itemNew) {
        isItemNew = itemNew;
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

    @Override
    public String toString() {
        return "Menuitem{" +
                "itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemCategory='" + itemCategory + '\'' +
                ", isItemNew=" + isItemNew +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menuitem menuitem = (Menuitem) o;
        return Objects.equals(itemDescription, menuitem.itemDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemDescription);
    }

}
