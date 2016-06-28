import android.os.Build.VERSION;

public final class iv
{
  public static final ix a = new iw();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new ja();
      return;
    }
    if (Build.VERSION.SDK_INT >= 13)
    {
      a = new iz();
      return;
    }
    if (Build.VERSION.SDK_INT >= 8)
    {
      a = new iy();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iv
 * JD-Core Version:    0.7.0.1
 */