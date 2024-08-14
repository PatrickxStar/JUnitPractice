package org.example;

import java.util.Scanner;

public class ChatBot {

    public String greetUser() {
        return "Hello! I am your friendly chat bot.";
    }

    public String askName(String inputName) {
        return "Nice to meet you, " + inputName + "! Could you please repeat your name?";
    }

    public double guessAge(double rem3, double rem5, double rem7) {
        return (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
    }

    public String testProgrammingKnowledge(int answer) {
        return answer == 2 ? "Congratulations! You are correct." : "Please, try again.";
    }
}
