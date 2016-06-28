package com.google.android.libraries.social.timingbreakdown.ui;

import aau;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import cv;
import cw;
import efj;
import fu;
import git;
import gzi;
import gzj;
import haa;
import hae;
import java.util.ArrayList;
import ltu;
import ltv;
import mbb;
import mca;

public final class TimingBreakdownFragment
  extends mca
  implements cw<Cursor>, gzi
{
  git a;
  gzj b;
  ltu c;
  private ListView d;
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(aau.Do, paramViewGroup, false);
    this.d = ((ListView)localView.findViewById(efj.Zg));
    this.d.setAdapter(this.c);
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    return new ltv(this.bn, this.a.c());
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.c = new ltu(this.bn);
  }
  
  public final void a(fu<Cursor> paramfu)
  {
    this.c.a(null);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if ("ResetTimingBreakdown".equals(paramString))
    {
      this.c.a(null);
      this.c.notifyDataSetChanged();
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((git)this.bo.a(git.class));
    this.b = ((gzj)this.bo.a(gzj.class));
  }
  
  public final void m()
  {
    super.m();
    this.b.a.add(this);
    k().a(0, null, this);
  }
  
  public final void n()
  {
    super.n();
    this.b.a.remove(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.timingbreakdown.ui.TimingBreakdownFragment
 * JD-Core Version:    0.7.0.1
 */