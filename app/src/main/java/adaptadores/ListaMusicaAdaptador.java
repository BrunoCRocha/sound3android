package adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import modelo.Musica;
import pt.ipleiria.estg.dei.amsi.sound3.R;

public class ListaMusicaAdaptador extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private ArrayList<Musica> musicas;


    public ListaMusicaAdaptador(Context context, ArrayList<Musica> musicas) {
        this.context = context;
        this.musicas = musicas;
    }

    @Override
    public int getCount() {
        return musicas.size();
    }

    @Override
    public Object getItem(int position) {
        return musicas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(inflater == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if(convertView == null){
            convertView = inflater.inflate(R.layout.item_lista_musica, null);
        }

        ViewHolderLista viewHolderLista = (ViewHolderLista)convertView.getTag();

        if(viewHolderLista == null){
            viewHolderLista = new ViewHolderLista(convertView);
            convertView.setTag(viewHolderLista);
        }

        viewHolderLista.update(musicas.get(position));
        return convertView;

    }


    private class ViewHolderLista{
        private TextView artista;
        private TextView nome;
        private TextView tempo;
        private TextView preco;
        private ImageView capa;
        private ImageView menu;

        public ViewHolderLista(View convertView){
            artista = convertView.findViewById(R.id.tV_Artista);
            nome = convertView.findViewById(R.id.tV_Nome);
            tempo = convertView.findViewById(R.id.tV_Tempo);
            preco = convertView.findViewById(R.id.tV_Preco);
            capa = convertView.findViewById(R.id.iV_Capa);
            menu = convertView.findViewById(R.id.bV_Menu);
        }

        public void update(Musica musica){
            artista.setText(musica.getArtista());
            nome.setText(musica.getNome());
            tempo.setText(musica.getTempo());
            preco.setText(musica.getPreco());
            capa.setImageResource(musica.getCapa());
            menu.setImageResource(musica.getMenu());
        }

    }

}
