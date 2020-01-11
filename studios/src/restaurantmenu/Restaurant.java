package restaurantmenu;

import java.time.LocalDate;
import java.util.ArrayList;

public class Restaurant {
    //I added this to make sure that I could get things working correctly, but then I started to add more functionality to it.
    public static void main(String[] args) {
        ArrayList<MenuItem> items = new ArrayList<>();
        MenuItem menuItem = new MenuItem("Cheese Sticks", 5.95, "Appetizer", false, LocalDate.of(2000, 12, 29));
        MenuItem menuItem1 = new MenuItem("Soft Pretzels", 10.95, "Appetizer", false, LocalDate.of(1999,8,21));
        MenuItem menuItem2 = new MenuItem("Nachos", 13.95, "Appetizer", false, LocalDate.of(2009, 3, 15));
        MenuItem menuItem3 = new MenuItem("Fish & Chips", 15.95, "Lunch", true, LocalDate.now());
        menuItem.setDescription("Breaded mozzarella cheese fried to ooey gooey perfection");
        menuItem1.setDescription("Soft pretzels with your choice of anything on it.  Seriously, just pick something that you want on it and we'll put it on.");
        menuItem2.setDescription("You've heard of loaded nachos, but these are the epitome of \"Loaded\"!");


        items.add(menuItem);
        items.add(menuItem1);
        items.add(menuItem2);
        items.add(menuItem3);


        Menu menu = new Menu();
        menu.setMenuItems(items);
        System.out.println(menu.getMenuInfo());
    }


}
