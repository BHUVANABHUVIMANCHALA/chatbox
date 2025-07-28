package com.Harish.ChatBox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms")
public class ChatRoomController {
    @Autowired
    private ChatRoomService chatRoomService;

    @GetMapping
    public List<ChatRoom>getAllRooms(){
        return chatRoomService.getAllRooms();
    }
}
