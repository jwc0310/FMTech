import android.content.res.Resources;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import com.google.android.libraries.photoeditor.ui.views.ToolButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class amt
  extends akx
{
  private static final int[] Z;
  private static final List<Integer> d;
  final ald a = new ald(this, 800, Z);
  final amw b = new amw(this);
  ToolButton c;
  
  static
  {
    int[] arrayOfInt = new int[24];
    arrayOfInt[0] = efj.ej;
    arrayOfInt[1] = efj.ei;
    arrayOfInt[2] = efj.el;
    arrayOfInt[3] = efj.ek;
    arrayOfInt[4] = efj.en;
    arrayOfInt[5] = efj.em;
    arrayOfInt[6] = efj.ep;
    arrayOfInt[7] = efj.eo;
    arrayOfInt[8] = efj.er;
    arrayOfInt[9] = efj.eq;
    arrayOfInt[10] = efj.et;
    arrayOfInt[11] = efj.es;
    arrayOfInt[12] = efj.ev;
    arrayOfInt[13] = efj.eu;
    arrayOfInt[14] = efj.ex;
    arrayOfInt[15] = efj.ew;
    arrayOfInt[16] = efj.ez;
    arrayOfInt[17] = efj.ey;
    arrayOfInt[18] = efj.ed;
    arrayOfInt[19] = efj.ec;
    arrayOfInt[20] = efj.ef;
    arrayOfInt[21] = efj.ee;
    arrayOfInt[22] = efj.eh;
    arrayOfInt[23] = efj.eg;
    Z = arrayOfInt;
    ArrayList localArrayList = new ArrayList();
    Integer[] arrayOfInteger = new Integer[4];
    arrayOfInteger[0] = Integer.valueOf(0);
    arrayOfInteger[1] = Integer.valueOf(2);
    arrayOfInteger[2] = Integer.valueOf(9);
    arrayOfInteger[3] = Integer.valueOf(6);
    Collections.addAll(localArrayList, arrayOfInteger);
    d = Collections.unmodifiableList(localArrayList);
  }
  
  protected final List<Integer> C()
  {
    return d;
  }
  
  public final String a(int paramInt, Object paramObject)
  {
    if (paramInt == 800)
    {
      int i = 1 + ((Number)paramObject).intValue();
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = e(3);
      arrayOfObject[1] = Integer.valueOf(i);
      return String.format("%s %d", arrayOfObject);
    }
    return b(paramInt, paramObject);
  }
  
  protected final void a(alm paramalm)
  {
    int i = N().getParameterInteger(800);
    this.a.a = i;
    int j = efj.fo;
    int k = efj.ib;
    paramalm.a(j, 0, 0, g().getString(k), new amu(this));
    int m = ((Number)N().d(19)).intValue();
    int n = efj.fn;
    int i1 = efj.fm;
    int i2 = efj.hA;
    this.c = paramalm.a(n, i1, 0, g().getString(i2), new amv(this, m));
    ToolButton localToolButton = this.c;
    int i3 = N().getParameterInteger(19);
    boolean bool = false;
    if (i3 != 0) {
      bool = true;
    }
    localToolButton.setSelected(bool);
  }
  
  public final String b(int paramInt, Object paramObject)
  {
    Integer localInteger = Integer.valueOf(((Number)paramObject).intValue());
    switch (paramInt)
    {
    default: 
      return super.b(paramInt, paramObject);
    case 800: 
      return f(localInteger.intValue());
    case 6: 
      if (localInteger.equals(Integer.valueOf(0))) {
        return "0";
      }
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = e(paramInt);
      arrayOfObject[1] = localInteger;
      return String.format("%s %d", arrayOfObject);
    }
    if (localInteger.equals(Integer.valueOf(0)))
    {
      int j = efj.gu;
      return g().getString(j);
    }
    int i = efj.gv;
    return g().getString(i);
  }
  
  public final gxq v()
  {
    return new gxq(pjw.z);
  }
  
  public final int w()
  {
    return 202;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     amt
 * JD-Core Version:    0.7.0.1
 */