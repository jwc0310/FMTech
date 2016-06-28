package com.google.android.apps.plus.phone;

import aaw;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import efj;

public class StreamCastOneUpActivity
  extends HostStreamOneUpActivity
{
  public final int g()
  {
    return efj.ww;
  }
  
  protected void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    View localView = findViewById(aaw.kw);
    localView.setClickable(false);
    localView.setBackgroundColor(getResources().getColor(efj.ki));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.StreamCastOneUpActivity
 * JD-Core Version:    0.7.0.1
 */