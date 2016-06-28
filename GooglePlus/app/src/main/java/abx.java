import android.media.MediaRouter.RouteInfo;

public final class abx
  extends aaj
{
  private final Object a;
  
  public abx(abw paramabw, Object paramObject)
  {
    this.a = paramObject;
  }
  
  public final void b(int paramInt)
  {
    ((MediaRouter.RouteInfo)this.a).requestSetVolume(paramInt);
  }
  
  public final void c(int paramInt)
  {
    ((MediaRouter.RouteInfo)this.a).requestUpdateVolume(paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     abx
 * JD-Core Version:    0.7.0.1
 */