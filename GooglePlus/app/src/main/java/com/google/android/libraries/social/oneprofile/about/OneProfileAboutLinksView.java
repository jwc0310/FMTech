package com.google.android.libraries.social.oneprofile.about;

import aaw;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import aw;
import com.google.android.libraries.social.media.ui.MediaView;
import efj;
import ehr;
import eyg;
import ipf;
import ipm;
import jfq;
import jfr;
import jgd;
import nvn;
import nwf;
import nwg;
import nxl;

public final class OneProfileAboutLinksView
  extends jgd
{
  private static ColorStateList b;
  private static int c;
  private ViewGroup A;
  private TextView B;
  private View C;
  private ViewGroup D;
  private TextView E;
  private View F;
  private ViewGroup G;
  private LayoutInflater H = (LayoutInflater)getContext().getSystemService("layout_inflater");
  public jfr a;
  private TextView v;
  private View w;
  private View x;
  private TextView y;
  private View z;
  
  public OneProfileAboutLinksView(Context paramContext)
  {
    super(paramContext);
    if (b == null)
    {
      Resources localResources = getResources();
      b = localResources.getColorStateList(ehr.cX);
      c = localResources.getDimensionPixelSize(aaw.pc);
    }
  }
  
  public OneProfileAboutLinksView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (b == null)
    {
      Resources localResources = getResources();
      b = localResources.getColorStateList(ehr.cX);
      c = localResources.getDimensionPixelSize(aaw.pc);
    }
  }
  
  public OneProfileAboutLinksView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (b == null)
    {
      Resources localResources = getResources();
      b = localResources.getColorStateList(ehr.cX);
      c = localResources.getDimensionPixelSize(aaw.pc);
    }
  }
  
  private final View a(nwf paramnwf, ViewGroup paramViewGroup)
  {
    View localView = this.H.inflate(efj.QR, paramViewGroup, false);
    a(localView, paramnwf);
    return localView;
  }
  
  private final void a(View paramView, nwf paramnwf)
  {
    paramView.setBackgroundDrawable(getResources().getDrawable(eyg.as));
    paramView.setPadding(l, c, l, c);
    MediaView localMediaView = (MediaView)paramView.findViewById(aw.bU);
    String str1 = paramnwf.b;
    TextView localTextView;
    SpannableString localSpannableString1;
    if ((!TextUtils.isEmpty(str1)) && (!str1.startsWith("http:")))
    {
      String str5 = String.valueOf(str1);
      if (str5.length() != 0) {
        str1 = "http:".concat(str5);
      }
    }
    else
    {
      localMediaView.a(ipf.a(getContext(), str1, ipm.a));
      localMediaView.a(null);
      localTextView = (TextView)paramView.findViewById(aw.cg);
      String str2 = paramnwf.c;
      localSpannableString1 = new SpannableString(str2);
      localSpannableString1.setSpan(new TextAppearanceSpan("sans-serif", 0, f, k, k), 0, str2.length(), 33);
      if (paramnwf.d == null) {
        break label357;
      }
      if (!paramnwf.d.equals("past-contributor-to")) {
        break label347;
      }
      String str3 = String.valueOf(getResources().getString(efj.Ro));
      String str4 = 2 + String.valueOf(str3).length() + "(" + str3 + ")";
      SpannableString localSpannableString2 = new SpannableString(str4);
      localSpannableString2.setSpan(new TextAppearanceSpan("sans-serif", 0, f, b, b), 0, str4.length(), 33);
      localTextView.setText(TextUtils.concat(new CharSequence[] { localSpannableString1, " ", localSpannableString2 }));
    }
    for (;;)
    {
      paramView.setOnClickListener(new jfq(this, paramnwf.a));
      return;
      str1 = new String("http:");
      break;
      label347:
      localTextView.setText(localSpannableString1);
      continue;
      label357:
      localTextView.setText(localSpannableString1);
    }
  }
  
  public final void a(nxl paramnxl)
  {
    this.v.setVisibility(8);
    this.w.setVisibility(8);
    this.x.setVisibility(8);
    this.A.removeAllViews();
    this.D.removeAllViews();
    this.G.removeAllViews();
    nwg localnwg;
    if (paramnxl != null)
    {
      nvn localnvn = paramnxl.d;
      if (localnvn != null)
      {
        localnwg = localnvn.g;
        if (localnwg == null) {}
      }
    }
    for (nwf[] arrayOfnwf = localnwg.a;; arrayOfnwf = null)
    {
      if ((arrayOfnwf != null) && (arrayOfnwf.length > 0))
      {
        for (int i = 0;; i++) {
          if (i < arrayOfnwf.length)
          {
            nwf localnwf4 = arrayOfnwf[i];
            if (localnwf4.e == 1)
            {
              a(this.x, localnwf4);
              this.v.setVisibility(0);
              this.w.setVisibility(0);
              this.x.setVisibility(0);
            }
          }
          else
          {
            for (int j = 0; j < arrayOfnwf.length; j++)
            {
              nwf localnwf3 = arrayOfnwf[j];
              if (localnwf3.e == 2)
              {
                View localView3 = a(localnwf3, this.A);
                this.A.addView(localView3);
              }
            }
          }
        }
        for (int k = 0; k < arrayOfnwf.length; k++)
        {
          nwf localnwf2 = arrayOfnwf[k];
          if (localnwf2.e == 3)
          {
            View localView2 = a(localnwf2, this.D);
            this.D.addView(localView2);
          }
        }
        for (int m = 0; m < arrayOfnwf.length; m++)
        {
          nwf localnwf1 = arrayOfnwf[m];
          if (localnwf1.e == 4)
          {
            View localView1 = a(localnwf1, this.G);
            this.G.addView(localView1);
          }
        }
      }
      if (this.A.getChildCount() > 0)
      {
        this.y.setVisibility(0);
        this.z.setVisibility(0);
        this.A.setVisibility(0);
        if (this.D.getChildCount() <= 0) {
          break label441;
        }
        this.B.setVisibility(0);
        this.C.setVisibility(0);
        this.D.setVisibility(0);
      }
      for (;;)
      {
        if (this.G.getChildCount() <= 0) {
          break label471;
        }
        this.E.setVisibility(0);
        this.F.setVisibility(0);
        this.G.setVisibility(0);
        return;
        this.y.setVisibility(8);
        this.z.setVisibility(8);
        this.A.setVisibility(8);
        break;
        label441:
        this.B.setVisibility(8);
        this.C.setVisibility(8);
        this.D.setVisibility(8);
      }
      label471:
      this.E.setVisibility(8);
      this.F.setVisibility(8);
      this.G.setVisibility(8);
      return;
    }
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.v = ((TextView)findViewById(aw.di));
    this.w = findViewById(aw.dh);
    this.x = findViewById(aw.dg);
    this.y = ((TextView)findViewById(aw.cJ));
    this.z = findViewById(aw.cI);
    this.A = ((ViewGroup)findViewById(aw.cH));
    this.B = ((TextView)findViewById(aw.bu));
    this.C = findViewById(aw.bt);
    this.D = ((ViewGroup)findViewById(aw.bs));
    this.E = ((TextView)findViewById(aw.co));
    this.F = findViewById(aw.cn);
    this.G = ((ViewGroup)findViewById(aw.cm));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.oneprofile.about.OneProfileAboutLinksView
 * JD-Core Version:    0.7.0.1
 */