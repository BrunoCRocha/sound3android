package modelo;

import java.util.ArrayList;

import pt.ipleiria.estg.dei.amsi.sound3.R;

public class SingletonGestorMusicas {

    private static SingletonGestorMusicas INSTANCE = null;

    private ArrayList<Musica> musicas;

    public static synchronized SingletonGestorMusicas getInstance() {
        if(INSTANCE == null){
            INSTANCE = new SingletonGestorMusicas();
        }
        return INSTANCE;
    }

    private SingletonGestorMusicas() {
        musicas = new ArrayList<>();
        gerarFakeData();
    }

    private void gerarFakeData(){
        musicas.add(new Musica(1, "Travis Scott", "Astroworld","3:14", 5, R.drawable.travis_scott, R.drawable.dots_menu));

    }

    public ArrayList<Musica> getLivros() {
        return musicas;
    }
}
