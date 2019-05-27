package com.test.cucumber.typeregistry;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;

import java.util.Locale;

public class TypeRegistryConfiguration implements TypeRegistryConfigurer {
    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        //ADD NEW TYPES
    }
}
