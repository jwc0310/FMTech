package com.google.android.apps.plus.phone;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import bdl;
import bdp;
import bfp;
import bk;
import cij;
import dbl;
import dbr;
import efj;
import fe;
import git;
import ipf;
import ipm;
import java.util.ArrayList;
import jqa;
import jrf;
import mbb;
import mfq;

public class HostPhotoViewIntentPhotoOneUpActivity
  extends dbl
{
  private static final String[] e = { "bucket_id", "case when _data LIKE '%/DCIM/%' then 1 else 0 end" };
  private static final String[] f = { "bucket_id", "case when _data LIKE '%/DCIM/%' then 1 else 0 end" };
  private String g;
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.m.a(cij.class, new cij(this, this.n, new bfp()));
    this.m.a(bdl.class, new bdl());
  }
  
  public final void b(fe paramfe)
  {
    if ((this.g != null) && (jrf.m(this.g)))
    {
      int i = this.d.c();
      Intent localIntent1 = efj.a(this, i, 0);
      localIntent1.putExtra("starting_tab_index", 2);
      paramfe.a.add(localIntent1);
      if (!jrf.l(this.g))
      {
        Intent localIntent2 = new dbr(this, HostStreamAllFoldersTileActivity.class, i).a();
        paramfe.a.add(localIntent2);
        Intent localIntent3 = efj.c(this, i, this.g).a();
        paramfe.a.add(localIntent3);
      }
      return;
    }
    super.b(paramfe);
  }
  
  protected final bk g()
  {
    bdp localbdp = new bdp();
    Intent localIntent = getIntent();
    Uri localUri = localIntent.getData();
    int i = localIntent.getIntExtra("filter", 0);
    Bundle localBundle = new Bundle();
    if (this.d.e()) {
      localBundle.putInt("account_id", this.d.c());
    }
    localBundle.putInt("filter", i);
    localBundle.putBoolean("external", true);
    String[] arrayOfString;
    Cursor localCursor;
    label154:
    boolean bool;
    label181:
    label190:
    String str;
    label200:
    ipf localipf;
    if (mfq.b(localUri))
    {
      ContentResolver localContentResolver = getContentResolver();
      if (mfq.c(localUri))
      {
        arrayOfString = e;
        localCursor = localContentResolver.query(localUri, arrayOfString, null, null, "_id DESC LIMIT 1");
        if (localCursor == null) {}
      }
      try
      {
        if (localCursor.moveToNext())
        {
          if (localCursor.getInt(1) != 1) {
            break label287;
          }
          this.g = jrf.a();
        }
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;)
        {
          label228:
          if (localCursor != null) {
            localCursor.close();
          }
        }
      }
      finally
      {
        if (localCursor == null) {
          break label336;
        }
        localCursor.close();
      }
      if (!"com.android.camera.action.REVIEW".equals(localIntent.getAction()))
      {
        bool = true;
        localBundle.putBoolean("prevent_delete", bool);
        if (localUri == null) {
          break label383;
        }
        str = localUri.getScheme();
        if ((str == null) || (!str.startsWith("http"))) {
          break label389;
        }
        localipf = ipf.a(this, localUri.toString(), ipm.a);
        if (this.g == null) {
          break label402;
        }
        localBundle.putParcelable("photo_ref", localipf);
        localBundle.putString("view_id", this.g);
        localBundle.putInt("picker_mode", 0);
      }
    }
    for (;;)
    {
      getWindow().setBackgroundDrawable(null);
      localbdp.f(localBundle);
      return localbdp;
      arrayOfString = f;
      break;
      label287:
      this.g = jrf.k(localCursor.getString(0));
      break label154;
      label336:
      bool = false;
      break label181;
      localBundle.putBoolean("disable_up_button", true);
      localBundle.putBoolean("prevent_edit", true);
      localBundle.putBoolean("prevent_share", true);
      localBundle.putBoolean("prevent_delete", true);
      break label190;
      label383:
      str = null;
      break label200;
      label389:
      localipf = ipf.a(this, localUri, ipm.a);
      break label228;
      label402:
      localBundle.putParcelable("photo_ref", localipf);
      localBundle.putInt("picker_mode", 3);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.HostPhotoViewIntentPhotoOneUpActivity
 * JD-Core Version:    0.7.0.1
 */