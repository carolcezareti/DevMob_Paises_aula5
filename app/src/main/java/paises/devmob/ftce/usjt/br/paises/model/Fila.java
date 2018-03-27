package paises.devmob.ftce.usjt.br.paises.model;

/**
 * Created by carol on 26/03/2018.
 */

public class Fila {
    private int id;
    private String nome, bandeira, regiao, capital;

    public Fila(int id, String nome, String figura) {
        this.id = id;
        this.nome = nome;
        this.bandeira = bandeira;
        this.regiao = regiao;
        this.capital = capital;
    }



    public Fila() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String figura) {
        this.bandeira = figura;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {this.regiao = regiao; }

    public String getCapital() { return capital; }

    public void setCapital(String capital) { this.capital = capital; }

    @Override
    public String toString() {
        return "Fila{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", bandeira='" + bandeira + '\'' +
                "regiao='" + regiao + '\'' +
                "capital" +capital + '\'' +
                '}';
    }
}
