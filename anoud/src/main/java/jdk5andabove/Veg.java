package jdk5andabove;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface Veg {
	public String val() default "";
	public int ratio();
	public String[]values();

}
