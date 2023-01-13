package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadiomanTest {


    @Test
    public void test() {
        Radioman radio = new Radioman(20);

        radio.setCurrentStation(15);
        int expected = 15;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeStation() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeStation1() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(6);
        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeStation2() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(-2);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void shouldChangeVolume() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(5);
        Assertions.assertEquals(5, radio.getCurrentVolume());
    }


    @Test
    public void shouldOverMaxVolume1() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(10);
        Assertions.assertEquals(10, radio.getCurrentVolume());
    }


    @Test
    public void NextStation() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(6);
        radio.nextStation();
        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void NextStation1() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void NextStation2() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(8);
        radio.nextStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void PrevStation() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(4);
        radio.prevStation();
        Assertions.assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void PrevStation1() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void currentVolume() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void currentVolume1() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(101);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldCurrentStation() {
        Radioman radio = new Radioman();
        radio.setCurrentStation(10);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }
}
