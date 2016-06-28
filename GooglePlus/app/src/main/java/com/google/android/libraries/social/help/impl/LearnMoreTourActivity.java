package com.google.android.libraries.social.help.impl;

import aau;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import bp;
import bu;
import bv;
import efj;
import gjp;
import ies;
import iet;
import java.util.ArrayList;
import mcc;
import ok;

public final class LearnMoreTourActivity
  extends mcc
  implements View.OnClickListener, ok
{
  private View d;
  private View e;
  private View f;
  private PageIndicatorView g;
  private iet h;
  private ViewPager i;
  private ies l;
  
  public LearnMoreTourActivity()
  {
    new gjp(this, this.k).a(this.j);
  }
  
  public final void a(int paramInt)
  {
    int j = 1;
    if (e()) {
      if (paramInt == 0)
      {
        if (j == 0) {
          break label99;
        }
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.f.setVisibility(0);
        this.f.requestFocus();
      }
    }
    PageIndicatorView localPageIndicatorView;
    for (;;)
    {
      localPageIndicatorView = this.g;
      if (paramInt >= 0) {
        break label127;
      }
      throw new IllegalStateException("Active indicator index must be non-negative number.");
      j = 0;
      break;
      if (paramInt == -1 + this.l.b.a.size()) {
        break;
      }
      j = 0;
      break;
      label99:
      this.d.setVisibility(0);
      this.e.setVisibility(0);
      this.f.setVisibility(8);
    }
    label127:
    if (paramInt >= localPageIndicatorView.a) {
      throw new IllegalStateException("Active indicator index must be less than the total number of indicators.");
    }
    if (localPageIndicatorView.b != paramInt)
    {
      localPageIndicatorView.b = paramInt;
      localPageIndicatorView.invalidate();
    }
  }
  
  public final void a(int paramInt1, float paramFloat, int paramInt2) {}
  
  public final void b(int paramInt) {}
  
  @TargetApi(17)
  public final boolean e()
  {
    if (Build.VERSION.SDK_INT >= 17) {}
    for (int j = 1; (j != 0) && (getResources().getConfiguration().getLayoutDirection() == 1); j = 0) {
      return true;
    }
    return false;
  }
  
  public final void onClick(View paramView)
  {
    if ((paramView == this.d) || (paramView == this.f)) {
      finish();
    }
    while (paramView != this.e) {
      return;
    }
    if (e())
    {
      this.i.a(-1 + this.i.d, true);
      return;
    }
    this.i.a(1 + this.i.d, true);
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.MM);
    this.l = new ies(this, this, this.b.a.d);
    ArrayList localArrayList = getIntent().getStringArrayListExtra("fragment_names");
    iet localiet;
    if (localArrayList == null) {
      localiet = null;
    }
    for (;;)
    {
      this.h = localiet;
      if ((this.h != null) && (!this.h.a.isEmpty())) {
        break;
      }
      finish();
      return;
      localiet = new iet();
      localiet.a = new ArrayList(localArrayList);
    }
    ies localies = this.l;
    localies.b = this.h;
    localies.d();
    this.d = findViewById(aau.Ac);
    this.f = findViewById(aau.zY);
    this.e = findViewById(aau.Aa);
    this.g = ((PageIndicatorView)findViewById(aau.zZ));
    PageIndicatorView localPageIndicatorView = this.g;
    int j = this.l.b.a.size();
    if (j <= 0) {
      throw new IllegalStateException("Total number of indicators must be positive.");
    }
    if (localPageIndicatorView.a != j)
    {
      localPageIndicatorView.a = j;
      localPageIndicatorView.requestLayout();
    }
    this.i = ((ViewPager)findViewById(aau.Ab));
    this.i.a(this.l);
    this.i.o = this;
    this.d.setOnClickListener(this);
    this.f.setOnClickListener(this);
    this.e.setOnClickListener(this);
    if (paramBundle != null)
    {
      int k = paramBundle.getInt("current_item");
      this.i.a(k, false);
      a(k);
      return;
    }
    if (e())
    {
      this.i.b(-1 + this.l.b.a.size());
      a(-1 + this.l.b.a.size());
      return;
    }
    this.i.b(0);
    a(0);
  }
  
  protected final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putInt("current_item", this.i.d);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.help.impl.LearnMoreTourActivity
 * JD-Core Version:    0.7.0.1
 */