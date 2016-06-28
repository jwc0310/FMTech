import android.media.MediaRouter;
import android.media.MediaRouter.RouteInfo;

public final class abh<T extends abg>
  extends aba<T>
{
  public abh(T paramT)
  {
    super(paramT);
  }
  
  public final void onRoutePresentationDisplayChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
  {
    ((abg)this.a).f(paramRouteInfo);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     abh
 * JD-Core Version:    0.7.0.1
 */