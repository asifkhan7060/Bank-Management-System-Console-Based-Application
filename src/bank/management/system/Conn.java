package bank.management.system;
import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn() {

        try {
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","#include<stdio.h>");
            s = c.createStatement();

        } catch (Exception e) {
            System.out.print(e);
           

        }
    }

}
