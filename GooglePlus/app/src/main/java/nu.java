import android.os.Build.VERSION;

public final class nu
{
  public static final ny a = new ny();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new nx();
      return;
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new nw();
      return;
    }
    if (Build.VERSION.SDK_INT >= 8)
    {
      a = new nv();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nu
 * JD-Core Version:    0.7.0.1
 */