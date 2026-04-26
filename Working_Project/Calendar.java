package final_project;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calendar {

    protected List<Event> events;

    public Calendar() {
        events = new ArrayList<>();
    }

    // Add an event
    public void addEvent(Event event) {
        events.add(event);
    }

    // Remove an event
    public void removeEvent(Event event) {
        events.remove(event);
    }

    // Get events for a specific date
    public List<Event> getEventsByDate(LocalDate date) {
        List<Event> result = new ArrayList<>();

        // Adds every event from given day
        for (Event e : events) {
            if (e.getDate().equals(date)) {
                result.add(e);
            }
        }

        // Returns a list of events
        return result;
    }

    // Displays all events
    public void displayEvents() {
        for (Event e : events) {
            System.out.println(e);
        }
    }

    //Gets the list of events
    public List<Event> getEvents() {
        return events;
    }
}

