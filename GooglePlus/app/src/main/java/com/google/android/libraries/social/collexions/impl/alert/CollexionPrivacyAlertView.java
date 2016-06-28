package com.google.android.libraries.social.collexions.impl.alert;

import aau;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import efj;
import gxn;
import gxq;
import gxs;
import gxt;
import hjk;
import hjt;
import pjn;

public final class CollexionPrivacyAlertView
  extends LinearLayout
  implements View.OnClickListener, gxs, hjk
{
  public CheckBox a;
  private CollexionAlertView b;
  private TextView c;
  private final gxq d = new gxq(pjn.e);
  
  public CollexionPrivacyAlertView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public CollexionPrivacyAlertView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public CollexionPrivacyAlertView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private final void a(Context paramContext)
  {
    LayoutInflater.from(paramContext).inflate(aau.zs, this, true);
    this.b = ((CollexionAlertView)findViewById(efj.Ic));
    this.c = ((TextView)findViewById(efj.Id));
    this.c.setOnClickListener(new gxn(this));
    efj.a(this.c, new gxq(pjn.J));
    this.a = ((CheckBox)findViewById(efj.Ig));
    this.a.setOnClickListener(new gxn(this));
    efj.a(this.a, new gxq(pjn.K));
  }
  
  public final gxt a()
  {
    return pjn.d;
  }
  
  public final void a(String paramString)
  {
    this.b.a.setText(paramString);
  }
  
  public final gxt b()
  {
    return pjn.f;
  }
  
  public final void b(String paramString)
  {
    this.b.b.setText(paramString);
  }
  
  public final void onClick(View paramView)
  {
    int i = 8;
    if (paramView == this.c)
    {
      CheckBox localCheckBox = this.a;
      if (this.a.getVisibility() == i) {
        i = 0;
      }
      localCheckBox.setVisibility(i);
    }
  }
  
  protected final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof hjt))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    hjt localhjt = (hjt)paramParcelable;
    super.onRestoreInstanceState(localhjt.getSuperState());
    CheckBox localCheckBox = this.a;
    if (localhjt.a) {}
    for (int i = 0;; i = 8)
    {
      localCheckBox.setVisibility(i);
      this.a.setChecked(localhjt.b);
      return;
    }
  }
  
  protected final Parcelable onSaveInstanceState()
  {
    Parcelable localParcelable = super.onSaveInstanceState();
    if (this.a.getVisibility() == 0) {}
    for (boolean bool = true;; bool = false) {
      return new hjt(localParcelable, bool, this.a.isChecked());
    }
  }
  
  public final gxq v()
  {
    return this.d;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.collexions.impl.alert.CollexionPrivacyAlertView
 * JD-Core Version:    0.7.0.1
 */