package dev.java10x.CadastroDeNinjas.Missoes;

import jakarta.persistence.Entity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    @GetMapping("/listar")
    public String listarMissao() {
        return "Missão listada com Sucesso";
    }

    @PostMapping("/criar")
    public String criarMissao() {
        return "Missão Criada com Sucesso";
    }

    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missão Alterada com Sucesso";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missão deletada com Sucesso";
    }
}
