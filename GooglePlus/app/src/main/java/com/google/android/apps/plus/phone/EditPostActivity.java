package com.google.android.apps.plus.phone;

import aau;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import czn;
import efj;
import gya;
import tp;
import uo;
import uq;

public class EditPostActivity
  extends czn
{
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.tv);
    tp localtp = e().a();
    efj.a(localtp, false);
    localtp.c(true);
    localtp.b(aau.fz);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(efj.wS, paramMenu);
    return true;
  }
  
  public final gya r_()
  {
    return gya.l;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.EditPostActivity
 * JD-Core Version:    0.7.0.1
 */