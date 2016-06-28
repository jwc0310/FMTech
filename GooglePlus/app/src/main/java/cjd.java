import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import java.util.ArrayList;

public final class cjd
  extends cjx
  implements gzi, jjc
{
  ArrayList<String> Z = new ArrayList();
  String a;
  private gpl aa;
  private final cw<Cursor> ab = new cje(this);
  String b;
  cjj c;
  boolean d;
  
  public cjd()
  {
    new gzc(this, new cjl(this));
    new jie(this.bp).d = this;
  }
  
  protected final void A() {}
  
  public final int R_()
  {
    return 10;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    a(this.c);
    return localView;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    int i = this.am.c();
    cjg localcjg = new cjg(this);
    return new jma(this.bn, i, 1, localcjg);
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    default: 
      super.a(paramInt1, paramInt2, paramIntent);
    }
    do
    {
      return;
      if (paramInt2 == -1)
      {
        cv localcv = k();
        localcv.b(2, null, this.ab);
        localcv.b(0, null, this);
        return;
      }
    } while (paramInt2 != 1);
    bxg.a(f());
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    ((gzj)this.bo.a(gzj.class)).a.add(this);
    if (paramBundle != null)
    {
      this.a = paramBundle.getString("selected_circle_id");
      this.b = paramBundle.getString("circle_name");
      this.Z = paramBundle.getStringArrayList("shown_person_ids");
      this.d = paramBundle.getBoolean("is_following_circle", false);
    }
    long l = this.am.f().a("following_circle_id_last_sync", 0L);
    if (System.currentTimeMillis() - l > cxd.a)
    {
      if (jid.a()) {
        jid.a("PeopleCircleListFmt", "Starting getFollowingCircleIdTask.");
      }
      cxd localcxd = new cxd(this.bn, this.am.c());
      this.ap.b(localcxd);
    }
    this.c = new cjj(this, f(), null);
    this.ar.a(new cjf(this));
    k().a(2, null, this.ab);
  }
  
  public final void a(fu<Cursor> paramfu, Cursor paramCursor)
  {
    super.a(paramfu, paramCursor);
    switch (paramfu.i)
    {
    }
    do
    {
      return;
    } while ((paramCursor == null) || (paramCursor.isClosed()) || (!paramCursor.moveToFirst()) || (this.a == null));
    this.b = paramCursor.getString(2);
    this.ac.a();
  }
  
  public final void a(gpr paramgpr)
  {
    super.a(paramgpr);
    paramgpr.a(this.b);
    if (!TextUtils.equals(this.a, "15"))
    {
      if (!this.d) {
        paramgpr.b(aaw.cm);
      }
      paramgpr.b(aaw.bo);
    }
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    boolean bool1 = true;
    if (paramString.equals("RemoveCircleTask"))
    {
      jid.a("PeopleCircleListFmt", "RemoveCircleTask completed.");
      if (paramhae.b != 200)
      {
        if (!bool1) {
          break label75;
        }
        if (jid.a()) {
          jid.a("PeopleCircleListFmt", "Remove circle failed.");
        }
        L();
        Toast.makeText(f(), aau.uV, 0).show();
      }
    }
    label75:
    do
    {
      return;
      bool1 = false;
      break;
      if (jid.a()) {
        jid.a("PeopleCircleListFmt", "Starting loadCirclesTask.");
      }
      bnl localbnl = new bnl(this.bn, "LoadCirclesTask", this.am.c());
      this.ap.b(localbnl);
      return;
      if (paramString.equals("LoadCirclesTask"))
      {
        jid.a("PeopleCircleListFmt", "LoadCirclesTask completed.");
        if (jid.a()) {
          jid.a("PeopleCircleListFmt", "Remove circle succeeded.");
        }
        L();
        Toast.makeText(f(), aau.uQ, 0).show();
        f().finish();
        return;
      }
    } while (!paramString.equals("GetFollCircleIdTask"));
    if (jid.a()) {
      jid.a("PeopleCircleListFmt", "GetFollowingCircleIdTask completed.");
    }
    String str = this.am.f().a("following_circle_id", null);
    boolean bool2 = this.d;
    if ((str != null) && (str.equals(this.a))) {}
    for (;;)
    {
      this.d = bool1;
      if (bool2 == this.d) {
        break;
      }
      this.aa.b();
      return;
      bool1 = false;
    }
  }
  
  public final void a(String paramString1, String paramString2, boolean paramBoolean, String paramString3, int paramInt)
  {
    if (TextUtils.equals(this.a, "15"))
    {
      b(paramString1, paramString2, paramString3, paramInt);
      return;
    }
    super.a(paramString1, paramString2, paramBoolean, paramString3, paramInt);
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    int i = paramMenuItem.getItemId();
    if (i == aaw.cm)
    {
      if (this.a != null)
      {
        cjk localcjk = new cjk();
        localcjk.n = this;
        localcjk.p = 1;
        localcjk.a(this.x, "delete_circle_conf");
      }
      return true;
    }
    if (i == aaw.bo)
    {
      int j = this.am.c();
      a(efj.a(f(), j, this.a, this.d), 2);
      return true;
    }
    return false;
  }
  
  public final void ae_()
  {
    k().b(2, null, this.ab);
  }
  
  public final boolean b(String paramString1, String paramString2, boolean paramBoolean, String paramString3, int paramInt)
  {
    if (TextUtils.equals(this.a, "15")) {
      b(paramString1, paramString2, paramString3, paramInt);
    }
    for (;;)
    {
      return true;
      super.b(paramString1, paramString2, paramBoolean, paramString3, paramInt);
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.aa = ((gpl)this.bo.a(gpl.class));
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putString("selected_circle_id", this.a);
    paramBundle.putString("circle_name", this.b);
    paramBundle.putStringArrayList("shown_person_ids", this.Z);
    paramBundle.putBoolean("is_following_circle", this.d);
  }
  
  protected final CharSequence x()
  {
    if (TextUtils.equals(this.a, "15"))
    {
      int m = aau.hM;
      return g().getString(m);
    }
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    int i = aau.fC;
    localSpannableStringBuilder.append(g().getString(i)).append('\n');
    int j = localSpannableStringBuilder.length();
    int k = aau.fD;
    localSpannableStringBuilder.append(g().getString(k));
    localSpannableStringBuilder.setSpan(new cji(this, ""), j, localSpannableStringBuilder.length(), 18);
    return localSpannableStringBuilder;
  }
  
  protected final void z() {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cjd
 * JD-Core Version:    0.7.0.1
 */