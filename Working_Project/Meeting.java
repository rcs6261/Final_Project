package final_project;
import java.time.LocalDate;

public class Meeting extends Event {
        private String location;

        //Constructor
        public Meeting(String title, LocalDate date, String description, String location){
            super(title, date, description);
            this.location = location;
        }

       //Turns variables into a string to then be used to override toString method
        @Override
        public String getDetails(){
            return "[Meeting] " + title + "\nDate: " + date + "\nLocation: "
                    + location + "\nDescription: " + description;
        }
}
