package paises.devmob.ftce.usjt.br.paises.controller;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import paises.devmob.ftce.usjt.br.paises.R;
import paises.devmob.ftce.usjt.br.paises.model.Paises;
import paises.devmob.ftce.usjt.br.paises.model.Util;

/**
 * Created by carol on 26/03/2018.
 */

public abstract class DetalhePaisesActivity extends Context {
    private int contentView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_paises);
        Intent intent = getIntent();
        Paises paises = (Paises)intent.getSerializableExtra(ListarPaisesActivity.PAIS);
        ImageView bandeira = (ImageView) bandeira.findViewById();
        Drawable drawable = Util.getDrawableDinamic(this, paises.getFila().getBandeira());
        bandeira.setImageDrawable(drawable);
        TextView fila = (TextView) fila.findViewById();
        fila.setText(paises.getFila().getNome());
        TextView numero = (TextView) numero.findViewById();
        numero.setText(""+paises.getNumero());
        TextView descricao = (TextView) descricao.findViewById();
        descricao.setText(""+paises.getDescricao());
        TextView regiao = (TextView) regiao.findViewById();
        regiao.setText(""+paises.getRegiao());
        TextView capital = (TextView) capital.findViewById();
        capital.setText(""+paises.getCapital());
    }

    public Intent getIntent() {
        Intent intent = null;
        return intent;
    }

    public void setContentView(int contentView) {
        this.contentView = contentView;
    }
}
