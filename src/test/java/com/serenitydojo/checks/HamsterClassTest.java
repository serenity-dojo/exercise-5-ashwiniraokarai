package com.serenitydojo.checks;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.assertj.core.api.Assertions.assertThat;

public class HamsterClassTest {
    @Test
    public void theDogClassShouldExist() throws ClassNotFoundException {
        assertThat(Class.forName("com.serenitydojo.Hamster")).isNotNull();
    }

    @Test
    public void shouldBeAPet() throws Exception {
        assertThat(Class.forName("com.serenitydojo.Hamster").getSuperclass().getSimpleName()).isEqualTo("Pet");
    }

    @Test
    public void theDogClassShouldHaveAFavoriteToy() throws Exception {
        assertThat(Class.forName("com.serenitydojo.Hamster").getDeclaredField("favoriteGame").getGenericType()).isEqualTo(String.class);
    }
}
