import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.android.libraries.photoeditor.util.BitmapHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class ajz
  extends akx
{
  private static final int[] Z;
  private static final List<Integer> d;
  alg a;
  final anc b = new akd(this);
  final akc c = new akc(this);
  
  static
  {
    int[] arrayOfInt = new int[6];
    arrayOfInt[0] = efj.gN;
    arrayOfInt[1] = efj.gO;
    arrayOfInt[2] = efj.gP;
    arrayOfInt[3] = efj.gQ;
    arrayOfInt[4] = efj.gR;
    arrayOfInt[5] = efj.gS;
    Z = arrayOfInt;
    ArrayList localArrayList = new ArrayList();
    Integer[] arrayOfInteger = new Integer[2];
    arrayOfInteger[0] = Integer.valueOf(12);
    arrayOfInteger[1] = Integer.valueOf(2);
    Collections.addAll(localArrayList, arrayOfInteger);
    d = Collections.unmodifiableList(localArrayList);
  }
  
  protected final List<Integer> C()
  {
    return d;
  }
  
  protected final void a(alm paramalm)
  {
    int i = efj.fo;
    int j = efj.ib;
    paramalm.a(i, 0, 0, g().getString(j), new akb(this));
  }
  
  public final String b(int paramInt, Object paramObject)
  {
    if (paramInt == 3)
    {
      int i = ((Number)paramObject).intValue();
      int j = Z[i];
      return g().getString(j);
    }
    return super.b(paramInt, paramObject);
  }
  
  protected final void e_()
  {
    super.e_();
    if (this.a != null) {
      return;
    }
    int i = g().getDimensionPixelSize(efj.cf);
    Bitmap localBitmap = BitmapHelper.createCenterCropBitmap(M().b(), i, i, 0, 0, 0);
    this.a = new alg(this, N(), 3, localBitmap);
    Rect localRect = a(i, M().b());
    gen localgen = (gen)this.ai;
    aka localaka = new aka(this, localRect);
    localgen.c.add(localaka);
  }
  
  public final gxq v()
  {
    return new gxq(pjw.k);
  }
  
  public final int w()
  {
    return 9;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ajz
 * JD-Core Version:    0.7.0.1
 */