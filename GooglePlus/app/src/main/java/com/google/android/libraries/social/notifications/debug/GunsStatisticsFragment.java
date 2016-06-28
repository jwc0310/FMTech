package com.google.android.libraries.social.notifications.debug;

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
import jat;
import jbl;
import mbb;
import mca;

public final class GunsStatisticsFragment
  extends mca
  implements cw<Cursor>
{
  private git a;
  private ListView b;
  private jat c;
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.Qx, paramViewGroup, false);
    this.b = ((ListView)localView.findViewById(efj.Qq));
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    int i = this.a.c();
    if (i != -1) {
      return new jbl(this.bn, i, paramInt);
    }
    return null;
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((git)this.bo.a(git.class));
  }
  
  public final void d(Bundle paramBundle)
  {
    super.d(paramBundle);
    this.c = new jat(this.bn);
    this.b.setAdapter(this.c);
    k().a(1, null, this);
    k().a(2, null, this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.notifications.debug.GunsStatisticsFragment
 * JD-Core Version:    0.7.0.1
 */