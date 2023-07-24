import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    //   Test RadioStationNumber

    @Test
    public void shouldSetCurrentStationNumberMin1() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationNumber0() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(0);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationNumber1() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(1);

        int expected = 1;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationNumber8() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(8);

        int expected = 8;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationNumber9() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(9);

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationNumber10() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    //   Test next

    @Test
    public void shouldSwitchOn8() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(8);
        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchOn9() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    //    Test prev

    @Test
    public void shouldPrevSwitch1() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(1);
        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevSwitch0() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    //    Test getSoundVolume

    @Test
    public void shouldSetSoundVolumeMin1() {
        Radio radio = new Radio();

        radio.setSoundVolume(-1);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume0() {
        Radio radio = new Radio();

        radio.setSoundVolume(0);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume1() {
        Radio radio = new Radio();

        radio.setSoundVolume(1);

        int expected = 1;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume99() {
        Radio radio = new Radio();

        radio.setSoundVolume(99);

        int expected = 99;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume100() {
        Radio radio = new Radio();

        radio.setSoundVolume(100);

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume101() {
        Radio radio = new Radio();

        radio.setSoundVolume(101);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    //    Test increaseVolume

    @Test
    public void shouldIncreaseSoundVolumeMore99() {
        Radio radio = new Radio();

        radio.setSoundVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundVolumeMore101() {
        Radio radio = new Radio();

        radio.setSoundVolume(101);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    //    Test   volumeReduction

    @Test
    public void shouldVolumeReduction0() {
        Radio radio = new Radio();

        radio.setSoundVolume(0);
        radio.volumeReduction();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeReduction1() {
        Radio radio = new Radio();

        radio.setSoundVolume(1);
        radio.volumeReduction();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}

