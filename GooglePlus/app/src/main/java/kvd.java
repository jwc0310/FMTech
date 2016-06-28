import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public final class kvd
  extends gxq
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  public transient rla b;
  
  private final void readObject(ObjectInputStream paramObjectInputStream)
  {
    paramObjectInputStream.defaultReadObject();
    this.b = new rla();
    rla localrla = this.b;
    byte[] arrayOfByte = (byte[])paramObjectInputStream.readObject();
    qat.b(localrla, arrayOfByte, 0, arrayOfByte.length);
  }
  
  private final void writeObject(ObjectOutputStream paramObjectOutputStream)
  {
    paramObjectOutputStream.defaultWriteObject();
    paramObjectOutputStream.writeObject(qat.a(this.b));
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = super.equals(paramObject);
    boolean bool2 = false;
    if (bool1)
    {
      kvd localkvd = (kvd)paramObject;
      boolean bool3 = Arrays.equals(this.b.a, localkvd.b.a);
      bool2 = false;
      if (bool3)
      {
        boolean bool4 = efj.c(null, null);
        bool2 = false;
        if (bool4) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(Arrays.hashCode(this.b.a));
    arrayOfObject[1] = null;
    arrayOfObject[2] = Integer.valueOf(super.hashCode());
    return Arrays.hashCode(arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kvd
 * JD-Core Version:    0.7.0.1
 */