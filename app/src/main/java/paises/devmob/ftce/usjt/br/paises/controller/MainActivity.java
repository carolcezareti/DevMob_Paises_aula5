package paises.devmob.ftce.usjt.br.paises.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import paises.devmob.ftce.usjt.br.paises.R;

public class MainActivity extends Activity {
    public static final String FILA = "paises.devmob.ftce.usjt.paises";
    private EditText txtFila = (EditText)findViewById(R.id.buscar_fila);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.R.attr R;
        setContentView(android.R.attr.layout.activity_main);
    }

    public void buscarPaises(View view) {
        String fila = txtFila.getText().toString();
        Intent intent = new Intent(this, ListarPaisesActivity.class);
        intent.putExtra(FILA, fila);
        startActivity(intent);
    }
}
