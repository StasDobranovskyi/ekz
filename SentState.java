public class SentState implements NotificationState {
    @Override
    public void handle() {
        System.out.println("Notification has been sent.");
    }
}
