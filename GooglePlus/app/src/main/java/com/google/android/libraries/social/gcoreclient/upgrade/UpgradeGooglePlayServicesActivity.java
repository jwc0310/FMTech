package com.google.android.libraries.social.gcoreclient.upgrade;

import android.os.Bundle;
import bj;
import bp;
import bu;
import bv;
import bw;
import bz;
import frz;
import icj;
import mbb;
import mcc;

public final class UpgradeGooglePlayServicesActivity
  extends mcc
{
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    int i = ((frz)this.j.a(frz.class)).a(this);
    if (i == 0) {
      finish();
    }
    bz localbz;
    do
    {
      return;
      localbz = this.b.a.d;
    } while (localbz.a("errorDialog") != null);
    icj localicj = new icj();
    Bundle localBundle = new Bundle();
    localBundle.putInt("errorCode", i);
    localicj.f(localBundle);
    localicj.a(localbz, "errorDialog");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.gcoreclient.upgrade.UpgradeGooglePlayServicesActivity
 * JD-Core Version:    0.7.0.1
 */