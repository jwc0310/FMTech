import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

public final class lns
  extends mab
{
  public String[] a;
  public int[] b;
  
  public lns()
  {
    this.a = new String[0];
    this.b = new int[0];
  }
  
  public lns(oac paramoac)
  {
    int i = paramoac.b.length;
    this.a = new String[i];
    this.b = new int[i];
    oab[] arrayOfoab = paramoac.b;
    int j = arrayOfoab.length;
    int k = 0;
    int m = 0;
    if (k < j)
    {
      oab localoab = arrayOfoab[k];
      this.a[m] = localoab.a;
      int n;
      if (localoab.b == 1)
      {
        int[] arrayOfInt3 = this.b;
        n = m + 1;
        arrayOfInt3[m] = 0;
      }
      for (;;)
      {
        k++;
        m = n;
        break;
        if (localoab.b == 3)
        {
          int[] arrayOfInt2 = this.b;
          n = m + 1;
          arrayOfInt2[m] = 2;
        }
        else
        {
          int[] arrayOfInt1 = this.b;
          n = m + 1;
          arrayOfInt1[m] = 1;
        }
      }
    }
  }
  
  public static byte[] a(lns paramlns)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(256);
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    try
    {
      int i = paramlns.a.length;
      localDataOutputStream.writeInt(i);
      for (int j = 0; j < i; j++)
      {
        a(localDataOutputStream, paramlns.a[j]);
        localDataOutputStream.writeInt(paramlns.b[j]);
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
 * Qualified Name:     lns
 * JD-Core Version:    0.7.0.1
 */