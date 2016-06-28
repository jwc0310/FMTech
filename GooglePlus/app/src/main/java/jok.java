import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.libraries.social.people.providers.search.PersonSearchRowView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class jok
  extends mca
  implements gos, hrd, jjn, lzp
{
  private String Z;
  private hrf a;
  private jjo aa;
  private jix ab;
  private boolean ac;
  private lzo ad;
  private hrs ae;
  private int b;
  private jiw c;
  private List<jjg> d;
  
  private final void b(List<jjg> paramList)
  {
    ArrayList localArrayList;
    if ((this.ac) && (paramList != null))
    {
      localArrayList = new ArrayList();
      for (int i = 0; i < paramList.size(); i++)
      {
        jjg localjjg = (jjg)paramList.get(i);
        if (localjjg.k() == 2) {
          localArrayList.add(localjjg);
        }
      }
    }
    for (this.d = c(localArrayList);; this.d = c(paramList))
    {
      if (this.a != null) {
        this.a.aL_();
      }
      return;
    }
  }
  
  private final List<jjg> c(List<jjg> paramList)
  {
    if (paramList == null) {
      return Collections.emptyList();
    }
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramList.size(); i++)
    {
      jjg localjjg = (jjg)paramList.get(i);
      if ((!(this.ae instanceof hrr)) || (!((hrr)this.ae).a(170, localjjg.a()))) {
        localArrayList.add(localjjg);
      }
    }
    return localArrayList;
  }
  
  private void y()
  {
    if (this.c != null)
    {
      this.aa.c = this.Z;
      if (!TextUtils.isEmpty(this.Z)) {
        this.c.a(this, this.b, this.aa);
      }
    }
  }
  
  public final int a(Context paramContext)
  {
    return 1;
  }
  
  public final Parcelable a(int paramInt)
  {
    return (Parcelable)this.d.get(paramInt);
  }
  
  public final void a(Context paramContext, int paramInt, View paramView, boolean paramBoolean)
  {
    jjg localjjg = (jjg)this.d.get(paramInt);
    ((PersonSearchRowView)paramView).a(localjjg);
    String str = localjjg.c();
    if (str != null) {
      efj.a(paramView, new kvk(pkd.s, str));
    }
  }
  
  public final void a(Context paramContext, View paramView) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null) {
      this.Z = paramBundle.getString("state_query");
    }
  }
  
  public final void a(View paramView) {}
  
  public final void a(hrf paramhrf)
  {
    this.a = paramhrf;
  }
  
  public final void a(String paramString)
  {
    if (paramString != null)
    {
      String str = this.Z;
      this.Z = paramString.trim();
      if (!this.Z.equals(str))
      {
        if (!TextUtils.isEmpty(this.Z)) {
          break label44;
        }
        b(null);
      }
    }
    return;
    label44:
    y();
  }
  
  public final void a(List<jjg> paramList)
  {
    b(paramList);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.ac = paramBoolean;
    b(null);
    y();
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
    this.b = ((git)this.bo.a(git.class)).c();
    this.c = ((jiw)this.bo.a(jiw.class));
    this.ab = this.c.c();
    this.ae = ((hrs)this.bo.b(hrs.class));
    this.ad = ((lzo)this.bo.b(lzo.class));
    if (this.ad != null) {
      this.ad.a(this);
    }
    this.aa = ((jjo)this.bo.b(jjo.class));
    if (this.aa == null) {
      this.aa = new jjo();
    }
    gor localgor = (gor)this.bo.b(gor.class);
    if (localgor != null)
    {
      localgor.a(this);
      this.ac = localgor.a();
      return;
    }
    this.ac = false;
  }
  
  public final View d(Context paramContext)
  {
    return null;
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putString("state_query", this.Z);
  }
  
  public final void p_()
  {
    super.p_();
    this.ab.d();
    y();
  }
  
  public final void q_()
  {
    super.q_();
    this.ab.e();
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
    if (this.d == null) {
      return 0;
    }
    return this.d.size();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jok
 * JD-Core Version:    0.7.0.1
 */