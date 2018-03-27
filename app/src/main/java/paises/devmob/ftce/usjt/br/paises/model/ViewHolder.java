package paises.devmob.ftce.usjt.br.paises.model;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by carol on 26/03/2018.
 */

public class ViewHolder {
    private TextView numero, descricao, regiao, capital;
    private ImageView imagem;

    public void setNumero(TextView numero) {
        this.numero = numero;
    }

    public void setDescricao(TextView descricao) {
        this.descricao = descricao;
    }

    public void setImagem(ImageView imagem) {
        this.imagem = imagem;
    }

    public ImageView getImagem() {
        return imagem;
    }

    public TextView getNumero() {
        return numero;
    }

    public TextView getDescricao() {
        return descricao;
    }

    public void setRegiao(TextView regiao) { this.regiao = regiao;  }

    public void setCapital(TextView capital) { this.capital = capital; }
}
