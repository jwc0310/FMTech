package com.google.android.libraries.social.location;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import eyg;
import iiu;
import iix;
import lxj;

public final class FriendLocationsListItemView
  extends LinearLayout
  implements View.OnClickListener, PopupMenu.OnMenuItemClickListener, lxj
{
  public String a;
  public String b;
  public iiu c;
  public AvatarView d;
  public TextView e;
  public TextView f;
  public TextView g;
  public ProgressBar h;
  public boolean i;
  
  public FriendLocationsListItemView(Context paramContext)
  {
    super(paramContext);
  }
  
  public FriendLocationsListItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public FriendLocationsListItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void D_()
  {
    this.d.a();
  }
  
  public final void onClick(View paramView)
  {
    if (this.c == null) {
      return;
    }
    if (paramView == this.d)
    {
      this.c.b(this.a);
      return;
    }
    this.c.a(this.a, this.b);
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    if (this.d == null)
    {
      this.d = ((AvatarView)findViewById(eyg.V));
      this.e = ((TextView)findViewById(eyg.ac));
      this.f = ((TextView)findViewById(eyg.Z));
      this.g = ((TextView)findViewById(eyg.ad));
      this.g.setHorizontallyScrolling(false);
      this.h = ((ProgressBar)findViewById(eyg.ae));
      iix localiix = new iix(this);
      this.d.setOnClickListener(this);
      findViewById(eyg.aa).setOnClickListener(this);
      findViewById(eyg.ab).setOnClickListener(localiix);
    }
  }
  
  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    if (this.c == null) {
      return false;
    }
    int j = paramMenuItem.getItemId();
    if (j == eyg.W) {
      this.c.c(this.a);
    }
    for (;;)
    {
      return true;
      if (j == eyg.X) {
        this.c.d(this.a);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.location.FriendLocationsListItemView
 * JD-Core Version:    0.7.0.1
 */