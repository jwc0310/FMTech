import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ltq
  implements lta
{
  private final SparseArray<Map<String, ltb>> a;
  private final Context b;
  private final Object c = new Object();
  
  public ltq(Context paramContext)
  {
    this.b = paramContext;
    this.a = new SparseArray();
  }
  
  private final Map<String, ltb> a(int paramInt)
  {
    Object localObject = (Map)this.a.get(paramInt);
    if (localObject == null)
    {
      localObject = new kl();
      this.a.append(paramInt, localObject);
    }
    return localObject;
  }
  
  /* Error */
  private final void a(int paramInt, ltb paramltb)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 20	ltq:c	Ljava/lang/Object;
    //   4: astore_3
    //   5: aload_3
    //   6: monitorenter
    //   7: aload_2
    //   8: ifnull +136 -> 144
    //   11: aload_2
    //   12: getfield 47	ltb:i	Ljava/lang/Object;
    //   15: astore 5
    //   17: aload 5
    //   19: monitorenter
    //   20: aload_2
    //   21: getfield 51	ltb:h	J
    //   24: lconst_0
    //   25: lcmp
    //   26: ifeq +74 -> 100
    //   29: iconst_1
    //   30: istore 7
    //   32: iload 7
    //   34: ifne +10 -> 44
    //   37: aload_2
    //   38: invokestatic 57	java/lang/System:currentTimeMillis	()J
    //   41: putfield 51	ltb:h	J
    //   44: aload 5
    //   46: monitorexit
    //   47: aload_0
    //   48: getfield 22	ltq:b	Landroid/content/Context;
    //   51: ldc 59
    //   53: invokestatic 64	mbb:c	(Landroid/content/Context;Ljava/lang/Class;)Ljava/util/List;
    //   56: invokeinterface 70 1 0
    //   61: astore 8
    //   63: aload 8
    //   65: invokeinterface 76 1 0
    //   70: ifeq +44 -> 114
    //   73: aload 8
    //   75: invokeinterface 80 1 0
    //   80: checkcast 59	lsz
    //   83: iload_1
    //   84: aload_2
    //   85: invokeinterface 82 3 0
    //   90: goto -27 -> 63
    //   93: astore 4
    //   95: aload_3
    //   96: monitorexit
    //   97: aload 4
    //   99: athrow
    //   100: iconst_0
    //   101: istore 7
    //   103: goto -71 -> 32
    //   106: astore 6
    //   108: aload 5
    //   110: monitorexit
    //   111: aload 6
    //   113: athrow
    //   114: aload_0
    //   115: getfield 27	ltq:a	Landroid/util/SparseArray;
    //   118: iload_1
    //   119: invokevirtual 32	android/util/SparseArray:get	(I)Ljava/lang/Object;
    //   122: checkcast 34	java/util/Map
    //   125: astore 9
    //   127: aload 9
    //   129: ifnull +15 -> 144
    //   132: aload 9
    //   134: aload_2
    //   135: getfield 85	ltb:a	Ljava/lang/String;
    //   138: invokeinterface 89 2 0
    //   143: pop
    //   144: aload_3
    //   145: monitorexit
    //   146: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	147	0	this	ltq
    //   0	147	1	paramInt	int
    //   0	147	2	paramltb	ltb
    //   4	141	3	localObject1	Object
    //   93	5	4	localObject2	Object
    //   106	6	6	localObject4	Object
    //   30	72	7	i	int
    //   61	13	8	localIterator	Iterator
    //   125	8	9	localMap	Map
    // Exception table:
    //   from	to	target	type
    //   11	20	93	finally
    //   47	63	93	finally
    //   63	90	93	finally
    //   95	97	93	finally
    //   111	114	93	finally
    //   114	127	93	finally
    //   132	144	93	finally
    //   144	146	93	finally
    //   20	29	106	finally
    //   37	44	106	finally
    //   44	47	106	finally
    //   108	111	106	finally
  }
  
  public final void a(int paramInt, long paramLong1, long paramLong2, String paramString)
  {
    for (;;)
    {
      ltb localltb;
      synchronized (this.c)
      {
        Iterator localIterator = a(paramInt).values().iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        localltb = (ltb)localIterator.next();
        if ((!localltb.a(paramLong1)) || (TextUtils.isEmpty(paramString))) {
          continue;
        }
        synchronized (localltb.i)
        {
          if (localltb.h != 0L)
          {
            i = 1;
            if (i == 0) {
              break label166;
            }
            if (Log.isLoggable("TimingBreakdownMetric", 5))
            {
              String str = String.valueOf(paramString);
              if (str.length() == 0) {
                break label153;
              }
              "Metric is already ended. Cannot add split ".concat(str);
            }
          }
        }
      }
      int i = 0;
      continue;
      label153:
      new String("Metric is already ended. Cannot add split ");
      continue;
      label166:
      localltb.e.add(paramString);
      localltb.f.add(Long.valueOf(System.currentTimeMillis()));
      localltb.d.add(Long.valueOf(paramLong2));
    }
  }
  
  public final void a(int paramInt, long paramLong1, long paramLong2, String paramString, long paramLong3)
  {
    ltb localltb;
    for (;;)
    {
      synchronized (this.c)
      {
        Iterator localIterator = a(paramInt).values().iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        localltb = (ltb)localIterator.next();
        if (!localltb.a(1L)) {
          continue;
        }
        synchronized (localltb.i)
        {
          if (localltb.h != 0L)
          {
            i = 1;
            if (i == 0) {
              break label260;
            }
            if (Log.isLoggable("TimingBreakdownMetric", 5))
            {
              String str = String.valueOf(paramString);
              if (str.length() == 0) {
                break label145;
              }
              "Metric is already ended. Cannot add split ".concat(str);
            }
          }
        }
      }
      int i = 0;
      continue;
      label145:
      new String("Metric is already ended. Cannot add split ");
    }
    for (;;)
    {
      int j;
      if ((j < localltb.f.size()) && (((Long)localltb.f.get(j)).longValue() <= paramLong3))
      {
        j++;
      }
      else
      {
        localltb.e.add(j, paramString);
        localltb.f.add(j, Long.valueOf(paramLong3));
        localltb.d.add(j, Long.valueOf(1L));
        break;
        return;
        label260:
        j = 0;
      }
    }
  }
  
  public final void a(int paramInt, String paramString, long paramLong1, long paramLong2)
  {
    synchronized (this.c)
    {
      Map localMap = a(paramInt);
      if ((ltb)localMap.get(paramString) == null) {
        localMap.put(paramString, new ltb(paramString, paramLong1, paramLong2));
      }
      return;
    }
  }
  
  public final void a(int paramInt, String... paramVarArgs)
  {
    if ((paramVarArgs == null) || (paramVarArgs.length == 0)) {
      throw new IllegalArgumentException("Must provide at least one metric name for recording.");
    }
    synchronized (this.c)
    {
      Map localMap = a(paramInt);
      int i = paramVarArgs.length;
      for (int j = 0; j < i; j++) {
        a(paramInt, (ltb)localMap.get(paramVarArgs[j]));
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ltq
 * JD-Core Version:    0.7.0.1
 */