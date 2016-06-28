import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public final class kup
  extends gxq
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  public transient rkp b = new rkp();
  
  public kup(gxt paramgxt, int paramInt)
  {
    super(paramgxt);
    this.b.a = paramInt;
  }
  
  private final void readObject(ObjectInputStream paramObjectInputStream)
  {
    paramObjectInputStream.defaultReadObject();
    this.b = new rkp();
    rkp localrkp = this.b;
    byte[] arrayOfByte = (byte[])paramObjectInputStream.readObject();
    qat.b(localrkp, arrayOfByte, 0, arrayOfByte.length);
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
      int i = ((kup)paramObject).b.a;
      int j = this.b.a;
      bool2 = false;
      if (i == j) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public final int hashCode()
  {
    return this.b.a + 31 * super.hashCode();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kup
 * JD-Core Version:    0.7.0.1
 */