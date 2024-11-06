package decorator;

public class EncryptedMessage extends MessageDecorator {
    public EncryptedMessage(Message decoratedMessage) {
        super(decoratedMessage);
    }

    @Override
    public String getContent() {
        return encrypt(decoratedMessage.getContent());
    }

    private String encrypt(String text) {
        return new StringBuilder(text).reverse().toString(); // простий реверс як приклад шифрування
    }
}
