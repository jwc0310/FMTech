import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class mbb
{
  static final mbg a = new mbg(false, new mbh());
  private static mcq d = new mcq("debug.binder.verification");
  private static final Object e = new Object();
  public mbb b;
  public String c;
  private Context f;
  private final Map<Object, Object> g = new HashMap();
  private final Map<Object, List<?>> h = new HashMap();
  private final HashSet<Class<?>> i = new HashSet();
  private final ArrayList<mbk> j = new ArrayList();
  private boolean k;
  
  public mbb() {}
  
  public mbb(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public mbb(Context paramContext, mbb parammbb)
  {
    this.f = paramContext;
    this.b = parammbb;
    this.c = paramContext.getClass().getName();
  }
  
  public static int a(Context paramContext, String paramString, int paramInt)
  {
    return ((Integer)b(paramContext).a(paramString, Integer.valueOf(300))).intValue();
  }
  
  public static <T> T a(Context paramContext, Class<T> paramClass)
  {
    return b(paramContext).a(paramClass);
  }
  
  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    return (String)b(paramContext).a(paramString1, null);
  }
  
  public static mbb a(Context paramContext, bk parambk)
  {
    while (parambk != null)
    {
      mbb localmbb = a(parambk);
      if (localmbb != null) {
        return localmbb;
      }
      parambk = parambk.A;
    }
    return b(paramContext);
  }
  
  private static mbb a(Object paramObject)
  {
    mbb localmbb;
    if ((paramObject instanceof mbe))
    {
      localmbb = ((mbe)paramObject).aE_();
      if (localmbb == null)
      {
        String str = String.valueOf(paramObject);
        throw new IllegalStateException(43 + String.valueOf(str).length() + "BinderContext must not return null Binder: " + str);
      }
    }
    else
    {
      localmbb = null;
    }
    return localmbb;
  }
  
  public static boolean a(Context paramContext, String paramString, boolean paramBoolean)
  {
    return ((Boolean)b(paramContext).a(paramString, Boolean.valueOf(true))).booleanValue();
  }
  
  public static <T> T b(Context paramContext, Class<T> paramClass)
  {
    return b(paramContext).b(paramClass);
  }
  
  public static mbb b(Context paramContext)
  {
    Context localContext1 = paramContext.getApplicationContext();
    int m = 0;
    Context localContext2 = paramContext;
    for (;;)
    {
      mbb localmbb = a(localContext2);
      if (localmbb != null) {
        return localmbb;
      }
      if (localContext2 == localContext1) {}
      for (int n = 1;; n = 0)
      {
        m |= n;
        if (!(localContext2 instanceof ContextWrapper)) {
          break;
        }
        localContext2 = ((ContextWrapper)localContext2).getBaseContext();
        if (localContext2 != null) {
          break label77;
        }
        throw new IllegalStateException("Invalid ContextWrapper -- If this is a Robolectric test, have you called ActivityController.create()?");
      }
      if (m == 0) {}
      for (localContext2 = localContext1; localContext2 == null; localContext2 = null) {
        label77:
        return a.a(localContext1.getApplicationContext());
      }
    }
  }
  
  private final void b()
  {
    if (this.k) {
      throw new mbd("This binder is sealed for modification");
    }
  }
  
  public static <T> List<T> c(Context paramContext, Class<T> paramClass)
  {
    return b(paramContext).c(paramClass);
  }
  
  public static <T> List<T> d(Context paramContext, Class<T> paramClass)
  {
    return b(paramContext).d(paramClass);
  }
  
  private final String e(Class paramClass)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unbound type: ").append(paramClass.getName()).append("\nSearched binders:\n");
    for (;;)
    {
      localStringBuilder.append(this.c);
      this = this.b;
      if (this == null) {
        break;
      }
      localStringBuilder.append(" ->\n");
    }
    return localStringBuilder.toString();
  }
  
  private final <T> T f(Class<T> paramClass)
  {
    int m = 0;
    if (paramClass == null) {
      try
      {
        throw new NullPointerException();
      }
      finally {}
    }
    if (this.f == null) {
      throw new IllegalStateException("Binder not initialized yet.");
    }
    Object localObject1 = this.g.get(paramClass);
    if (localObject1 != null)
    {
      Object localObject2 = e;
      if (localObject1 != localObject2) {}
      for (;;)
      {
        return localObject1;
        localObject1 = null;
      }
    }
    boolean bool = this.k;
    this.k = false;
    for (;;)
    {
      try
      {
        int n = this.j.size();
        if (m < n)
        {
          ((mbk)this.j.get(m)).a(this.f, paramClass, this);
          Object localObject5 = this.g.get(paramClass);
          localObject1 = localObject5;
          if (localObject1 == null) {
            break label200;
          }
          this.k = bool;
          break;
        }
        this.k = bool;
        localObject1 = this.g.get(paramClass);
        if (localObject1 != null) {
          break;
        }
        this.g.put(paramClass, e);
        break;
      }
      finally
      {
        this.k = bool;
      }
      label200:
      m++;
    }
  }
  
  private final <T> List<T> g(Class<T> paramClass)
  {
    int m = 0;
    if (paramClass == null) {
      try
      {
        throw new NullPointerException();
      }
      finally {}
    }
    if (this.f == null) {
      throw new IllegalStateException("Binder not initialized yet.");
    }
    List localList = (List)this.h.get(paramClass);
    ArrayList localArrayList;
    if (localList == null)
    {
      localArrayList = new ArrayList();
      this.h.put(paramClass, localArrayList);
    }
    for (Object localObject1 = localArrayList;; localObject1 = localList)
    {
      boolean bool;
      if (!this.i.contains(paramClass))
      {
        this.i.add(paramClass);
        bool = this.k;
        this.k = false;
      }
      try
      {
        int n = this.j.size();
        while (m < n)
        {
          ((mbk)this.j.get(m)).a(this.f, paramClass, this);
          m++;
        }
        this.k = bool;
        return localObject1;
      }
      finally
      {
        this.k = bool;
      }
    }
  }
  
  public final <T> T a(Class<T> paramClass)
  {
    if (paramClass == null) {
      throw new NullPointerException();
    }
    Object localObject = b(paramClass);
    if (localObject != null) {
      return localObject;
    }
    String str = e(paramClass);
    IllegalStateException localIllegalStateException = new IllegalStateException(str);
    Log.e("Binder", str, localIllegalStateException);
    throw localIllegalStateException;
  }
  
  public final Object a(String paramString, Object paramObject)
  {
    if (this.f == null) {
      throw new IllegalStateException("Binder not initialized yet.");
    }
    for (;;)
    {
      try
      {
        Object localObject2 = this.g.get(paramString);
        if ((localObject2 != null) && (localObject2 != e)) {
          return localObject2;
        }
        if (localObject2 == null) {
          this.g.put(paramString, e);
        }
        this = this.b;
        if (this != null) {
          continue;
        }
        return paramObject;
      }
      finally {}
    }
  }
  
  public final <T> mbb a(Class<T> paramClass, T... paramVarArgs)
  {
    for (int m = 0; m < paramVarArgs.length; m++) {
      b(paramClass, paramVarArgs[m]);
    }
    return this;
  }
  
  public final mbb a(mbk parammbk)
  {
    try
    {
      b();
      this.j.add(parammbk);
      return this;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a()
  {
    try
    {
      this.k = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a(Context paramContext)
  {
    this.f = paramContext;
    if (this.c == null) {
      this.c = paramContext.getClass().getName();
    }
  }
  
  public final void a(Object paramObject1, Object paramObject2)
  {
    Object localObject2;
    try
    {
      b();
      localObject2 = this.g.get(paramObject1);
      if (localObject2 == null) {
        break label155;
      }
      if (localObject2 == e)
      {
        String str3 = String.valueOf(paramObject1);
        throw new mbd(51 + String.valueOf(str3).length() + "Bind call too late - someone already tried to get: " + str3);
      }
    }
    finally {}
    String str1 = String.valueOf(paramObject1);
    String str2 = String.valueOf(localObject2);
    throw new mbc(21 + String.valueOf(str1).length() + String.valueOf(str2).length() + "Duplicate binding: " + str1 + ", " + str2);
    label155:
    this.g.put(paramObject1, paramObject2);
  }
  
  public final <T> T b(Class<T> paramClass)
  {
    if (paramClass == null) {
      throw new NullPointerException();
    }
    do
    {
      Object localObject = f(paramClass);
      if (localObject != null) {
        return localObject;
      }
      this = this.b;
    } while (this != null);
    return null;
  }
  
  public final void b(Object paramObject1, Object paramObject2)
  {
    try
    {
      b();
      Object localObject2 = (List)this.h.get(paramObject1);
      if (localObject2 == null)
      {
        localObject2 = new ArrayList();
        this.h.put(paramObject1, localObject2);
      }
      ((List)localObject2).add(paramObject2);
      return;
    }
    finally {}
  }
  
  public final <T> List<T> c(Class<T> paramClass)
  {
    if (paramClass == null) {
      throw new NullPointerException();
    }
    ArrayList localArrayList = new ArrayList();
    do
    {
      localArrayList.addAll(g(paramClass));
      this = this.b;
    } while (this != null);
    return localArrayList;
  }
  
  public final <T> List<T> d(Class<T> paramClass)
  {
    if (paramClass == null) {
      throw new NullPointerException();
    }
    ArrayList localArrayList = new ArrayList();
    do
    {
      Object localObject = f(paramClass);
      if (localObject != null) {
        localArrayList.add(localObject);
      }
      this = this.b;
    } while (this != null);
    return localArrayList;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mbb
 * JD-Core Version:    0.7.0.1
 */