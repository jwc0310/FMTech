import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class pxz
{
  public static final pxz b = new pxz((byte)0);
  private static volatile boolean c = false;
  public final Map<pya, pyl<?, ?>> a;
  
  public pxz()
  {
    this.a = new HashMap();
  }
  
  private pxz(byte paramByte)
  {
    this.a = Collections.emptyMap();
  }
  
  public pxz(pxz parampxz)
  {
    if (parampxz == b)
    {
      this.a = Collections.emptyMap();
      return;
    }
    this.a = Collections.unmodifiableMap(parampxz.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     pxz
 * JD-Core Version:    0.7.0.1
 */