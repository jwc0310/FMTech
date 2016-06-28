package com.google.android.libraries.social.oneprofile.about;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import aw;
import com.google.android.libraries.social.media.ui.MediaView;
import efj;
import eyg;
import ipf;
import ipm;
import jfn;
import jfo;
import jfp;
import jgd;
import lxj;
import nvv;
import nvw;
import nxl;
import nxv;

public final class OneProfileAboutCurrentLocationView
  extends jgd
  implements lxj
{
  private static Drawable b;
  public jfp a;
  private TextView c;
  private MediaView v;
  private View w;
  private View x;
  
  public OneProfileAboutCurrentLocationView(Context paramContext)
  {
    super(paramContext);
    if (b == null) {
      b = getContext().getResources().getDrawable(eyg.al);
    }
  }
  
  public OneProfileAboutCurrentLocationView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (b == null) {
      b = getContext().getResources().getDrawable(eyg.al);
    }
  }
  
  public OneProfileAboutCurrentLocationView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (b == null) {
      b = getContext().getResources().getDrawable(eyg.al);
    }
  }
  
  public final void D_()
  {
    super.D_();
    this.v.a(null);
    this.w.setOnClickListener(null);
  }
  
  public final void a(nxl paramnxl)
  {
    boolean bool;
    String str2;
    String str1;
    if (paramnxl != null)
    {
      nxv localnxv = paramnxl.e;
      if (localnxv != null)
      {
        nvw localnvw = localnxv.n;
        if (localnvw != null)
        {
          bool = efj.b(localnvw.b);
          nvv[] arrayOfnvv = localnvw.a;
          if ((arrayOfnvv != null) && (arrayOfnvv.length != 0))
          {
            nvv localnvv = arrayOfnvv[0];
            str2 = localnvv.f;
            str1 = localnvv.g;
          }
        }
      }
    }
    for (;;)
    {
      Drawable localDrawable;
      label127:
      View localView;
      label182:
      int i;
      if (!TextUtils.isEmpty(str2))
      {
        this.c.setVisibility(0);
        this.c.setFocusable(true);
        this.c.setText(str2);
        TextView localTextView2 = this.c;
        if (str2 == null)
        {
          localDrawable = null;
          localTextView2.setCompoundDrawablesWithIntrinsicBounds(localDrawable, null, null, null);
          if (TextUtils.isEmpty(str1)) {
            break label324;
          }
          String str3 = efj.E(str1);
          this.v.a(ipf.a(getContext(), str3, ipm.a));
          this.v.setVisibility(0);
          this.v.setOnClickListener(new jfn(this));
          if (!this.p) {
            break label343;
          }
          this.w.setVisibility(0);
          this.w.setOnClickListener(new jfo(this));
          localView = this.x;
          i = 0;
          if (bool) {
            break label336;
          }
        }
      }
      for (;;)
      {
        localView.setVisibility(i);
        return;
        localDrawable = b;
        break;
        if ((this.p) && (bool))
        {
          this.c.setVisibility(0);
          this.c.setFocusable(true);
          TextView localTextView1 = this.c;
          int j = efj.Rp;
          localTextView1.setText(getContext().getResources().getString(j));
          this.c.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
          break label127;
        }
        this.c.setVisibility(8);
        break label127;
        label324:
        this.v.setVisibility(8);
        break label182;
        label336:
        i = 8;
      }
      label343:
      this.w.setVisibility(8);
      this.w.setOnClickListener(null);
      return;
      str1 = null;
      str2 = null;
      continue;
      str1 = null;
      str2 = null;
      bool = false;
    }
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.c = ((TextView)findViewById(aw.bw));
    this.v = ((MediaView)findViewById(aw.cs));
    this.w = findViewById(aw.cT);
    this.x = findViewById(aw.bT);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.oneprofile.about.OneProfileAboutCurrentLocationView
 * JD-Core Version:    0.7.0.1
 */