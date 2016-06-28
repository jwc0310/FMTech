import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.google.android.apps.photos.content.GooglePhotosImageProvider;
import com.google.android.apps.plus.service.EsService;
import com.google.android.apps.plus.views.MiniShareTouchHandler;
import com.google.android.libraries.social.ui.views.DeprecatedExpandingScrollView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class cda
  extends mca
  implements dxn, gpq, gxv, hdt
{
  boolean Z;
  git a;
  ddd aa;
  View ab;
  Intent ac;
  String ad;
  Animation ae;
  boolean af;
  boolean ag;
  boolean ah;
  String ai;
  SparseArray<gnm> aj;
  ddf ak;
  cdm al;
  final hue am = new hue(this.bp);
  final cw<Intent> an;
  final cw<List<ipn>> ao;
  private String ap;
  private Intent aq;
  private ListView ar;
  private Intent as;
  private gzj at;
  private final cdl au = new cdl(this);
  private final View.OnClickListener av;
  private final View.OnClickListener aw;
  Integer b;
  ArrayList<jpx> c;
  gnb d;
  
  public cda()
  {
    new gpk(this, this.bp, this);
    new hdu(this.bp, this);
    this.av = new cdb(this);
    this.aw = new cdc(this);
    this.an = new cdd(this);
    this.ao = new cdf(this);
  }
  
  private final Uri a(jpx paramjpx, boolean paramBoolean)
  {
    if (paramjpx != null)
    {
      ipf localipf = paramjpx.e();
      if (localipf != null)
      {
        if (localipf.d != null) {}
        for (int i = 1; i != 0; i = 0) {
          return localipf.d;
        }
        if (paramBoolean) {
          return Uri.parse(localipf.c);
        }
        ipm localipm = localipf.e;
        String str1 = localipf.c;
        if (str1 != null)
        {
          String str2 = GooglePhotosImageProvider.a(localipf.e);
          Uri localUri = GooglePhotosImageProvider.a(this.bn, str1, localipm);
          GooglePhotosImageProvider.a(f(), localUri, "android.intent.action.SEND", str2);
          return localUri;
        }
      }
    }
    return null;
  }
  
  private final ArrayList<Uri> a(boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    if (this.c != null) {
      for (int i = 0; i < this.c.size(); i++)
      {
        jpx localjpx = (jpx)this.c.get(i);
        if (localjpx != null)
        {
          Uri localUri = a(localjpx, paramBoolean);
          if (localUri != null) {
            localArrayList.add(localUri);
          }
        }
      }
    }
    return localArrayList;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    bp localbp = f();
    Intent localIntent = localbp.getIntent();
    View localView1 = paramLayoutInflater.inflate(efj.uh, paramViewGroup, false);
    MiniShareTouchHandler localMiniShareTouchHandler = (MiniShareTouchHandler)localView1.findViewById(aaw.lO);
    this.ab = localView1.findViewById(aaw.eD);
    localView1.findViewById(aaw.kb).setVisibility(8);
    View localView2 = this.ab;
    localMiniShareTouchHandler.a = localView2;
    localMiniShareTouchHandler.c = localView2.findViewById(aaw.lK);
    localMiniShareTouchHandler.d = localView2.findViewById(aaw.kb);
    localMiniShareTouchHandler.b = localView2.findViewById(16908298);
    localMiniShareTouchHandler.e = this;
    this.ae = AnimationUtils.loadAnimation(localbp, efj.iJ);
    this.ae.setInterpolator(localbp, efj.iC);
    this.ae.setDuration(250L);
    this.ae.setAnimationListener(new cdg(this, localbp));
    cv localcv;
    if (paramBundle == null)
    {
      if (this.ap == null)
      {
        long l = System.currentTimeMillis();
        String str4 = String.valueOf(mfx.a(32));
        this.ap = (21 + String.valueOf(str4).length() + l + "." + str4);
      }
      Iterator localIterator1 = this.bo.c(ddf.class).iterator();
      while (localIterator1.hasNext())
      {
        ddf localddf = (ddf)localIterator1.next();
        if (localddf.a()) {
          this.ak = localddf;
        }
      }
      if (this.ak == null)
      {
        if (localIntent.hasExtra("shareables")) {
          this.c = localIntent.getParcelableArrayListExtra("shareables");
        }
        if (localIntent.hasExtra("link_url"))
        {
          String str1 = localIntent.getStringExtra("album_id");
          String str2 = localIntent.getStringExtra("album_owner_id");
          String str3 = localIntent.getStringExtra("cluster_id");
          this.aq = efj.a(localbp, this.a.c(), jrf.e(str3), str1, str2, str3);
          this.ad = localIntent.getStringExtra("link_url");
        }
        if (localIntent.hasExtra("embed_client_item"))
        {
          qbe localqbe = new qbe();
          hqw localhqw = (hqw)localIntent.getParcelableExtra("embed_client_item");
          qda localqda = (qda)((qbe)localhqw.a(localqbe)).b(qda.a);
          if (localqda != null)
          {
            this.ai = localqda.b;
            this.as = efj.k(this.bn, this.a.c()).putExtra("embed_client_item", localhqw).putExtra("disable_location", true);
          }
        }
      }
      this.ah = localIntent.getBooleanExtra("activity_is_public", true);
      this.aa = new ddd(localbp);
      ddd localddd1 = this.aa;
      View.OnClickListener localOnClickListener1 = this.av;
      localddd1.a.a(0, localOnClickListener1);
      ddd localddd2 = this.aa;
      View.OnClickListener localOnClickListener2 = this.av;
      localddd2.a.a(1, localOnClickListener2);
      ddd localddd3 = this.aa;
      View.OnClickListener localOnClickListener3 = this.aw;
      localddd3.a.a(2, localOnClickListener3);
      this.ar = ((ListView)localView1.findViewById(16908298));
      localcv = k();
      if (!this.a.e()) {
        break label880;
      }
      localcv.b(0, null, new cdj(this));
    }
    for (;;)
    {
      if ((this.ac != null) && (this.ak != null) && (this.ak.c())) {
        localcv.a(3, null, this.an);
      }
      this.aj = new SparseArray();
      Iterator localIterator2 = this.bo.c(gnm.class).iterator();
      while (localIterator2.hasNext())
      {
        gnm localgnm = (gnm)localIterator2.next();
        this.aj.put(localgnm.a(), localgnm);
      }
      this.c = paramBundle.getParcelableArrayList("attachments");
      if (paramBundle.containsKey("activity_id")) {
        this.ap = paramBundle.getString("activity_id");
      }
      if (paramBundle.containsKey("pending_request")) {
        this.b = Integer.valueOf(paramBundle.getInt("pending_request"));
      }
      if (paramBundle.containsKey("restrict_to_domain")) {
        this.Z = paramBundle.getBoolean("restrict_to_domain");
      }
      if (paramBundle.containsKey("reshare_audience")) {
        this.d = ((gnb)paramBundle.getParcelable("reshare_audience"));
      }
      if (!paramBundle.containsKey("intent_to_start")) {
        break;
      }
      this.ac = ((Intent)paramBundle.getParcelable("intent_to_start"));
      break;
      label880:
      this.ag = true;
    }
    return localView1;
  }
  
  public final void a(int paramInt)
  {
    if (paramInt == 1) {
      this.ab.startAnimation(this.ae);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    bp localbp = f();
    switch (paramInt1)
    {
    default: 
      super.a(paramInt1, paramInt2, paramIntent);
      return;
    case 1: 
      if (paramInt2 == -1)
      {
        a((gnb)paramIntent.getParcelableExtra("extra_acl"));
        return;
      }
      f().setResult(0);
      f().finish();
      return;
    }
    if (paramInt2 == -1) {
      localbp.setResult(paramInt2);
    }
    cdh localcdh = new cdh(this);
    efj.m().post(localcdh);
  }
  
  final void a(gnb paramgnb)
  {
    b("com.google.android.apps.plus");
    if (this.ak != null)
    {
      ddf localddf = this.ak;
      this.a.c();
      a(localddf.b(), 4);
    }
    do
    {
      return;
      if ((this.c != null) && (this.c.size() > 0))
      {
        if (this.c.size() == 1)
        {
          if ((0x44000 & ((jpx)this.c.get(0)).i()) > 0L) {}
          for (int i = 1; i == 0; i = 0)
          {
            ipf localipf = ((jpx)this.c.get(0)).e();
            String str1 = localipf.b.b;
            mbf localmbf = this.bn;
            int j = this.a.c();
            String str2 = Long.toString(localipf.b.a);
            Intent localIntent = EsService.e.a(localmbf, EsService.class);
            localIntent.putExtra("op", 99);
            localIntent.putExtra("account_id", j);
            localIntent.putExtra("owner_id", str1);
            localIntent.putExtra("photo_id", str2);
            this.b = Integer.valueOf(EsService.a(localmbf, localIntent));
            this.d = paramgnb;
            int k = aau.oo;
            a(g().getString(k));
            return;
          }
        }
        a(efj.a(this.bn, this.a.c(), this.c, paramgnb), 2);
        return;
      }
      if (this.aq != null)
      {
        this.aq.putExtra("extra_acl", paramgnb);
        a(this.aq, 3);
        return;
      }
    } while (this.as == null);
    this.as.putExtra("extra_acl", paramgnb);
    a(this.as, 5);
  }
  
  public final void a(gpr paramgpr) {}
  
  final void a(String paramString)
  {
    coo.a(null, paramString, false, false).a(this.x, "hmsf_pending");
  }
  
  public final void a(tp paramtp)
  {
    if (mbb.a(this.bn, "com.google.android.libraries.social.appid", 300) == 2) {}
    for (boolean bool = true;; bool = false)
    {
      efj.a(paramtp, bool);
      return;
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(Bundle paramBundle) {}
  
  final void b(String paramString)
  {
    bnm localbnm = new bnm(this.bn, paramString);
    if (this.c != null)
    {
      ArrayList localArrayList = this.c;
      localbnm.b.addAll(localArrayList);
    }
    for (;;)
    {
      gzj.a(f(), localbnm);
      return;
      long l1;
      if (this.aq != null)
      {
        str1 = this.aq.getStringExtra("target_album_id");
        l1 = 0L;
      }
      try
      {
        long l2 = Long.parseLong(str1);
        l1 = l2;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;)
        {
          if (Log.isLoggable("HostedMiniShareFragment", 3))
          {
            String str2 = String.valueOf(str1);
            if (str2.length() != 0) {
              "Invalid AlbumId: ".concat(str2);
            } else {
              new String("Invalid AlbumId: ");
            }
          }
        }
      }
      localbnm.a.b.add(new kqc(kqd.c, l1));
    }
  }
  
  public final void b(tp paramtp) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(gxv.class, this);
    this.a = ((git)this.bo.a(git.class));
    if (this.at == null) {
      this.at = ((gzj)this.bo.a(gzj.class));
    }
    gzj localgzj = this.at;
    cdi localcdi = new cdi(this);
    localgzj.a.add(localcdi);
  }
  
  public final void e(Bundle paramBundle)
  {
    paramBundle.putParcelableArrayList("attachments", this.c);
    if (!TextUtils.isEmpty(this.ap)) {
      paramBundle.putString("activity_id", this.ap);
    }
    if (this.b != null) {
      paramBundle.putInt("pending_request", this.b.intValue());
    }
    if (this.Z) {
      paramBundle.putBoolean("restrict_to_domain", this.Z);
    }
    if (this.d != null) {
      paramBundle.putParcelable("reshare_audience", this.d);
    }
    if (this.ac != null) {
      paramBundle.putParcelable("intent_to_start", this.ac);
    }
    super.e(paramBundle);
  }
  
  public final void m()
  {
    super.m();
    ((DeprecatedExpandingScrollView)this.ab.findViewById(aaw.eB)).a((int)g().getDimension(efj.mp));
    k().b(2, null, new cdk(this));
    EsService.a(this.bn, this.au);
  }
  
  public final void n()
  {
    super.n();
    cdl localcdl = this.au;
    EsService.d.remove(localcdl);
  }
  
  public final gya r_()
  {
    return null;
  }
  
  public final boolean t_()
  {
    this.ab.startAnimation(this.ae);
    return true;
  }
  
  final boolean v()
  {
    return (this.ak == null) && (this.m.containsKey("link_url"));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cda
 * JD-Core Version:    0.7.0.1
 */