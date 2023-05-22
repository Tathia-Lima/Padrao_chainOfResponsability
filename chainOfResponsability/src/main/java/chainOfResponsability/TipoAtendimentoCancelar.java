package chainOfResponsability;

public class TipoAtendimentoCancelar implements TipoAtendimento {
    private static TipoAtendimentoCancelar TipoAtendimentoCancelar = new TipoAtendimentoCancelar();

    private TipoAtendimentoCancelar() {
    }

    ;

    public static TipoAtendimentoCancelar getTipoAtendimentoCancelar() {
        return TipoAtendimentoCancelar;
    }

    @Override
    public String tipoAtendimentoRealizado() {
        return "Cancelamento";
    }
}