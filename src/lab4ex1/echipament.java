package lab4ex1;


public abstract class echipament {
protected String denumire;
protected Integer nr_inv;
protected Double pret;
protected String zona_mag;
protected Stare_echipament stare;

public echipament(String denumire, Integer nr_inv, Double pret, String zona_mag, Stare_echipament stare) {
    this.denumire=denumire;

    this.pret=pret;
    this.stare=stare;
    this.nr_inv=nr_inv;
    this.zona_mag=zona_mag;

}
    @Override
    public String toString() {
        return "echipament{" +
                "denumire='" + denumire + '\'' +
                ", nr_inv=" + nr_inv +
                ", pret=" + pret +
                ", zona_mag='" + zona_mag + '\'' +
                ", stare=" + stare +
                '}';
    }
}
