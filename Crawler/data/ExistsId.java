9
https://raw.githubusercontent.com/asouza/implementacao-teste-ifood-pagamento-ddd-da-massa/master/src/main/java/com/deveficiente/testepagamentoifood/pagamento/validadores/ExistsId.java
package com.deveficiente.testepagamentoifood.pagamento.validadores;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = {ExistsIdValidator.class})
@Target({ FIELD})
@Retention(RUNTIME)
public @interface ExistsId {

	String message() default "{com.deveficiente.beanvalidation.existsid}";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

	String domainAttribute();

	Class<?> klass();
}