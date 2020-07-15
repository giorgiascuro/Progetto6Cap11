public class Test {
    public static void main(String[] args) {
        Film azione = new Azione();
        Film drama = new Drama();
        Film commedia = new Commedia();
        azione.setCodiceIdentificativo("01");
        drama.setCodiceIdentificativo("02");
        commedia.setCodiceIdentificativo("03");
        double penale = 0;
        penale = azione.calcolaPenaleRitardo(2);
        System.out.println(penale);
        penale = drama.calcolaPenaleRitardo(2);
        System.out.println(penale);
        penale = commedia.calcolaPenaleRitardo(2);
        System.out.println(penale);
        Film film = azione;
        penale = film.calcolaPenaleRitardo(2);
        System.out.println(penale);
        
        
        
    }
}
    