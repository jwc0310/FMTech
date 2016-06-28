import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.plus.views.PhotoView;

public class axk
  extends mca
{
  public static final aip a = new bfb();
  bdi Z;
  PhotoView aa;
  boolean ab;
  final axq ac;
  public int ad;
  private final Runnable ae;
  private final axn af;
  beu b;
  bfd c;
  bdk d;
  
  public axk()
  {
    new jeq(this.bp, new axl(this), '\000');
    this.ac = new axq(this);
    this.ad = axo.a;
    this.ae = new axm(this);
    this.af = new axn(this);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (this.d == null) {
      throw new IllegalStateException("Must have a photoModel in onCreateView.");
    }
    View localView = paramLayoutInflater.inflate(efj.vD, paramViewGroup, false);
    bcp localbcp = this.d.b;
    this.aa = ((PhotoView)localView.findViewById(aaw.hw));
    PhotoView localPhotoView2;
    if (this.m.getBoolean("for_animation", false))
    {
      localPhotoView2 = this.aa;
      if (localPhotoView2.k)
      {
        localPhotoView2.k = false;
        if ((!localPhotoView2.j) || (localPhotoView2.f == null)) {
          break label207;
        }
        localPhotoView2.ap_();
        localPhotoView2.b();
      }
    }
    for (;;)
    {
      this.aa.a(localbcp.a(), localbcp.f(), new dyo(0, 0, 0, false), this.ac);
      this.aa.d(true);
      this.aa.setOnClickListener(new axp(this));
      PhotoView localPhotoView1 = this.aa;
      if (localPhotoView1.A != true)
      {
        localPhotoView1.A = true;
        localPhotoView1.invalidate();
      }
      this.aa.m = true;
      return localView;
      label207:
      localPhotoView2.invalidate();
    }
  }
  
  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    v();
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.b = ((beu)this.bo.a(beu.class));
    this.c = ((bfd)this.bo.a(bfd.class));
    this.d = ((bdk)this.bo.a(bdk.class));
    this.Z = ((bdi)this.bo.a(bdi.class));
  }
  
  public final void m()
  {
    super.m();
    this.b.a(this.af);
    if (this.m.getBoolean("for_animation", false))
    {
      dyk localdyk = (dyk)this.bo.b(dyk.class);
      this.aa.z = localdyk;
    }
    v();
  }
  
  public final void n()
  {
    super.n();
    this.b.b(this.af);
  }
  
  final void v()
  {
    this.aa.removeCallbacks(this.ae);
    if ((!this.b.b()) && (!this.m.getBoolean("for_animation", false)) && (this.d.b.L())) {}
    for (int i = 1; i != 0; i = 0)
    {
      this.aa.postDelayed(this.ae, 150L);
      return;
    }
    this.aa.b(false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     axk
 * JD-Core Version:    0.7.0.1
 */