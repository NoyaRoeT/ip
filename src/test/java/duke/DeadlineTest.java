package duke;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeadlineTest {

    @Test
    public void getBy_withTime_success() {
        Deadline task = new Deadline("test deadline", LocalDateTime.parse("2000-08-13T18:30"), true);
        assertEquals(task.getBy(), "13th August 2000, 6:30pm");
    }
}
