package paises.devmob.ftce.usjt.br.paises.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.IOException;
import java.util.ArrayList;

import paises.devmob.ftce.usjt.br.paises.R;
import paises.devmob.ftce.usjt.br.paises.model.Paises;
import paises.devmob.ftce.usjt.br.paises.model.PaisesNetwork;

public class MainActivity extends Activity {
    public static final String PAIS = "paises.devmob.ftce.usjt.br.paises";
    private EditText txtFila;
    Context contexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtFila = (EditText)findViewById(R.id.buscar_fila);
        contexto = this;
    }
    public void buscarPaises(View view) {
        String fila = txtFila.getText().toString();
        new DownloadJsonChamados().execute("http:// 192.168.0.52:8080/arqsw_sdesk_a4_solucao_parcial/rest/chamados");

    }


    private class DownloadJsonChamados extends AsyncTask<String, Void, ArrayList<Paises>> {

        @Override
        protected ArrayList<Paises> doInBackground(String... strings) {
            ArrayList<Paises> paises = new ArrayList<>();
            try {
                paises = PaisesNetwork.buscarPaises(strings[0]);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return paises;
        }
    }
    protected void onPostExecute(ArrayList<Paises> paises){
        Intent intent = new Intent(contexto, ListarPaisesActivity.class);
        intent.putExtra(PAIS, paises);
        startActivity(intent);
    }
}

