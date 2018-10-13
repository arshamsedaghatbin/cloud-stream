package com.kaviddiss.streamkafka.service;

import com.kaviddiss.streamkafka.model.Greetings;
import com.kaviddiss.streamkafka.stream.GreetingsStreams;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class GreetingsListener {
    @StreamListener(GreetingsStreams.INPUT)
    public void handleGreetings(@Payload Greetings greetings) {
        System.out.print("Received greetings:"+  greetings.toString());
    }

    @StreamListener(GreetingsStreams.INPUT)
    public void handleGreetingsTwo(@Payload Greetings greetings) {
        System.out.print("Received greetings 3:"+  greetings.toString());
    }
}
