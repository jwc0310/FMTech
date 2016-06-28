package com.google.android.libraries.social.poll.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import da;
import efj;

public final class PollOptionVoterListItemView
  extends RelativeLayout
{
  public AvatarView a;
  public TextView b;
  
  public PollOptionVoterListItemView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public PollOptionVoterListItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public PollOptionVoterListItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private final void a(Context paramContext)
  {
    LayoutInflater.from(paramContext).inflate(efj.TM, this, true);
    this.a = ((AvatarView)findViewById(da.A));
    this.b = ((TextView)findViewById(da.B));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.poll.views.PollOptionVoterListItemView
 * JD-Core Version:    0.7.0.1
 */