package papyrus.web.generate.medsecurance.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.samskivert.mustache.DefaultCollector;
import com.samskivert.mustache.Mustache;

@SpringBootApplication
@ComponentScan(basePackages = {"papyrus.web.generate.medsecurance"})
public class PapyrusWebGenerateMedsecuranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PapyrusWebGenerateMedsecuranceApplication.class, args);
	}

	@Bean
    Mustache.Compiler mustacheCompiler(Mustache.TemplateLoader templateLoader) {
        return Mustache.compiler()
          .defaultValue("valueNotSet")
          .withLoader(templateLoader)
          .withCollector(new DefaultCollector());
    }
}
