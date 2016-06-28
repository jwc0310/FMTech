import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class jfl
  implements Iterator<Object>
{
  private nvr a;
  private Iterator<nxs> b;
  private Iterator<nxq> c;
  private Iterator<nxr> d;
  private Iterator<nxp> e;
  private int f = 0;
  private int g;
  private Object h;
  
  public jfl(nvr paramnvr, int paramInt)
  {
    Iterator localIterator1;
    Iterator localIterator2;
    if (paramnvr != null)
    {
      this.a = paramnvr;
      this.g = paramInt;
      if (paramnvr.a == null) {
        break label142;
      }
      localIterator1 = Arrays.asList(paramnvr.a).iterator();
      this.b = localIterator1;
      if (paramnvr.b == null) {
        break label147;
      }
      localIterator2 = Arrays.asList(paramnvr.b).iterator();
      label69:
      this.c = localIterator2;
      if (paramnvr.d == null) {
        break label153;
      }
    }
    label142:
    label147:
    label153:
    for (Iterator localIterator3 = Arrays.asList(paramnvr.d).iterator();; localIterator3 = null)
    {
      this.d = localIterator3;
      nxp[] arrayOfnxp = paramnvr.c;
      Iterator localIterator4 = null;
      if (arrayOfnxp != null) {
        localIterator4 = Arrays.asList(paramnvr.c).iterator();
      }
      this.e = localIterator4;
      next();
      return;
      localIterator1 = null;
      break;
      localIterator2 = null;
      break label69;
    }
  }
  
  private final nxs a(int paramInt)
  {
    if (this.b == null) {
      return null;
    }
    while (this.b.hasNext())
    {
      nxs localnxs = (nxs)this.b.next();
      if (paramInt == localnxs.d) {
        return localnxs;
      }
    }
    return null;
  }
  
  public final boolean hasNext()
  {
    return this.h != null;
  }
  
  public final Object next()
  {
    Object localObject = this.h;
    this.h = null;
    while ((this.h == null) && (this.f != 7)) {
      switch (this.f)
      {
      default: 
        break;
      case 0: 
        int i2;
        if (1 == this.g)
        {
          i2 = 2;
          this.h = a(i2);
          if (this.h != null) {
            continue;
          }
          this.f = 1;
          if (this.a.a == null) {
            break label150;
          }
        }
        for (Iterator localIterator3 = Arrays.asList(this.a.a).iterator();; localIterator3 = null)
        {
          this.b = localIterator3;
          break;
          i2 = 3;
          break label86;
        }
      case 1: 
        if (1 == this.g) {}
        for (int i1 = 7;; i1 = 18)
        {
          this.h = a(i1);
          if (this.h != null) {
            break;
          }
          this.f = 2;
          break;
        }
      case 2: 
        int n;
        nxq localnxq;
        if (1 == this.g)
        {
          n = 2;
          for (;;)
          {
            if ((this.c != null) && (this.c.hasNext()))
            {
              localnxq = (nxq)this.c.next();
              if ((localnxq.b != null) && (n == localnxq.b.a))
              {
                this.h = localnxq;
                if (this.h != null) {
                  break;
                }
                this.f = 3;
                if (this.a.a == null) {
                  break label331;
                }
              }
            }
          }
        }
        for (Iterator localIterator2 = Arrays.asList(this.a.a).iterator();; localIterator2 = null)
        {
          this.b = localIterator2;
          break;
          n = 3;
          break label211;
          localnxq = null;
          break label265;
        }
      case 3: 
        int m;
        if (1 == this.g)
        {
          m = 5;
          this.h = a(m);
          if (this.h != null) {
            continue;
          }
          this.f = 4;
          if (this.a.a == null) {
            break label413;
          }
        }
        for (Iterator localIterator1 = Arrays.asList(this.a.a).iterator();; localIterator1 = null)
        {
          this.b = localIterator1;
          break;
          m = 6;
          break label348;
        }
      case 4: 
        if (1 == this.g) {}
        for (int k = 8;; k = 19)
        {
          this.h = a(k);
          if (this.h != null) {
            break;
          }
          this.f = 5;
          break;
        }
      case 5: 
        int j;
        nxr localnxr;
        if (1 == this.g)
        {
          j = 2;
          do
          {
            if ((this.d == null) || (!this.d.hasNext())) {
              break;
            }
            localnxr = (nxr)this.d.next();
          } while ((localnxr.b == null) || (j != localnxr.b.a));
        }
        for (;;)
        {
          this.h = localnxr;
          if (this.h != null) {
            break;
          }
          this.f = 6;
          break;
          j = 3;
          break label474;
          localnxr = null;
        }
      case 6: 
        label86:
        label348:
        int i;
        label150:
        label211:
        label474:
        nxp localnxp;
        label265:
        label331:
        if (1 == this.g)
        {
          i = 2;
          do
          {
            if ((this.e == null) || (!this.e.hasNext())) {
              break;
            }
            localnxp = (nxp)this.e.next();
          } while ((localnxp.b == null) || (i != localnxp.b.a));
        }
        for (;;)
        {
          label413:
          label572:
          this.h = localnxp;
          if (this.h != null) {
            break;
          }
          this.f = 7;
          break;
          i = 3;
          break label572;
          localnxp = null;
        }
      }
    }
    return localObject;
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jfl
 * JD-Core Version:    0.7.0.1
 */