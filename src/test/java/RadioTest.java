import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldGetStation(){
        radio.setStation(6);
        int expected = 6;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation(){

        radio.setStation(5);
        int expected = 5;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNextStation1(){
        radio.setStation(4);
        radio.next();
        int expected = 5;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation2(){
        radio.setStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation3(){
        radio.setStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation1(){
        radio.setStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation2(){
        radio.setStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation3(){
        radio.setStation(10);
        radio.prev();
        int expected = 9;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation4(){
        radio.setStation(-1);
        radio.prev();
        int expected = 9;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetVolume(){
        radio.setVolume(6);
        int expected = 6;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume(){

        radio.setVolume(5);
        int expected = 5;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume1(){

        radio.setVolume(5);
        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume2(){

        radio.setVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume3(){

        radio.setVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldDecreaseVolume1(){

        radio.setVolume(10);
        radio.decreaseVolume();
        int expected = 9;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolume3(){

        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }
}
