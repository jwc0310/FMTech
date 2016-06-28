import android.app.Application;
import android.os.Build.VERSION;

public class gdp
{
  private static gdp a;
  private static volatile boolean d = false;
  private geh b;
  private Application c;
  private gdw e;
  private gdx f;
  
  private gdp(geh paramgeh, Application paramApplication, gdw paramgdw, gdx paramgdx, gdv paramgdv)
  {
    this.b = paramgeh;
    this.c = paramApplication;
    this.e = paramgdw;
    this.f = paramgdx;
  }
  
  public static gdp a(geh paramgeh, Application paramApplication, gdt paramgdt)
  {
    for (;;)
    {
      try
      {
        if (a != null)
        {
          localgdp = a;
          return localgdp;
        }
        if (paramgeh == null) {
          throw new NullPointerException();
        }
      }
      finally {}
      if (paramApplication == null) {
        throw new NullPointerException();
      }
      if (paramgdt == null) {
        throw new NullPointerException();
      }
      Object localObject2 = paramgdt.a;
      if (localObject2 == null) {
        localObject2 = new gdq();
      }
      Object localObject3 = paramgdt.b;
      if (localObject3 == null) {
        localObject3 = new gdr();
      }
      Object localObject4 = paramgdt.c;
      if (localObject4 == null) {
        localObject4 = new gds();
      }
      gdp localgdp = new gdp(paramgeh, paramApplication, (gdw)localObject2, (gdx)localObject3, (gdv)localObject4);
      a = localgdp;
    }
  }
  
  public static gdy a(String paramString)
  {
    for (;;)
    {
      try
      {
        if (!b())
        {
          localgdy = gdy.d;
          return localgdy;
        }
        if (!a.f.a()) {
          break label85;
        }
        if (geb.a(a.b, a.c, a.f).a.a())
        {
          localgdy = new gdy(paramString);
          continue;
        }
        localgdy = gdy.d;
      }
      finally {}
      continue;
      label85:
      gdy localgdy = gdy.d;
    }
  }
  
  /* Error */
  public static void a()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: invokestatic 62	gdp:b	()Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifne +7 -> 15
    //   11: ldc 2
    //   13: monitorexit
    //   14: return
    //   15: getstatic 35	gdp:a	Lgdp;
    //   18: getfield 30	gdp:e	Lgdw;
    //   21: invokevirtual 88	gdw:a	()Z
    //   24: ifeq -13 -> 11
    //   27: getstatic 35	gdp:a	Lgdp;
    //   30: getfield 26	gdp:b	Lgeh;
    //   33: getstatic 35	gdp:a	Lgdp;
    //   36: getfield 28	gdp:c	Landroid/app/Application;
    //   39: getstatic 35	gdp:a	Lgdp;
    //   42: getfield 30	gdp:e	Lgdw;
    //   45: invokestatic 93	gdf:a	(Lgeh;Landroid/app/Application;Lgdh;)Lgdf;
    //   48: getfield 96	gdf:a	Lgda;
    //   51: astore_2
    //   52: aload_2
    //   53: getfield 101	gda:c	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   56: iconst_1
    //   57: invokevirtual 107	java/util/concurrent/atomic/AtomicBoolean:getAndSet	(Z)Z
    //   60: ifne -49 -> 11
    //   63: aload_2
    //   64: getfield 109	gda:a	Landroid/app/Application;
    //   67: new 111	gcu
    //   70: dup
    //   71: aload_2
    //   72: getfield 109	gda:a	Landroid/app/Application;
    //   75: new 113	gcv
    //   78: dup
    //   79: aload_2
    //   80: invokespecial 116	gcv:<init>	(Lgda;)V
    //   83: new 118	gcw
    //   86: dup
    //   87: aload_2
    //   88: invokespecial 119	gcw:<init>	(Lgda;)V
    //   91: invokespecial 122	gcu:<init>	(Landroid/app/Application;Lgcv;Lgcw;)V
    //   94: invokevirtual 128	android/app/Application:registerActivityLifecycleCallbacks	(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    //   97: goto -86 -> 11
    //   100: astore_0
    //   101: ldc 2
    //   103: monitorexit
    //   104: aload_0
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   100	5	0	localObject	Object
    //   6	2	1	bool	boolean
    //   51	37	2	localgda	gda
    // Exception table:
    //   from	to	target	type
    //   3	7	100	finally
    //   15	97	100	finally
  }
  
  /* Error */
  public static void a(gdy paramgdy)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: invokestatic 62	gdp:b	()Z
    //   6: ifeq +19 -> 25
    //   9: aload_0
    //   10: ifnull +15 -> 25
    //   13: aload_0
    //   14: getstatic 67	gdy:d	Lgdy;
    //   17: invokevirtual 133	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   20: istore_2
    //   21: iload_2
    //   22: ifeq +7 -> 29
    //   25: ldc 2
    //   27: monitorexit
    //   28: return
    //   29: getstatic 35	gdp:a	Lgdp;
    //   32: getfield 32	gdp:f	Lgdx;
    //   35: invokevirtual 71	gdx:a	()Z
    //   38: ifeq -13 -> 25
    //   41: getstatic 35	gdp:a	Lgdp;
    //   44: getfield 26	gdp:b	Lgeh;
    //   47: getstatic 35	gdp:a	Lgdp;
    //   50: getfield 28	gdp:c	Landroid/app/Application;
    //   53: getstatic 35	gdp:a	Lgdp;
    //   56: getfield 32	gdp:f	Lgdx;
    //   59: invokestatic 76	geb:a	(Lgeh;Landroid/app/Application;Lgdh;)Lgeb;
    //   62: astore_3
    //   63: aload_0
    //   64: ifnull -39 -> 25
    //   67: aload_0
    //   68: getfield 136	gdy:b	J
    //   71: lconst_0
    //   72: lcmp
    //   73: ifne +10 -> 83
    //   76: aload_0
    //   77: invokestatic 142	android/os/SystemClock:elapsedRealtime	()J
    //   80: putfield 136	gdy:b	J
    //   83: aload_3
    //   84: getfield 79	geb:a	Lgdi;
    //   87: invokevirtual 82	gdi:a	()Z
    //   90: ifeq -65 -> 25
    //   93: aload_3
    //   94: getfield 79	geb:a	Lgdi;
    //   97: aload_0
    //   98: getfield 145	gdy:c	Ljava/lang/String;
    //   101: aload_0
    //   102: invokevirtual 148	gdi:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   105: goto -80 -> 25
    //   108: astore_1
    //   109: ldc 2
    //   111: monitorexit
    //   112: aload_1
    //   113: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	paramgdy	gdy
    //   108	5	1	localObject	Object
    //   20	2	2	bool	boolean
    //   62	32	3	localgeb	geb
    // Exception table:
    //   from	to	target	type
    //   3	9	108	finally
    //   13	21	108	finally
    //   29	63	108	finally
    //   67	83	108	finally
    //   83	105	108	finally
  }
  
  private static boolean b()
  {
    int i;
    if (a != null)
    {
      i = 1;
      if (i == 0) {
        break label42;
      }
      if (Build.VERSION.SDK_INT >= 16) {
        break label37;
      }
    }
    label37:
    for (int j = 0;; j = 1)
    {
      if (j == 0) {
        break label42;
      }
      return true;
      i = 0;
      break;
    }
    label42:
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gdp
 * JD-Core Version:    0.7.0.1
 */