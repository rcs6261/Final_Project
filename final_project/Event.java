package final_project.final_project;
import java.time.LocalDate;

public abstract class Event {
        protected String title;
        protected LocalDate date;
        protected String description;

        public Event(String title, LocalDate date, String description){
            this.title = title;
            this.date = date;
            this.description = description;
        }

        public abstract String getDetails();

        public String getTitle() {return title;}
        public LocalDate getDate() {return date;}
        public String getDescription() {return description;}

        public void setTitle(String title) {this.title = title;}
        public void setDate(LocalDate date) {this.date = date;}
        public void setDescription(String description) {this.description = description;}

        @Override
        public String toString() {
            return getDetails();
        }
}
