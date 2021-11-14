package com.example.crud;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
    }



    @Test
    public void mainTest() {
        String text = "На свете есть океан , на океане остров , на острове дерево , на дереве заяц , в зайце утка , в утке яйцо , в яйце иголка , смерть Кощея на игле :(";

        String testText = "";

        if (!testText.contains(text) && testText.length() <= text.length()) {
        }
    }

}