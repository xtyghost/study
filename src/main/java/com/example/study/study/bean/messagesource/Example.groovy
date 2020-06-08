package com.example.study.study.bean.messagesource

import org.springframework.context.MessageSource
import org.springframework.context.support.ResourceBundleMessageSource

import java.nio.charset.StandardCharsets

class Example {
    MessageSource messages;

    void setMessages(ResourceBundleMessageSource messages) {
        this.messages = messages;
    }

    void execute_en() {
        String[] param = new String[1];
        param[0] = "userDao"
        String message = this.messages.getMessage("argument.required",
                param, "Required", Locale.ENGLISH);
        System.out.println(message);
    }
    void execute_ch() {
        String[] param = new String[1];
        param[0] = "userDao"
        String message = this.messages.getMessage("argument.required",
                param, "Required", Locale.CHINA);
        System.out.println(new String(message.getBytes(StandardCharsets.ISO_8859_1)));
    }
}
