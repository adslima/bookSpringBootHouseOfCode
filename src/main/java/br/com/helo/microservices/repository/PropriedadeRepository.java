package br.com.helo.microservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.helo.microservices.entities.Propriedade;

/**
 *
 * @author <a href="mailto:andrews.silva@accenture.com">andrews.silva</a>
 * @date 27 de set de 2017 10:42:13
 */
public interface PropriedadeRepository extends PagingAndSortingRepository<Propriedade, String> {

	/**
	 *
	 * <code><pre></pre></code>
	 *
	 * @param filtro
	 * @return List<Propriedade>
	 */
	@Query("Select c from Propriedade c where c.nome like %:filtro% order by categoria,subcategoria,nome")
	public List<Propriedade> findByFiltro(@Param("filtro") String filtro);

}
