package lab4ex1;

public class sistem_calcul extends echipament {
    private String tip_mon;
    private Double vit_proc;
    private Integer c_hdd;
    private Sistem_operare SO;

    public sistem_calcul(String denumire, Integer nr_inv, Double pret, String zona_mag, Stare_echipament stare, String tip_mon, Double vit_proc, Integer c_hdd, Sistem_operare SO) {
        super(denumire, nr_inv, pret, zona_mag, stare);
        this.tip_mon = tip_mon;
        this.vit_proc = vit_proc;
        this.c_hdd = c_hdd;
        this.SO = SO;
    }

    @Override
    public String toString() {
        return "sistem_calcul{" +
                "tip_mon='" + tip_mon + '\'' +
                ", vit_proc=" + vit_proc +
                ", c_hdd=" + c_hdd +
                ", SO=" + SO +
                ", denumire='" + denumire + '\'' +
                ", nr_inv=" + nr_inv +
                ", pret=" + pret +
                ", zona_mag='" + zona_mag + '\'' +
                ", stare=" + stare +
                '}';
    }
}
