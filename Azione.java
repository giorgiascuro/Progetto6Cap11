public class Azione extends Film {
    private double penale;
    public double calcolaPenaleRitardo(int giorni) {
        penale = 3 * giorni;
        return penale;
    }
}
    
    