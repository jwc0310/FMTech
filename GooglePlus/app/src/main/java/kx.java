import java.util.Map;

public class kx<F, S>
{
  public final F a;
  public final S b;
  
  public kx(int paramInt1, int paramInt2)
  {
    this(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2));
  }
  
  public kx(F paramF, S paramS)
  {
    this.a = paramF;
    this.b = paramS;
  }
  
  public kx(String paramString, Boolean paramBoolean)
  {
    this(paramString, paramBoolean);
  }
  
  public kx(String paramString1, String paramString2)
  {
    this(paramString1, paramString2);
  }
  
  public kx(qzz paramqzz, Map<String, qzz> paramMap)
  {
    this(paramqzz, paramMap);
  }
  
  private static boolean a(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
  
  public String a()
  {
    return (String)this.a;
  }
  
  public Boolean b()
  {
    return (Boolean)this.b;
  }
  
  public String c()
  {
    return (String)this.a;
  }
  
  public String d()
  {
    return (String)this.b;
  }
  
  public qzz e()
  {
    return (qzz)this.a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof kx)) {}
    kx localkx;
    do
    {
      return false;
      localkx = (kx)paramObject;
    } while ((!a(localkx.a, this.a)) || (!a(localkx.b, this.b)));
    return true;
  }
  
  public int f()
  {
    return ((Integer)this.a).intValue();
  }
  
  public int g()
  {
    return ((Integer)this.b).intValue();
  }
  
  public int hashCode()
  {
    int i;
    int j;
    if (this.a == null)
    {
      i = 0;
      Object localObject = this.b;
      j = 0;
      if (localObject != null) {
        break label35;
      }
    }
    for (;;)
    {
      return i ^ j;
      i = this.a.hashCode();
      break;
      label35:
      j = this.b.hashCode();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kx
 * JD-Core Version:    0.7.0.1
 */