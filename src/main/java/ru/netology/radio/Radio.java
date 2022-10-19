package ru.netology.radio;

public class Radio {

    private int currentRadioStation;
    private int soundVolume;
    private int amountRadioStation;

    public Radio() {

        this.amountRadioStation = 10;
    }

    public Radio (int amountRadioStation){

        this.amountRadioStation = amountRadioStation;
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public int getSoundVolume() {

        return soundVolume;
    }

    // Ограничения звука по минимуму и максимуму:
    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 100) {
            return;
        }

        soundVolume = newSoundVolume;
    }

    // Увеличение звука на 1:
    public void IncreaseSoundVolume() {
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        }

    }

    // Уменьшение звука на 1:
    public void decreaseSoundVolume() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }

    }

    // Ограничения радиостанций по минимуму и максимуму:
    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > amountRadioStation - 1) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    // Переключение радиостанций кнопкой "слудующая":
    public int nextRadioStation() {
        if (currentRadioStation < amountRadioStation - 1) {
            return currentRadioStation = currentRadioStation + 1;

        } else {
            return currentRadioStation = 0;

        }

    }

    // Переключение радиостанций кнопкой "предыдущая":
    public int prevRadioStation() {
        if (currentRadioStation > 0) {
            return currentRadioStation = currentRadioStation - 1;

        } else {
            return currentRadioStation = amountRadioStation - 1;
        }

    }

}
