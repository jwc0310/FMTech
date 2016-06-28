package com.google.android.apps.plus.views;

import aaw;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import dxr;
import dxs;
import efj;
import hfa;
import loh;

public class OneProfileVideosChannelView
  extends dxr
  implements View.OnClickListener
{
  public TextView b;
  public String c;
  
  public OneProfileVideosChannelView(Context paramContext)
  {
    super(paramContext);
  }
  
  public OneProfileVideosChannelView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public OneProfileVideosChannelView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void onClick(View paramView)
  {
    if ((this.a != null) && (this.c != null)) {
      this.a.i(this.c);
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.b = ((TextView)findViewById(aaw.lK));
    if (new hfa(getContext(), loh.a).b()) {}
    for (int i = efj.ox;; i = efj.ow)
    {
      setBackgroundResource(i);
      setPadding(0, 0, 0, 0);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.views.OneProfileVideosChannelView
 * JD-Core Version:    0.7.0.1
 */