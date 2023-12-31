package int221.nw2.project.yuuuhooo.validations;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueValidator.class )
@Documented
public @interface Unique {
    public String message() default "does not unique" ;

    public String field() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
