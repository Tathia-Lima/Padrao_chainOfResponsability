package chainOfResponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoTest {

    AtendenteCancelamento atendenteCancelamento;
    AtendenteSuporteTecnico atendenteSuporteTecnico;
    AtendenteUpgrade atendenteUpgrade;
    AtendenteAdesao atendenteAdesao;
    @BeforeEach
    void setUp() {
        atendenteCancelamento = new AtendenteCancelamento(null);
        atendenteSuporteTecnico = new AtendenteSuporteTecnico(atendenteCancelamento);
        atendenteUpgrade = new AtendenteUpgrade(atendenteSuporteTecnico);
        atendenteAdesao = new AtendenteAdesao(atendenteUpgrade);
    }
    
    @Test
    void deveRetornarAtendimentoIndisponivel() {
        Atendimento cancelamento = new Atendimento(TipoAtendimentoCancelar.getTipoAtendimentoCancelar());
        atendenteCancelamento.atendimentoPorAtendente.remove(0);
        assertEquals("Atendimento indisponível no momento", atendenteCancelamento.realizarAtendimento(cancelamento));
    }

    @Test
    void deveRetornarAtendimentoAdesao() {
        assertEquals("Atendimento relacionado a adesão de planos", atendenteAdesao.realizarAtendimento(new Atendimento(TipoAtendimentoAderir.getTipoAtendimentoAderir())));
    }

    @Test
    void deveRetornarAtendimentoUpgrade() {
        Atendimento upgrade = new Atendimento(TipoAtendimentoUpgrade.getTipoAtendimentoUpgrade());
        assertEquals("Atendimentos relacionados a Upgrade de planos", atendenteUpgrade.realizarAtendimento(upgrade));
    }

    @Test
    void deveRetornarAtendimentoSuporteTecnico() {
        Atendimento suporteTecnico = new Atendimento(SuporteTecnico.getSuporteTecnico());
        assertEquals("Atendimentos relacionados a Suporte Tecnico", atendenteSuporteTecnico.realizarAtendimento(suporteTecnico));
    }

    @Test
    void deveRetornarAtendimentoCancelamento() {
        Atendimento cancelamento = new Atendimento(TipoAtendimentoCancelar.getTipoAtendimentoCancelar());
        assertEquals("Atendimentos relacionados a cancelamentos de planos", atendenteCancelamento.realizarAtendimento(cancelamento));
    }


}