package com.google.android.libraries.social.squares.list;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import efj;
import gvj;
import gwz;
import gxq;
import mbb;
import pjo;
import pka;

public final class SquareListInvitationView
  extends SquareListItemView
{
  private TextView d;
  private AvatarView e;
  private ImageView f;
  
  public SquareListInvitationView(Context paramContext)
  {
    super(paramContext);
  }
  
  public SquareListInvitationView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public SquareListInvitationView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void D_()
  {
    if (this.e != null) {
      this.e.setOnClickListener(null);
    }
    if (this.f != null) {
      this.f.setOnClickListener(null);
    }
  }
  
  public final void b()
  {
    super.b();
    if (this.d == null)
    {
      this.d = ((TextView)findViewById(efj.XE));
      this.e = ((AvatarView)findViewById(efj.XF));
      this.f = ((ImageView)findViewById(efj.XC));
      efj.a(this.e, new gxq(pka.x));
      efj.a(this.f, new gxq(pjo.S));
    }
  }
  
  public final void onClick(View paramView)
  {
    int i;
    int j;
    AvatarView localAvatarView;
    String str1;
    if (this.b != null)
    {
      i = paramView.getId();
      if (i != efj.XF) {
        break label117;
      }
      if (Build.VERSION.SDK_INT < 21) {
        break label98;
      }
      j = 1;
      if (j != 0)
      {
        localAvatarView = this.e;
        str1 = String.valueOf(null);
        if (str1.length() == 0) {
          break label103;
        }
      }
    }
    label98:
    label103:
    for (String str2 = "square_list_avatar_".concat(str1);; str2 = new String("square_list_avatar_"))
    {
      localAvatarView.setTransitionName(str2);
      ((gvj)mbb.a(getContext(), gvj.class)).a(this.e);
      gwz.a(this.e, 4);
      return;
      j = 0;
      break;
    }
    label117:
    if (i == efj.XC)
    {
      gwz.a(this.f, 4);
      return;
    }
    super.onClick(paramView);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.squares.list.SquareListInvitationView
 * JD-Core Version:    0.7.0.1
 */