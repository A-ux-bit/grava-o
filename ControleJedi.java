package exemplojedi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ControleJedi {

    //declaração dos objetos de dados
    public ControleJedi() throws IOException{
        TelaJedi telaJedi = new TelaJedi();
        Jedi jedi = new Jedi();
        String dados;

        //chamada da tela pra entrada de dados
        telaJedi.desenhaTela();
        
        //preparação da CLasse Entity ou model
        jedi.setId(1);
        jedi.setNome(telaJedi.getNome());
        jedi.setLado(telaJedi.getLado());

        //preparação da String de dados para gravação

        //jedi.setId(jedi.getId()+10);
        dados = jedi.getId()+";"+
                jedi.getNome()+";"+
                jedi.getLado();

        File f = new File("c:/tmp/guest-pihamx/gravação/grava-o/exemplojedi");
        FileWriter fw = new FileWriter(f, true);
        
        try{
            fw.write(dados);
        }
        catch (Exception e){

        }
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(dados);
        
        bw.close();
        fw.close();
    }
    public void salvarJedi(){

    }
}
