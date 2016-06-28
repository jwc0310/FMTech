package com.google.android.apps.plus.profile.impl;

import android.content.Context;
import android.net.Uri;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import aw;
import dij;
import efj;
import ehr;
import gxn;
import lwi;
import lxw;
import lxy;
import mbb;

public final class ProfileEditorFlairsView
  extends LinearLayout
  implements View.OnClickListener
{
  public Switch a;
  public Switch b;
  public View c;
  public TextView d;
  public ContentLoadingProgressBar e;
  public View f;
  private dij g;
  
  public ProfileEditorFlairsView(Context paramContext)
  {
    super(paramContext);
  }
  
  public ProfileEditorFlairsView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public ProfileEditorFlairsView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void onClick(View paramView)
  {
    int i = paramView.getId();
    if (i == ehr.R) {
      this.g.a(this.a.isChecked());
    }
    while (i != ehr.T) {
      return;
    }
    this.g.b(this.b.isChecked());
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((Switch)findViewById(ehr.R));
    this.c = findViewById(ehr.S);
    this.b = ((Switch)findViewById(ehr.T));
    this.d = ((TextView)findViewById(ehr.U));
    this.e = ((ContentLoadingProgressBar)findViewById(ehr.M));
    String str1 = efj.a(getContext(), "plus_profile_tab", "https://support.google.com/plus/?hl=%locale%").toString();
    String str2 = getContext().getString(aw.A, new Object[] { str1 });
    if (efj.aaz == null) {
      efj.aaz = new lwi();
    }
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(str2, null, efj.aaz));
    lxw.a(localSpannableStringBuilder, null, false);
    this.d.setText(localSpannableStringBuilder);
    this.d.setMovementMethod(lxy.a());
    this.f = findViewById(ehr.Q);
    this.a.setOnClickListener(new gxn(this));
    this.b.setOnClickListener(new gxn(this));
    this.g = ((dij)mbb.a(getContext(), dij.class));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.profile.impl.ProfileEditorFlairsView
 * JD-Core Version:    0.7.0.1
 */