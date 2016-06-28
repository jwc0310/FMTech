import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;

@Deprecated
public final class rfq
  extends Number
  implements Comparable<rfq>
{
  private static final long serialVersionUID = -4756200506571685661L;
  @Deprecated
  public final double a;
  @Deprecated
  public final int b;
  @Deprecated
  public final int c;
  @Deprecated
  public final long d;
  @Deprecated
  public final long e;
  @Deprecated
  public final long f;
  @Deprecated
  private boolean g;
  
  @Deprecated
  public rfq(double paramDouble)
  {
    this(paramDouble, a(paramDouble));
  }
  
  @Deprecated
  private rfq(double paramDouble, int paramInt) {}
  
  @Deprecated
  private rfq(double paramDouble, int paramInt, long paramLong)
  {
    boolean bool;
    double d1;
    label30:
    long l;
    if (paramDouble < 0.0D)
    {
      bool = true;
      this.g = bool;
      if (!this.g) {
        break label99;
      }
      d1 = -paramDouble;
      this.a = d1;
      this.b = paramInt;
      this.d = paramLong;
      if (paramDouble <= 1.0E+018D) {
        break label105;
      }
      l = 1000000000000000000L;
      label60:
      this.f = l;
      if (paramLong != 0L) {
        break label112;
      }
      this.e = 0L;
    }
    label99:
    label105:
    label112:
    int i;
    for (this.c = 0;; this.c = i)
    {
      Math.pow(10.0D, paramInt);
      return;
      bool = false;
      break;
      d1 = paramDouble;
      break label30;
      l = paramDouble;
      break label60;
      for (i = paramInt; paramLong % 10L == 0L; i--) {
        paramLong /= 10L;
      }
      this.e = paramLong;
    }
  }
  
  @Deprecated
  public rfq(String paramString) {}
  
  @Deprecated
  private static int a(double paramDouble)
  {
    int i;
    if ((Double.isInfinite(paramDouble)) || (Double.isNaN(paramDouble))) {
      i = 0;
    }
    for (;;)
    {
      return i;
      if (paramDouble < 0.0D) {
        paramDouble = -paramDouble;
      }
      if (paramDouble < 1000000000.0D)
      {
        long l = (1000000.0D * paramDouble) % 1000000L;
        int i3 = 10;
        for (i = 6;; i--)
        {
          if (i <= 0) {
            break label82;
          }
          if (l % i3 != 0L) {
            break;
          }
          i3 *= 10;
        }
        label82:
        return 0;
      }
      Locale localLocale = Locale.ENGLISH;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Double.valueOf(paramDouble);
      String str = String.format(localLocale, "%1.15e", arrayOfObject);
      int j = str.lastIndexOf('e');
      int k = j + 1;
      if (str.charAt(k) == '+') {
        k++;
      }
      int m = Integer.parseInt(str.substring(k));
      int n = j - 2 - m;
      if (n < 0) {
        return 0;
      }
      int i1 = j - 1;
      int i2;
      for (i = n; (i > 0) && (str.charAt(i1) == '0'); i = i2)
      {
        i2 = i - 1;
        i1--;
      }
    }
  }
  
  private final void readObject(ObjectInputStream paramObjectInputStream)
  {
    throw new NotSerializableException();
  }
  
  private final void writeObject(ObjectOutputStream paramObjectOutputStream)
  {
    throw new NotSerializableException();
  }
  
  @Deprecated
  public final double doubleValue()
  {
    if (this.g) {
      return -this.a;
    }
    return this.a;
  }
  
  @Deprecated
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    rfq localrfq;
    do
    {
      do
      {
        return false;
        if (paramObject == this) {
          return true;
        }
      } while (!(paramObject instanceof rfq));
      localrfq = (rfq)paramObject;
    } while ((this.a != localrfq.a) || (this.b != localrfq.b) || (this.d != localrfq.d));
    return true;
  }
  
  @Deprecated
  public final float floatValue()
  {
    return (float)this.a;
  }
  
  @Deprecated
  public final int hashCode()
  {
    return (int)(this.d + 37 * (this.b + (int)(37.0D * this.a)));
  }
  
  @Deprecated
  public final int intValue()
  {
    return (int)this.f;
  }
  
  @Deprecated
  public final long longValue()
  {
    return this.f;
  }
  
  @Deprecated
  public final String toString()
  {
    int i = this.b;
    String str = 14 + "%." + i + "f";
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Double.valueOf(this.a);
    return String.format(str, arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     rfq
 * JD-Core Version:    0.7.0.1
 */