import android.os.Build.VERSION;

public final class nf
{
  public static final ni a = new ng();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new nh();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nf
 * JD-Core Version:    0.7.0.1
 */