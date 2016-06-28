package com.google.android.apps.plus.phone;

import aau;
import aaw;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import bp;
import bu;
import bv;
import bw;
import cim;
import com.google.android.apps.plus.fragments.NetworkStatisticsFragment;
import cv;
import efj;
import git;
import gjp;
import gxv;
import gya;
import gzj;
import jyj;
import lzw;
import mbb;
import mbp;
import tp;
import uo;
import uq;

public class NetworkStatisticsActivity
  extends mbp
  implements gxv
{
  public NetworkStatisticsActivity()
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
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.uI);
    e().a().c(true);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(efj.wU, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getItemId();
    if ((i == aaw.bw) || (i == aaw.ci))
    {
      NetworkStatisticsFragment localNetworkStatisticsFragment = (NetworkStatisticsFragment)this.b.a.d.a(aaw.fH);
      int j = paramMenuItem.getItemId();
      if (j == aaw.ci)
      {
        localNetworkStatisticsFragment.c = localNetworkStatisticsFragment.b;
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(localNetworkStatisticsFragment.f());
        localBuilder.setTitle(aau.kI);
        localBuilder.setSingleChoiceItems(efj.iP, localNetworkStatisticsFragment.b, localNetworkStatisticsFragment);
        localBuilder.setPositiveButton(aau.mf, localNetworkStatisticsFragment);
        localBuilder.setNegativeButton(aau.cM, localNetworkStatisticsFragment);
        localBuilder.setCancelable(true);
        localBuilder.show();
      }
      for (;;)
      {
        return true;
        if (j == aaw.bw)
        {
          gzj.a(localNetworkStatisticsFragment.bn, new cim(localNetworkStatisticsFragment.bn, localNetworkStatisticsFragment.a.c()));
          localNetworkStatisticsFragment.k().b(0, null, localNetworkStatisticsFragment);
        }
      }
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  public final gya r_()
  {
    return gya.n;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.NetworkStatisticsActivity
 * JD-Core Version:    0.7.0.1
 */