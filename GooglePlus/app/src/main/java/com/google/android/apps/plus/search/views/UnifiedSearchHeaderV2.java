package com.google.android.apps.plus.search.views;

import aau;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.discovery.views.PeopleListRowView;
import com.google.android.libraries.social.spaces.SpaceListItemView;
import djt;
import dju;
import djv;
import djw;
import efj;
import git;
import gjb;
import gxn;
import gxq;
import hdo;
import hgz;
import hha;
import hvl;
import hvn;
import hvo;
import java.util.ArrayList;
import kxq;
import led;
import lej;
import len;
import lxj;
import mbb;
import odg;
import ors;
import pkb;

public final class UnifiedSearchHeaderV2
  extends LinearLayout
  implements View.OnClickListener, lxj
{
  private View A;
  private View B;
  private TextView C;
  private TextView D;
  private TextView E;
  private final int F;
  private final String G;
  public final kxq a;
  public final hvn b;
  public LinearLayout c;
  public LinearLayout d;
  public LinearLayout e;
  public TextView f;
  public View g;
  public View h;
  public View i;
  public String j;
  public String k;
  public String l;
  public TextView m;
  public final int n;
  public final int o;
  public final int p;
  public int q;
  public int r;
  public LayoutInflater s;
  public djw t;
  private final lej u;
  private final hha v;
  private final hgz w;
  private final led x;
  private final git y;
  private View z;
  
  public UnifiedSearchHeaderV2(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    Resources localResources = localContext.getResources();
    this.a = ((kxq)mbb.a(localContext, kxq.class));
    this.u = ((lej)mbb.a(localContext, lej.class));
    this.v = ((hha)mbb.a(localContext, hha.class));
    this.w = ((hgz)mbb.a(localContext, hgz.class));
    this.x = ((led)mbb.a(localContext, led.class));
    this.F = ((git)mbb.a(localContext, git.class)).c();
    this.G = ((git)mbb.a(localContext, git.class)).f().b("domain_name");
    this.b = ((hvn)mbb.a(localContext, hvn.class));
    this.y = ((git)mbb.a(localContext, git.class));
    this.n = localResources.getDimensionPixelSize(efj.Bc);
    this.o = localResources.getDimensionPixelSize(efj.Bd);
    this.p = localResources.getDimensionPixelSize(efj.Bb);
    this.s = ((LayoutInflater)localContext.getSystemService("layout_inflater"));
  }
  
  public UnifiedSearchHeaderV2(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Context localContext = getContext();
    Resources localResources = localContext.getResources();
    this.a = ((kxq)mbb.a(localContext, kxq.class));
    this.u = ((lej)mbb.a(localContext, lej.class));
    this.v = ((hha)mbb.a(localContext, hha.class));
    this.w = ((hgz)mbb.a(localContext, hgz.class));
    this.x = ((led)mbb.a(localContext, led.class));
    this.F = ((git)mbb.a(localContext, git.class)).c();
    this.G = ((git)mbb.a(localContext, git.class)).f().b("domain_name");
    this.b = ((hvn)mbb.a(localContext, hvn.class));
    this.y = ((git)mbb.a(localContext, git.class));
    this.n = localResources.getDimensionPixelSize(efj.Bc);
    this.o = localResources.getDimensionPixelSize(efj.Bd);
    this.p = localResources.getDimensionPixelSize(efj.Bb);
    this.s = ((LayoutInflater)localContext.getSystemService("layout_inflater"));
  }
  
  public UnifiedSearchHeaderV2(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Context localContext = getContext();
    Resources localResources = localContext.getResources();
    this.a = ((kxq)mbb.a(localContext, kxq.class));
    this.u = ((lej)mbb.a(localContext, lej.class));
    this.v = ((hha)mbb.a(localContext, hha.class));
    this.w = ((hgz)mbb.a(localContext, hgz.class));
    this.x = ((led)mbb.a(localContext, led.class));
    this.F = ((git)mbb.a(localContext, git.class)).c();
    this.G = ((git)mbb.a(localContext, git.class)).f().b("domain_name");
    this.b = ((hvn)mbb.a(localContext, hvn.class));
    this.y = ((git)mbb.a(localContext, git.class));
    this.n = localResources.getDimensionPixelSize(efj.Bc);
    this.o = localResources.getDimensionPixelSize(efj.Bd);
    this.p = localResources.getDimensionPixelSize(efj.Bb);
    this.s = ((LayoutInflater)localContext.getSystemService("layout_inflater"));
  }
  
  private final boolean a(String paramString)
  {
    return (paramString != null) && (TextUtils.equals(this.y.f().b("gaia_id"), paramString));
  }
  
  public final void D_()
  {
    int i1 = 0;
    this.m.setText(null);
    this.l = null;
    this.E.setText(null);
    int i2 = this.e.getChildCount();
    for (int i3 = 0; i3 < i2; i3++)
    {
      PeopleListRowView localPeopleListRowView = (PeopleListRowView)this.e.getChildAt(i3);
      localPeopleListRowView.j.a();
      localPeopleListRowView.m = null;
      localPeopleListRowView.setBackgroundColor(-1);
      localPeopleListRowView.setPressed(false);
      localPeopleListRowView.a = false;
      if (localPeopleListRowView.b != null) {
        localPeopleListRowView.b.a();
      }
    }
    this.j = null;
    this.C.setText(null);
    int i4 = this.c.getChildCount();
    for (int i5 = 0; i5 < i4; i5++) {
      ((SpaceListItemView)this.c.getChildAt(i5)).D_();
    }
    this.k = null;
    this.D.setText(null);
    int i6 = this.d.getChildCount();
    while (i1 < i6)
    {
      ((SpaceListItemView)this.d.getChildAt(i1)).D_();
      i1++;
    }
  }
  
  public final void a(Cursor paramCursor)
  {
    if ((paramCursor == null) || (!paramCursor.moveToFirst()))
    {
      this.i.setVisibility(8);
      this.e.setVisibility(8);
      return;
    }
    this.E.setText(this.l);
    this.i.setVisibility(0);
    this.e.setVisibility(0);
    if (3 >= paramCursor.getCount()) {
      this.B.setVisibility(8);
    }
    int i1 = Math.min(3, paramCursor.getCount());
    int i2 = 0;
    label91:
    boolean bool1;
    label217:
    boolean bool2;
    label238:
    boolean bool3;
    label250:
    View localView;
    if (i2 < i1)
    {
      PeopleListRowView localPeopleListRowView = (PeopleListRowView)this.e.getChildAt(i2);
      String str1 = paramCursor.getString(paramCursor.getColumnIndex("person_id"));
      String str2 = paramCursor.getString(paramCursor.getColumnIndex("gaia_id"));
      String str3 = hdo.b(paramCursor.getString(paramCursor.getColumnIndex("avatar")));
      String str4 = paramCursor.getString(paramCursor.getColumnIndex("name"));
      String str5 = paramCursor.getString(paramCursor.getColumnIndex("packed_circle_ids"));
      if (paramCursor.getInt(paramCursor.getColumnIndex("in_same_visibility_group")) <= 0) {
        break label329;
      }
      bool1 = true;
      if (paramCursor.getInt(paramCursor.getColumnIndex("verified")) <= 0) {
        break label335;
      }
      bool2 = true;
      if (a(str2)) {
        break label341;
      }
      bool3 = true;
      localPeopleListRowView.k = bool3;
      localPeopleListRowView.a(str1, str2, str3, str4, null, false, str5, null, bool1, bool2, null);
      localPeopleListRowView.setOnClickListener(this);
      localPeopleListRowView.setVisibility(0);
      localView = localPeopleListRowView.findViewById(aau.wW);
      if (i2 == 0) {
        break label347;
      }
    }
    label329:
    label335:
    label341:
    label347:
    for (int i3 = 0;; i3 = 8)
    {
      localView.setVisibility(i3);
      paramCursor.moveToNext();
      i2++;
      break label91;
      break;
      bool1 = false;
      break label217;
      bool2 = false;
      break label238;
      bool3 = false;
      break label250;
    }
  }
  
  public final void a(ArrayList<Object> paramArrayList)
  {
    if ((paramArrayList == null) || (paramArrayList.size() <= 0))
    {
      this.i.setVisibility(8);
      this.e.setVisibility(8);
      return;
    }
    this.E.setText(this.l);
    this.i.setVisibility(0);
    this.e.setVisibility(0);
    if (3 >= paramArrayList.size()) {
      this.B.setVisibility(8);
    }
    int i1 = Math.min(3, paramArrayList.size());
    int i2 = 0;
    label85:
    Object localObject;
    PeopleListRowView localPeopleListRowView;
    odg localodg;
    String str;
    if (i2 < i1)
    {
      localObject = paramArrayList.get(i2);
      localPeopleListRowView = (PeopleListRowView)this.e.getChildAt(i2);
      if (!(localObject instanceof odg)) {
        break label248;
      }
      localodg = (odg)localObject;
      if ((localodg != null) && (localodg.a != null) && (localodg.a.a != null)) {
        break label219;
      }
      str = null;
    }
    for (;;)
    {
      label152:
      boolean bool;
      label164:
      View localView;
      if (!a(str))
      {
        bool = true;
        localPeopleListRowView.k = bool;
        localPeopleListRowView.a(localObject, this.G, null);
        localPeopleListRowView.setVisibility(0);
        localView = localPeopleListRowView.findViewById(aau.wW);
        if (i2 == 0) {
          break label241;
        }
      }
      label219:
      label241:
      for (int i3 = 0;; i3 = 8)
      {
        localView.setVisibility(i3);
        i2++;
        break label85;
        break;
        str = efj.b(localodg.a.a);
        break label152;
        bool = false;
        break label164;
      }
      label248:
      str = null;
    }
  }
  
  public final void b(Cursor paramCursor)
  {
    if ((paramCursor == null) || (!paramCursor.moveToFirst()))
    {
      this.g.setVisibility(8);
      this.c.setVisibility(8);
      return;
    }
    this.C.setText(this.j);
    this.g.setVisibility(0);
    this.c.setVisibility(0);
    if (this.r >= paramCursor.getCount()) {
      this.z.setVisibility(8);
    }
    for (int i1 = 0;; i1++) {
      if (i1 < this.r)
      {
        SpaceListItemView localSpaceListItemView = (SpaceListItemView)this.c.getChildAt(i1);
        localSpaceListItemView.setVisibility(0);
        this.v.a(localSpaceListItemView, paramCursor, this.F, this.w);
        if (!paramCursor.moveToNext()) {
          i1++;
        }
      }
      else
      {
        while (i1 < this.r)
        {
          this.c.getChildAt(i1).setVisibility(4);
          i1++;
        }
        break;
      }
    }
  }
  
  public final void c(Cursor paramCursor)
  {
    if ((paramCursor == null) || (!paramCursor.moveToFirst()))
    {
      this.h.setVisibility(8);
      this.d.setVisibility(8);
      return;
    }
    this.D.setText(this.k);
    this.h.setVisibility(0);
    this.d.setVisibility(0);
    if (this.q >= paramCursor.getCount()) {
      this.A.setVisibility(8);
    }
    for (int i1 = 0;; i1++) {
      if (i1 < this.q)
      {
        SpaceListItemView localSpaceListItemView = (SpaceListItemView)this.d.getChildAt(i1);
        localSpaceListItemView.setVisibility(0);
        lej locallej = this.u;
        led localled = this.x;
        locallej.a(len.a, localSpaceListItemView, paramCursor, localled);
        if (!paramCursor.moveToNext()) {
          i1++;
        }
      }
      else
      {
        while (i1 < this.q)
        {
          this.d.getChildAt(i1).setVisibility(4);
          i1++;
        }
        break;
      }
    }
  }
  
  public final void onClick(View paramView)
  {
    PeopleListRowView localPeopleListRowView = (PeopleListRowView)paramView;
    hvn localhvn = this.b;
    String str1 = localPeopleListRowView.c;
    String str2 = localPeopleListRowView.f;
    Bundle localBundle = localPeopleListRowView.n;
    int i1;
    switch (localPeopleListRowView.g)
    {
    default: 
      i1 = 0;
    }
    for (;;)
    {
      localhvn.a(str1, str2, localBundle, i1, new hvo(localPeopleListRowView.d, localPeopleListRowView.e));
      return;
      i1 = 194;
      continue;
      i1 = 231;
      continue;
      i1 = 195;
    }
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.c = ((LinearLayout)findViewById(aau.wT));
    this.d = ((LinearLayout)findViewById(aau.xe));
    this.e = ((LinearLayout)findViewById(aau.wZ));
    this.m = ((TextView)findViewById(aau.wX));
    this.g = findViewById(aau.wS);
    this.h = findViewById(aau.xd);
    this.i = findViewById(aau.wY);
    this.C = ((TextView)findViewById(aau.wV));
    this.D = ((TextView)findViewById(aau.xg));
    this.E = ((TextView)findViewById(aau.xb));
    this.f = ((TextView)findViewById(aau.xc));
    this.z = findViewById(aau.wU);
    this.A = findViewById(aau.xf);
    this.B = findViewById(aau.xa);
    efj.a(this.z, new gxq(pkb.i));
    efj.a(this.A, new gxq(pkb.j));
    efj.a(this.B, new gxq(pkb.k));
    this.z.setOnClickListener(new gxn(new djt(this)));
    this.A.setOnClickListener(new gxn(new dju(this)));
    this.B.setOnClickListener(new gxn(new djv(this)));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.search.views.UnifiedSearchHeaderV2
 * JD-Core Version:    0.7.0.1
 */