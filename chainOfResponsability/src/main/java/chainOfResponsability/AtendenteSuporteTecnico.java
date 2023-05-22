package chainOfResponsability;

public class AtendenteSuporteTecnico extends Atendente {

    public AtendenteSuporteTecnico(Atendente atendenteCorrespondente) {
        atendimentoPorAtendente.add(SuporteTecnico.getSuporteTecnico());
        setAtendenteCorrespondente(atendenteCorrespondente);
    }

    @Override
    public String getTipoAtendimentoPorAtendente() {
        return "Atendimentos relacionados a Suporte Tecnico";
    }

}