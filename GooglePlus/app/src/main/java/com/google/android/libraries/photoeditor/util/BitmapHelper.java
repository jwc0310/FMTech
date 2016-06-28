package com.google.android.libraries.photoeditor.util;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.google.android.apps.common.proguard.UsedByNative;
import gid;
import java.io.IOException;
import java.io.InputStream;

@UsedByNative
public final class BitmapHelper
{
  public static Bitmap a(Bitmap paramBitmap)
  {
    if (paramBitmap.getConfig() == Bitmap.Config.ARGB_8888) {
      return paramBitmap;
    }
    Bitmap localBitmap = paramBitmap.copy(Bitmap.Config.ARGB_8888, false);
    paramBitmap.recycle();
    return localBitmap;
  }
  
  public static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    if (paramBitmap == null) {
      paramBitmap = null;
    }
    int i;
    int j;
    float f;
    do
    {
      return paramBitmap;
      i = paramBitmap.getWidth();
      j = paramBitmap.getHeight();
      f = a(i, j, paramInt1, paramInt2).x / i;
    } while (f >= 1.0F);
    Matrix localMatrix = new Matrix();
    localMatrix.setScale(f, f);
    return Bitmap.createBitmap(paramBitmap, 0, 0, i, j, localMatrix, true);
  }
  
  public static Bitmap a(gid paramgid, int paramInt, Bundle paramBundle)
  {
    Bitmap localBitmap = null;
    try
    {
      BitmapFactory.Options localOptions1 = new BitmapFactory.Options();
      InputStream localInputStream1 = paramgid.a();
      if (localInputStream1 != null)
      {
        localOptions1.inScaled = false;
        localOptions1.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(localInputStream1, null, localOptions1);
        localInputStream1.close();
      }
      int i = localOptions1.outWidth * localOptions1.outHeight;
      localBitmap = null;
      if (i == 0) {
        throw new IllegalStateException("Failed to extract image size");
      }
      int j = localOptions1.outWidth;
      int k = localOptions1.outHeight;
      int m = 1;
      while (k * j > paramInt)
      {
        m <<= 1;
        j = (-1 + (m + localOptions1.outWidth)) / m;
        k = (-1 + (m + localOptions1.outHeight)) / m;
      }
      BitmapFactory.Options localOptions2 = new BitmapFactory.Options();
      localOptions2.inPreferredConfig = Bitmap.Config.ARGB_8888;
      localOptions2.inDither = false;
      localOptions2.inPurgeable = true;
      localOptions2.inMutable = false;
      localOptions2.inPreferQualityOverSpeed = true;
      localBitmap = null;
      if (m > 1) {
        localOptions2.inSampleSize = m;
      }
      InputStream localInputStream2 = paramgid.a();
      localBitmap = BitmapFactory.decodeStream(localInputStream2, null, localOptions2);
      localInputStream2.close();
      return localBitmap;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      return localBitmap;
    }
    catch (SecurityException localSecurityException)
    {
      return localBitmap;
    }
    catch (IOException localIOException) {}
    return localBitmap;
  }
  
  public static Point a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Point localPoint = new Point();
    if ((paramInt3 <= 0) || (paramInt4 <= 0) || (paramInt1 <= 0) || (paramInt2 <= 0))
    {
      localPoint.set(0, 0);
      return localPoint;
    }
    if ((paramInt1 <= paramInt3) && (paramInt2 <= paramInt4))
    {
      localPoint.set(paramInt1, paramInt2);
      return localPoint;
    }
    if (paramInt1 / paramInt2 >= paramInt3 / paramInt4)
    {
      localPoint.x = Math.min(paramInt1, paramInt3);
      localPoint.y = (paramInt2 * localPoint.x / paramInt1);
      return localPoint;
    }
    localPoint.y = Math.min(paramInt2, paramInt4);
    localPoint.x = (paramInt1 * localPoint.y / paramInt2);
    return localPoint;
  }
  
  @UsedByNative
  public static Bitmap composeBitmaps(Bitmap paramBitmap1, Bitmap paramBitmap2)
  {
    if ((paramBitmap1 == null) || (paramBitmap2 == null)) {
      return null;
    }
    int i = Math.max(paramBitmap1.getWidth(), paramBitmap2.getWidth());
    int j = Math.max(paramBitmap1.getHeight(), paramBitmap2.getHeight());
    Bitmap localBitmap = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint();
    localCanvas.drawBitmap(paramBitmap1, (i - paramBitmap1.getWidth()) / 2.0F, (j - paramBitmap1.getHeight()) / 2.0F, localPaint);
    localCanvas.drawBitmap(paramBitmap2, (i - paramBitmap2.getWidth()) / 2.0F, (j - paramBitmap2.getHeight()) / 2.0F, localPaint);
    return localBitmap;
  }
  
  @UsedByNative
  public static Bitmap composeBitmaps(Bitmap paramBitmap, Drawable paramDrawable)
  {
    if ((paramBitmap == null) || (paramDrawable == null)) {
      return null;
    }
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    paramDrawable.setBounds(0, 0, i, j);
    Bitmap localBitmap = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    localCanvas.drawBitmap(paramBitmap, 0.0F, 0.0F, new Paint());
    paramDrawable.draw(localCanvas);
    return localBitmap;
  }
  
  @UsedByNative
  public static Bitmap createCenterCropBitmap(Bitmap paramBitmap, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    float f = Math.max(paramInt1 / i, paramInt2 / j);
    Rect localRect1 = new Rect(0, 0, paramInt1 - paramInt3 * 2, paramInt2 - paramInt3 * 2);
    Rect localRect2 = new Rect(0, 0, (int)Math.floor(localRect1.width() / f), (int)Math.floor(localRect1.height() / f));
    localRect1.offset(paramInt3, paramInt3);
    localRect2.offset((i - localRect2.width()) / 2, (j - localRect2.height()) / 2);
    Bitmap localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint();
    localCanvas.drawBitmap(paramBitmap, localRect2, localRect1, localPaint);
    if (paramInt4 > 0)
    {
      localPaint.setStrokeWidth(paramInt4);
      localPaint.setStyle(Paint.Style.STROKE);
      localPaint.setColor(paramInt5);
      localCanvas.drawRect(paramInt3 + paramInt4 / 2.0F, paramInt3 + paramInt4 / 2.0F, paramInt1 - paramInt4 / 2.0F - paramInt3, paramInt2 - paramInt4 / 2.0F - paramInt3, localPaint);
    }
    return localBitmap;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.photoeditor.util.BitmapHelper
 * JD-Core Version:    0.7.0.1
 */