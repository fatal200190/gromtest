package lesson20.task2.exception;

/**
 * Created by Alex on 17.11.2017.
 */
public class LimitExceeded extends BadRequestException {
    public LimitExceeded(String message) {
        super(message);
    }
}
