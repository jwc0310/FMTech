package com.google.android.libraries.social.collexions.impl.abuse;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import efj;
import gxn;
import hje;
import hmu;
import mbb;

public final class CollexionAbuseBannerView
  extends LinearLayout
  implements View.OnClickListener
{
  public final TextView a;
  public final Button b;
  public hmu c;
  
  public CollexionAbuseBannerView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CollexionAbuseBannerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CollexionAbuseBannerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    LayoutInflater.from(paramContext).inflate(efj.HD, this, true);
    this.a = ((TextView)findViewById(efj.Hw));
    this.b = ((Button)findViewById(efj.Hv));
    this.b.setOnClickListener(new gxn(this));
  }
  
  public final void onClick(View paramView)
  {
    if (this.c == null) {
      throw new IllegalArgumentException("Can't call CollexionAbuseActionHandler with abuseInfo == null.");
    }
    hje localhje = (hje)mbb.a(getContext(), hje.class);
    switch (this.c.b)
    {
    default: 
      return;
    case 0: 
    case 2: 
      localhje.a();
      return;
    }
    localhje.b();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.collexions.impl.abuse.CollexionAbuseBannerView
 * JD-Core Version:    0.7.0.1
 */