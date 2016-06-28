package com.google.android.libraries.social.poll.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import bp;
import bu;
import bv;
import efj;
import ehr;
import eyg;
import gjp;
import java.text.NumberFormat;
import java.util.ArrayList;
import jvm;
import jvo;
import lvf;
import lzw;
import mbb;
import mbp;
import tp;
import tr;
import ts;
import uo;
import uq;

public final class PollOptionVoterListPagerActivity
  extends mbp
  implements ts
{
  public static NumberFormat d;
  public static NumberFormat e;
  private static boolean g;
  private int f;
  private ViewPager h;
  
  public PollOptionVoterListPagerActivity()
  {
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    new gjp(this, this.n).a(this.m);
  }
  
  public final void a(tr paramtr)
  {
    this.h.b(paramtr.a());
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    requestWindowFeature(8);
    super.onCreate(paramBundle);
    Bundle localBundle = getIntent().getExtras();
    if (localBundle == null) {
      return;
    }
    boolean bool1 = efj.L(this);
    Window localWindow;
    int m;
    int n;
    int i1;
    if (bool1)
    {
      localWindow = getWindow();
      localWindow.setFlags(2, 2);
      WindowManager.LayoutParams localLayoutParams = localWindow.getAttributes();
      localLayoutParams.flags = (0x400 | localLayoutParams.flags);
      localLayoutParams.dimAmount = 0.5F;
      localWindow.setAttributes(localLayoutParams);
      m = localBundle.getInt("card_width");
      if (this.f == 0)
      {
        this.f = efj.K(this).heightPixels;
        n = efj.y(this);
        i1 = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (i1 <= 0) {
          break label457;
        }
      }
    }
    label410:
    label457:
    for (int i2 = getResources().getDimensionPixelSize(i1);; i2 = 0)
    {
      this.f = (this.f - (n << 1) - i2);
      localWindow.setLayout(m, this.f);
      if (!g)
      {
        Resources localResources = getResources();
        d = NumberFormat.getIntegerInstance(localResources.getConfiguration().locale);
        e = NumberFormat.getPercentInstance(localResources.getConfiguration().locale);
        g = true;
      }
      setContentView(efj.Tr);
      ArrayList localArrayList = localBundle.getParcelableArrayList("poll_option_voter_models");
      jvo localjvo = new jvo(this, this.b.a.d, localArrayList);
      tp localtp = e().a();
      localtp.b(eyg.aM);
      boolean bool2;
      if (!bool1)
      {
        bool2 = true;
        localtp.c(bool2);
        if (bool1) {
          break label410;
        }
      }
      for (boolean bool3 = true;; bool3 = false)
      {
        localtp.b(bool3);
        this.h = ((ViewPager)findViewById(ehr.dt));
        this.h.a(true, new lvf());
        this.h.a(localjvo);
        this.h.o = new jvm(this, localtp);
        int i = localjvo.b();
        for (int j = 0; j < i; j++) {
          localtp.a(localtp.b().a(localjvo.b(j)).a(this));
        }
        bool2 = false;
        break;
      }
      localtp.d(2);
      int k = localBundle.getInt("poll_option_voters_count");
      if (localBundle.getLong("poll_number_of_votes") == k) {
        break;
      }
      findViewById(ehr.ds).setVisibility(0);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.poll.impl.PollOptionVoterListPagerActivity
 * JD-Core Version:    0.7.0.1
 */