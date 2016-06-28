package com.google.android.libraries.social.collexions.impl.alert;

import aau;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import efj;
import gxt;
import hjk;

public final class CollexionAlertView
  extends LinearLayout
  implements hjk
{
  final TextView a;
  final TextView b;
  
  public CollexionAlertView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CollexionAlertView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CollexionAlertView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    LayoutInflater.from(paramContext).inflate(aau.zo, this, true);
    this.a = ((TextView)findViewById(efj.Ib));
    this.b = ((TextView)findViewById(efj.Ia));
  }
  
  public final gxt a()
  {
    return null;
  }
  
  public final void a(String paramString)
  {
    this.a.setText(paramString);
  }
  
  public final gxt b()
  {
    return null;
  }
  
  public final void b(String paramString)
  {
    this.b.setText(paramString);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.collexions.impl.alert.CollexionAlertView
 * JD-Core Version:    0.7.0.1
 */