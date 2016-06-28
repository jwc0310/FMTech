package com.google.android.libraries.social.media.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import iqv;
import kaz;
import lwe;

public final class RoundedMediaView
  extends MediaView
{
  public RoundedMediaView(Context paramContext)
  {
    super(paramContext);
    this.T = false;
    if (Build.VERSION.SDK_INT >= 21) {
      setOutlineProvider(new iqv());
    }
  }
  
  public RoundedMediaView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.T = false;
    if (Build.VERSION.SDK_INT >= 21) {
      setOutlineProvider(new iqv());
    }
  }
  
  public RoundedMediaView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.T = false;
    if (Build.VERSION.SDK_INT >= 21) {
      setOutlineProvider(new iqv());
    }
  }
  
  protected final void b(kaz paramkaz)
  {
    Object localObject = paramkaz.p;
    if ((localObject instanceof Bitmap))
    {
      Bitmap localBitmap = lwe.a((Bitmap)localObject);
      this.D = new BitmapDrawable(getResources(), localBitmap);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.media.ui.RoundedMediaView
 * JD-Core Version:    0.7.0.1
 */