import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.apps.plus.views.VideoProgressView;

public class azm
  extends mca
  implements View.OnClickListener, bex, eak
{
  private bdj Z;
  public bcp a;
  private beu aa;
  private azq ab;
  private Animation ac;
  private Animation ad;
  private boolean ae;
  private jqb af;
  private final jqd ag = new jqd(this);
  private final jqe ah = new jqe(this);
  private final jer<bdk> ai = new azn(this);
  public ImageButton b;
  public VideoProgressView c;
  private bdk d;
  
  private static View a(View paramView, int paramInt1, int paramInt2)
  {
    View localView = paramView.findViewById(paramInt1);
    if (localView != null) {
      return localView;
    }
    return ((ViewStub)paramView.findViewById(paramInt2)).inflate();
  }
  
  private final void a(String paramString)
  {
    if (Log.isLoggable("CastFragment", 3))
    {
      int i = hashCode();
      new StringBuilder(14 + String.valueOf(paramString).length()).append(i).append(" - ").append(paramString);
    }
  }
  
  private final void b(boolean paramBoolean)
  {
    if (paramBoolean != this.ae)
    {
      this.ae = paramBoolean;
      if (!paramBoolean) {
        break label45;
      }
    }
    label45:
    for (String str = "activated";; str = "deactivated")
    {
      a(str);
      if (paramBoolean) {
        this.af.a(this.ah);
      }
      v();
      return;
    }
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return paramLayoutInflater.inflate(efj.sW, paramViewGroup, false);
  }
  
  public final void a(double paramDouble)
  {
    this.af.a(paramDouble);
  }
  
  public final void a(int paramInt)
  {
    if (this.N == null) {}
    Object localObject;
    do
    {
      return;
      localObject = this.N.findViewById(aaw.fY);
      if ((localObject == null) && (paramInt == 0))
      {
        View localView = ((ViewStub)this.N.findViewById(aaw.gb)).inflate();
        if ((this.d.b != null) && (this.d.b.E()))
        {
          ((TextView)localView.findViewById(aaw.ga)).setText(aau.jr);
          ((TextView)localView.findViewById(aaw.fZ)).setText(aau.vo);
        }
        localObject = localView;
      }
    } while (localObject == null);
    if (paramInt == 0) {
      a("set no cast visible");
    }
    for (;;)
    {
      ((View)localObject).setVisibility(paramInt);
      return;
      a("set no cast hidden");
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.ad = AnimationUtils.loadAnimation(f(), efj.iG);
    this.ad.setAnimationListener(new azo(this));
    this.ac = AnimationUtils.loadAnimation(f(), efj.iI);
    this.ac.setAnimationListener(new azp(this));
    this.m.getInt("account_id", -1);
    this.af = ((jqb)mbb.a(f(), jqb.class));
    this.aa.a(this);
    this.d.a.a(this.ai, false);
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.b == null) {
      return;
    }
    if (paramBoolean) {}
    for (int i = efj.qZ;; i = efj.rb)
    {
      this.b.setImageResource(i);
      return;
    }
  }
  
  public final void b()
  {
    b(false);
  }
  
  public final void c() {}
  
  protected final void c(Bundle paramBundle)
  {
    this.d = ((bdk)this.bo.a(bdk.class));
    this.aa = ((beu)this.bo.a(beu.class));
    this.Z = ((bdj)this.bo.a(bdj.class));
    this.ab = ((azq)this.bo.a(azq.class));
  }
  
  public final void d() {}
  
  public final void m()
  {
    super.m();
    this.af.a(this.ag);
  }
  
  public final void n()
  {
    super.n();
    this.af.b(this.ag);
  }
  
  public final void n_()
  {
    b(true);
  }
  
  public final void o()
  {
    this.d.a.a(this.ai);
    super.o();
  }
  
  public final boolean o_()
  {
    return false;
  }
  
  public void onClick(View paramView)
  {
    ipf localipf = this.a.a();
    boolean bool = this.af.b(new jqf(localipf.c, localipf.e));
    if (bool)
    {
      this.af.d();
      bool = false;
    }
    for (;;)
    {
      a(bool);
      return;
      ojx localojx = this.a.i();
      if (localojx != null)
      {
        if (this.af.a(this.m, this.ab.a, new jqf(localipf.c, localipf.e), localojx))
        {
          this.c.a(0.0D);
          VideoProgressView localVideoProgressView = this.c;
          localVideoProgressView.c = 0.0D;
          localVideoProgressView.a();
          if (localVideoProgressView.c != 0.0D)
          {
            int i = (int)(1000.0D * (localVideoProgressView.b / localVideoProgressView.c));
            localVideoProgressView.a.setProgress(i);
          }
          for (;;)
          {
            bool = true;
            break;
            localVideoProgressView.a.setProgress(0);
          }
        }
      }
      else if ((this.af != null) && (this.af.b())) {
        a(0);
      }
    }
  }
  
  public final void v()
  {
    boolean bool = true;
    if (!this.m.getBoolean("disable_chromecast", bool)) {
      if ((bool) && (this.af.b()) && (this.N != null)) {
        break label43;
      }
    }
    label43:
    label454:
    for (;;)
    {
      return;
      bool = false;
      break;
      if ((this.d.b != null) && (this.d.b.a() != null))
      {
        a("castSelf: Model Ready");
        this.a = this.d.b;
        ipf localipf1 = this.a.a();
        if (localipf1.c != null) {
          if (this.ae)
          {
            this.af.a(this.m, this.ab.a, new jqf(localipf1.c, localipf1.e), null);
            bdj localbdj2 = this.Z;
            localbdj2.b = false;
            localbdj2.a.a();
            a(8);
          }
        }
        for (;;)
        {
          if (!this.a.E()) {
            break label454;
          }
          this.b = ((ImageButton)a(this.N, aaw.bh, aaw.bi));
          this.b.setOnClickListener(this);
          this.b.setVisibility(0);
          this.c = ((VideoProgressView)a(this.N, aaw.bj, aaw.bk));
          this.c.d = this;
          return;
          this.af.a(new jqf(localipf1.c, localipf1.e));
          break;
          if ((this.a.g() != null) && (this.a.g().a != null) && (this.a.g().a.a != null))
          {
            String str = this.a.g().a.a;
            ipf localipf2 = ipf.a(f(), str, localipf1.e);
            if (this.ae)
            {
              this.af.a(this.m, this.ab.a, new jqf(localipf2.c, localipf2.e), null);
              bdj localbdj1 = this.Z;
              localbdj1.b = false;
              localbdj1.a.a();
            }
            for (;;)
            {
              a(8);
              break;
              this.af.a(new jqf(localipf1.c, localipf1.e));
            }
          }
          a(0);
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     azm
 * JD-Core Version:    0.7.0.1
 */