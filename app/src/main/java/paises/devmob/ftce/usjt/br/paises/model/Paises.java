package paises.devmob.ftce.usjt.br.paises.model;

/**
 * Created by carol on 26/03/2018.
 */

public class Paises {
    private int numero;
    private String descricao, regiao, capital;
    private Fila fila;


    public Paises(int numero, String descricao, Fila fila) {
        this.numero = numero;
        this.descricao = descricao;
        this.regiao = regiao;
        this.capital = capital;
        this.fila = fila;
    }

    public Paises() {

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Fila getFila() {
        return fila;
    }

    public void setFila(Fila fila) {
        this.fila = fila;
    }

    public String getRegiao() { return regiao; }

    public void setRegiao(String regiao) { this.regiao = regiao; }

    public String getCapital() { return capital; }

    public void setCapital(String capital) { this.capital = capital;  }
}
