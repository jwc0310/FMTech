package com.google.android.libraries.social.profile.suspension.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import az;
import efj;
import git;
import gjp;
import gxv;
import gya;
import gzi;
import gzj;
import haa;
import hae;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jye;
import jyo;
import mbb;
import mbp;
import nvf;
import nwz;
import qas;
import qat;

public final class ProfileSuspensionActivity
  extends mbp
  implements gxv, gzi
{
  public final git d = new gjp(this, this.n).a(this.m);
  public gzj e;
  public jye f;
  
  protected final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.m.a(gxv.class, this);
    this.e = ((gzj)this.m.a(gzj.class));
    this.f = ((jye)this.m.a(jye.class));
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    paramhaa.c = false;
    startActivityForResult(this.f.a(paramhae, this, this.d.c()), 1);
  }
  
  public final void b(Bundle paramBundle) {}
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 1) && (paramInt2 == -1))
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("name_violation", true);
      setResult(-1, localIntent);
      finish();
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(efj.TQ);
    TextView localTextView1 = (TextView)findViewById(az.v);
    TextView localTextView2 = (TextView)findViewById(az.t);
    LinearLayout localLinearLayout = (LinearLayout)findViewById(az.s);
    Bundle localBundle = getIntent().getExtras();
    localTextView1.setText(localBundle.getString("extra_title"));
    localTextView2.setText(localBundle.getString("extra_message"));
    byte[] arrayOfByte = (byte[])localBundle.getSerializable("extra_profile_suspension_info");
    ArrayList localArrayList = new ArrayList();
    try
    {
      Collections.addAll(localArrayList, ((nwz)qat.b(new nwz(), arrayOfByte, 0, arrayOfByte.length)).a);
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        nvf localnvf = (nvf)localIterator.next();
        getLayoutInflater().inflate(efj.TR, localLinearLayout);
        Button localButton = (Button)localLinearLayout.getChildAt(-1 + localLinearLayout.getChildCount());
        localButton.setText(localnvf.b);
        localButton.setOnClickListener(new jyo(this, localnvf));
      }
    }
    catch (qas localqas)
    {
      for (;;)
      {
        localqas.printStackTrace();
      }
    }
  }
  
  public final gya r_()
  {
    return gya.G;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.profile.suspension.impl.ProfileSuspensionActivity
 * JD-Core Version:    0.7.0.1
 */