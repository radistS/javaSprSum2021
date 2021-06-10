import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ConnEx {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/hillelTest?"
                            + "useSSL=false&user=root&password=rootroot&serverTimezone=UTC");


//        System.out.println("Table name : " + rs.getMetaData().getTableName(1));
//        System.out.println("------------");
//        int columnCount = rs.getMetaData().getColumnCount();
//        for (int i = 1; i <= columnCount; i++) {
//            System.out.print("column name : " + rs.getMetaData().getColumnName(i) + ", ");
//            System.out.print("column size : " + rs.getMetaData().getColumnDisplaySize(i) + ", ");
//            System.out.println("column type : " + rs.getMetaData().getColumnTypeName(i));
//        }

//        PreparedStatement preparedStatement = connection.prepareStatement("insert into employees(first_name, last_name, age) values (?, ?, ?)");
//        List<String> cities = List.of("1", "2", "3", "4");
//        for (String city : cities) {
//            preparedStatement.setString(1, city);
//            preparedStatement.setString(2, city);
//            preparedStatement.setString(3, "0");
//            preparedStatement.executeUpdate();
//        }
//
//        Statement statement = connection.createStatement();
//        ResultSet rs = statement.executeQuery("select * from employees where age = 0");
//
//        List<Employees> employees = new ArrayList<>();
//        while (rs.next()) {
//             long id = rs.getInt(1);
//             String firstName = rs.getString(2);
//             String lastName = rs.getString(3);
//             String sex = rs.getString(4);
//             long age= rs.getInt(5);
//             String email = rs.getString(6);
//             String phone = rs.getString(7);
//             long salary= rs.getInt(8);
////
//           employees.add(new Employees().setId(id)
//                   .setFirstName(firstName)
//                   .setLastName(lastName)
//                   .setSex(sex)
//                   .setAge(age)
//                   .setPhone(phone)
//                   .setEmail(email)
//                   .setSalary(salary)
//           );
//
//        }
//
//       employees.forEach(System.out::println);

        connection.getMetaData();
    }
}
