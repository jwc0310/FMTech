import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class hxs
{
  final hxq a;
  private final ByteBuffer b;
  private final List<hxt> c = new ArrayList();
  private final hxp d;
  private int e;
  
  protected hxs(ByteBuffer paramByteBuffer, hxp paramhxp)
  {
    this.b = paramByteBuffer;
    this.e = paramByteBuffer.position();
    this.d = paramhxp;
    try
    {
      hxn localhxn = new hxn(paramByteBuffer);
      hxv localhxv;
      hxp.a(localhxn);
    }
    finally
    {
      try
      {
        localhxv = new hxv(localhxn, 63, this.d);
        this.a = new hxq(localhxv.a.b.order());
        this.e += localhxv.i;
        this.b.position(0);
        hxp.a(localhxn);
        return;
      }
      finally {}
      localObject1 = finally;
      localhxn = null;
    }
    throw localObject1;
  }
  
  protected final boolean a()
  {
    for (;;)
    {
      try
      {
        localhxn1 = new hxn(this.b);
      }
      finally
      {
        hxn localhxn1;
        hyb[] arrayOfhyb;
        hxq localhxq1;
        hxq localhxq2;
        hxq localhxq3;
        hxq localhxq4;
        hxq localhxq5;
        hxv localhxv;
        int j;
        hyb localhyb6;
        hya localhya2;
        hya localhya3;
        int i9;
        int i10;
        short s;
        Iterator localIterator;
        hya localhya1;
        int i2;
        int i3;
        hxn localhxn2 = null;
        continue;
        int i = 0;
        continue;
        if (j == 6) {
          continue;
        }
        switch (j)
        {
        }
        hyb localhyb1 = null;
        continue;
        hyb localhyb2 = null;
        continue;
        hyb localhyb3 = null;
        continue;
        hyb localhyb4 = null;
        continue;
        hyb localhyb5 = null;
        continue;
        int k = 0;
        continue;
        continue;
        int i1 = 0;
        continue;
      }
      try
      {
        arrayOfhyb = new hyb[5];
        localhxq1 = this.a;
        if (!hya.a(0)) {
          continue;
        }
        localhyb1 = localhxq1.a[0];
        arrayOfhyb[0] = localhyb1;
        localhxq2 = this.a;
        if (!hya.a(1)) {
          continue;
        }
        localhyb2 = localhxq2.a[1];
        arrayOfhyb[1] = localhyb2;
        localhxq3 = this.a;
        if (!hya.a(2)) {
          continue;
        }
        localhyb3 = localhxq3.a[2];
        arrayOfhyb[2] = localhyb3;
        localhxq4 = this.a;
        if (!hya.a(3)) {
          continue;
        }
        localhyb4 = localhxq4.a[3];
        arrayOfhyb[3] = localhyb4;
        localhxq5 = this.a;
        if (!hya.a(4)) {
          continue;
        }
        localhyb5 = localhxq5.a[4];
        arrayOfhyb[4] = localhyb5;
        if (arrayOfhyb[0] == null) {
          continue;
        }
        i = 1;
        if (arrayOfhyb[1] != null) {
          i |= 0x2;
        }
        if (arrayOfhyb[2] != null) {
          i |= 0x4;
        }
        if (arrayOfhyb[4] != null) {
          i |= 0x8;
        }
        if (arrayOfhyb[3] != null) {
          i |= 0x10;
        }
        localhxv = new hxv(localhxn1, i, this.d);
        j = localhxv.a();
        localhyb6 = null;
      }
      finally
      {
        localhxn2 = localhxn1;
      }
      j = localhxv.a();
      continue;
      localhyb6 = arrayOfhyb[localhxv.b];
      if (localhyb6 == null)
      {
        localhxv.b();
        continue;
        hxp.a(localhxn2);
        throw localObject1;
        localhya2 = localhxv.c;
        localhya3 = localhyb6.a(localhya2.b);
        if (localhya3 != null)
        {
          if (localhya3.e == localhya2.e)
          {
            i9 = localhya3.c;
            i10 = localhya2.c;
            if (i9 == i10) {}
          }
          else
          {
            hxp.a(localhxn1);
            return false;
          }
          this.c.add(new hxt(localhya3, localhya2.h));
          s = localhya2.b;
          localhyb6.b.remove(Short.valueOf(s));
          if (localhyb6.b.size() == 0) {
            localhxv.b();
          }
        }
      }
    }
    while (k < 5)
    {
      hyb localhyb7 = arrayOfhyb[k];
      if (localhyb7 != null)
      {
        int m = localhyb7.b.size();
        if (m > 0)
        {
          hxp.a(localhxn1);
          return false;
        }
      }
      k++;
    }
    this.b.order(this.a.d);
    localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      hxt localhxt = (hxt)localIterator.next();
      localhya1 = localhxt.b;
      int n = localhxt.a;
      if (localhya1.g == null) {
        break label1103;
      }
      i1 = 1;
      if (i1 != 0)
      {
        if (Log.isLoggable("ExifModifier", 2))
        {
          String str3 = String.valueOf(localhya1);
          new StringBuilder(19 + String.valueOf(str3).length()).append("modifying tag to: \n").append(str3);
          new StringBuilder(22).append("at offset: ").append(n);
        }
        this.b.position(n + this.e);
        byte[] arrayOfByte2;
        int i8;
        String str1;
        switch (localhya1.c)
        {
        case 1: 
        case 7: 
          arrayOfByte2 = new byte[localhya1.e];
          i8 = arrayOfByte2.length;
          if ((localhya1.c != 7) && (localhya1.c != 1))
          {
            str1 = String.valueOf(hya.b(localhya1.c));
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
            byte[] arrayOfByte1 = (byte[])localhya1.g;
            if (arrayOfByte1.length == localhya1.e)
            {
              arrayOfByte1[(-1 + arrayOfByte1.length)] = 0;
              this.b.put(arrayOfByte1);
              break;
            }
            this.b.put(arrayOfByte1);
            this.b.put((byte)0);
            break;
            int i6 = localhya1.e;
            for (int i7 = 0; i7 < i6; i7++) {
              this.b.putInt((int)localhya1.b(i7));
            }
            int i4 = localhya1.e;
            for (int i5 = 0; i5 < i4; i5++)
            {
              hye localhye = localhya1.c(i5);
              this.b.putInt((int)localhye.a);
              this.b.putInt((int)localhye.b);
            }
          }
          System.arraycopy(localhya1.g, 0, arrayOfByte2, 0, Math.min(localhya1.e, i8));
          this.b.put(arrayOfByte2);
        }
      }
    }
    i2 = localhya1.e;
    for (i3 = 0; i3 < i2; i3++) {
      this.b.putShort((short)(int)localhya1.b(i3));
    }
    hxp.a(localhxn1);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hxs
 * JD-Core Version:    0.7.0.1
 */