public class Radio {
    private int station;
    private int volume;


    public int getStation() {
        return station;
    }

    public void setStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > 9) {
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
        if (station < 9) {
            station++;
        } else {
            station = 0;
        }
    }

    public void prev() {
        if (station != 0) {
            station--;
        } else {
            station = 9;
        }
    }

    public void increaseVolume() {
        if (volume < 10) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume(){
        if (volume !=0){
            volume = volume - 1;
        }
    }

}
