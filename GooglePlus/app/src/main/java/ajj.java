import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import com.google.android.libraries.photoeditor.core.FilterChain;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import com.google.android.libraries.photoeditor.ui.views.ParameterOverlayView;
import com.google.android.libraries.photoeditor.ui.views.ToolButton;
import com.google.android.libraries.photoeditor.util.BitmapHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class ajj
  extends akx
  implements ggv
{
  private static final List<Integer> aa;
  private static final int[] as;
  final ajn Z = new ajn(this);
  ToolButton a;
  private ggf at;
  private int au;
  private final PointF av = new PointF();
  int b;
  alg c;
  final anc d = new ajo(this);
  
  static
  {
    int[] arrayOfInt = new int[6];
    arrayOfInt[0] = efj.gC;
    arrayOfInt[1] = efj.gD;
    arrayOfInt[2] = efj.gE;
    arrayOfInt[3] = efj.gF;
    arrayOfInt[4] = efj.gG;
    arrayOfInt[5] = efj.gH;
    as = arrayOfInt;
    ArrayList localArrayList = new ArrayList();
    Integer[] arrayOfInteger = new Integer[4];
    arrayOfInteger[0] = Integer.valueOf(19);
    arrayOfInteger[1] = Integer.valueOf(23);
    arrayOfInteger[2] = Integer.valueOf(22);
    arrayOfInteger[3] = Integer.valueOf(4);
    Collections.addAll(localArrayList, arrayOfInteger);
    aa = Collections.unmodifiableList(localArrayList);
  }
  
  protected final List<Integer> C()
  {
    return aa;
  }
  
  public final void a(float paramFloat1, float paramFloat2)
  {
    this.av.set(paramFloat1, paramFloat2);
    efj.a(this.av, this.au, 1.0F, 1.0F);
    FilterParameter localFilterParameter = N();
    int i = Float.valueOf(localFilterParameter.c(24)).intValue();
    int j = Float.valueOf(localFilterParameter.c(25)).intValue();
    boolean bool = localFilterParameter.a(24, Float.valueOf(this.av.x * i));
    if ((localFilterParameter.a(25, Float.valueOf(this.av.y * j))) || (bool)) {}
    for (int k = 1;; k = 0)
    {
      if (k != 0) {
        O();
      }
      return;
    }
  }
  
  public final void a(int paramInt)
  {
    super.a(paramInt);
    this.aj.invalidate();
  }
  
  protected final void a(alm paramalm)
  {
    FilterParameter localFilterParameter = N();
    int i = efj.fo;
    int j = efj.ib;
    paramalm.a(i, 0, 0, g().getString(j), new ajl(this));
    this.b = Float.valueOf(localFilterParameter.c(12)).intValue();
    int k = efj.fn;
    int m = efj.fm;
    int n = efj.hA;
    this.a = paramalm.a(k, m, 0, g().getString(n), new ajm(this, localFilterParameter));
    ToolButton localToolButton = this.a;
    int i1 = localFilterParameter.getParameterInteger(12);
    int i2 = this.b;
    boolean bool = false;
    if (i1 == i2) {
      bool = true;
    }
    localToolButton.setSelected(bool);
  }
  
  protected final void a(ParameterOverlayView paramParameterOverlayView)
  {
    super.a(paramParameterOverlayView);
    this.at = new ggf(paramParameterOverlayView);
    this.at.b = this;
    FilterParameter localFilterParameter = N();
    this.av.x = (localFilterParameter.getParameterFloat(24) / Float.valueOf(localFilterParameter.c(24)).intValue());
    this.av.y = (localFilterParameter.getParameterFloat(25) / Float.valueOf(localFilterParameter.c(25)).intValue());
    this.au = M().h.getPostRotation();
    efj.b(this.av, this.au, 1.0F, 1.0F);
    this.at.f(this.av.x, this.av.y);
    g_();
    ggf localggf = this.at;
    boolean bool;
    int i;
    int j;
    if (localggf != null)
    {
      bool = true;
      efj.c(bool, "Invalid handler reference");
      i = 0;
      j = 0;
    }
    for (;;)
    {
      if (i >= paramParameterOverlayView.a.size()) {
        break label239;
      }
      ghq localghq = (ghq)paramParameterOverlayView.a.get(i);
      if (localghq.a == localggf)
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
    label239:
    paramParameterOverlayView.a.add(j, new ghq(localggf, 0));
    if (paramParameterOverlayView.b == null) {
      paramParameterOverlayView.b = new ghe();
    }
    ghe localghe = paramParameterOverlayView.b;
    if (localggf == null) {
      throw new IllegalArgumentException("Listener cannot be null");
    }
    if (!localghe.h.contains(localggf)) {
      localghe.h.add(localggf);
    }
    paramParameterOverlayView.invalidate();
  }
  
  protected final void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    this.at.b(false);
  }
  
  protected final boolean a(int paramInt, Object paramObject, boolean paramBoolean)
  {
    if (!super.a(paramInt, paramObject, paramBoolean)) {
      return false;
    }
    if (paramInt == 4) {
      g_();
    }
    return true;
  }
  
  public final String b(int paramInt, Object paramObject)
  {
    if (paramInt == 3)
    {
      int k = ((Number)paramObject).intValue();
      if ((k >= 0) && (k < as.length))
      {
        int m = as[k];
        return g().getString(m);
      }
      return "*UNKNOWN*";
    }
    if (paramInt == 12)
    {
      if (((Number)paramObject).intValue() == this.b)
      {
        int j = efj.ip;
        return g().getString(j);
      }
      int i = efj.iy;
      return g().getString(i);
    }
    return super.b(paramInt, paramObject);
  }
  
  public final void b(int paramInt)
  {
    super.b(paramInt);
    this.aj.invalidate();
  }
  
  protected final void b(boolean paramBoolean)
  {
    super.b(paramBoolean);
    this.at.b(true);
  }
  
  public final void c(int paramInt)
  {
    super.c(paramInt);
    ggf localggf = this.at;
    if (N().getActiveParameterKey() == 4) {}
    for (boolean bool = true;; bool = false)
    {
      localggf.e = bool;
      localggf.a(true);
      this.aj.invalidate();
      return;
    }
  }
  
  protected final void e_()
  {
    super.e_();
    if (this.c != null) {
      return;
    }
    int i = g().getDimensionPixelSize(efj.cf);
    FilterParameter localFilterParameter = N();
    this.c = new alg(this, localFilterParameter, 3, BitmapHelper.createCenterCropBitmap(M().b(), i, i, 0, 0, 0));
    Rect localRect = a(i, M().b());
    gen localgen = (gen)this.ai;
    ajk localajk = new ajk(this, localRect, localFilterParameter);
    localgen.c.add(localajk);
  }
  
  final void g_()
  {
    FilterParameter localFilterParameter = N();
    float f = localFilterParameter.getParameterFloat(4) / Float.valueOf(localFilterParameter.c(4)).floatValue();
    ggf localggf = this.at;
    if (localggf.e) {
      localggf.a(false);
    }
    localggf.a = f;
    if (localggf.e) {
      localggf.a(false);
    }
  }
  
  public final gxq v()
  {
    return new gxq(pjw.e);
  }
  
  public final int w()
  {
    return 11;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ajj
 * JD-Core Version:    0.7.0.1
 */