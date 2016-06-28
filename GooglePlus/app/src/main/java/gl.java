import android.os.Build.VERSION;

public final class gl
{
  public static final gm a = new gm();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23)
    {
      a = new gs();
      return;
    }
    if (i >= 22)
    {
      a = new gr();
      return;
    }
    if (i >= 21)
    {
      a = new gq();
      return;
    }
    if (i >= 19)
    {
      a = new gp();
      return;
    }
    if (i >= 17)
    {
      a = new go();
      return;
    }
    if (i >= 11)
    {
      a = new gn();
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gl
 * JD-Core Version:    0.7.0.1
 */