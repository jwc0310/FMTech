package com.google.android.apps.plus.actionbar;

import aaw;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import efj;

public class NotificationButtonView
  extends FrameLayout
{
  public int a;
  public boolean b;
  private View c;
  private TextView d;
  private int e;
  private int f;
  
  public NotificationButtonView(Context paramContext)
  {
    super(paramContext);
  }
  
  public NotificationButtonView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public NotificationButtonView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void a()
  {
    String str;
    int i;
    label40:
    ViewGroup.LayoutParams localLayoutParams;
    if (this.a <= 99)
    {
      str = Integer.toString(this.a);
      this.d.setText(str);
      TextView localTextView = this.d;
      if (this.a != 0) {
        break label178;
      }
      i = 8;
      localTextView.setVisibility(i);
      localLayoutParams = this.d.getLayoutParams();
      if (this.a >= 10) {
        break label183;
      }
    }
    label178:
    label183:
    for (int j = this.e;; j = this.f)
    {
      localLayoutParams.width = j;
      this.d.setLayoutParams(localLayoutParams);
      StringBuilder localStringBuilder = new StringBuilder();
      CharSequence[] arrayOfCharSequence = new CharSequence[1];
      Resources localResources = getContext().getResources();
      int k = efj.wZ;
      int m = this.a;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(this.a);
      arrayOfCharSequence[0] = localResources.getQuantityString(k, m, arrayOfObject);
      efj.a(localStringBuilder, arrayOfCharSequence);
      this.c.setContentDescription(localStringBuilder.toString());
      return;
      str = "∞";
      break;
      i = 0;
      break label40;
    }
  }
  
  protected void onFinishInflate()
  {
    Resources localResources = getContext().getResources();
    this.e = localResources.getDimensionPixelSize(efj.mw);
    this.f = localResources.getDimensionPixelSize(efj.mv);
    this.c = findViewById(aaw.aD);
    this.d = ((TextView)findViewById(aaw.aE));
    this.d.setText("99");
    this.b = true;
    a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.actionbar.NotificationButtonView
 * JD-Core Version:    0.7.0.1
 */