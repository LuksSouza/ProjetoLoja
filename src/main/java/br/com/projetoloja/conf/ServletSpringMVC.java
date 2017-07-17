package br.com.projetoloja.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Implementação do Servlet do Spring
 * 
 * getRootConfigClasses - 
 * 
 * getServletConfigClasses - Mapeia as classes com as configurações para o uso do SpringMVC
 * 
 * getServletMappings - Mapeia as URIs que o Servlet irá atender
 * 
 * @author estudo
 *
 */

public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {AppWebConfiguration.class, JPAConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
