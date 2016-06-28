import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class kig
{
  public boolean a;
  private final int b;
  private ArrayList<gnb> c;
  
  public kig(int paramInt)
  {
    this.b = paramInt;
  }
  
  private static ArrayList<lhp> a(gnb paramgnb1, gnb paramgnb2, Map<String, lhp> paramMap)
  {
    lhp[] arrayOflhp = paramgnb2.d;
    LinkedHashSet localLinkedHashSet = new LinkedHashSet(arrayOflhp.length);
    if (arrayOflhp.length == 0) {
      return new ArrayList(localLinkedHashSet);
    }
    if ((paramgnb1 != null) && (paramgnb1.d.length > 0) && (paramgnb1.d[0].a.equals(arrayOflhp[0].a))) {
      return null;
    }
    int i = arrayOflhp.length;
    int j = 0;
    if (j < i)
    {
      lhp locallhp1 = arrayOflhp[j];
      if (paramMap == null) {
        return null;
      }
      lhp locallhp2 = (lhp)paramMap.get(locallhp1.a);
      if (locallhp2 != null)
      {
        if (paramgnb1 != null) {
          break label161;
        }
        localLinkedHashSet.add(new lhp(locallhp2.a, locallhp2.b, locallhp1.c, locallhp1.d, locallhp2.e));
      }
      for (;;)
      {
        j++;
        break;
        label161:
        localLinkedHashSet.add(new lhp(locallhp2.a, locallhp2.b, null, null, locallhp2.e));
      }
    }
    return new ArrayList(localLinkedHashSet);
  }
  
  public final void a(Context paramContext, ArrayList<gnb> paramArrayList)
  {
    kif localkif;
    Iterator localIterator1;
    if (this.a)
    {
      localkif = (kif)mbb.a(paramContext, kif.class);
      this.c = new ArrayList();
      localIterator1 = paramArrayList.iterator();
    }
    label256:
    label266:
    for (;;)
    {
      gnb localgnb2;
      if (localIterator1.hasNext())
      {
        localgnb2 = localkif.b((gnb)localIterator1.next());
        if (localgnb2 != null)
        {
          Iterator localIterator2 = this.c.iterator();
          do
          {
            if (!localIterator2.hasNext()) {
              break;
            }
          } while (!gnb.a((gnb)localIterator2.next(), localgnb2));
        }
      }
      else
      {
        for (int i1 = 0;; i1 = 1)
        {
          if (i1 == 0) {
            break label266;
          }
          this.c.add(localgnb2);
          break;
          kie localkie = (kie)mbb.a(paramContext, kie.class);
          int i = paramArrayList.size();
          this.c = new ArrayList();
          int j = 0;
          gnb localgnb1;
          int m;
          if (j < i)
          {
            localgnb1 = localkie.b((gnb)paramArrayList.get(j));
            if (localgnb1 != null)
            {
              int k = this.c.size();
              m = 0;
              label198:
              if (m >= k) {
                break label256;
              }
              if (!gnb.a((gnb)this.c.get(m), localgnb1)) {
                break label249;
              }
            }
          }
          for (int n = 0;; n = 1)
          {
            if (n != 0) {
              this.c.add(localgnb1);
            }
            j++;
            break;
            label249:
            m++;
            break label198;
            return;
          }
        }
      }
    }
  }
  
  public final gnb[] a(gnb paramgnb, Map<String, jgs> paramMap, Map<String, hps> paramMap1, Map<String, lhp> paramMap2, boolean paramBoolean1, boolean paramBoolean2)
  {
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    int i = this.c.size();
    int j = 0;
    gnb localgnb1;
    jgs[] arrayOfjgs;
    ArrayList localArrayList1;
    int k;
    int m;
    if ((j < i) && (localLinkedHashSet.size() != this.b))
    {
      localgnb1 = (gnb)this.c.get(j);
      arrayOfjgs = localgnb1.c;
      localArrayList1 = new ArrayList();
      k = 0;
      if (k >= arrayOfjgs.length) {
        break label505;
      }
      if ((arrayOfjgs[k].c == 9) && (paramBoolean1)) {
        m = 0;
      }
    }
    for (;;)
    {
      label104:
      ArrayList localArrayList2;
      if (m != 0)
      {
        hps[] arrayOfhps = localgnb1.e;
        localArrayList2 = new ArrayList(arrayOfhps.length);
        int n = 0;
        label131:
        if (n < arrayOfhps.length)
        {
          hps localhps1 = arrayOfhps[n];
          if (paramMap1 == null) {
            localArrayList2.add(localhps1);
          }
          for (;;)
          {
            n++;
            break label131;
            if ((arrayOfjgs[k].c == 8) && (paramBoolean2))
            {
              m = 0;
              break label104;
            }
            if (paramMap == null) {
              localArrayList1.add(arrayOfjgs[k]);
            }
            for (;;)
            {
              k++;
              break;
              jgs localjgs = (jgs)paramMap.get(arrayOfjgs[k].a);
              if (localjgs != null) {
                localArrayList1.add(new jgs(localjgs));
              }
            }
            hps localhps2 = (hps)paramMap1.get(localhps1.a);
            if (localhps2 != null) {
              localArrayList2.add(new hps(localhps2.a, localhps2.b, localhps2.c));
            }
          }
        }
        if (!this.a) {
          break label432;
        }
        ArrayList localArrayList3 = a(paramgnb, localgnb1, paramMap2);
        if ((!localArrayList1.isEmpty()) || (!localArrayList2.isEmpty()) || ((localArrayList3 != null) && (!localArrayList3.isEmpty())))
        {
          gnb localgnb3 = new gnb(null, (jgs[])localArrayList1.toArray(new jgs[localArrayList1.size()]), (lhp[])localArrayList3.toArray(new lhp[localArrayList3.size()]), (hps[])localArrayList2.toArray(new hps[localArrayList2.size()]));
          if (!gnb.a(paramgnb, localgnb3)) {
            localLinkedHashSet.add(localgnb3);
          }
        }
      }
      for (;;)
      {
        j++;
        break;
        label432:
        if ((!localArrayList1.isEmpty()) || (!localArrayList2.isEmpty()))
        {
          gnb localgnb2 = new gnb(null, localArrayList1, localArrayList2);
          if (!gnb.a(paramgnb, localgnb2)) {
            localLinkedHashSet.add(localgnb2);
          }
        }
      }
      return (gnb[])localLinkedHashSet.toArray(new gnb[localLinkedHashSet.size()]);
      label505:
      m = 1;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kig
 * JD-Core Version:    0.7.0.1
 */