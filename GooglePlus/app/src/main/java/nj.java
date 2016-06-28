import android.os.Build.VERSION;

public final class nj
{
  public static final ns a = new ns();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new nr();
      return;
    }
    if (i >= 19)
    {
      a = new nq();
      return;
    }
    if (i >= 17)
    {
      a = new np();
      return;
    }
    if (i >= 16)
    {
      a = new no();
      return;
    }
    if (i >= 14)
    {
      a = new nn();
      return;
    }
    if (i >= 11)
    {
      a = new nm();
      return;
    }
    if (i >= 9)
    {
      a = new nl();
      return;
    }
    if (i >= 7)
    {
      a = new nk();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     nj
 * JD-Core Version:    0.7.0.1
 */