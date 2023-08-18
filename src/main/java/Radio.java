
public class Radio {


    //   RadioStationNumber
    private int currentStationNumber = 0;
    private int soundVolume = 0;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int newStationNumber) {
        if (newStationNumber < 0) {
            return;
        }
        if (newStationNumber > 9) {
            return;
        }
        currentStationNumber = newStationNumber;
    }

    public void next() {
        if (currentStationNumber == 9) {
            currentStationNumber = 0;
        } else {
            currentStationNumber++;
        }
    }

    public void prev() {
        if (currentStationNumber == 0) {
            currentStationNumber = 9;
        } else {
            currentStationNumber--;
        }
    }

    //     SoundVolume


    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 100) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void increaseVolume() {
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        }
    }

    public void volumeReduction() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
    }
}











