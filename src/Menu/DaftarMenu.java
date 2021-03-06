/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author EriYuni
 */
public class DaftarMenu extends MainAbstract {
    public DaftarMenu() {
        mListMenu.put("Sosis Bakar", "1");
        mListMenu.put("Nasi Goreng", "1");
        mListMenu.put("Donat Kukus", "1");
        mListMenu.put("Somay Bandung", "1");
        mListMenu.put("Bubur Ayam", "1");
        mListMenu.put("Jus Mangga", "2");
        mListMenu.put("Jus Buah Naga", "2");
        mListMenu.put("Es Campur", "2");
        mListMenu.put("Pop Ice", "2");
        mListMenu.put("Air Mineral", "2");
        mListMenu.put("Ayam Geprek", "3");
        mListMenu.put("Nasi Uduk", "3");
        mListMenu.put("Ayam Bakar", "3");
        mListMenu.put("Ayam Goreng", "3");
        mListMenu.put("Seblak", "3");
        mListMenu.put("Nasi Bakar", "4");
        mListMenu.put("Oreo Goreng", "4");
        mListMenu.put("Nextar", "4");
        mListMenu.put("Tempe", "4");
        mListMenu.put("Tahu", "4");
        mListMenu.put("Soto Lamongan", "5");
        mListMenu.put("Rendang", "5");
        mListMenu.put("Sate Padang", "5");
        mListMenu.put("Ayam McD", "5");
        mListMenu.put("Kentang Goreng", "5");
        try {
            Class.forName(mDB);
            Connection mKoneksi = DriverManager.getConnection(mDBURL, mUser, mPass);
            Statement statement = mKoneksi.createStatement();
            for (Map.Entry<String, String> entry : mListMenu.entrySet()) {
                String mMenu = entry.getKey();
                String mNoKantin = entry.getValue();
                String input = "INSERT INTO daftar_menu VALUES('" +mMenu+ "' , '" +mNoKantin+ "');";
                statement.executeUpdate(input);
            }
            statement.close();
            mKoneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Gagal koneksi ke database");
        }
    }
}
