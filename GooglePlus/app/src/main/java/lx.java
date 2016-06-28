import android.os.Build.VERSION;

public final class lx
{
  public static final ma a = new ma();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new lz();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lx
 * JD-Core Version:    0.7.0.1
 */