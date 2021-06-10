import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/aero";
    private static final String USER = "root";
    private static final String PASS = "rootroot";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/hillel?"
                        + "useSSL=false&user=root&password=rootroot&serverTimezone=UTC");


//        Connection connection = DriverManager
//                .getConnection(URL, USER, PASS);
//
//
//        Statement statement = connection.createStatement();
//        ResultSet rs = statement.executeQuery("select * from user where active = 1 and age > 18 and age <= 28 order By age, last_name");
//
//        System.out.println("Table name : " + rs.getMetaData().getTableName(1));
//        System.out.println("------------");
//        int columnCount = rs.getMetaData().getColumnCount();
//        for (int i = 1; i <= columnCount; i++) {
//            System.out.print("column name : " + rs.getMetaData().getColumnName(i) + ", ");
//            System.out.print("column size : " + rs.getMetaData().getColumnDisplaySize(i) + ", ");
//            System.out.println("column type : " + rs.getMetaData().getColumnTypeName(i));
//        }
//        List<User> students = new ArrayList<>();
//        List<Map<String, String>> userMap = new LinkedList<>();
//        while (rs.next()) {
//            int id = rs.getInt("id");
//            String idS = rs.getString("id");
//            String ln = rs.getString("last_name");
//            String fn = rs.getString("first_name");
//            int age = rs.getInt("age");
//            String phone = rs.getString("phone");
//            String email = rs.getString("email");
//
//            Map<String, String> uMap = new HashMap<>();
//            for (int i = 1; i <= columnCount; i++) {
//                String name = rs.getMetaData().getColumnName(i);
//                String value = rs.getString(rs.getMetaData().getColumnName(i));
//                        uMap.put(name,value);
//            }
//            userMap.add(uMap);
//            students.add(new User(id, ln, fn, age, phone, email));
//        }
//        System.out.println(students.size());


//        for (User st : students)
//            System.out.println(st);;
        PreparedStatement preparedStatement = connection.prepareStatement("insert into address(country, city) values (?, ?)");
        List<String> cities = List.of("Berlin", "London", "Paris", "Madrid");
        for (String city : cities) {
            preparedStatement.setString(1, "Europe");
            preparedStatement.setString(2, city);
            preparedStatement.executeUpdate();
        }
//
//        Statement st = connection.createStatement();
//        st.executeQuery("insert into address(country) value ('Spain') ");
//
//        connection.close();
    }
}
