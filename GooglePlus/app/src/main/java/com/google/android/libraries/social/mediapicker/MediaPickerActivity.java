package com.google.android.libraries.social.mediapicker;

import android.content.Intent;
import android.os.Bundle;
import bp;
import bu;
import bv;
import bw;
import cl;
import efj;
import git;
import gjp;
import guf;
import ipa;
import irl;
import irp;
import irq;
import irr;
import java.util.ArrayList;
import mbb;
import mcc;

public final class MediaPickerActivity
  extends mcc
  implements irq
{
  private final irp d = new irp(this, this.k);
  private final git e = new gjp(this, this.k);
  private final guf f = new irr(this);
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    mbb localmbb = this.j;
    localmbb.a(irp.class, this.d);
    localmbb.a(git.class, this.e);
  }
  
  public final void a(ArrayList<ipa> paramArrayList, Object paramObject)
  {
    Intent localIntent = new Intent();
    localIntent.putParcelableArrayListExtra("shareables", this.d.a);
    setResult(-1, localIntent);
    finish();
  }
  
  public final void aJ_() {}
  
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Bundle localBundle = getIntent().getExtras();
    switch (localBundle.getInt("media_picker_mode"))
    {
    }
    for (;;)
    {
      MediaPickerFragment localMediaPickerFragment = new MediaPickerFragment();
      localMediaPickerFragment.f(localBundle);
      this.b.a.d.a().a(16908290, localMediaPickerFragment).b();
      this.d.b.add(this);
      return;
      ((irl)this.j.a(irl.class)).a(efj.PS, this.f);
      continue;
      ((irl)this.j.a(irl.class)).a(efj.PR, this.f);
      continue;
      ((irl)this.j.a(irl.class)).a(efj.PM, this.f);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.mediapicker.MediaPickerActivity
 * JD-Core Version:    0.7.0.1
 */