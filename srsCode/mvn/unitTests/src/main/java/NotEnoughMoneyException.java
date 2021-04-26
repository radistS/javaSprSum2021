public class NotEnoughMoneyException extends RuntimeException {

    private static final String NOT_ENOUGHT_MONEY = "Not enough money on %s account ";

    public NotEnoughMoneyException(String message) {
        super(String.format(NOT_ENOUGHT_MONEY, message));
    }
}
