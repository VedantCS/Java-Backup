import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//********before running make sure you open mysql command line client there just use mydb database and trucate the table students
//and make sure table students is empty 
public class JdbcPreparedStatementExample {
	 //this url is copied from mySqlWorkbench 
		private static final String url="jdbc:mysql://localhost:3306/mydb";//?user=root is replaced by mydb which is our database name 
		private static final String username="root";
		private static final String password="ved@sqltext@2003";

		
		public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); }
	/*forName() is used to load a driver and a string is passed to this method
	 com.mysql.cj ye ek package hai iske andar hai jdbc ke drivers hai("com.mysql.cj.jdbc.Driver" is the fully qualified class name of the J driver) 
	this method throws exception so we need to handle it*/ 
		
		catch (ClassNotFoundException e) {
			        e.printStackTrace(); // to handle it more gracefully or can write a print statment of ur own
			    }
	 
		try {
			Connection connection=DriverManager.getConnection(url,username,password);
			String insertQuery = "INSERT INTO students(id,name, age, marks) VALUES (?, ?, ?, ?)";

			 PreparedStatement ps=connection.prepareStatement(insertQuery);
			 	ps.setInt(1, 101);     //id    
	            ps.setString(2, "John");   //name
	            ps.setInt(3, 21);   //age
	            ps.setDouble(4, 94.48);  //marks    
	            int rows1= ps.executeUpdate();
//----------------Always execute ps.executeUpdate() after each student insert.-----------------
	         // Insert second student
	            ps.setInt(1, 102);       // New ID
	            ps.setString(2, "Alice"); // New Name
	            ps.setInt(3, 22);         // New Age
	            ps.setDouble(4, 88.75);   // New Marks
	            int rows2= ps.executeUpdate();

	        
			 
	          
	            if (rows1 > 0 && rows2 > 0) {
	                System.out.println("2 new students were inserted successfully!");
	            } else {
	                System.out.println("Failed to insert the students.");
	            }
	            
	            String updateQuery = "UPDATE students SET name = ?, age = ?, marks = ? WHERE id = ?";
	            PreparedStatement psUpdate = connection.prepareStatement(updateQuery);
	            psUpdate.setString(1, "John Updated");  // New Name
                psUpdate.setInt(2, 22);                 // New Age
                psUpdate.setDouble(3, 98.50);           // New Marks
                psUpdate.setInt(4, 101);                // ID of the student to be updated
	            
                int rowsUpdated = psUpdate.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Student details updated successfully!");
                } else {
                    System.out.println("Failed to update the student.");
                }


        // Delete query
                String deleteQuery = "DELETE FROM students WHERE id = ?";
                PreparedStatement psDelete = connection.prepareStatement(deleteQuery);
                psDelete.setInt(1, 101);  // ID of the student to be deleted
                int rowsDeleted = psDelete.executeUpdate();
                if (rowsDeleted > 0) {
                    System.out.println("Student was deleted successfully!");
                } else {
                    System.out.println("Failed to delete the student.");
                }
                // === Display remaining students ===
                System.out.println("\nRemaining students in the table:");
                String selectQuery = "SELECT * FROM students";
                PreparedStatement psSelect = connection.prepareStatement(selectQuery);
                ResultSet resultSet = psSelect.executeQuery();

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    int age = resultSet.getInt("age");
                    double marks = resultSet.getDouble("marks");

                    System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Marks: " + marks);
                }
                
	            // Step 6: Close the resources
	            ps.close();
	            connection.close();}
	            catch (SQLException e) {
	                e.printStackTrace();
	            }
}
	}
