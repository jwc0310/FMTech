import android.content.Context;
import android.media.MediaRouter;
import android.media.MediaRouter.Callback;
import android.media.MediaRouter.RouteInfo;
import android.media.MediaRouter.UserRouteInfo;
import android.os.Bundle;

final class acb
  extends aca
{
  public acb(Context paramContext, acf paramacf)
  {
    super(paramContext, paramacf);
  }
  
  protected final void a(aby paramaby, aad paramaad)
  {
    super.a(paramaby, paramaad);
    CharSequence localCharSequence = ((MediaRouter.RouteInfo)paramaby.a).getDescription();
    if (localCharSequence != null)
    {
      String str = localCharSequence.toString();
      paramaad.a.putString("status", str);
    }
  }
  
  protected final void a(abz paramabz)
  {
    super.a(paramabz);
    Object localObject = paramabz.b;
    String str = paramabz.a.e;
    ((MediaRouter.UserRouteInfo)localObject).setDescription(str);
  }
  
  protected final boolean a(aby paramaby)
  {
    return ((MediaRouter.RouteInfo)paramaby.a).isConnecting();
  }
  
  protected final void b()
  {
    boolean bool = true;
    if (this.m)
    {
      Object localObject3 = this.i;
      Object localObject4 = this.j;
      ((MediaRouter)localObject3).removeCallback((MediaRouter.Callback)localObject4);
    }
    this.m = bool;
    Object localObject1 = this.i;
    int i = this.k;
    Object localObject2 = this.j;
    if (this.l) {}
    for (;;)
    {
      int j = bool | true;
      ((MediaRouter)localObject1).addCallback(i, (MediaRouter.Callback)localObject2, j);
      return;
      bool = false;
    }
  }
  
  protected final Object d()
  {
    return ((MediaRouter)this.i).getDefaultRoute();
  }
  
  protected final void h(Object paramObject)
  {
    ((MediaRouter)this.i).selectRoute(8388611, (MediaRouter.RouteInfo)paramObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     acb
 * JD-Core Version:    0.7.0.1
 */