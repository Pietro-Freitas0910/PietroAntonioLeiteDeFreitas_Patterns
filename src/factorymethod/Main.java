package factorymethod;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<NotificationFactory> factories = List.of(
                new EmailNotificationFactory(),
                new SMSNotificationFactory(),
                new PushNotificationFactory()
        );

        for (NotificationFactory factory : factories) {
            NotificationService service = new NotificationService(factory);
            service.notify("Bem-vindo ao sistema!");
        }
    }
}
