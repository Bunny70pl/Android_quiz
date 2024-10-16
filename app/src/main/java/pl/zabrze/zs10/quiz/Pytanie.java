package pl.zabrze.zs10.quiz;

public class Pytanie {
    private String tresc;
    private String podpowiedz;
    private boolean poprawna;
    private boolean udzielnoPoprawnaOdpowiedz;

    public Pytanie(String tresc, String podpowiedz, boolean poprawna) {
        this.tresc = tresc;
        this.podpowiedz = podpowiedz;
        this.poprawna = poprawna;
        udzielnoPoprawnaOdpowiedz = false;
    }

    public void setUdzielnoPoprawnaOdpowiedz(boolean udzielnoPoprawnaOdpowiedz) {
        this.udzielnoPoprawnaOdpowiedz = udzielnoPoprawnaOdpowiedz;
    }

    public String getTresc() {
        return tresc;
    }

    public String getPodpowiedz() {
        return podpowiedz;
    }

    public boolean isPoprawna() {
        return poprawna;
    }

    public boolean isUdzielnoPoprawnaOdpowiedz() {
        return udzielnoPoprawnaOdpowiedz;
    }
}
