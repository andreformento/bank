package com.formento.bank.model.template;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import com.formento.bank.model.Account;
import com.formento.bank.model.User;

import java.math.BigDecimal;

public class AccountTemplate implements TemplateLoader {

    public static String VALID = "valid";

    @Override
    public void load() {
        Fixture.of(Account.class)
                .addTemplate(VALID, new Rule() {{
                    add("user", one(User.class, UserTemplate.VALID));
                    add("accountBalance", BigDecimal.TEN);
                    add("limit", BigDecimal.ONE);
                }});
    }

}
