package com.google.android.libraries.social.oneprofile.about;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import aw;
import com.google.android.libraries.social.media.ui.MediaView;
import eyg;
import hfa;
import loh;

public final class OneProfileReviewsSummaryView
  extends LinearLayout
{
  public TextView a;
  public MediaView b;
  
  public OneProfileReviewsSummaryView(Context paramContext)
  {
    super(paramContext);
  }
  
  public OneProfileReviewsSummaryView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public OneProfileReviewsSummaryView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((TextView)findViewById(aw.dc));
    this.b = ((MediaView)findViewById(aw.cs));
    if (new hfa(getContext(), loh.a).b()) {}
    for (int i = eyg.aj;; i = eyg.ai)
    {
      setBackgroundResource(i);
      setPadding(0, 0, 0, 0);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.oneprofile.about.OneProfileReviewsSummaryView
 * JD-Core Version:    0.7.0.1
 */