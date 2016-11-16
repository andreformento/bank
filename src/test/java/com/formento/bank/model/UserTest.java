package com.formento.bank.model;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import com.formento.bank.model.template.UserTemplate;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class UserTest {

    @BeforeClass
    public static void initClass() {
        FixtureFactoryLoader.loadTemplates("com.formento.bank.model.template");
    }

    @Test
    public void shouldCreateAnUser() {
        // given
        User user = Fixture.from(User.class).gimme(UserTemplate.VALID);

        // when
        final String document = user.getDocument();

        // then
        assertNotNull(document);
    }

}
