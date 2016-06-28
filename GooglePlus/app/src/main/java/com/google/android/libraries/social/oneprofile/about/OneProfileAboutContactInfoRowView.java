package com.google.android.libraries.social.oneprofile.about;

import aaw;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import aw;
import ehr;
import eyg;
import jfh;
import jfm;
import lxj;

public final class OneProfileAboutContactInfoRowView
  extends RelativeLayout
  implements lxj
{
  private static int d;
  private static ColorStateList e;
  public int a;
  public jfm b;
  TextView c;
  private TextView f;
  
  public OneProfileAboutContactInfoRowView(Context paramContext)
  {
    super(paramContext);
    if (d == 0)
    {
      d = getContext().getResources().getDimensionPixelSize(aaw.oX);
      e = getContext().getResources().getColorStateList(ehr.cW);
    }
  }
  
  public OneProfileAboutContactInfoRowView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (d == 0)
    {
      d = getContext().getResources().getDimensionPixelSize(aaw.oX);
      e = getContext().getResources().getColorStateList(ehr.cW);
    }
  }
  
  public OneProfileAboutContactInfoRowView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (d == 0)
    {
      d = getContext().getResources().getDimensionPixelSize(aaw.oX);
      e = getContext().getResources().getColorStateList(ehr.cW);
    }
  }
  
  public final void D_()
  {
    this.f.setText(null);
    this.f.setBackgroundDrawable(null);
  }
  
  public final void a(String paramString)
  {
    this.f.setText(paramString);
    if (this.a != 0)
    {
      this.f.setTextColor(e);
      this.f.setBackgroundDrawable(getResources().getDrawable(eyg.as));
      this.f.setOnClickListener(new jfh(this));
      return;
    }
    this.f.setTextColor(-16777216);
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.c = ((TextView)findViewById(aw.cg));
    this.f = ((TextView)findViewById(aw.br));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.oneprofile.about.OneProfileAboutContactInfoRowView
 * JD-Core Version:    0.7.0.1
 */