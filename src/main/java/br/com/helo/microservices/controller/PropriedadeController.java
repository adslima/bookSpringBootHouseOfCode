package br.com.helo.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.helo.microservices.entities.Propriedade;
import br.com.helo.microservices.repository.PropriedadeRepository;

/**
 *
 * @author <a href="mailto:andrews.silva@accenture.com">andrews.silva</a>
 * @date 27 de set de 2017 10:53:14
 */
@RestController
@RequestMapping("/api")
public class PropriedadeController {

	/**
	 * Representa o controle sobre o repositorio
	 */
	@Autowired
	private PropriedadeRepository repository;

	/**
	 *
	 * <code><pre></pre></code>
	 *
	 * @param filtro
	 * @return List<Propriedade>
	 */
	@RequestMapping(value = "/find/{filtro}", method = RequestMethod.GET)
	public List<Propriedade> findByFiltro(@PathVariable("filtro") final String filtro) {
		return this.repository.findByFiltro(filtro);
	}

}
