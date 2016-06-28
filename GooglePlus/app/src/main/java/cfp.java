import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.apps.photos.allphotos.ui.ScaleGestureTouchCaptureView;
import com.google.android.apps.plus.views.PhotosHomeTabContainer;
import com.google.android.apps.plus.views.PhotosHomeTabStrip;
import java.util.HashMap;

public final class cfp
  extends cff
  implements aql, ok
{
  private ScaleGestureTouchCaptureView Z;
  int a;
  private boolean aa;
  private int ab;
  Uri b;
  private ViewPager c;
  private PhotosHomeTabContainer d;
  
  private final bk C()
  {
    int i = this.c.d;
    int j = aaw.gS;
    String str = 40 + "android:switcher:" + j + ":" + i;
    return h().a(str);
  }
  
  private final boolean D()
  {
    bk localbk = C();
    return ((localbk instanceof cff)) && (((cff)localbk).z());
  }
  
  private static gya e(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 4: 
      return gya.Z;
    case 2: 
      return gya.af;
    }
    return gya.av;
  }
  
  protected final boolean X_()
  {
    return (!this.ap) && (this.aE) && (!this.aG) && ((this.az.b == null) || (this.az.b.b <= 0));
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    ifj localifj = (ifj)this.bo.a(ifj.class);
    int i = localifj.h();
    localifj.a(i, i, 60, 0.85D);
    return super.a(paramLayoutInflater, paramViewGroup, paramBundle, efj.ul);
  }
  
  public final void a(int paramInt)
  {
    int i = d(this.c.d);
    int j = d(paramInt);
    this.d.a(paramInt);
    int k = d(paramInt);
    if (this.m.getInt("photo_picker_mode", 0) == 0) {
      this.bn.getSharedPreferences("photos_home", 0).edit().putInt("photos_home_tab", k).apply();
    }
    Bundle localBundle = new Bundle();
    b(localBundle);
    gya localgya = e(j);
    if (localgya != null)
    {
      gxx localgxx = (gxx)this.bo.a(gxx.class);
      gxw localgxw = new gxw(this.bn);
      localgxw.d = e(i);
      localgxw.e = localgya;
      localgxx.a(localgxw.b(localBundle));
    }
    this.al.a();
  }
  
  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    this.d.a(paramInt1, paramFloat, paramInt2);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.aa = this.m.getBoolean("disable_up_button", true);
  }
  
  public final void a(View paramView, Bundle paramBundle)
  {
    int i = 0;
    super.a(paramView, paramBundle);
    Bundle localBundle1 = this.m;
    if (localBundle1.containsKey("tabs"))
    {
      this.ab = localBundle1.getInt("tabs");
      if (!this.am.e()) {
        this.ab = (0x6 & this.ab);
      }
    }
    if ((0x2 & this.ab) != 0)
    {
      this.ab = (0x2 ^ this.ab);
      this.ab = (0x1 | this.ab);
    }
    if (((0x1 & this.aC) != 0) && ((0x8 & this.ab) != 0)) {
      this.ab = (0x8 ^ this.ab);
    }
    int j = this.ab;
    int k = 0;
    while (j != 0)
    {
      if ((j & 0x1) != 0) {
        k++;
      }
      j >>= 1;
    }
    this.a = k;
    HashMap localHashMap = (HashMap)this.m.getSerializable("tab_bundles");
    this.Z = ((ScaleGestureTouchCaptureView)paramView.findViewById(aaw.jl));
    cfr localcfr = new cfr(this, h(), localHashMap);
    this.c = ((ViewPager)paramView.findViewById(aaw.gS));
    this.d = ((PhotosHomeTabContainer)paramView.findViewById(aaw.kK));
    PhotosHomeTabContainer localPhotosHomeTabContainer1 = this.d;
    boolean bool;
    PhotosHomeTabContainer localPhotosHomeTabContainer2;
    nc localnc;
    LayoutInflater localLayoutInflater;
    int m;
    if (this.a > 2)
    {
      bool = true;
      localPhotosHomeTabContainer1.c = bool;
      this.c.a(localcfr);
      localPhotosHomeTabContainer2 = this.d;
      localPhotosHomeTabContainer2.b = this.c;
      localnc = localPhotosHomeTabContainer2.b.c;
      localLayoutInflater = LayoutInflater.from(localPhotosHomeTabContainer2.getContext());
      m = 0;
      label300:
      if (m >= localnc.b()) {
        break label399;
      }
      if (!localPhotosHomeTabContainer2.c) {
        break label391;
      }
    }
    label391:
    for (int i4 = efj.vX;; i4 = efj.vW)
    {
      TextView localTextView = (TextView)localLayoutInflater.inflate(i4, localPhotosHomeTabContainer2.a, false);
      localTextView.setText(localnc.b(m));
      localTextView.setOnClickListener(new dyw(localPhotosHomeTabContainer2, m));
      localPhotosHomeTabContainer2.a.addView(localTextView);
      m++;
      break label300;
      bool = false;
      break;
    }
    label399:
    localPhotosHomeTabContainer2.a.getViewTreeObserver().addOnGlobalLayoutListener(new dyx(localPhotosHomeTabContainer2));
    this.d.setBackgroundColor(g().getColor(efj.jN));
    PhotosHomeTabContainer localPhotosHomeTabContainer3 = this.d;
    int n = g().getColor(efj.jO);
    PhotosHomeTabStrip localPhotosHomeTabStrip = localPhotosHomeTabContainer3.a;
    localPhotosHomeTabStrip.a.setColor(n);
    localPhotosHomeTabStrip.invalidate();
    this.c.o = this;
    this.b = ((Uri)this.m.getParcelable("scroll_to_uri"));
    int i2;
    int i3;
    if (paramBundle == null)
    {
      int i1 = this.bn.getSharedPreferences("photos_home", 0).getInt("photos_home_tab", 2);
      i2 = this.m.getInt("starting_tab_index", i1);
      if (((i2 & this.ab) == 0) || (!this.am.e()))
      {
        if ((0x2 & this.ab) == 0) {
          break label692;
        }
        i2 = 2;
      }
      if ((i2 & this.ab) != 0) {
        break label702;
      }
      i3 = -1;
    }
    for (;;)
    {
      this.c.b(i3);
      if (i3 == 0) {
        this.c.post(new cfq(this));
      }
      Bundle localBundle2 = new Bundle();
      b(localBundle2);
      gya localgya = e(i2);
      if (localgya != null)
      {
        gxx localgxx = (gxx)this.bo.a(gxx.class);
        gxw localgxw = new gxw(this.bn);
        localgxw.e = localgya;
        localgxx.a(localgxw.b(localBundle2));
      }
      return;
      label692:
      i2 = d(0);
      break;
      label702:
      i3 = 0;
      while ((0x1 & i2 >> i) == 0)
      {
        if ((0x1 & this.ab >> i) != 0) {
          i3++;
        }
        i++;
      }
    }
  }
  
  public final void a(tp paramtp)
  {
    super.a(paramtp);
    if (!this.aa)
    {
      efj.a(paramtp, true);
      paramtp.c(true);
    }
  }
  
  public final boolean a(MenuItem paramMenuItem)
  {
    return super.a(paramMenuItem);
  }
  
  protected final boolean a(View paramView)
  {
    return false;
  }
  
  public final void b(int paramInt)
  {
    this.d.b(paramInt);
  }
  
  protected final void b(gpr paramgpr)
  {
    super.b(paramgpr);
    a(paramgpr, 0);
    paramgpr.d(aau.og);
    if (this.m.getInt("photo_picker_mode", 0) == 0) {
      paramgpr.b(aaw.jv);
    }
    if (D())
    {
      gqe localgqe = (gqe)paramgpr.a(aaw.iq);
      localgqe.b = Math.max(1, localgqe.b);
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(aql.class, this);
  }
  
  final int d(int paramInt)
  {
    for (int i = 0; 1 << i <= this.ab; i++)
    {
      if ((paramInt == 0) && ((0x1 & this.ab >> i) != 0)) {
        return 1 << i;
      }
      if ((0x1 & this.ab >> i) != 0) {
        paramInt--;
      }
    }
    return -1;
  }
  
  public final gya r_()
  {
    if (this.c == null) {}
    for (int i = 0;; i = this.c.d) {
      switch (d(i))
      {
      default: 
        return gya.aq;
      }
    }
    return gya.aq;
    return gya.ar;
    return gya.as;
    return gya.at;
    return gya.au;
    return gya.av;
  }
  
  public final boolean t_()
  {
    if (this.aE) {
      return super.s_();
    }
    return super.t_();
  }
  
  protected final boolean v()
  {
    return false;
  }
  
  public final boolean y_()
  {
    bk localbk = C();
    return ((localbk instanceof cff)) && (((cff)localbk).y_());
  }
  
  public final boolean z()
  {
    return (super.z()) && (D());
  }
  
  public final void z_()
  {
    bk localbk = C();
    if ((localbk instanceof cff)) {
      ((cff)localbk).z_();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cfp
 * JD-Core Version:    0.7.0.1
 */