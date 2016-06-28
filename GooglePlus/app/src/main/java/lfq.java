import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lfq
  implements gzi
{
  public final int a;
  public final gzj b;
  public SparseArray<lgl> c;
  public Context d;
  public bk e;
  public lfe f;
  public int g;
  
  public lfq(Context paramContext, bk parambk, int paramInt, lfe paramlfe)
  {
    this.d = paramContext;
    this.a = paramInt;
    this.e = parambk;
    this.b = ((gzj)mbb.a(paramContext, gzj.class));
    this.b.a.add(this);
    this.f = paramlfe;
    this.c = new SparseArray();
    Iterator localIterator = mbb.c(paramContext, lgl.class).iterator();
    while (localIterator.hasNext())
    {
      lgl locallgl = (lgl)localIterator.next();
      this.c.put(locallgl.a(), locallgl);
    }
  }
  
  public void a(haa paramhaa)
  {
    lgl locallgl = (lgl)this.c.get(this.g);
    if (locallgl != null) {
      locallgl.a(paramhaa, this.e.h());
    }
  }
  
  public void a(String paramString, int paramInt)
  {
    if (!efj.o(paramInt)) {
      throw new IllegalArgumentException("Action is not a join action");
    }
    int[] arrayOfInt = a();
    lge locallge = new lge(this.d, this.a, "squares_promo_task", arrayOfInt, paramString);
    this.b.b(locallge);
  }
  
  public void a(String paramString, hae paramhae, haa paramhaa)
  {
    if (("squares_promo_task".equals(paramString)) && (paramhae != null))
    {
      this.g = paramhae.a().getInt("squares_promo_type", 0);
      String str = paramhae.a().getString("square_id_key");
      this.f.a(str);
    }
  }
  
  public int[] a()
  {
    int[] arrayOfInt = new int[this.c.size()];
    for (int i = 0; i < arrayOfInt.length; i++) {
      arrayOfInt[i] = this.c.keyAt(i);
    }
    return arrayOfInt;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lfq
 * JD-Core Version:    0.7.0.1
 */