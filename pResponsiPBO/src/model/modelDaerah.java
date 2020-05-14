/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mysql.jdbc.Statement;
import controller.controllerDaerah;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import koneksi.koneksi;
import view.ViewDaerah;
/**
 *
 * @author DASP
 */
public class modelDaerah implements controllerDaerah{

    @Override
    public void Simpan(ViewDaerah vd) throws SQLException {
        String statuss="";
            if(vd.getPositif().getText().equals("0")){
                statuss="Zona Hijau";
            }
            else{
                statuss="Zona Merah";
            }
        try{
            Statement statement = (Statement) koneksi.getKoneksi().createStatement();
            statement.executeUpdate("insert into tb_daerah "+"(nama,odp,pdp,positif,status) VALUES ('"+ vd.getNama().getText() + "','"+ vd.getOdp().getText() +"','"+ vd.getPdp().getText() +"','"+ vd.getPositif().getText() + "','"+ statuss +"');");
            statement.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            Tampil(vd);
        }
    }

    @Override
    public void Ubah(ViewDaerah vd) throws SQLException {
        String statuss="";
            if(vd.getPositif().getText().equals("0")){
                statuss="Zona Hijau";
            }
            else{
                statuss="Zona Merah";
            }
        try{
            Statement statement = (Statement) koneksi.getKoneksi().createStatement();
            statement.executeUpdate("update tb_daerah SET nama='"+vd.getNama().getText()+"',"+"odp='"+vd.getOdp().getText()+"',"+"pdp='"+vd.getPdp().getText()+"',"+"positif='"+vd.getPositif().getText()+"',"+"status='"+statuss+"'"+"WHERE id='"+vd.getId().getText()+"'");
            statement.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil diubah");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            Tampil(vd);
            Baru(vd);
        }
    }

    @Override
    public void Hapus(ViewDaerah vd) throws SQLException {
        try{
            Statement statement = (Statement) koneksi.getKoneksi().createStatement();
            statement.executeUpdate("delete from tb_daerah where id='"+vd.getId().getText()+"';");
            JOptionPane.showMessageDialog(null, "Data Berhasil dihapus");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            Tampil(vd);
            Baru(vd);
        }
    }

    @Override
    public void Tampil(ViewDaerah vd) throws SQLException {
        vd.datatable();
    }

    @Override
    public void Baru(ViewDaerah vd) {
        vd.kosong();
    }

}
