package com.google.android.libraries.social.socialcast.impl;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.libraries.social.media.ui.MediaView;
import gwz;
import kwd;

public final class SocialCastMediaView
  extends MediaView
{
  public kwd a;
  public GestureDetector b;
  public boolean c;
  
  public SocialCastMediaView(Context paramContext)
  {
    super(paramContext);
  }
  
  public SocialCastMediaView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public SocialCastMediaView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.c = false;
    GestureDetector localGestureDetector = this.b;
    boolean bool = false;
    if (localGestureDetector != null)
    {
      bool = this.b.onTouchEvent(paramMotionEvent);
      if (this.c) {
        performClick();
      }
    }
    return bool;
  }
  
  public final boolean performClick()
  {
    String str = this.a.i();
    gwz.a(this, 4);
    Intent localIntent = new Intent("com.google.android.apps.plus.phone.socialcast.ACTIVITY_ACTION");
    localIntent.putExtra("account_id", this.a.m());
    localIntent.putExtra("activity_id", str);
    localIntent.putExtra("refresh", false);
    getContext().startActivity(localIntent);
    return super.performClick();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.socialcast.impl.SocialCastMediaView
 * JD-Core Version:    0.7.0.1
 */