package paises.devmob.ftce.usjt.br.paises.model;

import java.util.ArrayList;

/**
 * Created by carol on 26/03/2018.
 */

public class Data {
    public static ArrayList<Paises> buscarPaises(String chave) {
            ArrayList<Paises> lista = geraListaPaises();
            if(chave == null || chave.length()==0){
                return lista;
            }

            ArrayList<Paises> resultado = new ArrayList<>();

            for(Paises paises:lista){
                if(paises.getFila().getNome().toUpperCase().contains(chave.toUpperCase())){
                    resultado.add(paises);
                }
            }
            return resultado;
        }

        public static ArrayList<Paises> geraListaPaises{
            ArrayList<Paises> lista = new ArrayList<>();

            Paises paises = new Paises();
            paises.setNumero(1);
            paises.setDescricao(new String());
            Fila fila = new Fila();
            fila.setId(FilaId.ALEMANHA.id());
            fila.setNome(FilaId.ALEMANHA.nome());
            fila.setBandeira(FilaId.ALEMANHA.bandeira());
            fila.setRegiao(FilaId.ALEMANHA.regiao());
            fila.setCapital(FilaId.ALEMANHA.capital());
            paises.setFila(fila);
            lista.add(paises);

            paises = new Paises();
            paises.setNumero(2);
            paises.setDescricao(new String());
            fila = new Fila();
            fila.setId(FilaId.ARGENTINA.id());
            fila.setNome(FilaId.ARGENTINA.nome());
            fila.setBandeira(FilaId.ARGENTINA.bandeira());
            fila.setRegiao(FilaId.ARGENTINA.regiao());
            fila.setCapital(FilaId.ARGENTINA.capital());
            paises.setFila(fila);
            lista.add(paises);

            paises = new Paises();
            paises.setNumero(3);
            paises.setDescricao(new String());
            fila = new Fila();
            fila.setId(FilaId.AUSTRALIA.id());
            fila.setNome(FilaId.AUSTRALIA.nome());
            fila.setBandeira(FilaId.AUSTRALIA.bandeira());
            fila.setRegiao(FilaId.AUSTRALIA.regiao());
            fila.setCapital(FilaId.AUSTRALIA.capital());
            paises.setFila(fila);
            lista.add(paises);

            paises = new Paises();
            paises.setNumero(4);
            paises.setDescricao(new String());
            fila = new Fila();
            fila.setId(FilaId.BRASIL.id());
            fila.setNome(FilaId.BRASIL.nome());
            fila.setBandeira(FilaId.BRASIL.bandeira());
            fila.setRegiao(FilaId.BRASIL.regiao());
            fila.setCapital(FilaId.BRASIL.capital());
            paises.setFila(fila);
            lista.add(paises);

            paises = new Paises();
            paises.setNumero(5);
            paises.setDescricao(new String());
            fila = new Fila();
            fila.setId(FilaId.CANADA.id());
            fila.setNome(FilaId.CANADA.nome());
            fila.setBandeira(FilaId.CANADA.bandeira());
            fila.setRegiao(FilaId.CANADA.regiao());
            fila.setCapital(FilaId.CANADA.capital());
            paises.setFila(fila);
            lista.add(paises);

            paises = new Paises();
            paises.setNumero(6);
            paises.setDescricao(new String());
            fila = new Fila();
            fila.setId(FilaId.ESPANHA.id());
            fila.setNome(FilaId.ESPANHA.nome());
            fila.setBandeira(FilaId.ESPANHA.bandeira());
            fila.setRegiao(FilaId.ESPANHA.regiao());
            fila.setCapital(FilaId.ESPANHA.capital());
            paises.setFila(fila);
            lista.add(paises);

            paises = new Paises();
            paises.setNumero(7);
            paises.setDescricao(new String());
            fila = new Fila();
            fila.setId(FilaId.EUA.id());
            fila.setNome(FilaId.EUA.nome());
            fila.setBandeira(FilaId.EUA.bandeira());
            fila.setRegiao(FilaId.EUA.regiao());
            fila.setCapital(FilaId.EUA.capital());
            paises.setFila(fila);
            lista.add(paises);

            paises = new Paises();
            paises.setNumero(8);
            paises.setDescricao(new String());
            fila = new Fila();
            fila.setId(FilaId.FRANÇA.id());
            fila.setNome(FilaId.FRANÇA.nome());
            fila.setBandeira(FilaId.FRANÇA.bandeira());
            fila.setRegiao(FilaId.FRANÇA.regiao());
            fila.setCapital(FilaId.FRANÇA.capital());
            paises.setFila(fila);
            lista.add(paises);

            paises = new Paises();
            paises.setNumero(9);
            paises.setDescricao(new String());
            fila = new Fila();
            fila.setId(FilaId.ITALIA.id());
            fila.setNome(FilaId.ITALIA.nome());
            fila.setBandeira(FilaId.ITALIA.bandeira());
            fila.setRegiao(FilaId.ITALIA.regiao());
            fila.setCapital(FilaId.ITALIA.capital());
            paises.setFila(fila);
            lista.add(paises);

            paises = new Paises();
            paises.setNumero(10);
            paises.setDescricao(new String());
            fila = new Fila();
            fila.setId(FilaId.JAPAO.id());
            fila.setNome(FilaId.JAPAO.nome());
            fila.setBandeira(FilaId.JAPAO.bandeira());
            fila.setRegiao(FilaId.JAPAO.regiao());
            fila.setCapital(FilaId.JAPAO.capital());
            paises.setFila(fila);
            lista.add(paises);

            paises = new Paises();
            paises.setNumero(11);
            paises.setDescricao(new String());
            fila = new Fila();
            fila.setId(FilaId.MEXICO.id());
            fila.setNome(FilaId.MEXICO.nome());
            fila.setBandeira(FilaId.MEXICO.bandeira());
            fila.setRegiao(FilaId.MEXICO.regiao());
            fila.setCapital(FilaId.MEXICO.capital());
            paises.setFila(fila);
            lista.add(paises);

            paises = new Paises();
            paises.setNumero(12);
            paises.setDescricao(new String());
            fila = new Fila();
            fila.setId(FilaId.RUSSIA.id());
            fila.setNome(FilaId.RUSSIA.nome());
            fila.setBandeira(FilaId.RUSSIA.bandeira());
            fila.setRegiao(FilaId.RUSSIA.regiao());
            fila.setCapital(FilaId.RUSSIA.capital());
            paises.setFila(fila);
            lista.add(paises);

            return lista;
        }
    }

