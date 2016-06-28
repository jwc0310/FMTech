import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.social.networkqueue.impl.PendingNetworkRequestsFragment;
import java.util.ArrayList;

public final class izu
  extends gzf
{
  private final ize a;
  
  public izu(PendingNetworkRequestsFragment paramPendingNetworkRequestsFragment)
  {
    super("GetQueueStateTask");
    this.a = ((ize)paramPendingNetworkRequestsFragment.b.a(paramPendingNetworkRequestsFragment.a));
  }
  
  private final void d()
  {
    ArrayList localArrayList = this.a.e().getParcelableArrayList("networkqueue_change_displayitems");
    PendingNetworkRequestsFragment.a(this.b, localArrayList);
  }
  
  protected final hae a(Context paramContext)
  {
    int i;
    if (this.b.i())
    {
      if (this.a == null) {
        break label54;
      }
      if (this.a.g() != 0) {
        break label49;
      }
      i = 1;
      if (i != 0) {
        this.a.c();
      }
    }
    for (;;)
    {
      return new hae(true);
      label49:
      i = 0;
      break;
      label54:
      new iyw(paramContext).a(this.b.a);
    }
  }
  
  protected final void a_(hae paramhae)
  {
    if (this.b.i()) {
      d();
    }
  }
  
  protected final void f()
  {
    d();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     izu
 * JD-Core Version:    0.7.0.1
 */