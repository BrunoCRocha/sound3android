package modelo;

public class Musica {
    private long id;
    private String artista;
    private String nome;
    private String tempo;
    private Integer preco;
    private Integer capa;
    private Integer menu;



    public Musica(long id, String artista, String nome, String tempo, Integer preco, Integer capa, Integer menu){
        this.id = id;
        this.artista = artista;
        this.nome = nome;
        this.tempo = tempo;
        this.preco = preco;
        this.capa = capa;
        this.menu = menu;
    }

    public String getArtista() { return artista; }

    public void setArtista(String artista) { this.artista = artista; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getTempo() { return tempo; }

    public void setTempo(String tempo) { this.tempo = tempo; }

    public Integer getPreco() { return preco; }

    public void setPreco(Integer preco) { this.preco = preco; }

    public Integer getCapa() { return capa; }

    public void setCapa(Integer play) { this.capa = capa; }

    public Integer getMenu() { return menu; }

    public void setMenu(Integer menu) { this.menu = menu; }
}
