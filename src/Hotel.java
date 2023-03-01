

	import java.sql.*;
	import java.util.Scanner;

		
		public class Hotel {
		    public static void main(String[] args) {
		        String url = "jdbc:sqlserver://localhost:1433;" +
		                "databaseName=HotelDBMS;" +
		                "encrypt=true;" +
		                "trustServerCertificate=true";
		        String user = "sa";
		        String pass = "root";
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter id ");
		        int id  = scanner.nextInt();
		System.out.println("enter hotel_name ");
	  String hotel_name  = scanner.next();
		System.out.println("enter hotel_location ");
		        String hotel_location  = scanner.next();
		        
		    	System.out.println("enter created_date");
		    	Integer created_date   = scanner.nextInt();
		    	
		    	System.out.println("enter updated_date ");
		    	Integer updated_date   = scanner.nextInt();
		    	
		    	System.out.println("enter is_Active  ");
		    	String is_Active    = scanner.next();
		        
		 Connection con = null;
		        try {
		Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		DriverManager.registerDriver(driver);
		            con = DriverManager.getConnection(url, user, pass);
		 Statement st = con.createStatement();
		 String sql = "Create table Hotels('" + id+ "'," + hotel_name + ",'" + hotel_location + ",'" + created_date + "'," + updated_date + "'," + is_Active +"')";
		Integer m = st.executeUpdate(sql);
		           /* if (m >= 1) {
		System.out.println("inserted successfully : " + sql);
		} else {
		System.out.println("insertion failed");
		}
		            String sql1 = "Select * from Table_1";
		ResultSet resultSet = st.executeQuery(sql1);
		             while (resultSet.next()) {
		
		}*/
		            con.close();
		} catch (Exception ex) {
		System.err.println(ex);
		}
		}
		
	}


