import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(chain = true)
@ToString
public class Employees {
    private long id;
    private String firstName;
    private String lastName;
    private String sex;
    private long age;
    private String email;
    private String phone;
    private long salary;
}
