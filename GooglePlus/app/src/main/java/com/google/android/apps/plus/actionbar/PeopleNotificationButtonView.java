package com.google.android.apps.plus.actionbar;

import aau;
import aaw;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import efj;

public class PeopleNotificationButtonView
  extends FrameLayout
{
  private View a;
  private View b;
  private TextView c;
  private int d;
  private int e;
  
  public PeopleNotificationButtonView(Context paramContext)
  {
    super(paramContext);
  }
  
  public PeopleNotificationButtonView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public PeopleNotificationButtonView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void onFinishInflate()
  {
    Resources localResources1 = getContext().getResources();
    this.d = localResources1.getDimensionPixelSize(efj.mw);
    this.e = localResources1.getDimensionPixelSize(efj.mv);
    this.a = findViewById(aaw.gY);
    this.b = findViewById(aaw.hb);
    this.c = ((TextView)findViewById(aaw.ha));
    String str = Integer.toString(0);
    this.c.setText(str);
    this.c.setVisibility(8);
    this.a.setVisibility(8);
    this.b.setVisibility(0);
    ViewGroup.LayoutParams localLayoutParams = this.c.getLayoutParams();
    localLayoutParams.width = this.d;
    this.c.setLayoutParams(localLayoutParams);
    StringBuilder localStringBuilder1 = new StringBuilder();
    CharSequence[] arrayOfCharSequence1 = new CharSequence[1];
    Resources localResources2 = getContext().getResources();
    int i = efj.xa;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(0);
    arrayOfCharSequence1[0] = localResources2.getQuantityString(i, 0, arrayOfObject);
    efj.a(localStringBuilder1, arrayOfCharSequence1);
    this.a.setContentDescription(localStringBuilder1.toString());
    StringBuilder localStringBuilder2 = new StringBuilder();
    CharSequence[] arrayOfCharSequence2 = new CharSequence[1];
    arrayOfCharSequence2[0] = getContext().getResources().getString(aau.bg);
    efj.a(localStringBuilder2, arrayOfCharSequence2);
    this.b.setContentDescription(localStringBuilder2.toString());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.actionbar.PeopleNotificationButtonView
 * JD-Core Version:    0.7.0.1
 */