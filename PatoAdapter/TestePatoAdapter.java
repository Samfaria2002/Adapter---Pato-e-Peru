public class TestePatoAdapter {
    public static void main(String[] args) {
        PatoReal patoreal = new PatoReal();
        System.out.println("O pato diz...");
        patoreal.voar();
        patoreal.grasnar();

        PeruSelvagem peruSelvagem = new PeruSelvagem();
        System.out.println("O peru diz...");
        peruSelvagem.gorgolejar();
        peruSelvagem.voar();

        PeruAdapter peruAdapter = new PeruAdapter(peruSelvagem);
        testaPato(peruAdapter);
    }

    public static void testaPato(Pato p){
        p.grasnar();
        p.voar();
    }
}
