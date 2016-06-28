import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.plus.views.PhotoActionBar;
import java.util.Set;

public class bfi
  extends mca
  implements gpq
{
  public static final bfa Z = new bfa();
  public static final bfa a = new bfa();
  public static final bfa aa = new bfa(new bfc(aaw.cV));
  public static final bfa b = new bfa();
  public static final bfa c = new bfa();
  public static final bfa d = new bfa(new bfc(aaw.cq));
  public bfd ab;
  gpl ac;
  public bdk ad;
  public PhotoActionBar ae;
  private final dxx af = new dxx(this);
  private beu ag;
  private final bfm ah = new bfm(this);
  private bdm ai;
  private bdg aj;
  
  public bfi()
  {
    new jeq(this.bp, new bfj(this), '\000');
    new jeq(this.bp, new bfk(this), (short)0);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.vE, paramViewGroup, false);
    this.ae = ((PhotoActionBar)localView.findViewById(aaw.ho));
    return localView;
  }
  
  public final void a(gpr paramgpr)
  {
    if (!this.ag.a()) {}
    bfd localbfd1;
    bfa localbfa1;
    do
    {
      bcp localbcp;
      do
      {
        return;
        localbcp = this.ad.b;
      } while ((!this.ad.d) || (!localbcp.P()));
      if (this.ae.a(dxv.c))
      {
        bfd localbfd2 = this.ab;
        bfa localbfa2 = aa;
        if (localbfd2.e.contains(localbfa2)) {
          paramgpr.b(aa.a.a);
        }
      }
      localbfd1 = this.ab;
      localbfa1 = d;
    } while ((!localbfd1.e.contains(localbfa1)) || (!this.ae.a(dxv.a)));
    paramgpr.b(d.a.a);
  }
  
  public final void a(tp paramtp) {}
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == aa.a.a)
    {
      this.ab.a(aa);
      return true;
    }
    if (paramMenuItem.getItemId() == d.a.a)
    {
      this.ab.a(d);
      return true;
    }
    return false;
  }
  
  public final void b(tp paramtp) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.ab = ((bfd)this.bo.a(bfd.class));
    this.ad = ((bdk)this.bo.a(bdk.class));
    this.ai = ((bdm)this.bo.a(bdm.class));
    this.aj = ((bdg)this.bo.b(bdg.class));
    this.ag = ((beu)this.bo.a(beu.class));
    this.ac = ((gpl)this.bo.b(gpl.class));
    bfd localbfd1 = this.ab;
    bfa localbfa1 = a;
    localbfd1.d.add(localbfa1);
    bfd localbfd2 = this.ab;
    bfa localbfa2 = b;
    localbfd2.d.add(localbfa2);
    bfd localbfd3 = this.ab;
    bfa localbfa3 = c;
    localbfd3.d.add(localbfa3);
    bfd localbfd4 = this.ab;
    bfa localbfa4 = d;
    localbfd4.d.add(localbfa4);
    bfd localbfd5 = this.ab;
    bfa localbfa5 = Z;
    localbfd5.d.add(localbfa5);
    bfd localbfd6 = this.ab;
    bfa localbfa6 = aa;
    localbfd6.d.add(localbfa6);
    bfd localbfd7 = this.ab;
    bfl localbfl = new bfl(this);
    localbfd7.c.add(localbfl);
  }
  
  public final void m()
  {
    super.m();
    this.ae.a = this.af;
    v();
    this.ag.a(this.ah);
  }
  
  public final void n()
  {
    super.n();
    this.ae.a = null;
    this.ag.b(this.ah);
  }
  
  final void v()
  {
    bcp localbcp = this.ad.b;
    if ((!this.ad.d) || (!localbcp.P()) || (this.ae == null)) {
      return;
    }
    PhotoActionBar localPhotoActionBar1 = this.ae;
    for (int i = -1 + localPhotoActionBar1.getChildCount(); i >= 0; i--) {
      localPhotoActionBar1.getChildAt(i).setVisibility(8);
    }
    bfd localbfd1 = this.ab;
    bfa localbfa1 = a;
    if (localbfd1.e.contains(localbfa1)) {
      this.ae.a(true, dxv.e);
    }
    bfd localbfd2 = this.ab;
    bfa localbfa2 = b;
    int i6;
    StringBuilder localStringBuilder1;
    label222:
    int i2;
    TextView localTextView2;
    Resources localResources2;
    label353:
    int i4;
    label415:
    PhotoActionBar localPhotoActionBar4;
    int n;
    TextView localTextView1;
    if (localbfd2.e.contains(localbfa2))
    {
      PhotoActionBar localPhotoActionBar7 = this.ae;
      boolean bool3 = localbcp.N();
      int i5 = Math.max(1, localbcp.Q());
      View localView3 = localPhotoActionBar7.b(dxv.c);
      if (bool3)
      {
        i6 = efj.rg;
        localView3.setBackgroundResource(i6);
        mfz localmfz = (mfz)mfx.a.get();
        localmfz.b = (1 + localmfz.b);
        if (localmfz.b != 1) {
          break label549;
        }
        localStringBuilder1 = localmfz.a;
        StringBuilder localStringBuilder2 = localStringBuilder1.append('+').append(i5);
        ((TextView)localPhotoActionBar7.a(dxw.c)).setText(mfx.b(localStringBuilder2));
        this.ae.a(true, dxv.c);
        bfd localbfd4 = this.ab;
        bfa localbfa4 = c;
        if (localbfd4.e.contains(localbfa4))
        {
          PhotoActionBar localPhotoActionBar5 = this.ae;
          i2 = this.ai.b;
          localTextView2 = (TextView)localPhotoActionBar5.a(dxw.b);
          localResources2 = localPhotoActionBar5.getResources();
          if (i2 != 0) {
            break label745;
          }
          localTextView2.setText("");
          localTextView2.setContentDescription(localResources2.getString(aau.mC));
          this.ae.a(true, dxv.b);
          PhotoActionBar localPhotoActionBar6 = this.ae;
          bfd localbfd7 = this.ab;
          bfa localbfa7 = c;
          boolean bool2 = localbfd7.f.contains(localbfa7);
          View localView2 = localPhotoActionBar6.b(dxv.b);
          if (!bool2) {
            break label794;
          }
          i4 = efj.rh;
          localView2.setBackgroundResource(i4);
        }
        bfd localbfd5 = this.ab;
        bfa localbfa5 = Z;
        if ((!localbfd5.e.contains(localbfa5)) || (this.aj == null)) {
          break label858;
        }
        localPhotoActionBar4 = this.ae;
        n = this.aj.g;
        localTextView1 = (TextView)localPhotoActionBar4.a(dxw.a);
        if (n != 0) {
          break label802;
        }
        localTextView1.setText("");
        localTextView1.setContentDescription(localPhotoActionBar4.getResources().getString(aau.dX));
        label512:
        this.ae.a(true, dxv.a);
      }
    }
    for (;;)
    {
      this.ae.setVisibility(0);
      this.ac.b();
      return;
      i6 = efj.rf;
      break;
      label549:
      localStringBuilder1 = new StringBuilder(256);
      break label222;
      PhotoActionBar localPhotoActionBar2 = this.ae;
      boolean bool1;
      label581:
      int j;
      label651:
      ImageView localImageView;
      float f;
      label674:
      int k;
      if (Build.VERSION.SDK_INT >= 11)
      {
        bool1 = true;
        localPhotoActionBar2.a(bool1, dxv.d);
        View localView1 = localPhotoActionBar2.findViewById(dxv.d.i);
        if (localView1 != null) {
          localView1.setVisibility(8);
        }
        PhotoActionBar localPhotoActionBar3 = this.ae;
        bfd localbfd3 = this.ab;
        bfa localbfa3 = aa;
        if (localbfd3.e.contains(localbfa3)) {
          break label721;
        }
        j = 1;
        localImageView = (ImageView)localPhotoActionBar3.b(dxv.d);
        if (j == 0) {
          break label727;
        }
        f = 0.5F;
        localImageView.setAlpha(f);
        if (j != 0) {
          break label733;
        }
        k = 1;
        label689:
        if (Build.VERSION.SDK_INT < 16) {
          break label737;
        }
        if (k == 0) {
          break label739;
        }
      }
      label721:
      label727:
      label733:
      label737:
      label739:
      for (int m = 0;; m = 2)
      {
        localImageView.setImportantForAccessibility(m);
        break;
        bool1 = false;
        break label581;
        j = 0;
        break label651;
        f = 1.0F;
        break label674;
        k = 0;
        break label689;
        break;
      }
      label745:
      localTextView2.setText(Integer.toString(i2));
      int i3 = efj.yg;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(i2);
      localTextView2.setContentDescription(localResources2.getQuantityString(i3, i2, arrayOfObject2));
      break label353;
      label794:
      i4 = efj.rf;
      break label415;
      label802:
      localTextView1.setText(Integer.toString(n));
      Resources localResources1 = localPhotoActionBar4.getResources();
      int i1 = efj.xk;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(n);
      localTextView1.setContentDescription(localResources1.getQuantityString(i1, n, arrayOfObject1));
      break label512;
      label858:
      bfd localbfd6 = this.ab;
      bfa localbfa6 = d;
      if (localbfd6.e.contains(localbfa6)) {
        this.ae.a(true, dxv.f);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bfi
 * JD-Core Version:    0.7.0.1
 */