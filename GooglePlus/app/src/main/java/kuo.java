import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public final class kuo
  extends gxq
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  public transient rkb b = new rkb();
  public final Integer c;
  
  public kuo(gxt paramgxt, String paramString)
  {
    this(paramgxt, paramString, null);
  }
  
  public kuo(gxt paramgxt, String paramString, Integer paramInteger)
  {
    super(paramgxt);
    rkb localrkb = this.b;
    rke[] arrayOfrke = new rke[1];
    arrayOfrke[0] = new rke();
    localrkb.a = arrayOfrke;
    this.b.a[0].a = paramString;
    this.c = paramInteger;
  }
  
  private final void readObject(ObjectInputStream paramObjectInputStream)
  {
    paramObjectInputStream.defaultReadObject();
    this.b = new rkb();
    rkb localrkb = this.b;
    byte[] arrayOfByte = (byte[])paramObjectInputStream.readObject();
    qat.b(localrkb, arrayOfByte, 0, arrayOfByte.length);
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
      kuo localkuo = (kuo)paramObject;
      boolean bool3 = efj.c(this.b.a[0].a, localkuo.b.a[0].a);
      bool2 = false;
      if (bool3)
      {
        boolean bool4 = efj.c(this.c, localkuo.c);
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
    int i = efj.a(this.b.a[0].a, super.hashCode());
    if (this.c == null) {
      return i;
    }
    return efj.a(this.c, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kuo
 * JD-Core Version:    0.7.0.1
 */