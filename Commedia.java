public class Commedia extends Film {
    private double penale;
    public double calcolaPenaleRitardo(int giorni) {
        penale = 2.5 * giorni;
        return penale;
    }
}