package com.google.android.libraries.social.collexions.impl.alert;

import aau;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import efj;
import gxt;
import hjk;

public final class CollexionDeleteConfirmationView
  extends RelativeLayout
  implements hjk
{
  private final CollexionAlertView a;
  
  public CollexionDeleteConfirmationView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CollexionDeleteConfirmationView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CollexionDeleteConfirmationView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    LayoutInflater.from(paramContext).inflate(aau.zq, this, true);
    this.a = ((CollexionAlertView)findViewById(efj.Ic));
  }
  
  public final gxt a()
  {
    return null;
  }
  
  public final void a(String paramString)
  {
    this.a.a.setText(paramString);
  }
  
  public final gxt b()
  {
    return null;
  }
  
  public final void b(String paramString)
  {
    this.a.b.setText(paramString);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.collexions.impl.alert.CollexionDeleteConfirmationView
 * JD-Core Version:    0.7.0.1
 */