import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class mgh
{
  int a;
  public volatile boolean b;
  boolean c;
  private final Context d;
  private int e;
  private final HashMap<String, mgd> f;
  private final HashMap<String, mge> g;
  private List<String> h;
  
  /* Error */
  mgh(Context paramContext)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: invokespecial 25	java/lang/Object:<init>	()V
    //   6: aload_0
    //   7: new 27	java/util/HashMap
    //   10: dup
    //   11: invokespecial 28	java/util/HashMap:<init>	()V
    //   14: putfield 30	mgh:f	Ljava/util/HashMap;
    //   17: aload_0
    //   18: new 27	java/util/HashMap
    //   21: dup
    //   22: invokespecial 28	java/util/HashMap:<init>	()V
    //   25: putfield 32	mgh:g	Ljava/util/HashMap;
    //   28: aload_0
    //   29: new 34	java/util/ArrayList
    //   32: dup
    //   33: invokespecial 35	java/util/ArrayList:<init>	()V
    //   36: putfield 37	mgh:h	Ljava/util/List;
    //   39: aload_0
    //   40: aload_1
    //   41: invokevirtual 43	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   44: putfield 45	mgh:d	Landroid/content/Context;
    //   47: aload_0
    //   48: aload_1
    //   49: invokevirtual 49	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   52: invokevirtual 55	android/content/res/Resources:getConfiguration	()Landroid/content/res/Configuration;
    //   55: getfield 60	android/content/res/Configuration:orientation	I
    //   58: putfield 62	mgh:e	I
    //   61: aload_1
    //   62: ldc 64
    //   64: invokestatic 69	mbb:c	(Landroid/content/Context;Ljava/lang/Class;)Ljava/util/List;
    //   67: astore_3
    //   68: aload_0
    //   69: getfield 30	mgh:f	Ljava/util/HashMap;
    //   72: astore 4
    //   74: aload 4
    //   76: monitorenter
    //   77: iconst_0
    //   78: istore 5
    //   80: iload 5
    //   82: aload_3
    //   83: invokeinterface 75 1 0
    //   88: if_icmpge +39 -> 127
    //   91: aload_3
    //   92: iload 5
    //   94: invokeinterface 79 2 0
    //   99: checkcast 64	mgd
    //   102: astore 12
    //   104: aload_0
    //   105: getfield 30	mgh:f	Ljava/util/HashMap;
    //   108: aload 12
    //   110: invokeinterface 82 1 0
    //   115: aload 12
    //   117: invokevirtual 86	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   120: pop
    //   121: iinc 5 1
    //   124: goto -44 -> 80
    //   127: aload 4
    //   129: monitorexit
    //   130: aload_1
    //   131: ldc 88
    //   133: invokestatic 69	mbb:c	(Landroid/content/Context;Ljava/lang/Class;)Ljava/util/List;
    //   136: astore 7
    //   138: aload_0
    //   139: getfield 32	mgh:g	Ljava/util/HashMap;
    //   142: astore 8
    //   144: aload 8
    //   146: monitorenter
    //   147: iload_2
    //   148: aload 7
    //   150: invokeinterface 75 1 0
    //   155: if_icmpge +47 -> 202
    //   158: aload 7
    //   160: iload_2
    //   161: invokeinterface 79 2 0
    //   166: checkcast 88	mge
    //   169: astore 10
    //   171: aload_0
    //   172: getfield 32	mgh:g	Ljava/util/HashMap;
    //   175: aload 10
    //   177: invokeinterface 89 1 0
    //   182: aload 10
    //   184: invokevirtual 86	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   187: pop
    //   188: iinc 2 1
    //   191: goto -44 -> 147
    //   194: astore 6
    //   196: aload 4
    //   198: monitorexit
    //   199: aload 6
    //   201: athrow
    //   202: aload 8
    //   204: monitorexit
    //   205: return
    //   206: astore 9
    //   208: aload 8
    //   210: monitorexit
    //   211: aload 9
    //   213: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	214	0	this	mgh
    //   0	214	1	paramContext	Context
    //   1	188	2	i	int
    //   67	25	3	localList1	List
    //   72	125	4	localHashMap1	HashMap
    //   78	44	5	j	int
    //   194	6	6	localObject1	Object
    //   136	23	7	localList2	List
    //   206	6	9	localObject2	Object
    //   169	14	10	localmge	mge
    //   102	14	12	localmgd	mgd
    // Exception table:
    //   from	to	target	type
    //   80	121	194	finally
    //   127	130	194	finally
    //   196	199	194	finally
    //   147	188	206	finally
    //   202	205	206	finally
    //   208	211	206	finally
  }
  
  private final void c(Context paramContext)
  {
    synchronized (this.g)
    {
      Iterator localIterator = this.g.values().iterator();
      if (localIterator.hasNext()) {
        ((mge)localIterator.next()).b(paramContext);
      }
    }
  }
  
  private final void d(Context paramContext)
  {
    synchronized (this.f)
    {
      Iterator localIterator = this.f.values().iterator();
      if (localIterator.hasNext()) {
        ((mgd)localIterator.next()).a(paramContext);
      }
    }
  }
  
  final void a(Context paramContext)
  {
    a("invisible");
    this.c = a();
    if (!this.c)
    {
      this.a = (-1 + this.a);
      Locale localLocale = Locale.US;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(this.a);
      b(String.format(localLocale, "count=%d", arrayOfObject));
      b(paramContext);
    }
    b();
  }
  
  final void a(String paramString)
  {
    if (Log.isLoggable("AppVisibilityMonitor", 3))
    {
      this.h.clear();
      b(paramString);
    }
  }
  
  final boolean a()
  {
    int i = this.d.getResources().getConfiguration().orientation;
    int j = this.e;
    boolean bool = false;
    if (j != i)
    {
      b("rotation");
      bool = true;
      this.e = i;
    }
    return bool;
  }
  
  final void b()
  {
    if (Log.isLoggable("AppVisibilityMonitor", 3))
    {
      StringBuilder localStringBuilder = new StringBuilder((String)this.h.get(0));
      for (int i = 1; i < this.h.size(); i++)
      {
        String str = (String)this.h.get(i);
        localStringBuilder.append(" -> ");
        localStringBuilder.append(str);
      }
    }
  }
  
  final void b(Context paramContext)
  {
    boolean bool;
    String str;
    if (this.a > 0)
    {
      bool = true;
      if (bool != this.b)
      {
        if (!bool) {
          break label49;
        }
        str = "foreground";
        label24:
        b(str);
        if (!bool) {
          break label55;
        }
        c(paramContext);
      }
    }
    for (;;)
    {
      this.b = bool;
      return;
      bool = false;
      break;
      label49:
      str = "background";
      break label24;
      label55:
      d(paramContext);
    }
  }
  
  final void b(String paramString)
  {
    if (Log.isLoggable("AppVisibilityMonitor", 3)) {
      this.h.add(paramString);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mgh
 * JD-Core Version:    0.7.0.1
 */