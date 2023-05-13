package ru.netology.radio;

public class Radio {

    private int currentStation;
    private int currentVolume;

    private int lastStation;

    public Radio() {
        lastStation = 9;
    }

    public Radio(int stationCount) {
        lastStation = stationCount - 1;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > lastStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void turnNextStation() {
        if (currentStation < lastStation) {
            currentStation = currentStation + 1;
        } else
            currentStation = 0;
    }

    public void turnPrevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else
            currentStation = lastStation;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else
            currentVolume = 100;
    }


    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else
            currentVolume = 0;
    }
}
