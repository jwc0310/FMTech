import java.util.Iterator;
import java.util.List;

final class aoq
  extends atr
{
  public float a;
  private final aou b;
  
  public aoq(aou paramaou)
  {
    this.b = paramaou;
  }
  
  public final void a(ast paramast)
  {
    int i = 1;
    aou localaou = this.b;
    int j;
    label40:
    float f;
    if (!localaou.c.isEmpty())
    {
      j = i;
      if ((paramast.a() == 0L) || (paramast.b() == 0L)) {
        break label75;
      }
      if ((localaou.a == aow.j.ordinal()) && (j == i)) {
        break label80;
      }
      f = 0.0F;
    }
    for (;;)
    {
      this.a = f;
      return;
      j = 0;
      break;
      label75:
      i = 0;
      break label40;
      label80:
      if (i != 0)
      {
        long l = ((Long)localaou.c.get(0)).longValue();
        if ((paramast.a() <= l) && (l <= paramast.b())) {
          f = 1.0F;
        } else {
          f = 0.0F;
        }
      }
      else
      {
        f = 1.0F;
      }
    }
  }
  
  public final void a(asu paramasu)
  {
    int i = 1;
    aou localaou = this.b;
    int j;
    label34:
    float f1;
    if (!localaou.c.isEmpty())
    {
      j = i;
      if (paramasu.b.isEmpty()) {
        break label80;
      }
      int k = localaou.a;
      int m = aow.a.ordinal();
      f1 = 0.0F;
      if (k == m)
      {
        f1 = 0.0F;
        if (j == i) {
          break label85;
        }
      }
    }
    for (;;)
    {
      this.a = f1;
      return;
      j = 0;
      break;
      label80:
      i = 0;
      break label34;
      label85:
      float f2;
      if (i != 0)
      {
        long l1 = ((Long)localaou.c.get(0)).longValue();
        long l2 = ((Long)localaou.c.get(-1 + localaou.c.size())).longValue();
        Iterator localIterator2 = paramasu.b.iterator();
        f2 = 0.0F;
        if (localIterator2.hasNext())
        {
          Long localLong2 = (Long)localIterator2.next();
          if ((l2 <= localLong2.longValue()) && (localLong2.longValue() <= l1)) {}
          for (float f4 = 1.0F;; f4 = 0.0F)
          {
            f2 = f4 + f2;
            break;
          }
        }
      }
      else
      {
        Iterator localIterator1 = paramasu.a.iterator();
        f2 = 0.0F;
        if (localIterator1.hasNext())
        {
          Long localLong1 = (Long)localIterator1.next();
          if (localaou.b.contains(localLong1)) {}
          for (float f3 = 1.0F;; f3 = 0.0F)
          {
            f2 = f3 + f2;
            break;
          }
        }
      }
      f1 = f2 / paramasu.a.size();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aoq
 * JD-Core Version:    0.7.0.1
 */