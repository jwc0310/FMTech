import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.libraries.social.collexions.impl.providers.acl.CollexionAvatarView;

public final class hob
  extends mca
  implements cw<Cursor>, gos, gpb, hrd, hrx, lzp
{
  private boolean Z;
  private Cursor a;
  private hrs aa;
  private goi ab;
  private boolean ac;
  private hrf b;
  private int c;
  private String d;
  
  public hob()
  {
    new gxl(new gxq(pjn.aa)).a(this.bo);
  }
  
  private final void a(Cursor paramCursor)
  {
    this.a = paramCursor;
    if (this.b != null) {
      this.b.aL_();
    }
  }
  
  private final void c(Parcelable paramParcelable)
  {
    this.aa.a();
    this.aa.a(paramParcelable);
    this.ab.a(-1);
  }
  
  private void y()
  {
    if (TextUtils.isEmpty(this.d))
    {
      a(new MatrixCursor(hoi.a));
      return;
    }
    k().b(1, null, this);
  }
  
  public final int a(Context paramContext)
  {
    return 1;
  }
  
  public final Parcelable a(int paramInt)
  {
    if ((this.a != null) && (this.a.moveToPosition(paramInt)))
    {
      Cursor localCursor = this.a;
      String str1 = localCursor.getString(localCursor.getColumnIndexOrThrow("cover_photo_url"));
      hpr localhpr = hpp.a();
      localhpr.b = str1;
      String str2 = this.a.getString(this.a.getColumnIndexOrThrow("cxn_id"));
      String str3 = this.a.getString(this.a.getColumnIndexOrThrow("cxn_name"));
      if (this.a.getInt(this.a.getColumnIndexOrThrow("sharing_target_group_type")) == 2) {}
      for (boolean bool = true;; bool = false)
      {
        localhpr.a = new hps(str2, str3, bool);
        return new hpp(localhpr);
      }
    }
    return null;
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    return new hmh(this.bn, this.c, this.d, this.Z, this.ac);
  }
  
  public final void a(Context paramContext, int paramInt, View paramView, boolean paramBoolean)
  {
    paramView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    hpp localhpp = (hpp)a(paramInt);
    CollexionAvatarView localCollexionAvatarView;
    int j;
    int i;
    if (localhpp != null)
    {
      localCollexionAvatarView = (CollexionAvatarView)paramView.findViewById(aau.zu);
      localCollexionAvatarView.a(localhpp.b);
      if ((this.a == null) || (!this.a.moveToPosition(paramInt))) {
        break label173;
      }
      j = this.a.getColumnIndexOrThrow("color");
      if (!this.a.isNull(j)) {
        break label157;
      }
      i = aaw.oL;
    }
    for (;;)
    {
      localCollexionAvatarView.a(i);
      hps localhps = localhpp.a;
      ((TextView)paramView.findViewById(aau.zv)).setText(localhps.b);
      efj.a(paramView, new kuu(pjn.X, localhps.a));
      return;
      label157:
      i = this.a.getInt(j);
      continue;
      label173:
      i = aaw.oL;
    }
  }
  
  public final void a(Context paramContext, View paramView) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null) {
      this.d = paramBundle.getString("state_query");
    }
  }
  
  public final void a(Parcelable paramParcelable)
  {
    if ((this.aa != null) && ((paramParcelable instanceof hpp)))
    {
      if (this.aa.c(paramParcelable)) {
        this.aa.b(paramParcelable);
      }
    }
    else {
      return;
    }
    if (!this.aa.b())
    {
      gpa.a(paramParcelable, this).a(this.x, "RemoveCirclesWarning");
      return;
    }
    c(paramParcelable);
  }
  
  public final void a(View paramView) {}
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(hrf paramhrf)
  {
    this.b = paramhrf;
  }
  
  public final void a(String paramString)
  {
    if (paramString != null)
    {
      String str = this.d;
      this.d = paramString.trim();
      if (!this.d.equals(str)) {
        y();
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    this.Z = paramBoolean;
    this.a = null;
    y();
  }
  
  public final View b(Context paramContext)
  {
    return LayoutInflater.from(paramContext).inflate(efj.Jq, null);
  }
  
  public final void b(Parcelable paramParcelable)
  {
    c(paramParcelable);
  }
  
  public final View c(Context paramContext)
  {
    return null;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.c = ((git)this.bo.a(git.class)).c();
    this.ab = ((goi)this.bo.a(goi.class));
    lzo locallzo = (lzo)this.bo.b(lzo.class);
    if (locallzo != null) {
      locallzo.a(this);
    }
    gor localgor = (gor)this.bo.b(gor.class);
    if (localgor != null) {
      localgor.a(this);
    }
    for (this.Z = localgor.a();; this.Z = false)
    {
      this.aa = ((hrs)this.bo.b(hrs.class));
      hhj localhhj = (hhj)this.bo.b(hhj.class);
      if (localhhj != null) {
        this.ac = localhhj.a;
      }
      return;
    }
  }
  
  public final View d(Context paramContext)
  {
    return null;
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putString("state_query", this.d);
  }
  
  public final void p_()
  {
    super.p_();
    y();
  }
  
  public final boolean v()
  {
    return false;
  }
  
  public final boolean w()
  {
    return false;
  }
  
  public final int x()
  {
    if (this.a != null) {
      return this.a.getCount();
    }
    return 0;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hob
 * JD-Core Version:    0.7.0.1
 */