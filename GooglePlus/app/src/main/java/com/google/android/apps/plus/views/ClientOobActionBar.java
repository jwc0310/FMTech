package com.google.android.apps.plus.views;

import aaw;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import efj;

public class ClientOobActionBar
  extends LinearLayout
{
  public Button a;
  public Button b;
  private boolean c = false;
  
  public ClientOobActionBar(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public ClientOobActionBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public ClientOobActionBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private final void a(Context paramContext)
  {
    setOrientation(1);
    addView(((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(efj.te, this, false));
    findViewById(16908313);
    this.a = ((Button)findViewById(aaw.jh));
    this.b = ((Button)findViewById(aaw.ji));
    this.a.setId(16908314);
    this.b.setId(16908314);
  }
  
  public static void a(Button paramButton, int paramInt, boolean paramBoolean, View.OnClickListener paramOnClickListener)
  {
    if (paramButton != null) {
      if (!paramBoolean) {
        break label28;
      }
    }
    label28:
    for (int i = 0;; i = 8)
    {
      paramButton.setVisibility(i);
      paramButton.setText(paramInt);
      paramButton.setOnClickListener(paramOnClickListener);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.ClientOobActionBar
 * JD-Core Version:    0.7.0.1
 */