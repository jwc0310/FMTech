package com.google.android.apps.plus.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import efj;

public class PhotosProgressBar
  extends ProgressBar
{
  private Paint a;
  private long b;
  private boolean c;
  private int d;
  
  public PhotosProgressBar(Context paramContext)
  {
    super(paramContext);
  }
  
  public PhotosProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public PhotosProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public boolean isIndeterminate()
  {
    try
    {
      boolean bool = this.c;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  protected void onDraw(android.graphics.Canvas paramCanvas)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial 30	android/widget/ProgressBar:onDraw	(Landroid/graphics/Canvas;)V
    //   7: aload_0
    //   8: getfield 26	com/google/android/apps/plus/views/PhotosProgressBar:c	Z
    //   11: istore_3
    //   12: iload_3
    //   13: ifne +6 -> 19
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: aload_0
    //   20: invokevirtual 34	com/google/android/apps/plus/views/PhotosProgressBar:getHeight	()I
    //   23: istore 4
    //   25: aload_0
    //   26: invokevirtual 37	com/google/android/apps/plus/views/PhotosProgressBar:getWidth	()I
    //   29: bipush 7
    //   31: idiv
    //   32: istore 5
    //   34: invokestatic 43	java/lang/System:nanoTime	()J
    //   37: aload_0
    //   38: getfield 45	com/google/android/apps/plus/views/PhotosProgressBar:b	J
    //   41: lsub
    //   42: ldc2_w 46
    //   45: lrem
    //   46: l2d
    //   47: ldc2_w 48
    //   50: ddiv
    //   51: dstore 6
    //   53: iconst_m1
    //   54: istore 8
    //   56: iload 8
    //   58: bipush 7
    //   60: if_icmpge +47 -> 107
    //   63: iload 8
    //   65: iload 5
    //   67: imul
    //   68: dload 6
    //   70: iload 5
    //   72: i2d
    //   73: dmul
    //   74: d2i
    //   75: iadd
    //   76: istore 9
    //   78: aload_1
    //   79: iload 9
    //   81: i2f
    //   82: fconst_0
    //   83: iload 9
    //   85: aload_0
    //   86: getfield 51	com/google/android/apps/plus/views/PhotosProgressBar:d	I
    //   89: iadd
    //   90: i2f
    //   91: iload 4
    //   93: i2f
    //   94: aload_0
    //   95: getfield 53	com/google/android/apps/plus/views/PhotosProgressBar:a	Landroid/graphics/Paint;
    //   98: invokevirtual 59	android/graphics/Canvas:drawRect	(FFFFLandroid/graphics/Paint;)V
    //   101: iinc 8 1
    //   104: goto -48 -> 56
    //   107: aload_0
    //   108: invokevirtual 63	com/google/android/apps/plus/views/PhotosProgressBar:postInvalidate	()V
    //   111: goto -95 -> 16
    //   114: astore_2
    //   115: aload_0
    //   116: monitorexit
    //   117: aload_2
    //   118: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	119	0	this	PhotosProgressBar
    //   0	119	1	paramCanvas	android.graphics.Canvas
    //   114	4	2	localObject	Object
    //   11	2	3	bool	boolean
    //   23	69	4	i	int
    //   32	39	5	j	int
    //   51	18	6	d1	double
    //   54	48	8	k	int
    //   76	14	9	m	int
    // Exception table:
    //   from	to	target	type
    //   2	12	114	finally
    //   19	53	114	finally
    //   78	101	114	finally
    //   107	111	114	finally
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = new Paint();
    this.a.setColor(getResources().getColor(efj.jD));
    this.d = getResources().getDimensionPixelSize(efj.kN);
  }
  
  public void setIndeterminate(boolean paramBoolean)
  {
    try
    {
      this.c = paramBoolean;
      if (this.c)
      {
        setProgress(getMax());
        this.b = System.nanoTime();
      }
      postInvalidate();
      return;
    }
    finally {}
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.PhotosProgressBar
 * JD-Core Version:    0.7.0.1
 */