import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.google.android.apps.plus.views.PhotoView;

final class axq
  implements dyp
{
  private final Rect a = new Rect();
  private final int[] b = new int[2];
  
  axq(axk paramaxk) {}
  
  public final void a(PhotoView paramPhotoView, kaz paramkaz)
  {
    axk.a(this.c, axo.b);
    if (paramPhotoView.l) {
      this.c.b.a(gxz.dz);
    }
    int i;
    bdk localbdk1;
    int j;
    if ((0x800000 & this.c.d.b.n()) != 0L)
    {
      i = 1;
      localbdk1 = this.c.d;
      if (i == 0) {
        break label181;
      }
      j = 4;
    }
    for (;;)
    {
      localbdk1.f = j;
      localbdk1.a.a();
      bdk localbdk2 = this.c.d;
      localbdk2.d = true;
      localbdk2.a.a();
      c();
      bcp localbcp = this.c.d.b;
      if ((localbcp.E()) && (!localbcp.O()))
      {
        this.c.aa.f(true);
        this.c.ab = true;
      }
      return;
      i = 0;
      break;
      label181:
      PhotoView localPhotoView = this.c.aa;
      if (localPhotoView.e == null) {
        j = -1;
      } else {
        j = localPhotoView.e.s;
      }
    }
  }
  
  public final void ad_()
  {
    c();
  }
  
  public final void b()
  {
    c();
  }
  
  final void c()
  {
    bdi localbdi1 = this.c.Z;
    PhotoView localPhotoView1 = this.c.aa;
    float f;
    if (localPhotoView1.o != 0.0F)
    {
      f = localPhotoView1.d() / localPhotoView1.o;
      if (Math.abs(f - 1.0F) <= 0.04999995F) {
        break label230;
      }
    }
    label230:
    for (boolean bool = true;; bool = false)
    {
      localbdi1.c = bool;
      localbdi1.a.a();
      PhotoView localPhotoView2 = this.c.aa;
      Rect localRect1 = this.a;
      localPhotoView2.u.set(localPhotoView2.q);
      localPhotoView2.h.mapRect(localPhotoView2.u);
      localRect1.set((int)localPhotoView2.u.left, (int)localPhotoView2.u.top, (int)localPhotoView2.u.right, (int)localPhotoView2.u.bottom);
      PhotoView localPhotoView3 = this.c.aa;
      Rect localRect2 = this.a;
      localPhotoView3.getLocationInWindow(this.b);
      localRect2.offset(this.b[0], this.b[1]);
      bdi localbdi2 = this.c.Z;
      Rect localRect3 = this.a;
      localbdi2.b.set(localRect3);
      localbdi2.a.a();
      return;
      f = 1.0F;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     axq
 * JD-Core Version:    0.7.0.1
 */