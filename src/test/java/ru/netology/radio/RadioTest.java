package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // Тест на ограничения максимального звука больше 10:
    @Test
    public void shouldNotSetSoundVolumeMoreMax() {
        Radio radio = new Radio();

        radio.setSoundVolume(11);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Тест на ограничения минимального звука меньше 0:
    @Test
    public void shouldNotSetSoundVolumeLessMin() {
        Radio radio = new Radio();

        radio.setSoundVolume(-1);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Тест на увеличение громкости на 1:
    @Test
    public void shouldIncreaseSoundVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(7);
        radio.IncreaseSoundVolume();

        int expected = 8;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Тест на уменьшение громкости на 1:
    @Test
    public void shouldDecreaseSoundVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(7);
        radio.decreaseSoundVolume();

        int expected = 6;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Тест нет увеличение громкости на 1 при максимальной громкости:
    @Test
    public void shouldNotIncreaseSoundVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setSoundVolume(10);
        radio.IncreaseSoundVolume();

        int expected = 10;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Тест нет уменьшения громкости на 1 при минимальной громкости:
    @Test
    public void shouldNotDecreaseSoundVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setSoundVolume(0);
        radio.decreaseSoundVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Тест на переключение радиостанций кнопкой "следующая" от 0 до 9:
    @Test
    public void shouldSwitchNextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(3);
        radio.nextRadioStation();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // Тест на переключение радиостанций кнопкой "следующая" с 9 на 0:
    @Test
    public void shouldSwitchNextRadioStationWith9On0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // Тест на переключение радиостанций кнопкой "предыдущая" от 0 до 9:
    @Test
    public void shouldSwitchPrevRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);
        radio.prevRadioStation();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // Тест на переключение радиостанций кнопкой "предыдущая" с 0 на 9:
    @Test
    public void shouldSwitchPrevRadioStationWith0On9() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // Тест на выбор радиостанции по указанию номера в пределах с 0 до 9:
    @Test
    public void shouldSetAnyRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // Тест на ограничение радиостанции по указанию номера в пределах выше 9:
    @Test
    public void shouldNotSetRadioStationMore9() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // Тест на ограничение радиостанции по указанию номера в пределах ниже 0:
    @Test
    public void shouldNotSetRadioStationLess0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // Тест на переключение радиостанций кнопкой "следующая" с 8 на 9:
    @Test
    public void shouldSwitchNextRadioStationWith8On9() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.nextRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // Тест на переключение радиостанций кнопкой "следующая" с 0 на 1:
    @Test
    public void shouldSwitchNextRadioStationWith0On1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.nextRadioStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // Тест на переключение радиостанций кнопкой "предыдущая" с 9 на 8:
    @Test
    public void shouldSwitchPrevRadioStationWith9On8() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.prevRadioStation();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    // Тест на переключение радиостанций кнопкой "предыдущая" с 1 на 0:
    @Test
    public void shouldSwitchPrevRadioStationWith1On0() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);
        radio.prevRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

}
