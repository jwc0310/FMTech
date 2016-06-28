package com.google.android.libraries.social.ingest.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.mtp.MtpDevice;
import android.util.AttributeSet;
import android.widget.Checkable;
import efj;
import ihk;
import ihl;

public final class MtpThumbnailTileView
  extends MtpImageView
  implements Checkable
{
  private Paint h;
  private boolean i;
  private Bitmap j;
  
  public MtpThumbnailTileView(Context paramContext)
  {
    super(paramContext);
    b();
  }
  
  public MtpThumbnailTileView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    b();
  }
  
  public MtpThumbnailTileView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    b();
  }
  
  private final void b()
  {
    this.h = new Paint();
    this.h.setColor(getResources().getColor(efj.Nb));
  }
  
  protected final Object a(MtpDevice paramMtpDevice, ihk paramihk)
  {
    return ihl.a(paramMtpDevice, paramihk);
  }
  
  protected final void a()
  {
    super.a();
    if (this.j != null)
    {
      Bitmap localBitmap = this.j;
      if (localBitmap != null) {
        localBitmap.recycle();
      }
      this.j = null;
    }
  }
  
  protected final void a(Object paramObject)
  {
    this.j = ((Bitmap)paramObject);
    setImageBitmap(this.j);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if (isChecked()) {
      paramCanvas.drawRect(paramCanvas.getClipBounds(), this.h);
    }
  }
  
  public final boolean isChecked()
  {
    return this.i;
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt1);
  }
  
  public final void setChecked(boolean paramBoolean)
  {
    if (this.i != paramBoolean)
    {
      this.i = paramBoolean;
      invalidate();
    }
  }
  
  public final void toggle()
  {
    if (!this.i) {}
    for (boolean bool = true;; bool = false)
    {
      setChecked(bool);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ingest.ui.MtpThumbnailTileView
 * JD-Core Version:    0.7.0.1
 */