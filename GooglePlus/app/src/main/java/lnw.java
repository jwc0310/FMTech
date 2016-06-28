import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;

public final class lnw
  extends mab
{
  public int a;
  public String b;
  public String c;
  public String d;
  public int e;
  public boolean f;
  public ArrayList<lnx> g;
  
  public lnw() {}
  
  public lnw(rdp paramrdp)
  {
    this.a = paramrdp.b.a;
    this.b = paramrdp.b.b;
    this.c = paramrdp.b.c;
    this.e = 0;
    this.f = false;
    this.d = paramrdp.b.d;
    this.g = new ArrayList(paramrdp.b.e.length);
    while (i < paramrdp.b.e.length)
    {
      this.g.add(new lnx(paramrdp.b.e[i].a, paramrdp.b.e[i].b, paramrdp.b.e[i].c, paramrdp.b.e[i].d));
      i++;
    }
  }
  
  public static byte[] a(lnw paramlnw)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(256);
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    try
    {
      localDataOutputStream.writeInt(paramlnw.a);
      a(localDataOutputStream, paramlnw.b);
      a(localDataOutputStream, paramlnw.c);
      a(localDataOutputStream, paramlnw.d);
      localDataOutputStream.writeInt(paramlnw.e);
      localDataOutputStream.writeBoolean(paramlnw.f);
      int i = paramlnw.g.size();
      localDataOutputStream.writeInt(i);
      for (int j = 0; j < i; j++)
      {
        lnx locallnx = (lnx)paramlnw.g.get(j);
        localDataOutputStream.writeInt(locallnx.a);
        lnx.a(localDataOutputStream, locallnx.b);
        localDataOutputStream.writeInt(locallnx.c);
        localDataOutputStream.writeInt(locallnx.d);
      }
      byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
      return arrayOfByte;
    }
    finally
    {
      localDataOutputStream.close();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lnw
 * JD-Core Version:    0.7.0.1
 */