package com.google.android.apps.plus.views;

import aaw;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import dwu;

public class EventRsvpButtonLayout
  extends LinearLayout
  implements View.OnClickListener
{
  public View a;
  public View b;
  public dwu c;
  private View d;
  private View e;
  
  public EventRsvpButtonLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public EventRsvpButtonLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public EventRsvpButtonLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void onClick(View paramView)
  {
    if (this.c != null)
    {
      if (paramView != this.d) {
        break label26;
      }
      this.c.b(1);
    }
    label26:
    do
    {
      return;
      if (paramView == this.a)
      {
        this.c.b(6);
        return;
      }
    } while (paramView != this.e);
    this.c.b(2);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = findViewById(aaw.eX);
    this.a.setOnClickListener(this);
    this.d = findViewById(aaw.mH);
    this.d.setOnClickListener(this);
    this.e = findViewById(aaw.fS);
    this.e.setOnClickListener(this);
    this.b = findViewById(aaw.eY);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.EventRsvpButtonLayout
 * JD-Core Version:    0.7.0.1
 */