/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import javax.swing.JFrame;
import java.sql.Driver;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author EriYuni
 */
public class MainAbstract extends JFrame {
    final static String mDB = "com.mysql.jdbc.Driver";
    final static String mDBURL = "jdbc:mysql://localhost:3306/Pemesan";
    final static String mUser = "root";
    final static String mPass = "";
    public HashMap<String, String> mListMenu = new HashMap<String, String>();
}
