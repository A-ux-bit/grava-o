package exemplojedi;

import java.util.Scanner;

public class Jedi {
    private int id;
    private String nome;
    private String lado;
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
    public String getLado() {
        return lado;
    }
    public void setLado(String lado) {
        this.lado = lado;
    }
    
    public void desenhaTela(){
        Scanner input = new Scanner(System.in);
        System.out.println("ID:");
        this.id = Integer.parseInt(input.nextLine());
        System.out.println("NOME:");
        this.nome = input.nextLine();
        System.out.println("LADO:");
        this.lado = input.nextLine();
        input.close();
    }
}
