package com.google.android.apps.plus.settings.impl;

import aau;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources.Theme;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import bhi;
import bp;
import bu;
import bv;
import bw;
import cl;
import dry;
import drz;
import mfg;
import oyv;
import oyw;
import oza;
import ozb;
import ozc;
import ozg;
import ozs;
import pad;
import pcw;
import pdd;
import pea;

public final class GstsPhotosSettingsActivity
  extends mfg
  implements oyv<bhi>, oyw<GstsPhotosSettingsActivityPeer>, ozc<dry>
{
  private GstsPhotosSettingsActivityPeer d;
  private volatile dry e;
  private volatile bhi f;
  private final Object g = new Object();
  private final pcw h = new pcw(this);
  private boolean i;
  
  private final void h()
  {
    if (this.f == null) {
      synchronized (this.g)
      {
        if (this.f == null)
        {
          dry localdry = this.e;
          if (localdry != null) {}
        }
        try
        {
          this.e = ((dry)((ozb)((oyv)getApplication()).a()).a(new ozg(this)));
          this.f = ((bhi)((oza)this.e).e());
          return;
        }
        catch (ClassCastException localClassCastException)
        {
          throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", localClassCastException);
        }
      }
    }
  }
  
  private bhi i()
  {
    h();
    return this.f;
  }
  
  protected final boolean a(View paramView, Menu paramMenu)
  {
    return super.a(paramView, paramMenu);
  }
  
  protected final void attachBaseContext(Context paramContext)
  {
    super.attachBaseContext(paramContext);
  }
  
  public final Class<GstsPhotosSettingsActivityPeer> au_()
  {
    return GstsPhotosSettingsActivityPeer.class;
  }
  
  protected final void j_()
  {
    super.j_();
  }
  
  protected final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  protected final void onApplyThemeResource(Resources.Theme paramTheme, int paramInt, boolean paramBoolean)
  {
    super.onApplyThemeResource(paramTheme, paramInt, paramBoolean);
  }
  
  public final void onBackPressed()
  {
    this.h.j();
    try
    {
      super.onBackPressed();
      return;
    }
    finally
    {
      pea.b("Back pressed");
    }
  }
  
  protected final void onChildTitleChanged(Activity paramActivity, CharSequence paramCharSequence)
  {
    super.onChildTitleChanged(paramActivity, paramCharSequence);
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    this.i = true;
    this.h.a();
    try
    {
      h();
      if (this.d != null) {
        break label67;
      }
      if (!this.i) {
        throw new IllegalStateException("createPeer() called outside of onCreate");
      }
    }
    finally
    {
      this.h.b();
    }
    h();
    this.d = this.e.d();
    label67:
    ((ozs)this.e).a().a();
    super.onCreate(paramBundle);
    GstsPhotosSettingsActivityPeer localGstsPhotosSettingsActivityPeer = this.d;
    localGstsPhotosSettingsActivityPeer.a.setContentView(aau.xk);
    if (localGstsPhotosSettingsActivityPeer.a.b.a.d.a(aau.xj) == null) {
      localGstsPhotosSettingsActivityPeer.a.b.a.d.a().a(aau.xj, new drz(localGstsPhotosSettingsActivityPeer.a)).b();
    }
    this.h.b();
    this.i = false;
  }
  
  @Deprecated
  protected final Dialog onCreateDialog(int paramInt)
  {
    return super.onCreateDialog(paramInt);
  }
  
  @Deprecated
  protected final Dialog onCreateDialog(int paramInt, Bundle paramBundle)
  {
    return super.onCreateDialog(paramInt, paramBundle);
  }
  
  protected final void onDestroy()
  {
    this.h.i();
    try
    {
      super.onDestroy();
      pcw localpcw2;
      return;
    }
    finally
    {
      pcw localpcw1 = this.h;
      pea.b(localpcw1.a);
      localpcw1.a = null;
    }
  }
  
  protected final void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
  }
  
  protected final void onPause()
  {
    this.h.g();
    try
    {
      super.onPause();
      pcw localpcw2;
      return;
    }
    finally
    {
      pcw localpcw1 = this.h;
      pea.b(localpcw1.a);
      localpcw1.a = null;
    }
  }
  
  protected final void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
  }
  
  protected final void onPostResume()
  {
    pcw localpcw = this.h;
    localpcw.a = ((pdd)pea.b.get());
    pea.b(localpcw.b);
    try
    {
      super.onPostResume();
      return;
    }
    finally
    {
      this.h.f();
    }
  }
  
  @Deprecated
  protected final void onPrepareDialog(int paramInt, Dialog paramDialog)
  {
    super.onPrepareDialog(paramInt, paramDialog);
  }
  
  @Deprecated
  protected final void onPrepareDialog(int paramInt, Dialog paramDialog, Bundle paramBundle)
  {
    super.onPrepareDialog(paramInt, paramDialog, paramBundle);
  }
  
  protected final void onRestart()
  {
    super.onRestart();
  }
  
  protected final void onRestoreInstanceState(Bundle paramBundle)
  {
    super.onRestoreInstanceState(paramBundle);
  }
  
  protected final void onResume()
  {
    this.h.e();
    try
    {
      super.onResume();
      pcw localpcw2;
      return;
    }
    finally
    {
      pcw localpcw1 = this.h;
      pea.b(localpcw1.a);
      localpcw1.a = null;
    }
  }
  
  protected final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
  }
  
  protected final void onStart()
  {
    this.h.c();
    try
    {
      super.onStart();
      return;
    }
    finally
    {
      this.h.d();
    }
  }
  
  protected final void onStop()
  {
    this.h.h();
    try
    {
      super.onStop();
      pcw localpcw2;
      return;
    }
    finally
    {
      pcw localpcw1 = this.h;
      pea.b(localpcw1.a);
      localpcw1.a = null;
    }
  }
  
  protected final void onTitleChanged(CharSequence paramCharSequence, int paramInt)
  {
    super.onTitleChanged(paramCharSequence, paramInt);
  }
  
  protected final void onUserLeaveHint()
  {
    super.onUserLeaveHint();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.settings.impl.GstsPhotosSettingsActivity
 * JD-Core Version:    0.7.0.1
 */