import android.os.Build.VERSION;

public final class ju
{
  static final jv a = new jw();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new jy();
      return;
    }
    if (i >= 14)
    {
      a = new jx();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ju
 * JD-Core Version:    0.7.0.1
 */