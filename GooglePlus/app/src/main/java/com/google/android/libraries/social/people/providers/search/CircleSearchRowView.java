package com.google.android.libraries.social.people.providers.search;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import az;
import com.google.android.libraries.social.people.providers.acl.CircleAvatarView;
import com.google.android.libraries.social.people.ui.PeopleListRowNameView;

public final class CircleSearchRowView
  extends RelativeLayout
{
  public CircleAvatarView a;
  public PeopleListRowNameView b;
  
  public CircleSearchRowView(Context paramContext)
  {
    super(paramContext);
  }
  
  public CircleSearchRowView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public CircleSearchRowView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((CircleAvatarView)findViewById(az.p));
    this.b = ((PeopleListRowNameView)findViewById(az.r));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.people.providers.search.CircleSearchRowView
 * JD-Core Version:    0.7.0.1
 */