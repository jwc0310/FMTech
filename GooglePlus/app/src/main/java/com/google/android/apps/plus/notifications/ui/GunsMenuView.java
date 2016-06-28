package com.google.android.apps.plus.notifications.ui;

import aau;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import cvh;
import cvl;
import cvm;
import cvn;
import cvo;
import cvp;
import efj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import x;

public final class GunsMenuView
  extends FrameLayout
  implements View.OnClickListener
{
  public boolean a;
  public ArrayList<x> b;
  private Context c;
  private final cvh d;
  private boolean e;
  private boolean f;
  private cvp g;
  private ArrayList<cvp> h;
  private HashMap<cvp, String> i;
  
  public GunsMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    new cvl(this);
    new cvm(this);
    this.c = paramContext;
    this.e = false;
    this.f = true;
    this.a = false;
    this.i = new HashMap();
    this.h = new ArrayList();
    this.b = new ArrayList();
    this.d = new cvh(paramContext);
    a(cvp.b, paramContext.getString(efj.Ay));
    a(cvp.a, paramContext.getString(efj.Ax));
  }
  
  private final void a(View paramView, cvp paramcvp, String paramString, Boolean paramBoolean)
  {
    TextView localTextView = (TextView)paramView.findViewById(aau.wB);
    localTextView.setText(paramString);
    Resources localResources = this.c.getResources();
    int j;
    View localView;
    int k;
    if ((!paramBoolean.booleanValue()) && (paramcvp == this.g))
    {
      j = aau.wt;
      localTextView.setTextColor(localResources.getColor(j));
      localView = paramView.findViewById(aau.ww);
      if ((paramBoolean.booleanValue()) || (this.g != paramcvp)) {
        break label125;
      }
      localView.setVisibility(0);
      k = efj.Av;
    }
    for (;;)
    {
      localTextView.setContentDescription(localResources.getString(k, new Object[] { paramString }));
      return;
      j = aau.ws;
      break;
      label125:
      if (!paramBoolean.booleanValue())
      {
        localView.setVisibility(8);
        k = efj.Au;
      }
      else
      {
        localView.setVisibility(8);
        k = efj.Aw;
      }
    }
  }
  
  private void a(cvp paramcvp, String paramString)
  {
    if (!this.i.containsKey(paramcvp)) {
      this.h.add(paramcvp);
    }
    this.i.put(paramcvp, paramString);
  }
  
  public final void a()
  {
    if (!this.f) {
      return;
    }
    boolean bool1;
    label17:
    float f1;
    label43:
    float f2;
    if (!this.e)
    {
      bool1 = true;
      this.e = bool1;
      null.setClickable(this.e);
      float[] arrayOfFloat1 = new float[1];
      if (!this.e) {
        break label186;
      }
      f1 = 1.0F;
      arrayOfFloat1[0] = f1;
      ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(null, "alpha", arrayOfFloat1).setDuration(250L);
      float[] arrayOfFloat2 = new float[1];
      boolean bool2 = this.e;
      f2 = 0.0F;
      if (!bool2) {
        break label191;
      }
      label81:
      arrayOfFloat2[0] = f2;
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(null, "translationY", arrayOfFloat2).setDuration(250L);
      localObjectAnimator2.addListener(new cvo(this));
      this.a = true;
      localObjectAnimator2.start();
      localObjectAnimator1.start();
      if (!this.e) {
        break label218;
      }
      if (Build.VERSION.SDK_INT < 19) {
        break label202;
      }
      null.setImportantForAccessibility(4);
    }
    for (;;)
    {
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext()) {
        localIterator.next();
      }
      break;
      bool1 = false;
      break label17;
      label186:
      f1 = 0.0F;
      break label43;
      label191:
      f2 = -null.getHeight();
      break label81;
      label202:
      if (Build.VERSION.SDK_INT >= 16)
      {
        null.setImportantForAccessibility(2);
        continue;
        label218:
        if (Build.VERSION.SDK_INT >= 16) {
          null.setImportantForAccessibility(1);
        }
      }
    }
  }
  
  public final void onClick(View paramView)
  {
    if (!this.a)
    {
      a();
      null.post(new cvn(this, null));
      if (!((Boolean)paramView.getTag(aau.wE)).booleanValue())
      {
        cvp localcvp1 = (cvp)paramView.getTag(aau.wD);
        if ((this.i.containsKey(localcvp1)) && (this.g != localcvp1))
        {
          this.g = localcvp1;
          a(null, this.g, (String)this.i.get(this.g), Boolean.valueOf(true));
          for (int j = 0; j < this.h.size(); j++)
          {
            cvp localcvp2 = (cvp)this.h.get(j);
            a(null.getChildAt(j), localcvp2, (String)this.i.get(localcvp2), Boolean.valueOf(false));
          }
          Iterator localIterator = this.b.iterator();
          while (localIterator.hasNext()) {
            localIterator.next();
          }
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.notifications.ui.GunsMenuView
 * JD-Core Version:    0.7.0.1
 */