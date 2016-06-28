import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.libraries.social.acl2.AclPickerActionBarView;
import com.google.android.libraries.social.people.providers.search.PersonSearchRowView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class joj
  extends mca
  implements hrd, hrf, hrx
{
  private hrf Z;
  private String a = "peopleSearchAggregator";
  private List<jjg> aa = new ArrayList();
  private job ab = new job();
  private hrs ac;
  private lzo ad;
  private goa ae;
  private hrg b;
  private List<hrd> c;
  private int d;
  
  public final int a(Context paramContext)
  {
    return 1;
  }
  
  public final Parcelable a(int paramInt)
  {
    return (Parcelable)this.aa.get(paramInt);
  }
  
  public final void a(Context paramContext, int paramInt, View paramView, boolean paramBoolean)
  {
    jjg localjjg = (jjg)this.aa.get(paramInt);
    ((PersonSearchRowView)paramView).a(localjjg);
    String str = localjjg.c();
    if (str != null) {
      efj.a(paramView, new kvk(pkd.s, str));
    }
    if (paramInt >= -10 + this.aa.size())
    {
      job localjob = this.ab;
      if (localjob.a != null) {
        localjob.a.y();
      }
    }
  }
  
  public final void a(Context paramContext, View paramView) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle == null)
    {
      this.c = new ArrayList();
      for (int i = 0; i < this.d; i++)
      {
        hrd localhrd = (hrd)this.b.get(i);
        localhrd.a(this);
        cl localcl = h().a();
        bk localbk = (bk)localhrd;
        String str = this.a;
        localcl.a(localbk, 11 + String.valueOf(str).length() + str + i).b();
        this.c.add(localhrd);
      }
    }
  }
  
  public final void a(Parcelable paramParcelable)
  {
    jne localjne;
    if ((this.ac != null) && ((paramParcelable instanceof jjg)))
    {
      jng localjng = jne.a();
      localjng.a = ((jjg)paramParcelable);
      localjne = new jne(localjng);
      if (!this.ac.c(localjne)) {
        break label108;
      }
      this.ac.b(localjne);
    }
    for (;;)
    {
      if (this.ad != null) {
        this.ad.a.a(null, true);
      }
      if (this.ae != null)
      {
        goa localgoa = this.ae;
        if (localgoa.a != null) {
          localgoa.a.a();
        }
      }
      return;
      label108:
      this.ac.a(localjne);
    }
  }
  
  public final void a(View paramView) {}
  
  public final void a(hrf paramhrf)
  {
    this.Z = paramhrf;
  }
  
  public final void aL_()
  {
    ArrayList localArrayList = new ArrayList();
    HashSet localHashSet = new HashSet();
    for (int i = 0; i < this.c.size(); i++)
    {
      hrd localhrd = (hrd)this.c.get(i);
      int j = localhrd.x();
      for (int k = 0; k < j; k++)
      {
        jjg localjjg = (jjg)localhrd.a(k);
        if (!localHashSet.contains(localjjg.a()))
        {
          localArrayList.add(localjjg);
          localHashSet.add(localjjg.a());
        }
      }
    }
    this.aa = localArrayList;
    if (this.Z != null) {
      this.Z.aL_();
    }
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
    this.bo.a(job.class, this.ab);
    this.ac = ((hrs)this.bo.b(hrs.class));
    this.ad = ((lzo)this.bo.b(lzo.class));
    this.b = ((hrg)((jol)this.bo.a(jol.class)).c());
    this.d = this.b.size();
    this.ae = ((goa)this.bo.b(goa.class));
  }
  
  public final View d(Context paramContext)
  {
    return null;
  }
  
  public final void p_()
  {
    super.p_();
    if (this.c == null)
    {
      this.c = new ArrayList();
      List localList = h().f();
      if ((localList != null) && (!localList.isEmpty())) {
        for (int i = 0; i < localList.size(); i++)
        {
          bk localbk = (bk)localList.get(i);
          if (localbk != null)
          {
            String str1 = localbk.D;
            String str2 = this.a;
            if (TextUtils.equals(str1, 11 + String.valueOf(str2).length() + str2 + i))
            {
              hrd localhrd = (hrd)localbk;
              this.c.add(localhrd);
              localhrd.a(this);
            }
          }
        }
      }
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
    return this.aa.size();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     joj
 * JD-Core Version:    0.7.0.1
 */