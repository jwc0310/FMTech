import android.content.Context;
import android.media.MediaRouter.RouteInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import java.util.ArrayList;

class aca
  extends abw
  implements abg
{
  private abf o;
  private abi p;
  
  public aca(Context paramContext, acf paramacf)
  {
    super(paramContext, paramacf);
  }
  
  protected void a(aby paramaby, aad paramaad)
  {
    super.a(paramaby, paramaad);
    if (!((MediaRouter.RouteInfo)paramaby.a).isEnabled()) {
      paramaad.a.putBoolean("enabled", false);
    }
    if (a(paramaby)) {
      paramaad.a.putBoolean("connecting", true);
    }
    Display localDisplay = ((MediaRouter.RouteInfo)paramaby.a).getPresentationDisplay();
    if (localDisplay != null)
    {
      int i = localDisplay.getDisplayId();
      paramaad.a.putInt("presentationDisplayId", i);
    }
  }
  
  protected boolean a(aby paramaby)
  {
    if (this.p == null) {
      this.p = new abi();
    }
    return this.p.a(paramaby.a);
  }
  
  protected void b()
  {
    super.b();
    if (this.o == null) {
      this.o = new abf(this.a, this.c);
    }
    abf localabf = this.o;
    int i;
    if (this.l)
    {
      i = this.k;
      if ((i & 0x2) == 0) {
        break label87;
      }
      if ((!localabf.c) && (localabf.b != null))
      {
        localabf.c = true;
        localabf.a.post(localabf);
      }
    }
    label87:
    while (!localabf.c)
    {
      return;
      i = 0;
      break;
    }
    localabf.c = false;
    localabf.a.removeCallbacks(localabf);
  }
  
  protected final Object c()
  {
    return new abh(this);
  }
  
  public final void f(Object paramObject)
  {
    int i = g(paramObject);
    aby localaby;
    Display localDisplay;
    if (i >= 0)
    {
      localaby = (aby)this.n.get(i);
      localDisplay = ((MediaRouter.RouteInfo)paramObject).getPresentationDisplay();
      if (localDisplay == null) {
        break label100;
      }
    }
    label100:
    for (int j = localDisplay.getDisplayId();; j = -1)
    {
      if (j != localaby.c.a.getInt("presentationDisplayId", -1))
      {
        aad localaad = new aad(localaby.c);
        localaad.a.putInt("presentationDisplayId", j);
        localaby.c = localaad.a();
        a();
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aca
 * JD-Core Version:    0.7.0.1
 */