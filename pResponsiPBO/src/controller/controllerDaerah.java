/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import view.ViewDaerah;

/**
 *
 * @author DASP
 */
public interface controllerDaerah {
    public void Simpan(ViewDaerah vd) throws SQLException;
    public void Ubah(ViewDaerah vd) throws SQLException;
    public void Hapus(ViewDaerah vd) throws SQLException;
    public void Tampil(ViewDaerah vd) throws SQLException;
    public void Baru(ViewDaerah vd);
}
