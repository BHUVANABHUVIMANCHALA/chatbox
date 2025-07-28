package com.harish.ChatBox.repository;

import com.harish.ChatBox.entity.ChatRoomMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomMemberRepository extends JpaRepository<ChatRoomMember,Long> {
}
