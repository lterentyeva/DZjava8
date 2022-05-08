package ru.netology.radio;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;
    private int quantityRadioStation = 10;
    private int maxRadioStation = 9;
    private int minRadioStation;
    private int maxVolume = 100;
    private int minVolume;

    public Radio(int quantityRadioStation) {
        this.minRadioStation = 0;
        this.maxRadioStation = quantityRadioStation - 1;
        this.quantityRadioStation = quantityRadioStation;
    }

    public Radio() {

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation <= minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getNextRadioStation() {
        return currentRadioStation;
    }

    public void setNextRadioStation(int currentRadioStation) {
        if (currentRadioStation < maxRadioStation) {
            this.currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation > maxRadioStation) {
            this.currentRadioStation = minRadioStation;
        }
    }

    public int getPrevRadioStation() {
        return currentRadioStation;
    }

    public void setPrevRadioStation(int currentRadioStation) {
        if (currentRadioStation > minRadioStation) {
            this.currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation <= minRadioStation) {
            this.currentRadioStation = maxRadioStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getIncreaseVolume() {
        return currentVolume;
    }

    public void setIncreaseVolume(int currentVolume) {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public int getDecreaseVolume() {
        return currentVolume;
    }

    public void setDecreaseVolume(int currentVolume) {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }
}
