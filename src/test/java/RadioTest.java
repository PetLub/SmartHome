import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void testConstructorWithoutParameters() {
        Radio radio = new Radio();
        Assertions.assertEquals(10, radio.getNumberOfRadioStation());
    }

    @Test
    public void testConstructorWithParameters() {
        Radio radio = new Radio(50);
        Assertions.assertEquals(50, radio.getNumberOfRadioStation());
        Assertions.assertEquals(49, radio.getMaxStationNumber());
    }

    @Test
    public void shouldSetCurrentStationNumberMin1() {

        radio.setCurrentStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationNumber0() {

        radio.setCurrentStationNumber(0);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationNumber1() {

        radio.setCurrentStationNumber(1);

        int expected = 1;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationNumber8() {

        radio.setCurrentStationNumber(8);

        int expected = 8;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationNumber9() {

        radio.setCurrentStationNumber(9);

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationNumber10() {

        radio.setCurrentStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    //
    @Test
    public void shouldSwitchOn8() {

        radio.setCurrentStationNumber(8);
        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchOn9() {

        radio.setCurrentStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevSwitch1() {

        radio.setCurrentStationNumber(1);
        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevSwitch0() {

        radio.setCurrentStationNumber(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolumeMin1() {

        radio.setSoundVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume0() {

        radio.setSoundVolume(0);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume1() {

        radio.setSoundVolume(1);

        int expected = 1;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume99() {

        radio.setSoundVolume(99);

        int expected = 99;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume100() {

        radio.setSoundVolume(100);

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume101() {

        radio.setSoundVolume(101);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolumeMore99() {

        radio.setSoundVolume(100);
        radio.increaseSoundVolume();

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolumeMore101() {

        radio.setSoundVolume(101);
        radio.increaseSoundVolume();

        int expected = 1;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolume0() {

        radio.setSoundVolume(0);
        radio.decreaseSoundVolume();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseSoundVolume1() {

        radio.setSoundVolume(1);
        radio.decreaseSoundVolume();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

}