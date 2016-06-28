package com.google.android.apps.plus.views;

import aaw;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.LinearLayout;
import dxv;
import dxw;
import dxx;
import efj;

public class PhotoActionBar
  extends LinearLayout
  implements View.OnClickListener
{
  private static int b;
  public dxx a;
  
  public PhotoActionBar(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public PhotoActionBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public PhotoActionBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  private final void a()
  {
    if (b == 0) {
      b = (int)getResources().getDimension(efj.mG);
    }
  }
  
  private final View c(dxv paramdxv)
  {
    View localView = ((ViewStub)findViewById(paramdxv.g)).inflate().findViewById(paramdxv.h);
    localView.setOnClickListener(this);
    return localView;
  }
  
  public final View a(dxw paramdxw)
  {
    View localView = findViewById(paramdxw.e);
    if (localView == null) {
      localView = b(paramdxw.d).findViewById(paramdxw.e);
    }
    return localView;
  }
  
  public final void a(boolean paramBoolean, dxv paramdxv)
  {
    View localView1 = findViewById(paramdxv.h);
    if ((paramBoolean) && (localView1 == null)) {}
    for (View localView2 = c(paramdxv);; localView2 = localView1)
    {
      if (paramBoolean) {}
      for (int i = 0;; i = 8)
      {
        if (localView2 != null) {
          ((View)localView2.getParent()).setVisibility(i);
        }
        return;
      }
    }
  }
  
  public final boolean a(dxv paramdxv)
  {
    View localView = findViewById(paramdxv.h);
    return (localView != null) && (localView.getVisibility() == 0);
  }
  
  public final View b(dxv paramdxv)
  {
    View localView = findViewById(paramdxv.h);
    if (localView == null) {
      localView = c(paramdxv);
    }
    return localView;
  }
  
  public void onClick(View paramView)
  {
    if (this.a == null) {}
    int i;
    do
    {
      return;
      i = paramView.getId();
      if (i == aaw.cP)
      {
        this.a.a();
        return;
      }
      if (i == aaw.hI)
      {
        this.a.b();
        return;
      }
      if (i == aaw.jL)
      {
        this.a.c();
        return;
      }
      if (i == aaw.kP)
      {
        this.a.d();
        return;
      }
      if (i == aaw.ck)
      {
        this.a.e();
        return;
      }
    } while (i != aaw.bB);
    this.a.f();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.PhotoActionBar
 * JD-Core Version:    0.7.0.1
 */