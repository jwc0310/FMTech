import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.FIELD})
public @interface iam
{
  String a();
  
  boolean b() default false;
  
  boolean c() default false;
  
  boolean d() default true;
  
  String e() default "";
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iam
 * JD-Core Version:    0.7.0.1
 */