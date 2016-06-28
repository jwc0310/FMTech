import android.os.Build.VERSION;

public final class nz
{
  public static final ob a = new ob();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new oc((byte)0);
      return;
    }
    if (i >= 18)
    {
      a = new oc();
      return;
    }
    if (i >= 14)
    {
      a = new oa((byte)0);
      return;
    }
    if (i >= 11)
    {
      a = new oa();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nz
 * JD-Core Version:    0.7.0.1
 */