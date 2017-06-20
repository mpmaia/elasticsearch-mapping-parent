package org.elasticsearch.annotation.query;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * Defines that the default generated filter for the field should be a match filter.
 * </p>
 * 
 * @author luc boutier
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface MatchFilter {
    String[] paths() default "";

    /**
     * Optional paths generator to override the paths property of the annotation for complex use-case or reflection etc.
     *
     * @return the path generator.
     */
    Class<? extends IPathGenerator> pathGenerator() default IPathGenerator.DEFAULT.class;
}