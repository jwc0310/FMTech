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

public class EditCommentActivity
  extends czn
{
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.ts);
    tp localtp = e().a();
    efj.a(localtp, false);
    localtp.c(true);
    localtp.b(aau.fw);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(efj.wR, paramMenu);
    return true;
  }
  
  public final gya r_()
  {
    return gya.X;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.EditCommentActivity
 * JD-Core Version:    0.7.0.1
 */