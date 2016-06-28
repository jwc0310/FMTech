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

public final class EditRelatedLinkListItem
  extends LinearLayout
  implements View.OnClickListener, gim
{
  public lat a;
  public int b;
  public TextView c;
  public TextView d;
  public TextView e;
  public ImageView f;
  public ImageView g;
  private gil h = (gil)mbb.a(getContext(), gil.class);
  
  public EditRelatedLinkListItem(Context paramContext)
  {
    super(paramContext);
  }
  
  public EditRelatedLinkListItem(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public EditRelatedLinkListItem(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final boolean a(int paramInt)
  {
    if (paramInt == dl.y)
    {
      this.a.a(this.b);
      return true;
    }
    if (paramInt == dl.x)
    {
      this.a.b(this.b);
      return true;
    }
    if (paramInt == dl.B)
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
    localla.put(Integer.valueOf(dl.y), localContext.getString(ev.s));
    localla.put(Integer.valueOf(dl.x), localContext.getString(ev.q));
    localla.put(Integer.valueOf(dl.B), localContext.getString(ev.O));
    return localla;
  }
  
  public final void onClick(View paramView)
  {
    if ((efj.B(getContext())) && (!r().equals("emptyLink")))
    {
      this.h.b(this);
      return;
    }
    if (paramView.getId() == dl.Y)
    {
      this.a.b(this.b);
      return;
    }
    this.a.a(this.b);
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.c = ((TextView)findViewById(dl.X));
    this.d = ((TextView)findViewById(dl.W));
    this.e = ((TextView)findViewById(dl.V));
    this.g = ((ImageView)findViewById(dl.Z));
    this.f = ((ImageButton)findViewById(dl.Y));
    efj.a(this.f, new gxq(pjo.ak));
    this.f.setOnClickListener(new gxn(this));
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
    gim localgim = this.h.a(r());
    return ((localgim != null) && (localgim.a(paramInt))) || (super.performAccessibilityAction(paramInt, paramBundle));
  }
  
  public final String r()
  {
    CharSequence localCharSequence = this.c.getText();
    if (TextUtils.isEmpty(localCharSequence)) {
      return "emptyLink";
    }
    return localCharSequence.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.squares.impl.edit.EditRelatedLinkListItem
 * JD-Core Version:    0.7.0.1
 */