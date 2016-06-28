import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import com.google.android.apps.plus.views.PhotoView;
import com.google.android.libraries.social.tiledimage.views.TiledImageView;
import java.io.File;

public final class dyl
  implements kbb
{
  boolean a;
  public lsf b;
  public TiledImageView c;
  public boolean d = false;
  AsyncTask<Void, Void, lsf> e;
  int f;
  private iph h;
  private Matrix i = new Matrix();
  
  public dyl(PhotoView paramPhotoView) {}
  
  public final void a()
  {
    int j;
    float f2;
    label79:
    TiledImageView localTiledImageView;
    int m;
    label152:
    int n;
    label172:
    int i1;
    label192:
    int i2;
    int i3;
    float f4;
    int i4;
    int i5;
    int i6;
    label337:
    int i7;
    label375:
    int i8;
    label401:
    lsy locallsy2;
    if ((this.c != null) && (this.b != null) && (this.g.b != null))
    {
      this.i.set(this.g.h);
      if (this.b.d % 180 == 0) {
        break label433;
      }
      j = 1;
      float f1 = this.g.b.getIntrinsicWidth();
      if (j == 0) {
        break label438;
      }
      f2 = this.b.c;
      float f3 = f1 / f2;
      this.i.preScale(f3, f3);
      localTiledImageView = this.c;
      Matrix localMatrix = this.i;
      if ((TiledImageView.a) && (localTiledImageView.h.e != null))
      {
        int k = localTiledImageView.h.e.e();
        if (k % 180 == 0) {
          break label450;
        }
        m = 1;
        if (m == 0) {
          break label456;
        }
        n = localTiledImageView.h.e.c();
        if (m == 0) {
          break label474;
        }
        i1 = localTiledImageView.h.e.b();
        localTiledImageView.i.set(0.0F, 0.0F, n, i1);
        localMatrix.mapRect(localTiledImageView.i);
        localMatrix.getValues(localTiledImageView.f);
        i2 = n / 2;
        i3 = i1 / 2;
        f4 = localTiledImageView.f[0];
        i4 = Math.round((localTiledImageView.getWidth() - localTiledImageView.i.width()) / 2.0F / f4);
        i5 = Math.round((localTiledImageView.getHeight() - localTiledImageView.i.height()) / 2.0F / f4);
        if ((k != 90) && (k != 180)) {
          break label492;
        }
        i6 = (int)(i2 + (localTiledImageView.i.left / f4 - i4));
        if ((k != 180) && (k != 270)) {
          break label517;
        }
        i7 = (int)(i3 + (localTiledImageView.i.top / f4 - i5));
        localTiledImageView.h.a = f4;
        lsy locallsy1 = localTiledImageView.h;
        if (m == 0) {
          break label542;
        }
        i8 = i7;
        locallsy1.b = i8;
        locallsy2 = localTiledImageView.h;
        if (m == 0) {
          break label549;
        }
      }
    }
    for (;;)
    {
      locallsy2.c = i6;
      localTiledImageView.invalidate();
      return;
      label433:
      j = 0;
      break;
      label438:
      f2 = this.b.b;
      break label79;
      label450:
      m = 0;
      break label152;
      label456:
      n = localTiledImageView.h.e.b();
      break label172;
      label474:
      i1 = localTiledImageView.h.e.c();
      break label192;
      label492:
      i6 = (int)(i2 - (localTiledImageView.i.left / f4 - i4));
      break label337;
      label517:
      i7 = (int)(i3 - (localTiledImageView.i.top / f4 - i5));
      break label375;
      label542:
      i8 = i6;
      break label401;
      label549:
      i6 = i7;
    }
  }
  
  public final void a(kaz paramkaz)
  {
    switch (paramkaz.q)
    {
    default: 
      return;
    }
    File localFile = paramkaz.g();
    if (this.e != null) {
      this.e.cancel(true);
    }
    this.e = new dym(this, localFile);
    if (Build.VERSION.SDK_INT >= 11)
    {
      this.e.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
      return;
    }
    this.e.execute(new Void[0]);
  }
  
  public final void ap_()
  {
    boolean bool = d();
    this.a = false;
    if (this.h != null)
    {
      this.h.b(this);
      this.h = null;
    }
    if (this.e != null)
    {
      this.e.cancel(true);
      this.e = null;
    }
    if (this.c != null) {
      this.c.a(null, null);
    }
    this.b = null;
    if (bool) {
      this.g.invalidate();
    }
  }
  
  public final void b()
  {
    if ((!TiledImageView.a) || (this.h != null)) {}
    while (this.g.j) {
      return;
    }
    ipb localipb = PhotoView.B;
    ipf localipf = this.g.c;
    if (this.g.d == null) {}
    for (Object localObject = null;; localObject = new jpt(this.g.d))
    {
      this.h = localipb.a(localipf, 1, (ioy)localObject, 8226, this);
      return;
    }
  }
  
  public final boolean d()
  {
    return (this.a) && (this.d);
  }
  
  public final void e()
  {
    f();
    if ((!this.d) || (this.c == null) || (this.g.b == null)) {}
    ixf localixf;
    do
    {
      return;
      localixf = (ixf)mbb.a(this.g.getContext(), ixf.class);
    } while ((this.g.d() == this.g.o) && (localixf.e()));
    this.a = false;
    this.f = (1 + this.f);
    if (this.b != null)
    {
      g();
      return;
    }
    b();
  }
  
  public final void f()
  {
    TiledImageView localTiledImageView;
    if (this.c != null)
    {
      localTiledImageView = this.c;
      if (!d()) {
        break label27;
      }
    }
    label27:
    for (int j = 0;; j = 4)
    {
      localTiledImageView.setVisibility(j);
      return;
    }
  }
  
  final void g()
  {
    if ((this.c != null) && (this.b.a != null))
    {
      if (!this.a) {
        this.c.a(this.b, new dyn(this, this.f));
      }
      a();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dyl
 * JD-Core Version:    0.7.0.1
 */