package com.example.case22_recyclerview_chat;

public class DataChat {

    public static final int TYPE_RECEIVED = 0;
    public static final int TYPE_SENT = 1;

    private final String content;
    private final int type;

    public DataChat(String content, int type) {
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }
    public int getType() {
        return type;
    }
}