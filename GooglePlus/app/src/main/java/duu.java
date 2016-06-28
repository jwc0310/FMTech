import android.content.Context;
import android.content.res.Resources;

public final class duu
{
  public static int a;
  public static int b;
  public final Context c;
  public int d;
  public CharSequence e;
  
  public duu(Context paramContext)
  {
    this.c = paramContext;
    if (a == 0)
    {
      Resources localResources = paramContext.getResources();
      a = localResources.getColor(efj.jn);
      b = localResources.getColor(efj.jo);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     duu
 * JD-Core Version:    0.7.0.1
 */