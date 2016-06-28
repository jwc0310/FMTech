package com.google.android.libraries.social.notifications.ui;

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
import efj;
import eyg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import jdx;
import jdy;
import jdz;
import jea;
import jeb;
import jec;
import x;

public final class GunsMenuView
  extends FrameLayout
  implements View.OnClickListener
{
  public boolean a;
  public ArrayList<x> b;
  private Context c;
  private final jdx d;
  private boolean e;
  private boolean f;
  private jec g;
  private ArrayList<jec> h;
  private HashMap<jec, String> i;
  
  public GunsMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    new jdy(this);
    new jdz(this);
    this.c = paramContext;
    this.e = false;
    this.f = true;
    this.a = false;
    this.i = new HashMap();
    this.h = new ArrayList();
    this.b = new ArrayList();
    this.d = new jdx(paramContext);
    a(jec.b, paramContext.getString(aau.Az));
    a(jec.a, paramContext.getString(aau.Ay));
  }
  
  private final void a(View paramView, jec paramjec, String paramString, Boolean paramBoolean)
  {
    TextView localTextView = (TextView)paramView.findViewById(efj.QG);
    localTextView.setText(paramString);
    Resources localResources = this.c.getResources();
    int j;
    View localView;
    int k;
    if ((!paramBoolean.booleanValue()) && (paramjec == this.g))
    {
      j = eyg.ah;
      localTextView.setTextColor(localResources.getColor(j));
      localView = paramView.findViewById(efj.QF);
      if ((paramBoolean.booleanValue()) || (this.g != paramjec)) {
        break label125;
      }
      localView.setVisibility(0);
      k = aau.Aw;
    }
    for (;;)
    {
      localTextView.setContentDescription(localResources.getString(k, new Object[] { paramString }));
      return;
      j = eyg.ag;
      break;
      label125:
      if (!paramBoolean.booleanValue())
      {
        localView.setVisibility(8);
        k = aau.Av;
      }
      else
      {
        localView.setVisibility(8);
        k = aau.Ax;
      }
    }
  }
  
  private void a(jec paramjec, String paramString)
  {
    if (!this.i.containsKey(paramjec)) {
      this.h.add(paramjec);
    }
    this.i.put(paramjec, paramString);
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
        break label177;
      }
      f1 = 1.0F;
      arrayOfFloat1[0] = f1;
      ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(null, "alpha", arrayOfFloat1).setDuration(250L);
      float[] arrayOfFloat2 = new float[1];
      boolean bool2 = this.e;
      f2 = 0.0F;
      if (!bool2) {
        break label182;
      }
      label81:
      arrayOfFloat2[0] = f2;
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(null, "translationY", arrayOfFloat2).setDuration(250L);
      localObjectAnimator2.addListener(new jeb(this));
      this.a = true;
      localObjectAnimator2.start();
      localObjectAnimator1.start();
      if (!this.e) {
        break label193;
      }
      jdx.a(null);
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
      label177:
      f1 = 0.0F;
      break label43;
      label182:
      f2 = -null.getHeight();
      break label81;
      label193:
      if (Build.VERSION.SDK_INT >= 16) {
        null.setImportantForAccessibility(1);
      }
    }
  }
  
  public final void onClick(View paramView)
  {
    if (!this.a)
    {
      a();
      null.post(new jea(this, null));
      if (!((Boolean)paramView.getTag(efj.QI)).booleanValue())
      {
        jec localjec1 = (jec)paramView.getTag(efj.QH);
        if ((this.i.containsKey(localjec1)) && (this.g != localjec1))
        {
          this.g = localjec1;
          a(null, this.g, (String)this.i.get(this.g), Boolean.valueOf(true));
          for (int j = 0; j < this.h.size(); j++)
          {
            jec localjec2 = (jec)this.h.get(j);
            a(null.getChildAt(j), localjec2, (String)this.i.get(localjec2), Boolean.valueOf(false));
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
 * Qualified Name:     com.google.android.libraries.social.notifications.ui.GunsMenuView
 * JD-Core Version:    0.7.0.1
 */