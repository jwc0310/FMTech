import android.os.Build.VERSION;

public final class cxk
{
  public static final String a = jpd.class.getName();
  private static cxi b;
  
  public static void a(mbb parammbb)
  {
    if (b == null) {
      b = new cxi();
    }
    cxi localcxi = b;
    if (Build.VERSION.SDK_INT < 23) {}
    for (Object localObject = new jos();; localObject = new cxj(localcxi))
    {
      parammbb.a(jpd.class, localObject);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cxk
 * JD-Core Version:    0.7.0.1
 */