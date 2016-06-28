package com.google.android.libraries.social.oneprofile.about;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import aw;
import jgd;
import nvl;
import nvt;
import nvx;
import nvy;
import nxl;
import nxv;

public final class OneProfileAboutEducationView
  extends jgd
{
  private ViewGroup a;
  private TextView b;
  
  public OneProfileAboutEducationView(Context paramContext)
  {
    super(paramContext);
  }
  
  public OneProfileAboutEducationView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public OneProfileAboutEducationView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void a(nxl paramnxl)
  {
    nvx[] arrayOfnvx = null;
    if (paramnxl != null)
    {
      nxv localnxv = paramnxl.e;
      arrayOfnvx = null;
      if (localnxv != null)
      {
        nvy localnvy = localnxv.h;
        arrayOfnvx = null;
        if (localnvy != null) {
          arrayOfnvx = localnxv.h.b;
        }
      }
    }
    this.a.removeAllViews();
    int j;
    boolean bool1;
    nvx localnvx;
    Context localContext;
    LinearLayout localLinearLayout;
    Integer localInteger3;
    Integer localInteger1;
    Integer localInteger2;
    boolean bool2;
    if ((arrayOfnvx != null) && (arrayOfnvx.length > 0))
    {
      this.a.setVisibility(0);
      int i = arrayOfnvx.length;
      j = 0;
      bool1 = true;
      if (j < i)
      {
        localnvx = arrayOfnvx[j];
        localContext = getContext();
        localLinearLayout = new LinearLayout(localContext);
        localLinearLayout.setFocusable(true);
        localLinearLayout.setOrientation(1);
        this.a.addView(localLinearLayout);
        if (!TextUtils.isEmpty(localnvx.a))
        {
          TextView localTextView1 = new TextView(localContext);
          localTextView1.setText(localnvx.a);
          a(localTextView1, jgd.g, bool1);
          localLinearLayout.addView(localTextView1);
        }
        nvt localnvt = localnvx.c;
        if (localnvt == null) {
          break label617;
        }
        nvl localnvl1 = localnvt.a;
        localInteger3 = null;
        if (localnvl1 != null)
        {
          Integer localInteger5 = localnvt.a.a;
          localInteger3 = null;
          if (localInteger5 != null) {
            localInteger3 = localnvt.a.a;
          }
        }
        nvl localnvl2 = localnvt.b;
        localInteger1 = null;
        if (localnvl2 != null)
        {
          Integer localInteger4 = localnvt.b.a;
          localInteger1 = null;
          if (localInteger4 != null) {
            localInteger1 = localnvt.b.a;
          }
        }
        if (localnvt.c == null) {
          break label607;
        }
        boolean bool3 = localnvt.c.booleanValue();
        localInteger2 = localInteger3;
        bool2 = bool3;
      }
    }
    for (;;)
    {
      StringBuilder localStringBuilder1 = new StringBuilder();
      if (localInteger2 != null) {
        localStringBuilder1.append(localInteger2);
      }
      if (bool2)
      {
        if (localStringBuilder1.length() > 0) {
          localStringBuilder1.append(" - ");
        }
        localStringBuilder1.append(o);
      }
      for (;;)
      {
        StringBuilder localStringBuilder2 = new StringBuilder();
        if (localnvx.b != null) {
          localStringBuilder2.append(localnvx.b);
        }
        if (localStringBuilder1.length() > 0)
        {
          if (localStringBuilder2.length() > 0) {
            localStringBuilder2.append(", ");
          }
          localStringBuilder2.append(localStringBuilder1);
        }
        if (localStringBuilder2.length() > 0)
        {
          TextView localTextView2 = new TextView(localContext);
          localTextView2.setText(localStringBuilder2.toString());
          int k = jgd.e;
          int m = jgd.h;
          localTextView2.setTextSize(0, k);
          localTextView2.setTextColor(m);
          localLinearLayout.addView(localTextView2);
        }
        if (!TextUtils.isEmpty(localnvx.d))
        {
          TextView localTextView3 = new TextView(localContext);
          localTextView3.setText(localnvx.d);
          int n = jgd.f;
          int i1 = jgd.i;
          localTextView3.setTextSize(0, n);
          localTextView3.setTextColor(i1);
          localLinearLayout.addView(localTextView3);
        }
        j++;
        bool1 = false;
        break;
        if (localInteger1 != null)
        {
          if (localStringBuilder1.length() > 0) {
            localStringBuilder1.append(" - ");
          }
          localStringBuilder1.append(localInteger1);
        }
      }
      this.b.setVisibility(8);
      return;
      this.a.setVisibility(8);
      this.b.setVisibility(0);
      return;
      label607:
      localInteger2 = localInteger3;
      bool2 = false;
      continue;
      label617:
      bool2 = false;
      localInteger1 = null;
      localInteger2 = null;
    }
  }
  
  protected final int b()
  {
    return 7;
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((ViewGroup)findViewById(aw.cR));
    this.b = ((TextView)findViewById(aw.cx));
    TextView localTextView = this.b;
    int i = jgd.f;
    int j = jgd.j;
    localTextView.setTextSize(0, i);
    localTextView.setTextColor(j);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.oneprofile.about.OneProfileAboutEducationView
 * JD-Core Version:    0.7.0.1
 */