package com.google.android.libraries.social.squares.stream.relatedlinksview;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.social.media.ui.MediaView;
import efj;
import ipf;
import ipm;
import lic;
import lxw;
import lxx;
import lxy;
import odq;
import odr;

public final class RelatedLinksView
  extends LinearLayout
{
  public final LayoutInflater a = (LayoutInflater)getContext().getSystemService("layout_inflater");
  public boolean b = false;
  public int c = 0;
  public int d = 0;
  public String e;
  public final lxx f = new lic(this);
  
  public RelatedLinksView(Context paramContext)
  {
    super(paramContext);
    setOrientation(1);
  }
  
  public RelatedLinksView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOrientation(1);
  }
  
  public RelatedLinksView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setOrientation(1);
  }
  
  public final void a(odr paramodr)
  {
    removeAllViews();
    if ((paramodr != null) && (paramodr.a.length > 0))
    {
      odq[] arrayOfodq = paramodr.a;
      int i = arrayOfodq.length;
      int j = 0;
      if (j < i)
      {
        odq localodq = arrayOfodq[j];
        View localView = this.a.inflate(efj.YE, this, false);
        MediaView localMediaView = (MediaView)localView.findViewById(efj.YC);
        String str1 = localodq.c;
        if (TextUtils.isEmpty(str1)) {
          str1 = "https://s2.googleusercontent.com/s2/favicons?domain=";
        }
        Context localContext = getContext();
        String str2 = efj.E(str1);
        double d1;
        String str3;
        label131:
        TextView localTextView;
        if (this.e == null)
        {
          d1 = efj.K(getContext()).density;
          if (d1 >= 1.8D)
          {
            str3 = "32";
            this.e = str3;
          }
        }
        else
        {
          localMediaView.a(ipf.a(localContext, Uri.parse(str2).buildUpon().appendQueryParameter("sz", this.e).build().toString(), ipm.a));
          localMediaView.a(null);
          localTextView = (TextView)localView.findViewById(efj.YD);
          if ((!this.b) || (TextUtils.isEmpty(localodq.a))) {
            break label352;
          }
          SpannableString localSpannableString = new SpannableString(localodq.b);
          lxw locallxw = new lxw(localodq.a, this.f);
          locallxw.c = Typeface.DEFAULT_BOLD;
          localSpannableString.setSpan(locallxw, 0, localodq.b.length(), 33);
          localTextView.setMovementMethod(lxy.a());
          localTextView.setText(localSpannableString);
          if (this.d != 0) {
            localTextView.setLinkTextColor(this.d);
          }
        }
        for (;;)
        {
          if (this.c != 0) {
            localTextView.setTextColor(this.c);
          }
          addView(localView);
          j++;
          break;
          if (d1 >= 2.8D)
          {
            str3 = "64";
            break label131;
          }
          str3 = "16";
          break label131;
          label352:
          localTextView.setText(localodq.b);
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.squares.stream.relatedlinksview.RelatedLinksView
 * JD-Core Version:    0.7.0.1
 */