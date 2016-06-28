package com.google.android.libraries.social.collexions.impl.share;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import ehr;
import git;
import gjp;
import gxj;
import gxl;
import gxt;
import gzi;
import gzj;
import haa;
import hae;
import hlm;
import java.util.ArrayList;
import jyj;
import kvj;
import mbb;
import mcc;
import pjn;

public final class RemovePostFromCollexionActivity
  extends mcc
  implements gzi
{
  private gzj d;
  private final git e = new gjp(this, this.k).a(this.j);
  private String f;
  
  public RemovePostFromCollexionActivity()
  {
    new jyj(this, this.k);
    new gxj(this.k);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.d = ((gzj)this.j.a(gzj.class));
    this.d.a.add(this);
    gxt localgxt = pjn.T;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = this.f;
    new gxl(new kvj(localgxt, arrayOfString)).a(this.j);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ("moveposttoclx".equals(paramString))
    {
      if (!hae.a(paramhae)) {
        break label37;
      }
      Toast.makeText(this, ehr.bK, 1).show();
      setResult(0);
    }
    for (;;)
    {
      finish();
      return;
      label37:
      Toast.makeText(this, getString(ehr.bJ), 1).show();
      setResult(-1);
    }
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle = getIntent().getExtras();
    if (localBundle != null)
    {
      this.f = localBundle.getString("clx_activity_id");
      String str = localBundle.getString("fromCollexionId");
      hlm localhlm = new hlm(this.e.c(), this.f, str, null);
      this.d.c(localhlm);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.collexions.impl.share.RemovePostFromCollexionActivity
 * JD-Core Version:    0.7.0.1
 */