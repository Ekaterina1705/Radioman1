package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {

    @Test
    public void shouldChangeStation() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        int expected = 5;
        int actual = radio.setCurrentStation(5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationUnderMinStation() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();

        radio.setCurrentStation(-1);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationOverMaxStation() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        radio.setCurrentStation(10);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStation() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        radio.setCurrentStation(6);
        radio.nextStation();
        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void shouldOverMaxStation1() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldOverMaxStation2() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        radio.setCurrentStation(10);
        radio.nextStation();
        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        radio.setCurrentStation(4);
        radio.previousStation();
        Assertions.assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void shouldBelowMinStation1() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        radio.setCurrentStation(0);
        radio.previousStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldBelowMinStation2() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        radio.setCurrentStation(-1);
        radio.previousStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeVolume() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(5);
        Assertions.assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        Assertions.assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldOverMaxVolume1() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        Assertions.assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldOverMaxVolume2() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        ru.netology.domain.Radioman radio = new ru.netology.domain.Radioman();
        radio.setCurrentVolume(6);
        radio.decreaseVolume();
        Assertions.assertEquals(5, radio.getCurrentVolume());
    }
}
