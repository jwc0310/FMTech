package com.google.android.libraries.social.squares.impl.edit;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import dl;
import efj;
import ev;
import gil;
import gim;
import gxn;
import gxq;
import la;
import lat;
import mbb;
import pjo;

public final class EditCategoryListItem
  extends LinearLayout
  implements View.OnClickListener, gim
{
  public lat a;
  public int b;
  public TextView c;
  public TextView d;
  public ImageView e;
  public ImageView f;
  private gil g = (gil)mbb.a(getContext(), gil.class);
  
  public EditCategoryListItem(Context paramContext)
  {
    super(paramContext);
  }
  
  public EditCategoryListItem(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public EditCategoryListItem(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final boolean a(int paramInt)
  {
    if (paramInt == dl.z)
    {
      this.a.a(this.b);
      return true;
    }
    if (paramInt == dl.w)
    {
      this.a.b(this.b);
      return true;
    }
    if (paramInt == dl.A)
    {
      this.a.c(this.b);
      return true;
    }
    return false;
  }
  
  public final la<Integer, String> g()
  {
    Context localContext = getContext();
    la localla = new la();
    localla.put(Integer.valueOf(dl.z), localContext.getString(ev.p));
    localla.put(Integer.valueOf(dl.w), localContext.getString(ev.h));
    localla.put(Integer.valueOf(dl.A), localContext.getString(ev.N));
    return localla;
  }
  
  public final void onClick(View paramView)
  {
    if ((efj.B(getContext())) && (!r().equals("emptyCategory")))
    {
      this.g.b(this);
      return;
    }
    if (paramView.getId() == dl.E)
    {
      this.a.b(this.b);
      return;
    }
    this.a.a(this.b);
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.c = ((TextView)findViewById(dl.D));
    this.d = ((TextView)findViewById(dl.C));
    this.f = ((ImageView)findViewById(dl.F));
    this.e = ((ImageButton)findViewById(dl.E));
    efj.a(this.e, new gxq(pjo.ae));
    this.e.setOnClickListener(new gxn(this));
  }
  
  public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    if (Build.VERSION.SDK_INT >= 21)
    {
      la localla = g();
      for (int i = 0; i < localla.size(); i++) {
        paramAccessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(((Integer)localla.b[(i << 1)]).intValue(), (CharSequence)localla.b[(1 + (i << 1))]));
      }
    }
  }
  
  @TargetApi(21)
  public final boolean performAccessibilityAction(int paramInt, Bundle paramBundle)
  {
    gim localgim = this.g.a(r());
    return ((localgim != null) && (localgim.a(paramInt))) || (super.performAccessibilityAction(paramInt, paramBundle));
  }
  
  public final String r()
  {
    CharSequence localCharSequence = this.c.getText();
    if (TextUtils.isEmpty(localCharSequence)) {
      return "emptyCategory";
    }
    return localCharSequence.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.squares.impl.edit.EditCategoryListItem
 * JD-Core Version:    0.7.0.1
 */