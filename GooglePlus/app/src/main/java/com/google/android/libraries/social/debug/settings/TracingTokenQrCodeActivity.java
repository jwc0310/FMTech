package com.google.android.libraries.social.debug.settings;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import bp;
import bu;
import bv;
import hud;

public final class TracingTokenQrCodeActivity
  extends bp
{
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null) {
      return;
    }
    Uri localUri = getIntent().getData();
    if ((localUri == null) || (!"gplus".equals(localUri.getScheme())) || (!"apiaryTrace".equals(localUri.getLastPathSegment())))
    {
      finish();
      return;
    }
    new hud().a(this.b.a.d, "confirm");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.debug.settings.TracingTokenQrCodeActivity
 * JD-Core Version:    0.7.0.1
 */