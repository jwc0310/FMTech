import java.io.Serializable;

public abstract class pye<MessageType extends pye<MessageType, BuilderType>, BuilderType extends pyg<MessageType, BuilderType>>
  extends pxm
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  public pzs h = null;
  public int i = -1;
  
  static <T extends pye<T, ?>> T a(T paramT, pxw parampxw, pxz parampxz)
  {
    try
    {
      pye localpye = (pye)paramT.a(pym.b, parampxw, parampxz);
      return localpye;
    }
    catch (RuntimeException localRuntimeException)
    {
      if ((localRuntimeException.getCause() instanceof pyw)) {
        throw ((pyw)localRuntimeException.getCause());
      }
      throw localRuntimeException;
    }
  }
  
  public static <ContainingType extends pzd, Type> pyl<ContainingType, Type> a(ContainingType paramContainingType, Type paramType, pzd parampzd, pyt<?> parampyt, int paramInt, pzw parampzw, Class paramClass)
  {
    return new pyl(paramContainingType, paramType, parampzd, new pyd(parampyt, paramInt, parampzw, false, false));
  }
  
  private final void b()
  {
    if (this.h == null) {
      this.h = new pzs();
    }
  }
  
  public abstract Object a(int paramInt, Object paramObject1, Object paramObject2);
  
  public final void a(int paramInt1, int paramInt2)
  {
    b();
    pzs localpzs = this.h;
    if (!localpzs.b) {
      throw new UnsupportedOperationException();
    }
    if (paramInt1 == 0) {
      throw new IllegalArgumentException("Zero is not a valid field number.");
    }
    localpzs.a(0x0 | paramInt1 << 3, Long.valueOf(paramInt2));
  }
  
  public final boolean a(int paramInt, pxw parampxw)
  {
    if ((paramInt & 0x7) == 4) {
      return false;
    }
    b();
    return this.h.a(paramInt, parampxw);
  }
  
  public final boolean ao_()
  {
    return a(pym.a, Boolean.TRUE, null) != null;
  }
  
  public final pzh<MessageType> f()
  {
    return (pzh)a(pym.h, null, null);
  }
  
  public final MessageType g()
  {
    return (pye)a(pym.g, null, null);
  }
  
  public final BuilderType h()
  {
    return (pyg)a(pym.f, null, null);
  }
  
  public void i()
  {
    if (this.h == null)
    {
      this.h = pzs.a;
      return;
    }
    this.h.b = false;
  }
  
  public final BuilderType k()
  {
    pyg localpyg = (pyg)a(pym.f, null, null);
    localpyg.a(this);
    return localpyg;
  }
  
  protected Object writeReplace()
  {
    return new pyn(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     pye
 * JD-Core Version:    0.7.0.1
 */