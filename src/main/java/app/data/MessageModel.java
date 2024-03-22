package app.data;

public class MessageModel {
    private Integer messageId;
    private String messageBody;
    private String messageAuthor;
    private String creationDate;

    public MessageModel() {
    }

    public MessageModel(Integer messageId, String messageBody, String messageAuthor, String creationDate) {
        this.messageId = messageId;
        this.messageBody = messageBody;
        this.messageAuthor = messageAuthor;
        this.creationDate = creationDate;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getMessageAuthor() {
        return messageAuthor;
    }

    public void setMessageAuthor(String messageAuthor) {
        this.messageAuthor = messageAuthor;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "MessageModel{" +
                "messageId=" + messageId +
                ", messageBody='" + messageBody + '\'' +
                ", messageAuthor='" + messageAuthor + '\'' +
                ", creationDate='" + creationDate + '\'' +
                '}';
    }
}
