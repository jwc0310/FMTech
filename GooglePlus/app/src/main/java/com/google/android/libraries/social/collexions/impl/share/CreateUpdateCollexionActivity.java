package com.google.android.libraries.social.collexions.impl.share;

import aau;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import bp;
import bu;
import bv;
import bw;
import bz;
import cl;
import efj;
import gjp;
import gpm;
import hpb;
import ill;
import ine;
import java.util.List;
import jyj;
import mbp;

public final class CreateUpdateCollexionActivity
  extends mbp
{
  public CreateUpdateCollexionActivity()
  {
    new jyj(this, this.n);
    new gjp(this, this.n).a(this.m);
    new gpm(this, this.n, efj.Ka).a(this.m);
  }
  
  public static Intent a(Context paramContext, Bundle paramBundle, int paramInt)
  {
    Intent localIntent = new Intent(paramContext, CreateUpdateCollexionActivity.class);
    localIntent.putExtra("allowedCollexionVisibility", paramBundle);
    localIntent.putExtra("account_id", paramInt);
    return localIntent;
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(aau.zx);
    Bundle localBundle1 = getIntent().getExtras();
    ill localill = new ill(this, localBundle1.getInt("account_id"));
    localill.a.add(ine.class);
    if (!localill.a())
    {
      startActivity(localill.b());
      finish();
    }
    String str1;
    String str2;
    String str3;
    Bundle localBundle2;
    boolean bool;
    int i;
    bz localbz;
    do
    {
      return;
      str1 = localBundle1.getString("clx_id");
      str2 = localBundle1.getString("clx_name");
      str3 = localBundle1.getString("clx_tagline");
      localBundle2 = localBundle1.getBundle("allowedCollexionVisibility");
      bool = localBundle1.getBoolean("clx_autofollow_state");
      i = localBundle1.getInt("clx_visibility_type", 0);
      localbz = this.b.a.d;
    } while ((hpb)localbz.a(efj.JF) != null);
    hpb localhpb = hpb.a(str1, str2, str3, localBundle2, bool, i);
    localbz.a().a(efj.JF, localhpb).b();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.collexions.impl.share.CreateUpdateCollexionActivity
 * JD-Core Version:    0.7.0.1
 */