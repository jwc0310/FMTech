import android.os.Build.VERSION;

public final class df
{
  static final do a = new do();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      a = new dq();
      return;
    }
    if (Build.VERSION.SDK_INT >= 20)
    {
      a = new dp();
      return;
    }
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new dv();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new du();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new dt();
      return;
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new ds();
      return;
    }
    if (Build.VERSION.SDK_INT >= 9)
    {
      a = new dr();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     df
 * JD-Core Version:    0.7.0.1
 */