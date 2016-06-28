import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.android.libraries.photoeditor.util.BitmapHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class ajc
  extends akx
{
  private static final List<Integer> as;
  private static final int[] at;
  private static final int[] au;
  private static final int[] av;
  final anc Z = new aji(this);
  final ald a = new ald(this, 241, at);
  final ajg aa = new ajg(this);
  alg b;
  ale c;
  final anc d = new ajh(this);
  
  static
  {
    int[] arrayOfInt1 = new int[10];
    arrayOfInt1[0] = efj.dl;
    arrayOfInt1[1] = efj.dk;
    arrayOfInt1[2] = efj.dp;
    arrayOfInt1[3] = efj.do;
    arrayOfInt1[4] = efj.dn;
    arrayOfInt1[5] = efj.dm;
    arrayOfInt1[6] = efj.dr;
    arrayOfInt1[7] = efj.dq;
    arrayOfInt1[8] = efj.dj;
    arrayOfInt1[9] = efj.di;
    at = arrayOfInt1;
    int[] arrayOfInt2 = new int[5];
    arrayOfInt2[0] = efj.ht;
    arrayOfInt2[1] = efj.ih;
    arrayOfInt2[2] = efj.hy;
    arrayOfInt2[3] = efj.iA;
    arrayOfInt2[4] = efj.hm;
    au = arrayOfInt2;
    int[] arrayOfInt3 = new int[6];
    arrayOfInt3[0] = efj.gB;
    arrayOfInt3[1] = efj.gx;
    arrayOfInt3[2] = efj.gw;
    arrayOfInt3[3] = efj.gy;
    arrayOfInt3[4] = efj.gA;
    arrayOfInt3[5] = efj.gz;
    av = arrayOfInt3;
    ArrayList localArrayList = new ArrayList();
    Integer[] arrayOfInteger = new Integer[3];
    arrayOfInteger[0] = Integer.valueOf(0);
    arrayOfInteger[1] = Integer.valueOf(1);
    arrayOfInteger[2] = Integer.valueOf(14);
    Collections.addAll(localArrayList, arrayOfInteger);
    as = Collections.unmodifiableList(localArrayList);
  }
  
  protected final List<Integer> C()
  {
    return as;
  }
  
  protected final void a(alm paramalm)
  {
    int i = efj.fo;
    int j = efj.ib;
    paramalm.a(i, 0, 0, g().getString(j), new ajd(this));
    int k = efj.eV;
    int m = efj.gI;
    paramalm.a(k, 0, 0, g().getString(m), new aje(this));
  }
  
  public final String b(int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    default: 
      return super.b(paramInt, paramObject);
    case 3: 
      int k = ((Number)paramObject).intValue();
      int m = av[k];
      return g().getString(m);
    }
    int i = ((Number)paramObject).intValue();
    if ((i >= 0) && (i < au.length))
    {
      int j = au[i];
      return g().getString(j);
    }
    return "*UNKNOWN*";
  }
  
  protected final void e_()
  {
    super.e_();
    if (this.b != null) {
      return;
    }
    int i = g().getDimensionPixelSize(efj.cf);
    Bitmap localBitmap = BitmapHelper.createCenterCropBitmap(M().b(), i, i, 0, 0, 0);
    this.b = new alg(this, N(), 3, localBitmap);
    Rect localRect = a(i, M().b());
    gen localgen = (gen)this.ai;
    ajf localajf = new ajf(this, localRect);
    localgen.c.add(localajf);
  }
  
  public final gxq v()
  {
    return new gxq(pjw.c);
  }
  
  public final int w()
  {
    return 7;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ajc
 * JD-Core Version:    0.7.0.1
 */