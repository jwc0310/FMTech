import android.os.Build.VERSION;

public final class fl
{
  static final fm a = new fm();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new fn();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fl
 * JD-Core Version:    0.7.0.1
 */