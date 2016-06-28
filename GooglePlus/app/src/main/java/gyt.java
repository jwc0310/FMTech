import android.util.Property;
import android.view.View;

public final class gyt
{
  public static final Property<View, Float> a = new gyw(c, View.X, 0.5F, "anchorPositionX");
  public static final Property<View, Float> b = new gyw(d, View.Y, 0.5F, "anchorPositionY");
  private static Property<View, Float> c;
  private static Property<View, Float> d;
  
  static
  {
    Property.of(View.class, Float.class, "pivotX");
    Property.of(View.class, Float.class, "pivotY");
    c = new gyu(Float.class, "width");
    d = new gyv(Float.class, "height");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gyt
 * JD-Core Version:    0.7.0.1
 */