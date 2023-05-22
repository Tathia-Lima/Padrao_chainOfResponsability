package chainOfResponsability;

public class TipoAtendimentoUpgrade implements TipoAtendimento {

    private static TipoAtendimentoUpgrade TipoAtendimentoUpgrade = new TipoAtendimentoUpgrade();

    private TipoAtendimentoUpgrade() {
    }

    ;

    public static TipoAtendimentoUpgrade getTipoAtendimentoUpgrade() {
        return TipoAtendimentoUpgrade;
    }

    @Override
    public String tipoAtendimentoRealizado() {
        return "Upgrade";
    }
}