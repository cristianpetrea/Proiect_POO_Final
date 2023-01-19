
package proiect_poofinal;

public class Casti extends Gadget {
    private String tip;
    private String functii;
    private boolean microfon;
    private int putere;

    public Casti() {
        super();
        tip = null;
        functii = null;
        microfon = false;
        putere = 0;
    }

    public Casti(String brand, String culoare, String stare, int garantie, float pret, int stoc, String tip,
            String functii, boolean microfon, int putere) {

        super(brand, culoare, stare, garantie, pret, stoc);
        this.tip = tip;
        this.functii = functii;
        this.microfon = microfon;
        this.putere = putere;
    }

    public Casti(Casti c) {
        super();
        this.tip = c.tip;
        this.functii = c.functii;
        this.microfon = c.microfon;
        this.putere = c.putere;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getFunctii() {
        return functii;
    }

    public void setFunctii(String functii) {
        this.functii = functii;
    }

    public boolean getMicrofon() {
        return microfon;
    }

    public void setMicrofon(boolean microfon) {
        this.microfon = microfon;
    }

    public int getPutere() {
        return putere;
    }

    public void setPutere(int putere) {
        this.putere = putere;
    }

    @Override
    public String toString() {
        return super.toString() + " \ncasti de {" + "tip=" + tip + ", \nfunctii=" + functii + ", \nmicrofon=" + microfon
                + ", \nputere=" + putere + '}' + "\n";
    }

    @Override
    public void AfisarePret() {
        System.out.println("Pretul este: " + pret);
    }

    @Override
    public void AfisareStoc() {
        System.out.println("Stocul este: " + stoc);
    }

}