package factorymethod;

public class NotificationService {
    private final NotificationFactory factory;

    public NotificationService(NotificationFactory factory) {
        this.factory = factory;
    }

    public void notify(String message) {
        Notification notification = factory.createNotification();
        notification.send(message);
    }
}
