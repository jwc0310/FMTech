package com.google.android.apps.plus.fragments;

import aau;
import aaw;
import android.app.Activity;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import bj;
import bk;
import bnl;
import bw;
import bxs;
import bxt;
import com.google.android.apps.plus.content.EsProvider;
import coo;
import cv;
import cw;
import cwm;
import cwq;
import efj;
import fu;
import git;
import gzi;
import gzj;
import haa;
import hae;
import hgl;
import hqj;
import hwq;
import java.util.ArrayList;
import jhs;
import jia;
import jid;
import jie;
import jjt;
import jma;
import kqf;
import luu;
import lws;
import lwt;
import mbb;
import mbf;
import mca;
import ra;

public class CirclesMultipleSelectFragment
  extends mca
  implements AdapterView.OnItemClickListener, cw<Cursor>, cwq, gzi, jhs, luu, lwt
{
  public ArrayList<String> Z;
  public String a;
  public int aa;
  public boolean ab;
  public bxt ac;
  public git ad;
  public View ae;
  public View af;
  private final hwq ag = new hwq(this.bp);
  private boolean ah;
  private boolean ai;
  private bxs aj;
  private ArrayList<String> ak;
  private gzj al;
  private jia am;
  public String b;
  public ListView c;
  public ArrayList<String> d;
  
  public CirclesMultipleSelectFragment()
  {
    new jie(this.bp).c = this;
  }
  
  private final void a(String paramString)
  {
    this.d = new ArrayList();
    if (!TextUtils.isEmpty(paramString))
    {
      int j;
      for (int i = 0; i < paramString.length(); i = j + 1)
      {
        j = paramString.indexOf('|', i);
        if (j == -1) {
          j = paramString.length();
        }
        this.d.add(paramString.substring(i, j));
      }
    }
    if (this.Z == null) {
      this.Z = new ArrayList(this.d);
    }
    if (this.ac != null) {
      this.ac.aj_();
    }
  }
  
  private void w()
  {
    bj localbj = (bj)this.x.a("req_pending");
    if (localbj != null) {
      localbj.a(false);
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(this.bn);
    View localView1 = localLayoutInflater.inflate(efj.tc, null, false);
    this.c = ((ListView)localView1.findViewById(16908298));
    TextView localTextView = (TextView)localView1.findViewById(aaw.lK);
    localTextView.setOnClickListener(null);
    if (this.b != null) {
      localTextView.setText(this.b);
    }
    if (this.ab)
    {
      View localView2 = localLayoutInflater.inflate(efj.tb, paramViewGroup, false);
      int i = aau.eB;
      localView2.setContentDescription(g().getString(i));
      this.c.addFooterView(localView2);
    }
    this.c.setAdapter(this.aj);
    this.c.setOnItemClickListener(this);
    this.ae = localView1.findViewById(aaw.lN);
    this.af = localView1.findViewById(aaw.aJ);
    return localView1;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    if (!this.ad.e()) {
      return null;
    }
    int i = this.ad.c();
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      mbf localmbf = this.bn;
      Uri localUri = EsProvider.a(EsProvider.f(this.bn), i);
      String[] arrayOfString1 = { "name", "packed_circle_ids" };
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = this.a;
      return new hqj(localmbf, localUri, arrayOfString1, "person_id=?", arrayOfString2, null);
    }
    return new jma(this.bn, i, this.aa);
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.aj = new bxs(this, this.bn);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.al.a.add(this);
    if (paramBundle == null) {
      new kqf(107).b(this.bn);
    }
    for (;;)
    {
      if ((this.aa == 2) && (this.a != null)) {
        k().a(0, null, this);
      }
      k().a(1, null, this);
      if (this.am.d(f(), this.ad.c())) {
        this.am.a(this, this.ad.c(), "first_add", null);
      }
      return;
      this.Z = paramBundle.getStringArrayList("new_circles");
      this.ak = paramBundle.getStringArrayList("existing_circle_ids");
    }
  }
  
  public final void a(Bundle paramBundle, String paramString) {}
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (paramString.equals("AddCircleTask"))
    {
      if (jid.a()) {
        jid.a("CirclesMultiSelectFmt", "AddCircleTask completed.");
      }
      if (paramhae.b != 200)
      {
        i = 1;
        if (i == 0) {
          break label83;
        }
        if (jid.a()) {
          jid.a("CirclesMultiSelectFmt", "Add circle failed.");
        }
        w();
        Toast.makeText(f(), aau.uV, 0).show();
      }
    }
    label83:
    while (!paramString.equals("LoadCirclesTask"))
    {
      for (;;)
      {
        return;
        int i = 0;
      }
      if (jid.a()) {
        jid.a("CirclesMultiSelectFmt", "Starting loadCirclesTask.");
      }
      bnl localbnl = new bnl(this.bn, "LoadCirclesTask", this.ad.c());
      this.al.b(localbnl);
      return;
    }
    if (jid.a()) {
      jid.a("CirclesMultiSelectFmt", "LoadCirclesTask completed.");
    }
    if (jid.a()) {
      jid.a("CirclesMultiSelectFmt", "Add circle succeeded.");
    }
    w();
  }
  
  public final void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    int i = 1;
    if (TextUtils.isEmpty(paramString2)) {
      return;
    }
    String str = paramString2.trim();
    if (this.aj != null)
    {
      Cursor localCursor2 = this.aj.c;
      if ((localCursor2 != null) && (localCursor2.moveToFirst())) {
        if (!str.equalsIgnoreCase(localCursor2.getString(2))) {}
      }
      int i1;
      for (int n = i;; i1 = 0)
      {
        if (n == 0) {
          break label104;
        }
        Toast.makeText(this.bn, aau.uP, 0).show();
        return;
        if (localCursor2.moveToNext()) {
          break;
        }
      }
    }
    label104:
    int k = aau.lt;
    coo.a(null, g().getString(k), false, false).a(this.x, "req_pending");
    this.ak = new ArrayList();
    if (this.aj != null)
    {
      Cursor localCursor1 = this.aj.c;
      if ((localCursor1 != null) && (localCursor1.moveToFirst())) {
        do
        {
          this.ak.add(localCursor1.getString(i));
        } while (localCursor1.moveToNext());
      }
    }
    int m = this.ad.c();
    if (!paramBoolean) {}
    for (;;)
    {
      if (jid.a()) {
        jid.a("CirclesMultiSelectFmt", "Starting addCircleTask.");
      }
      jjt localjjt = new jjt(this.bn, m, str, null, i);
      this.al.b(localjjt);
      return;
      int j = 0;
    }
  }
  
  public final void a(lws paramlws, boolean paramBoolean)
  {
    String str = ((hgl)paramlws).a;
    if (paramBoolean) {
      if (!this.Z.contains(str)) {
        this.Z.add(str);
      }
    }
    for (;;)
    {
      if (this.ac != null) {
        this.ac.aj_();
      }
      return;
      this.Z.remove(str);
    }
  }
  
  public final void ab_()
  {
    k().b(1, null, this);
  }
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.al = ((gzj)this.bo.a(gzj.class));
    this.ad = ((git)this.bo.a(git.class));
    this.am = ((jia)this.bo.a(jia.class));
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putStringArrayList("new_circles", this.Z);
    paramBundle.putStringArrayList("existing_circle_ids", this.ak);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((this.ab) && (paramInt == -1 + paramAdapterView.getCount()))
    {
      cwm localcwm = new cwm();
      localcwm.n = this;
      localcwm.p = 0;
      localcwm.a(this.x, "new_circle_input");
      return;
    }
    ((hgl)paramView).toggle();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.fragments.CirclesMultipleSelectFragment
 * JD-Core Version:    0.7.0.1
 */