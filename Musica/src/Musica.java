public class Musica {
    private String genero;
    private String titulo;
    private String artista;
    public Musica(){

    }

    public Musica(String genero, String titulo, String artista) {
        this.genero = genero;
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
}
