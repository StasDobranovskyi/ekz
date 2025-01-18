public class PromotionalNotification implements Notification {
    private Notification notification;

    public PromotionalNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public String send() {
        return notification.send() + " [Promotional Content]";
    }
}
