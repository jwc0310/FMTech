import android.media.MediaRouter.RouteInfo;
import android.media.MediaRouter.VolumeCallback;

public final class abe<T extends abd>
  extends MediaRouter.VolumeCallback
{
  private T a;
  
  public abe(T paramT)
  {
    this.a = paramT;
  }
  
  public final void onVolumeSetRequest(MediaRouter.RouteInfo paramRouteInfo, int paramInt)
  {
    this.a.a(paramRouteInfo, paramInt);
  }
  
  public final void onVolumeUpdateRequest(MediaRouter.RouteInfo paramRouteInfo, int paramInt)
  {
    this.a.b(paramRouteInfo, paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     abe
 * JD-Core Version:    0.7.0.1
 */