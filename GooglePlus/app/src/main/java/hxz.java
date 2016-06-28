import android.util.Log;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.TreeMap;

final class hxz
{
  private final hxp a;
  
  hxz(hxp paramhxp)
  {
    this.a = paramhxp;
  }
  
  protected final hxq a(InputStream paramInputStream)
  {
    hxv localhxv = new hxv(paramInputStream, 63, this.a);
    hxq localhxq = new hxq(localhxv.a.b.order());
    int i = localhxv.a();
    if (i != 6)
    {
      switch (i)
      {
      }
      label448:
      for (;;)
      {
        i = localhxv.a();
        break;
        hyb localhyb3 = new hyb(localhxv.b);
        localhxq.a[localhyb3.a] = localhyb3;
        continue;
        hya localhya2 = localhxv.c;
        if (localhya2.g != null) {}
        for (int i3 = 1;; i3 = 0)
        {
          if (i3 != 0) {
            break label197;
          }
          if (localhya2.h < localhxv.a.a) {
            break;
          }
          localhxv.j.put(Integer.valueOf(localhya2.h), new hxw(localhya2, true));
          break;
        }
        label197:
        int i4 = localhya2.f;
        if (hya.a(i4)) {}
        for (hyb localhyb2 = localhxq.a[i4];; localhyb2 = null)
        {
          localhyb2.a(localhya2);
          break;
        }
        hya localhya1 = localhxv.c;
        if (localhya1.c == 7) {
          localhxv.a(localhya1);
        }
        int i2 = localhya1.f;
        if (hya.a(i2)) {}
        for (hyb localhyb1 = localhxq.a[i2];; localhyb1 = null)
        {
          localhyb1.a(localhya1);
          break;
        }
        if (localhxv.f == null) {}
        for (int i1 = 0;; i1 = (int)localhxv.f.b(0))
        {
          byte[] arrayOfByte3 = new byte[i1];
          if (arrayOfByte3.length != localhxv.a.read(arrayOfByte3)) {
            break label355;
          }
          localhxq.b = arrayOfByte3;
          break;
        }
        label355:
        if (Log.isLoggable("ExifReader", 5))
        {
          continue;
          if (localhxv.e == null) {}
          byte[] arrayOfByte2;
          int m;
          for (int k = 0;; k = (int)localhxv.e.b(0))
          {
            arrayOfByte2 = new byte[k];
            if (arrayOfByte2.length != localhxv.a.read(arrayOfByte2)) {
              break label492;
            }
            m = localhxv.d.a;
            if (m >= localhxq.c.size()) {
              break label448;
            }
            localhxq.c.set(m, arrayOfByte2);
            break;
          }
          for (int n = localhxq.c.size(); n < m; n++) {
            localhxq.c.add(null);
          }
          localhxq.c.add(arrayOfByte2);
          continue;
          label492:
          if (Log.isLoggable("ExifReader", 5))
          {
            continue;
            byte[] arrayOfByte1 = new byte[localhxv.h];
            int j = localhxv.h;
            localhxv.a.read(arrayOfByte1, 0, j);
            localhxq.e = arrayOfByte1;
          }
        }
      }
    }
    return localhxq;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hxz
 * JD-Core Version:    0.7.0.1
 */