public class Main {
    public static void main(String[] args) {
        // Singleton: Отримання сервісу
        NotificationService notificationService = NotificationService.getInstance();

        // Observer: Підписка користувачів
        NotificationPublisher publisher = new NotificationPublisher();
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        publisher.subscribe(user1);
        publisher.subscribe(user2);

        // State: Зміна станів повідомлення
        NotificationContext context = new NotificationContext();
        context.setState(new NewState());
        context.applyState();

        // Decorator: Формування повідомлення
        Notification notification = new PromotionalNotification(
                new EncryptedNotification(new BasicNotification())
        );

        String finalMessage = notification.send();
        notificationService.sendNotification(finalMessage);

        // Надсилання повідомлення підписникам
        publisher.notifySubscribers(finalMessage);

        // State: Завершення станів
        context.setState(new SentState());
        context.applyState();
        context.setState(new DeliveredState());
        context.applyState();
    }
}
