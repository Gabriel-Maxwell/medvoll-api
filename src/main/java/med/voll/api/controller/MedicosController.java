package med.voll.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import med.voll.api.medico.DadosCadastroMedico;
import med.voll.api.repository.MedicoRepository;


@RestController
@RequestMapping("medicos")
public class MedicosController {
    @Autowired
    private MedicoRepository repository;
    
    @PostMapping
    @Transactional
    public void  cadastrar(@RequestBody DadosCadastroMedico dados){
        System.out.println(dados);
}

}

