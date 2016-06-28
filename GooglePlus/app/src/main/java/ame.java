import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ame
  extends akx
{
  private static final List<Integer> c;
  private static final int[] d;
  final ald a = new ald(this, 3, d);
  final anc b = new amh(this);
  
  static
  {
    int[] arrayOfInt = new int[26];
    arrayOfInt[0] = efj.dF;
    arrayOfInt[1] = efj.dE;
    arrayOfInt[2] = efj.dH;
    arrayOfInt[3] = efj.dG;
    arrayOfInt[4] = efj.dJ;
    arrayOfInt[5] = efj.dI;
    arrayOfInt[6] = efj.dL;
    arrayOfInt[7] = efj.dK;
    arrayOfInt[8] = efj.dN;
    arrayOfInt[9] = efj.dM;
    arrayOfInt[10] = efj.dP;
    arrayOfInt[11] = efj.dO;
    arrayOfInt[12] = efj.dR;
    arrayOfInt[13] = efj.dQ;
    arrayOfInt[14] = efj.dT;
    arrayOfInt[15] = efj.dS;
    arrayOfInt[16] = efj.dV;
    arrayOfInt[17] = efj.dU;
    arrayOfInt[18] = efj.dx;
    arrayOfInt[19] = efj.dw;
    arrayOfInt[20] = efj.dz;
    arrayOfInt[21] = efj.dy;
    arrayOfInt[22] = efj.dB;
    arrayOfInt[23] = efj.dA;
    arrayOfInt[24] = efj.dD;
    arrayOfInt[25] = efj.dC;
    d = arrayOfInt;
    ArrayList localArrayList = new ArrayList();
    Integer[] arrayOfInteger = new Integer[6];
    arrayOfInteger[0] = Integer.valueOf(0);
    arrayOfInteger[1] = Integer.valueOf(2);
    arrayOfInteger[2] = Integer.valueOf(1);
    arrayOfInteger[3] = Integer.valueOf(9);
    arrayOfInteger[4] = Integer.valueOf(233);
    arrayOfInteger[5] = Integer.valueOf(232);
    Collections.addAll(localArrayList, arrayOfInteger);
    c = Collections.unmodifiableList(localArrayList);
  }
  
  private final String a(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      Object[] arrayOfObject = new Object[2];
      int i = efj.ib;
      arrayOfObject[0] = g().getString(i);
      arrayOfObject[1] = Integer.valueOf(paramInt + 1);
      return String.format("%s %d", arrayOfObject);
    }
    return f(paramInt);
  }
  
  protected final List<Integer> C()
  {
    return c;
  }
  
  public final String a(int paramInt, Object paramObject)
  {
    if (paramInt == 3) {
      return a(((Number)paramObject).intValue(), true);
    }
    return super.b(paramInt, paramObject);
  }
  
  protected final void a(alm paramalm)
  {
    int i = efj.fo;
    int j = efj.ib;
    paramalm.a(i, 0, 0, g().getString(j), new amf(this));
    int k = efj.fl;
    int m = efj.io;
    paramalm.a(k, 0, 0, g().getString(m), new amg(this));
  }
  
  public final String b(int paramInt, Object paramObject)
  {
    if (paramInt == 3) {
      return a(((Number)paramObject).intValue(), false);
    }
    return super.b(paramInt, paramObject);
  }
  
  public final gxq v()
  {
    return new gxq(pjw.t);
  }
  
  public final int w()
  {
    return 16;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ame
 * JD-Core Version:    0.7.0.1
 */