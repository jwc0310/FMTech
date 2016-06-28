package com.google.android.libraries.social.ui.views.imagetextbutton;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import efj;
import lzf;

public final class ImageTextButton
  extends RelativeLayout
{
  public TextView a;
  
  public ImageTextButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ImageTextButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  public ImageTextButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }
  
  @TargetApi(17)
  private final void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    LayoutInflater.from(paramContext).inflate(efj.aaI, this);
    this.a = ((TextView)findViewById(efj.aaH));
    TypedArray localTypedArray;
    Drawable localDrawable;
    if (paramAttributeSet != null)
    {
      localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, lzf.a);
      localDrawable = localTypedArray.getDrawable(lzf.b);
      if (Build.VERSION.SDK_INT < 17) {
        break label95;
      }
      this.a.setCompoundDrawablesRelativeWithIntrinsicBounds(localDrawable, null, null, null);
    }
    for (;;)
    {
      String str = localTypedArray.getString(lzf.c);
      this.a.setText(str);
      localTypedArray.recycle();
      return;
      label95:
      this.a.setCompoundDrawablesWithIntrinsicBounds(localDrawable, null, null, null);
    }
  }
  
  public final void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    if (paramBoolean) {}
    for (float f = 1.0F;; f = 0.5F)
    {
      setAlpha(f);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ui.views.imagetextbutton.ImageTextButton
 * JD-Core Version:    0.7.0.1
 */