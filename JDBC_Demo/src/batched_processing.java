import java.sql.*;
public class batched_processing {
	//********before running make sure you open mysql command line client there just use mydb database and trucate the table students
	//and make sure table students is empty 
public static void main(String[] args) throws SQLException {
	  String url = "jdbc:mysql://localhost:3306/mydb";
      String user = "root";
      String password = "ved@sqltext@2003";
      String sql = "INSERT INTO students (name, age) VALUES (?, ?)";//id column ko autoincrement kiya hai so no need to mention/use it here
//(use describe students; in mysql client to see table defination, constraints etc)

      // Use try-with-resources for automatic resource management
      try (Connection conn = DriverManager.getConnection(url, user, password);PreparedStatement pstmt = conn.prepareStatement(sql);)
//Try-with-resources:automatically closes resources(like files, database connections) when they're no longer needed — without requiring an explicit finally block   
//Because many resources (like Connection, Statement, ResultSet, etc.) must be closed after use to prevent resource leaks.
//Try-with-resources ensures they are closed automatically, even if an exception occurs.
      {
          Class.forName("com.mysql.cj.jdbc.Driver");

// Disable auto-commit for transaction control (recommended)
// ✅ conn.setAutoCommit(false): Batching is more efficient when you control transactions.
// ✅ conn.commit(): Finalizes the transaction after the batch executes.
          conn.setAutoCommit(false);

          for (int i = 0; i < 500; i++) {
              pstmt.setString(1, "Employee" + i);
              pstmt.setInt(2, 25 + (i % 10));
              pstmt.addBatch();  // Add to batch

              // Execute every 100 records
              if (i % 100 == 0 ) {
                  pstmt.executeBatch();
              }
          }

          // Execute any remaining statements for example if you take   for (int i = 0; i < 550; i++) The last 50 records would be skipped unless we do below method
          pstmt.executeBatch();

          // Commit the transaction
          conn.commit();

          System.out.println("Batch processing completed successfully.");
       
      } catch (SQLException | ClassNotFoundException e) {
    	
    	  e.printStackTrace();  // You can log this instead of printing
      }
   
}}
/* Example: Read and insert data using try-with-resources
 import java.sql.*;
import java.sql.*;

public class ReadEmployees {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "your_password_here";

        // SQL queries
        String insertSql = "INSERT INTO employees (name, age) VALUES (?, ?)";
        String selectSql = "SELECT id, name, age FROM employees";

        try (
            Connection conn = DriverManager.getConnection(url, user, password);
        ) {
            // Insert a new employee
            try (PreparedStatement insertStmt = conn.prepareStatement(insertSql)) {
                insertStmt.setString(1, "NewEmployee");
                insertStmt.setInt(2, 30);
                int rowsInserted = insertStmt.executeUpdate();
                System.out.println("Rows inserted: " + rowsInserted);
            }

            // Now read all employees
            try (
                PreparedStatement selectStmt = conn.prepareStatement(selectSql);
                ResultSet rs = selectStmt.executeQuery();
            ) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int age = rs.getInt("age");

                    System.out.printf("ID: %d, Name: %s, Age: %d%n", id, name, age);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

*/
