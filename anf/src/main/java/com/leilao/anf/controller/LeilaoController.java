package com.leilao.anf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.leilao.anf.dto.LeilaoDto;
import com.leilao.anf.form.LeilaoForm;
import com.leilao.anf.model.Leilao;
import com.leilao.anf.repository.LeilaoRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/leilao")
public class LeilaoController {

     @Autowired
    private LeilaoRepository leilaoRepository;

    // @Autowired
    // private CursoRepository cursoRepository;

    @GetMapping
    public List<LeilaoDto> lista(String nomeVeiculo) {
         
        List<Leilao> leiloes = leilaoRepository.findAll();
        return LeilaoDto.converter(leiloes);

    }

    @PostMapping
	@Transactional
	public void cadastrar(@RequestBody   LeilaoForm form, UriComponentsBuilder uriBuilder) {
		LeilaoForm leilao = new LeilaoForm();
		leilaoRepository.save(form.converter());
		
		// URI uri = uriBuilder.path("/leilao/{id}").buildAndExpand(leilao.getId()).toUri();
		//   ResponseEntity.created(uri).body(new LeilaoDto(leilao));
	}
}
