
package databaseconnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DataBaseConnect {

    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        
        Connection connection=null;
        
        try {
            String url="jdbc:mysql://localhost:3306/hr";
            String username="root";
            String password="hello";
            
          connection =DriverManager.getConnection(url, username, password);
          
          String insertQuery="INSERT INTO test (id,name,address,about)   VALUES (?,?,?,?)";
          
            System.out.println("Please insert INT type Id number");
            int id=sc.nextInt();
            sc.nextLine();//important
            System.out.println("Please insert STRING type name");
            String name=sc.nextLine();
            System.out.println("Enter Address");
            String address=sc.nextLine();
            System.out.println("HI!"+name+" tell me about yourself");
            String about=sc.nextLine();
            //sc.nextLine();//important after int
          
          
            try (PreparedStatement preparedStatment=connection.prepareStatement(insertQuery)){
                
                preparedStatment.setInt(1, id);
                preparedStatment.setString(2, name);
                preparedStatment.setString(3, address);
                preparedStatment.setString(4, about);
                
                int rowAffected=preparedStatment.executeUpdate();
                System.out.println(rowAffected+" row(s) inserted");
            } catch (Exception e) {
            }
          
        } catch (SQLException e) {
        }finally{
            if(connection !=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                }
            }
        }
    }
    
}
