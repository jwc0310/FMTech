import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class lnu
  extends mab
{
  public ArrayList<lnt> a;
  
  protected lnu() {}
  
  public lnu(odh paramodh)
  {
    this.a = new ArrayList(paramodh.b.length);
    int i = 0;
    if (i < paramodh.b.length)
    {
      oec localoec = paramodh.b[i];
      odo localodo;
      ArrayList localArrayList;
      String str1;
      String str2;
      String str3;
      String str4;
      int j;
      label116:
      String str5;
      if (a(localoec.a))
      {
        localodo = localoec.a.b;
        localArrayList = this.a;
        str1 = localodo.a;
        str2 = localodo.b.a;
        str3 = localodo.b.b;
        str4 = efj.E(localodo.b.c);
        if (localoec.a.d != null) {
          break label183;
        }
        j = 0;
        str5 = localoec.b;
        if (localodo.b.g == null) {
          break label201;
        }
      }
      label183:
      label201:
      for (boolean bool = true;; bool = false)
      {
        localArrayList.add(new lnt(str1, str2, str3, str4, j, null, str5, false, bool, localodo.d, localoec.a.f));
        i++;
        break;
        j = efj.a(localoec.a.d.a);
        break label116;
      }
    }
  }
  
  public lnu(odj paramodj)
  {
    this.a = new ArrayList(paramodj.b.length);
    int i = 0;
    if (i < paramodj.b.length)
    {
      odi localodi = paramodj.b[i];
      odo localodo;
      ArrayList localArrayList;
      String str1;
      String str2;
      String str3;
      String str4;
      int j;
      label116:
      String str5;
      if (a(localodi.a))
      {
        localodo = localodi.a.b;
        localArrayList = this.a;
        str1 = localodo.a;
        str2 = localodo.b.a;
        str3 = localodo.b.b;
        str4 = efj.E(localodo.b.c);
        if (localodi.a.d != null) {
          break label203;
        }
        j = 0;
        if ((localodi.b == null) || (localodi.b.length <= 0)) {
          break label221;
        }
        str5 = localodi.b[0].c;
        label142:
        if (localodo.b.g == null) {
          break label227;
        }
      }
      label203:
      label221:
      label227:
      for (boolean bool = true;; bool = false)
      {
        localArrayList.add(new lnt(str1, str2, str3, str4, j, str5, null, false, bool, localodo.d, localodi.a.f));
        i++;
        break;
        j = efj.a(localodi.a.d.a);
        break label116;
        str5 = null;
        break label142;
      }
    }
  }
  
  public static lnu a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    lnu locallnu = new lnu();
    int i = localByteBuffer.getInt();
    locallnu.a = new ArrayList(i);
    int j = 0;
    if (j < i)
    {
      ArrayList localArrayList = locallnu.a;
      String str1 = lnt.d(localByteBuffer);
      String str2 = lnt.d(localByteBuffer);
      String str3 = lnt.d(localByteBuffer);
      String str4 = lnt.d(localByteBuffer);
      int k = localByteBuffer.getInt();
      String str5 = lnt.d(localByteBuffer);
      String str6 = lnt.d(localByteBuffer);
      boolean bool1;
      if (localByteBuffer.get() == 1)
      {
        bool1 = true;
        label104:
        if (localByteBuffer.get() != 1) {
          break label166;
        }
      }
      label166:
      for (boolean bool2 = true;; bool2 = false)
      {
        localArrayList.add(new lnt(str1, str2, str3, str4, k, str5, str6, bool1, bool2, localByteBuffer.getInt(), localByteBuffer.getInt()));
        j++;
        break;
        bool1 = false;
        break label104;
      }
    }
    return locallnu;
  }
  
  private static boolean a(oed paramoed)
  {
    return (paramoed != null) && (paramoed.b != null) && (paramoed.b.b != null);
  }
  
  public static byte[] a(lnu paramlnu)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(256);
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    for (;;)
    {
      try
      {
        int i = paramlnu.a.size();
        localDataOutputStream.writeInt(i);
        int j = 0;
        if (j < i)
        {
          lnt locallnt = (lnt)paramlnu.a.get(j);
          lnt.a(localDataOutputStream, locallnt.a);
          lnt.a(localDataOutputStream, locallnt.b);
          lnt.a(localDataOutputStream, locallnt.c);
          lnt.a(localDataOutputStream, locallnt.d);
          localDataOutputStream.writeInt(locallnt.e);
          lnt.a(localDataOutputStream, locallnt.f);
          lnt.a(localDataOutputStream, locallnt.g);
          if (locallnt.h)
          {
            k = 1;
            localDataOutputStream.writeByte(k);
            if (!locallnt.i) {
              break label206;
            }
            m = 1;
            localDataOutputStream.writeByte(m);
            localDataOutputStream.writeInt(locallnt.j);
            localDataOutputStream.writeInt(locallnt.k);
            j++;
          }
        }
        else
        {
          byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
          return arrayOfByte;
        }
      }
      finally
      {
        localDataOutputStream.close();
      }
      int k = 0;
      continue;
      label206:
      int m = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lnu
 * JD-Core Version:    0.7.0.1
 */