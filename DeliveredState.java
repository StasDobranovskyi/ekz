public class DeliveredState implements NotificationState {
    @Override
    public void handle() {
        System.out.println("Notification has been delivered.");
    }
}
