package final_project;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calendar {

    private List<Event> events;

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

        return result;
    }

    // Display all events
    public void displayAllEvents() {
        for (Event e : events) {
            System.out.println(e);
        }
    }
}

