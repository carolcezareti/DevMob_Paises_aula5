package paises.devmob.ftce.usjt.br.paises.model;

/**
 * Created by carol on 26/03/2018.
 */

public class FilaId {
    ALEMANHA(1,"Alemanha","ic_ale"),
    ARGENTINA(2,"Argentina","ic_arg"),
    AUSTRALIA (3,"Australia","ic_aus"),
    BRASIL (4,"Brasil","ic_bra"),
    CANADA(5,"Canadá","ic_can"),
    ESPANHA(6,"Espanha","ic_esp"),
    EUA(7,"Estados Unidos","ic_eua"),
    FRANÇA(8,"França","ic_fra"),
    ITALIA(9,"Itália","ic_ita"),
    JAPAO(10,"Japão","ic_jpn"),
    MEXICO(11,"México","ic_mex"),
    RUSSIA(12,"Rússia","ic_rus"),


    private final int id;
    private final String nome, bandeira, regiao, capital;

    FilaId (int num, String s, String f, String r, String c){
        id = num;
        nome = s;
        bandeira = f;
        regiao = r;
        capital = c;
    }

    public int id(){
        return id;
    }

    public String nome(){
        return nome;
    }

    public String bandeira() {return bandeira;}

    public String regiao() {return regiao;}

    public String capital() {return capital;}


}
