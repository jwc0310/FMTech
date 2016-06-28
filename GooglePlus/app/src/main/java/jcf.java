import android.content.Context;
import java.util.ArrayList;

final class jcf
  extends gzf
{
  private final int a;
  private final ArrayList<mjd> b;
  private final jan c;
  
  public jcf(Context paramContext, int paramInt, ArrayList<mjd> paramArrayList, jan paramjan)
  {
    super(paramContext, "NotificationsAckTask");
    this.a = paramInt;
    this.b = paramArrayList;
    this.c = paramjan;
  }
  
  protected final hae a()
  {
    jdn localjdn = new jdn(g(), this.a, this.b, this.c);
    localjdn.i();
    return new hae(localjdn.o, localjdn.q, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jcf
 * JD-Core Version:    0.7.0.1
 */