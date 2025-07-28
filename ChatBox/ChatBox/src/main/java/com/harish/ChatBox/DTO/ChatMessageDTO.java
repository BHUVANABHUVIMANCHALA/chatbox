package com.harish.ChatBox.DTO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("chat_messages")

@AllArgsConstructor
public class ChatMessageDTO {
    @Id
    private String Id;
    private String roomId;
    private String senderName;
    private String content ;
    public ChatMessageDTO(){

    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String toString() {
        return "ChatMessage{" +
                "Id=" + Id +
                ", roomId='" + roomId + '\'' +
                ", senderName='" + senderName + '\'' +

                '}';
    }

    public String getSender()
    {
        return "";
    }
}
