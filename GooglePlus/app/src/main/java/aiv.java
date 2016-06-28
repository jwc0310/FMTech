import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.libraries.photoeditor.core.FilterChain;
import com.google.android.libraries.photoeditor.core.NativeCore;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import com.google.android.libraries.photoeditor.ui.views.ToolButton;
import java.util.List;

public final class aiv
  extends akx
  implements gff
{
  private ToolButton a;
  private ToolButton b;
  private ToolButton c;
  
  private final void d(int paramInt)
  {
    int i = 1;
    if (this.a == null) {
      return;
    }
    ToolButton localToolButton1 = this.a;
    label42:
    ToolButton localToolButton3;
    if (paramInt == 0)
    {
      int j = i;
      localToolButton1.setSelected(j);
      ToolButton localToolButton2 = this.b;
      if (paramInt != i) {
        break label73;
      }
      int m = i;
      localToolButton2.setSelected(m);
      localToolButton3 = this.c;
      if (paramInt != 2) {
        break label79;
      }
    }
    for (;;)
    {
      localToolButton3.setSelected(i);
      return;
      int k = 0;
      break;
      label73:
      int n = 0;
      break label42;
      label79:
      i = 0;
    }
  }
  
  protected final void A()
  {
    NativeCore.a.c = null;
    j(false);
    super.A();
  }
  
  protected final gfb B()
  {
    if (this.ar == null) {
      this.ar = new gfb((byte)0);
    }
    this.ar.a(M().d, M().a(false));
    return this.ar;
  }
  
  public final void D()
  {
    this.N.post(new aja(this));
  }
  
  public final String a(int paramInt, Object paramObject)
  {
    if (!this.s) {
      return "*UNKNOWN*";
    }
    if (paramInt == 12)
    {
      switch (Integer.valueOf(((Number)paramObject).intValue()).intValue())
      {
      default: 
        throw new IllegalArgumentException();
      case 0: 
        int k = efj.gt;
        return g().getString(k);
      case 1: 
        int j = efj.gs;
        return g().getString(j);
      }
      int i = efj.gr;
      return g().getString(i);
    }
    return super.a(paramInt, paramObject);
  }
  
  protected final void a(alm paramalm)
  {
    int i = efj.eQ;
    int j = efj.eP;
    int k = efj.gr;
    this.c = paramalm.a(i, j, 0, g().getString(k), new aiw(this));
    int m = efj.eU;
    int n = efj.eT;
    int i1 = efj.gs;
    this.b = paramalm.a(m, n, 0, g().getString(i1), new aix(this));
    int i2 = efj.eS;
    int i3 = efj.eR;
    int i4 = efj.gt;
    this.a = paramalm.a(i2, i3, 0, g().getString(i4), new aiy(this));
    FilterParameter localFilterParameter = N();
    d(localFilterParameter.getParameterInteger(12));
    bwa localbwa = (bwa)mbb.b(f(), bwa.class);
    if (localbwa == null) {
      return;
    }
    bvz localbvz = localbwa.b(f().getTaskId());
    int i5;
    String str1;
    if (localbvz != null)
    {
      i5 = localbvz.f();
      localFilterParameter.setParameterInteger(482, i5);
      if (localbvz == null) {
        break label274;
      }
      str1 = localbvz.g();
      label227:
      localFilterParameter.setParameterString(480, str1);
      if (localbvz == null) {
        break label281;
      }
    }
    label274:
    label281:
    for (String str2 = localbvz.h();; str2 = "")
    {
      localFilterParameter.setParameterString(481, str2);
      return;
      i5 = -1;
      break;
      str1 = "";
      break label227;
    }
  }
  
  public final void a(Bitmap paramBitmap)
  {
    this.N.post(new ajb(this));
  }
  
  public final String b(int paramInt, Object paramObject)
  {
    if (paramInt == 12)
    {
      switch (((Number)paramObject).intValue())
      {
      default: 
        throw new IllegalArgumentException("Invalid \"Strength\" value!");
      case 0: 
        int k = efj.gr;
        return g().getString(k);
      case 1: 
        int j = efj.gs;
        return g().getString(j);
      }
      int i = efj.gt;
      return g().getString(i);
    }
    return super.b(paramInt, paramObject);
  }
  
  public final void c_()
  {
    this.N.post(new aiz(this));
  }
  
  public final void m()
  {
    super.m();
    NativeCore.a.c = this;
  }
  
  public final void n()
  {
    NativeCore.a.c = null;
    j(false);
    super.n();
  }
  
  public final gxq v()
  {
    return new gxq(pjw.b);
  }
  
  public final int w()
  {
    return 18;
  }
  
  protected final boolean x()
  {
    return false;
  }
  
  protected final List<ghw> y()
  {
    return null;
  }
  
  protected final FilterParameter z()
  {
    FilterParameter localFilterParameter = M().h.g;
    if (localFilterParameter == null) {
      return efj.Cv.a(18);
    }
    return localFilterParameter.c();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aiv
 * JD-Core Version:    0.7.0.1
 */