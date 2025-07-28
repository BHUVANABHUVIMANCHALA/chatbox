package com.Harish.ChatBox.controller;

import com.Harish.ChatBox.Dto.ChatMessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;

@Controller
public class ChatSocketController {

  @Autowired
  private ChatMessageService chatMessageService;

  @MessageMapping("/chat/{roomId}")
    @SendTo("/topic/room/{roomId}")
    public ChatMessageDTO sendMessage(@DestinationVariable String roomId, @Payload ChatMessageDTO dto){
      ChatMessage msg=new ChatMessage();
      msg.setRoomId(roomId);
      msg.setSenderNmae(dto.getSender());
      msg.setcontent(dto.getContent());
      msg.setTimestamp(LocalDateTime.now());
      chatMessageService.saveMessage(msg);
      return dto;
  }
}
