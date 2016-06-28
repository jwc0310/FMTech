import java.io.Serializable;
import java.util.Locale;

public final class gxt
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  public final int a;
  public final boolean b;
  
  public gxt(int paramInt)
  {
    this(paramInt, false, gxq.class);
  }
  
  public gxt(int paramInt, boolean paramBoolean, Class paramClass)
  {
    this.a = paramInt;
    this.b = paramBoolean;
  }
  
  public final String toString()
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = Boolean.valueOf(this.b);
    return String.format(localLocale, "VisualElementTag {id: %d, isRootPage: %b}", arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gxt
 * JD-Core Version:    0.7.0.1
 */