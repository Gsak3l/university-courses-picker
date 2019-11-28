package MVC.Model;

import java.util.ArrayList;
import java.util.List;

public class Kathigitis extends Account {
    private String eidikotita;
    private String tmima;
    private List<Mathima> mathimata = new ArrayList<>();

    public Kathigitis(String username, String password, String onomateponumo, String eidikotita, String tmima, List<Mathima> mathimata) {
        super(username, password, onomateponumo);
        this.eidikotita = eidikotita;
        this.tmima = tmima;
        this.mathimata = mathimata;
    }

    public String getEidikotita() {
        return eidikotita;
    }

    public void setEidikotita(String eidikotita) {
        this.eidikotita = eidikotita;
    }

    public String getTmima() {
        return tmima;
    }

    public void setTmima(String tmima) {
        this.tmima = tmima;
    }

    public List<Mathima> getMathimata() {
        return mathimata;
    }

    public void setMathimata(List<Mathima> mathimata) {
        this.mathimata = mathimata;
    }
    
    @Override
    public String getIdiotita() {
        return "Professor";
    }

    @Override
    public String toString() {
        return this.getUsername();
    }
}