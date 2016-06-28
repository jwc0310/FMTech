package com.google.android.libraries.social.ingest.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RelativeLayout;
import efj;
import ihc;
import ihd;
import java.util.Collection;

public final class MtpFullscreenView
  extends RelativeLayout
  implements Checkable, CompoundButton.OnCheckedChangeListener, ihd
{
  public MtpImageView a;
  private CheckBox b;
  private int c = -1;
  private ihc d;
  
  public MtpFullscreenView(Context paramContext)
  {
    super(paramContext);
  }
  
  public MtpFullscreenView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MtpFullscreenView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void a()
  {
    if (this.d != null) {
      setChecked(this.d.a(this.c));
    }
  }
  
  public final void a(int paramInt, ihc paramihc)
  {
    if (this.d != null) {
      this.d.a.remove(this);
    }
    this.c = paramInt;
    this.d = paramihc;
    if (this.d != null)
    {
      setChecked(this.d.a(paramInt));
      this.d.a.add(this);
    }
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    if (paramInt == this.c) {
      setChecked(paramBoolean);
    }
  }
  
  public final boolean isChecked()
  {
    return this.b.isChecked();
  }
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (this.d != null) {
      this.d.a(this.c, paramBoolean);
    }
  }
  
  public final void onDetachedFromWindow()
  {
    a(-1, null);
    super.onDetachedFromWindow();
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((MtpImageView)findViewById(efj.Nj));
    this.b = ((CheckBox)findViewById(efj.Nk));
    this.b.setOnCheckedChangeListener(this);
  }
  
  public final void setChecked(boolean paramBoolean)
  {
    this.b.setChecked(paramBoolean);
  }
  
  public final void toggle()
  {
    this.b.toggle();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ingest.ui.MtpFullscreenView
 * JD-Core Version:    0.7.0.1
 */