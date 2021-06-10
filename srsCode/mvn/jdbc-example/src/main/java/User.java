import lombok.*;

@Data
@AllArgsConstructor
public class User {
    private int id;
    private String last_name;
    private String first_name;
    private int age;
    private String phone;
    private String email;
}
