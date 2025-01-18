public class NotificationContext {
    private NotificationState state;

    public void setState(NotificationState state) {
        this.state = state;
    }

    public void applyState() {
        state.handle();
    }
}
