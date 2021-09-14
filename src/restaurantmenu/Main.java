package restaurantmenu;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import restaurantmenu.Menu.*;
import restaurantmenu.Menuitem;

public class Main {
     public static void main(String[] args) {
          Menuitem pasta = new Menuitem( "Pasta",5.99,"Itallian cheese with Italian spice mix","Main course",false);
          Menuitem pizza = new Menuitem( "pizza",5.99,"Itallian cheese with Italian spice mix with veggies","Main course",true);
          Menuitem breadSticks = new Menuitem( "breads ticks",2.99,"Garlic bread sticks","Appetizer",false);
          Menuitem cheeseFries = new Menuitem( "cheese fries",2.99,"Mozerella cheese fries","Appetizer",true);
          Menuitem vanillaCake = new Menuitem( "vanilla cake",3.99,"Vanilla cake with icing","Dessert",false);
          Menuitem chocolateCake = new Menuitem("Chocolate cake",1.99,"Chocolate cake with icing","Dessert",true);

          // Add menu item
          ArrayList<Menuitem> menuitems = new ArrayList<>();
          menuitems.add(pasta);
          menuitems.add(pizza);
          menuitems.add(breadSticks);
          menuitems.add(cheeseFries);
          menuitems.add(vanillaCake);
          menuitems.add(chocolateCake);

          Menu  menu1=new Menu();
          menu1.addMenu(new Date(),menuitems);
          System.out.println(menu1);

          // Remove menu item
          menu1.removeMenuItem(pasta);
          System.out.println(menu1);

          //find out if a menu item is new
          System.out.println(menu1.newMenuItems("pizza"));

          //last update date of menu
          System.out.println(menu1.getMenuUpdateDt());

          menu1.printAll();

          menu1.printSelectedItem("pizza");

     }



}
