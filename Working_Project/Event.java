package final_project;
import java.time.LocalDate;

public abstract class Event {
        protected String title;
        protected LocalDate date;
        protected String description;

        //Constructor
        public Event(String title, LocalDate date, String description){
            this.title = title;
            this.date = date;
            this.description = description;
        }

        //Abstract class that will allow subclasses to store a string of variable information to then be used for toString method
        public abstract String getDetails();

        //Accessors
        public String getTitle() {return title;}
        public LocalDate getDate() {return date;}
        public String getDescription() {return description;}

        //Mutators
        public void setTitle(String title) {this.title = title;}
        public void setDate(LocalDate date) {this.date = date;}
        public void setDescription(String description) {this.description = description;}

        //Returns getDetails with all available event information
        @Override
        public String toString() {
            return getDetails();
        }
}
