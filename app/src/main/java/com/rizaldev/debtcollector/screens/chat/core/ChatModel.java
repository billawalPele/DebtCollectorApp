package com.rizaldev.debtcollector.screens.chat.core;

/**
 * Created by devel on 18/11/2017.
 */

public class ChatModel {
    private boolean user;
    private String name;
    private String textMessage;
    private String imageLink;
    private String chatRoomID;
    private String chatID;

    public ChatModel(boolean user, String name, String textMessage, String imageLink, String chatRoomID, String chatID) {
        this.user = user;
        this.name = name;
        this.textMessage = textMessage;
        this.imageLink = imageLink;
        this.chatRoomID = chatRoomID;
        this.chatID = chatID;
    }

    public boolean isUser() {
        return user;
    }

    public void setUser(boolean user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage= textMessage;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getChatRoomID() {
        return chatRoomID;
    }

    public void setChatRoomID(String chatRoomID) {
        this.chatRoomID = chatRoomID;
    }

    public String getChatID() {
        return chatID;
    }

    public void setChatID(String chatID) {
        this.chatID = chatID;
    }
}
