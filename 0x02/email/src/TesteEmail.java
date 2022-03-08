import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TesteEmail {

    @Test
    public void testar_email_com_arroba() {
        assertTrue(Pessoa.emailValido("email_teste@dominio.com.br"));
    }

    @Test
    public void testar_email_sem_arroba() {
        assertFalse(Pessoa.emailValido("email_testedominio.com.br"));
    }

    @Test
    public void testar_email_mais_50_caracteres() {
        assertEquals(Pessoa.emailValido("emailtestemuitolongonaodeveser_valido@dominio.com.br"), false);
    }

}
