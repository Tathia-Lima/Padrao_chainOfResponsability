package chainOfResponsability;

public class AtendenteUpgrade extends Atendente {

    public AtendenteUpgrade(Atendente atendenteCorrespondente) {
        atendimentoPorAtendente.add(TipoAtendimentoUpgrade.getTipoAtendimentoUpgrade());
        setAtendenteCorrespondente(atendenteCorrespondente);
    }

    @Override
    public String getTipoAtendimentoPorAtendente() {
        return "Atendimentos relacionados a Upgrade de planos";
    }
}