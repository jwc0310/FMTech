import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class kfh
  extends BaseAdapter
  implements kew
{
  private kfg a;
  private List<ket> b;
  private ArrayList<kfj> c;
  private kfj d = new kfj();
  private boolean e = false;
  private volatile boolean f = false;
  private Handler g = new Handler();
  private Runnable h = new kfi(this);
  
  public kfh(kfg paramkfg)
  {
    this.a = paramkfg;
    this.a.A = this;
    this.b = new ArrayList();
    this.c = new ArrayList();
    c();
  }
  
  private static kfj a(ket paramket, kfj paramkfj)
  {
    if (paramkfj != null) {}
    for (;;)
    {
      paramkfj.c = paramket.getClass().getName();
      paramkfj.a = paramket.x;
      paramkfj.b = paramket.y;
      return paramkfj;
      paramkfj = new kfj();
    }
  }
  
  private final void a(List<ket> paramList, kfg paramkfg)
  {
    try
    {
      Collections.sort(paramkfg.a);
      int i = paramkfg.a.size();
      for (int j = 0; j < i; j++)
      {
        ket localket = (ket)paramkfg.a.get(j);
        paramList.add(localket);
        if ((!this.e) && (localket.z))
        {
          kfj localkfj = a(localket, null);
          int k = Collections.binarySearch(this.c, localkfj);
          if (k < 0)
          {
            int m = -1 + -k;
            this.c.add(m, localkfj);
          }
        }
        if ((localket instanceof kfg))
        {
          kfg localkfg = (kfg)localket;
          if (localkfg.k()) {
            a(paramList, localkfg);
          }
        }
        localket.A = this;
      }
      return;
    }
    finally {}
  }
  
  public final void a()
  {
    notifyDataSetChanged();
  }
  
  public final boolean areAllItemsEnabled()
  {
    return false;
  }
  
  public final void b()
  {
    this.g.removeCallbacks(this.h);
    this.g.post(this.h);
  }
  
  /* Error */
  final void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 37	kfh:f	Z
    //   6: ifeq +6 -> 12
    //   9: aload_0
    //   10: monitorexit
    //   11: return
    //   12: aload_0
    //   13: iconst_1
    //   14: putfield 37	kfh:f	Z
    //   17: aload_0
    //   18: monitorexit
    //   19: new 59	java/util/ArrayList
    //   22: dup
    //   23: aload_0
    //   24: getfield 62	kfh:b	Ljava/util/List;
    //   27: invokeinterface 110 1 0
    //   32: invokespecial 151	java/util/ArrayList:<init>	(I)V
    //   35: astore_2
    //   36: aload_0
    //   37: aload_2
    //   38: aload_0
    //   39: getfield 51	kfh:a	Lkfg;
    //   42: invokespecial 136	kfh:a	(Ljava/util/List;Lkfg;)V
    //   45: aload_0
    //   46: aload_2
    //   47: putfield 62	kfh:b	Ljava/util/List;
    //   50: aload_0
    //   51: invokevirtual 139	kfh:notifyDataSetChanged	()V
    //   54: aload_0
    //   55: monitorenter
    //   56: aload_0
    //   57: iconst_0
    //   58: putfield 37	kfh:f	Z
    //   61: aload_0
    //   62: invokevirtual 154	java/lang/Object:notifyAll	()V
    //   65: aload_0
    //   66: monitorexit
    //   67: return
    //   68: astore_3
    //   69: aload_0
    //   70: monitorexit
    //   71: aload_3
    //   72: athrow
    //   73: astore_1
    //   74: aload_0
    //   75: monitorexit
    //   76: aload_1
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	kfh
    //   73	4	1	localObject1	Object
    //   35	12	2	localArrayList	ArrayList
    //   68	4	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   56	67	68	finally
    //   69	71	68	finally
    //   2	11	73	finally
    //   12	19	73	finally
    //   74	76	73	finally
  }
  
  public final int getCount()
  {
    return this.b.size();
  }
  
  public final long getItemId(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= getCount())) {
      return -9223372036854775808L;
    }
    return ((ket)getItem(paramInt)).n;
  }
  
  public final int getItemViewType(int paramInt)
  {
    if (!this.e) {
      this.e = true;
    }
    ket localket = (ket)getItem(paramInt);
    int i;
    if (!localket.z) {
      i = -1;
    }
    do
    {
      return i;
      this.d = a(localket, this.d);
      i = Collections.binarySearch(this.c, this.d);
    } while (i >= 0);
    return -1;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ket localket = (ket)getItem(paramInt);
    this.d = a(localket, this.d);
    if (Collections.binarySearch(this.c, this.d) < 0) {}
    for (View localView = null;; localView = paramView)
    {
      if (localView == null) {
        localView = localket.a(paramViewGroup);
      }
      localket.a(localView);
      return localView;
    }
  }
  
  public final int getViewTypeCount()
  {
    if (!this.e) {
      this.e = true;
    }
    return Math.max(1, this.c.size());
  }
  
  public final boolean hasStableIds()
  {
    return true;
  }
  
  public final boolean isEnabled(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= getCount())) {
      return true;
    }
    return ((ket)getItem(paramInt)).v;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kfh
 * JD-Core Version:    0.7.0.1
 */