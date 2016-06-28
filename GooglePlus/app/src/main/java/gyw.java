import android.util.Property;
import android.view.View;

final class gyw
  extends Property<View, Float>
{
  private Property<View, Float> a;
  private Property<View, Float> b;
  private float c;
  
  public gyw(Property<View, Float> paramProperty1, Property<View, Float> paramProperty2, float paramFloat, String paramString)
  {
    super(Float.class, paramString);
    this.a = paramProperty1;
    this.b = paramProperty2;
    this.c = 0.5F;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gyw
 * JD-Core Version:    0.7.0.1
 */