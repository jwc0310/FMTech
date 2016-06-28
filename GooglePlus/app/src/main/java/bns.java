import android.content.Context;
import java.util.ArrayList;

public final class bns
  extends gzf
{
  private final int a;
  private final ArrayList<mjk> b;
  private final brm c;
  
  public bns(Context paramContext, int paramInt, ArrayList<mjk> paramArrayList, brm parambrm)
  {
    super(paramContext, "NotificationsAckTask");
    this.a = paramInt;
    this.b = paramArrayList;
    this.c = parambrm;
  }
  
  protected final hae a()
  {
    efj.e(this.e, "Either use the Context provided in doInBackground(), or if you're using deprecated methods, pass a Context into the BackgrounTask's constructor");
    bkl localbkl = new bkl(this.e, this.a, this.b, this.c);
    localbkl.i();
    return new hae(localbkl.o, localbkl.q, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bns
 * JD-Core Version:    0.7.0.1
 */