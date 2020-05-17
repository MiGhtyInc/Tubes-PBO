/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

/**
 *
 * @author IKHBAL
 */
public class Pesan {
    private String mNama;
    private String mMenu;
    private static int mPesanan = 0;
    public Pesan(String mNama, String mMenu) {
        this.mNama = mNama;
        this.mMenu = mMenu;
    }
    public void tambahPesanan() {
        mPesanan++;
    }
    public int getPesanan() {
        return mPesanan;
    }
}
