package com.google.android.libraries.social.squares.impl.categories;

import android.content.Intent;
import android.os.Bundle;
import bj;
import bp;
import bu;
import bv;
import gjp;
import gnb;
import kyl;
import kym;
import lhp;
import mbb;
import mbp;

public final class SquareCategoryPickerActivity
  extends mbp
  implements kym
{
  public SquareCategoryPickerActivity()
  {
    new gjp(this, this.n).a(this.m);
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.m.a(kym.class, this);
  }
  
  public final void a(lhp paramlhp)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("square_target", paramlhp);
    gnb localgnb = new gnb(paramlhp);
    localIntent.putExtra("extra_acl", localgnb);
    localIntent.putExtra("extra_acl_label", localgnb.b(this));
    setResult(-1, localIntent);
    finish();
  }
  
  public final void aM_()
  {
    finish();
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    lhp locallhp = (lhp)getIntent().getExtras().getParcelable("square_target");
    if (locallhp != null)
    {
      ((kyl)this.m.a(kyl.class)).a(locallhp).a(this.b.a.d, null);
      return;
    }
    finish();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.squares.impl.categories.SquareCategoryPickerActivity
 * JD-Core Version:    0.7.0.1
 */