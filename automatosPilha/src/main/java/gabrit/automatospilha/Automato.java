package gabrit.automatospilha;

public class Automato {

    private String sentenca;
    private MatrizTransicao matriz;
    private int estadoInicial;
    private List<Integer> estadosFinais;

    public Automato() {
        this.sentenca = "";
        this.estadoInicial = 0;        
        this.estadosFinais = new ArrayList<>();
        this.estadosFinais.add(3);
        this.matriz = new MatrizTransicao();
    }

}
