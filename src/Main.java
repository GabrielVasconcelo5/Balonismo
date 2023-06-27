public class Main {
    public static void main(String[] args) {

        Balao b1 = new Balao();
        Pessoa pessoa = new Pessoa("Gabriel", "30", "40", "9", "9", "40", "50");
        Piloto piloto = new Piloto();

        String resultado = b1.voar();
        System.out.println(resultado);
    }
}