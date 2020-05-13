2
https://raw.githubusercontent.com/gardle/gardle-web/master/src/test/java/com/gardle/ArchTest.java
package com.gardle;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {

        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("com.airgnb");

        noClasses()
            .that()
            .resideInAnyPackage("..service..")
            .or()
            .resideInAnyPackage("..repository..")
            .should().dependOnClassesThat()
            .resideInAnyPackage("..com.airgnb.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}