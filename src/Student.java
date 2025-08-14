import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Student {
    // conn establish
    // statement creation
    // execute - query
    // conn close

    // Create DB
    public void createDB() {
        try {
            String url = "jdbc:mysql://localhost:3306/vansh";
            String userName = "root";
            String password = "Vansh@2610";
            Connection conn = DriverManager.getConnection(url, userName, password);
            Statement stm = conn.createStatement();

            String query = "create table student (sid int(3), sname varchar(200), semail varchar(200))";
            stm.executeUpdate(query);

            System.out.println("Table created");
            conn.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void createTable() {

    }

//    Create
    public void createData() {
        try {
            String url = "jdbc:mysql://localhost:3306/vansh";
            String userName = "root";
            String password = "Vansh@2610";
            Connection conn = DriverManager.getConnection(url, userName, password);

            String query = "INSERT into student (sid, sname, semail) VALUES (?, ?, ?)";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, 10);
            pstm.setString(2, "vansh");
            pstm.setString(3, "goelv2610@gmail.com");
            pstm.execute();
            System.out.println("data inserted");
            conn.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // Update
    public void updateData() {
        try {
            String url = "jdbc:mysql://localhost:3306/vansh";
            String userName = "root";
            String password = "Vansh@2610";
            Connection conn = DriverManager.getConnection(url, userName, password);

            String query = "INSERT into student (sid, sname, semail) VALUES (?, ?, ?)";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, 1);
            pstm.setString(2, "Vansh");
            pstm.setString(3, "goelvansh770@gmail.com");
            pstm.executeUpdate();
            System.out.println("data inserted");
            conn.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}