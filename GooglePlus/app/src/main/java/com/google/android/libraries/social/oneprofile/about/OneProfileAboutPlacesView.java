package com.google.android.libraries.social.oneprofile.about;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import aw;
import com.google.android.libraries.social.media.ui.MediaView;
import efj;
import ipf;
import ipm;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jgd;
import lxj;
import nwl;
import nxl;
import nxv;

public final class OneProfileAboutPlacesView
  extends jgd
  implements lxj
{
  private MediaView a;
  private TextView b;
  private TextView c;
  private View v;
  private TextView w;
  private ViewGroup x;
  private TextView y;
  
  public OneProfileAboutPlacesView(Context paramContext)
  {
    super(paramContext);
  }
  
  public OneProfileAboutPlacesView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public OneProfileAboutPlacesView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void D_()
  {
    super.D_();
    this.a.a(null);
  }
  
  public final void a(nxl paramnxl)
  {
    boolean bool1 = true;
    String str5;
    String str6;
    String str1;
    String str2;
    List localList1;
    if (paramnxl != null)
    {
      nxv localnxv = paramnxl.e;
      if (localnxv != null)
      {
        nwl localnwl = localnxv.i;
        if (localnwl != null)
        {
          str5 = localnwl.d;
          str6 = localnwl.b;
          if ((localnwl.c != null) && (localnwl.c.length > 0))
          {
            List localList2 = Arrays.asList(localnwl.c);
            str1 = str5;
            str2 = str6;
            localList1 = localList2;
          }
        }
      }
    }
    for (;;)
    {
      int i;
      boolean bool2;
      label132:
      int j;
      label143:
      label218:
      int k;
      label226:
      int m;
      label251:
      TextView localTextView1;
      if (!TextUtils.isEmpty(str1))
      {
        String str4 = efj.E(str1);
        this.a.a(ipf.a(getContext(), str4, ipm.a));
        this.a.setVisibility(0);
        i = bool1;
        if (i != 0) {
          break label423;
        }
        bool2 = bool1;
        if (TextUtils.isEmpty(str2)) {
          break label429;
        }
        j = bool1;
        if (j == 0) {
          break label435;
        }
        this.b.setVisibility(0);
        this.c.setVisibility(0);
        this.c.setText(str2);
        a(this.b, jgd.g, bool2);
        TextView localTextView3 = this.c;
        int i2 = jgd.f;
        int i3 = jgd.i;
        localTextView3.setTextSize(0, i2);
        localTextView3.setTextColor(i3);
        if (j != 0) {
          break label456;
        }
        k = bool1;
        this.x.removeAllViews();
        if ((localList1 == null) || (localList1.isEmpty())) {
          break label462;
        }
        m = bool1;
        if (m == 0) {
          break label485;
        }
        if (k == 0) {
          break label468;
        }
        this.v.setVisibility(8);
        label270:
        this.w.setVisibility(0);
        localTextView1 = this.w;
        if (k != 0) {
          break label479;
        }
      }
      label423:
      label429:
      label435:
      label456:
      label462:
      label468:
      label479:
      for (boolean bool3 = bool1;; bool3 = false)
      {
        a(localTextView1, jgd.g, bool3);
        this.x.setVisibility(0);
        Iterator localIterator = localList1.iterator();
        while (localIterator.hasNext())
        {
          String str3 = (String)localIterator.next();
          if (!TextUtils.isEmpty(str3))
          {
            TextView localTextView2 = new TextView(getContext());
            localTextView2.setText(str3);
            int n = jgd.f;
            int i1 = jgd.i;
            localTextView2.setTextSize(0, n);
            localTextView2.setTextColor(i1);
            this.x.addView(localTextView2);
          }
        }
        this.a.setVisibility(8);
        i = 0;
        break;
        bool2 = false;
        break label132;
        j = 0;
        break label143;
        this.b.setVisibility(8);
        this.c.setVisibility(8);
        break label218;
        k = 0;
        break label226;
        m = 0;
        break label251;
        this.v.setVisibility(0);
        break label270;
      }
      label485:
      this.v.setVisibility(8);
      this.w.setVisibility(8);
      this.x.setVisibility(8);
      if (((m != 0) || (k == 0)) || ((!TextUtils.isEmpty(str2)) || ((localList1 != null) && (!localList1.isEmpty()) && (!TextUtils.isEmpty((CharSequence)localList1.get(0)))))) {}
      while (bool1)
      {
        this.y.setVisibility(8);
        return;
        bool1 = false;
      }
      this.y.setVisibility(0);
      return;
      str1 = str5;
      str2 = str6;
      localList1 = null;
      continue;
      str1 = null;
      localList1 = null;
      str2 = null;
    }
  }
  
  protected final int b()
  {
    return 9;
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((MediaView)findViewById(aw.cs));
    this.b = ((TextView)findViewById(aw.bx));
    this.c = ((TextView)findViewById(aw.bw));
    this.v = findViewById(aw.cC);
    this.w = ((TextView)findViewById(aw.cD));
    this.x = ((ViewGroup)findViewById(aw.cB));
    this.y = ((TextView)findViewById(aw.cx));
    TextView localTextView = this.y;
    int i = jgd.f;
    int j = jgd.j;
    localTextView.setTextSize(0, i);
    localTextView.setTextColor(j);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.oneprofile.about.OneProfileAboutPlacesView
 * JD-Core Version:    0.7.0.1
 */