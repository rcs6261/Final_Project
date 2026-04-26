package final_project;
import java.time.LocalDate;
import java.time.LocalTime;

public class Reminder extends Event{
        private LocalTime time;

        //Constructor
        public Reminder(String title, LocalDate date, String description, LocalTime time){
            super(title, date, description);
            this.time = time;
        }

        //Turns variables into a string to then be used to override toString method
        @Override
        public String getDetails(){
            return "[Reminder] " + title + "\nDate: " + date + "\nTime: "
                    + time + "\nDescription: " + description;
        }
    }
