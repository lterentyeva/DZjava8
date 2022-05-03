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

        radio.setNextRadioStation(9);

        int expected = 0;
        int actual = radio.getNextRadioStation();

        assertEquals(expected, actual);
    }


}