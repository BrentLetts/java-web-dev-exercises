package restaurantmenu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdate = null;
    private boolean isNewItems = false;

    public ArrayList<MenuItem> getMenuItems(){
        return this.menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> aMenuItems){
        this.menuItems = aMenuItems;
    }

    //currently this is not being used, but may be needed later
    public LocalDate getLastUpdate(){
        if(this.lastUpdate == null){
            this.lastUpdate = LocalDate.now();
        }
        return this.lastUpdate;
    }

    public void setLastUpdate(LocalDate aLastUpdate){
        this.lastUpdate = aLastUpdate;
    }

    public String getStringDate(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        return this.lastUpdate.format(formatter);
    }

    public boolean isLastDate(LocalDate date){
        //check for null and return true, just so it can get set first
        if(this.lastUpdate == null)
            return true;
        //if the date is less than 0 return true
        else if(date.compareTo(this.lastUpdate) < 0)
            return false;
        //the date is newer than the previous date set
        else
            return true;
    }

    public String getMenuInfo(){
        String returnString = "";
        //Loop the menu items
        for(MenuItem i : menuItems){
            returnString += "\n" + i.getMenuItemInfo();
            //If this date is newer than the previous, set it to the lastUpdated
            if(this.isLastDate(i.getDateAdded())){
                this.setLastUpdate(i.getDateAdded());
            }
            returnString += "\n******************\n";
        }
        returnString += "\nMenu Updated: " + this.getStringDate();
        return returnString;
    }
}
