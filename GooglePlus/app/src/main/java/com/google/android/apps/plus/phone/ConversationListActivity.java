package com.google.android.apps.plus.phone;

import android.app.Activity;
import android.os.Bundle;
import bgp;
import efj;
import gxw;
import gxx;
import gxz;
import mbb;

public class ConversationListActivity
  extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    startActivity(efj.d(this));
    int i = bgp.b(this);
    gxx localgxx = (gxx)mbb.a(this, gxx.class);
    gxw localgxw = new gxw(this, i);
    localgxw.c = gxz.dL;
    localgxx.a(localgxw);
    finish();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.ConversationListActivity
 * JD-Core Version:    0.7.0.1
 */