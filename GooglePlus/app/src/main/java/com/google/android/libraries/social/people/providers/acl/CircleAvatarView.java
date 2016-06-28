package com.google.android.libraries.social.people.providers.acl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import gow;
import java.util.List;
import jjg;
import jmi;

public final class CircleAvatarView
  extends RelativeLayout
{
  public final gow a;
  private jmi b;
  
  public CircleAvatarView(Context paramContext)
  {
    super(paramContext);
    int i = jmi.a(getContext());
    setLayoutParams(new RelativeLayout.LayoutParams(i, i));
    this.b = new jmi(getContext());
    this.b.setTag("avatar_pile_tag");
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -1);
    addView(this.b, localLayoutParams1);
    this.a = new gow(getContext());
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams2.addRule(11);
    localLayoutParams2.addRule(10);
    addView(this.a, localLayoutParams2);
  }
  
  public CircleAvatarView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int i = jmi.a(getContext());
    setLayoutParams(new RelativeLayout.LayoutParams(i, i));
    this.b = new jmi(getContext());
    this.b.setTag("avatar_pile_tag");
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -1);
    addView(this.b, localLayoutParams1);
    this.a = new gow(getContext());
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams2.addRule(11);
    localLayoutParams2.addRule(10);
    addView(this.a, localLayoutParams2);
  }
  
  public CircleAvatarView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    int i = jmi.a(getContext());
    setLayoutParams(new RelativeLayout.LayoutParams(i, i));
    this.b = new jmi(getContext());
    this.b.setTag("avatar_pile_tag");
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -1);
    addView(this.b, localLayoutParams1);
    this.a = new gow(getContext());
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams2.addRule(11);
    localLayoutParams2.addRule(10);
    addView(this.a, localLayoutParams2);
  }
  
  private final void a()
  {
    for (int i = 0; i < getChildCount(); i++)
    {
      View localView = getChildAt(i);
      if (localView.getTag() != "item_check_view_tag") {
        localView.setVisibility(8);
      }
    }
  }
  
  public final CircleAvatarView a(int paramInt, boolean paramBoolean)
  {
    a();
    jmi localjmi = this.b;
    localjmi.c = paramInt;
    localjmi.a = true;
    localjmi.b = paramBoolean;
    this.b.setVisibility(0);
    return this;
  }
  
  public final CircleAvatarView a(List<jjg> paramList)
  {
    a();
    this.b.a(paramList);
    this.b.setVisibility(0);
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.people.providers.acl.CircleAvatarView
 * JD-Core Version:    0.7.0.1
 */