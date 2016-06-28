import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class hxq
{
  final hyb[] a = new hyb[5];
  public byte[] b;
  ArrayList<byte[]> c = new ArrayList();
  final ByteOrder d;
  byte[] e;
  
  public hxq(ByteOrder paramByteOrder)
  {
    this.d = paramByteOrder;
  }
  
  public final hya a(hya paramhya)
  {
    hya localhya = null;
    if (paramhya != null)
    {
      int i = paramhya.f;
      localhya = null;
      if (paramhya != null)
      {
        boolean bool = hya.a(i);
        localhya = null;
        if (bool)
        {
          hyb localhyb = this.a[i];
          if (localhyb == null)
          {
            localhyb = new hyb(i);
            this.a[i] = localhyb;
          }
          localhya = localhyb.a(paramhya);
        }
      }
    }
    return localhya;
  }
  
  public final List<hya> a()
  {
    ArrayList localArrayList = new ArrayList();
    for (hyb localhyb : this.a) {
      if (localhyb != null)
      {
        hya[] arrayOfhya = localhyb.a();
        if (arrayOfhya != null) {
          Collections.addAll(localArrayList, arrayOfhya);
        }
      }
    }
    if (localArrayList.isEmpty()) {
      localArrayList = null;
    }
    return localArrayList;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1;
    if (this == paramObject) {
      bool1 = true;
    }
    hxq localhxq;
    boolean bool3;
    do
    {
      int i;
      int j;
      do
      {
        ByteOrder localByteOrder1;
        ByteOrder localByteOrder2;
        do
        {
          boolean bool2;
          do
          {
            do
            {
              return bool1;
              bool1 = false;
            } while (paramObject == null);
            bool2 = paramObject instanceof hxq;
            bool1 = false;
          } while (!bool2);
          localhxq = (hxq)paramObject;
          localByteOrder1 = localhxq.d;
          localByteOrder2 = this.d;
          bool1 = false;
        } while (localByteOrder1 != localByteOrder2);
        i = localhxq.c.size();
        j = this.c.size();
        bool1 = false;
      } while (i != j);
      bool3 = Arrays.equals(localhxq.b, this.b);
      bool1 = false;
    } while (!bool3);
    for (int k = 0;; k++)
    {
      if (k >= this.c.size()) {
        break label161;
      }
      boolean bool5 = Arrays.equals((byte[])localhxq.c.get(k), (byte[])this.c.get(k));
      bool1 = false;
      if (!bool5) {
        break;
      }
    }
    label161:
    int m = 0;
    label164:
    if (m < 5)
    {
      hyb localhyb1;
      if (hya.a(m))
      {
        localhyb1 = localhxq.a[m];
        label188:
        if (!hya.a(m)) {
          break label245;
        }
      }
      label245:
      for (hyb localhyb2 = this.a[m];; localhyb2 = null)
      {
        if ((localhyb1 != localhyb2) && (localhyb1 != null))
        {
          boolean bool4 = localhyb1.equals(localhyb2);
          bool1 = false;
          if (!bool4) {
            break;
          }
        }
        m++;
        break label164;
        localhyb1 = null;
        break label188;
      }
    }
    return true;
  }
  
  public final int hashCode()
  {
    return 31 * (31 * (31 * (527 + this.d.hashCode()) + this.c.hashCode()) + Arrays.hashCode(this.b)) + Arrays.hashCode(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hxq
 * JD-Core Version:    0.7.0.1
 */