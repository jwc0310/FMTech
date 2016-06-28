package com.google.android.libraries.social.ingest;

import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView.MultiChoiceModeListener;
import android.widget.Adapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import com.google.android.libraries.social.ingest.ui.DateTileView;
import com.google.android.libraries.social.ingest.ui.IngestGridView;
import dk;
import efj;
import igt;
import igu;
import igv;
import igw;
import igx;
import igy;
import igz;
import ihe;
import ihf;
import ihi;
import ihj;
import ihk;
import ihl;
import ihp;
import ihq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import tt;

@TargetApi(12)
public final class IngestActivity
  extends tt
  implements ihj, ihq
{
  public IngestService d;
  public boolean e = false;
  public IngestGridView f;
  public ihe g;
  public Handler h;
  public ActionMode i;
  public int j = 0;
  public ihf k;
  public boolean l = false;
  public MenuItem m;
  public igy n = new igy(this);
  public igz o = new igz();
  private ProgressDialog p;
  private View q;
  private TextView r;
  private ViewPager s;
  private MenuItem t;
  private AdapterView.OnItemClickListener u = new igt(this);
  private AbsListView.MultiChoiceModeListener v = new igu(this);
  private DataSetObserver w = new igv(this);
  private ServiceConnection x = new igw(this);
  
  private final void a(int paramInt)
  {
    if (this.q == null)
    {
      this.q = findViewById(efj.Nr);
      this.r = ((TextView)this.q.findViewById(efj.Ns));
    }
    this.r.setText(paramInt);
    this.q.setVisibility(0);
    b(false);
    this.f.setVisibility(8);
    c(false);
  }
  
  private final void b(boolean paramBoolean)
  {
    this.l = paramBoolean;
    int i3;
    label123:
    int i1;
    label134:
    ViewPager localViewPager1;
    int i2;
    if (paramBoolean)
    {
      if (this.k == null)
      {
        this.k = new ihf(this, this.n);
        ihf localihf2 = this.k;
        localihf2.b = this.g.a;
        localihf2.d();
      }
      this.s.a(this.k);
      ViewPager localViewPager2 = this.s;
      ihf localihf1 = this.k;
      i3 = this.f.getFirstVisiblePosition();
      if ((this.j <= i3) || (this.j > this.f.getLastVisiblePosition()))
      {
        localViewPager2.a(localihf1.a(i3), false);
        IngestGridView localIngestGridView = this.f;
        if (!paramBoolean) {
          break label233;
        }
        i1 = 4;
        localIngestGridView.setVisibility(i1);
        localViewPager1 = this.s;
        i2 = 0;
        if (!paramBoolean) {
          break label238;
        }
      }
    }
    for (;;)
    {
      localViewPager1.setVisibility(i2);
      if (this.m != null) {
        a(this.m, paramBoolean);
      }
      a(this.t, paramBoolean);
      return;
      i3 = this.j;
      break;
      if (this.k == null) {
        break label123;
      }
      this.f.setSelection(this.g.a(this.s.d));
      this.s.a(null);
      break label123;
      label233:
      i1 = 0;
      break label134;
      label238:
      i2 = 4;
    }
  }
  
  private final void c(boolean paramBoolean)
  {
    if (this.m != null) {
      this.m.setVisible(paramBoolean);
    }
    if (this.t != null) {
      this.t.setVisible(paramBoolean);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString)
  {
    this.o.a();
    this.o.d = paramInt2;
    this.o.c = paramInt1;
    this.o.b = getResources().getString(efj.NC);
    this.h.sendEmptyMessage(0);
    this.h.removeMessages(4);
    this.h.sendEmptyMessageDelayed(4, 3000L);
  }
  
  public final void a(MenuItem paramMenuItem, boolean paramBoolean)
  {
    if (paramMenuItem == null) {
      return;
    }
    if (!paramBoolean)
    {
      if (this.i == null) {}
      for (int i2 = efj.Ne;; i2 = efj.Nf)
      {
        paramMenuItem.setIcon(i2);
        paramMenuItem.setTitle(efj.NH);
        return;
      }
    }
    if (this.i == null) {}
    for (int i1 = efj.Nc;; i1 = efj.Nd)
    {
      paramMenuItem.setIcon(i1);
      paramMenuItem.setTitle(efj.NI);
      return;
    }
  }
  
  public final void a(ihk paramihk, int paramInt)
  {
    this.o.a();
    this.o.d = 0;
    igz localigz = this.o;
    Resources localResources = getResources();
    int i1 = efj.Ny;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    localigz.a = localResources.getQuantityString(i1, paramInt, arrayOfObject);
    this.h.sendEmptyMessage(0);
  }
  
  public final void a(Collection<ihk> paramCollection, int paramInt)
  {
    this.h.sendEmptyMessage(1);
    this.h.removeMessages(4);
  }
  
  public final void f()
  {
    ihe localihe1 = this.g;
    if ((localihe1.a != null) && (localihe1.a.b())) {}
    for (int i1 = 1; i1 == 0; i1 = 0)
    {
      a(efj.ND);
      return;
    }
    ihe localihe2 = this.g;
    if ((localihe2.a != null) && (localihe2.a.d())) {}
    for (int i2 = 1; (i2 != 0) && (this.g.getCount() == 0); i2 = 0)
    {
      a(efj.NA);
      return;
    }
    if (this.q != null)
    {
      this.q.setVisibility(8);
      b(false);
    }
    c(true);
  }
  
  public final void g()
  {
    this.o.a();
    this.o.d = 0;
    this.o.a = getResources().getString(efj.NG);
    this.h.sendEmptyMessage(0);
  }
  
  public final void h()
  {
    this.h.sendEmptyMessage(1);
    this.h.sendEmptyMessage(2);
  }
  
  public final void i()
  {
    this.h.sendEmptyMessage(1);
    this.h.sendEmptyMessage(2);
    this.h.removeMessages(4);
  }
  
  public final ProgressDialog j()
  {
    if ((this.p == null) || (!this.p.isShowing()))
    {
      this.p = new ProgressDialog(this);
      this.p.setCancelable(false);
    }
    return this.p;
  }
  
  public final void k()
  {
    if (this.p != null)
    {
      this.p.dismiss();
      this.p = null;
    }
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    ihl.a(this);
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    bindService(new Intent(getApplicationContext(), IngestService.class), this.x, 1);
    setContentView(efj.Nt);
    this.f = ((IngestGridView)findViewById(efj.Nl));
    this.g = new ihe(this);
    this.g.registerDataSetObserver(this.w);
    this.f.setAdapter(this.g);
    this.f.setMultiChoiceModeListener(this.v);
    this.f.setOnItemClickListener(this.u);
    this.f.a = this.n;
    this.s = ((ViewPager)findViewById(efj.Nq));
    this.h = new igx(this);
    ihl.a(this);
  }
  
  public final boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(efj.Nx, paramMenu);
    this.t = paramMenu.findItem(efj.Np);
    paramMenu.findItem(efj.Nm).setVisible(false);
    a(this.t, this.l);
    return true;
  }
  
  protected final void onDestroy()
  {
    if (this.d != null)
    {
      this.d.a(null);
      unbindService(this.x);
    }
    super.onDestroy();
  }
  
  public final boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    int i1 = paramMenuItem.getItemId();
    if (i1 == efj.Nm)
    {
      if (this.i != null)
      {
        IngestService localIngestService = this.d;
        SparseBooleanArray localSparseBooleanArray = this.f.getCheckedItemPositions();
        ihe localihe = this.g;
        ArrayList localArrayList = new ArrayList();
        for (int i2 = 0; i2 < localSparseBooleanArray.size(); i2++) {
          if (localSparseBooleanArray.valueAt(i2))
          {
            Object localObject = localihe.getItem(localSparseBooleanArray.keyAt(i2));
            if ((localObject instanceof ihk)) {
              localArrayList.add((ihk)localObject);
            }
          }
        }
        ihi localihi = new ihi(localIngestService.a, localArrayList, localIngestService.b, localIngestService);
        localihi.a = localIngestService;
        localIngestService.d.a(0, 0, true).c = dk.a(localIngestService.getResources().getText(efj.NC));
        localIngestService.startForeground(efj.Nn, localIngestService.d.b());
        new Thread(localihi).start();
        this.i.finish();
      }
      return true;
    }
    if (i1 == efj.Np)
    {
      boolean bool1 = this.l;
      boolean bool2 = false;
      if (!bool1) {
        bool2 = true;
      }
      b(bool2);
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  protected final void onPause()
  {
    if (this.d != null) {
      this.d.a(null);
    }
    this.e = false;
    k();
    super.onPause();
  }
  
  protected final void onResume()
  {
    DateTileView.a();
    this.e = true;
    if (this.d != null) {
      this.d.a(this);
    }
    f();
    super.onResume();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ingest.IngestActivity
 * JD-Core Version:    0.7.0.1
 */