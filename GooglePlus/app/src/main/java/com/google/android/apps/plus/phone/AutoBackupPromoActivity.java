package com.google.android.apps.plus.phone;

import android.os.Bundle;
import android.util.Log;
import bk;
import bp;
import bu;
import bv;
import bw;
import bww;
import cl;
import efj;
import giu;
import giv;
import ikt;
import ilf;
import java.util.List;
import mcc;

public class AutoBackupPromoActivity
  extends mcc
  implements giv
{
  private final ikt d;
  
  public AutoBackupPromoActivity()
  {
    ikt localikt = new ikt(this, this.k).a(this.j);
    localikt.g.add(this);
    this.d = ((ikt)localikt);
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    if (paramInt2 != -1)
    {
      ikt localikt = this.d;
      efj.k();
      int i = localikt.e;
      Bundle localBundle = new Bundle();
      localBundle.putInt("account_id", i);
      bww localbww = new bww();
      localbww.f(localBundle);
      cl localcl = this.b.a.d.a();
      localcl.b(16908290, localbww);
      localcl.b();
      return;
    }
    Log.e("AutoBackupPromo", "No account provided.");
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    if (paramBundle == null)
    {
      ikt localikt = this.d;
      ilf localilf = new ilf();
      localilf.e = "active-photos-account";
      localilf.f = true;
      localilf.g = true;
      localilf.h = true;
      localikt.a(localilf);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.AutoBackupPromoActivity
 * JD-Core Version:    0.7.0.1
 */