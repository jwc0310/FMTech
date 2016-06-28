import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class hxg
  extends mab
{
  public ArrayList<hxh> a;
  
  public hxg()
  {
    this.a = new ArrayList();
  }
  
  public hxg(nhf paramnhf)
  {
    if (paramnhf.c != null) {}
    HashMap localHashMap;
    for (int j = paramnhf.c.length;; j = 0)
    {
      localHashMap = new HashMap();
      for (int k = 0; k < j; k++)
      {
        qbu localqbu3 = paramnhf.c[k];
        localHashMap.put(localqbu3.c, localqbu3);
      }
    }
    this.a = new ArrayList(paramnhf.b.length);
    while (i < paramnhf.b.length)
    {
      qbv localqbv = paramnhf.b[i];
      qbr localqbr = localqbv.g;
      qbu localqbu1 = null;
      if (localqbr != null)
      {
        qbu localqbu2 = localqbv.g.d;
        localqbu1 = null;
        if (localqbu2 != null)
        {
          String str = localqbv.g.d.c;
          localqbu1 = null;
          if (str != null) {
            localqbu1 = (qbu)localHashMap.get(localqbv.g.d.c);
          }
        }
      }
      this.a.add(new hxh(localqbv, localqbu1));
      i++;
    }
  }
  
  public static byte[] a(hxg paramhxg)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(256);
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    for (;;)
    {
      try
      {
        int i = paramhxg.a.size();
        localDataOutputStream.writeInt(i);
        int j = 0;
        if (j < i)
        {
          hxh localhxh = (hxh)paramhxg.a.get(j);
          hxh.a(localDataOutputStream, localhxh.a);
          hxh.a(localDataOutputStream, localhxh.b);
          if (localhxh.c != null)
          {
            l = localhxh.c.longValue();
            localDataOutputStream.writeLong(l);
            hxh.a(localDataOutputStream, localhxh.d);
            hxh.a(localDataOutputStream, localhxh.e);
            hxh.a(localDataOutputStream, localhxh.f);
            hxh.a(localDataOutputStream, localhxh.g);
            hxh.a(localDataOutputStream, localhxh.h);
            localDataOutputStream.writeInt(localhxh.i);
            hxh.a(localDataOutputStream, localhxh.j);
            if (!localhxh.k) {
              break label215;
            }
            k = 1;
            localDataOutputStream.writeByte(k);
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
      long l = -1L;
      continue;
      label215:
      int k = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hxg
 * JD-Core Version:    0.7.0.1
 */