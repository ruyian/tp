package seedu.duke.exceptions;

/**
 * The super class of all the exceptions generated by this programme.
 */
public abstract class DukeException extends Exception {
    public DukeException(String message) {
        super(message);
    }
}
