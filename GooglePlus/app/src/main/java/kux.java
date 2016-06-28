import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public final class kux
  extends gxq
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  public transient rkl b;
  
  private final void readObject(ObjectInputStream paramObjectInputStream)
  {
    paramObjectInputStream.defaultReadObject();
    this.b = new rkl();
    rkl localrkl = this.b;
    byte[] arrayOfByte = (byte[])paramObjectInputStream.readObject();
    qat.b(localrkl, arrayOfByte, 0, arrayOfByte.length);
  }
  
  private final void writeObject(ObjectOutputStream paramObjectOutputStream)
  {
    paramObjectOutputStream.defaultWriteObject();
    paramObjectOutputStream.writeObject(qat.a(this.b));
  }
  
  public final boolean equals(Object paramObject)
  {
    if (super.equals(paramObject))
    {
      kux localkux = (kux)paramObject;
      return efj.d(this.b.a, localkux.b.a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(this.b.a) + 31 * super.hashCode();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kux
 * JD-Core Version:    0.7.0.1
 */