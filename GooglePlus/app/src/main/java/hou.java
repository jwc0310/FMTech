import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

public final class hou
  extends mca
  implements View.OnClickListener, cw<Cursor>
{
  boolean Z;
  ListView a;
  public hoz aa;
  iel ab;
  private final HashSet<Integer> ac = new HashSet(3);
  private CharSequence ad;
  private CharSequence ae;
  private hoy af;
  private git ag;
  private boolean ah;
  private boolean ai;
  private boolean aj;
  private boolean ak;
  private boolean al;
  private Bundle am;
  private int an;
  private final hhp ao;
  private final Map<String, jgs> ap;
  private final Map<String, hps> aq;
  private ArrayList<gnb> ar;
  private View as;
  private guf at;
  String b;
  public String c;
  String d;
  
  public hou()
  {
    hph localhph = new hph(this.bp);
    this.bo.a(hhp.class, localhph);
    this.ao = ((hph)localhph);
    this.ap = new kl();
    this.aq = new kl();
    this.at = new hov(this);
    new gug(this.bp, (byte)0).a(this.bo).a(hhp.a, this.at);
  }
  
  private final void v()
  {
    int i = 1;
    if (this.ac.isEmpty())
    {
      Cursor localCursor = x();
      this.af.a(i, localCursor);
      w();
      if (localCursor == null) {
        break label61;
      }
    }
    for (;;)
    {
      if (((i != 0) || (this.ai)) && (this.as != null)) {
        this.as.setVisibility(0);
      }
      return;
      label61:
      i = 0;
    }
  }
  
  private final void w()
  {
    if (!this.ah) {
      return;
    }
    hqr localhqr = new hqr(new String[] { "_id" });
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(0);
    localhqr.a(arrayOfObject);
    this.af.a(2, localhqr);
  }
  
  private final Cursor x()
  {
    int i = 0;
    ArrayList localArrayList = this.ar;
    Object localObject = null;
    if (localArrayList == null) {
      return localObject;
    }
    kig localkig = new kig(5);
    localkig.a(this.bn, this.ar);
    Map localMap1 = this.ap;
    Map localMap2 = this.aq;
    boolean bool1;
    if ((this.al) || (!this.am.getBoolean("allowPublic", false))) {
      bool1 = true;
    }
    for (;;)
    {
      boolean bool2;
      gnb[] arrayOfgnb;
      if (!this.am.getBoolean("allowDomain", false))
      {
        bool2 = true;
        arrayOfgnb = localkig.a(null, localMap1, localMap2, null, bool1, bool2);
        int j = arrayOfgnb.length;
        localObject = null;
        if (j <= 0) {
          break;
        }
        localObject = new hqr(hpa.a, arrayOfgnb.length);
        label132:
        if (i >= arrayOfgnb.length) {
          break;
        }
      }
      try
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = gnl.a(arrayOfgnb[i]);
        ((hqr)localObject).a(arrayOfObject);
        label162:
        i++;
        break label132;
        bool1 = false;
        continue;
        bool2 = false;
      }
      catch (IOException localIOException)
      {
        break label162;
      }
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(this.bn);
    View localView1 = localLayoutInflater.inflate(aau.zE, paramViewGroup, false);
    this.a = ((ListView)localView1.findViewById(16908298));
    ListView localListView1 = this.a;
    View localView2;
    if (this.ak)
    {
      localView2 = localLayoutInflater.inflate(aau.zB, localListView1, false);
      if (this.ad != null) {
        ((TextView)localView2.findViewById(efj.JY)).setText(this.ad);
      }
      this.a.addHeaderView(localView2);
      this.a.setHeaderDividersEnabled(false);
      ListView localListView2 = this.a;
      if ((!this.ak) && (this.aj))
      {
        View localView3 = localLayoutInflater.inflate(aau.zD, localListView2, false);
        if (this.ae != null) {
          ((TextView)localView3.findViewById(efj.JT)).setText(this.ae);
        }
        localView3.setOnClickListener(new gxn(this));
        efj.a(localView3, new gxq(pjn.m));
        this.a.addFooterView(localView3);
      }
      this.a.setAdapter(this.af);
      if ((!this.ah) || (!this.aj)) {
        break label501;
      }
      Resources localResources = g();
      this.ab = new iel(this.bn);
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
      this.ab.setLayoutParams(localLayoutParams);
      this.ab.addView(localView1);
      int i = localResources.getDimensionPixelSize(efj.Jx);
      int j = localResources.getDimensionPixelSize(efj.Jv);
      int k = localResources.getDimensionPixelSize(efj.Jw);
      iel localiel = this.ab;
      int m = ehr.cd;
      String str1 = g().getString(m);
      int n = ehr.cf;
      String str2 = g().getString(n);
      int i1 = ((git)mbb.a(this.bn, git.class)).c();
      Intent localIntent = ((hpo)mbb.a(this.bn, hpo.class)).c(i1);
      ied localied = new ied(i1, pkh.K, str1, str2, 3);
      localied.f = this.bn.getString(ehr.ce);
      localied.g = localIntent;
      localiel.b = localied;
      this.ab.c = i;
      this.ab.d = j;
      this.ab.e = k;
    }
    label501:
    for (Object localObject = this.ab;; localObject = localView1)
    {
      this.as = ((View)localObject);
      this.as.setVisibility(8);
      return this.as;
      localView2 = localLayoutInflater.inflate(aau.zF, localListView1, false);
      break;
    }
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    int i = this.ag.c();
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return new hmh(this.bn, i, null, this.al, this.am);
    case 1: 
      return new jma(this.bn, i, 5);
    }
    mbf localmbf = this.bn;
    String str = ((gnz)mbb.a(this.bn, gnz.class)).b();
    return new hqj(localmbf, new Uri.Builder().scheme("content").authority(str).appendPath("account_status").appendQueryParameter("account", String.valueOf(i)).build(), gna.a, null, null, null);
  }
  
  public final void a(Activity paramActivity)
  {
    super.a(paramActivity);
    this.af = new hoy(this, this.bn);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.ac.clear();
    Bundle localBundle = this.m;
    if (localBundle != null)
    {
      this.b = localBundle.getString("from_collexion_id");
      this.aj = localBundle.getBoolean("show_reshare_shortcut", true);
      this.ak = localBundle.getBoolean("show_quick_collect_header", false);
      this.al = localBundle.getBoolean("restrict_to_domain", false);
      this.am = localBundle.getBundle("collexion_visibility_type");
      this.ai = localBundle.getBoolean("is_share_to_space", false);
      this.ah = localBundle.getBoolean("show_create_collexion_shortcut", true);
      this.ad = localBundle.getCharSequence("custom_list_title", null);
      this.ae = localBundle.getCharSequence("custom_reshare_label", null);
    }
    this.ao.a(this.am);
    if (this.ai)
    {
      this.ac.add(Integer.valueOf(0));
      k().a(0, null, this);
      return;
    }
    this.ac.add(Integer.valueOf(1));
    k().a(1, null, this);
    this.ac.add(Integer.valueOf(0));
    k().a(0, null, this);
    this.ac.add(Integer.valueOf(2));
    k().a(2, null, this);
  }
  
  public final void a(fu<Cursor> paramfu)
  {
    this.af.a(0, null);
    this.af.a(1, null);
    this.af.a(2, null);
    switch (paramfu.i)
    {
    }
    for (;;)
    {
      this.ac.clear();
      return;
      this.aq.clear();
      continue;
      this.ap.clear();
      continue;
      this.ar = null;
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.ag = ((git)this.bo.a(git.class));
  }
  
  public final void d_()
  {
    super.d_();
    this.a = null;
  }
  
  public final void onClick(View paramView)
  {
    if (this.aa == null) {}
    Object localObject;
    do
    {
      return;
      int i = paramView.getId();
      if (i == efj.JT)
      {
        this.aa.aB_();
        return;
      }
      if (i == efj.JR)
      {
        this.aa.b();
        return;
      }
      localObject = paramView.getTag();
    } while ((localObject instanceof gnb));
    if ((localObject instanceof hps))
    {
      hps localhps = (hps)localObject;
      this.c = localhps.a;
      this.d = localhps.b;
      this.Z = localhps.c;
      this.aa.aA_();
      return;
    }
    this.c = null;
    this.d = null;
    this.Z = false;
  }
  
  public final void p_()
  {
    super.p_();
    v();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hou
 * JD-Core Version:    0.7.0.1
 */