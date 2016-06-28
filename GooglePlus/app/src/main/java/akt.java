import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import com.google.android.libraries.photoeditor.ui.views.ToolButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class akt
  extends akx
{
  private static final int[] Z;
  private static final List<Integer> d;
  final ald a = new ald(this, 223, Z);
  final akw b = new akw(this);
  ToolButton c;
  
  static
  {
    int[] arrayOfInt = new int[46];
    arrayOfInt[0] = efj.cX;
    arrayOfInt[1] = efj.cW;
    arrayOfInt[2] = efj.db;
    arrayOfInt[3] = efj.da;
    arrayOfInt[4] = efj.df;
    arrayOfInt[5] = efj.de;
    arrayOfInt[6] = efj.cB;
    arrayOfInt[7] = efj.cA;
    arrayOfInt[8] = efj.cV;
    arrayOfInt[9] = efj.cU;
    arrayOfInt[10] = efj.cD;
    arrayOfInt[11] = efj.cC;
    arrayOfInt[12] = efj.cH;
    arrayOfInt[13] = efj.cG;
    arrayOfInt[14] = efj.cN;
    arrayOfInt[15] = efj.cM;
    arrayOfInt[16] = efj.ct;
    arrayOfInt[17] = efj.cs;
    arrayOfInt[18] = efj.cR;
    arrayOfInt[19] = efj.cQ;
    arrayOfInt[20] = efj.cr;
    arrayOfInt[21] = efj.cq;
    arrayOfInt[22] = efj.cZ;
    arrayOfInt[23] = efj.cY;
    arrayOfInt[24] = efj.dd;
    arrayOfInt[25] = efj.dc;
    arrayOfInt[26] = efj.dh;
    arrayOfInt[27] = efj.dg;
    arrayOfInt[28] = efj.cx;
    arrayOfInt[29] = efj.cw;
    arrayOfInt[30] = efj.cz;
    arrayOfInt[31] = efj.cy;
    arrayOfInt[32] = efj.cp;
    arrayOfInt[33] = efj.co;
    arrayOfInt[34] = efj.cF;
    arrayOfInt[35] = efj.cE;
    arrayOfInt[36] = efj.cJ;
    arrayOfInt[37] = efj.cI;
    arrayOfInt[38] = efj.cL;
    arrayOfInt[39] = efj.cK;
    arrayOfInt[40] = efj.cP;
    arrayOfInt[41] = efj.cO;
    arrayOfInt[42] = efj.cT;
    arrayOfInt[43] = efj.cS;
    arrayOfInt[44] = efj.cv;
    arrayOfInt[45] = efj.cu;
    Z = arrayOfInt;
    ArrayList localArrayList = new ArrayList();
    Integer[] arrayOfInteger = new Integer[1];
    arrayOfInteger[0] = Integer.valueOf(221);
    Collections.addAll(localArrayList, arrayOfInteger);
    d = Collections.unmodifiableList(localArrayList);
  }
  
  protected final void A()
  {
    FilterParameter localFilterParameter = N();
    if (localFilterParameter.getParameterInteger(223) >= 11) {
      a(9, Integer.valueOf(Float.valueOf(localFilterParameter.b(9)).intValue()), false);
    }
    super.A();
  }
  
  protected final List<Integer> C()
  {
    return d;
  }
  
  public final String a(int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    default: 
      return super.b(paramInt, paramObject);
    case 223: 
      Object[] arrayOfObject = new Object[2];
      int k = efj.hj;
      arrayOfObject[0] = g().getString(k);
      arrayOfObject[1] = Integer.valueOf(1 + ((Number)paramObject).intValue());
      return String.format("%s %d", arrayOfObject);
    }
    if (paramObject.equals(Integer.valueOf(0)))
    {
      int j = efj.hk;
      return g().getString(j);
    }
    int i = efj.hl;
    return g().getString(i);
  }
  
  protected final void a(alm paramalm)
  {
    boolean bool1 = true;
    FilterParameter localFilterParameter = N();
    int i = Float.valueOf(localFilterParameter.c(9)).intValue();
    int j = efj.fi;
    int k = efj.hj;
    paramalm.a(j, 0, 0, g().getString(k), new aku(this, localFilterParameter));
    int m = efj.eX;
    int n = efj.eW;
    int i1 = efj.gJ;
    this.c = paramalm.a(m, n, 0, g().getString(i1), new akv(this, localFilterParameter, i));
    ToolButton localToolButton1 = this.c;
    boolean bool2;
    ToolButton localToolButton2;
    if (localFilterParameter.getParameterInteger(9) == i)
    {
      bool2 = bool1;
      localToolButton1.setSelected(bool2);
      localToolButton2 = this.c;
      if (localFilterParameter.getParameterInteger(223) >= 11) {
        break label170;
      }
    }
    for (;;)
    {
      localToolButton2.setEnabled(bool1);
      return;
      bool2 = false;
      break;
      label170:
      bool1 = false;
    }
  }
  
  public final String b(int paramInt, Object paramObject)
  {
    if (paramInt == 223) {
      return f(((Number)paramObject).intValue());
    }
    return super.b(paramInt, paramObject);
  }
  
  public final String e(int paramInt)
  {
    if (paramInt == 221)
    {
      int i = efj.hO;
      return g().getString(i);
    }
    return super.e(paramInt);
  }
  
  public final gxq v()
  {
    return new gxq(pjw.o);
  }
  
  public final int w()
  {
    return 17;
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
    int i = g().getDimensionPixelSize(efj.cb);
    int j = g().getDimensionPixelSize(efj.cc);
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
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     akt
 * JD-Core Version:    0.7.0.1
 */