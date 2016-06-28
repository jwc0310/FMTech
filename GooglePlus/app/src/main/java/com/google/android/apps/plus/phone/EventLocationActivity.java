package com.google.android.apps.plus.phone;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import bk;
import cad;
import com.google.android.apps.plus.fragments.EventLocationFragment;
import efj;
import git;
import gjp;
import gxv;
import gya;
import jyj;
import mbb;
import mbp;
import qas;
import qat;
import qdq;
import tp;
import uo;
import uq;

public class EventLocationActivity
  extends mbp
  implements cad, gxv
{
  private String d;
  
  public EventLocationActivity()
  {
    new jyj(this, this.n);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.m.a(gxv.class, this);
  }
  
  public final void a(bk parambk)
  {
    if ((parambk instanceof EventLocationFragment))
    {
      EventLocationFragment localEventLocationFragment = (EventLocationFragment)parambk;
      localEventLocationFragment.ac = this;
      if (this.d != null) {
        localEventLocationFragment.Z = this.d;
      }
    }
  }
  
  public final void a(qdq paramqdq)
  {
    Intent localIntent = new Intent();
    if (paramqdq != null) {
      localIntent.putExtra("location", qat.a(paramqdq));
    }
    setResult(-1, localIntent);
    finish();
  }
  
  public final void b(Bundle paramBundle) {}
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    byte[] arrayOfByte;
    if (paramBundle == null)
    {
      arrayOfByte = getIntent().getByteArrayExtra("location");
      if (arrayOfByte == null) {}
    }
    try
    {
      this.d = ((qdq)qat.b(new qdq(), arrayOfByte, 0, arrayOfByte.length)).b;
      setContentView(efj.tA);
      tp localtp = e().a();
      localtp.c(true);
      efj.a(localtp, false);
      return;
    }
    catch (qas localqas)
    {
      for (;;)
      {
        Log.e("EventLocationActivity", "Unable to parse Place from byte array.", localqas);
      }
    }
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 16908332)
    {
      onBackPressed();
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  public final gya r_()
  {
    return gya.V;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.EventLocationActivity
 * JD-Core Version:    0.7.0.1
 */