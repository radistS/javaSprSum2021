import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class City {

    private int id;
    private String city;
    private String description;
}
