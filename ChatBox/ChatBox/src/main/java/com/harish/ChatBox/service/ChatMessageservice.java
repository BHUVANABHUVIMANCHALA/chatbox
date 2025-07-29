package com.harish.ChatBox.service;


import com.harish.ChatBox.DTO.ChatMessageDTO;
import com.harish.ChatBox.model.ChatMessage;
import com.harish.ChatBox.repository.ChatMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ChatMessageservice {
    @Autowired
    private ChatMessageRepository chatMessageRepository;

  //  public void saveMessage(ChatMessage msg){
   //     chatMessageRepository.save(msg);
  //  }
  public ChatMessageDTO saveMessage(String room, ChatMessageDTO dto) {
        ChatMessage message = new ChatMessage();
        message.setRoomId(dto.getRoomId());;
        message.setSenderName(dto.getSender());
        message.setContent(dto.getContent());
        message.setTimestamp(LocalDateTime.now());

      chatMessageRepository.save(message);
        return dto;
    }

    public List<ChatMessage> getMessagesByRoomId(String roomId) {
        return chatMessageRepository.findByRoomId(roomId);
    }
}
