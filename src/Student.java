import java.sql.*;

public class Student {
    // conn establish
    // statement creation
    // execute - query
    // conn close

    // Create DB
    public void createTable() {

    }

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
//            OR
//            pstm.executeUpdate();
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

            String query = "UPDATE student set sid = ? where sname = ?";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, 5);
            pstm.setString(2, "vansh");
            pstm.execute();
            System.out.println("data updated");
            conn.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

//    Read
    public void readData() {
        try {
            String url = "jdbc:mysql://localhost:3306/vansh";
            String userName = "root";
            String password = "Vansh@2610";
            Connection conn = DriverManager.getConnection(url, userName, password);
            String query = "SELECT * from student";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()) {
                System.out.println("id = " + rs.getInt(1));
                System.out.println("id = " + rs.getString(2));
                System.out.println("id = " + rs.getString(3));
                System.out.println();
            }
            System.out.println("Data Read");
            conn.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteData() {
        try {
            String url = "jdbc:mysql://localhost:3306/vansh";
            String userName = "root";
            String password = "Vansh@2610";
            Connection conn = DriverManager.getConnection(url, userName, password);
            Statement stm = conn.createStatement();

            String query = "DELETE FROM student WHERE sid = " + 1;
            int rowsAffected = stm.executeUpdate(query);

            if (rowsAffected > 0) {
                System.out.println("Deleted " + rowsAffected + " row(s) successfully.");
            } else {
                System.out.println("No matching student found with sid: " + 1);
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}