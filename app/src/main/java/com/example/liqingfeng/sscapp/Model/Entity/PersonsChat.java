package com.example.liqingfeng.sscapp.Model.Entity;

public class PersonsChat {
    private int id;
    private String name;
    private String chatMessage;
    private boolean isMeSend;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChatMessage() {
        return chatMessage;
    }

    public void setChatMessage(String chatMessage) {
        this.chatMessage = chatMessage;
    }

    public boolean isMeSend() {
        return isMeSend;
    }

    public void setMeSend(boolean meSend) {
        isMeSend = meSend;
    }

    public PersonsChat(int id, String name, String chatMessage, boolean isMeSend) {
        super();
        this.id = id;
        this.name = name;
        this.chatMessage = chatMessage;
        this.isMeSend = isMeSend;
    }
    public PersonsChat() {
        super();
    }
}