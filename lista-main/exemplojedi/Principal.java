package exemplojedi;

public class Principal {
    public static void main(String[] args) {
        try {
            new ControleJedi();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
