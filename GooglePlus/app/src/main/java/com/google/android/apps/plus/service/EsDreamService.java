package com.google.android.apps.plus.service;

import aaw;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.service.dreams.DreamService;
import android.text.TextUtils;
import bgp;
import com.google.android.apps.plus.views.DreamViewFlipper;
import efj;
import giz;
import gjb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import mbb;

public class EsDreamService
  extends DreamService
{
  private DreamViewFlipper a;
  
  public static int a(Context paramContext)
  {
    String str1 = paramContext.getSharedPreferences("DreamSettings", 0).getString("selected_account_gaia_id", null);
    giz localgiz = (giz)mbb.a(paramContext, giz.class);
    int j;
    int i;
    if (!TextUtils.isEmpty(str1))
    {
      String[] arrayOfString = str1.split(":", 2);
      String str2 = arrayOfString[0];
      String str3 = arrayOfString[1];
      j = localgiz.b(str3);
      if (j == -1) {
        i = localgiz.b(str2, str3);
      }
    }
    else
    {
      do
      {
        return i;
        i = bgp.b(paramContext);
        if (i == -1) {
          i = bgp.a(paramContext);
        }
      } while (i == -1);
      a(paramContext, i);
      return i;
    }
    return j;
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    gjb localgjb = ((giz)mbb.a(paramContext, giz.class)).a(paramInt);
    String str1 = localgjb.b("account_name");
    String str2 = localgjb.b("gaia_id");
    paramContext.getSharedPreferences("DreamSettings", 0).edit().putString("selected_account_gaia_id", 1 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + ":" + str2).commit();
  }
  
  public static Set<String> b(Context paramContext, int paramInt)
  {
    if (paramInt == -1) {
      return new HashSet();
    }
    return new HashSet(c(paramContext, paramInt).getStringSet("selected_clusters", new HashSet()));
  }
  
  public static SharedPreferences c(Context paramContext, int paramInt)
  {
    String str1 = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id");
    String str2 = String.valueOf("DreamSettings");
    String str3 = String.valueOf(str1);
    if (str3.length() != 0) {}
    for (String str4 = str2.concat(str3);; str4 = new String(str2)) {
      return paramContext.getSharedPreferences(str4, 0);
    }
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    setInteractive(false);
    setFullscreen(true);
    int i = a(this);
    Set localSet;
    if (i != -1)
    {
      localSet = b(this, i);
      if ((localSet == null) || (localSet.isEmpty())) {
        break label70;
      }
      setContentView(efj.ty);
    }
    for (;;)
    {
      this.a = ((DreamViewFlipper)findViewById(aaw.cN));
      return;
      localSet = null;
      break;
      label70:
      setContentView(efj.tx);
    }
  }
  
  public void onDreamingStarted()
  {
    super.onDreamingStarted();
    if (this.a != null)
    {
      DreamViewFlipper localDreamViewFlipper = this.a;
      if (!localDreamViewFlipper.l)
      {
        localDreamViewFlipper.l = true;
        localDreamViewFlipper.k = false;
        localDreamViewFlipper.f = new ArrayList(b(this, a(this)));
        localDreamViewFlipper.g = 0;
        localDreamViewFlipper.a((String)localDreamViewFlipper.f.get(localDreamViewFlipper.g));
      }
    }
  }
  
  public void onDreamingStopped()
  {
    super.onDreamingStopped();
    if (this.a != null) {
      this.a.a();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.plus.service.EsDreamService
 * JD-Core Version:    0.7.0.1
 */