import android.os.Build.VERSION;

public final class mb
{
  public static final mc a = new mc();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new me();
      return;
    }
    if (i >= 11)
    {
      a = new md();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mb
 * JD-Core Version:    0.7.0.1
 */