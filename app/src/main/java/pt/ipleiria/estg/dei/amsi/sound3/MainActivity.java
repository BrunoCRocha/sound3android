package pt.ipleiria.estg.dei.amsi.sound3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registar(View view) {

        Intent register = new Intent(this, ListaMusicas.class);
        startActivity(register);
    }
}
