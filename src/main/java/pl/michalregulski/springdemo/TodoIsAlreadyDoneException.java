package pl.michalregulski.springdemo;

public class TodoIsAlreadyDoneException extends IllegalStateException {

    public TodoIsAlreadyDoneException() {
        super("The task is already done");
    }

}
