package com.google.android.apps.plus.phone;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import deg;
import efj;
import git;
import giz;
import gjb;
import gjp;
import gzi;
import gzj;
import haa;
import hae;
import java.util.ArrayList;
import jrf;
import mbb;
import mcc;
import mfj;

public class PhotoTilePickerFacadeActivity
  extends mcc
  implements gzi
{
  private final git d;
  private final gzj e;
  
  public PhotoTilePickerFacadeActivity()
  {
    gjp localgjp = new gjp(this, this.k);
    this.j.a(git.class, localgjp);
    this.d = localgjp;
    gzj localgzj = new gzj(this, this.k);
    localgzj.a.add(this);
    this.e = localgzj;
  }
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.j.a(gzj.class, this.e);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    setResult(-1, (Intent)paramhae.a().getParcelable("result_intent"));
    finish();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    default: 
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
    }
    Intent localIntent = null;
    if (paramInt2 != -1) {}
    for (;;)
    {
      setResult(paramInt2, localIntent);
      finish();
      return;
      Bundle localBundle = paramIntent.getExtras();
      localIntent = null;
      if (localBundle != null)
      {
        String str1 = localBundle.getString("photo_url");
        boolean bool = TextUtils.isEmpty(str1);
        localIntent = null;
        if (!bool)
        {
          int i = localBundle.getInt("account_id", -1);
          String str2 = ((giz)this.j.a(giz.class)).a(i).b("gaia_id");
          localIntent = new Intent();
          localIntent.putExtra("photo_url", str1);
          localIntent.putExtra("account_gaia_id", str2);
          localIntent.putExtra("media_type", localBundle.getInt("media_type"));
          long l = localBundle.getLong("photo_id", 0L);
          if (l != 0L)
          {
            localIntent.putExtra("picasa_photo_id", l);
            paramInt2 = 0;
            continue;
          }
          String str3 = localBundle.getString("tile_id");
          if (!TextUtils.isEmpty(str3))
          {
            this.e.b(new deg(this, "photo_id", str3, i, localIntent));
            return;
          }
        }
      }
      paramInt2 = 0;
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle == null) {
      startActivityForResult(efj.a(this, this.d.c(), jrf.a(1, new String[0]), 0, true, 1, null, true, 0, 0), 1);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.phone.PhotoTilePickerFacadeActivity
 * JD-Core Version:    0.7.0.1
 */