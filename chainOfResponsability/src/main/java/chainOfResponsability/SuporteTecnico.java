package chainOfResponsability;

public class SuporteTecnico implements TipoAtendimento {
    private static SuporteTecnico SuporteTecnico = new SuporteTecnico();

    private SuporteTecnico() {
    }

    ;

    public static SuporteTecnico getSuporteTecnico() {
        return SuporteTecnico;
    }

    @Override
    public String tipoAtendimentoRealizado() {
        return "SuporteTecnico";
    }
}