/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaMyProject;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author zaman
 */
public class Db_Connection {
    //public static void main(String[]args){
      //  Db_Connection db=new  Db_Connection();
      //  System.out.println(db.geConnection());
   // }
    public Connection geConnection(){
        Connection connection=null;
        try{
              Class.forName("com.mysql.cj.jdbc.Driver");
              connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/swing", "root", "1234");
            
        }catch(Exception e){
            System.out.print(e);
            
        }
        
        return  connection;
    }
    
}
