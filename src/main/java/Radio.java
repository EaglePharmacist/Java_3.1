public class Radio {
    private int station;
    private int volume;
    private int maxStations = 9;
    private int maxVolume = 100;


    public Radio() {

    }

    public Radio(int countOfStations) {
        maxStations = countOfStations - 1;

    }


    public int getStation() {
        return station;
    }

    public void setStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > maxStations) {
            return;
        }
        station = newStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void next() {
        if (station < maxStations) {
            station++;
        } else {
            station = 0;
        }
    }

    public void prev() {
        if (station != 0) {
            station--;
        } else {
            station = maxStations;
        }
    }

    public void increaseVolume() {
        if (volume < maxVolume) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume != 0) {
            volume = volume - 1;
        }
    }

}
