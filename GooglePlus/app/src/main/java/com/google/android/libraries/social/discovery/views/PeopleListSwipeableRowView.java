package com.google.android.libraries.social.discovery.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import hvl;
import lvp;

public final class PeopleListSwipeableRowView
  extends RelativeLayout
{
  hvl a;
  
  public PeopleListSwipeableRowView(Context paramContext)
  {
    super(paramContext);
  }
  
  public PeopleListSwipeableRowView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public final void setPressed(boolean paramBoolean)
  {
    if ((this.a != null) && (this.a.d)) {
      paramBoolean = false;
    }
    super.setPressed(paramBoolean);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.discovery.views.PeopleListSwipeableRowView
 * JD-Core Version:    0.7.0.1
 */