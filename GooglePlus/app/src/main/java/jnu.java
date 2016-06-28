import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.libraries.social.people.providers.search.PersonSearchRowView;
import java.util.List;
import java.util.Map;

public final class jnu
  extends mca
  implements gos, hrd, joc, lzp
{
  boolean Z = true;
  int a;
  boolean aa;
  jnr ab;
  List<jnx> ac;
  private hrf ad;
  private boolean ae = false;
  private hrs af;
  private List<jjg> ag;
  String b;
  Map<String, jjg> c;
  String d;
  
  private final void a(List<jjg> paramList)
  {
    this.ag = paramList;
    this.ae = false;
    if (this.ad != null) {
      this.ad.aL_();
    }
  }
  
  private void z()
  {
    k().b(1, null, new jnw(this));
  }
  
  public final int a(Context paramContext)
  {
    return 1;
  }
  
  public final Parcelable a(int paramInt)
  {
    return (Parcelable)this.ag.get(paramInt);
  }
  
  public final void a(Context paramContext, int paramInt, View paramView, boolean paramBoolean)
  {
    jjg localjjg = (jjg)this.ag.get(paramInt);
    ((PersonSearchRowView)paramView).a(localjjg);
    String str = localjjg.c();
    if (str != null) {
      efj.a(paramView, new kvk(pkd.s, str));
    }
    if (paramInt >= -10 + x()) {
      y();
    }
  }
  
  public final void a(Context paramContext, View paramView) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null) {
      this.b = paramBundle.getString("state_query");
    }
  }
  
  public final void a(View paramView) {}
  
  public final void a(hrf paramhrf)
  {
    this.ad = paramhrf;
  }
  
  public final void a(String paramString)
  {
    if (paramString != null)
    {
      String str = this.b;
      this.b = paramString.trim();
      if (!this.b.equals(str))
      {
        if (this.b.length() < this.ab.a) {
          break label65;
        }
        this.ag = null;
        this.d = null;
        this.Z = true;
        z();
      }
    }
    return;
    label65:
    a(null);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.aa = paramBoolean;
    a(null);
    this.d = null;
    this.Z = true;
    z();
  }
  
  public final View b(Context paramContext)
  {
    return a_(null).inflate(efj.SL, null);
  }
  
  public final View c(Context paramContext)
  {
    return null;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((git)this.bo.a(git.class)).c();
    this.ab = ((jnr)this.bo.b(jnr.class));
    if (this.ab == null) {
      this.ab = new jnr();
    }
    lzo locallzo = (lzo)this.bo.b(lzo.class);
    if (locallzo != null) {
      locallzo.a(this);
    }
    if (paramBundle == null)
    {
      job localjob = (job)this.bo.b(job.class);
      if (localjob != null)
      {
        if (localjob.a != null) {
          throw new IllegalStateException("Cannot have more than one data provider bound!");
        }
        localjob.a = this;
      }
    }
    gor localgor = (gor)this.bo.b(gor.class);
    if (localgor != null) {
      localgor.a(this);
    }
    this.af = ((hrs)this.bo.b(hrs.class));
  }
  
  public final View d(Context paramContext)
  {
    return null;
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putString("state_query", this.b);
  }
  
  public final void p_()
  {
    super.p_();
    k().a(2, null, new jnv(this));
    if (!TextUtils.isEmpty(this.b)) {
      z();
    }
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
    if (this.ag != null) {
      return this.ag.size();
    }
    return 0;
  }
  
  public final void y()
  {
    if ((this.ag != null) && (!this.ae) && (this.Z))
    {
      this.ae = true;
      k().b(1).a();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jnu
 * JD-Core Version:    0.7.0.1
 */