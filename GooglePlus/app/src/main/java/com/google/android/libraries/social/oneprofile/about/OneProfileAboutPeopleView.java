package com.google.android.libraries.social.oneprofile.about;

import aaw;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import aw;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import efj;
import ehr;
import eyg;
import hdo;
import java.text.NumberFormat;
import jfw;
import jfx;
import jfy;
import jfz;
import jga;
import jgb;
import jgd;
import nwn;
import nxl;
import nxv;
import omy;
import omz;

public final class OneProfileAboutPeopleView
  extends jgd
{
  private static int v;
  private static int w;
  public String a;
  public ViewGroup b;
  public jgb c;
  private NumberFormat x = NumberFormat.getIntegerInstance();
  
  public OneProfileAboutPeopleView(Context paramContext)
  {
    super(paramContext);
    if (v == 0)
    {
      Resources localResources = getContext().getResources();
      v = localResources.getDimensionPixelSize(aaw.pa);
      w = localResources.getDimensionPixelSize(aaw.pd);
    }
  }
  
  public OneProfileAboutPeopleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (v == 0)
    {
      Resources localResources = getContext().getResources();
      v = localResources.getDimensionPixelSize(aaw.pa);
      w = localResources.getDimensionPixelSize(aaw.pd);
    }
  }
  
  public OneProfileAboutPeopleView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (v == 0)
    {
      Resources localResources = getContext().getResources();
      v = localResources.getDimensionPixelSize(aaw.pa);
      w = localResources.getDimensionPixelSize(aaw.pd);
    }
  }
  
  private final TextView a(int paramInt1, int paramInt2, String paramString)
  {
    Resources localResources1 = getResources();
    TextView localTextView = new TextView(getContext());
    int i = jgd.f;
    int j = jgd.i;
    localTextView.setTextSize(0, i);
    localTextView.setTextColor(j);
    localTextView.setId(paramInt2);
    localTextView.setTag(paramString);
    Resources localResources2 = getResources();
    int k = efj.RA;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    localTextView.setContentDescription(localResources2.getString(k, arrayOfObject));
    localTextView.setText(this.x.format(paramInt1));
    localTextView.setTextColor(localResources1.getColorStateList(ehr.cW));
    localTextView.setSingleLine();
    localTextView.setBackgroundDrawable(localResources1.getDrawable(eyg.as));
    localTextView.setPadding(v, 0, v, 0);
    localTextView.setGravity(17);
    localTextView.setMinimumHeight(w);
    localTextView.setMinimumWidth(w);
    localTextView.setOnClickListener(new jfz(this));
    return localTextView;
  }
  
  private final TextView a(TextView paramTextView1, TextView paramTextView2, boolean paramBoolean)
  {
    jga localjga = new jga(getContext());
    localjga.a = paramTextView1;
    localjga.addView(paramTextView1);
    localjga.b = paramTextView2;
    if (paramTextView2 != null) {
      localjga.addView(paramTextView2);
    }
    localjga.c = v;
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    if (paramBoolean) {}
    for (int i = 0;; i = l)
    {
      localLayoutParams.topMargin = i;
      localLayoutParams.bottomMargin = 0;
      this.b.addView(localjga, localLayoutParams);
      return paramTextView1;
    }
  }
  
  private final TextView a(String paramString, boolean paramBoolean)
  {
    TextView localTextView = new TextView(getContext());
    localTextView.setText(paramString);
    localTextView.setFocusable(true);
    localTextView.setMaxLines(2);
    localTextView.setGravity(8388627);
    if (paramBoolean) {
      localTextView.setMinimumHeight(w);
    }
    return localTextView;
  }
  
  public final jfw a(omz paramomz)
  {
    int i = 0;
    jfw localjfw = new jfw(getContext());
    omy[] arrayOfomy = paramomz.b;
    jfy localjfy = new jfy(this);
    localjfw.removeAllViews();
    localjfw.d = localjfy;
    if (arrayOfomy == null) {}
    for (int j = 0;; j = arrayOfomy.length)
    {
      localjfw.c = Math.min(j, 10);
      Context localContext = localjfw.getContext();
      for (int k = 0; k < localjfw.c; k++) {
        if (localjfw.b[k] == null)
        {
          localjfw.b[k] = new AvatarView(localContext);
          localjfw.b[k].a(1);
          localjfw.b[k].e = 1;
          localjfw.b[k].setOnClickListener(new jfx(localjfw));
        }
      }
    }
    localjfw.setBackgroundColor(jfw.a);
    while (i < localjfw.c)
    {
      omy localomy = arrayOfomy[i];
      localjfw.b[i].a(localomy.a, hdo.b(localomy.c));
      localjfw.b[i].h = localomy.d;
      localjfw.addView(localjfw.b[i]);
      i++;
    }
    return localjfw;
  }
  
  public final void a(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    boolean bool;
    TextView localTextView1;
    if (paramInt1 > 0)
    {
      bool = true;
      localTextView1 = a(paramString, bool);
      if (paramInt1 == 0) {
        break label74;
      }
      a(localTextView1, jgd.g, true);
    }
    for (;;)
    {
      TextView localTextView2 = null;
      if (paramInt1 > 0)
      {
        localTextView2 = a(paramInt1, paramInt2, paramString);
        localTextView2.setTextSize(0, d);
      }
      a(localTextView1, localTextView2, paramBoolean);
      return;
      bool = false;
      break;
      label74:
      a(localTextView1, jgd.j, true);
    }
  }
  
  public final void a(String paramString, jfw paramjfw)
  {
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
    if (paramjfw != null)
    {
      this.b.addView(paramjfw, localLayoutParams);
      return;
    }
    TextView localTextView = new TextView(getContext());
    localTextView.setText(paramString);
    int i = jgd.f;
    int j = jgd.j;
    localTextView.setTextSize(0, i);
    localTextView.setTextColor(j);
    localTextView.setFocusable(true);
    this.b.addView(localTextView, localLayoutParams);
  }
  
  public final void a(nxl paramnxl)
  {
    this.a = null;
    nwn localnwn;
    if (paramnxl != null) {
      if (paramnxl.e != null)
      {
        nxv localnxv = paramnxl.e;
        if (localnxv.a != null)
        {
          localnwn = localnxv.a;
          if (!TextUtils.isEmpty(localnwn.a)) {
            break label77;
          }
        }
      }
    }
    label77:
    for (this.a = localnwn.a;; this.a = localnwn.c)
    {
      if (TextUtils.isEmpty(this.a)) {
        this.a = paramnxl.g;
      }
      this.b.removeAllViews();
      return;
    }
  }
  
  protected final int b()
  {
    return 1;
  }
  
  public final void b(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramInt1 > 0) {}
    for (boolean bool = true;; bool = false)
    {
      TextView localTextView1 = a(paramString, bool);
      int i = jgd.e;
      int j = jgd.h;
      localTextView1.setTextSize(0, i);
      localTextView1.setTextColor(j);
      TextView localTextView2 = null;
      if (paramInt1 > 0) {
        localTextView2 = a(paramInt1, paramInt2, paramString);
      }
      a(localTextView1, localTextView2, paramBoolean);
      return;
    }
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.b = ((ViewGroup)findViewById(aw.br));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.oneprofile.about.OneProfileAboutPeopleView
 * JD-Core Version:    0.7.0.1
 */