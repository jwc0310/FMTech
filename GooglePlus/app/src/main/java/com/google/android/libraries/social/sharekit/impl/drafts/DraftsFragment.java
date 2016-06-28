package com.google.android.libraries.social.sharekit.impl.drafts;

import aau;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import bp;
import cv;
import cw;
import efj;
import gzj;
import knf;
import knk;
import mbb;
import mbf;
import mca;
import su;
import sv;

public final class DraftsFragment
  extends mca
{
  private static final String[] ab = { "draft_message_snippet", "draft_last_update_timestamp", "draft_thumbnail" };
  private static final int[] ac;
  public int Z;
  public gzj a;
  public int aa;
  cw<Cursor> b = new knk(this);
  public su c;
  public int d;
  
  static
  {
    int[] arrayOfInt = new int[3];
    arrayOfInt[0] = aau.BT;
    arrayOfInt[1] = aau.BW;
    arrayOfInt[2] = aau.BR;
    ac = arrayOfInt;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.Vb, paramViewGroup, false);
    ListView localListView = (ListView)localView.findViewById(aau.BU);
    localListView.setEmptyView(localView.findViewById(aau.BV));
    this.c = new knf(this, f(), efj.UZ, null, ab, ac);
    this.c.f = new sv(this);
    k().a(1000, null, this.b);
    localListView.setAdapter(this.c);
    return localView;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.d = f().getIntent().getIntExtra("account_id", -1);
    this.a = ((gzj)this.bo.a(gzj.class));
    this.aa = this.bn.getResources().getDimensionPixelSize(efj.UX);
    this.Z = this.bn.getResources().getDimensionPixelSize(efj.UY);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.sharekit.impl.drafts.DraftsFragment
 * JD-Core Version:    0.7.0.1
 */