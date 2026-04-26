package final_project.final_project;

import java.awt.event.ActionEvent;
import java.time.LocalDate;

// scene builder wouldn't work for me neither would like any of javafx features so I couldn't test this or any of the code
// TLDR: didn't know what I was doing sorry
public class CalendarController {
    // for scroll bar;
    @FXML private VBox topLevelContainer;

    // calendar displays events and lets you select certain ones to modify? at least that's my understanding of what we said
    // in a box window display a scrollable list of events, only user input is clicking a date? so no instance variables??

    //  for clicking a date presented
    private void DateClicked(MouseEvent mouseEvent) {
        // get and display event info for date clicked, event class is date by date info?
        System.out.println(mouseEvent.getDescription());
    }

    // for starting a scroll bar? I'm fairly sure there should be a separation by month but im not seeing it anywhere
    public void initialize() {
        // assumption: scrollbar implementation via scrollpane I'd assume?: this so doesn't work though
        GridPane gP = new GridPane(); // change this to whatever stores the calendar array
        ScrollPane sP = new ScrollPane();
        sP.setPrefSize(0, 100);
        sP.setContent(gP);

    }
}


//sorry I dropped the ball here