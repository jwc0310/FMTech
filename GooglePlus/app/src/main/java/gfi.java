import com.google.android.libraries.photoeditor.core.NativeFilterParameter;

public class gfi
  extends NativeFilterParameter
{
  public static final int[] a = { 501, 502, 4, 202, 203 };
  private static Integer g = Integer.valueOf(50);
  private static Integer h = Integer.valueOf(1);
  private static Integer i = Integer.valueOf(100);
  
  public final float b(int paramInt)
  {
    if (g(paramInt)) {
      return super.b(paramInt);
    }
    switch (paramInt)
    {
    default: 
      return d.intValue();
    case 501: 
    case 502: 
      return 0.0F;
    case 4: 
      return h.intValue();
    }
    return -2.147484E+009F;
  }
  
  public final float c(int paramInt)
  {
    if (g(paramInt)) {
      return super.c(paramInt);
    }
    switch (paramInt)
    {
    default: 
      return c.intValue();
    case 501: 
    case 502: 
      return 1.0F;
    case 4: 
      return i.intValue();
    }
    return 2.147484E+009F;
  }
  
  public final Object d(int paramInt)
  {
    if (paramInt == 4) {}
    for (int j = g.intValue();; j = 0) {
      return Integer.valueOf(j);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gfi
 * JD-Core Version:    0.7.0.1
 */