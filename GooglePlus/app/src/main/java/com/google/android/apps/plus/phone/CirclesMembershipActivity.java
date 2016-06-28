package com.google.android.apps.plus.phone;

import aau;
import aaw;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import bk;
import bxt;
import com.google.android.apps.plus.fragments.CirclesMultipleSelectFragment;
import efj;
import git;
import gjp;
import gxj;
import gxl;
import gxn;
import gxq;
import gxs;
import iky;
import ine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jiw;
import jkz;
import jyj;
import mbb;
import mbp;
import pkf;

public class CirclesMembershipActivity
  extends mbp
  implements View.OnClickListener, bxt
{
  private CirclesMultipleSelectFragment d;
  private View e;
  
  public CirclesMembershipActivity()
  {
    new jyj(this, this.n);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    gxl localgxl = new gxl(pkf.i);
    this.m.a(gxs.class, localgxl);
    new gxj(this.n);
    iky localiky = new iky(this.n);
    if (localiky.b != null) {
      throw new IllegalStateException("Must call this method before onAttachBinder");
    }
    localiky.a.add(ine.class);
  }
  
  private final void f()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("person_id", getIntent().getExtras().getString("person_id"));
    localIntent.putExtra("display_name", getIntent().getExtras().getString("display_name"));
    localIntent.putExtra("suggestion_id", getIntent().getExtras().getString("suggestion_id"));
    localIntent.putExtra("activity_id", getIntent().getExtras().getString("activity_id"));
    localIntent.putExtra("promo_type", Integer.valueOf(getIntent().getExtras().getInt("promo_type")));
    localIntent.putExtra("category_index", Integer.valueOf(getIntent().getExtras().getInt("category_index")));
    localIntent.putExtra("original_circle_ids", this.d.d);
    localIntent.putExtra("selected_circle_ids", this.d.Z);
    setResult(0, localIntent);
    finish();
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.m.a(jiw.class, new jkz(this, this.n));
  }
  
  public final void a(bk parambk)
  {
    if ((parambk instanceof CirclesMultipleSelectFragment))
    {
      this.d = ((CirclesMultipleSelectFragment)parambk);
      this.d.aa = 2;
      this.d.ab = true;
      this.d.a = getIntent().getExtras().getString("person_id");
      this.d.b = getIntent().getExtras().getString("display_name");
      this.d.ac = this;
    }
  }
  
  public final void aj_()
  {
    if (getIntent().getExtras().getBoolean("empty_selection_allowed", false)) {}
    while ((this.d == null) || (this.e == null)) {
      return;
    }
    View localView = this.e;
    int i = this.d.Z.size();
    boolean bool = false;
    if (i > 0) {
      bool = true;
    }
    localView.setEnabled(bool);
  }
  
  public void onBackPressed()
  {
    f();
  }
  
  public void onClick(View paramView)
  {
    int i = paramView.getId();
    if (i == aaw.gC)
    {
      localArrayList1 = this.d.d;
      if (localArrayList1 != null)
      {
        localArrayList2 = this.d.Z;
        Collections.sort(localArrayList1);
        Collections.sort(localArrayList2);
        localIntent = new Intent();
        localIntent.putExtra("person_id", getIntent().getExtras().getString("person_id"));
        localIntent.putExtra("display_name", getIntent().getExtras().getString("display_name"));
        localIntent.putExtra("suggestion_id", getIntent().getExtras().getString("suggestion_id"));
        localIntent.putExtra("activity_id", getIntent().getExtras().getString("activity_id"));
        localIntent.putExtra("promo_type", Integer.valueOf(getIntent().getExtras().getInt("promo_type")));
        localIntent.putExtra("category_index", Integer.valueOf(getIntent().getExtras().getInt("category_index")));
        localIntent.putExtra("original_circle_ids", localArrayList1);
        localIntent.putExtra("selected_circle_ids", localArrayList2);
        if (!localArrayList1.equals(localArrayList2)) {
          break label221;
        }
        j = 0;
        setResult(j, localIntent);
        finish();
      }
    }
    label221:
    while (i != aaw.aT) {
      for (;;)
      {
        ArrayList localArrayList1;
        ArrayList localArrayList2;
        Intent localIntent;
        return;
        int j = -1;
      }
    }
    f();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.sX);
    setTitle(aau.bL);
    this.e = findViewById(aaw.gC);
    efj.a(this.e, new gxq(pkf.j));
    this.e.setEnabled(getIntent().getExtras().getBoolean("empty_selection_allowed", false));
    this.e.setOnClickListener(new gxn(this));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.CirclesMembershipActivity
 * JD-Core Version:    0.7.0.1
 */