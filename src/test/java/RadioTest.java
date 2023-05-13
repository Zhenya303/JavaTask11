import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {

    @Test

    public void testRadioStation() {

        Radio radio = new Radio();

        Assertions.assertEquals(0, radio.getCurrentStation());

    }

    @Test

    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetStationAboveMax() {

        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldNotSetStationBelowMin() {

        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldTurnNextStation() {

        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.turnNextStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldTurnPrevStation() {

        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.turnPrevStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldTurnNextStationFromLastToFirst() {

        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.turnNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldTurnPrevStationFromFirstToLast() {

        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.turnPrevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void shouldSetStationCount20() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(18);

        int expected = 18;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void shouldNotSetStationCount20AboveMax() {

        Radio radio = new Radio(20);

        radio.setCurrentStation(22);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldNotSetStationCount20BelowMin() {

        Radio radio = new Radio(20);

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldTurnNextStationCount20() {

        Radio radio = new Radio(20);
        radio.setCurrentStation(15);

        radio.turnNextStation();

        int expected = 16;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldTurnPrevStationCount20() {

        Radio radio = new Radio(20);
        radio.setCurrentStation(15);

        radio.turnPrevStation();

        int expected = 14;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldTurnNextStationCount20FromLastToFirst() {

        Radio radio = new Radio(20);
        radio.setCurrentStation(19);

        radio.turnNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldTurnPrevStationCount20FromFirstToLast() {

        Radio radio = new Radio(20);
        radio.setCurrentStation(0);

        radio.turnPrevStation();

        int expected = 19;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetVolumeBelow0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetVolumeAbove100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldIncreaseVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldDecreaseVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.decreaseVolume();

        int expected = 49;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldNotSetVolumeAboveMax() {

        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldNotSetVolumeBelowMin() {

        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}