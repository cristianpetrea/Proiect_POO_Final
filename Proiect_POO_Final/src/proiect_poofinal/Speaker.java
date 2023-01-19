package proiect_poofinal;

public class Speaker extends Gadget {

    private boolean onTheEar;
    private boolean hasMicrophone;
    private boolean operationalSystem;
    private int frequency;
    private int chargingTime;

    //constructor fara argument
    public Speaker() {
        super();
        onTheEar = false;
        hasMicrophone=false;
        operationalSystem = false;
        frequency = 0;
        chargingTime=0;
 
    }

    public Speaker(String brand,String culoare,String stare,String garantie, float pret,int stoc,boolean onTheEar, boolean hasMicrophone, boolean operationalSystem, int frequency, int chargingTime) {
        super(brand,culoare,stare,garantie,pret,stoc);
        this.onTheEar = onTheEar;
        this.hasMicrophone = hasMicrophone;
        this.operationalSystem = operationalSystem;
        this.frequency = frequency;
        this.chargingTime = chargingTime;
    }


    // copy constructor
    public Speaker(Speaker Speaker) {
        super();
        this.onTheEar = Speaker.onTheEar;
        this.hasMicrophone = Speaker.hasMicrophone;
        this.operationalSystem = Speaker.operationalSystem;
        this.frequency = Speaker.frequency;
        this.chargingTime = Speaker.chargingTime;
    }



    @Override
    public String toString() {
        return super.toString()+"OnTheEAr               "+onTheEar+" \n"+"Microphone              "+hasMicrophone+"\n"+"operationalSystem      "+operationalSystem+" \n"+"Frequency de          "+frequency+" hz \n"+"ChargingTime     "+chargingTime+" minute \n";
    }

    public boolean isOnTheEar() {
        return onTheEar;
    }

    public void setOnTheEar(boolean onTheEar) {
        this.onTheEar = onTheEar;
    }

    public boolean isHasMicrophone() {
        return hasMicrophone;
    }

    public void setHasMicrophone(boolean hasMicrophone) {
        this.hasMicrophone = hasMicrophone;
    }

    public boolean getOperationalSystem() {
        return operationalSystem;
    }

    public void setOperationalSystem(boolean operationalSystem) {
        this.operationalSystem = operationalSystem;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getChargingTime() {
        return chargingTime;
    }

    public void setChargingTime(int chargingTime) {
        this.chargingTime = chargingTime;
    }
}
