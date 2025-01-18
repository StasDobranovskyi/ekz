public class NotificationService {
    private static NotificationService instance;

    private NotificationService() {}

    public static NotificationService getInstance() {
        if (instance == null) {
            instance = new NotificationService();
        }
        return instance;
    }

    public void sendNotification(String message) {
        System.out.println("Notification sent: " + message);
    }
}
