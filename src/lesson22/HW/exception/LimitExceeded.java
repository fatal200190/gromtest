package lesson22.HW.exception;

/**
 * Created by Alex on 17.11.2017.
 */
public class LimitExceeded extends BadRequestException {
    public LimitExceeded(String message) {
        super(message);
    }
}
