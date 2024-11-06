import decorator.*;

public class Main {

    public static void main(String[] args) {
        // Базове повідомлення
        Message message = new TextMessage("Це тестове повідомлення!");
        System.out.println("Базове повідомлення: " + message.getContent());

        // Шифруємо повідомлення
        message = new EncryptedMessage(message);
        System.out.println("Після шифрування: " + message.getContent());

        // Додаємо позначку дати і часу
        message = new TimestampedMessage(message);
        System.out.println("Після додавання дати та часу: " + message.getContent());

        // Додаємо ім'я автора
        message = new AuthorMessage(message, "Danyil", "Herasymchuk");
        System.out.println("Після додавання імені автора: " + message.getContent());

        // Стискаємо повідомлення
        message = new CompressedMessage(message);
        System.out.println("Після стиснення: " + message.getContent());
    }
}
