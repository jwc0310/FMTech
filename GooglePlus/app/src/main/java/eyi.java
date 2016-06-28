import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class eyi
  implements Cloneable
{
  private eyg<?, ?> a;
  private Object b;
  private List<eyl> c = new ArrayList();
  
  private final byte[] c()
  {
    byte[] arrayOfByte = new byte[a()];
    a(new eyd(arrayOfByte, 0, arrayOfByte.length));
    return arrayOfByte;
  }
  
  final int a()
  {
    int i;
    if (this.b != null) {
      i = this.a.a(this.b);
    }
    for (;;)
    {
      return i;
      Iterator localIterator = this.c.iterator();
      i = 0;
      while (localIterator.hasNext())
      {
        ((eyl)localIterator.next());
        i += 0 + eyd.b(0) + null.length;
      }
    }
  }
  
  final void a(eyd parameyd)
  {
    if (this.b != null) {
      this.a.a(this.b, parameyd);
    }
    for (;;)
    {
      return;
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext())
      {
        ((eyl)localIterator.next());
        parameyd.a(0);
        parameyd.a(null);
      }
    }
  }
  
  public final eyi b()
  {
    int i = 0;
    eyi localeyi = new eyi();
    try
    {
      localeyi.a = this.a;
      if (this.c == null) {
        localeyi.c = null;
      }
      for (;;)
      {
        if (this.b == null) {
          return localeyi;
        }
        if (!(this.b instanceof eyk)) {
          break;
        }
        localeyi.b = ((eyk)this.b).c();
        return localeyi;
        localeyi.c.addAll(this.c);
      }
      if (!(this.b instanceof byte[])) {
        break label116;
      }
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
    localeyi.b = ((byte[])this.b).clone();
    return localeyi;
    label116:
    if ((this.b instanceof byte[][]))
    {
      byte[][] arrayOfByte = (byte[][])this.b;
      byte[][] arrayOfByte1 = new byte[arrayOfByte.length][];
      localeyi.b = arrayOfByte1;
      for (int j = 0; j < arrayOfByte.length; j++) {
        arrayOfByte1[j] = ((byte[])arrayOfByte[j].clone());
      }
    }
    if ((this.b instanceof boolean[]))
    {
      localeyi.b = ((boolean[])this.b).clone();
      return localeyi;
    }
    if ((this.b instanceof int[]))
    {
      localeyi.b = ((int[])this.b).clone();
      return localeyi;
    }
    if ((this.b instanceof long[]))
    {
      localeyi.b = ((long[])this.b).clone();
      return localeyi;
    }
    if ((this.b instanceof float[]))
    {
      localeyi.b = ((float[])this.b).clone();
      return localeyi;
    }
    if ((this.b instanceof double[]))
    {
      localeyi.b = ((double[])this.b).clone();
      return localeyi;
    }
    if ((this.b instanceof eyk[]))
    {
      eyk[] arrayOfeyk1 = (eyk[])this.b;
      eyk[] arrayOfeyk2 = new eyk[arrayOfeyk1.length];
      localeyi.b = arrayOfeyk2;
      while (i < arrayOfeyk1.length)
      {
        arrayOfeyk2[i] = arrayOfeyk1[i].c();
        i++;
      }
    }
    return localeyi;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this) {
      bool2 = true;
    }
    eyi localeyi;
    eyg localeyg1;
    eyg localeyg2;
    do
    {
      boolean bool1;
      do
      {
        return bool2;
        bool1 = paramObject instanceof eyi;
        bool2 = false;
      } while (!bool1);
      localeyi = (eyi)paramObject;
      if ((this.b == null) || (localeyi.b == null)) {
        break;
      }
      localeyg1 = this.a;
      localeyg2 = localeyi.a;
      bool2 = false;
    } while (localeyg1 != localeyg2);
    if (!null.isArray()) {
      return this.b.equals(localeyi.b);
    }
    if ((this.b instanceof byte[])) {
      return Arrays.equals((byte[])this.b, (byte[])localeyi.b);
    }
    if ((this.b instanceof int[])) {
      return Arrays.equals((int[])this.b, (int[])localeyi.b);
    }
    if ((this.b instanceof long[])) {
      return Arrays.equals((long[])this.b, (long[])localeyi.b);
    }
    if ((this.b instanceof float[])) {
      return Arrays.equals((float[])this.b, (float[])localeyi.b);
    }
    if ((this.b instanceof double[])) {
      return Arrays.equals((double[])this.b, (double[])localeyi.b);
    }
    if ((this.b instanceof boolean[])) {
      return Arrays.equals((boolean[])this.b, (boolean[])localeyi.b);
    }
    return Arrays.deepEquals((Object[])this.b, (Object[])localeyi.b);
    if ((this.c != null) && (localeyi.c != null)) {
      return this.c.equals(localeyi.c);
    }
    try
    {
      boolean bool3 = Arrays.equals(c(), localeyi.c());
      return bool3;
    }
    catch (IOException localIOException)
    {
      throw new IllegalStateException(localIOException);
    }
  }
  
  public final int hashCode()
  {
    try
    {
      int i = Arrays.hashCode(c());
      return i + 527;
    }
    catch (IOException localIOException)
    {
      throw new IllegalStateException(localIOException);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eyi
 * JD-Core Version:    0.7.0.1
 */