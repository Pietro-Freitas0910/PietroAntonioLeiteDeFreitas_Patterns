package decorator;

public class Main {
    public static void main(String[] args) {
        // Apenas email
        Notifier n1 = new EmailNotifier();
        n1.send("Olá");
        System.out.println();

        // Email + Slack
        Notifier n2 = new SlackDecorator(new EmailNotifier());
        n2.send("Promoção");
        System.out.println();

        // Email + SMS + Slack
        Notifier n3 = new SlackDecorator(new SmsDecorator(new EmailNotifier()));
        n3.send("Sistema fora");
    }
}
