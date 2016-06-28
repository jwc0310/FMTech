import android.content.Context;
import android.os.ConditionVariable;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class cxd
  extends gzf
{
  public static final long a = TimeUnit.HOURS.toMillis(1L);
  private final kcg b;
  private int c;
  private giz d;
  
  public cxd(Context paramContext, int paramInt)
  {
    super("GetFollCircleIdTask");
    this.b = new kch().a(paramContext, paramInt).a();
    this.c = paramInt;
    this.d = ((giz)mbb.a(paramContext, giz.class));
  }
  
  protected final hae a(Context paramContext)
  {
    if (!this.d.c(this.c)) {
      return new hae(false);
    }
    long l = this.d.a(this.c).a("following_circle_id_last_sync", 0L);
    if (System.currentTimeMillis() - l < a) {
      return new hae(false);
    }
    cxc localcxc = new cxc(paramContext, this.b);
    ArrayList localArrayList = new ArrayList();
    ConditionVariable localConditionVariable = new ConditionVariable();
    cxe localcxe = new cxe(this, localArrayList, localConditionVariable);
    ((jiw)mbb.a(paramContext, jiw.class)).a(localcxe, this.c, jgx.a);
    localcxc.a.i();
    localcxc.a.c("GetFollowingCircleIdOp");
    localConditionVariable.block(5000L);
    String str2;
    if (!localcxc.a.n())
    {
      String str1 = localcxc.a();
      if (str1 == null)
      {
        if (Log.isLoggable("GetFollCircleIdTask", 6)) {
          Log.e("GetFollCircleIdTask", "Got unexpected empty, but successful response from server.");
        }
        return new hae(false);
      }
      str2 = efj.q(str1);
    }
    for (;;)
    {
      try
      {
        int i = localArrayList.size();
        int j = 0;
        if (j >= i) {
          break label394;
        }
        if (((jgw)localArrayList.get(j)).b().equals(str2))
        {
          str3 = ((jgw)localArrayList.get(j)).c();
          if (str3 == null)
          {
            if (Log.isLoggable("GetFollCircleIdTask", 6)) {
              Log.e("GetFollCircleIdTask", "Got good following circle ID, but was unable to match with existing circle name.");
            }
            return new hae(false);
          }
        }
        else
        {
          j++;
          continue;
        }
        this.d.b(this.c).b("following_circle_id", str2).b("following_circle_name", str3).b("following_circle_id_last_sync", System.currentTimeMillis()).d();
      }
      finally {}
      return new hae(localcxc.a.o, localcxc.a.q, null);
      label394:
      String str3 = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cxd
 * JD-Core Version:    0.7.0.1
 */