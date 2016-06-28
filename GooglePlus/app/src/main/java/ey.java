import android.os.Build.VERSION;

public final class ey
{
  static
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      new fb((byte)0);
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      new fb();
      return;
    }
    new fa();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ey
 * JD-Core Version:    0.7.0.1
 */