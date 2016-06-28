package com.google.android.apps.plus.phone;

import aau;
import aaw;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.Contacts;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import bk;
import ckz;
import clc;
import com.google.android.apps.plus.fragments.PeopleSearchFragment;
import dzd;
import efj;
import git;
import gjp;
import gxv;
import gya;
import jgs;
import jjd;
import jyj;
import lzw;
import mbb;
import mbp;
import tp;
import uo;
import uq;

public class PeopleSearchActivity
  extends mbp
  implements View.OnClickListener, ckz, gxv
{
  private final git d;
  private PeopleSearchFragment e;
  
  public PeopleSearchActivity()
  {
    new jyj(this, this.n);
    lzw locallzw = new lzw(this, this.n);
    this.m.a(lzw.class, locallzw);
    gjp localgjp = new gjp(this, this.n);
    this.m.a(git.class, localgjp);
    this.d = localgjp;
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.m.a(gxv.class, this);
  }
  
  public final void a(bk parambk)
  {
    Intent localIntent;
    PeopleSearchFragment localPeopleSearchFragment3;
    if ((parambk instanceof PeopleSearchFragment))
    {
      this.e = ((PeopleSearchFragment)parambk);
      ProgressBar localProgressBar = (ProgressBar)findViewById(aaw.hX);
      PeopleSearchFragment localPeopleSearchFragment1 = this.e;
      localPeopleSearchFragment1.ag = localProgressBar;
      localPeopleSearchFragment1.a(localPeopleSearchFragment1.ag);
      this.e.aa = this;
      localIntent = getIntent();
      PeopleSearchFragment localPeopleSearchFragment2 = this.e;
      int i = localIntent.getIntExtra("search_circles_usage", -1);
      localPeopleSearchFragment2.c = i;
      if (localPeopleSearchFragment2.Z != null) {
        localPeopleSearchFragment2.Z.e = i;
      }
      localPeopleSearchFragment3 = this.e;
      if (getIntent().getBooleanExtra("picker_mode", false)) {
        break label341;
      }
    }
    label341:
    for (boolean bool1 = true;; bool1 = false)
    {
      localPeopleSearchFragment3.ab = bool1;
      if (localPeopleSearchFragment3.Z != null) {
        localPeopleSearchFragment3.Z.l = bool1;
      }
      PeopleSearchFragment localPeopleSearchFragment4 = this.e;
      boolean bool2 = localIntent.getBooleanExtra("search_pub_profiles_enabled", false);
      localPeopleSearchFragment4.ac = bool2;
      if (localPeopleSearchFragment4.Z != null) {
        localPeopleSearchFragment4.Z.j = bool2;
      }
      PeopleSearchFragment localPeopleSearchFragment5 = this.e;
      boolean bool3 = localIntent.getBooleanExtra("search_phones_enabled", false);
      localPeopleSearchFragment5.ad = bool3;
      if (localPeopleSearchFragment5.Z != null) {
        localPeopleSearchFragment5.Z.q = bool3;
      }
      PeopleSearchFragment localPeopleSearchFragment6 = this.e;
      boolean bool4 = localIntent.getBooleanExtra("search_plus_pages_enabled", false);
      localPeopleSearchFragment6.ae = bool4;
      if (localPeopleSearchFragment6.Z != null) {
        localPeopleSearchFragment6.Z.r = bool4;
      }
      PeopleSearchFragment localPeopleSearchFragment7 = this.e;
      boolean bool5 = localIntent.getBooleanExtra("search_in_circles_enabled", true);
      localPeopleSearchFragment7.af = bool5;
      if (localPeopleSearchFragment7.Z != null) {
        localPeopleSearchFragment7.Z.c(bool5);
      }
      PeopleSearchFragment localPeopleSearchFragment8 = this.e;
      String str = localIntent.getStringExtra("query");
      if (localPeopleSearchFragment8.b == null) {
        localPeopleSearchFragment8.b = str;
      }
      return;
    }
  }
  
  public final void a(String paramString1, String paramString2, jjd paramjjd)
  {
    if (getIntent().getBooleanExtra("picker_mode", false))
    {
      Intent localIntent1 = new Intent();
      localIntent1.putExtra("person_id", paramString1);
      localIntent1.putExtra("person_data", paramjjd);
      setResult(-1, localIntent1);
      finish();
      return;
    }
    if (paramString2 != null)
    {
      Intent localIntent2 = new Intent("android.intent.action.VIEW", Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_LOOKUP_URI, paramString2));
      localIntent2.addFlags(524288);
      startActivity(localIntent2);
      return;
    }
    startActivity(efj.b(this, this.d.c(), paramString1, null, false));
  }
  
  public final void a(String paramString, jgs paramjgs)
  {
    if (getIntent().getBooleanExtra("picker_mode", false))
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("circle_id", paramString);
      localIntent.putExtra("circle_data", paramjgs);
      setResult(-1, localIntent);
      finish();
      return;
    }
    throw new IllegalStateException();
  }
  
  public final void b(Bundle paramBundle) {}
  
  public void onClick(View paramView) {}
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.vy);
    e().a().a(getString(aau.sJ));
  }
  
  protected void onResume()
  {
    super.onResume();
    if (isFinishing()) {}
    PeopleSearchFragment localPeopleSearchFragment;
    do
    {
      do
      {
        return;
      } while (this.e == null);
      localPeopleSearchFragment = this.e;
    } while (localPeopleSearchFragment.d == null);
    localPeopleSearchFragment.d.a(localPeopleSearchFragment.b);
  }
  
  public final gya r_()
  {
    return gya.j;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.PeopleSearchActivity
 * JD-Core Version:    0.7.0.1
 */