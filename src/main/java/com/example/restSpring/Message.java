package com.example.restSpring;

public class Message {

    private final long id;
    private final String mes;

    public Message(long id, String mes){
        this.id = id;
        this.mes = mes;
    }

    public long getId() {
        return id;
    }

    public String getMes() {
        return mes;
    }
}
