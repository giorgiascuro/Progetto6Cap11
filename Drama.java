public class Drama extends Film {
    private double penale;
    public double calcolaPenaleRitardo(int giorni) {
        penale = 2 * giorni;
        return penale;
    }
}