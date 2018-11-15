package pt.ipleiria.estg.dei.amsi.sound3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import adaptadores.ListaMusicaAdaptador;
import modelo.Musica;
import modelo.SingletonGestorMusicas;


public class ListaMusicas extends AppCompatActivity {

    private ListView lvListView;
    private ArrayList<Musica> listaMusicas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_musicas);

        listaMusicas = SingletonGestorMusicas.getInstance().getLivros();
        lvListView = findViewById(R.id.lvListaMusicas);
        lvListView.setAdapter(new ListaMusicaAdaptador(this, listaMusicas));
    }
}
