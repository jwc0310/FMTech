package com.google.android.libraries.stitch.incompat;

import android.content.Intent;
import android.os.Bundle;
import bj;
import bp;
import bu;
import bv;
import java.util.HashMap;
import mbj;
import mct;

public final class PlatformBugActivity
  extends bp
{
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (!getIntent().hasExtra("extra_error_type")) {
      throw new IllegalStateException("This needs a type to tell the user about!");
    }
    mbj localmbj = new mbj(this, mct.class);
    String str = getIntent().getStringExtra("extra_error_type");
    ((mct)localmbj.a.get(str)).b().a(this.b.a.d, "dialog");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.stitch.incompat.PlatformBugActivity
 * JD-Core Version:    0.7.0.1
 */