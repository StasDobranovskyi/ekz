public class EncryptedNotification implements Notification {
    private Notification notification;

    public EncryptedNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public String send() {
        return "Encrypted: " + notification.send();
    }
}
