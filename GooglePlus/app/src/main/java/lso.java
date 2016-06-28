import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.libraries.social.tiledimage.views.TiledImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public class lso
{
  public iba a;
  public Runnable b;
  public boolean c;
  
  public lso(TiledImageView paramTiledImageView) {}
  
  public void a()
  {
    this.a = new iba();
    synchronized (iax.g)
    {
      Iterator localIterator = iax.g.keySet().iterator();
      if (localIterator.hasNext())
      {
        iax localiax = (iax)localIterator.next();
        localiax.b = 0;
        localiax.f = null;
      }
    }
    this.d.h.g.a(this.d.h.e, this.d.h.d);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    iba localiba = this.a;
    localiba.c = paramInt1;
    localiba.d = paramInt2;
    GLES20.glViewport(0, 0, localiba.c, localiba.d);
    iba.d();
    Matrix.setIdentityM(localiba.a, localiba.b);
    Matrix.orthoM(localiba.e, 0, 0.0F, paramInt1, 0.0F, paramInt2, -1.0F, 1.0F);
    if ((ibf)localiba.f.get(-1 + localiba.f.size()) == null)
    {
      Matrix.translateM(localiba.a, localiba.b, 0.0F, paramInt2, 0.0F);
      Matrix.scaleM(localiba.a, localiba.b, 1.0F, -1.0F, 1.0F);
    }
    lsr locallsr = this.d.h.g;
    locallsr.s = paramInt1;
    locallsr.t = paramInt2;
  }
  
  public void b()
  {
    
    synchronized (this.d.g)
    {
      this.b = this.d.h.f;
      this.d.h.g.a(this.d.h.e, this.d.h.d);
      lsr locallsr = this.d.h.g;
      int i = this.d.h.b;
      int j = this.d.h.c;
      float f = this.d.h.a;
      if ((locallsr.m != i) || (locallsr.n != j) || (locallsr.o != f))
      {
        locallsr.m = i;
        locallsr.n = j;
        locallsr.o = f;
        locallsr.p = true;
      }
      this.c = this.d.h.g.a(this.a);
      return;
    }
  }
  
  public void c()
  {
    if ((this.c) && (this.b != null)) {
      synchronized (this.d.g)
      {
        if (this.d.h.f == this.b) {
          this.d.h.f = null;
        }
        this.d.post(this.b);
        this.b = null;
        return;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lso
 * JD-Core Version:    0.7.0.1
 */