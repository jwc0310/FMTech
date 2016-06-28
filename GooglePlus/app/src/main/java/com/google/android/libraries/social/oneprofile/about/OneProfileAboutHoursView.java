package com.google.android.libraries.social.oneprofile.about;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import aw;
import efj;
import ehr;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import jgd;
import lxj;
import nvi;
import nwj;
import nwt;
import nxl;
import nxt;
import nxu;
import nxz;
import qgi;
import qgq;
import qgr;
import qgs;

public final class OneProfileAboutHoursView
  extends jgd
  implements lxj
{
  private static final CharSequence a = " – ";
  private static int b;
  private static int c;
  private LayoutInflater v = (LayoutInflater)getContext().getSystemService("layout_inflater");
  private LinearLayout w;
  private int x;
  
  public OneProfileAboutHoursView(Context paramContext)
  {
    super(paramContext);
    Resources localResources = getContext().getResources();
    if (b == 0)
    {
      b = localResources.getColor(ehr.cV);
      c = localResources.getColor(ehr.da);
    }
  }
  
  public OneProfileAboutHoursView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Resources localResources = getContext().getResources();
    if (b == 0)
    {
      b = localResources.getColor(ehr.cV);
      c = localResources.getColor(ehr.da);
    }
  }
  
  public OneProfileAboutHoursView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Resources localResources = getContext().getResources();
    if (b == 0)
    {
      b = localResources.getColor(ehr.cV);
      c = localResources.getColor(ehr.da);
    }
  }
  
  private static int a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return -1;
    case 0: 
      return 1;
    case 1: 
      return 2;
    case 2: 
      return 3;
    case 3: 
      return 4;
    case 4: 
      return 5;
    case 5: 
      return 6;
    }
    return 7;
  }
  
  private final View a(nxz paramnxz)
  {
    OneProfileAboutHoursRowView localOneProfileAboutHoursRowView = (OneProfileAboutHoursRowView)this.v.inflate(efj.QQ, null);
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 1;
    nxu[] arrayOfnxu = paramnxz.b;
    int j = arrayOfnxu.length;
    int k = 0;
    if (k < j)
    {
      nxu localnxu = arrayOfnxu[k];
      int n;
      label78:
      Object localObject;
      if ((localnxu.a != null) && (localnxu.b != null))
      {
        if (i == 0) {
          break label119;
        }
        n = 0;
        if ((localnxu != null) && (localnxu.a != null) && (localnxu.b != null)) {
          break label133;
        }
        localObject = null;
      }
      for (;;)
      {
        localStringBuilder.append((CharSequence)localObject);
        i = n;
        k++;
        break;
        label119:
        localStringBuilder.append("\n");
        n = i;
        break label78;
        label133:
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(localnxu.a.a);
        ((StringBuilder)localObject).append(a);
        ((StringBuilder)localObject).append(localnxu.b.a);
      }
    }
    if (!TextUtils.isEmpty(localStringBuilder))
    {
      Calendar localCalendar1 = Calendar.getInstance();
      int m = a(paramnxz.a);
      Calendar localCalendar2 = null;
      if (m != -1)
      {
        localCalendar1.set(7, a(paramnxz.a));
        localCalendar2 = localCalendar1;
      }
      if (localCalendar2 != null) {}
      for (String str1 = new SimpleDateFormat("cccccc").format(localCalendar2.getTime());; str1 = "")
      {
        localOneProfileAboutHoursRowView.a.setText(str1);
        String str2 = localStringBuilder.toString();
        localOneProfileAboutHoursRowView.b.setText(str2);
        if ((paramnxz.c == null) || (!paramnxz.c.booleanValue())) {
          break;
        }
        localOneProfileAboutHoursRowView.setBackgroundColor(b);
        return localOneProfileAboutHoursRowView;
      }
      localOneProfileAboutHoursRowView.setBackgroundColor(0);
      return localOneProfileAboutHoursRowView;
    }
    return null;
  }
  
  public final void D_()
  {
    super.D_();
    this.w.removeAllViews();
  }
  
  public final void a(nxl paramnxl)
  {
    int i = 0;
    if (!efj.h(paramnxl)) {}
    for (;;)
    {
      return;
      nwj localnwj = paramnxl.f.b;
      if (efj.a(localnwj))
      {
        qgr[] arrayOfqgr = localnwj.d.i.a;
        int k = arrayOfqgr.length;
        int m = 0;
        label45:
        OneProfileAboutHoursRowView localOneProfileAboutHoursRowView;
        if (m < k)
        {
          qgr localqgr = arrayOfqgr[m];
          localOneProfileAboutHoursRowView = (OneProfileAboutHoursRowView)this.v.inflate(efj.QQ, null);
          StringBuilder localStringBuilder = new StringBuilder();
          int n = 1;
          qgs[] arrayOfqgs = localqgr.b;
          int i1 = arrayOfqgs.length;
          int i2 = 0;
          if (i2 < i1)
          {
            qgs localqgs = arrayOfqgs[i2];
            if (!TextUtils.isEmpty(localqgs.a))
            {
              if (n == 0) {
                break label152;
              }
              n = 0;
            }
            for (;;)
            {
              localStringBuilder.append(localqgs.a);
              i2++;
              break;
              label152:
              localStringBuilder.append("\n");
            }
          }
          if (TextUtils.isEmpty(localStringBuilder)) {
            break label276;
          }
          String str1 = localqgr.a;
          localOneProfileAboutHoursRowView.a.setText(str1);
          String str2 = localStringBuilder.toString();
          localOneProfileAboutHoursRowView.b.setText(str2);
          if ((localqgr.c == null) || (!localqgr.c.booleanValue())) {
            break label260;
          }
          localOneProfileAboutHoursRowView.a(c);
          localOneProfileAboutHoursRowView.setBackgroundColor(b);
        }
        for (;;)
        {
          if (localOneProfileAboutHoursRowView != null) {
            this.w.addView(localOneProfileAboutHoursRowView);
          }
          m++;
          break label45;
          break;
          label260:
          localOneProfileAboutHoursRowView.a(-16777216);
          localOneProfileAboutHoursRowView.setBackgroundColor(0);
          continue;
          label276:
          localOneProfileAboutHoursRowView = null;
        }
      }
      if (efj.b(localnwj))
      {
        nxz[] arrayOfnxz = localnwj.b.a;
        int j = arrayOfnxz.length;
        while (i < j)
        {
          View localView = a(arrayOfnxz[i]);
          if (localView != null) {
            this.w.addView(localView);
          }
          i++;
        }
      }
    }
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.w = ((LinearLayout)findViewById(aw.cA));
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i = this.w.getChildCount();
    if (i > 0)
    {
      int j = 0;
      int k = 0;
      while (j < i)
      {
        k = Math.max(k, ((OneProfileAboutHoursRowView)this.w.getChildAt(j)).a.getMeasuredWidth());
        j++;
      }
      int m = this.x;
      int n = 0;
      if (m != k)
      {
        while (n < i)
        {
          ((OneProfileAboutHoursRowView)this.w.getChildAt(n)).a.getLayoutParams().width = k;
          n++;
        }
        this.x = k;
        super.onMeasure(paramInt1, paramInt2);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.oneprofile.about.OneProfileAboutHoursView
 * JD-Core Version:    0.7.0.1
 */