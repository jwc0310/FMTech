import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import java.util.LinkedHashMap;
import java.util.Map;

public class kq<K, V>
{
  private final LinkedHashMap<K, V> a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  
  public kq(int paramInt)
  {
    if (paramInt <= 0) {
      throw new IllegalArgumentException("maxSize <= 0");
    }
    this.c = paramInt;
    this.a = new LinkedHashMap(0, 0.75F, true);
  }
  
  public kq(int paramInt, byte paramByte)
  {
    this(6);
  }
  
  public static int b(int paramInt, PorterDuff.Mode paramMode)
  {
    return 31 * (paramInt + 31) + paramMode.hashCode();
  }
  
  private final int c(K paramK, V paramV)
  {
    int i = b(paramK, paramV);
    if (i < 0) {
      throw new IllegalStateException("Negative size: " + paramK + "=" + paramV);
    }
    return i;
  }
  
  public final int a()
  {
    try
    {
      int i = this.b;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public PorterDuffColorFilter a(int paramInt, PorterDuff.Mode paramMode)
  {
    return (PorterDuffColorFilter)a(Integer.valueOf(b(paramInt, paramMode)));
  }
  
  public PorterDuffColorFilter a(int paramInt, PorterDuff.Mode paramMode, PorterDuffColorFilter paramPorterDuffColorFilter)
  {
    return (PorterDuffColorFilter)a(Integer.valueOf(b(paramInt, paramMode)), paramPorterDuffColorFilter);
  }
  
  public final V a(K paramK)
  {
    if (paramK == null) {
      throw new NullPointerException("key == null");
    }
    Object localObject3;
    try
    {
      Object localObject2 = this.a.get(paramK);
      if (localObject2 != null)
      {
        this.g = (1 + this.g);
        return localObject2;
      }
      this.h = (1 + this.h);
      localObject3 = c(paramK);
      if (localObject3 == null) {
        return null;
      }
    }
    finally {}
    try
    {
      this.e = (1 + this.e);
      Object localObject5 = this.a.put(paramK, localObject3);
      if (localObject5 != null) {
        this.a.put(paramK, localObject5);
      }
      for (;;)
      {
        if (localObject5 == null) {
          break;
        }
        a(false, paramK, localObject3, localObject5);
        return localObject5;
        this.b += c(paramK, localObject3);
      }
      a(this.c);
    }
    finally {}
    return localObject3;
  }
  
  public final V a(K paramK, V paramV)
  {
    if ((paramK == null) || (paramV == null)) {
      throw new NullPointerException("key == null || value == null");
    }
    try
    {
      this.d = (1 + this.d);
      this.b += c(paramK, paramV);
      Object localObject2 = this.a.put(paramK, paramV);
      if (localObject2 != null) {
        this.b -= c(paramK, localObject2);
      }
      if (localObject2 != null) {
        a(false, paramK, localObject2, paramV);
      }
      a(this.c);
      return localObject2;
    }
    finally {}
  }
  
  /* Error */
  public final void a(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 74	kq:b	I
    //   6: iflt +20 -> 26
    //   9: aload_0
    //   10: getfield 38	kq:a	Ljava/util/LinkedHashMap;
    //   13: invokevirtual 126	java/util/LinkedHashMap:isEmpty	()Z
    //   16: ifeq +48 -> 64
    //   19: aload_0
    //   20: getfield 74	kq:b	I
    //   23: ifeq +41 -> 64
    //   26: new 53	java/lang/IllegalStateException
    //   29: dup
    //   30: new 55	java/lang/StringBuilder
    //   33: dup
    //   34: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   37: aload_0
    //   38: invokevirtual 131	java/lang/Object:getClass	()Ljava/lang/Class;
    //   41: invokevirtual 136	java/lang/Class:getName	()Ljava/lang/String;
    //   44: invokevirtual 67	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: ldc 138
    //   49: invokevirtual 67	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: invokespecial 72	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   58: athrow
    //   59: astore_2
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_2
    //   63: athrow
    //   64: aload_0
    //   65: getfield 74	kq:b	I
    //   68: iload_1
    //   69: if_icmple +13 -> 82
    //   72: aload_0
    //   73: getfield 38	kq:a	Ljava/util/LinkedHashMap;
    //   76: invokevirtual 126	java/util/LinkedHashMap:isEmpty	()Z
    //   79: ifeq +6 -> 85
    //   82: aload_0
    //   83: monitorexit
    //   84: return
    //   85: aload_0
    //   86: getfield 38	kq:a	Ljava/util/LinkedHashMap;
    //   89: invokevirtual 142	java/util/LinkedHashMap:entrySet	()Ljava/util/Set;
    //   92: invokeinterface 148 1 0
    //   97: invokeinterface 154 1 0
    //   102: checkcast 156	java/util/Map$Entry
    //   105: astore_3
    //   106: aload_3
    //   107: invokeinterface 159 1 0
    //   112: astore 4
    //   114: aload_3
    //   115: invokeinterface 162 1 0
    //   120: astore 5
    //   122: aload_0
    //   123: getfield 38	kq:a	Ljava/util/LinkedHashMap;
    //   126: aload 4
    //   128: invokevirtual 165	java/util/LinkedHashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   131: pop
    //   132: aload_0
    //   133: aload_0
    //   134: getfield 74	kq:b	I
    //   137: aload_0
    //   138: aload 4
    //   140: aload 5
    //   142: invokespecial 116	kq:c	(Ljava/lang/Object;Ljava/lang/Object;)I
    //   145: isub
    //   146: putfield 74	kq:b	I
    //   149: aload_0
    //   150: iconst_1
    //   151: aload_0
    //   152: getfield 167	kq:f	I
    //   155: iadd
    //   156: putfield 167	kq:f	I
    //   159: aload_0
    //   160: monitorexit
    //   161: aload_0
    //   162: iconst_1
    //   163: aload 4
    //   165: aload 5
    //   167: aconst_null
    //   168: invokevirtual 114	kq:a	(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   171: goto -171 -> 0
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	174	0	this	kq
    //   0	174	1	paramInt	int
    //   59	4	2	localObject1	Object
    //   105	10	3	localEntry	java.util.Map.Entry
    //   112	52	4	localObject2	Object
    //   120	46	5	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   2	26	59	finally
    //   26	59	59	finally
    //   60	62	59	finally
    //   64	82	59	finally
    //   82	84	59	finally
    //   85	161	59	finally
  }
  
  public void a(boolean paramBoolean, K paramK, V paramV1, V paramV2) {}
  
  public final int b()
  {
    try
    {
      int i = this.g;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public int b(K paramK, V paramV)
  {
    return 1;
  }
  
  public final V b(K paramK)
  {
    if (paramK == null) {
      throw new NullPointerException("key == null");
    }
    try
    {
      Object localObject2 = this.a.remove(paramK);
      if (localObject2 != null) {
        this.b -= c(paramK, localObject2);
      }
      if (localObject2 != null) {
        a(false, paramK, localObject2, null);
      }
      return localObject2;
    }
    finally {}
  }
  
  public final int c()
  {
    try
    {
      int i = this.h;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public V c(K paramK)
  {
    return null;
  }
  
  public final int d()
  {
    try
    {
      int i = this.d;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final int e()
  {
    try
    {
      int i = this.f;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final Map<K, V> f()
  {
    try
    {
      LinkedHashMap localLinkedHashMap = new LinkedHashMap(this.a);
      return localLinkedHashMap;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final String toString()
  {
    try
    {
      int i = this.g + this.h;
      int j = 0;
      if (i != 0) {
        j = 100 * this.g / i;
      }
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = Integer.valueOf(this.c);
      arrayOfObject[1] = Integer.valueOf(this.g);
      arrayOfObject[2] = Integer.valueOf(this.h);
      arrayOfObject[3] = Integer.valueOf(j);
      String str = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", arrayOfObject);
      return str;
    }
    finally {}
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kq
 * JD-Core Version:    0.7.0.1
 */