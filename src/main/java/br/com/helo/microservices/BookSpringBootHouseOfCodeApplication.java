package br.com.helo.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 *
 * @author <a href="mailto:andrews.silva@accenture.com">andrews.silva</a>
 * @date 27 de set de 2017 11:03:41
 */
@SpringBootApplication
public class BookSpringBootHouseOfCodeApplication extends SpringBootServletInitializer {

	/**
	 *
	 * <code><pre></pre></code>
	 *
	 * @param args void
	 */
	public static void main(final String[] args) {

		SpringApplication.run(BookSpringBootHouseOfCodeApplication.class, args);
	}

	/* (non-Javadoc)
	 *
	 * @see
	 * org.springframework.boot.web.support.SpringBootServletInitializer#configure(org.springframework.boot.
	 * builder.SpringApplicationBuilder) */
	@Override
	protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
		return application.sources(BookSpringBootHouseOfCodeApplication.class);
	}
}
