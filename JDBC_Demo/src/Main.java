import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//before running make sure you open mysql command line client there just use mydb database and trucate the table students
//and make sure table students is empty 
public class Main { //this url is copied from mySqlWorkbench 
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
		Connection connection=DriverManager.getConnection(url,username,password);//.getConnection() throws SQLException
		Statement statement=connection.createStatement();
	     // Insert query to add two new students
        String insertQuery = "INSERT INTO students (id, name, age, marks) VALUES " +
                             "(101, 'Alice', 20, 88.5)," +
                             "(102, 'Bob', 22, 91.0)";
        int rows_affected=statement.executeUpdate(insertQuery); // Use executeUpdate for INSERT/UPDATE/DELETE
        if(rows_affected>0) {
        	System.out.println(rows_affected+ "rows affected!");
        }
        else if(rows_affected==0) {System.out.println("zero rows affected");}
        
        // Update Alice's age to 23
        String updateQuery = "UPDATE students SET age = 23 WHERE name = 'Alice'";
        int updateCount = statement.executeUpdate(updateQuery);
        if (updateCount > 0) {
            System.out.println(updateCount + " row(s) updated (Alice's age updated to 23).");
        } else {
            System.out.println("No rows updated.");
        }
        //Delete Query	
        String deleteQuery="DELETE FROM students WHERE name='Bob'";
        int delete_count=statement.executeUpdate(deleteQuery);
        if(delete_count>0) {
        	System.out.println("Bob deleted :(");
        }
        else { 
        	System.out.println("Bob not there so not deleted :)");
        }
		
        String query_1="select *from students";
		ResultSet resultSet=statement.executeQuery(query_1);
		while(resultSet.next())
		{/*boolean java.sql.ResultSet.next() throws SQLException Returns true if the new current row is valid; false if there are no more rows
		   Throws:SQLException - if a database access error occurs or this method is called on a closed result set*/
			
			int id=resultSet.getInt("id"); //ye joh " " ke andar dikh raha woh apne databse ke coloumn name hai 
			String name=resultSet.getString("name");
			int age=resultSet.getInt("age");
			double marks=resultSet.getDouble("marks");
			
			System.out.println("\nID: "+id);
			System.out.println("NAME: "+name);
			System.out.println("AGE: "+age);
			System.out.println("MARKS: "+ marks);
			
			
			
		}
		statement.close();//to avoid resource leak
		connection.close();
		 
	}catch(SQLException e){
		e.printStackTrace();
	}

	
	

	
	}
}
