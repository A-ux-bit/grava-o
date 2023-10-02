package exemplojedi;

import java.util.Scanner;

public class TelaJedi {
    private String nome;
    private String lado;
    
    public String getNome() {
        return nome;
    }
    
    public String getLado() {
        return lado;
    }

    public void desenhaTela(){
        Scanner input = new Scanner(System.in);
        System.out.println("NOME:");
        this.nome = input.nextLine();
        System.out.println("LADO:");
        this.lado = input.nextLine();
        input.close();
    }
    
}
