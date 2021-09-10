package restaurantmenu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Menu {

    private String itemName;
    private Date menuUpdateDt;
    private List<Menuitem> menuDetails;


    public static void main(String[] args) {
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Date getMenuUpdateDt() {
        return menuUpdateDt;
    }

    public void setMenuUpdateDt(Date menuUpdateDt) {
        this.menuUpdateDt = menuUpdateDt;
    }

    public  List<Menuitem> getMenuDetails() {
        return this.menuDetails;
    }

    public void setMenuDetails(List< Menuitem> menuDetails) {
        this.menuDetails = menuDetails;
    }
}
