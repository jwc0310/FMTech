package com.google.android.apps.plus.phone;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import efj;
import giu;
import giv;
import ikt;
import ilf;
import ilm;
import java.util.List;
import mcc;

public class InviteContactSpringboardActivity
  extends mcc
  implements giv
{
  private final ikt d;
  
  public InviteContactSpringboardActivity()
  {
    ikt localikt = new ikt(this, this.k);
    localikt.g.add(this);
    this.d = ((ikt)localikt);
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    if (paramInt2 != -1)
    {
      Intent localIntent = new Intent(getIntent());
      localIntent.setComponent(new ComponentName(this, InviteContactActivity.class));
      localIntent.addFlags(41943040);
      ikt localikt = this.d;
      efj.k();
      localIntent.putExtra("account_id", localikt.e);
      startActivity(localIntent);
    }
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle == null)
    {
      ikt localikt = this.d;
      ilf localilf = new ilf();
      localilf.s = ilm.class;
      localilf.t = null;
      localikt.a(localilf);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.InviteContactSpringboardActivity
 * JD-Core Version:    0.7.0.1
 */