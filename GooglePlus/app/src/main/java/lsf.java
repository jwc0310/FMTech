import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.IOException;

@TargetApi(15)
public final class lsf
  implements lsv
{
  private static final boolean e;
  public BitmapRegionDecoder a;
  public int b;
  public int c;
  public final int d;
  private int f;
  private iax g;
  private Rect h = new Rect();
  private Rect i = new Rect();
  private BitmapFactory.Options j;
  private Canvas k;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 16) {}
    for (boolean bool = true;; bool = false)
    {
      e = bool;
      return;
    }
  }
  
  public lsf(Context paramContext, String paramString, int paramInt1, int paramInt2)
  {
    this.f = lsr.a(paramContext);
    this.d = paramInt2;
    try
    {
      this.a = BitmapRegionDecoder.newInstance(paramString, true);
      this.b = this.a.getWidth();
      this.c = this.a.getHeight();
      label71:
      this.j = new BitmapFactory.Options();
      this.j.inPreferredConfig = Bitmap.Config.ARGB_8888;
      this.j.inPreferQualityOverSpeed = true;
      this.j.inTempStorage = new byte[16384];
      int m;
      Object localObject1;
      Object localObject2;
      if (paramInt1 != 0)
      {
        m = Math.min(paramInt1, 1024);
        float f1 = m / Math.max(this.b, this.c);
        this.j.inSampleSize = efj.b(f1);
        this.j.inJustDecodeBounds = false;
        localObject1 = BitmapFactory.decodeFile(paramString, this.j);
        if (localObject1 != null) {
          break label222;
        }
        localObject2 = null;
        if (localObject2 != null)
        {
          if ((((Bitmap)localObject2).getWidth() > 2048) || (((Bitmap)localObject2).getHeight() > 2048)) {
            break label421;
          }
          this.g = new iay((Bitmap)localObject2);
        }
      }
      label222:
      while (!Log.isLoggable("BitmapRegionTileSource", 5))
      {
        return;
        float f2 = m / Math.max(((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight());
        int n;
        int i1;
        Object localObject3;
        if (f2 <= 0.5D)
        {
          n = Math.round(f2 * ((Bitmap)localObject1).getWidth());
          i1 = Math.round(f2 * ((Bitmap)localObject1).getHeight());
          if ((n != ((Bitmap)localObject1).getWidth()) || (i1 != ((Bitmap)localObject1).getHeight())) {
            break label328;
          }
          localObject3 = localObject1;
        }
        for (;;)
        {
          localObject1 = localObject3;
          if ((localObject1 != null) && (((Bitmap)localObject1).getConfig() == null)) {
            break label402;
          }
          localObject2 = localObject1;
          break;
          Bitmap.Config localConfig = ((Bitmap)localObject1).getConfig();
          if (localConfig == null) {
            localConfig = Bitmap.Config.ARGB_8888;
          }
          localObject3 = Bitmap.createBitmap(n, i1, localConfig);
          Canvas localCanvas = new Canvas((Bitmap)localObject3);
          localCanvas.scale(f2, f2);
          localCanvas.drawBitmap((Bitmap)localObject1, 0.0F, 0.0F, new Paint(6));
          ((Bitmap)localObject1).recycle();
        }
        localObject2 = ((Bitmap)localObject1).copy(Bitmap.Config.ARGB_8888, false);
        ((Bitmap)localObject1).recycle();
        break;
      }
      label328:
      Object[] arrayOfObject = new Object[4];
      label402:
      label421:
      arrayOfObject[0] = Integer.valueOf(this.b);
      arrayOfObject[1] = Integer.valueOf(this.c);
      arrayOfObject[2] = Integer.valueOf(((Bitmap)localObject2).getWidth());
      arrayOfObject[3] = Integer.valueOf(((Bitmap)localObject2).getHeight());
      String.format("Failed to create preview of appropriate size!  in: %dx%d, out: %dx%d", arrayOfObject);
      return;
    }
    catch (IOException localIOException)
    {
      break label71;
    }
  }
  
  public final int a()
  {
    return this.f;
  }
  
  public final Bitmap a(int paramInt1, int paramInt2, int paramInt3, Bitmap paramBitmap)
  {
    int m = this.f;
    Object localObject2;
    if (!e)
    {
      int i1 = m << paramInt1;
      this.h.set(paramInt2, paramInt3, paramInt2 + i1, i1 + paramInt3);
      this.i.set(0, 0, this.b, this.c);
      this.j.inSampleSize = (1 << paramInt1);
      localObject2 = this.a.decodeRegion(this.i, this.j);
      if (!this.h.equals(this.i)) {}
    }
    for (;;)
    {
      return localObject2;
      Bitmap localBitmap2 = Bitmap.createBitmap(m, m, Bitmap.Config.ARGB_8888);
      if (this.k == null) {
        this.k = new Canvas();
      }
      this.k.setBitmap(localBitmap2);
      this.k.drawBitmap((Bitmap)localObject2, this.i.left - this.h.left >> paramInt1, this.i.top - this.h.top >> paramInt1, null);
      this.k.setBitmap(null);
      return localBitmap2;
      int n = m << paramInt1;
      this.h.set(paramInt2, paramInt3, paramInt2 + n, n + paramInt3);
      if (paramBitmap == null) {
        paramBitmap = Bitmap.createBitmap(m, m, Bitmap.Config.ARGB_8888);
      }
      this.j.inSampleSize = (1 << paramInt1);
      this.j.inBitmap = paramBitmap;
      try
      {
        Bitmap localBitmap1 = this.a.decodeRegion(this.h, this.j);
        localObject2 = localBitmap1;
        if ((this.j.inBitmap == localObject2) || (this.j.inBitmap == null)) {
          continue;
        }
        this.j.inBitmap = null;
        return localObject2;
      }
      finally
      {
        if ((this.j.inBitmap != paramBitmap) && (this.j.inBitmap != null)) {
          this.j.inBitmap = null;
        }
      }
    }
  }
  
  public final int b()
  {
    return this.b;
  }
  
  public final int c()
  {
    return this.c;
  }
  
  public final iax d()
  {
    return this.g;
  }
  
  public final int e()
  {
    return this.d;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lsf
 * JD-Core Version:    0.7.0.1
 */