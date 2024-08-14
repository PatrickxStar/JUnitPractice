package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChatBotTest {

    ChatBot bot = new ChatBot();

    @Test
    void testGreetUser() {
        assertEquals("Hello! I am your friendly chat bot.", bot.greetUser());
    }

    @Test
    void testAskName() {
        assertEquals("Nice to meet you, John! Could you please repeat your name?", bot.askName("John"));
    }


    @Test
    void testProgrammingKnowledge() {
        assertEquals("Congratulations! You are correct.", bot.testProgrammingKnowledge(2));
    }
}
