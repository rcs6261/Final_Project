package final_project;
import java.time.LocalDate;

public class Task extends Event {
    private boolean completed;

    //Constructor
    public Task(String title, LocalDate date, String description, boolean completed){
        super(title, date, description);
        this.completed = completed;
    }
    //Turns variables into a string to then be used to override toString method
    @Override
    public String getDetails(){
        return "[Task] " + title + "\nDate: " + date + "\nProgress: "
                + (completed ? "Completed" : "Not Completed") + "\nDescription: " + description;
    }
}
