public abstract class Film {
    private String codiceIdentificativo;
    private String titolo;
    public void setCodiceIdentificativo(String codiceIdentificativo) {
        this.codiceIdentificativo = codiceIdentificativo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public String getCodiceIdentificativo() {
        return codiceIdentificativo;
    }
    public String getTitolo() {
        return titolo;
    }
    public boolean equals(Object altroOggetto) {
        boolean uguale = false;
        if((altroOggetto != null) && (altroOggetto instanceof Film)) {
            Film altroFilm = (Film)altroOggetto;
            uguale = this.codiceIdentificativo == altroFilm.codiceIdentificativo;
        }
        return uguale;
    }
    public abstract double calcolaPenaleRitardo(int giorni);
}
    
 