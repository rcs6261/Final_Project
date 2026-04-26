package final_project;

import java.time.LocalDate;

public class Miscellaneous extends Event {
    //Creates a miscellaneous basic event that can be added to the calendar
    public Miscellaneous(String title, LocalDate date, String description){
        super(title, date, description);
    }

    //Gets the details for the miscellaneous event
    @Override
    public String getDetails() {
        return "[title] " + title + "\nDate: " + date +"\nTime" + "\nDescription: " + description;
    }

}
