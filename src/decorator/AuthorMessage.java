package decorator;

public class AuthorMessage extends MessageDecorator {
    private final String firstName;
    private final String lastName;

    public AuthorMessage(Message decoratedMessage, String firstName, String lastName) {
        super(decoratedMessage);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getContent() {
        return addAuthor(decoratedMessage.getContent());
    }

    private String addAuthor(String text) {
        return "By" + this.firstName + this.lastName + ": " + text;
    }
}
