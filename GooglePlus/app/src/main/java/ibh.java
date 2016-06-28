import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.opengl.GLUtils;
import java.util.HashMap;
import junit.framework.Assert;

public abstract class ibh
  extends iax
{
  private static HashMap<ibi, Bitmap> j = new HashMap();
  private static ibi k = new ibi();
  public boolean h = true;
  public Bitmap i;
  private boolean l = true;
  private boolean m = false;
  private int n;
  
  public ibh()
  {
    this(false);
  }
  
  protected ibh(boolean paramBoolean)
  {
    super(null, 0, 0);
    if (paramBoolean)
    {
      this.e = true;
      this.n = 1;
    }
  }
  
  private static Bitmap a(boolean paramBoolean, Bitmap.Config paramConfig, int paramInt)
  {
    ibi localibi = k;
    localibi.a = paramBoolean;
    localibi.b = paramConfig;
    localibi.c = paramInt;
    Bitmap localBitmap1 = (Bitmap)j.get(localibi);
    if (localBitmap1 == null)
    {
      if (paramBoolean) {}
      for (Bitmap localBitmap2 = Bitmap.createBitmap(1, paramInt, paramConfig);; localBitmap2 = Bitmap.createBitmap(paramInt, 1, paramConfig))
      {
        j.put((ibi)localibi.clone(), localBitmap2);
        return localBitmap2;
      }
    }
    return localBitmap1;
  }
  
  private final Bitmap k()
  {
    if (this.i == null)
    {
      this.i = aD_();
      int i1 = this.i.getWidth() + (this.n << 1);
      int i2 = this.i.getHeight() + (this.n << 1);
      if (this.c == -1) {
        a(i1, i2);
      }
    }
    return this.i;
  }
  
  public abstract void a(Bitmap paramBitmap);
  
  protected final boolean a(iaz paramiaz)
  {
    b(paramiaz);
    return j();
  }
  
  public abstract Bitmap aD_();
  
  public final int b()
  {
    if (this.c == -1) {
      k();
    }
    return this.c;
  }
  
  public final void b(iaz paramiaz)
  {
    int i1;
    if (this.b == 1)
    {
      i1 = 1;
      if (i1 != 0) {
        break label362;
      }
      localBitmap2 = k();
      if (localBitmap2 == null) {
        break label347;
      }
    }
    label347:
    label362:
    while (this.h)
    {
      try
      {
        Bitmap localBitmap2;
        int i4 = localBitmap2.getWidth();
        int i5 = localBitmap2.getHeight();
        int i6 = d();
        int i7 = e();
        boolean bool = false;
        if (i4 <= i6)
        {
          bool = false;
          if (i5 <= i7) {
            bool = true;
          }
        }
        Assert.assertTrue(bool);
        this.a = paramiaz.a().a();
        paramiaz.b(this);
        if ((i4 == i6) && (i5 == i7)) {
          paramiaz.a(this, localBitmap2);
        }
        for (;;)
        {
          i();
          this.f = paramiaz;
          this.b = 1;
          this.h = true;
          return;
          i1 = 0;
          break;
          int i8 = GLUtils.getInternalFormat(localBitmap2);
          int i9 = GLUtils.getType(localBitmap2);
          Bitmap.Config localConfig = localBitmap2.getConfig();
          paramiaz.a(this, i8, i9);
          paramiaz.a(this, this.n, this.n, localBitmap2, i8, i9);
          if (this.n > 0)
          {
            paramiaz.a(this, 0, 0, a(true, localConfig, i7), i8, i9);
            paramiaz.a(this, 0, 0, a(false, localConfig, i6), i8, i9);
          }
          if (i4 + this.n < i6)
          {
            Bitmap localBitmap4 = a(true, localConfig, i7);
            paramiaz.a(this, i4 + this.n, 0, localBitmap4, i8, i9);
          }
          if (i5 + this.n < i7)
          {
            Bitmap localBitmap3 = a(false, localConfig, i6);
            paramiaz.a(this, 0, i5 + this.n, localBitmap3, i8, i9);
          }
        }
        this.b = -1;
      }
      finally
      {
        i();
      }
      throw new RuntimeException("Texture load fail, no bitmap");
    }
    Bitmap localBitmap1 = k();
    int i2 = GLUtils.getInternalFormat(localBitmap1);
    int i3 = GLUtils.getType(localBitmap1);
    paramiaz.a(this, this.n, this.n, localBitmap1, i2, i3);
    i();
    this.h = true;
  }
  
  public final int c()
  {
    if (this.c == -1) {
      k();
    }
    return this.d;
  }
  
  protected final int f()
  {
    return 3553;
  }
  
  public final void g()
  {
    super.g();
    if (this.i != null) {
      i();
    }
  }
  
  public final boolean h()
  {
    return this.l;
  }
  
  public final void i()
  {
    if (this.i == null) {
      throw new NullPointerException();
    }
    a(this.i);
    this.i = null;
  }
  
  public final boolean j()
  {
    if (this.b == 1) {}
    for (int i1 = 1; (i1 != 0) && (this.h); i1 = 0) {
      return true;
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ibh
 * JD-Core Version:    0.7.0.1
 */