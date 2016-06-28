import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.libraries.photoeditor.core.NativeCore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class alh
  extends akx
  implements gff
{
  private static final int[] Z;
  private static final List<Integer> c;
  private static final int[] d;
  final ald a = new ald(this, 3, Z);
  final anc b = new all(this);
  
  static
  {
    int[] arrayOfInt1 = new int[4];
    arrayOfInt1[0] = efj.ho;
    arrayOfInt1[1] = efj.hp;
    arrayOfInt1[2] = efj.hn;
    arrayOfInt1[3] = efj.hq;
    d = arrayOfInt1;
    int[] arrayOfInt2 = new int[8];
    arrayOfInt2[0] = efj.dt;
    arrayOfInt2[1] = efj.ds;
    arrayOfInt2[2] = efj.dv;
    arrayOfInt2[3] = efj.du;
    arrayOfInt2[4] = efj.cn;
    arrayOfInt2[5] = efj.cm;
    arrayOfInt2[6] = efj.dX;
    arrayOfInt2[7] = efj.dW;
    Z = arrayOfInt2;
    ArrayList localArrayList = new ArrayList();
    Integer[] arrayOfInteger = new Integer[3];
    arrayOfInteger[0] = Integer.valueOf(12);
    arrayOfInteger[1] = Integer.valueOf(0);
    arrayOfInteger[2] = Integer.valueOf(2);
    Collections.addAll(localArrayList, arrayOfInteger);
    c = Collections.unmodifiableList(localArrayList);
  }
  
  protected final void A()
  {
    NativeCore.a.c = null;
    j(false);
    super.A();
  }
  
  protected final List<Integer> C()
  {
    return c;
  }
  
  public final void D()
  {
    a(null);
  }
  
  protected final void a(alm paramalm)
  {
    int i = efj.fo;
    int j = efj.ib;
    paramalm.a(i, 0, 0, g().getString(j), new ali(this));
  }
  
  public final void a(Bitmap paramBitmap)
  {
    this.N.post(new alk(this));
  }
  
  public final String b(int paramInt, Object paramObject)
  {
    if (paramInt == 3)
    {
      int i = ((Number)paramObject).intValue();
      if ((i >= 0) && (i < d.length))
      {
        int j = d[i];
        return g().getString(j);
      }
      return "*UNKNOWN*";
    }
    return super.b(paramInt, paramObject);
  }
  
  public final void c_()
  {
    this.N.post(new alj(this));
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
    return new gxq(pjw.p);
  }
  
  public final int w()
  {
    return 100;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     alh
 * JD-Core Version:    0.7.0.1
 */