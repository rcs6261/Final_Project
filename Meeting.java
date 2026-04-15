package final_project;
import java.time.LocalDate;

public class Meeting extends Event {
        private String location;

        public Meeting(String title, LocalDate date, String description, String location){
            super(title, date, description);
            this.location = location;
        }

        @Override
        public String getDetails(){
            return "[Meeting] " + title + "\nDate: " + date + "\nLocation: "
                    + location + "\nDescription: " + description;
        }
}
