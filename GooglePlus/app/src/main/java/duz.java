import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;

final class duz
  implements SurfaceHolder.Callback
{
  duz(duy paramduy) {}
  
  public final void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    this.a.a = paramSurfaceHolder;
    if (this.a.a != null)
    {
      Surface localSurface = this.a.a.getSurface();
      if ((localSurface != null) && (localSurface.isValid())) {
        this.a.a();
      }
    }
  }
  
  public final void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    this.a.a = null;
    this.a.d();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     duz
 * JD-Core Version:    0.7.0.1
 */