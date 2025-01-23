package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String complemento;
    private String numero;

    public Endereco(Endereco dados) {
        this.logradouro = dados.getLogradouro();
        this.bairro = dados.getBairro();
        this.cep = dados.getCep();
        this.uf = dados.getUf();
        this.cidade = dados.getCidade();
        this.complemento = dados.getComplemento();
        this.numero = dados.getNumero();
    }
    
}
