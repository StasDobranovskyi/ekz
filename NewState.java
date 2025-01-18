public class NewState implements NotificationState {
    @Override
    public void handle() {
        System.out.println("Notification is in 'New' state.");
    }
}
