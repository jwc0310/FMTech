package com.google.android.libraries.social.squares.list;

import aau;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.social.media.ui.MediaView;
import com.google.android.libraries.social.squares.membership.JoinButton;
import efj;
import gvj;
import gwz;
import gxq;
import gxs;
import huu;
import huv;
import ipf;
import ipm;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import kuw;
import kxg;
import lea;
import lwo;
import lxj;
import mbb;
import mfx;
import mfz;
import odo;
import odp;
import ods;
import oed;
import oeg;
import pjo;

public class SquareListItemView
  extends LinearLayout
  implements View.OnClickListener, gxs, huv, lxj
{
  public String a;
  public lea b;
  public JoinButton c;
  private String d;
  private String e;
  private String f;
  private int g;
  private int h;
  private MediaView i;
  private TextView j;
  private TextView k;
  private TextView l;
  
  public SquareListItemView(Context paramContext)
  {
    super(paramContext);
  }
  
  public SquareListItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public SquareListItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private final void c()
  {
    mfz localmfz = (mfz)mfx.a.get();
    localmfz.b = (1 + localmfz.b);
    StringBuilder localStringBuilder;
    if (localmfz.b == 1)
    {
      localStringBuilder = localmfz.a;
      if (this.g != 1) {
        break label177;
      }
    }
    label177:
    for (int m = aau.Cl;; m = 0)
    {
      if (this.h != 0)
      {
        String str2 = NumberFormat.getIntegerInstance().format(this.h);
        localStringBuilder.append(getResources().getQuantityString(aau.Ck, this.h, new Object[] { str2 }));
        if (m != 0) {
          localStringBuilder.append(" - ");
        }
      }
      if (m != 0) {
        localStringBuilder.append(getResources().getString(m));
      }
      String str1 = mfx.b(localStringBuilder);
      if (TextUtils.isEmpty(str1))
      {
        this.k.setVisibility(8);
        return;
        localStringBuilder = new StringBuilder(256);
        break;
      }
      this.k.setVisibility(0);
      this.k.setText(str1);
      return;
    }
  }
  
  public void D_()
  {
    if (this.i != null) {
      this.i.D_();
    }
    setOnClickListener(null);
  }
  
  public final List<huu> a(View paramView)
  {
    ArrayList localArrayList = new ArrayList();
    String str1;
    if (lwo.a(this, paramView))
    {
      str1 = String.valueOf(this.a);
      if (str1.length() == 0) {
        break label60;
      }
    }
    label60:
    for (String str2 = "g:".concat(str1);; str2 = new String("g:"))
    {
      localArrayList.add(new huu(str2, null, 111));
      return localArrayList;
    }
  }
  
  public final void a(oed paramoed)
  {
    this.b = ((lea)mbb.a(getContext(), lea.class));
    this.a = paramoed.b.a;
    this.d = paramoed.b.b.a;
    this.e = null;
    this.f = paramoed.b.b.g;
    this.j.setText(this.d);
    String str = paramoed.b.b.c;
    if (!TextUtils.isEmpty(str))
    {
      this.i.a(ipf.a(getContext(), str, ipm.a));
      if (paramoed.b.c == null) {
        break label239;
      }
      this.g = paramoed.b.c.a;
      c();
      label135:
      if (paramoed.d.a != null)
      {
        this.h = paramoed.d.a.intValue();
        c();
      }
      if (this.f != null) {
        break label251;
      }
      this.l.setVisibility(8);
    }
    for (;;)
    {
      if (this.c != null)
      {
        kxg localkxg = efj.e(paramoed.f, paramoed.b.d);
        JoinButton localJoinButton = this.c;
        localJoinButton.a = this.a;
        localJoinButton.a(localkxg);
      }
      setOnClickListener(this);
      return;
      this.i.m = true;
      break;
      label239:
      this.g = 1;
      c();
      break label135;
      label251:
      this.l.setText(this.f);
      this.l.setVisibility(0);
    }
  }
  
  public void b()
  {
    if (this.j == null)
    {
      this.j = ((TextView)findViewById(efj.XI));
      this.i = ((MediaView)findViewById(efj.XJ));
      this.i.c(efj.XB);
      this.i.d(efj.XB);
      this.i.a(null);
      this.k = ((TextView)findViewById(efj.XH));
      findViewById(efj.XK);
      this.l = ((TextView)findViewById(efj.XD));
      this.c = ((JoinButton)findViewById(efj.XG));
    }
  }
  
  public void onClick(View paramView)
  {
    if (this.b != null)
    {
      ((gvj)mbb.a(getContext(), gvj.class)).b(this);
      this.b.a(this.a, null);
    }
    gwz.a(this, 4);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    b();
  }
  
  public final gxq v()
  {
    return new kuw(pjo.u, this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.squares.list.SquareListItemView
 * JD-Core Version:    0.7.0.1
 */