package ru.netology.radio;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation <= 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getNextRadioStation() {
        return currentRadioStation;
    }

    public void setNextRadioStation(int currentRadioStation) {
        if (currentRadioStation < 9) {
            this.currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation > 9) {
            this.currentRadioStation = 0;
        }
    }
}
