package exemplojedi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ControleJedi {

    //declaração dos objetos de dados
    public ControleJedi() throws IOException{

        ArrayList<Jedi> arrayjedi = new ArrayList<>();
        Jedi jedi = new Jedi();

        File f = new File("c:\\users\\Docs\\jedi.txt");
        FileReader fr = new FileReader(f);   
        BufferedReader bf = new BufferedReader(fr);    
        String dado = "";
        int inicioPv = 1;
        
       // dado = bf.readLine();
        /*jedi.setId(Integer.parseInt(dado.substring(0,2)));
        jedi.setNome(dado.substring(2,7));
        jedi.setLado(dado.substring(9, 12));

        arrayjedi.add(0,null);
        System.out.println(dado);
        System.out.println("ID do Arquivo: " + jedi.getId());
        System.out.println("Nome do Arquivo: " + jedi.getNome());
        System.out.println("Lado do Arquivo: " + jedi.getLado());
        arrayjedi.add(0, jedi);
*/

        /*while ((dado = bf.readLine())!= null) {
           System.out.println(dado);*/

           dado = bf.readLine();
        jedi.setId(Integer.parseInt(dado.substring(inicioPv, dado.indexOf(";"))));
        inicioPv = dado.indexOf(";");
        dado = dado.substring(inicioPv+1, dado.indexOf(";"));
        jedi.setNome(dado);
        inicioPv = dado.indexOf(";");
        dado = dado.substring(inicioPv+1);
        jedi.setLado(dado);
        //}

        System.out.println(jedi.getId());
        System.out.println(jedi.getNome());
        System.out.println(jedi.getLado());

        bf.close();
        fr.close();
        }
        /*TelaJedi telaJedi = new TelaJedi();
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
*/
    } 

