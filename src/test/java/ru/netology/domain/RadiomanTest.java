package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadiomanTest {
    Radioman radio = new Radioman();
    @Test
    public void shouldChangeStation() {
        radio.setCurrentStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeStation1() {
        radio.setCurrentStation(6);
        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeStation2() {
        radio.setCurrentStation(-2);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void shouldChangeVolume() {
        radio.setCurrentVolume(5);
        Assertions.assertEquals(5, radio.getCurrentVolume());
    }


    @Test
    public void shouldOverMaxVolume1() {
        radio.setCurrentVolume(10);
        Assertions.assertEquals(10, radio.getCurrentVolume());
    }


    @Test
    public void NextStation() {
        radio.setCurrentStation(6);
        radio.nextStation();
        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void NextStation1() {
        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void NextStation2() {
        radio.setCurrentStation(8);
        radio.nextStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void PrevStation() {
        radio.setCurrentStation(4);
        radio.prevStation();
        Assertions.assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void PrevStation1() {
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void currentVolume() {
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void currentVolume1() {
        radio.setCurrentVolume(11);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldCurrentStation() {
        radio.setCurrentStation(10);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }
}
