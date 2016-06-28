import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.libraries.photoeditor.core.FilterChain;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import com.google.android.libraries.photoeditor.ui.views.ParameterOverlayView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class ami
  extends akx
{
  private static final List<Integer> a;
  private ggw b;
  
  static
  {
    ArrayList localArrayList = new ArrayList();
    Integer[] arrayOfInteger = new Integer[1];
    arrayOfInteger[0] = Integer.valueOf(38);
    Collections.addAll(localArrayList, arrayOfInteger);
    a = Collections.unmodifiableList(localArrayList);
  }
  
  protected final void A()
  {
    new aml(this).execute(new Void[0]);
  }
  
  protected final List<Integer> C()
  {
    return a;
  }
  
  protected final boolean E()
  {
    return false;
  }
  
  protected final View F()
  {
    ghr localghr = new ghr(f());
    localghr.c = 3;
    localghr.d = 3;
    localghr.invalidate();
    return localghr;
  }
  
  protected final void G() {}
  
  protected final void H() {}
  
  protected final gfg I()
  {
    return null;
  }
  
  protected final gfh J()
  {
    return null;
  }
  
  protected final gfc K()
  {
    return null;
  }
  
  protected final void L()
  {
    Resources localResources = g();
    int i = localResources.getDimensionPixelOffset(efj.ca);
    int j = localResources.getDimensionPixelOffset(efj.bY);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
    localLayoutParams.topMargin = i;
    localLayoutParams.bottomMargin = j;
    View localView = this.ai;
    int k = localResources.getDimensionPixelOffset(efj.bZ) / 2;
    localView.setPadding(k, k, k, k);
    localView.setLayoutParams(localLayoutParams);
  }
  
  protected final void O()
  {
    ghr localghr = (ghr)this.ai;
    localghr.a = N().getParameterFloat(38);
    localghr.invalidate();
  }
  
  public final String a(int paramInt, Object paramObject)
  {
    if (paramInt == 39) {
      return "";
    }
    return super.a(paramInt, paramObject);
  }
  
  protected final void a(alm paramalm)
  {
    int i = efj.fk;
    int j = efj.in;
    paramalm.a(i, 0, 0, g().getString(j), new amj(this));
    int k = efj.fj;
    int m = efj.im;
    paramalm.a(k, 0, 0, g().getString(m), new amk(this));
  }
  
  protected final void a(ParameterOverlayView paramParameterOverlayView)
  {
    this.b = new ggw(paramParameterOverlayView);
    this.b.a(new ggy(this));
    this.b.a = new ggx(this);
    ggw localggw = this.b;
    boolean bool;
    int i;
    int j;
    if (localggw != null)
    {
      bool = true;
      efj.c(bool, "Invalid handler reference");
      i = 0;
      j = 0;
    }
    for (;;)
    {
      if (i >= paramParameterOverlayView.a.size()) {
        break label130;
      }
      ghq localghq = (ghq)paramParameterOverlayView.a.get(i);
      if (localghq.a == localggw)
      {
        return;
        bool = false;
        break;
      }
      if (localghq.b <= 0) {
        j = i + 1;
      }
      i++;
    }
    label130:
    paramParameterOverlayView.a.add(j, new ghq(localggw, 0));
    if (paramParameterOverlayView.b == null) {
      paramParameterOverlayView.b = new ghe();
    }
    ghe localghe = paramParameterOverlayView.b;
    if (localggw == null) {
      throw new IllegalArgumentException("Listener cannot be null");
    }
    if (!localghe.h.contains(localggw)) {
      localghe.h.add(localggw);
    }
    paramParameterOverlayView.invalidate();
  }
  
  protected final void e_()
  {
    ghr localghr = (ghr)this.ai;
    localghr.a(efj.e(N().getParameterInteger(39)), false);
    localghr.b = M().b();
    localghr.a(localghr.getWidth(), localghr.getHeight());
    O();
    j(false);
    bp localbp = f();
    if (localbp != null) {
      localbp.setRequestedOrientation(2);
    }
  }
  
  public final void n()
  {
    super.n();
    this.b.a(null);
    this.b.a = null;
    this.b = null;
  }
  
  public final gxq v()
  {
    return new gxq(pjw.w);
  }
  
  public final int w()
  {
    return 5;
  }
  
  protected final List<ghw> y()
  {
    bp localbp = f();
    if (localbp == null) {
      return null;
    }
    Rect localRect = efj.a(localbp.getWindow(), localbp.getResources());
    if (localRect.isEmpty()) {
      return null;
    }
    AccelerateDecelerateInterpolator localAccelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
    DecelerateInterpolator localDecelerateInterpolator = new DecelerateInterpolator();
    Resources localResources = g();
    int i = localResources.getDimensionPixelSize(efj.cb);
    int j = localResources.getDimensionPixelSize(efj.cc);
    int k = j / 2;
    if (localRect.width() > i) {
      localRect.inset((localRect.width() - i) / 2, 0);
    }
    if (localRect.height() > i) {
      localRect.inset(0, (localRect.height() - i) / 2);
    }
    int m = g().getInteger(efj.gf);
    int n = (localRect.bottom + localRect.centerY()) / 2;
    ghx localghx = new ghx(1000, k);
    localghx.a(m).a(0.3F * k).a(localRect.left, n);
    ghz localghz1 = localghx.b(150L);
    localghz1.a = k;
    localghz1.a();
    ghz localghz2 = localghx.b(localRect.right, n, 1200L);
    localghz2.b = localAccelerateDecelerateInterpolator;
    localghz2.a();
    ghz localghz3 = localghx.b(300L);
    localghz3.a = (0.9F * k);
    localghz3.a();
    localghx.b(100L).a();
    ghz localghz4 = localghx.b(50L);
    localghz4.a = (0.92F * k);
    localghz4.a();
    ghz localghz5 = localghx.a(-1.5F * j, 0.0F, 720L);
    localghz5.b = localDecelerateInterpolator;
    localghz5.a = k;
    localghz5.a();
    ghz localghz6 = localghx.b(150L);
    localghz6.a = (0.3F * k);
    localghz6.a();
    ghw[] arrayOfghw = new ghw[1];
    arrayOfghw[0] = localghx.a();
    return Arrays.asList(arrayOfghw);
  }
  
  protected final FilterParameter z()
  {
    FilterParameter localFilterParameter = super.z();
    localFilterParameter.setParameterInteger(39, M().h.getPostRotation());
    return localFilterParameter;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ami
 * JD-Core Version:    0.7.0.1
 */