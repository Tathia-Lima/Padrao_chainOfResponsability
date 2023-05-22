package chainOfResponsability;

public class TipoAtendimentoAderir implements TipoAtendimento{

    private static TipoAtendimentoAderir aderir = new TipoAtendimentoAderir();

    private TipoAtendimentoAderir(){};

    public static TipoAtendimentoAderir getTipoAtendimentoAderir() {
        return aderir;
    }

    @Override
    public String tipoAtendimentoRealizado() {
        return "Adesão";
    }
}
