package com.google.android.libraries.social.networkqueue.impl;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import bp;
import bu;
import bv;
import efj;
import ehr;
import fy;
import gzj;
import iyl;
import izo;
import izq;
import izr;
import izu;
import izv;
import mbb;
import mca;

public final class PendingNetworkRequestsFragment
  extends mca
  implements izq
{
  private fy Z;
  public int a;
  private izv aa;
  public iyl b;
  private ListView c;
  private izo d;
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView1 = paramLayoutInflater.inflate(efj.Qe, paramViewGroup, false);
    this.c = ((ListView)localView1.findViewById(ehr.cO));
    View localView2 = localView1.findViewById(ehr.cS);
    this.c.setEmptyView(localView2);
    this.d = new izo(this.bn, this);
    this.c.setAdapter(this.d);
    return localView1;
  }
  
  public final void a(long paramLong)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("account_id", this.a);
    localBundle.putLong("item_id", paramLong);
    izr localizr = new izr();
    localizr.f(localBundle);
    localizr.a(f().b.a.d, "pending_post_delete_confirmation");
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.a = f().getIntent().getIntExtra("account_id", -1);
    this.b = ((iyl)mbb.a(this.bn, iyl.class));
    this.Z = fy.a(this.bn);
    this.aa = new izv(this);
  }
  
  public final void m()
  {
    super.m();
    gzj.a(f(), new izu(this));
    this.Z.a(this.aa, new IntentFilter("com.google.android.apps.plus.networkqueue_change"));
  }
  
  public final void n()
  {
    super.n();
    this.Z.a(this.aa);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.networkqueue.impl.PendingNetworkRequestsFragment
 * JD-Core Version:    0.7.0.1
 */