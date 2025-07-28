package com.harish.ChatBox.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String displayName;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)

    private List<ChatRoomMember> memberships;

    public User() {
    }

    public User(Long id) {
        this.Id= id;
    }

    public User(String displayName) {
        this.displayName = displayName;

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + Id +
                ", displayName='" + displayName + '\'' +
                '}';
    }
}
