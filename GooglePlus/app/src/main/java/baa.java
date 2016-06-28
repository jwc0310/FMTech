import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.photos.viewer.components.comments.DetailsListView;
import com.google.android.apps.plus.service.EsService;
import com.google.android.libraries.social.sharekit.comments.MentionMultiAutoCompleteTextView;
import java.util.HashSet;
import java.util.Map;

public class baa
  extends mca
{
  bey Z;
  final baf a = new baf(this);
  public beu aa;
  public bdk ab;
  public View ac;
  View ad;
  MentionMultiAutoCompleteTextView ae;
  Integer af;
  public azx ag;
  boolean ah;
  public boolean ai;
  private final bas aj = new bas(this);
  private final loy ak = new loy(this);
  private final bae al = new bae(this);
  private final bah am = new bah(this);
  private final bag an = new bag(this);
  private final azz ao = new azz(this);
  private final bai ap = new bai(this);
  private clc aq;
  private azt ar;
  public git b;
  public jdx c;
  bfd d;
  
  public baa()
  {
    new bez(this, this.bp, bfi.Z, new bab(this));
    new jeq(this.bp, new bac(this), '\000');
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.ac = paramLayoutInflater.inflate(efj.vI, paramViewGroup, false);
    DetailsListView localDetailsListView = (DetailsListView)this.ac.findViewById(16908298);
    localDetailsListView.setAdapter(this.ar);
    localDetailsListView.setRecyclerListener(this.am);
    int i = this.b.c();
    this.aq = new clc(new ContextThemeWrapper(f(), efj.yh), this.x, k(), i, 0);
    this.ae = ((MentionMultiAutoCompleteTextView)this.ac.findViewById(aaw.dL));
    this.ae.setEnabled(false);
    this.ae.setHint(aau.ek);
    this.ae.a(null, this.aq);
    this.ad = this.ac.findViewById(aaw.dJ);
    this.ad.setOnClickListener(this.al);
    View localView = this.ad;
    boolean bool1 = v();
    boolean bool2 = false;
    if (bool1)
    {
      boolean bool3 = this.ae.c();
      bool2 = false;
      if (bool3) {
        bool2 = true;
      }
    }
    localView.setEnabled(bool2);
    this.ae.addTextChangedListener(new bad(this));
    bw localbw = h();
    this.ag = ((azx)localbw.a(azx.class.getName()));
    if (this.ag == null)
    {
      this.ag = new azx();
      Bundle localBundle = this.m;
      this.ag.f(localBundle);
      this.ag.Z = this.ao;
      localbw.a().a(this.ag, azx.class.getName()).b();
    }
    return null;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle == null) {}
    do
    {
      return;
      if (paramBundle.containsKey("comment_request_id")) {
        this.af = Integer.valueOf(paramBundle.getInt("comment_request_id"));
      }
    } while (!paramBundle.containsKey("launched_comments"));
    this.ah = paramBundle.getBoolean("launched_comments");
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.Z = ((bey)this.bo.a(bey.class));
    this.d = ((bfd)this.bo.a(bfd.class));
    this.aa = ((beu)this.bo.a(beu.class));
    this.ab = ((bdk)this.bo.a(bdk.class));
    this.b = ((git)this.bo.a(git.class));
    this.c = new jdx(this.bn);
    this.ar = new azt(this.bn, this.aj, this.ak);
  }
  
  public final void d_()
  {
    super.d_();
    this.ac = null;
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("launched_comments", this.ah);
    if (this.af != null) {
      paramBundle.putInt("comment_request_id", this.af.intValue());
    }
  }
  
  public final void m()
  {
    super.m();
    this.aa.a(this.an);
    EsService.a(this.bn, this.ap);
  }
  
  public final void n()
  {
    super.n();
    this.aa.b(this.an);
    bai localbai = this.ap;
    EsService.d.remove(localbai);
    if (this.af != null)
    {
      int i = this.af.intValue();
      if (!EsService.b.containsKey(Integer.valueOf(i)))
      {
        dmx localdmx = EsService.a(this.af.intValue());
        this.ap.d(this.af.intValue(), localdmx);
      }
    }
  }
  
  public final boolean v()
  {
    return (this.ab != null) && (this.ab.b != null) && (this.ab.b.w());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     baa
 * JD-Core Version:    0.7.0.1
 */