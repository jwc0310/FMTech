package com.google.android.libraries.social.timingbreakdown.ui;

import aau;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import bp;
import bu;
import bv;
import bw;
import efj;
import git;
import gjb;
import gjp;
import gzj;
import ltu;
import ltw;
import lzw;
import mbb;
import mbp;
import tp;
import uo;
import uq;

public final class TimingBreakdownActivity
  extends mbp
{
  public TimingBreakdownActivity()
  {
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    new gjp(this, this.n).a(this.m);
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(aau.Dn);
    e().a().c(true);
  }
  
  public final boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(efj.Zk, paramMenu);
    return true;
  }
  
  public final boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getItemId();
    if ((i == efj.Zb) || (i == efj.Zc))
    {
      TimingBreakdownFragment localTimingBreakdownFragment = (TimingBreakdownFragment)this.b.a.d.a(efj.Zf);
      int j = paramMenuItem.getItemId();
      if (j == efj.Zb) {
        localTimingBreakdownFragment.b.b(new ltw(localTimingBreakdownFragment.bn, localTimingBreakdownFragment.a.c()));
      }
      while (j != efj.Zc) {
        return true;
      }
      Intent localIntent = new Intent("android.intent.action.SENDTO");
      localIntent.setAction("android.intent.action.SEND");
      String str1 = String.valueOf(localTimingBreakdownFragment.a.f().b("account_name"));
      if (str1.length() != 0) {}
      for (String str2 = "Timing Breakdown Metrics for :".concat(str1);; str2 = new String("Timing Breakdown Metrics for :"))
      {
        localIntent.putExtra("android.intent.extra.SUBJECT", str2);
        localIntent.putExtra("android.intent.extra.TEXT", localTimingBreakdownFragment.c.b());
        localIntent.setType("text/plain");
        localTimingBreakdownFragment.a(localIntent);
        break;
      }
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.timingbreakdown.ui.TimingBreakdownActivity
 * JD-Core Version:    0.7.0.1
 */