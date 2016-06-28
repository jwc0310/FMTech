import android.app.Activity;
import android.content.Intent;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.RecyclerListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.plus.service.EsService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

public abstract class bzr
  extends bzo
  implements AbsListView.RecyclerListener, AdapterView.OnItemClickListener, gzi, hgh
{
  private final DataSetObserver Z;
  public ListView a;
  private final dme aa;
  private jly b;
  private Integer c;
  private hvj d;
  
  public bzr()
  {
    new Handler();
    this.Z = new bzs(this);
    this.aa = new bzt(this);
  }
  
  public final Integer B()
  {
    return null;
  }
  
  public final Integer C()
  {
    return null;
  }
  
  public abstract View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup);
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = a(paramLayoutInflater, paramViewGroup);
    this.a = ((ListView)localView.findViewById(16908298));
    this.a.setAdapter(w());
    this.a.setOnItemClickListener(this);
    this.a.setRecyclerListener(this);
    return localView;
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt2 == -1) && (paramInt1 == 0))
    {
      String str1 = paramIntent.getStringExtra("person_id");
      String str2 = paramIntent.getStringExtra("display_name");
      ArrayList localArrayList = paramIntent.getStringArrayListExtra("selected_circle_ids");
      bnp localbnp = new bnp(f());
      localbnp.a = v();
      localbnp.b = str1;
      localbnp.c = str2;
      localbnp.d = R_();
      localbnp.e = localArrayList;
      localbnp.f = null;
      localbnp.g = true;
      localbnp.h = false;
      localbnp.i = false;
      bno localbno = localbnp.a();
      gzj localgzj = this.ap;
      localgzj.d.a(localbno, false);
      localgzj.b(localbno);
      this.d = new hvj(this.bn, (gxx)this.bo.a(gxx.class), str1, localArrayList, null, this);
    }
    super.a(paramInt1, paramInt2, paramIntent);
  }
  
  protected final void a(int paramInt, dmx paramdmx)
  {
    if ((this.c == null) || (paramInt != this.c.intValue())) {}
    for (;;)
    {
      return;
      bj localbj = (bj)this.x.a("req_pending");
      if (localbj != null) {
        localbj.a(false);
      }
      this.c = null;
      if (paramdmx != null)
      {
        if (paramdmx.c != 200) {}
        for (int i = 1; i != 0; i = 0)
        {
          Toast.makeText(f(), aau.uV, 0).show();
          return;
        }
      }
    }
  }
  
  public void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.b = new jly(this.bn, k(), v());
    jly localjly = this.b;
    DataSetObserver localDataSetObserver = this.Z;
    localjly.b.registerObserver(localDataSetObserver);
  }
  
  public void a(Bundle paramBundle)
  {
    if ((paramBundle != null) && (paramBundle.containsKey("request_id"))) {
      this.c = Integer.valueOf(paramBundle.getInt("request_id"));
    }
    super.a(paramBundle);
    this.ap.a.add(this);
    jly localjly = this.b;
    localjly.a.a(localjly.d, null, localjly);
    h(paramBundle);
    this.d = hvj.a(this.bn, (gxx)this.bo.a(gxx.class), paramBundle);
  }
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (("ModifyCircleMembershipsTask".equals(paramString)) && (this.d != null))
    {
      if (hae.a(paramhae)) {
        break label45;
      }
      int i = v();
      this.d.a(i);
    }
    for (;;)
    {
      this.d = null;
      return;
      label45:
      Toast.makeText(f(), paramhae.d, 0).show();
    }
  }
  
  public final void c(String paramString1, String paramString2, String paramString3)
  {
    int i = v();
    a(efj.a(f(), i, paramString1, paramString2, paramString3, null, null, false), 0);
  }
  
  public void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.c != null) {
      paramBundle.putInt("request_id", this.c.intValue());
    }
    if (this.d != null) {
      this.d.a(paramBundle);
    }
  }
  
  public void e(View paramView)
  {
    if ((!x()) || (!this.b.c)) {}
    for (int i = 1; i != 0; i = 0)
    {
      a(paramView);
      return;
    }
    if (z()) {
      paramView.findViewById(aaw.jD).setVisibility(0);
    }
    do
    {
      d(paramView);
      return;
      paramView.findViewById(aaw.jD).setVisibility(8);
    } while (!A());
    ((TextView)paramView.findViewById(aaw.eA)).setText(0);
    c(paramView);
  }
  
  public abstract void h(Bundle paramBundle);
  
  public final void m()
  {
    super.m();
    EsService.a(this.bn, this.aa);
    if (this.c != null)
    {
      int i = this.c.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i)))
      {
        dmx localdmx = EsService.a(this.c.intValue());
        a(this.c.intValue(), localdmx);
        this.c = null;
      }
    }
    e(this.N);
  }
  
  public final void n()
  {
    super.n();
    dme localdme = this.aa;
    EsService.d.remove(localdme);
  }
  
  public void onMovedToScrapHeap(View paramView)
  {
    if ((paramView instanceof lxj)) {
      ((lxj)paramView).D_();
    }
  }
  
  public final gya r_()
  {
    return gya.q;
  }
  
  public final int v()
  {
    return f().getIntent().getIntExtra("account_id", -1);
  }
  
  public abstract ListAdapter w();
  
  public abstract boolean x();
  
  public abstract boolean z();
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bzr
 * JD-Core Version:    0.7.0.1
 */