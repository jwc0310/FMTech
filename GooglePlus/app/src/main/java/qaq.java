import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class qaq
  implements Cloneable
{
  qao<?, ?> a;
  Object b;
  List<qaw> c;
  
  qaq()
  {
    this.c = new ArrayList();
  }
  
  <T> qaq(qao<?, T> paramqao, T paramT)
  {
    this.a = paramqao;
    this.b = paramT;
  }
  
  private final byte[] c()
  {
    byte[] arrayOfByte = new byte[a()];
    a(qal.a(arrayOfByte));
    return arrayOfByte;
  }
  
  final int a()
  {
    int i = 0;
    if (this.b != null)
    {
      qao localqao = this.a;
      Object localObject = this.b;
      if (localqao.c)
      {
        int k = Array.getLength(localObject);
        for (int m = 0; m < k; m++) {
          if (Array.get(localObject, m) != null) {
            i += localqao.a(Array.get(localObject, m));
          }
        }
      }
      i = localqao.a(localObject);
      return i;
    }
    Iterator localIterator = this.c.iterator();
    int j = 0;
    while (localIterator.hasNext())
    {
      qaw localqaw = (qaw)localIterator.next();
      j += 0 + qal.d(localqaw.a) + localqaw.b.length;
    }
    return j;
  }
  
  final void a(qal paramqal)
  {
    if (this.b != null)
    {
      qao localqao = this.a;
      Object localObject1 = this.b;
      if (localqao.c)
      {
        int i = Array.getLength(localObject1);
        for (int j = 0; j < i; j++)
        {
          Object localObject2 = Array.get(localObject1, j);
          if (localObject2 != null) {
            localqao.a(localObject2, paramqal);
          }
        }
      }
      localqao.a(localObject1, paramqal);
    }
    for (;;)
    {
      return;
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext())
      {
        qaw localqaw = (qaw)localIterator.next();
        paramqal.c(localqaw.a);
        paramqal.c(localqaw.b);
      }
    }
  }
  
  public final qaq b()
  {
    qaq localqaq = new qaq();
    try
    {
      localqaq.a = this.a;
      if (this.c == null) {
        localqaq.c = null;
      }
      for (;;)
      {
        if (this.b == null) {
          return localqaq;
        }
        if (!(this.b instanceof qat)) {
          break;
        }
        localqaq.b = ((qat)((qat)this.b).clone());
        return localqaq;
        localqaq.c.addAll(this.c);
      }
      if (!(this.b instanceof byte[])) {
        break label117;
      }
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
    localqaq.b = ((byte[])this.b).clone();
    return localqaq;
    label117:
    if ((this.b instanceof byte[][]))
    {
      byte[][] arrayOfByte = (byte[][])this.b;
      byte[][] arrayOfByte1 = new byte[arrayOfByte.length][];
      localqaq.b = arrayOfByte1;
      for (int j = 0; j < arrayOfByte.length; j++) {
        arrayOfByte1[j] = ((byte[])arrayOfByte[j].clone());
      }
    }
    if ((this.b instanceof boolean[]))
    {
      localqaq.b = ((boolean[])this.b).clone();
      return localqaq;
    }
    if ((this.b instanceof int[]))
    {
      localqaq.b = ((int[])this.b).clone();
      return localqaq;
    }
    if ((this.b instanceof long[]))
    {
      localqaq.b = ((long[])this.b).clone();
      return localqaq;
    }
    if ((this.b instanceof float[]))
    {
      localqaq.b = ((float[])this.b).clone();
      return localqaq;
    }
    if ((this.b instanceof double[]))
    {
      localqaq.b = ((double[])this.b).clone();
      return localqaq;
    }
    if ((this.b instanceof qat[]))
    {
      qat[] arrayOfqat1 = (qat[])this.b;
      qat[] arrayOfqat2 = new qat[arrayOfqat1.length];
      localqaq.b = arrayOfqat2;
      for (int i = 0; i < arrayOfqat1.length; i++) {
        arrayOfqat2[i] = ((qat)arrayOfqat1[i].clone());
      }
    }
    return localqaq;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this) {
      bool2 = true;
    }
    qaq localqaq;
    qao localqao1;
    qao localqao2;
    do
    {
      boolean bool1;
      do
      {
        return bool2;
        bool1 = paramObject instanceof qaq;
        bool2 = false;
      } while (!bool1);
      localqaq = (qaq)paramObject;
      if ((this.b == null) || (localqaq.b == null)) {
        break;
      }
      localqao1 = this.a;
      localqao2 = localqaq.a;
      bool2 = false;
    } while (localqao1 != localqao2);
    if (!this.a.a.isArray()) {
      return this.b.equals(localqaq.b);
    }
    if ((this.b instanceof byte[])) {
      return Arrays.equals((byte[])this.b, (byte[])localqaq.b);
    }
    if ((this.b instanceof int[])) {
      return Arrays.equals((int[])this.b, (int[])localqaq.b);
    }
    if ((this.b instanceof long[])) {
      return Arrays.equals((long[])this.b, (long[])localqaq.b);
    }
    if ((this.b instanceof float[])) {
      return Arrays.equals((float[])this.b, (float[])localqaq.b);
    }
    if ((this.b instanceof double[])) {
      return Arrays.equals((double[])this.b, (double[])localqaq.b);
    }
    if ((this.b instanceof boolean[])) {
      return Arrays.equals((boolean[])this.b, (boolean[])localqaq.b);
    }
    return Arrays.deepEquals((Object[])this.b, (Object[])localqaq.b);
    if ((this.c != null) && (localqaq.c != null)) {
      return this.c.equals(localqaq.c);
    }
    try
    {
      boolean bool3 = Arrays.equals(c(), localqaq.c());
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
 * Qualified Name:     qaq
 * JD-Core Version:    0.7.0.1
 */