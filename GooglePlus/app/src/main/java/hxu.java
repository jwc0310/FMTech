import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class hxu
  extends FilterOutputStream
{
  hxq a;
  private int b = 0;
  private int c;
  private int d;
  private byte[] e = new byte[1];
  private ByteBuffer f = ByteBuffer.allocate(4);
  private final hxp g;
  
  protected hxu(OutputStream paramOutputStream, hxp paramhxp)
  {
    super(new BufferedOutputStream(paramOutputStream, 65536));
    this.g = paramhxp;
  }
  
  private final int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = Math.min(paramInt1 - this.f.position(), paramInt3);
    this.f.put(paramArrayOfByte, paramInt2, i);
    return i;
  }
  
  private static int a(hyb paramhyb, int paramInt)
  {
    int i = paramInt + (4 + (2 + 12 * paramhyb.b.size()));
    hya[] arrayOfhya = paramhyb.a();
    int j = arrayOfhya.length;
    int k = i;
    for (int m = 0; m < j; m++)
    {
      hya localhya = arrayOfhya[m];
      int n = localhya.e;
      int i1 = localhya.c;
      if (n * hya.a[i1] > 4)
      {
        localhya.h = k;
        int i2 = localhya.e;
        int i3 = localhya.c;
        k += i2 * hya.a[i3];
      }
    }
    return k;
  }
  
  private final void a()
  {
    if (this.a == null) {}
    hyd localhyd;
    label316:
    label345:
    label374:
    int j;
    label408:
    label542:
    label548:
    label554:
    label560:
    label566:
    do
    {
      return;
      hxq localhxq1 = this.a;
      ArrayList localArrayList = new ArrayList();
      List localList = localhxq1.a();
      if (localList != null) {
        for (int k = 0; k < localList.size(); k++)
        {
          hya localhya2 = (hya)localhxq1.a().get(0);
          if (localhya2.g == null)
          {
            short s1 = localhya2.b;
            if (!hxp.u.contains(Short.valueOf(s1)))
            {
              short s2 = localhya2.b;
              int m = localhya2.f;
              hyb localhyb7 = localhxq1.a[m];
              if (localhyb7 != null) {
                localhyb7.b.remove(Short.valueOf(s2));
              }
              localArrayList.add(localhya2);
            }
          }
        }
      }
      b();
      int i = c();
      if (i + 8 > 65535) {
        throw new IOException("Exif header is too large (>64Kb)");
      }
      localhyd = new hyd(this.out);
      ByteOrder localByteOrder1 = ByteOrder.BIG_ENDIAN;
      localhyd.a.order(localByteOrder1);
      localhyd.a((short)-31);
      localhyd.a((short)(i + 2 + hyc.a.length));
      localhyd.write(hyc.a);
      hyb localhyb1;
      hyb localhyb2;
      hyb localhyb3;
      hyb localhyb4;
      hxq localhxq6;
      if (this.a.d == ByteOrder.BIG_ENDIAN)
      {
        localhyd.a((short)19789);
        ByteOrder localByteOrder2 = this.a.d;
        localhyd.a.order(localByteOrder2);
        localhyd.a((short)42);
        localhyd.a(8);
        hxq localhxq2 = this.a;
        if (!hya.a(0)) {
          break label542;
        }
        localhyb1 = localhxq2.a[0];
        a(localhyb1, localhyd);
        hxq localhxq3 = this.a;
        if (!hya.a(2)) {
          break label548;
        }
        localhyb2 = localhxq3.a[2];
        a(localhyb2, localhyd);
        hxq localhxq4 = this.a;
        if (!hya.a(3)) {
          break label554;
        }
        localhyb3 = localhxq4.a[3];
        if (localhyb3 != null) {
          a(localhyb3, localhyd);
        }
        hxq localhxq5 = this.a;
        if (!hya.a(4)) {
          break label560;
        }
        localhyb4 = localhxq5.a[4];
        if (localhyb4 != null) {
          a(localhyb4, localhyd);
        }
        localhxq6 = this.a;
        if (!hya.a(1)) {
          break label566;
        }
      }
      for (hyb localhyb5 = localhxq6.a[1];; localhyb5 = null)
      {
        if (localhyb5 != null)
        {
          hxq localhxq7 = this.a;
          boolean bool = hya.a(1);
          hyb localhyb6 = null;
          if (bool) {
            localhyb6 = localhxq7.a[1];
          }
          a(localhyb6, localhyd);
        }
        a(localhyd);
        Iterator localIterator = localArrayList.iterator();
        while (localIterator.hasNext())
        {
          hya localhya1 = (hya)localIterator.next();
          this.a.a(localhya1);
        }
        localhyd.a((short)18761);
        break;
        localhyb1 = null;
        break label316;
        localhyb2 = null;
        break label345;
        localhyb3 = null;
        break label374;
        localhyb4 = null;
        break label408;
      }
      byte[] arrayOfByte1 = this.a.e;
      j = 0;
      if (arrayOfByte1 != null) {
        j = 1;
      }
    } while (j == 0);
    byte[] arrayOfByte2 = this.a.e;
    ByteOrder localByteOrder3 = ByteOrder.BIG_ENDIAN;
    localhyd.a.order(localByteOrder3);
    localhyd.a((short)-31);
    localhyd.a((short)(2 + arrayOfByte2.length + hyc.b.length));
    localhyd.write(hyc.b);
    localhyd.write(arrayOfByte2);
  }
  
  private static void a(hya paramhya, hyd paramhyd)
  {
    int i = 0;
    int j;
    if (paramhya.g != null)
    {
      j = 1;
      if (j != 0) {
        break label21;
      }
    }
    for (;;)
    {
      return;
      j = 0;
      break;
      label21:
      byte[] arrayOfByte2;
      int i2;
      String str1;
      switch (paramhya.c)
      {
      case 6: 
      case 8: 
      default: 
        return;
      case 1: 
      case 7: 
        arrayOfByte2 = new byte[paramhya.e];
        i2 = arrayOfByte2.length;
        if ((paramhya.c != 7) && (paramhya.c != 1))
        {
          str1 = String.valueOf(hya.b(paramhya.c));
          if (str1.length() == 0) {
            break;
          }
        }
      case 2: 
      case 4: 
      case 9: 
      case 5: 
      case 10: 
        for (String str2 = "Cannot get BYTE value from ".concat(str1);; str2 = new String("Cannot get BYTE value from "))
        {
          throw new IllegalArgumentException(str2);
          byte[] arrayOfByte1 = (byte[])paramhya.g;
          if (arrayOfByte1.length == paramhya.e)
          {
            arrayOfByte1[(-1 + arrayOfByte1.length)] = 0;
            paramhyd.write(arrayOfByte1);
            return;
          }
          paramhyd.write(arrayOfByte1);
          paramhyd.write(0);
          return;
          int i1 = paramhya.e;
          while (i < i1)
          {
            paramhyd.a((int)paramhya.b(i));
            i++;
          }
          int n = paramhya.e;
          while (i < n)
          {
            hye localhye = paramhya.c(i);
            paramhyd.a((int)localhye.a);
            paramhyd.a((int)localhye.b);
            i++;
          }
        }
        System.arraycopy(paramhya.g, 0, arrayOfByte2, 0, Math.min(paramhya.e, i2));
        paramhyd.write(arrayOfByte2);
        return;
      }
      int k = paramhya.e;
      for (int m = 0; m < k; m++) {
        paramhyd.a((short)(int)paramhya.b(m));
      }
    }
  }
  
  private static void a(hyb paramhyb, hyd paramhyd)
  {
    int i = 0;
    hya[] arrayOfhya = paramhyb.a();
    paramhyd.a((short)arrayOfhya.length);
    int j = arrayOfhya.length;
    int k = 0;
    if (k < j)
    {
      hya localhya2 = arrayOfhya[k];
      paramhyd.a(localhya2.b);
      paramhyd.a(localhya2.c);
      paramhyd.a(localhya2.e);
      if (Log.isLoggable("ExifOutputStream", 2))
      {
        String str = String.valueOf(localhya2);
        new StringBuilder(1 + String.valueOf(str).length()).append("\n").append(str);
      }
      int i2 = localhya2.e;
      int i3 = localhya2.c;
      if (i2 * hya.a[i3] > 4) {
        paramhyd.a(localhya2.h);
      }
      for (;;)
      {
        k++;
        break;
        a(localhya2, paramhyd);
        int i4 = localhya2.e;
        int i5 = localhya2.c;
        int i6 = 4 - i4 * hya.a[i5];
        for (int i7 = 0; i7 < i6; i7++) {
          paramhyd.write(0);
        }
      }
    }
    paramhyd.a(paramhyb.c);
    int m = arrayOfhya.length;
    while (i < m)
    {
      hya localhya1 = arrayOfhya[i];
      int n = localhya1.e;
      int i1 = localhya1.c;
      if (n * hya.a[i1] > 4) {
        a(localhya1, paramhyd);
      }
      i++;
    }
  }
  
  private final void a(hyd paramhyd)
  {
    int i = 1;
    int j;
    if (this.a.b != null)
    {
      j = i;
      if (j == 0) {
        break label35;
      }
      paramhyd.write(this.a.b);
    }
    label35:
    label98:
    for (;;)
    {
      return;
      j = 0;
      break;
      if (!this.a.c.isEmpty()) {}
      for (;;)
      {
        if (i == 0) {
          break label98;
        }
        for (int k = 0; k < this.a.c.size(); k++) {
          paramhyd.write((byte[])this.a.c.get(k));
        }
        break;
        i = 0;
      }
    }
  }
  
  private final void b()
  {
    hxq localhxq1 = this.a;
    if (hya.a(0)) {}
    hya localhya1;
    for (hyb localhyb1 = localhxq1.a[0];; localhyb1 = null)
    {
      if (localhyb1 == null)
      {
        localhyb1 = new hyb(0);
        this.a.a[localhyb1.a] = localhyb1;
      }
      localhya1 = this.g.e(hxp.j);
      if (localhya1 != null) {
        break;
      }
      int i6 = hxp.j;
      throw new IOException(47 + "No definition for crucial exif tag: " + i6);
    }
    localhyb1.a(localhya1);
    hxq localhxq2 = this.a;
    hyb localhyb2;
    hyb localhyb3;
    if (hya.a(2))
    {
      localhyb2 = localhxq2.a[2];
      if (localhyb2 == null)
      {
        localhyb2 = new hyb(2);
        this.a.a[localhyb2.a] = localhyb2;
      }
      hxq localhxq3 = this.a;
      if (!hya.a(4)) {
        break label245;
      }
      localhyb3 = localhxq3.a[4];
    }
    for (;;)
    {
      if (localhyb3 != null)
      {
        hya localhya7 = this.g.e(hxp.k);
        if (localhya7 == null)
        {
          int i5 = hxp.k;
          throw new IOException(47 + "No definition for crucial exif tag: " + i5);
          localhyb2 = null;
          break;
          label245:
          localhyb3 = null;
          continue;
        }
        localhyb1.a(localhya7);
      }
    }
    hxq localhxq4 = this.a;
    hyb localhyb4;
    if (hya.a(3)) {
      localhyb4 = localhxq4.a[3];
    }
    while (localhyb4 != null)
    {
      hya localhya6 = this.g.e(hxp.t);
      if (localhya6 == null)
      {
        int i4 = hxp.t;
        throw new IOException(47 + "No definition for crucial exif tag: " + i4);
        localhyb4 = null;
      }
      else
      {
        localhyb2.a(localhya6);
      }
    }
    hxq localhxq5 = this.a;
    hyb localhyb5;
    int i;
    if (hya.a(1))
    {
      localhyb5 = localhxq5.a[1];
      if (this.a.b == null) {
        break label481;
      }
      i = 1;
    }
    for (;;)
    {
      if (i != 0)
      {
        if (localhyb5 == null)
        {
          localhyb5 = new hyb(1);
          this.a.a[localhyb5.a] = localhyb5;
        }
        hya localhya4 = this.g.e(hxp.l);
        if (localhya4 == null)
        {
          int i3 = hxp.l;
          throw new IOException(47 + "No definition for crucial exif tag: " + i3);
          localhyb5 = null;
          break;
          label481:
          i = 0;
          continue;
        }
        localhyb5.a(localhya4);
        hya localhya5 = this.g.e(hxp.m);
        if (localhya5 == null)
        {
          int i2 = hxp.m;
          throw new IOException(47 + "No definition for crucial exif tag: " + i2);
        }
        localhya5.a(new int[] { this.a.b.length });
        localhyb5.a(localhya5);
        short s7 = hxp.a(hxp.e);
        localhyb5.b.remove(Short.valueOf(s7));
        short s8 = hxp.a(hxp.g);
        localhyb5.b.remove(Short.valueOf(s8));
        return;
      }
    }
    int j;
    label641:
    hyb localhyb6;
    if (!this.a.c.isEmpty())
    {
      j = 1;
      if (j == 0) {
        break label929;
      }
      if (localhyb5 != null) {
        break label1031;
      }
      localhyb6 = new hyb(1);
      this.a.a[localhyb6.a] = localhyb6;
    }
    label1031:
    for (hyb localhyb7 = localhyb6;; localhyb7 = localhyb5)
    {
      int k = this.a.c.size();
      hya localhya2 = this.g.e(hxp.e);
      if (localhya2 == null)
      {
        int i1 = hxp.e;
        throw new IOException(47 + "No definition for crucial exif tag: " + i1);
        j = 0;
        break label641;
      }
      hya localhya3 = this.g.e(hxp.g);
      if (localhya3 == null)
      {
        int n = hxp.g;
        throw new IOException(47 + "No definition for crucial exif tag: " + n);
      }
      long[] arrayOfLong = new long[k];
      for (int m = 0; m < this.a.c.size(); m++) {
        arrayOfLong[m] = ((byte[])this.a.c.get(m)).length;
      }
      localhya3.a(arrayOfLong);
      localhyb7.a(localhya2);
      localhyb7.a(localhya3);
      short s5 = hxp.a(hxp.l);
      localhyb7.b.remove(Short.valueOf(s5));
      short s6 = hxp.a(hxp.m);
      localhyb7.b.remove(Short.valueOf(s6));
      return;
      label929:
      if (localhyb5 == null) {
        break;
      }
      short s1 = hxp.a(hxp.e);
      localhyb5.b.remove(Short.valueOf(s1));
      short s2 = hxp.a(hxp.g);
      localhyb5.b.remove(Short.valueOf(s2));
      short s3 = hxp.a(hxp.l);
      localhyb5.b.remove(Short.valueOf(s3));
      short s4 = hxp.a(hxp.m);
      localhyb5.b.remove(Short.valueOf(s4));
      return;
    }
  }
  
  private final int c()
  {
    hxq localhxq1 = this.a;
    hyb localhyb1;
    hyb localhyb2;
    label69:
    int j;
    hyb localhyb3;
    if (hya.a(0))
    {
      localhyb1 = localhxq1.a[0];
      int i = a(localhyb1, 8);
      localhyb1.a(hxp.a(hxp.j)).a(new int[] { i });
      hxq localhxq2 = this.a;
      if (!hya.a(2)) {
        break label298;
      }
      localhyb2 = localhxq2.a[2];
      j = a(localhyb2, i);
      hxq localhxq3 = this.a;
      if (!hya.a(3)) {
        break label304;
      }
      localhyb3 = localhxq3.a[3];
      label99:
      if (localhyb3 == null) {
        break label442;
      }
      localhyb2.a(hxp.a(hxp.t)).a(new int[] { j });
    }
    label158:
    label298:
    label304:
    label442:
    for (int k = a(localhyb3, j);; k = j)
    {
      hxq localhxq4 = this.a;
      hyb localhyb4;
      hyb localhyb5;
      label216:
      int m;
      if (hya.a(4))
      {
        localhyb4 = localhxq4.a[4];
        if (localhyb4 != null)
        {
          localhyb1.a(hxp.a(hxp.k)).a(new int[] { k });
          k = a(localhyb4, k);
        }
        hxq localhxq5 = this.a;
        if (!hya.a(1)) {
          break label316;
        }
        localhyb5 = localhxq5.a[1];
        if (localhyb5 != null)
        {
          localhyb1.c = k;
          k = a(localhyb5, k);
        }
        if (this.a.b == null) {
          break label322;
        }
        m = 1;
        label249:
        if (m == 0) {
          break label328;
        }
        localhyb5.a(hxp.a(hxp.l)).a(new int[] { k });
        k += this.a.b.length;
      }
      label316:
      label322:
      label328:
      long[] arrayOfLong;
      for (;;)
      {
        return k;
        localhyb1 = null;
        break;
        localhyb2 = null;
        break label69;
        localhyb3 = null;
        break label99;
        localhyb4 = null;
        break label158;
        localhyb5 = null;
        break label216;
        m = 0;
        break label249;
        if (!this.a.c.isEmpty()) {}
        for (int n = 1; n != 0; n = 0)
        {
          arrayOfLong = new long[this.a.c.size()];
          for (int i1 = 0; i1 < this.a.c.size(); i1++)
          {
            arrayOfLong[i1] = k;
            k += ((byte[])this.a.c.get(i1)).length;
          }
        }
      }
      localhyb5.a(hxp.a(hxp.e)).a(arrayOfLong);
      return k;
    }
  }
  
  public final void write(int paramInt)
  {
    this.e[0] = ((byte)(paramInt & 0xFF));
    write(this.e);
  }
  
  public final void write(byte[] paramArrayOfByte)
  {
    write(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (((this.c > 0) || (this.d > 0) || (this.b != 2)) && (paramInt2 > 0))
    {
      if (this.c > 0)
      {
        m = Math.min(this.c, paramInt2);
        paramInt2 -= m;
        this.c -= m;
        paramInt1 += m;
      }
      if (this.d > 0)
      {
        k = Math.min(this.d, paramInt2);
        this.out.write(paramArrayOfByte, paramInt1, k);
        paramInt2 -= k;
        this.d -= k;
        paramInt1 += k;
      }
      if (paramInt2 != 0) {}
    }
    while (paramInt2 <= 0)
    {
      do
      {
        do
        {
          int m;
          int k;
          return;
          switch (this.b)
          {
          default: 
            break;
          case 0: 
            int j = a(2, paramArrayOfByte, paramInt1, paramInt2);
            paramInt1 += j;
            paramInt2 -= j;
          }
        } while (this.f.position() < 2);
        this.f.rewind();
        if (this.f.getShort() != -40) {
          throw new IOException("Not a valid jpeg image, cannot write exif");
        }
        this.out.write(this.f.array(), 0, 2);
        this.b = 1;
        this.f.rewind();
        a();
        break;
        int i = a(4, paramArrayOfByte, paramInt1, paramInt2);
        paramInt1 += i;
        paramInt2 -= i;
        if ((this.f.position() == 2) && (this.f.getShort() == -39))
        {
          this.out.write(this.f.array(), 0, 2);
          this.f.rewind();
        }
      } while (this.f.position() < 4);
      this.f.rewind();
      short s = this.f.getShort();
      if (s == -31)
      {
        this.c = (-2 + (0xFFFF & this.f.getShort()));
        this.b = 2;
      }
      for (;;)
      {
        this.f.rewind();
        break;
        if (!hyc.a(s))
        {
          this.out.write(this.f.array(), 0, 4);
          this.d = (-2 + (0xFFFF & this.f.getShort()));
        }
        else
        {
          this.out.write(this.f.array(), 0, 4);
          this.b = 2;
        }
      }
    }
    this.out.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hxu
 * JD-Core Version:    0.7.0.1
 */