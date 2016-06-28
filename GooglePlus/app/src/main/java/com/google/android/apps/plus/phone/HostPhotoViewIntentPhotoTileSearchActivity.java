package com.google.android.apps.plus.phone;

import android.content.Intent;
import android.os.Bundle;
import anz;
import bk;
import cey;
import cij;
import cpb;
import dbl;
import git;
import mbb;

public class HostPhotoViewIntentPhotoTileSearchActivity
  extends dbl
{
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.m.a(cij.class, new cij(this, this.n, new cpb()));
    anz localanz = (anz)this.m.a(anz.class);
    localanz.b = "PhotoSearch";
    localanz.c = 7;
  }
  
  protected final bk g()
  {
    cey localcey = new cey();
    int i = getIntent().getIntExtra("filter", -1);
    Bundle localBundle = new Bundle();
    if (this.d.e()) {
      localBundle.putInt("account_id", this.d.c());
    }
    localBundle.putInt("filter", i);
    localBundle.putBoolean("external", true);
    localBundle.putString("query", "#videos");
    localBundle.putBoolean("hide_search_view", true);
    localBundle.putBoolean("search_local_videos", true);
    localcey.f(localBundle);
    return localcey;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.HostPhotoViewIntentPhotoTileSearchActivity
 * JD-Core Version:    0.7.0.1
 */