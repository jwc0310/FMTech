import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public final class kvj
  extends gxq
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  public transient rko b = new rko();
  
  public kvj(gxt paramgxt, String... paramVarArgs)
  {
    super(paramgxt);
    this.b.a = paramVarArgs;
  }
  
  private final void readObject(ObjectInputStream paramObjectInputStream)
  {
    paramObjectInputStream.defaultReadObject();
    this.b = new rko();
    rko localrko = this.b;
    byte[] arrayOfByte = (byte[])paramObjectInputStream.readObject();
    qat.b(localrko, arrayOfByte, 0, arrayOfByte.length);
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
      kvj localkvj = (kvj)paramObject;
      return efj.d(this.b.a, localkvj.b.a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(this.b.a) + 31 * super.hashCode();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kvj
 * JD-Core Version:    0.7.0.1
 */