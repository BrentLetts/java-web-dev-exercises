package restaurantmenu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
    private static Menu menu = new Menu();
    private static int menuIdNum = 1;
    public static void main(String[] args) {
//        ArrayList<MenuItem> items = new ArrayList<>();
//        MenuItem menuItem = new MenuItem("Cheese Sticks", 5.95, "Appetizer", false, LocalDate.of(2000, 12, 29));
//        MenuItem menuItem1 = new MenuItem("Soft Pretzels", 10.95, "Appetizer", false, LocalDate.of(1999,8,21));
//        MenuItem menuItem2 = new MenuItem("Nachos", 13.95, "Appetizer", false, LocalDate.of(2009, 3, 15));
//        MenuItem menuItem3 = new MenuItem("Fish & Chips", 15.95, "Lunch", true, LocalDate.now());
//        menuItem.setDescription("Breaded mozzarella cheese fried to ooey gooey perfection");
//        menuItem1.setDescription("Soft pretzels with your choice of anything on it.  Seriously, just pick something that you want on it and we'll put it on.");
//        menuItem2.setDescription("You've heard of loaded nachos, but these are the epitome of \"Loaded\"!");
//
//
//        items.add(menuItem);
//        items.add(menuItem1);
//        items.add(menuItem2);
//        items.add(menuItem3);
//
//
//        Menu menu = new Menu();
//        menu.setMenuItems(items);
//        System.out.println(menu.getMenuInfo());
        /**
         * THE BELOW IS WHAT THEY DID IN THE LECTURE
         */
        try (Scanner in = new Scanner(System.in)){
            int selection = 0;
            do{
                System.out.println();
                System.out.println("Welcome to the restaurant!");
                System.out.println("1) Print the menu");
                System.out.println("2) Print single menu item");
                System.out.println("3) Add a menu item");
                System.out.println("4) Remove a menu item");
                System.out.println("5) Exit");
                System.out.print("Selection: ");

                String userInput = in.nextLine();

                selection = Integer.parseInt(userInput);

                switch (selection){
                    case 1:
                        System.out.println(menu.getMenuInfo());
                        break;
                    case 2:
                        System.out.println("Enter the item you wish to print");
                        String userItemToPrint = in.nextLine();

                        for(MenuItem item : menu.getMenuItems()){
                            if(item.getName().equals(userItemToPrint)){
                                System.out.println(item.getMenuItemInfo());
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Enter menu item name: ");
                        String itemName = in.nextLine();
                        System.out.println("Enter menu item description");
                        String desc = in.nextLine();
                        System.out.println("Enter the category");
                        String category = in.nextLine();
                        System.out.println("Enter menu item price: ");
                        String priceStr = in.nextLine();

                        double price = Double.parseDouble(priceStr);
                        menu.addMenuItem(new MenuItem(itemName, price, category, true, LocalDate.now()));

                        break;
                    case 4:
                        System.out.println("Please enter the item name you want to remove");
                        String itemToDelete = in.nextLine();

                        menu.removeMenuItem(itemToDelete);
                        break;

                }


            } while (selection != 5);
            System.out.println("Goodbye!");
            System.exit(0);
        }catch (Exception e){
            System.err.println("Nooooope!");
            System.exit(1);
        }
    }


}
