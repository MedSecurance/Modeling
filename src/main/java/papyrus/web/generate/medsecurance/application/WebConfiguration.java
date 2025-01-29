package papyrus.web.generate.medsecurance.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {
	@Value("${APPWEB_URL}")	// Environment variable (can be set from docker)
	private String appweb_url;	
	
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("http://localhost:5173", appweb_url, "http://localhost:8080");
    }

}
