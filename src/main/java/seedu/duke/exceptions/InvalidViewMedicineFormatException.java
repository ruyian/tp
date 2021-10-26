package seedu.duke.exceptions;

import static seedu.duke.common.Messages.VIEW_MED_FORMAT_MESSAGE;

public class InvalidViewMedicineFormatException extends DukeException {
    public InvalidViewMedicineFormatException() {
        super(VIEW_MED_FORMAT_MESSAGE);
    }
}