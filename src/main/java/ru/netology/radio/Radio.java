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

    public int getPrevRadioStation() {
        return currentRadioStation;
    }

    public void setPrevRadioStation(int currentRadioStation) {
        if (currentRadioStation > 0) {
            this.currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation < 0) {
            this.currentRadioStation = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getIncreaseVolume() {
        return currentVolume;
    }

    public void setIncreaseVolume(int currentVolume) {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }
}
