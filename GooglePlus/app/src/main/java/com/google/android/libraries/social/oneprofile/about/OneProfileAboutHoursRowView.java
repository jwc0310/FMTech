package com.google.android.libraries.social.oneprofile.about;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import aw;
import lxj;

public final class OneProfileAboutHoursRowView
  extends RelativeLayout
  implements lxj
{
  TextView a;
  TextView b;
  
  public OneProfileAboutHoursRowView(Context paramContext)
  {
    super(paramContext);
  }
  
  public OneProfileAboutHoursRowView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public OneProfileAboutHoursRowView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void D_()
  {
    this.a.setText(null);
    this.b.setText(null);
  }
  
  public final void a(int paramInt)
  {
    this.a.setTextColor(paramInt);
    this.b.setTextColor(paramInt);
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(aw.cg));
    this.b = ((TextView)findViewById(aw.br));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.oneprofile.about.OneProfileAboutHoursRowView
 * JD-Core Version:    0.7.0.1
 */