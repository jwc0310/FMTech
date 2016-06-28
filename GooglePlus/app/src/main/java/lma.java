import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

public final class lma
  extends mab
{
  public String a;
  public String b;
  public String c;
  public String d;
  public String e;
  public String f;
  
  public lma() {}
  
  public lma(qdr paramqdr)
  {
    qdn localqdn;
    if (paramqdr.d != null)
    {
      localqdn = (qdn)paramqdr.d.b(qdn.a);
      if (localqdn == null) {
        break label72;
      }
    }
    label72:
    for (String str = localqdn.b;; str = null)
    {
      this.b = str;
      this.c = paramqdr.c;
      this.d = paramqdr.b;
      this.e = paramqdr.f;
      this.f = paramqdr.e;
      return;
    }
  }
  
  public lma(qds paramqds)
  {
    qdn localqdn;
    if (paramqds.d != null)
    {
      localqdn = (qdn)paramqds.d.b(qdn.a);
      if (localqdn == null) {
        break label103;
      }
    }
    label103:
    for (String str = localqdn.b;; str = null)
    {
      this.b = str;
      this.a = paramqds.b;
      if (paramqds.c != null)
      {
        qdr localqdr = (qdr)paramqds.c.b(qdr.a);
        this.c = localqdr.c;
        this.d = localqdr.b;
      }
      this.e = paramqds.e;
      this.f = paramqds.f;
      return;
    }
  }
  
  public static byte[] a(lma paramlma)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(256);
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    a(localDataOutputStream, paramlma.a);
    a(localDataOutputStream, paramlma.b);
    a(localDataOutputStream, paramlma.c);
    a(localDataOutputStream, paramlma.d);
    a(localDataOutputStream, paramlma.e);
    a(localDataOutputStream, paramlma.f);
    byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
    localDataOutputStream.close();
    return arrayOfByte;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lma
 * JD-Core Version:    0.7.0.1
 */