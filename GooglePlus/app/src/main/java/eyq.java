import java.util.Arrays;

public final class eyq
  extends eyf<eyq>
{
  public long c = 0L;
  public long d = 0L;
  public int e = 0;
  public byte[] f = eym.e;
  public long g = 180000L;
  public byte[] h = eym.e;
  private String i = "";
  private int j = 0;
  private boolean k = false;
  private eyr[] l = eyr.d();
  private eyo m = null;
  private byte[] n = eym.e;
  private byte[] o = eym.e;
  private eyn p = null;
  private String q = "";
  private eyp r = null;
  private int s = 0;
  private int[] t = eym.a;
  
  public eyq()
  {
    this.a = null;
    this.b = -1;
  }
  
  protected final int a()
  {
    int i1 = 0;
    int i2 = super.a();
    if (this.c != 0L) {
      i2 += eyd.b(1, this.c);
    }
    if (!this.i.equals("")) {
      i2 += eyd.b(2, this.i);
    }
    if ((this.l != null) && (this.l.length > 0))
    {
      int i9 = i2;
      for (int i10 = 0; i10 < this.l.length; i10++)
      {
        eyr localeyr = this.l[i10];
        if (localeyr != null)
        {
          int i11 = eyd.b(24);
          int i12 = localeyr.a();
          localeyr.b = i12;
          i9 += i11 + (i12 + eyd.b(i12));
        }
      }
      i2 = i9;
    }
    if (!Arrays.equals(this.f, eym.e)) {
      i2 += eyd.b(6, this.f);
    }
    if (!Arrays.equals(this.n, eym.e)) {
      i2 += eyd.b(8, this.n);
    }
    int i8;
    int i3;
    label382:
    int i4;
    if (this.e != 0)
    {
      int i6 = this.e;
      int i7 = eyd.b(88);
      if (i6 >= 0)
      {
        i8 = eyd.b(i6);
        i2 += i8 + i7;
      }
    }
    else
    {
      if (!Arrays.equals(this.o, eym.e)) {
        i2 += eyd.b(13, this.o);
      }
      if (!this.q.equals("")) {
        i2 += eyd.b(14, this.q);
      }
      if (this.g != 180000L)
      {
        long l1 = this.g;
        i2 += eyd.b(120) + eyd.b(l1 << 1 ^ l1 >> 63);
      }
      if (this.d != 0L) {
        i2 += eyd.b(17, this.d);
      }
      if (!Arrays.equals(this.h, eym.e)) {
        i2 += eyd.b(18, this.h);
      }
      if ((this.t == null) || (this.t.length <= 0)) {
        return i2;
      }
      i3 = 0;
      if (i1 >= this.t.length) {
        break label436;
      }
      i4 = this.t[i1];
      if (i4 < 0) {
        break label429;
      }
    }
    label429:
    for (int i5 = eyd.b(i4);; i5 = 10)
    {
      i3 += i5;
      i1++;
      break label382;
      i8 = 10;
      break;
    }
    label436:
    i2 = i2 + i3 + 2 * this.t.length;
    return i2;
  }
  
  public final void a(eyd parameyd)
  {
    if (this.c != 0L) {
      parameyd.a(1, this.c);
    }
    if (!this.i.equals("")) {
      parameyd.a(2, this.i);
    }
    if ((this.l != null) && (this.l.length > 0)) {
      for (int i3 = 0; i3 < this.l.length; i3++)
      {
        eyr localeyr = this.l[i3];
        if (localeyr != null)
        {
          parameyd.a(26);
          if (localeyr.b < 0) {
            localeyr.b = localeyr.a();
          }
          parameyd.a(localeyr.b);
          localeyr.a(parameyd);
        }
      }
    }
    if (!Arrays.equals(this.f, eym.e)) {
      parameyd.a(6, this.f);
    }
    if (!Arrays.equals(this.n, eym.e)) {
      parameyd.a(8, this.n);
    }
    if (this.e != 0) {
      parameyd.a(11, this.e);
    }
    if (!Arrays.equals(this.o, eym.e)) {
      parameyd.a(13, this.o);
    }
    if (!this.q.equals("")) {
      parameyd.a(14, this.q);
    }
    if (this.g != 180000L)
    {
      long l1 = this.g;
      parameyd.a(120);
      parameyd.a(l1 << 1 ^ l1 >> 63);
    }
    if (this.d != 0L) {
      parameyd.a(17, this.d);
    }
    if (!Arrays.equals(this.h, eym.e)) {
      parameyd.a(18, this.h);
    }
    if (this.t != null)
    {
      int i1 = this.t.length;
      int i2 = 0;
      if (i1 > 0) {
        while (i2 < this.t.length)
        {
          parameyd.a(20, this.t[i2]);
          i2++;
        }
      }
    }
    super.a(parameyd);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this) {
      bool2 = true;
    }
    eyq localeyq;
    label85:
    do
    {
      boolean bool8;
      do
      {
        boolean bool7;
        do
        {
          boolean bool6;
          do
          {
            boolean bool5;
            do
            {
              int i1;
              int i2;
              do
              {
                String str2;
                do
                {
                  boolean bool4;
                  do
                  {
                    boolean bool3;
                    do
                    {
                      boolean bool1;
                      do
                      {
                        return bool2;
                        bool1 = paramObject instanceof eyq;
                        bool2 = false;
                      } while (!bool1);
                      localeyq = (eyq)paramObject;
                      bool3 = this.c < localeyq.c;
                      bool2 = false;
                    } while (bool3);
                    bool4 = this.d < localeyq.d;
                    bool2 = false;
                  } while (bool4);
                  if (this.i != null) {
                    break;
                  }
                  str2 = localeyq.i;
                  bool2 = false;
                } while (str2 != null);
                i1 = this.e;
                i2 = localeyq.e;
                bool2 = false;
              } while (i1 != i2);
              bool5 = eyj.a(this.l, localeyq.l);
              bool2 = false;
            } while (!bool5);
            bool6 = Arrays.equals(this.f, localeyq.f);
            bool2 = false;
          } while (!bool6);
          bool7 = Arrays.equals(this.n, localeyq.n);
          bool2 = false;
        } while (!bool7);
        bool8 = Arrays.equals(this.o, localeyq.o);
        bool2 = false;
      } while (!bool8);
      if (this.q != null) {
        break label297;
      }
      str1 = localeyq.q;
      bool2 = false;
    } while (str1 != null);
    label297:
    while (this.q.equals(localeyq.q))
    {
      String str1;
      boolean bool9 = this.g < localeyq.g;
      bool2 = false;
      if (bool9) {
        break;
      }
      boolean bool10 = Arrays.equals(this.h, localeyq.h);
      bool2 = false;
      if (!bool10) {
        break;
      }
      boolean bool11 = eyj.a(this.t, localeyq.t);
      bool2 = false;
      if (!bool11) {
        break;
      }
      return a(localeyq);
      if (this.i.equals(localeyq.i)) {
        break label85;
      }
      return false;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i1 = 31 * (31 * (527 + (int)(this.c ^ this.c >>> 32)) + (int)(this.d ^ this.d >>> 32));
    int i2;
    int i3;
    int i4;
    if (this.i == null)
    {
      i2 = 0;
      i3 = 31 * (31 * (31 * (31 * (31 * (31 * (31 * (1237 + 31 * (31 * (31 * (i2 + i1) + this.e))) + eyj.a(this.l))) + Arrays.hashCode(this.f)) + Arrays.hashCode(this.n)) + Arrays.hashCode(this.o)));
      String str = this.q;
      i4 = 0;
      if (str != null) {
        break label205;
      }
    }
    for (;;)
    {
      return 31 * (31 * (31 * (31 * (31 * (31 * (i3 + i4) + (int)(this.g ^ this.g >>> 32))) + Arrays.hashCode(this.h))) + eyj.a(this.t)) + b();
      i2 = this.i.hashCode();
      break;
      label205:
      i4 = this.q.hashCode();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eyq
 * JD-Core Version:    0.7.0.1
 */