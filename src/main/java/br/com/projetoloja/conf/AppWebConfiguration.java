package br.com.projetoloja.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.projetoloja.controllers.HomeController;
import br.com.projetoloja.daos.ClienteDAO;

/**
 * @EnableWebMVC - Indica para o Spring que será utilizado o recurso Web MVC dele
 * 
 * @ComponentScan(basePackageClasses={Classes_Aqui}) - Indica para o Spring as classes Controllers do projeto
 *  
 * @Bean - 
 * 
 * @author estudo
 *
 */

@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class, ClienteDAO.class})
public class AppWebConfiguration {

	/**
	 * Método que ajuda o SpringMVC a encontrar as views do projeto
	 * @return
	 */
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
	    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		
		return resolver;
	}
}
