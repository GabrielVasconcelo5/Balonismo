public class Main {
    public static void main(String[] args) {

        Balao b1 = new Balao();
        Pessoa pessoa = new Pessoa();
        Piloto piloto = new Piloto();

        String resultado = b1.voar();
        System.out.println(resultado);
    }
}