package com.harish.ChatBox.service;

import com.harish.ChatBox.entity.ChatRoom;
import com.harish.ChatBox.repository.ChatRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatRoomService {
    @Autowired
    private ChatRoomRepository chatRoomRepository;

    public List<ChatRoom > getAllRooms() {

        return chatRoomRepository.findAll();
    }
}

