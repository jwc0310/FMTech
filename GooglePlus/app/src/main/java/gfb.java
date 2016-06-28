import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Bundle;
import com.google.android.libraries.photoeditor.core.NativeCore;
import com.google.android.libraries.photoeditor.core.Tile;
import com.google.android.libraries.photoeditor.core.TilesProvider;

public class gfb
{
  public Bundle a;
  Bitmap b;
  Bitmap c;
  Bitmap d;
  boolean e;
  int f;
  int g;
  final TilesProvider h;
  final Tile i;
  int j;
  int k;
  int l;
  int m;
  
  public gfb() {}
  
  public gfb(byte paramByte)
  {
    this();
    this.h = new TilesProvider();
    this.i = new Tile();
  }
  
  public void a()
  {
    this.b = null;
    this.c = null;
    if (this.d != null)
    {
      this.d.recycle();
      this.d = null;
    }
  }
  
  @Deprecated
  public void a(Bitmap paramBitmap1, Bitmap paramBitmap2)
  {
    if ((this.b == paramBitmap1) && (this.c == paramBitmap2)) {
      return;
    }
    a();
    if ((paramBitmap1 != null) && (paramBitmap1.getConfig() != Bitmap.Config.ARGB_8888)) {
      throw new IllegalArgumentException("Invalid pixel format");
    }
    if ((paramBitmap2 != null) && (paramBitmap2.getConfig() != Bitmap.Config.ARGB_8888)) {
      throw new IllegalArgumentException("Invalid pixel format");
    }
    this.b = paramBitmap1;
    this.c = paramBitmap2;
    this.e = true;
    this.j = paramBitmap1.getWidth();
    this.k = paramBitmap1.getHeight();
    this.l = paramBitmap2.getWidth();
    this.m = paramBitmap2.getHeight();
  }
  
  void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.e) {
      b();
    }
    if ((this.f == 0) && (this.c != null)) {
      this.f = NativeCore.createRGBX8TextureFromBitmap(9729, 6408, 33071, this.c);
    }
    Bitmap localBitmap = d();
    if ((this.g == 0) && (paramBoolean2) && (localBitmap != null)) {
      this.g = NativeCore.createRGBX8TextureFromBitmap(9729, 6408, 33071, localBitmap);
    }
  }
  
  public void b()
  {
    if (this.f > 0)
    {
      NativeCore.deleteTexture(this.f);
      this.f = 0;
    }
    if (this.g > 0)
    {
      NativeCore.deleteTexture(this.g);
      this.g = 0;
    }
    this.e = false;
  }
  
  public Bitmap c()
  {
    if (this.b != null) {
      return this.b;
    }
    return this.d;
  }
  
  public Bitmap d()
  {
    Bitmap localBitmap1;
    Bitmap localBitmap2;
    if (this.d == null)
    {
      localBitmap1 = this.b;
      if (localBitmap1 != null) {
        break label30;
      }
      localBitmap2 = null;
    }
    for (;;)
    {
      this.d = localBitmap2;
      return this.d;
      label30:
      int n = localBitmap1.getWidth();
      int i1 = localBitmap1.getHeight();
      int i2 = Math.max(n, i1);
      if (i2 > 512)
      {
        float f1 = 512.0F / i2;
        localBitmap2 = NativeCore.scaleImage(localBitmap1, Math.round(f1 * n), Math.round(f1 * i1));
      }
      else
      {
        localBitmap2 = localBitmap1.copy(Bitmap.Config.ARGB_8888, false);
      }
    }
  }
  
  public int e()
  {
    return this.f;
  }
  
  public TilesProvider f()
  {
    int n;
    if (this.d == null)
    {
      n = 0;
      if (this.d != null) {
        break label67;
      }
    }
    label67:
    for (int i1 = 0;; i1 = this.d.getHeight())
    {
      this.h.a(this.j, this.k, this.l, this.m, n, i1, this.g, this.f);
      return this.h;
      n = this.d.getWidth();
      break;
    }
  }
  
  public Tile g()
  {
    TilesProvider localTilesProvider = f();
    this.i.a(0, 0, localTilesProvider.getScaledWidth(), localTilesProvider.getScaledHeight(), e());
    return this.i;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gfb
 * JD-Core Version:    0.7.0.1
 */