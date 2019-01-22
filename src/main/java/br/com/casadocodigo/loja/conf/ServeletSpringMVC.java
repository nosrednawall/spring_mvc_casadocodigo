package br.com.casadocodigo.loja.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 
 * @author anderson
 * Classe abstrata que herda de uma classe gigante do Spring, ela até onde eu sei pode fazer três funcções que são:
 */
public class ServeletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer		{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {AppWebConfiguration.class};
	}

	/**
	 * Essa configuração irá mapperar a url / do servidor
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	
}
