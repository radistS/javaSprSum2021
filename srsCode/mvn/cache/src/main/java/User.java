import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class User {
    int id;
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String email;

}
