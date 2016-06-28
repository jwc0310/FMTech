import android.content.Context;
import android.util.Log;

public final class jlx
  extends gzf
{
  boolean a;
  boolean b;
  private final Context c;
  private final int d;
  
  public jlx(Context paramContext, int paramInt)
  {
    super(paramContext, "UpdateLegalNotificationsTask");
    this.c = paramContext;
    this.d = paramInt;
  }
  
  protected final hae a()
  {
    jlt localjlt = new jlt(this.c, this.d);
    if (this.a) {
      localjlt.a = true;
    }
    if (this.b) {
      localjlt.b = true;
    }
    localjlt.i();
    if (localjlt.n())
    {
      int i = localjlt.o;
      Log.e("UpdateLegalNotificationsTask", 38 + "Could not upload settings: " + i, localjlt.q);
      return new hae(0, null, null);
    }
    return new hae(200, null, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jlx
 * JD-Core Version:    0.7.0.1
 */