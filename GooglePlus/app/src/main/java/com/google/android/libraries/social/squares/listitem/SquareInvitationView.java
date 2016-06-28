package com.google.android.libraries.social.squares.listitem;

import aaw;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.social.media.ui.MediaView;
import efj;
import lec;

public final class SquareInvitationView
  extends RelativeLayout
  implements View.OnClickListener
{
  public lec a;
  public TextView b;
  public TextView c;
  public MediaView d;
  public Button e;
  public Button f;
  public String g;
  public String h;
  public int i;
  
  public SquareInvitationView(Context paramContext)
  {
    super(paramContext);
  }
  
  public SquareInvitationView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public SquareInvitationView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    CharSequence[] arrayOfCharSequence = new CharSequence[3];
    Context localContext = getContext();
    int j = aaw.qv;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.b.getText();
    arrayOfCharSequence[0] = localContext.getString(j, arrayOfObject);
    arrayOfCharSequence[1] = this.h;
    arrayOfCharSequence[2] = this.c.getText();
    efj.a(localStringBuilder, arrayOfCharSequence);
    setContentDescription(localStringBuilder.toString());
  }
  
  public final void onClick(View paramView)
  {
    if (this.a == null) {
      return;
    }
    if (paramView == this.e)
    {
      this.a.a(this.g, this.i);
      return;
    }
    if (paramView == this.f)
    {
      this.a.a(this.g);
      return;
    }
    this.a.a(this.g, null);
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.b = ((TextView)findViewById(efj.XT));
    this.c = ((TextView)findViewById(efj.XR));
    this.d = ((MediaView)findViewById(efj.XS));
    this.e = ((Button)findViewById(efj.XP));
    this.f = ((Button)findViewById(efj.XQ));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.squares.listitem.SquareInvitationView
 * JD-Core Version:    0.7.0.1
 */