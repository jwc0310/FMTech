package com.google.android.libraries.social.squares.members;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import eb;
import efj;
import eu;
import gvj;
import gwz;
import gxq;
import gxs;
import lfc;
import lxj;
import mbb;
import pjo;

public final class SquareMemberListItemView
  extends RelativeLayout
  implements View.OnClickListener, gxs, lxj
{
  public lfc a;
  private String b;
  private String c;
  private int d;
  private View e;
  private AvatarView f;
  private TextView g;
  private TextView h;
  private View i;
  
  public SquareMemberListItemView(Context paramContext)
  {
    super(paramContext);
  }
  
  public SquareMemberListItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public SquareMemberListItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void D_()
  {
    if (this.f != null) {
      this.f.a();
    }
    this.b = null;
    this.c = null;
    this.a = null;
  }
  
  public final SquareMemberListItemView a(String paramString1, String paramString2, String paramString3, int paramInt, boolean paramBoolean)
  {
    this.b = paramString1;
    this.c = paramString2;
    String str = efj.t(this.b);
    this.f.a(str, paramString3);
    this.g.setText(this.c);
    this.d = paramInt;
    View localView;
    int j;
    switch (paramInt)
    {
    default: 
      this.h.setVisibility(8);
      localView = this.i;
      j = 0;
      if (!paramBoolean) {
        break;
      }
    }
    for (;;)
    {
      localView.setVisibility(j);
      if (paramBoolean) {
        this.i.setOnClickListener(this);
      }
      return this;
      this.h.setText(eu.o);
      this.h.setVisibility(0);
      break;
      this.h.setText(eu.n);
      this.h.setVisibility(0);
      break;
      j = 8;
    }
  }
  
  public final void onClick(View paramView)
  {
    int j;
    if (this.a != null)
    {
      j = paramView.getId();
      if (j != eb.s) {
        break label139;
      }
      str1 = efj.t(this.b);
      if (str1 != null)
      {
        if (Build.VERSION.SDK_INT < 21) {
          break label119;
        }
        k = 1;
        if (k != 0)
        {
          localAvatarView = this.f;
          str2 = String.valueOf(str1);
          if (str2.length() == 0) {
            break label125;
          }
          str3 = "square_mem_avatar_".concat(str2);
          localAvatarView.setTransitionName(str3);
        }
        ((gvj)mbb.a(getContext(), gvj.class)).a(this.f);
        this.a.a(str1);
      }
      gwz.a(this, 4);
    }
    label119:
    label125:
    while (j != eb.q) {
      for (;;)
      {
        String str1;
        AvatarView localAvatarView;
        String str2;
        return;
        int k = 0;
        continue;
        String str3 = new String("square_mem_avatar_");
      }
    }
    label139:
    this.a.a(this.b, this.c, this.d);
    gwz.a(paramView, 4);
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    if (this.e == null)
    {
      this.e = findViewById(eb.s);
      this.g = ((TextView)findViewById(eb.v));
      this.f = ((AvatarView)findViewById(eb.r));
      this.h = ((TextView)findViewById(eb.t));
      this.i = findViewById(eb.q);
      efj.a(this.i, new gxq(pjo.y));
    }
    this.e.setOnClickListener(this);
  }
  
  public final gxq v()
  {
    return new gxq(pjo.v);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.squares.members.SquareMemberListItemView
 * JD-Core Version:    0.7.0.1
 */