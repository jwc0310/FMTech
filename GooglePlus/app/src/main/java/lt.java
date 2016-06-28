import android.os.Build.VERSION;

public final class lt
{
  public static final lu a = new lv();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      a = new lw();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lt
 * JD-Core Version:    0.7.0.1
 */