package com.google.android.apps.plus.fragments;

import aaw;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bzo;
import cin;
import com.google.android.apps.plus.content.EsProvider;
import com.google.android.apps.plus.views.BarGraphListView;
import cv;
import cw;
import efj;
import fu;
import git;
import gya;
import hqj;
import mbb;
import tp;
import tt;
import uo;
import uq;

public class NetworkStatisticsFragment
  extends bzo
  implements DialogInterface.OnClickListener, cw<Cursor>
{
  private static String[] Z;
  private static int[][] aa = { { 2, 3 }, { 2 }, { 3 }, { 4, 5 }, { 4 }, { 5 }, { 6 } };
  public git a;
  public int b = 0;
  public int c;
  private BarGraphListView d;
  
  static
  {
    String[] arrayOfString = new String[7];
    String str1 = String.valueOf(cin.a[2]);
    String str2 = String.valueOf(cin.a[3]);
    arrayOfString[0] = (3 + String.valueOf(str1).length() + String.valueOf(str2).length() + "(" + str1 + "+" + str2 + ")");
    arrayOfString[1] = cin.a[2];
    arrayOfString[2] = cin.a[3];
    String str3 = String.valueOf(cin.a[4]);
    String str4 = String.valueOf(cin.a[5]);
    arrayOfString[3] = (3 + String.valueOf(str3).length() + String.valueOf(str4).length() + "(" + str3 + "+" + str4 + ")");
    arrayOfString[4] = cin.a[4];
    arrayOfString[5] = cin.a[5];
    arrayOfString[6] = cin.a[6];
    Z = arrayOfString;
  }
  
  private void a(tt paramtt)
  {
    CharSequence[] arrayOfCharSequence = g().getTextArray(efj.iP);
    paramtt.e().a().a(arrayOfCharSequence[this.b]);
  }
  
  protected final boolean A()
  {
    return false;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.uJ, paramViewGroup, false);
    this.d = ((BarGraphListView)localView.findViewById(aaw.aC));
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    if (!this.a.e()) {
      return null;
    }
    switch (paramInt)
    {
    default: 
      return null;
    }
    Uri localUri = EsProvider.a(EsProvider.i(this.bn), this.a.c());
    return new hqj(f(), localUri, cin.a, null, null, String.valueOf(Z[this.b]).concat(" DESC"));
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if ((paramBundle != null) && (paramBundle.containsKey("view_type")))
    {
      this.b = paramBundle.getInt("view_type");
      this.c = this.b;
    }
    d(true);
    k().a(0, null, this);
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((git)this.bo.a(git.class));
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putInt("view_type", this.b);
  }
  
  public final void m()
  {
    super.m();
    a((tt)f());
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      this.c = paramInt;
      return;
    case -1: 
      if (this.c != this.b)
      {
        this.b = this.c;
        k().b(0, null, this);
        a((tt)f());
      }
      paramDialogInterface.dismiss();
      return;
    }
    paramDialogInterface.dismiss();
  }
  
  public final gya r_()
  {
    return gya.n;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.fragments.NetworkStatisticsFragment
 * JD-Core Version:    0.7.0.1
 */