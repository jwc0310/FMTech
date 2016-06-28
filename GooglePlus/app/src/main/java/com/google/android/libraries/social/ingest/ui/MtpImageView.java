package com.google.android.libraries.social.ingest.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.mtp.MtpDevice;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import ihg;
import ihk;
import ihl;
import ihp;
import ihy;
import ihz;
import java.lang.ref.WeakReference;
import java.util.Set;

public class MtpImageView
  extends ImageView
{
  public static final ihz g = new ihz();
  private static final ihy j;
  public WeakReference<MtpImageView> a = new WeakReference(this);
  public final Object b = new Object();
  public boolean c = false;
  public ihk d;
  public MtpDevice e;
  public Object f;
  private int h;
  private int i;
  private float k;
  private float l;
  private int m;
  private Matrix n = new Matrix();
  
  static
  {
    HandlerThread localHandlerThread = new HandlerThread("MtpImageView Fetch");
    localHandlerThread.start();
    j = new ihy(localHandlerThread.getLooper());
  }
  
  public MtpImageView(Context paramContext)
  {
    super(paramContext);
    setImageResource(17170445);
  }
  
  public MtpImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setImageResource(17170445);
  }
  
  public MtpImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setImageResource(17170445);
  }
  
  private final void b()
  {
    this.n.reset();
    float f1 = getHeight();
    float f2 = getWidth();
    int i1;
    float f5;
    float f6;
    if (this.m % 180 != 0)
    {
      i1 = 1;
      if (i1 == 0) {
        break label223;
      }
      float f8 = this.l;
      float f9 = this.k;
      f5 = f8;
      f6 = f9;
      label56:
      if ((f5 > f2) || (f6 > f1)) {
        break label246;
      }
    }
    label223:
    label246:
    for (float f7 = 1.0F;; f7 = Math.min(f2 / f5, f1 / f6))
    {
      this.n.setScale(f7, f7);
      if (i1 != 0)
      {
        this.n.postTranslate(0.5F * (f7 * -f6), 0.5F * (f7 * -f5));
        this.n.postRotate(this.m);
        this.n.postTranslate(0.5F * (f5 * f7), 0.5F * (f6 * f7));
      }
      this.n.postTranslate(0.5F * (f2 - f5 * f7), 0.5F * (f1 - f7 * f6));
      if ((i1 == 0) && (this.m > 0)) {
        this.n.postRotate(this.m, f2 / 2.0F, f1 / 2.0F);
      }
      setImageMatrix(this.n);
      return;
      i1 = 0;
      break;
      float f3 = this.k;
      float f4 = this.l;
      f5 = f3;
      f6 = f4;
      break label56;
    }
  }
  
  public Object a(MtpDevice paramMtpDevice, ihk paramihk)
  {
    int i1 = 1;
    if ((paramihk.d <= 8388608) && (ihp.a.contains(Integer.valueOf(paramihk.c))))
    {
      int i2 = ihl.a;
      byte[] arrayOfByte = paramMtpDevice.getObject(paramihk.a, paramihk.d);
      if (arrayOfByte == null) {}
      for (;;)
      {
        return null;
        BitmapFactory.Options localOptions;
        if (i2 > 0)
        {
          localOptions = new BitmapFactory.Options();
          localOptions.inJustDecodeBounds = i1;
          BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length, localOptions);
          int i3 = localOptions.outWidth;
          int i4 = Math.max(localOptions.outHeight, i3);
          while (i4 >> 1 >= i2)
          {
            i4 >>= 1;
            i1++;
          }
          localOptions.inSampleSize = i1;
          localOptions.inJustDecodeBounds = false;
        }
        for (Bitmap localBitmap = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length, localOptions); localBitmap != null; localBitmap = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length)) {
          return new ihg(localBitmap, 0);
        }
      }
    }
    return new ihg(ihl.a(paramMtpDevice, paramihk), 0);
  }
  
  protected void a()
  {
    synchronized (this.b)
    {
      this.e = null;
      this.d = null;
      this.f = null;
      animate().cancel();
      setImageResource(17170445);
      return;
    }
  }
  
  public final void a(MtpDevice paramMtpDevice, ihk paramihk, int paramInt)
  {
    int i1 = paramihk.a;
    if ((i1 == this.h) && (paramInt == this.i)) {
      return;
    }
    a();
    setImageResource(17170445);
    this.i = paramInt;
    this.h = i1;
    synchronized (this.b)
    {
      this.d = paramihk;
      this.e = paramMtpDevice;
      if (this.c) {
        return;
      }
    }
    this.c = true;
    j.sendMessage(j.obtainMessage(0, this.a));
  }
  
  public void a(Object paramObject)
  {
    ihg localihg = (ihg)paramObject;
    if (getScaleType() == ImageView.ScaleType.MATRIX)
    {
      this.l = localihg.a.getHeight();
      this.k = localihg.a.getWidth();
      this.m = localihg.b;
      b();
    }
    for (;;)
    {
      setAlpha(0.0F);
      setImageBitmap(localihg.a);
      animate().alpha(1.0F);
      return;
      setRotation(localihg.b);
    }
  }
  
  public void onDetachedFromWindow()
  {
    a();
    super.onDetachedFromWindow();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramBoolean) && (getScaleType() == ImageView.ScaleType.MATRIX)) {
      b();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ingest.ui.MtpImageView
 * JD-Core Version:    0.7.0.1
 */