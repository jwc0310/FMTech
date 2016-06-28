package com.google.android.apps.plus.phone;

import aaw;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ProgressBar;
import bp;
import bu;
import bv;
import bw;
import com.google.android.apps.plus.fragments.NetworkTransactionsListFragment;
import com.google.android.apps.plus.service.EsService;
import dmm;
import efj;
import git;
import gjb;
import gjp;
import gxv;
import gya;
import jyj;
import lzw;
import mbb;
import mbp;
import tp;
import uo;
import uq;

public class NetworkTransactionsActivity
  extends mbp
  implements gxv
{
  public NetworkTransactionsActivity()
  {
    new jyj(this, this.n);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.m.a(gxv.class, this);
  }
  
  public final void b(Bundle paramBundle) {}
  
  public void onAttachedToWindow()
  {
    ProgressBar localProgressBar = (ProgressBar)findViewById(aaw.hX);
    NetworkTransactionsListFragment localNetworkTransactionsListFragment = (NetworkTransactionsListFragment)this.b.a.d.a(aaw.fI);
    localNetworkTransactionsListFragment.aa = localProgressBar;
    localNetworkTransactionsListFragment.a(localNetworkTransactionsListFragment.aa);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.uL);
    e().a().c(true);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(efj.wV, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getItemId();
    if (i == aaw.bw)
    {
      NetworkTransactionsListFragment localNetworkTransactionsListFragment2 = (NetworkTransactionsListFragment)this.b.a.d.a(aaw.fI);
      bp localbp = localNetworkTransactionsListFragment2.f();
      int j = localNetworkTransactionsListFragment2.Z.c();
      Intent localIntent2 = EsService.e.a(localbp, EsService.class);
      localIntent2.putExtra("op", 2001);
      localIntent2.putExtra("account_id", j);
      EsService.a(localbp, localIntent2);
      return true;
    }
    NetworkTransactionsListFragment localNetworkTransactionsListFragment1;
    Intent localIntent1;
    String str1;
    if (i == aaw.jL)
    {
      localNetworkTransactionsListFragment1 = (NetworkTransactionsListFragment)this.b.a.d.a(aaw.fI);
      localIntent1 = new Intent("android.intent.action.SENDTO");
      localIntent1.setAction("android.intent.action.SEND");
      str1 = String.valueOf(localNetworkTransactionsListFragment1.Z.f().b("account_name"));
      if (str1.length() == 0) {
        break label223;
      }
    }
    label223:
    for (String str2 = "Debug Network stats for:".concat(str1);; str2 = new String("Debug Network stats for:"))
    {
      localIntent1.putExtra("android.intent.extra.SUBJECT", str2);
      localIntent1.putExtra("android.intent.extra.TEXT", localNetworkTransactionsListFragment1.v());
      localIntent1.setType("text/plain");
      localNetworkTransactionsListFragment1.a(localIntent1);
      return super.onOptionsItemSelected(paramMenuItem);
    }
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    return true;
  }
  
  public final gya r_()
  {
    return gya.n;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.NetworkTransactionsActivity
 * JD-Core Version:    0.7.0.1
 */