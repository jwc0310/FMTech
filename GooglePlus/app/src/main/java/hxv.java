import android.util.Log;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.TreeMap;

final class hxv
{
  private static final short A = hxp.a(hxp.g);
  private static final Charset k = Charset.forName("US-ASCII");
  private static final short u = hxp.a(hxp.j);
  private static final short v = hxp.a(hxp.k);
  private static final short w = hxp.a(hxp.t);
  private static final short x = hxp.a(hxp.l);
  private static final short y = hxp.a(hxp.m);
  private static final short z = hxp.a(hxp.e);
  final hxo a;
  int b;
  hya c;
  hxy d;
  hya e;
  hya f;
  int g = 0;
  int h;
  int i;
  final TreeMap<Integer, Object> j = new TreeMap();
  private final int l;
  private int m = 0;
  private int n = 0;
  private boolean o;
  private boolean p = false;
  private int q;
  private byte[] r;
  private int s;
  private final hxp t;
  
  hxv(InputStream paramInputStream, int paramInt, hxp paramhxp)
  {
    if (paramInputStream == null) {
      throw new IOException("Null argument inputStream to ExifParser");
    }
    this.t = paramhxp;
    this.p = a(paramInputStream);
    this.a = new hxo(paramInputStream);
    this.l = paramInt;
    if (!this.p) {}
    int i2;
    do
    {
      long l1;
      do
      {
        return;
        int i1 = this.a.a();
        if (18761 == i1)
        {
          hxo localhxo2 = this.a;
          ByteOrder localByteOrder2 = ByteOrder.LITTLE_ENDIAN;
          localhxo2.b.order(localByteOrder2);
        }
        while (this.a.a() != 42)
        {
          throw new hxr("Invalid TIFF header");
          if (19789 == i1)
          {
            hxo localhxo1 = this.a;
            ByteOrder localByteOrder1 = ByteOrder.BIG_ENDIAN;
            localhxo1.b.order(localByteOrder1);
          }
          else
          {
            throw new hxr("Invalid TIFF header");
          }
        }
        l1 = 0xFFFFFFFF & this.a.b();
        if (l1 > 2147483647L) {
          throw new hxr(35 + "Invalid offset " + l1);
        }
        this.s = ((int)l1);
        this.b = 0;
      } while ((!a(0)) && (!c()));
      a(0, l1);
      i2 = -8 + (int)l1;
      if (i2 < 0) {
        throw new hxr(35 + "Invalid offset " + l1);
      }
    } while (i2 <= 0);
    this.r = new byte[i2];
    byte[] arrayOfByte = this.r;
    this.a.read(arrayOfByte);
  }
  
  private final void a(int paramInt, long paramLong)
  {
    this.j.put(Integer.valueOf((int)paramLong), new hxx(paramInt, a(paramInt)));
  }
  
  private final boolean a(int paramInt)
  {
    boolean bool = true;
    switch (paramInt)
    {
    default: 
      bool = false;
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return bool;
            } while ((0x1 & this.l) != 0);
            return false;
          } while ((0x2 & this.l) != 0);
          return false;
        } while ((0x4 & this.l) != 0);
        return false;
      } while ((0x8 & this.l) != 0);
      return false;
    } while ((0x10 & this.l) != 0);
    return false;
  }
  
  private final boolean a(int paramInt1, int paramInt2)
  {
    int i1 = this.t.b().get(paramInt2);
    if (i1 == 0) {
      return false;
    }
    return hxp.c(i1, paramInt1);
  }
  
  private final boolean a(InputStream paramInputStream)
  {
    hxo localhxo = new hxo(paramInputStream);
    if (localhxo.a() != -40) {
      throw new hxr("Invalid JPEG format");
    }
    for (short s1 = localhxo.a();; s1 = localhxo.a())
    {
      boolean bool1 = false;
      int i1;
      if (s1 != -39)
      {
        boolean bool2 = hyc.a(s1);
        bool1 = false;
        if (!bool2)
        {
          i1 = 0xFFFF & localhxo.a();
          if ((s1 != -31) || (i1 < 2 + hyc.a.length)) {
            break label155;
          }
          byte[] arrayOfByte = new byte[hyc.a.length];
          localhxo.read(arrayOfByte, 0, hyc.a.length);
          i1 -= hyc.a.length;
          if (!Arrays.equals(arrayOfByte, hyc.a)) {
            break label155;
          }
          this.i = localhxo.a;
          this.q = i1;
          this.g = (this.i + this.q);
          bool1 = true;
        }
      }
      label155:
      boolean bool3;
      do
      {
        do
        {
          return bool1;
          bool1 = false;
        } while (i1 < 2);
        bool3 = i1 - 2 < localhxo.skip(i1 - 2);
        bool1 = false;
      } while (bool3);
    }
  }
  
  private final void b(int paramInt)
  {
    hxo localhxo = this.a;
    long l1 = paramInt - localhxo.a;
    if (l1 < 0L) {
      throw new IOException();
    }
    if (localhxo.skip(l1) != l1) {
      throw new EOFException();
    }
    while ((!this.j.isEmpty()) && (((Integer)this.j.firstKey()).intValue() < paramInt)) {
      this.j.pollFirstEntry();
    }
  }
  
  private final void b(int paramInt, long paramLong)
  {
    this.j.put(Integer.valueOf((int)paramLong), new hxy(4, paramInt));
  }
  
  private final void b(hya paramhya)
  {
    int i1 = 1;
    if (paramhya.e == 0) {}
    label287:
    label443:
    for (;;)
    {
      return;
      int i2 = paramhya.b;
      int i3 = paramhya.f;
      if ((i2 == u) && (a(i3, hxp.j)))
      {
        if ((a(2)) || (a(3))) {
          a(2, paramhya.b(0));
        }
      }
      else if ((i2 == v) && (a(i3, hxp.k)))
      {
        if (a(4)) {
          a(4, paramhya.b(0));
        }
      }
      else if ((i2 == w) && (a(i3, hxp.t)))
      {
        if (a(3)) {
          a(3, paramhya.b(0));
        }
      }
      else if ((i2 == x) && (a(i3, hxp.l)))
      {
        if ((0x20 & this.l) != 0) {}
        while (i1 != 0)
        {
          long l1 = paramhya.b(0);
          this.j.put(Integer.valueOf((int)l1), new hxy(3));
          return;
          i1 = 0;
        }
      }
      else if ((i2 == y) && (a(i3, hxp.m)))
      {
        if ((0x20 & this.l) != 0) {}
        while (i1 != 0)
        {
          this.f = paramhya;
          return;
          i1 = 0;
        }
      }
      else
      {
        if ((i2 == z) && (a(i3, hxp.e)))
        {
          int i6;
          if ((0x20 & this.l) != 0)
          {
            i6 = i1;
            if (i6 == 0) {
              break label342;
            }
            if (paramhya.g == null) {
              break label344;
            }
          }
          for (;;)
          {
            int i7 = 0;
            if (i1 == 0) {
              break label349;
            }
            while (i7 < paramhya.e)
            {
              b(i7, paramhya.b(i7));
              i7++;
            }
            break;
            i6 = 0;
            break label287;
            label342:
            break;
            label344:
            i1 = 0;
          }
          label349:
          this.j.put(Integer.valueOf(paramhya.h), new hxw(paramhya, false));
          return;
        }
        if ((i2 == A) && (a(i3, hxp.g)))
        {
          if ((0x20 & this.l) != 0) {}
          for (int i4 = i1;; i4 = 0)
          {
            if (i4 == 0) {
              break label443;
            }
            Object localObject = paramhya.g;
            int i5 = 0;
            if (localObject != null) {
              i5 = i1;
            }
            if (i5 == 0) {
              break;
            }
            this.e = paramhya;
            return;
          }
        }
      }
    }
  }
  
  private final boolean c()
  {
    switch (this.b)
    {
    default: 
    case 0: 
    case 1: 
      do
      {
        do
        {
          return false;
        } while ((!a(2)) && (!a(4)) && (!a(3)) && (!a(1)));
        return true;
      } while ((0x20 & this.l) == 0);
      return true;
    }
    return a(3);
  }
  
  private final hya d()
  {
    short s1 = this.a.a();
    short s2 = this.a.a();
    long l1 = 0xFFFFFFFF & this.a.b();
    if (l1 > 2147483647L) {
      throw new hxr("Number of component is larger then Integer.MAX_VALUE");
    }
    hya localhya;
    if (!hya.a(s2))
    {
      if (Log.isLoggable("ExifParser", 5))
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Short.valueOf(s1);
        arrayOfObject[1] = Short.valueOf(s2);
        String.format("Tag %04x: Invalid data type %d", arrayOfObject);
      }
      this.a.skip(4L);
      localhya = null;
    }
    int i5;
    long l2;
    byte[] arrayOfByte;
    int i6;
    do
    {
      return localhya;
      int i1 = (int)l1;
      int i2 = this.b;
      if ((int)l1 != 0) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        localhya = new hya(s1, s2, i1, i2, bool1);
        int i3 = localhya.e;
        int i4 = localhya.c;
        i5 = i3 * hya.a[i4];
        if (i5 <= 4) {
          break label345;
        }
        l2 = 0xFFFFFFFF & this.a.b();
        if (l2 <= 2147483647L) {
          break;
        }
        throw new hxr("offset is larger then Integer.MAX_VALUE");
      }
      if ((this.r == null) || (l2 >= this.s) || (s2 != 7)) {
        break;
      }
      arrayOfByte = new byte[(int)l1];
      System.arraycopy(this.r, -8 + (int)l2, arrayOfByte, 0, (int)l1);
      i6 = arrayOfByte.length;
    } while ((localhya.d(i6)) || ((localhya.c != 1) && (localhya.c != 7)));
    localhya.g = new byte[i6];
    System.arraycopy(arrayOfByte, 0, localhya.g, 0, i6);
    localhya.e = i6;
    return localhya;
    localhya.h = ((int)l2);
    return localhya;
    label345:
    boolean bool2 = localhya.d;
    localhya.d = false;
    a(localhya);
    localhya.d = bool2;
    this.a.skip(4 - i5);
    localhya.h = (-4 + this.a.a);
    return localhya;
  }
  
  private final boolean e()
  {
    int i1 = -2 + (this.q - this.a.a);
    if ((i1 > 0) && (this.a.skip(i1) != i1)) {
      return false;
    }
    hxo localhxo = this.a;
    ByteOrder localByteOrder = ByteOrder.BIG_ENDIAN;
    localhxo.b.order(localByteOrder);
    for (;;)
    {
      try
      {
        short s1 = this.a.a();
        if ((s1 == -39) || (hyc.a(s1))) {
          break;
        }
        int i2 = 0xFFFF & this.a.a();
        if ((s1 == -31) && (i2 >= 2 + hyc.b.length))
        {
          byte[] arrayOfByte = new byte[hyc.b.length];
          int i4 = hyc.b.length;
          this.a.read(arrayOfByte, 0, i4);
          i3 = i2 - hyc.b.length;
          if (Arrays.equals(arrayOfByte, hyc.b))
          {
            this.h = (i3 - 2);
            return true;
          }
          if ((i3 < 2) || (i3 - 2 != this.a.skip(i3 - 2))) {
            break;
          }
          short s2 = this.a.a();
          s1 = s2;
          continue;
        }
        int i3 = i2;
      }
      catch (EOFException localEOFException)
      {
        return false;
      }
    }
  }
  
  protected final int a()
  {
    int i1 = 1;
    if (!this.p) {
      i1 = 6;
    }
    int i2;
    int i3;
    do
    {
      return i1;
      i2 = this.a.a;
      i3 = 2 + this.m + 12 * this.n;
      if (i2 >= i3) {
        break label74;
      }
      this.c = d();
      if (this.c == null) {
        break;
      }
    } while (!this.o);
    b(this.c);
    return i1;
    label74:
    long l2;
    if (i2 == i3)
    {
      if (this.b != 0) {
        break label303;
      }
      l2 = 0xFFFFFFFF & this.a.b();
      if (!a(i1)) {
        if ((0x20 & this.l) == 0) {
          break label297;
        }
      }
    }
    Map.Entry localEntry;
    Object localObject;
    for (int i6 = i1;; i6 = 0)
    {
      if (i6 != 0) {
        if (l2 != 0L) {
          a(i1, l2);
        }
      }
      if (this.j.isEmpty()) {
        break label639;
      }
      localEntry = this.j.pollFirstEntry();
      localObject = localEntry.getValue();
      label297:
      try
      {
        b(((Integer)localEntry.getKey()).intValue());
        if (!(localObject instanceof hxx)) {
          break label560;
        }
        this.b = ((hxx)localObject).a;
        this.n = (0xFFFF & this.a.a());
        this.m = ((Integer)localEntry.getKey()).intValue();
        if (2 + (12 * this.n + this.m) <= this.q) {
          break;
        }
        if (Log.isLoggable("ExifParser", 5))
        {
          int i4 = this.b;
          new StringBuilder(31).append("Invalid size of IFD ").append(i4);
        }
        return 6;
      }
      catch (IOException localIOException) {}
    }
    label303:
    if (!this.j.isEmpty()) {}
    for (int i5 = ((Integer)this.j.firstEntry().getKey()).intValue() - this.a.a;; i5 = 4)
    {
      if (i5 < 4)
      {
        if (!Log.isLoggable("ExifParser", 5)) {
          break;
        }
        new StringBuilder(45).append("Invalid size of link to next IFD: ").append(i5);
        break;
      }
      long l1 = 0xFFFFFFFF & this.a.b();
      if ((l1 == 0L) || (!Log.isLoggable("ExifParser", 5))) {
        break;
      }
      new StringBuilder(46).append("Invalid link to next IFD: ").append(l1);
      break;
      if (!Log.isLoggable("ExifParser", 5)) {
        break;
      }
      String str1 = String.valueOf(localEntry.getKey());
      String str2 = String.valueOf(localObject.getClass().getName());
      new StringBuilder(57 + String.valueOf(str1).length() + String.valueOf(str2).length()).append("Failed to skip to data at: ").append(str1).append(" for ").append(str2).append(", the file may be broken.");
      break;
      this.o = c();
      if (((hxx)localObject).b) {
        return 0;
      }
      b();
      break;
      label560:
      if ((localObject instanceof hxy))
      {
        this.d = ((hxy)localObject);
        return this.d.b;
      }
      hxw localhxw = (hxw)localObject;
      this.c = localhxw.a;
      if (this.c.c != 7)
      {
        a(this.c);
        b(this.c);
      }
      if (!localhxw.b) {
        break;
      }
      return 2;
      label639:
      if ((this.h == 0) && (e())) {
        return 5;
      }
      return 6;
    }
  }
  
  protected final void a(hya paramhya)
  {
    int i1 = 0;
    int i2 = paramhya.c;
    Object localObject;
    if ((i2 == 2) || (i2 == 7) || (i2 == 1))
    {
      int i3 = paramhya.e;
      if ((!this.j.isEmpty()) && (((Integer)this.j.firstEntry().getKey()).intValue() < i3 + this.a.a))
      {
        localObject = this.j.firstEntry().getValue();
        if (!(localObject instanceof hxy)) {
          break label302;
        }
        if (Log.isLoggable("ExifParser", 5))
        {
          String str8 = String.valueOf(paramhya);
          new StringBuilder(35 + String.valueOf(str8).length()).append("Thumbnail overlaps value for tag: \n").append(str8);
        }
        Map.Entry localEntry = this.j.pollFirstEntry();
        if (Log.isLoggable("ExifParser", 5))
        {
          String str7 = String.valueOf(localEntry.getKey());
          new StringBuilder(26 + String.valueOf(str7).length()).append("Invalid thumbnail offset: ").append(str7);
        }
      }
    }
    switch (paramhya.c)
    {
    }
    for (;;)
    {
      if (Log.isLoggable("ExifParser", 2))
      {
        String str1 = String.valueOf(paramhya);
        new StringBuilder(1 + String.valueOf(str1).length()).append("\n").append(str1);
      }
      return;
      label302:
      if ((localObject instanceof hxx)) {
        if (Log.isLoggable("ExifParser", 5))
        {
          int i15 = ((hxx)localObject).a;
          String str6 = String.valueOf(paramhya);
          new StringBuilder(41 + String.valueOf(str6).length()).append("Ifd ").append(i15).append(" overlaps value for tag: \n").append(str6);
        }
      }
      for (;;)
      {
        int i14 = ((Integer)this.j.firstEntry().getKey()).intValue() - this.a.a;
        if (Log.isLoggable("ExifParser", 5))
        {
          String str5 = String.valueOf(paramhya);
          new StringBuilder(52 + String.valueOf(str5).length()).append("Invalid size of tag: \n").append(str5).append(" setting count to: ").append(i14);
        }
        paramhya.e = i14;
        break;
        if (((localObject instanceof hxw)) && (Log.isLoggable("ExifParser", 5)))
        {
          String str3 = String.valueOf(((hxw)localObject).a);
          String str4 = String.valueOf(paramhya);
          new StringBuilder(46 + String.valueOf(str3).length() + String.valueOf(str4).length()).append("Tag value for tag: \n").append(str3).append(" overlaps value for tag: \n").append(str4);
        }
      }
      byte[] arrayOfByte2 = new byte[paramhya.e];
      this.a.read(arrayOfByte2);
      int i13 = arrayOfByte2.length;
      if ((!paramhya.d(i13)) && ((paramhya.c == 1) || (paramhya.c == 7)))
      {
        paramhya.g = new byte[i13];
        System.arraycopy(arrayOfByte2, 0, paramhya.g, 0, i13);
        paramhya.e = i13;
        continue;
        int i12 = paramhya.e;
        Charset localCharset = k;
        byte[] arrayOfByte1;
        if (i12 > 0)
        {
          hxo localhxo = this.a;
          arrayOfByte1 = new byte[i12];
          localhxo.a(arrayOfByte1, 0, arrayOfByte1.length);
        }
        for (String str2 = new String(arrayOfByte1, localCharset);; str2 = "")
        {
          paramhya.a(str2);
          break;
        }
        long[] arrayOfLong = new long[paramhya.e];
        int i11 = arrayOfLong.length;
        while (i1 < i11)
        {
          arrayOfLong[i1] = (0xFFFFFFFF & this.a.b());
          i1++;
        }
        paramhya.a(arrayOfLong);
        continue;
        hye[] arrayOfhye2 = new hye[paramhya.e];
        int i10 = arrayOfhye2.length;
        while (i1 < i10)
        {
          arrayOfhye2[i1] = new hye(0xFFFFFFFF & this.a.b(), 0xFFFFFFFF & this.a.b());
          i1++;
        }
        paramhya.a(arrayOfhye2);
        continue;
        int[] arrayOfInt2 = new int[paramhya.e];
        int i9 = arrayOfInt2.length;
        while (i1 < i9)
        {
          arrayOfInt2[i1] = (0xFFFF & this.a.a());
          i1++;
        }
        paramhya.a(arrayOfInt2);
        continue;
        int[] arrayOfInt1 = new int[paramhya.e];
        int i8 = arrayOfInt1.length;
        while (i1 < i8)
        {
          arrayOfInt1[i1] = this.a.b();
          i1++;
        }
        paramhya.a(arrayOfInt1);
        continue;
        hye[] arrayOfhye1 = new hye[paramhya.e];
        int i4 = arrayOfhye1.length;
        for (int i5 = 0; i5 < i4; i5++)
        {
          int i6 = this.a.b();
          int i7 = this.a.b();
          arrayOfhye1[i5] = new hye(i6, i7);
        }
        paramhya.a(arrayOfhye1);
      }
    }
  }
  
  protected final void b()
  {
    int i1 = 2 + this.m + 12 * this.n;
    int i2 = this.a.a;
    if (i2 > i1) {}
    label134:
    label138:
    for (;;)
    {
      return;
      if (this.o) {
        while (i2 < i1)
        {
          this.c = d();
          i2 += 12;
          if (this.c != null) {
            b(this.c);
          }
        }
      }
      b(i1);
      long l1 = 0xFFFFFFFF & this.a.b();
      if (this.b == 0)
      {
        if (!a(1)) {
          if ((0x20 & this.l) == 0) {
            break label134;
          }
        }
        for (int i3 = 1;; i3 = 0)
        {
          if (i3 == 0) {
            break label138;
          }
          if (l1 <= 0L) {
            break;
          }
          a(1, l1);
          return;
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hxv
 * JD-Core Version:    0.7.0.1
 */