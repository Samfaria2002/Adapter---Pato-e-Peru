public class PeruAdapter implements Pato{

    Peru peru;

    public PeruAdapter(Peru peru) {
        this.peru = peru;
    }

    @Override
    public void voar() {
        //Fazendo o peru voar mais alto que o pato
        for (int i = 0; i < 5; i++) {
            peru.voar();
        }
    }

    @Override
    public void grasnar() {
        peru.gorgolejar();
    }
    
}
