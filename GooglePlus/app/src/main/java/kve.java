import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public final class kve
  extends gxq
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  public transient rlb b = new rlb();
  public final Integer c;
  
  private kve(gxt paramgxt, Integer paramInteger, kvf... paramVarArgs)
  {
    super(paramgxt);
    this.b.a = new rlc[paramVarArgs.length];
    for (int i = 0; i < paramVarArgs.length; i++)
    {
      rlc[] arrayOfrlc = this.b.a;
      kvf localkvf = paramVarArgs[i];
      rlc localrlc = new rlc();
      localrlc.a = Integer.valueOf(localkvf.a);
      if (localkvf.b != null) {
        localrlc.b = localkvf.b;
      }
      if (localkvf.c != null) {
        localrlc.c = localkvf.c;
      }
      arrayOfrlc[i] = localrlc;
    }
    this.c = null;
  }
  
  public kve(gxt paramgxt, kvf... paramVarArgs)
  {
    this(paramgxt, null, paramVarArgs);
  }
  
  private final void readObject(ObjectInputStream paramObjectInputStream)
  {
    paramObjectInputStream.defaultReadObject();
    this.b = new rlb();
    rlb localrlb = this.b;
    byte[] arrayOfByte = (byte[])paramObjectInputStream.readObject();
    qat.b(localrlb, arrayOfByte, 0, arrayOfByte.length);
  }
  
  private final void writeObject(ObjectOutputStream paramObjectOutputStream)
  {
    paramObjectOutputStream.defaultWriteObject();
    paramObjectOutputStream.writeObject(qat.a(this.b));
  }
  
  public final boolean equals(Object paramObject)
  {
    kve localkve;
    if (super.equals(paramObject))
    {
      localkve = (kve)paramObject;
      if ((!efj.c(this.c, localkve.c)) || (this.b.a.length != localkve.b.a.length)) {}
    }
    for (int i = 0; i < this.b.a.length; i++)
    {
      rlc localrlc1 = this.b.a[i];
      rlc localrlc2 = localkve.b.a[i];
      if ((!efj.c(localrlc1.a, localrlc2.a)) || (!efj.c(localrlc1.b, localrlc2.b)) || (!efj.c(localrlc1.c, localrlc2.c))) {
        return false;
      }
    }
    return true;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject1 = new Object[3];
    rlc[] arrayOfrlc = this.b.a;
    int[] arrayOfInt = new int[arrayOfrlc.length];
    for (int i = 0; i < arrayOfrlc.length; i++)
    {
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = arrayOfrlc[i].b;
      arrayOfObject2[1] = arrayOfrlc[i].a;
      arrayOfObject2[2] = arrayOfrlc[i].c;
      arrayOfInt[i] = Arrays.hashCode(arrayOfObject2);
    }
    arrayOfObject1[0] = Integer.valueOf(Arrays.hashCode(arrayOfInt));
    arrayOfObject1[1] = this.c;
    arrayOfObject1[2] = Integer.valueOf(super.hashCode());
    return Arrays.hashCode(arrayOfObject1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kve
 * JD-Core Version:    0.7.0.1
 */