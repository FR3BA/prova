public class UsoMotorino {

    public static void main(String args[]){
        double velocita;

        Motorino moto1 = new Motorino("grigio", 40.5, "Piaggio Liberty");
        velocita=moto1.getVelocita();

        MotorinoImmatricolato moto2 = new MotorinoImmatricolato("rosso", 30.5, "Aprilia Scarabeo", "CV1234");
        moto2.getMaxVelocita();

        moto1.accellera(30.7);
        moto2.accellera(30.7);
        System.out.println(moto1.getVelocita());
        System.out.println(moto2.getVelocita());
    }
}
