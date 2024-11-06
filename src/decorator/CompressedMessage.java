package decorator;

public class CompressedMessage extends MessageDecorator {
    public CompressedMessage(Message decoratedMessage) {
        super(decoratedMessage);
    }

    @Override
    public String getContent() {
        return compress(decoratedMessage.getContent());
    }

    private String compress(String text) {
        return text.replaceAll("\\s+", ""); // видалення зайвих пробілів
    }
}
