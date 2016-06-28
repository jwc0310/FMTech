package com.google.android.apps.photos.phone;

import aau;
import aaw;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import atj;
import atk;
import atl;
import bgp;
import efj;
import gis;
import git;
import giz;
import gjb;
import gjp;
import gxv;
import gya;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jyj;
import mbb;
import mcc;

public class SendContentActivity
  extends mcc
  implements DialogInterface.OnCancelListener, DialogInterface.OnClickListener, gxv
{
  private final git d;
  private Spinner e;
  
  public SendContentActivity()
  {
    new jyj(this, this.k);
    gjp localgjp = new gjp(this, this.k);
    this.j.a(git.class, localgjp);
    localgjp.b = false;
    this.d = localgjp;
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    mbb localmbb = this.j;
    localmbb.a(gxv.class, this);
    localmbb.a("com.google.android.libraries.social.appid", Integer.valueOf(2));
  }
  
  public final void b(Bundle paramBundle) {}
  
  public void onBackPressed()
  {
    finish();
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    finish();
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      finish();
      return;
      ArrayList localArrayList;
      try
      {
        Intent localIntent = getIntent();
        if (!localIntent.hasExtra("android.intent.extra.STREAM")) {
          continue;
        }
        localArrayList = new ArrayList();
        if ("android.intent.action.SEND_MULTIPLE".equals(localIntent.getAction()))
        {
          Iterator localIterator = localIntent.getParcelableArrayListExtra("android.intent.extra.STREAM").iterator();
          while (localIterator.hasNext())
          {
            Parcelable localParcelable2 = (Parcelable)localIterator.next();
            if ((localParcelable2 instanceof Uri)) {
              localArrayList.add((Uri)localParcelable2);
            }
          }
        }
        localParcelable1 = localIntent.getExtras().getParcelable("android.intent.extra.STREAM");
      }
      finally
      {
        finish();
      }
      Parcelable localParcelable1;
      if ((localParcelable1 instanceof Uri)) {
        localArrayList.add((Uri)localParcelable1);
      }
      if (localArrayList.size() > 0)
      {
        String str = (String)this.e.getSelectedItem();
        new atl(this, ((giz)this.j.a(giz.class)).a(str), localArrayList).execute(new Context[] { this });
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    View localView = ((LayoutInflater)getSystemService("layout_inflater")).inflate(efj.wo, null);
    giz localgiz = (giz)this.j.a(giz.class);
    List localList = localgiz.a(new String[] { "logged_in" });
    Collections.sort(localList, new gis(localgiz));
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    String[] arrayOfString;
    int j;
    int k;
    int m;
    if (localList.size() > 0)
    {
      arrayOfString = new String[localList.size()];
      j = 0;
      k = -1;
      m = this.d.c();
      if (m == -1) {
        m = bgp.b(this);
      }
      if (m != -1) {
        break label513;
      }
    }
    label513:
    for (int n = bgp.a(this);; n = m)
    {
      if (n != -1) {}
      for (String str1 = ((giz)this.j.a(giz.class)).a(n).b("account_name");; str1 = null)
      {
        Iterator localIterator = localList.iterator();
        if (localIterator.hasNext())
        {
          String str2 = localgiz.a(((Integer)localIterator.next()).intValue()).b("account_name");
          arrayOfString[j] = str2;
          if ((k != -1) || (!TextUtils.equals(str2, str1))) {
            break label500;
          }
        }
        label500:
        for (int i1 = j;; i1 = k)
        {
          j++;
          k = i1;
          break;
          ((TextView)localView.findViewById(aaw.er)).setText(getString(aau.bA).toUpperCase());
          ArrayAdapter localArrayAdapter = new ArrayAdapter(this, efj.sr, arrayOfString);
          this.e = ((Spinner)localView.findViewById(aaw.kf));
          this.e.setAdapter(localArrayAdapter);
          if (k != -1) {
            this.e.setSelection(k);
          }
          localView.findViewById(16908292).setVisibility(8);
          localView.findViewById(16908290).setVisibility(0);
          localBuilder.setPositiveButton(aau.bC, this);
          localBuilder.setNegativeButton(aau.cM, new atj(this));
          for (;;)
          {
            int i = aau.bB;
            Object[] arrayOfObject = new Object[1];
            arrayOfObject[0] = getString(aau.oL);
            localBuilder.setTitle(getString(i, arrayOfObject));
            localBuilder.setIcon(efj.wY);
            localBuilder.setView(localView);
            localBuilder.setOnCancelListener(this);
            localBuilder.setCancelable(true);
            localBuilder.create().show();
            return;
            localView.findViewById(16908292).setVisibility(0);
            localView.findViewById(16908290).setVisibility(8);
            localBuilder.setPositiveButton(aau.mf, new atk(this));
          }
        }
      }
    }
  }
  
  public final gya r_()
  {
    return gya.g;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photos.phone.SendContentActivity
 * JD-Core Version:    0.7.0.1
 */