package restaurantmenu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MenuItem {
    private String name;
    private double price;
    private String description = null;
    private String category;
    private boolean isNew = false;
    private LocalDate dateAdded;

    public MenuItem(String name, double price, String category, boolean isNew, LocalDate dateAdded){
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = getDescription();
        this.isNew = isNew;
        this.dateAdded = dateAdded;
    }

    public String getDescription(){
        if(this.description == null){
            this.description = "";
        }
        return this.description;
    }

    public void setDescription(String aDescription){
        this.description = aDescription;
    }

    public boolean getIsNew(){
        return this.isNew;
    }

    public void setIsNew(boolean aIsNew){
        this.isNew = aIsNew;
    }

    //only the getter is needed since the date is initialized when the Class is instantiated
    public LocalDate getDateAdded(){
        return this.dateAdded;
    }

    public String getMenuItemInfo(){
        return String.format("Name: %s\nPrice: %s\nDescription: %s\nCategory: %s\nNew Item: %s",
                this.name, this.price, this.description, this.category, this.isNew);
    }
}
