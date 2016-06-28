package com.google.android.libraries.social.login;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import efj;
import giu;
import giv;
import ikt;
import ila;
import ilf;
import mbb;
import mcc;

public final class LoginActivity
  extends mcc
  implements giv
{
  private ila d;
  private boolean e;
  private ikt f = (ikt)new ikt(this, this.k).a(this);
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.d = ((ila)this.j.b(ila.class));
  }
  
  @TargetApi(16)
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    Intent localIntent1;
    if (paramInt2 != -1)
    {
      localIntent1 = (Intent)getIntent().getParcelableExtra("redirect_intent");
      Bundle localBundle = (Bundle)getIntent().getParcelableExtra("redirect_intent_options");
      if (localIntent1 != null)
      {
        ikt localikt2 = this.f;
        efj.k();
        localIntent1.putExtra("account_id", localikt2.e);
        localIntent1.addFlags(41943040);
        if (Build.VERSION.SDK_INT >= 16) {
          startActivity(localIntent1, localBundle);
        }
      }
    }
    for (;;)
    {
      finish();
      return;
      startActivity(localIntent1);
      continue;
      Intent localIntent2 = new Intent();
      ikt localikt1 = this.f;
      efj.k();
      localIntent2.putExtra("account_id", localikt1.e);
      setResult(-1, localIntent2);
      continue;
      setResult(0);
    }
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle == null)
    {
      ilf localilf = (ilf)getIntent().getParcelableExtra("login_request");
      this.f.a(localilf);
      return;
    }
    this.e = paramBundle.getBoolean("impression_logged", false);
  }
  
  protected final void onResume()
  {
    super.onResume();
    if ((!this.e) && (this.d != null))
    {
      this.d.a(this);
      this.e = true;
    }
  }
  
  protected final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("impression_logged", this.e);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.login.LoginActivity
 * JD-Core Version:    0.7.0.1
 */