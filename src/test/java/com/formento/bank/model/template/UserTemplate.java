package com.formento.bank.model.template;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import com.formento.bank.model.User;

import java.util.Optional;

public class UserTemplate implements TemplateLoader {

    public static String VALID = "valid";

    @Override
    public void load() {
        Fixture.of(User.class)
                .addTemplate(VALID, new Rule() {{
                    add("document", "111.111.111-11");
                    add("name", "Andre Formento");
                    add("emailAddress", Optional.of("andreformento.sc@gmail.com"));
                }});
    }

}
