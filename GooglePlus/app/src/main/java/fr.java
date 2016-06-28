import android.os.Build.VERSION;

public final class fr
{
  public static final fs a = new fs();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 15)
    {
      a = new ft((byte)0);
      return;
    }
    if (i >= 11)
    {
      a = new ft();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fr
 * JD-Core Version:    0.7.0.1
 */