package meta;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    /**
     * ��ɫö��
     * @author peida
     *
     */
    public enum Color{ BULE,RED,GREEN};
    
    /**
     * ��ɫ����
     * @return
     */
    Color fruitColor() default Color.GREEN;
}

