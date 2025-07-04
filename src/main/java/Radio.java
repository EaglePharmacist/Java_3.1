import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int station;
    private int volume;
    private int maxStations = 9;
    private int maxVolume = 100;


}