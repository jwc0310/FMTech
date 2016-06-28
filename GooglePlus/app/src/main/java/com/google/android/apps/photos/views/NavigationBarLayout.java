package com.google.android.apps.photos.views;

import aaw;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.ListView;
import bfz;

public class NavigationBarLayout
  extends LinearLayout
  implements bfz
{
  public SelectedAccountNavigationView a;
  public ListView b;
  public ListView c;
  
  public NavigationBarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOrientation(1);
  }
  
  public final void a()
  {
    a(true);
  }
  
  public final void a(boolean paramBoolean)
  {
    switch (this.a.d)
    {
    default: 
      return;
    case 0: 
      if (paramBoolean)
      {
        AlphaAnimation localAlphaAnimation2 = new AlphaAnimation(0.0F, 1.0F);
        localAlphaAnimation2.setDuration(200L);
        this.b.setAnimation(localAlphaAnimation2);
        TranslateAnimation localTranslateAnimation2 = new TranslateAnimation(0, 0.0F, 0, 0.0F, 1, 0.0F, 1, -1.0F);
        localTranslateAnimation2.setInterpolator(new AccelerateInterpolator(0.8F));
        localTranslateAnimation2.setDuration(200L);
        this.c.setAnimation(localTranslateAnimation2);
      }
      for (;;)
      {
        this.b.setVisibility(0);
        this.c.setVisibility(8);
        return;
        this.b.setAnimation(null);
        this.c.setAnimation(null);
      }
    }
    if (paramBoolean)
    {
      AlphaAnimation localAlphaAnimation1 = new AlphaAnimation(1.0F, 0.0F);
      localAlphaAnimation1.setDuration(200L);
      localAlphaAnimation1.setStartOffset(133L);
      this.b.setAnimation(localAlphaAnimation1);
      TranslateAnimation localTranslateAnimation1 = new TranslateAnimation(0, 0.0F, 0, 0.0F, 1, -1.0F, 1, 0.0F);
      localTranslateAnimation1.setInterpolator(new DecelerateInterpolator(0.8F));
      localTranslateAnimation1.setDuration(200L);
      this.c.setAnimation(localTranslateAnimation1);
    }
    for (;;)
    {
      this.b.setVisibility(8);
      this.c.setVisibility(0);
      return;
      this.b.setAnimation(null);
      this.c.setAnimation(null);
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((SelectedAccountNavigationView)findViewById(aaw.jA));
    this.a.a = this;
    this.b = ((ListView)findViewById(aaw.fE));
    this.c = ((ListView)findViewById(aaw.r));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photos.views.NavigationBarLayout
 * JD-Core Version:    0.7.0.1
 */