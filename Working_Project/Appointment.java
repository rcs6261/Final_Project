package final_project;
import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment extends Event {
        private LocalTime startTime;
        private LocalTime endTime;
        private String location;

        //Constructor
        public Appointment(String title, LocalDate date, String description, LocalTime startTime, LocalTime endTime, String location){
            super(title, date, description);
            this.startTime = startTime;
            this.endTime = endTime;
            this.location = location;
        }
        //Turns variables into a string to then be used to override toString method
        @Override
        public String getDetails(){
            return "[Appointment] " + title + "\nDate: " + date +"\nTime: " + startTime + " - " + endTime
                    + "\nLocation: " + location + "\nDescription: " + description;
        }

    }

