package restaurantmenu;

import java.util.ArrayList;
import java.util.Date;
import restaurantmenu.Menuitem;


public class Menu {

    private ArrayList<Menuitem> menuDetails = new ArrayList<>();
    private Date menuUpdateDt;

    public Menu(){

    }

    public Date getMenuUpdateDt() {
        return menuUpdateDt;
    }

    public void setMenuUpdateDt(Date menuUpdateDt) {
        this.menuUpdateDt = menuUpdateDt;
    }

    public ArrayList<Menuitem> getMenuDetails() {
        return menuDetails;
    }

    public void setMenuDetails(ArrayList<Menuitem> menuDetails) {
        this.menuDetails = menuDetails;
    }

    @Override
    public String toString() {
        return "Menu{" +
                ", menuUpdateDt=" + menuUpdateDt +
                ", menuDetails=" + menuDetails +
                '}';
    }

    public void addMenu(Date menuUpdateDt, ArrayList<Menuitem> menuDetails){
        this.menuUpdateDt = menuUpdateDt;
        this.menuDetails = menuDetails;
    }

    public void removeMenuItem(Menuitem item) {
        menuDetails.remove(item);
    }

    public String newMenuItems(String name){
        String returnInfo = "";
        for (Menuitem m1:menuDetails) {
            if(m1.getItemName().contains(name)){
                if(m1.isItemNew()==true){
                    returnInfo = "New";
                } else
                    {returnInfo = "old";}
            }
        }
        return returnInfo;
    }

    public void printAll(){
        for (Menuitem m1: menuDetails) {
            System.out.println("\n******");
            System.out.println("Name: " + m1.getItemName() + "\n" +
                               "Price: " + m1.getItemPrice() + "\n" +
                               "Description: " + m1.getItemDescription() + "\n" +
                               "Category: " + m1.getItemCategory() + "\n" +
                               "ItemNew: " + this.newMenuItems(m1.getItemName())
                              );
        }
        System.out.print("******");
    }

    public void printSelectedItem(String name){
        String returnInfo = "";
        for (Menuitem m1:menuDetails) {
            if(m1.getItemName().contains(name)){
                System.out.println("\n******");
                System.out.println("Name: " + m1.getItemName() + "\n" +
                        "Price: " + m1.getItemPrice() + "\n" +
                        "Description: " + m1.getItemDescription() + "\n" +
                        "Category: " + m1.getItemCategory() + "\n" +
                        "ItemNew: " + this.newMenuItems(m1.getItemName()));
            }
        }
        System.out.print("******");
    }

    public void checkMenuItemsEqual(){
        for (Menuitem m1:menuDetails) {
            m1.equals(m1)
        }
    }

}
