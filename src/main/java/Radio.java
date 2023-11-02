
public class Radio {
    private int numberOfRadioStation = 10;
    private int minStationNumber = 0;
    private int maxStationNumber = 9;
    private int currentStationNumber = 0;
    private int soundVolume = 0;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;

    public Radio() {
    }

    public Radio(int numberOfRadioStation) {
        this.numberOfRadioStation = numberOfRadioStation;
        maxStationNumber = numberOfRadioStation - 1;
    }

    public int getMaxStationNumber() {
        return maxStationNumber;
    } // для тестов

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public int getNumberOfRadioStation() {
        return numberOfRadioStation;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber < 0) {
            return;
        }
        if (newCurrentStationNumber > maxStationNumber) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public void next() {
        if (currentStationNumber == maxStationNumber) {
            currentStationNumber = 0;
        } else {
            currentStationNumber++;
        }
    }

    public void prev() {
        if (currentStationNumber == minStationNumber) {
            currentStationNumber = 9;
        } else {
            currentStationNumber--;
        }
    }

    // ===================================Volume===================================
    public int getCurrentSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < minSoundVolume) {
            return;
        }
        if (newSoundVolume > maxSoundVolume) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void increaseSoundVolume() {
        if (soundVolume < maxSoundVolume) {
            soundVolume = soundVolume + 1;
        }
    }

    public void decreaseSoundVolume() {
        if (soundVolume > minSoundVolume) {
            soundVolume = soundVolume - 1;
        }
    }
}