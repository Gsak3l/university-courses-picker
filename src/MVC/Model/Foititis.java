/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.Model;

/**
 *
 * @author stini
 */
public class Foititis extends Account {
    private int AM;
    private String tmima;
    private int eksamino;
    private String dieuthinsi;
    //private StoixeiaEggrafis stoixeiaEggrafis;

    public Foititis(String username, String password, String mail, String onomateponumo, String tilefwno, int AM, String tmima, int eksamino, String dieuthinsi) {
        super(username, password, mail, onomateponumo, tilefwno);
        this.AM = AM;
        this.tmima = tmima;
        this.eksamino = eksamino;
        this.dieuthinsi = dieuthinsi;
        //this.stoixeiaEggrafis = stoixeiaEggrafis;
    }

    public String getTmima() {
        return tmima;
    }

    public void setTmima(String tmima) {
        this.tmima = tmima;
    }

    public int getEksamino() {
        return eksamino;
    }

    public void setEksamino(int eksamino) {
        this.eksamino = eksamino;
    }

    public String getDieuthinsi() {
        return dieuthinsi;
    }

    public void setDieuthinsi(String dieuthinsi) {
        this.dieuthinsi = dieuthinsi;
    }
    
    public int getAM(){
        return this.AM;
    }
    public void setAM(int AM) {
        this.AM = AM;
    }
    public String getIdiotita() {
        return "Student";
    }

    public String toString() {
        return this.getUsername();
    }
}