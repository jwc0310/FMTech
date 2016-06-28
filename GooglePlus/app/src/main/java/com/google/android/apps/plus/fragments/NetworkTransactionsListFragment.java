package com.google.android.apps.plus.fragments;

import aau;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;
import bzq;
import com.google.android.apps.plus.content.EsProvider;
import cv;
import cw;
import ddg;
import ddi;
import efj;
import fu;
import git;
import gya;
import hqj;
import mbb;
import ra;

public class NetworkTransactionsListFragment
  extends bzq<ListView, ddg>
  implements cw<Cursor>
{
  public git Z;
  public ProgressBar aa;
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle, efj.uq);
    this.b = new ddg(this.bn, null, this.Z.c());
    ((ListView)this.a).setAdapter(this.b);
    a(localView, aau.lD);
    a(localView);
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    if (!this.Z.e()) {
      return null;
    }
    Uri localUri = EsProvider.a(EsProvider.h(this.bn), this.Z.c());
    return new hqj(f(), localUri, ddi.a, null, null, "time DESC");
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    d(true);
    k().a(0, null, this);
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.Z = ((git)this.bo.a(git.class));
  }
  
  public final gya r_()
  {
    return gya.n;
  }
  
  public final String v()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Cursor localCursor = ((ddg)this.b).c;
    if (localCursor != null)
    {
      localCursor.moveToLast();
      while (localCursor.moveToPrevious())
      {
        localStringBuilder.append(efj.a(localCursor));
        localStringBuilder.append('\n');
        localStringBuilder.append(localCursor.getString(1));
        localStringBuilder.append('\n');
        localStringBuilder.append(efj.b(this.bn, localCursor));
        localStringBuilder.append('\n');
        localStringBuilder.append(efj.a(this.bn, localCursor));
        localStringBuilder.append('\n');
        localStringBuilder.append("**************************\n");
      }
    }
    localStringBuilder.append("Could not load network transaction data.");
    return localStringBuilder.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.fragments.NetworkTransactionsListFragment
 * JD-Core Version:    0.7.0.1
 */