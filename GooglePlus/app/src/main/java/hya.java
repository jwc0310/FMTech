import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public final class hya
{
  static final int[] a;
  private static final Charset i = Charset.forName("US-ASCII");
  final short b;
  final short c;
  boolean d;
  int e;
  int f;
  public Object g;
  int h;
  
  static
  {
    int[] arrayOfInt = new int[11];
    a = arrayOfInt;
    arrayOfInt[1] = 1;
    a[2] = 1;
    a[3] = 2;
    a[4] = 4;
    a[5] = 8;
    a[7] = 1;
    a[9] = 4;
    a[10] = 8;
    new SimpleDateFormat("yyyy:MM:dd kk:mm:ss");
  }
  
  public hya(short paramShort1, short paramShort2, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.b = paramShort1;
    this.c = paramShort2;
    this.e = paramInt1;
    this.d = paramBoolean;
    this.f = paramInt2;
    this.g = null;
  }
  
  public static boolean a(int paramInt)
  {
    return (paramInt == 0) || (paramInt == 1) || (paramInt == 2) || (paramInt == 3) || (paramInt == 4);
  }
  
  public static boolean a(short paramShort)
  {
    return (paramShort == 1) || (paramShort == 2) || (paramShort == 3) || (paramShort == 4) || (paramShort == 5) || (paramShort == 7) || (paramShort == 9) || (paramShort == 10);
  }
  
  static String b(short paramShort)
  {
    switch (paramShort)
    {
    case 6: 
    case 8: 
    default: 
      return "";
    case 1: 
      return "UNSIGNED_BYTE";
    case 2: 
      return "ASCII";
    case 3: 
      return "UNSIGNED_SHORT";
    case 4: 
      return "UNSIGNED_LONG";
    case 5: 
      return "UNSIGNED_RATIONAL";
    case 7: 
      return "UNDEFINED";
    case 9: 
      return "LONG";
    }
    return "RATIONAL";
  }
  
  public final String a()
  {
    if (this.g == null) {}
    do
    {
      return null;
      if ((this.g instanceof String)) {
        return (String)this.g;
      }
    } while (!(this.g instanceof byte[]));
    byte[] arrayOfByte = (byte[])this.g;
    if ((arrayOfByte.length > 0) && (arrayOfByte[(-1 + arrayOfByte.length)] == 0)) {
      return new String(arrayOfByte, 0, -1 + arrayOfByte.length, i);
    }
    return new String(arrayOfByte, i);
  }
  
  public final boolean a(Object paramObject)
  {
    int j = 0;
    if (paramObject == null) {}
    do
    {
      return false;
      if ((paramObject instanceof Short)) {
        return a(new int[] { 0xFFFF & ((Short)paramObject).shortValue() });
      }
      if ((paramObject instanceof String)) {
        return a((String)paramObject);
      }
      if ((paramObject instanceof int[])) {
        return a((int[])paramObject);
      }
      if ((paramObject instanceof long[])) {
        return a((long[])paramObject);
      }
      if ((paramObject instanceof hye)) {
        return a(new hye[] { (hye)paramObject });
      }
      if ((paramObject instanceof hye[])) {
        return a((hye[])paramObject);
      }
      if ((paramObject instanceof byte[])) {
        return a((byte[])paramObject);
      }
      if ((paramObject instanceof Integer)) {
        return a(new int[] { ((Integer)paramObject).intValue() });
      }
      if ((paramObject instanceof Long)) {
        return a(new long[] { ((Long)paramObject).longValue() });
      }
      if ((paramObject instanceof Byte)) {
        return a(new byte[] { ((Byte)paramObject).byteValue() });
      }
      if ((paramObject instanceof Short[]))
      {
        Short[] arrayOfShort = (Short[])paramObject;
        int[] arrayOfInt2 = new int[arrayOfShort.length];
        int i2 = 0;
        if (i2 < arrayOfShort.length)
        {
          if (arrayOfShort[i2] == null) {}
          for (int i3 = 0;; i3 = 0xFFFF & arrayOfShort[i2].shortValue())
          {
            arrayOfInt2[i2] = i3;
            i2++;
            break;
          }
        }
        return a(arrayOfInt2);
      }
      if ((paramObject instanceof Integer[]))
      {
        Integer[] arrayOfInteger = (Integer[])paramObject;
        int[] arrayOfInt1 = new int[arrayOfInteger.length];
        int n = 0;
        if (n < arrayOfInteger.length)
        {
          if (arrayOfInteger[n] == null) {}
          for (int i1 = 0;; i1 = arrayOfInteger[n].intValue())
          {
            arrayOfInt1[n] = i1;
            n++;
            break;
          }
        }
        return a(arrayOfInt1);
      }
      if ((paramObject instanceof Long[]))
      {
        Long[] arrayOfLong = (Long[])paramObject;
        long[] arrayOfLong1 = new long[arrayOfLong.length];
        if (j < arrayOfLong.length)
        {
          if (arrayOfLong[j] == null) {}
          for (long l = 0L;; l = arrayOfLong[j].longValue())
          {
            arrayOfLong1[j] = l;
            j++;
            break;
          }
        }
        return a(arrayOfLong1);
      }
    } while (!(paramObject instanceof Byte[]));
    Byte[] arrayOfByte = (Byte[])paramObject;
    byte[] arrayOfByte1 = new byte[arrayOfByte.length];
    int k = 0;
    if (k < arrayOfByte.length)
    {
      if (arrayOfByte[k] == null) {}
      for (int m = 0;; m = arrayOfByte[k].byteValue())
      {
        arrayOfByte1[k] = m;
        k++;
        break;
      }
    }
    return a(arrayOfByte1);
  }
  
  public final boolean a(String paramString)
  {
    if ((this.c != 2) && (this.c != 7)) {
      return false;
    }
    byte[] arrayOfByte = paramString.getBytes(i);
    if (arrayOfByte.length > 0) {
      if ((this.c == 2) && (arrayOfByte[(-1 + arrayOfByte.length)] != 0))
      {
        if ((!this.d) || (arrayOfByte.length != this.e)) {
          break label85;
        }
        arrayOfByte[(-1 + arrayOfByte.length)] = 0;
      }
    }
    int j;
    for (;;)
    {
      j = arrayOfByte.length;
      if (!d(j)) {
        break;
      }
      return false;
      label85:
      arrayOfByte = Arrays.copyOf(arrayOfByte, 1 + arrayOfByte.length);
      continue;
      if ((this.c == 2) && (this.e == 1)) {
        arrayOfByte = new byte[] { 0 };
      }
    }
    this.e = j;
    this.g = arrayOfByte;
    return true;
  }
  
  public final boolean a(byte[] paramArrayOfByte)
  {
    int j = paramArrayOfByte.length;
    if (d(j)) {}
    while ((this.c != 1) && (this.c != 7)) {
      return false;
    }
    this.g = new byte[j];
    System.arraycopy(paramArrayOfByte, 0, this.g, 0, j);
    this.e = j;
    return true;
  }
  
  public final boolean a(int[] paramArrayOfInt)
  {
    int j = 0;
    if (d(paramArrayOfInt.length)) {}
    label53:
    label81:
    label101:
    long[] arrayOfLong;
    label153:
    label157:
    label159:
    label165:
    label169:
    for (;;)
    {
      return false;
      if ((this.c == 3) || (this.c == 9) || (this.c == 4))
      {
        int i2;
        int i3;
        int m;
        if (this.c == 3)
        {
          int i1 = paramArrayOfInt.length;
          i2 = 0;
          if (i2 >= i1) {
            break label153;
          }
          int i4 = paramArrayOfInt[i2];
          if ((i4 > 65535) || (i4 < 0))
          {
            i3 = 1;
            if (i3 != 0) {
              break label157;
            }
          }
        }
        else if (this.c == 4)
        {
          int k = paramArrayOfInt.length;
          m = 0;
          if (m >= k) {
            break label165;
          }
          if (paramArrayOfInt[m] >= 0) {
            break label159;
          }
        }
        for (int n = 1;; n = 0)
        {
          if (n != 0) {
            break label169;
          }
          arrayOfLong = new long[paramArrayOfInt.length];
          while (j < paramArrayOfInt.length)
          {
            arrayOfLong[j] = paramArrayOfInt[j];
            j++;
          }
          i2++;
          break label53;
          i3 = 0;
          break label81;
          break;
          m++;
          break label101;
        }
      }
    }
    this.g = arrayOfLong;
    this.e = paramArrayOfInt.length;
    return true;
  }
  
  public final boolean a(long[] paramArrayOfLong)
  {
    if ((d(paramArrayOfLong.length)) || (this.c != 4)) {}
    label81:
    for (;;)
    {
      return false;
      int j = paramArrayOfLong.length;
      int k = 0;
      if (k < j)
      {
        long l = paramArrayOfLong[k];
        if ((l >= 0L) && (l <= 4294967295L)) {}
      }
      for (int m = 1;; m = 0)
      {
        if (m != 0) {
          break label81;
        }
        this.g = paramArrayOfLong;
        this.e = paramArrayOfLong.length;
        return true;
        k++;
        break;
      }
    }
  }
  
  public final boolean a(hye[] paramArrayOfhye)
  {
    if (d(paramArrayOfhye.length)) {}
    label43:
    label207:
    label211:
    label213:
    label219:
    label223:
    for (;;)
    {
      return false;
      if ((this.c == 5) || (this.c == 10))
      {
        int i1;
        int i2;
        label103:
        int k;
        if (this.c == 5)
        {
          int n = paramArrayOfhye.length;
          i1 = 0;
          if (i1 >= n) {
            break label207;
          }
          hye localhye2 = paramArrayOfhye[i1];
          if ((localhye2.a < 0L) || (localhye2.b < 0L) || (localhye2.a > 4294967295L) || (localhye2.b > 4294967295L))
          {
            i2 = 1;
            if (i2 != 0) {
              break label211;
            }
          }
        }
        else if (this.c == 10)
        {
          int j = paramArrayOfhye.length;
          k = 0;
          label122:
          if (k >= j) {
            break label219;
          }
          hye localhye1 = paramArrayOfhye[k];
          if ((localhye1.a >= -2147483648L) && (localhye1.b >= -2147483648L) && (localhye1.a <= 2147483647L) && (localhye1.b <= 2147483647L)) {
            break label213;
          }
        }
        for (int m = 1;; m = 0)
        {
          if (m != 0) {
            break label223;
          }
          this.g = paramArrayOfhye;
          this.e = paramArrayOfhye.length;
          return true;
          i1++;
          break label43;
          i2 = 0;
          break label103;
          break;
          k++;
          break label122;
        }
      }
    }
  }
  
  protected final long b(int paramInt)
  {
    if ((this.g instanceof long[])) {
      return ((long[])this.g)[paramInt];
    }
    if ((this.g instanceof byte[])) {
      return ((byte[])this.g)[paramInt];
    }
    String str1 = String.valueOf(b(this.c));
    if (str1.length() != 0) {}
    for (String str2 = "Cannot get integer value from ".concat(str1);; str2 = new String("Cannot get integer value from ")) {
      throw new IllegalArgumentException(str2);
    }
  }
  
  public final int[] b()
  {
    if (this.g == null) {}
    while (!(this.g instanceof long[])) {
      return null;
    }
    long[] arrayOfLong = (long[])this.g;
    int[] arrayOfInt = new int[arrayOfLong.length];
    for (int j = 0; j < arrayOfLong.length; j++) {
      arrayOfInt[j] = ((int)arrayOfLong[j]);
    }
    return arrayOfInt;
  }
  
  protected final hye c(int paramInt)
  {
    if ((this.c != 10) && (this.c != 5))
    {
      String str1 = String.valueOf(b(this.c));
      if (str1.length() != 0) {}
      for (String str2 = "Cannot get RATIONAL value from ".concat(str1);; str2 = new String("Cannot get RATIONAL value from ")) {
        throw new IllegalArgumentException(str2);
      }
    }
    return ((hye[])this.g)[paramInt];
  }
  
  final boolean d(int paramInt)
  {
    return (this.d) && (this.e != paramInt);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    hya localhya;
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
              do
              {
                do
                {
                  return false;
                } while (!(paramObject instanceof hya));
                localhya = (hya)paramObject;
              } while ((localhya.b != this.b) || (localhya.e != this.e) || (localhya.c != this.c));
              if (this.g == null) {
                break;
              }
            } while (localhya.g == null);
            if (!(this.g instanceof long[])) {
              break;
            }
          } while (!(localhya.g instanceof long[]));
          return Arrays.equals((long[])this.g, (long[])localhya.g);
          if (!(this.g instanceof hye[])) {
            break;
          }
        } while (!(localhya.g instanceof hye[]));
        return Arrays.equals((hye[])this.g, (hye[])localhya.g);
        if (!(this.g instanceof byte[])) {
          break;
        }
      } while (!(localhya.g instanceof byte[]));
      return Arrays.equals((byte[])this.g, (byte[])localhya.g);
      return this.g.equals(localhya.g);
    } while (localhya.g != null);
    return true;
  }
  
  public final int hashCode()
  {
    int j = 31 * (31 * (31 * (527 + this.b) + this.e) + this.c);
    if (this.g == null) {}
    for (int k = 0;; k = this.g.hashCode()) {
      return k + j;
    }
  }
  
  public final String toString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Short.valueOf(this.b);
    String str1 = String.valueOf(String.format("tag id: %04X\n", arrayOfObject));
    int j = this.f;
    String str2 = String.valueOf(b(this.c));
    int k = this.e;
    int m = this.h;
    String str3;
    if (this.g == null) {
      str3 = "";
    }
    for (;;)
    {
      String str4 = String.valueOf(str3);
      return 74 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str4).length() + str1 + "ifd id: " + j + "\ntype: " + str2 + "\ncount: " + k + "\noffset: " + m + "\nvalue: " + str4 + "\n";
      if ((this.g instanceof byte[]))
      {
        if (this.c == 2) {
          str3 = a();
        } else {
          str3 = Arrays.toString((byte[])this.g);
        }
      }
      else if ((this.g instanceof long[]))
      {
        if (((long[])this.g).length == 1) {
          str3 = String.valueOf(((long[])this.g)[0]);
        } else {
          str3 = Arrays.toString((long[])this.g);
        }
      }
      else if ((this.g instanceof Object[]))
      {
        if (((Object[])this.g).length == 1)
        {
          Object localObject = ((Object[])this.g)[0];
          if (localObject == null) {
            str3 = "";
          } else {
            str3 = localObject.toString();
          }
        }
        else
        {
          str3 = Arrays.toString((Object[])this.g);
        }
      }
      else {
        str3 = this.g.toString();
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hya
 * JD-Core Version:    0.7.0.1
 */