package amch.demo.configuration;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.validation.Validator;

/**
 * @author achhibi
 */

@Configuration
@AllArgsConstructor
public class DataRestConfiguration implements RepositoryRestConfigurer {

    private Validator validator;

    @Override
    public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener validatingListener) {
        validatingListener.addValidator("beforeCreate", this.validator);
        validatingListener.addValidator("beforeSave", this.validator);
    }


}
