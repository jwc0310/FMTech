package com.google.android.libraries.social.squares.providers.acl;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import efj;
import gow;

public final class SquareAvatarView
  extends RelativeLayout
{
  private static int c;
  private static int d;
  public final AvatarView a;
  public final gow b;
  
  public SquareAvatarView(Context paramContext)
  {
    super(paramContext);
    a();
    setLayoutParams(new RelativeLayout.LayoutParams(c, c));
    this.a = new AvatarView(getContext());
    c();
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(c, c);
    localLayoutParams1.addRule(13, -1);
    addView(this.a, localLayoutParams1);
    this.b = new gow(getContext());
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams2.setMargins(0, b(), b(), 0);
    localLayoutParams2.addRule(11);
    localLayoutParams2.addRule(10);
    addView(this.b, localLayoutParams2);
  }
  
  public SquareAvatarView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
    setLayoutParams(new RelativeLayout.LayoutParams(c, c));
    this.a = new AvatarView(getContext());
    c();
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(c, c);
    localLayoutParams1.addRule(13, -1);
    addView(this.a, localLayoutParams1);
    this.b = new gow(getContext());
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams2.setMargins(0, b(), b(), 0);
    localLayoutParams2.addRule(11);
    localLayoutParams2.addRule(10);
    addView(this.b, localLayoutParams2);
  }
  
  public SquareAvatarView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
    setLayoutParams(new RelativeLayout.LayoutParams(c, c));
    this.a = new AvatarView(getContext());
    c();
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(c, c);
    localLayoutParams1.addRule(13, -1);
    addView(this.a, localLayoutParams1);
    this.b = new gow(getContext());
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams2.setMargins(0, b(), b(), 0);
    localLayoutParams2.addRule(11);
    localLayoutParams2.addRule(10);
    addView(this.b, localLayoutParams2);
  }
  
  private final void a()
  {
    if (c == 0) {
      c = getResources().getDimensionPixelSize(efj.Yj);
    }
  }
  
  private final int b()
  {
    if (d == 0) {
      d = getResources().getDimensionPixelSize(efj.Yk);
    }
    return d;
  }
  
  private final void c()
  {
    this.a.g = false;
    this.a.e = 2;
    this.a.a(3);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.squares.providers.acl.SquareAvatarView
 * JD-Core Version:    0.7.0.1
 */