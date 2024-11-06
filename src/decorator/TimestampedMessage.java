package decorator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimestampedMessage extends MessageDecorator {

    public TimestampedMessage(Message decoratedMessage) {
        super(decoratedMessage);
    }

    @Override
    public String getContent() {
        return addTimestamp(decoratedMessage.getContent());
    }

    private String addTimestamp(String text) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return "[" + timestamp + "] " + text;
    }
}
