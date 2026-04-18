package final_project.final_project;
import java.time.LocalDate;
import java.time.LocalTime;

public class Reminder extends Event{
        private LocalTime time;

        public Reminder(String title, LocalDate date, String description, LocalTime time){
            super(title, date, description);
            this.time = time;
        }

        @Override
        public String getDetails(){
            return "[Reminder] " + title + "\nDate: " + date + "\nTime: "
                    + time + "\nDescription: " + description;
        }
    }
