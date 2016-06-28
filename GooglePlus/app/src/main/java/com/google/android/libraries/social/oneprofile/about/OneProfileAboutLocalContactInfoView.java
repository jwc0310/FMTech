package com.google.android.libraries.social.oneprofile.about;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import aw;
import com.google.android.libraries.social.media.ui.MediaView;
import efj;
import ehr;
import ipf;
import ipm;
import jfs;
import jgd;
import nwj;
import nwt;
import nxl;
import qga;
import qgb;
import qgi;
import qgm;
import qgz;
import qha;

public final class OneProfileAboutLocalContactInfoView
  extends jgd
  implements View.OnClickListener
{
  private static ColorStateList c;
  public boolean a = true;
  public jfs b;
  private String v;
  private String w;
  private String x;
  private String y;
  
  public OneProfileAboutLocalContactInfoView(Context paramContext)
  {
    super(paramContext);
    c = getContext().getResources().getColorStateList(ehr.cW);
  }
  
  public OneProfileAboutLocalContactInfoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    c = getContext().getResources().getColorStateList(ehr.cW);
  }
  
  public OneProfileAboutLocalContactInfoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    c = getContext().getResources().getColorStateList(ehr.cW);
  }
  
  public final void a(nxl paramnxl)
  {
    this.v = efj.c(paramnxl);
    this.w = efj.b(paramnxl);
    qgm localqgm = efj.i(paramnxl);
    String str1;
    qga localqga;
    label58:
    String str2;
    label95:
    PlacesMapView localPlacesMapView;
    label140:
    Object localObject;
    label143:
    label183:
    View localView1;
    TextView localTextView1;
    label246:
    View localView2;
    TextView localTextView2;
    label312:
    View localView3;
    TextView localTextView3;
    if (localqgm != null)
    {
      str1 = localqgm.a;
      this.x = str1;
      qga[] arrayOfqga = efj.k(paramnxl);
      if ((arrayOfqga == null) || (arrayOfqga.length == 0)) {
        break label457;
      }
      localqga = arrayOfqga[0];
      if ((localqga == null) || (localqga.a == null) || (localqga.a.b == null)) {
        break label463;
      }
      str2 = localqga.a.b.a;
      this.y = str2;
      localPlacesMapView = (PlacesMapView)findViewById(aw.cu);
      switch (efj.a(paramnxl))
      {
      default: 
        localObject = null;
        if ((this.a) && (!TextUtils.isEmpty((CharSequence)localObject)))
        {
          localPlacesMapView.a(ipf.a(getContext(), (String)localObject, ipm.a), null, true);
          localPlacesMapView.setVisibility(0);
          localView1 = findViewById(aw.cK);
          localTextView1 = (TextView)findViewById(aw.cL);
          if (this.v == null) {
            break label538;
          }
          localView1.setVisibility(0);
          localView1.setOnClickListener(this);
          localTextView1.setText(this.v);
          localTextView1.setVisibility(0);
          localTextView1.setTextColor(c);
          localView2 = findViewById(aw.aP);
          localTextView2 = (TextView)findViewById(aw.aQ);
          if (TextUtils.isEmpty(this.w)) {
            break label561;
          }
          localView2.setVisibility(0);
          localView2.setOnClickListener(this);
          localTextView2.setText(this.w);
          localTextView2.setVisibility(0);
          localTextView2.setTextColor(c);
          localView3 = findViewById(aw.dj);
          localTextView3 = (TextView)findViewById(aw.dk);
          if (TextUtils.isEmpty(this.x)) {
            break label584;
          }
          localView3.setVisibility(0);
          localView3.setOnClickListener(this);
          localTextView3.setText(localqgm.b);
          localTextView3.setVisibility(0);
          localTextView3.setTextColor(c);
        }
        break;
      }
    }
    View localView4;
    TextView localTextView4;
    for (;;)
    {
      localView4 = findViewById(aw.cv);
      localTextView4 = (TextView)findViewById(aw.cw);
      if (TextUtils.isEmpty(this.y)) {
        break label607;
      }
      localView4.setVisibility(0);
      localView4.setOnClickListener(this);
      localTextView4.setText(localqga.a.b.b);
      localTextView4.setVisibility(0);
      localTextView4.setTextColor(c);
      return;
      str1 = null;
      break;
      label457:
      localqga = null;
      break label58;
      label463:
      str2 = null;
      break label95;
      if ((paramnxl.f.b.d.l == null) || (paramnxl.f.b.d.l.b == null)) {
        break label140;
      }
      localObject = paramnxl.f.b.d.l.b.a;
      break label143;
      localPlacesMapView.setVisibility(8);
      break label183;
      label538:
      localView1.setVisibility(8);
      localView1.setOnClickListener(null);
      localTextView1.setVisibility(8);
      break label246;
      label561:
      localView2.setVisibility(8);
      localView2.setOnClickListener(null);
      localTextView2.setVisibility(8);
      break label312;
      label584:
      localView3.setVisibility(8);
      localView3.setOnClickListener(null);
      localTextView3.setVisibility(8);
    }
    label607:
    localView4.setVisibility(8);
    localView4.setOnClickListener(null);
    localTextView4.setVisibility(8);
  }
  
  public final void onClick(View paramView)
  {
    int i = paramView.getId();
    if (i == aw.cK) {
      this.b.c(this.v);
    }
    do
    {
      return;
      if (i == aw.aP)
      {
        this.b.d(this.w);
        return;
      }
      if (i == aw.dj)
      {
        this.b.e(this.x);
        return;
      }
    } while (i != aw.cv);
    this.b.e(this.y);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.oneprofile.about.OneProfileAboutLocalContactInfoView
 * JD-Core Version:    0.7.0.1
 */