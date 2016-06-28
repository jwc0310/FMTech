package com.google.android.apps.plus.locations;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import bk;
import bp;
import csj;
import cv;
import cw;
import efj;
import fu;
import hgl;
import java.util.HashMap;
import java.util.HashSet;
import jma;
import lws;
import lwt;
import ra;

public class FriendLocationsCircleFilterFragment
  extends bk
  implements AdapterView.OnItemClickListener, cw<Cursor>, lwt
{
  private ContextThemeWrapper Z;
  public HashSet<String> a;
  public HashMap<String, Integer> b;
  private ListView c;
  private csj d;
  
  private final void a(View paramView)
  {
    int i = 1;
    if (paramView == null) {
      return;
    }
    int j;
    if ((this.d != null) && (this.d.c != null)) {
      if (this.d.isEmpty()) {
        j = 0;
      }
    }
    for (;;)
    {
      ListView localListView = this.c;
      int k;
      label49:
      View localView;
      int m;
      if (j != 0)
      {
        k = 0;
        localListView.setVisibility(k);
        localView = paramView.findViewById(16908292);
        m = 0;
        if (i == 0) {
          break label93;
        }
      }
      for (;;)
      {
        localView.setVisibility(m);
        return;
        j = i;
        i = 0;
        break;
        k = 8;
        break label49;
        label93:
        m = 8;
      }
      i = 0;
      j = 0;
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = LayoutInflater.from(this.Z).inflate(efj.tc, null, false);
    this.c = ((ListView)localView.findViewById(16908298));
    this.c.setAdapter(this.d);
    this.c.setOnItemClickListener(this);
    a(localView);
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    return new jma(f(), f().getIntent().getIntExtra("account_id", -1), 17);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.Z = new ContextThemeWrapper(f(), efj.yV);
    this.d = new csj(this, this.Z);
    Bundle localBundle = f().getIntent().getExtras();
    if (paramBundle != null) {}
    for (this.a = ((HashSet)paramBundle.getSerializable("selected_circles"));; this.a = ((HashSet)localBundle.getSerializable("circle_ids")))
    {
      if (this.a == null) {
        this.a = new HashSet();
      }
      this.b = ((HashMap)localBundle.getSerializable("sharing_user_count"));
      if (this.b == null) {
        this.b = new HashMap();
      }
      if (Log.isLoggable("FriendLocationsFilter", 3))
      {
        String str = String.valueOf(this.b);
        new StringBuilder(30 + String.valueOf(str).length()).append("Dialog: circleToUserCountMap: ").append(str);
      }
      k().a(0, null, this);
      return;
    }
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(lws paramlws, boolean paramBoolean)
  {
    String str = ((hgl)paramlws).a;
    if (paramBoolean)
    {
      this.a.add(str);
      return;
    }
    this.a.remove(str);
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putSerializable("selected_circles", this.a);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    ((hgl)paramView).toggle();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.locations.FriendLocationsCircleFilterFragment
 * JD-Core Version:    0.7.0.1
 */