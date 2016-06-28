package com.google.android.libraries.social.people.providers.acl;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import efj;
import gow;
import jjg;

public final class PersonAvatarView
  extends RelativeLayout
{
  private static int b;
  public final gow a;
  private final AvatarView c;
  
  public PersonAvatarView(Context paramContext)
  {
    super(paramContext);
    a();
    setLayoutParams(new RelativeLayout.LayoutParams(b, b));
    this.c = new AvatarView(getContext());
    b();
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(b, b);
    localLayoutParams1.addRule(13, -1);
    addView(this.c, localLayoutParams1);
    this.a = new gow(getContext());
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams2.addRule(11);
    localLayoutParams2.addRule(10);
    addView(this.a, localLayoutParams2);
  }
  
  public PersonAvatarView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
    setLayoutParams(new RelativeLayout.LayoutParams(b, b));
    this.c = new AvatarView(getContext());
    b();
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(b, b);
    localLayoutParams1.addRule(13, -1);
    addView(this.c, localLayoutParams1);
    this.a = new gow(getContext());
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams2.addRule(11);
    localLayoutParams2.addRule(10);
    addView(this.a, localLayoutParams2);
  }
  
  public PersonAvatarView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
    setLayoutParams(new RelativeLayout.LayoutParams(b, b));
    this.c = new AvatarView(getContext());
    b();
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(b, b);
    localLayoutParams1.addRule(13, -1);
    addView(this.c, localLayoutParams1);
    this.a = new gow(getContext());
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams2.addRule(11);
    localLayoutParams2.addRule(10);
    addView(this.a, localLayoutParams2);
  }
  
  private final void a()
  {
    if (b == 0) {
      b = getResources().getDimensionPixelSize(efj.Sq);
    }
  }
  
  private final void b()
  {
    this.c.g = false;
    this.c.e = 1;
    this.c.a(3);
  }
  
  public final PersonAvatarView a(jjg paramjjg)
  {
    if (paramjjg != null) {
      this.c.a(paramjjg.a(), paramjjg.e());
    }
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.people.providers.acl.PersonAvatarView
 * JD-Core Version:    0.7.0.1
 */