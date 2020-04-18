package lastseen.com;

import java.util.Date;

public class Message {
    public String username;
    public String textmessage;
    private long timemessage;

    public Message() {
    }

    public Message(String username, String textmessage) {
        this.username = username;
        this.textmessage = textmessage;

        this.timemessage = new Date().getTime();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTextmessage() {
        return textmessage;
    }

    public void setTextmessage(String textmessage) {
        this.textmessage = textmessage;
    }

    public long getTimemessage() {
        return timemessage;
    }

    public void setTimemessage(long timemessage) {
        this.timemessage = timemessage;
    }
}
