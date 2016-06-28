import android.content.Context;
import com.google.android.libraries.social.networkqueue.impl.NetworkQueueService;
import java.util.Iterator;
import java.util.List;

public final class izm
  extends gzf
{
  private boolean a;
  
  public izm(NetworkQueueService paramNetworkQueueService)
  {
    super("NetworkQueueService");
    this.j = true;
  }
  
  protected final hae a(Context paramContext)
  {
    iyz localiyz = (iyz)mbb.a(paramContext, iyz.class);
    List localList = ((giz)mbb.a(localiyz.a, giz.class)).a(new String[] { "logged_in" });
    int i = localList.size();
    int j = 0;
    if (j < i)
    {
      ize localize = (ize)localiyz.c(((Integer)localList.get(j)).intValue());
      if (localize != null) {
        if (localize.g() != 0) {
          break label110;
        }
      }
      label110:
      for (int k = 1;; k = 0)
      {
        if (k != 0) {
          localize.c();
        }
        j++;
        break;
      }
    }
    Iterator localIterator = ((giz)mbb.a(paramContext, giz.class)).a(new String[] { "logged_in" }).iterator();
    boolean bool = false;
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      bool |= this.b.a(localInteger.intValue(), 0L, true);
    }
    this.a = bool;
    if (!this.a) {
      NetworkQueueService.a(this.b);
    }
    return new hae(true);
  }
  
  protected final void a_(hae paramhae)
  {
    if (!this.a) {
      this.b.c.a();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     izm
 * JD-Core Version:    0.7.0.1
 */