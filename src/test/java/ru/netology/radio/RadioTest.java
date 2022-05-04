package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(7);

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void bellow0SetCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-4);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void above9SetCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(15);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNextRadioStation() {
        Radio radio = new Radio();

        radio.setNextRadioStation(7);

        int expected = 8;
        int actual = radio.getNextRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void aboveShouldNextRadioStation() {
        Radio radio = new Radio();

        radio.setNextRadioStation(11);

        int expected = 0;
        int actual = radio.getNextRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevRadioStation() {
        Radio radio = new Radio();

        radio.setPrevRadioStation(7);

        int expected = 6;
        int actual = radio.getPrevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void bellowShouldPrevRadioStation() {
        Radio radio = new Radio();

        radio.setPrevRadioStation(-7);

        int expected = 9;
        int actual = radio.getPrevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);

        int expected = 9;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void bellow0SetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-2);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void above10SetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(13);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(6);

        int expected = 7;
        int actual = radio.getIncreaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    void aboveShouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(12);

        int expected = 10;
        int actual = radio.getIncreaseVolume();

        assertEquals(expected, actual);
    }


}

