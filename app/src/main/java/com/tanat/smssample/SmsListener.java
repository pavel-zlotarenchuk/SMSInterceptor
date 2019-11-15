package com.tanat.smssample;

public interface SmsListener {
    void messageReceived(String messageSender, String messageText);
}
