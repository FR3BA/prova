public class Motorino {
    String colore;
    double velocita;
    String tipo;
    boolean antiFurto=false;

    public Motorino(String colore, double velocita, String tipo) {
        this.colore = colore;
        this.velocita = velocita;
        this.tipo = tipo;
    }

    public double getVelocita() {
        return velocita;
    }
    public void accellera(double accellera){
        if(antiFurto==false) velocita += accellera;
    }
    public void inserisciAntifurto(){
        if (antiFurto==false) antiFurto=true;
        else antiFurto=false;
    }
}

class MotorinoImmatricolato extends Motorino{

    double maxVelocita;
    String targa;

    public MotorinoImmatricolato(String colore, double velocita, String tipo, String targa) {
        super(colore, velocita, tipo);
        maxVelocita=150;
        this.targa = targa;
    }

    public void getMaxVelocita() {
        System.out.println(maxVelocita);
    }

    @Override
    public void accellera(double accellera){
        double s;

        s=velocita+accellera;
        if(antiFurto==false)
            if(s<=maxVelocita) velocita=s;
            else velocita=maxVelocita;
    }
}
