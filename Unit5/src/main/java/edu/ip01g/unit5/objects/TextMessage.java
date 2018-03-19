package edu.ip01g.unit5.objects;

public class TextMessage {

    private String phoneNumber;
    private String text;

    public TextMessage(final String phoneNumber, final String text) {
        this.phoneNumber = phoneNumber;
        this.text = text;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "TextMessage{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
