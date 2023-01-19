package proiect_poofinal;

public class Gadget implements Electronice 
{
    
public void AfisarePret(){
    System.out.println("Pretul este: ");
}
public void AfisareStoc(){
    System.out.println("Stocul este");
}
  
    String brand, culoare, stare;
    float pret;
    int stoc, garantie;
    public Gadget() {
        brand=null;
        culoare=null;
        stare=null;
        garantie=0;
        pret=0.0f;
        stoc=0;
        
    }
    public Gadget(String brand,String culoare,String stare,int garantie, float pret, int stoc) {
        this.brand=brand;
        this.culoare=culoare;
        this.stare=stare;
        this.garantie=garantie;
        this.pret=pret;
        this.stoc=stoc;
    }

   

    @Override
    public String toString() {
        return "Brandul               " + brand + "\n"+"culoarea              " + culoare + "\n"+"starea produsului     " + stare+"\n"
                + "pretul de             " + pret + " lei \n" + "garantie de           " + garantie + " ani ";
    }

}
