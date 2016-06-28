import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.os.Build.VERSION;
import android.util.Log;

public final class lwe
{
  private static final iag<Paint> a = new lwf();
  private static final iag<Paint> b = new lwf();
  
  @TargetApi(12)
  public static Bitmap a(Bitmap paramBitmap)
  {
    long l1 = System.nanoTime();
    if (Build.VERSION.SDK_INT >= 12) {
      paramBitmap.setHasAlpha(true);
    }
    if ((!paramBitmap.isMutable()) || (!paramBitmap.hasAlpha())) {
      paramBitmap = paramBitmap.copy(Bitmap.Config.ARGB_8888, true);
    }
    a(new Canvas(paramBitmap));
    if (Log.isLoggable("BitmapShapeUtils", 3))
    {
      long l2 = System.nanoTime() - l1;
      new StringBuilder(43).append("Avatar rounding took ").append(l2).append("ns");
    }
    return paramBitmap;
  }
  
  public static Bitmap a(Bitmap paramBitmap, float paramFloat)
  {
    return a(paramBitmap, paramFloat, null);
  }
  
  public static Bitmap a(Bitmap paramBitmap1, float paramFloat, Bitmap paramBitmap2)
  {
    if (paramBitmap1 == null) {
      return null;
    }
    if ((paramBitmap2 != null) && ((paramBitmap2.getWidth() != paramBitmap1.getWidth()) || (paramBitmap2.getHeight() != paramBitmap1.getHeight()) || (!paramBitmap2.isMutable())))
    {
      String str = String.valueOf("Given bitmap cannot be reused; Invalid dimensions or immutable: mutable=");
      boolean bool = paramBitmap2.isMutable();
      int m = paramBitmap2.getWidth();
      int n = paramBitmap2.getHeight();
      int i1 = paramBitmap1.getWidth();
      int i2 = paramBitmap1.getHeight();
      throw new IllegalArgumentException(85 + String.valueOf(str).length() + str + bool + " forMask dimens=[" + m + "x" + n + " bitmap dimens=[" + i1 + "x" + i2 + "]");
    }
    int i = paramBitmap1.getWidth();
    int j = paramBitmap1.getHeight();
    int k;
    if (paramBitmap2 != null)
    {
      k = 1;
      label178:
      if (paramBitmap2 != null) {
        break label256;
      }
    }
    Bitmap localBitmap1;
    for (;;)
    {
      try
      {
        Bitmap localBitmap2 = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
        localBitmap1 = localBitmap2;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        localBitmap1 = paramBitmap2;
        continue;
      }
      if (localBitmap1 != null) {
        break label275;
      }
      if (!Log.isLoggable("BitmapShapeUtils", 5)) {
        break;
      }
      new StringBuilder(85).append("Failed to allocate a bitmap for roundedCornersBitmap of size: ").append(i).append("x").append(j);
      return null;
      k = 0;
      break label178;
      label256:
      if (Build.VERSION.SDK_INT >= 12) {
        paramBitmap2.setHasAlpha(true);
      }
      localBitmap1 = paramBitmap2;
    }
    label275:
    BitmapShader localBitmapShader = new BitmapShader(paramBitmap1, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    localPaint.setShader(localBitmapShader);
    RectF localRectF = new RectF(0.0F, 0.0F, paramBitmap1.getWidth(), paramBitmap1.getHeight());
    Canvas localCanvas = new Canvas(localBitmap1);
    if (k != 0) {
      localCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
    }
    localCanvas.drawRoundRect(localRectF, paramFloat, paramFloat, localPaint);
    return localBitmap1;
  }
  
  public static void a(Canvas paramCanvas)
  {
    if (efj.j())
    {
      a(paramCanvas, (Paint)a.b());
      return;
    }
    synchronized ((Paint)b.b())
    {
      a(paramCanvas, ???);
      return;
    }
  }
  
  private static void a(Canvas paramCanvas, Paint paramPaint)
  {
    float f1 = Math.min(paramCanvas.getWidth(), paramCanvas.getHeight()) / 2.0F;
    float f2 = (float)Math.hypot(paramCanvas.getWidth(), paramCanvas.getHeight()) - f1;
    paramPaint.setStrokeWidth(f2);
    paramCanvas.drawCircle(paramCanvas.getWidth() / 2.0F, paramCanvas.getHeight() / 2.0F, f1 + f2 / 2.0F, paramPaint);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lwe
 * JD-Core Version:    0.7.0.1
 */