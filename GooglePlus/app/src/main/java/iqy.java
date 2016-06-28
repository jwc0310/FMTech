import android.graphics.RectF;

final class iqy
{
  private static final char[] a = "http://".toCharArray();
  private static final char[] b = "https://".toCharArray();
  private static final char[] c = "lh".toCharArray();
  private static final char[] d = "ap".toCharArray();
  private static final char[] e = "sp".toCharArray();
  private static final char[] f = "bp".toCharArray();
  private static final char[] g = ".googleusercontent.com/".toCharArray();
  private static final char[] h = "www.google.com/visualsearch/lh/".toCharArray();
  private static final char[] i = ".google.com/".toCharArray();
  private static final char[] j = ".blogger.com/".toCharArray();
  private static final char[] k = ".bp.blogspot.com/".toCharArray();
  private static final char[] l = ".ggpht.com/".toCharArray();
  private static final char[] m = "public".toCharArray();
  private static final char[] n = "proxy".toCharArray();
  private static final char[] o = "image".toCharArray();
  private static final char[] p = "%3D".toCharArray();
  private static final char[] q = "%3d".toCharArray();
  private static final char[][] r = { { 'O' }, { 'J' }, { 85, 116 }, { 'U' }, { 'I' } };
  private boolean A;
  private boolean B;
  private boolean C;
  private boolean D = true;
  private int E;
  private int F;
  private int G;
  private int[] H = new int[8];
  private int[] I = new int[8];
  private char[] s = new char[2000];
  private int t;
  private int u;
  private int v;
  private int w;
  private int x;
  private boolean y;
  private boolean z;
  
  private static String a(float paramFloat)
  {
    if ((paramFloat < 0.0F) || (paramFloat > 1.0F)) {
      throw new IllegalArgumentException("Cropping requires values between 0 and 1");
    }
    String str1 = String.valueOf(Integer.toHexString((int)Math.floor(65535.0F * paramFloat)));
    if (str1.length() != 0) {}
    for (String str2 = "0000".concat(str1);; str2 = new String("0000")) {
      return str2.substring(-4 + str2.length(), str2.length());
    }
  }
  
  private final void a(StringBuilder paramStringBuilder)
  {
    int i1 = this.w;
    int i2 = this.w + this.E;
    int i3;
    label23:
    char[] arrayOfChar1;
    int i4;
    int i5;
    label46:
    int i6;
    int i9;
    if (i1 < i2)
    {
      i3 = 0;
      if (i3 < r.length)
      {
        arrayOfChar1 = r[i3];
        i4 = 0;
        i5 = i1;
        if ((i4 >= arrayOfChar1.length) || (i5 >= i2)) {
          break label203;
        }
        i6 = i4 + 1;
        int i8 = arrayOfChar1[i4];
        char[] arrayOfChar2 = this.s;
        i9 = i5 + 1;
        if (i8 == arrayOfChar2[i5]) {
          break label192;
        }
        i5 = i9;
      }
    }
    for (int i7 = 0;; i7 = 1)
    {
      if ((i7 != 0) && ((i6 != arrayOfChar1.length) || ((i5 != i2) && (this.s[i5] != '-')))) {
        i7 = 0;
      }
      if (i7 != 0)
      {
        paramStringBuilder.append(r[i3]).append('-');
        while ((i1 < i2) && (this.s[i1] != '-')) {
          i1++;
        }
      }
      i3++;
      break label23;
      i1++;
      break;
      return;
      label192:
      i5 = i9;
      i4 = i6;
      break label46;
      label203:
      i6 = i4;
    }
  }
  
  private final boolean a(int paramInt, char[] paramArrayOfChar)
  {
    int i1 = paramArrayOfChar.length;
    if (paramInt + i1 > this.t) {
      return false;
    }
    for (int i2 = 0;; i2++)
    {
      if (i2 >= i1) {
        break label46;
      }
      if (this.s[(paramInt + i2)] != paramArrayOfChar[i2]) {
        break;
      }
    }
    label46:
    return true;
  }
  
  private final boolean a(char[] paramArrayOfChar)
  {
    int i1 = this.u;
    int i2 = paramArrayOfChar.length;
    if (i1 + i2 > this.t) {
      return false;
    }
    int i3 = i1;
    int i4 = 0;
    for (;;)
    {
      if (i4 >= i2) {
        break label77;
      }
      char[] arrayOfChar = this.s;
      int i5 = i3 + 1;
      int i6 = arrayOfChar[i3];
      int i7 = i4 + 1;
      if (i6 != paramArrayOfChar[i4]) {
        break;
      }
      i4 = i7;
      i3 = i5;
    }
    label77:
    this.u = i3;
    return true;
  }
  
  private final int b(int paramInt, char[] paramArrayOfChar)
  {
    int i1 = paramArrayOfChar.length;
    int i2 = this.t - i1;
    for (int i3 = paramInt; i3 <= i2; i3++) {
      for (int i4 = 0;; i4++)
      {
        if (i4 >= i1) {
          break label62;
        }
        if (this.s[(i3 + i4)] != paramArrayOfChar[i4]) {
          break;
        }
      }
    }
    i3 = -1;
    label62:
    return i3;
  }
  
  private final void b(String paramString)
  {
    this.t = paramString.length();
    if (this.t >= 2000)
    {
      this.D = false;
      return;
    }
    paramString.getChars(0, this.t, this.s, 0);
    this.u = 0;
    this.A = false;
    this.B = false;
    this.C = false;
    boolean bool;
    if ((!a(a)) && (!a(b))) {
      bool = false;
    }
    for (;;)
    {
      this.y = bool;
      if (this.y) {
        break;
      }
      this.D = false;
      return;
      this.v = this.u;
      if (a(c))
      {
        this.A = true;
        if ((this.s[this.u] >= '3') && (this.s[this.u] <= '6'))
        {
          this.u = (1 + this.u);
          if ((this.s[this.u] == '-') && (this.s[(1 + this.u)] == 'd'))
          {
            this.z = true;
            this.u = (2 + this.u);
            if (((this.s[this.u] >= 'a') && (this.s[this.u] <= 'g')) || (this.s[this.u] == 'z'))
            {
              this.u = (1 + this.u);
              if (!a(g)) {
                bool = false;
              }
            }
            else
            {
              bool = false;
            }
          }
          else if ((this.s[this.u] == '-') && (this.s[(1 + this.u)] == 't') && (this.s[(2 + this.u)] == 't'))
          {
            this.z = true;
            this.u = (3 + this.u);
            if (!a(g)) {
              bool = false;
            }
          }
          else
          {
            if (!a(i)) {
              break label382;
            }
            this.B = true;
          }
        }
      }
      label382:
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
                  this.F = (-1 + this.u);
                  bool = true;
                  break;
                } while ((a(g)) || (a(l)));
                bool = false;
                break;
                bool = false;
                break;
                if (!a(e)) {
                  break label495;
                }
                this.A = true;
                if ((this.s[this.u] < '1') || (this.s[this.u] > '3')) {
                  break label490;
                }
                this.u = (1 + this.u);
              } while ((a(g)) || (a(l)));
              bool = false;
              break;
              bool = false;
              break;
              if (!a(d)) {
                break label564;
              }
              this.A = true;
              if (this.s[this.u] != '2') {
                break label559;
              }
              this.u = (1 + this.u);
            } while ((a(g)) || (a(l)));
            bool = false;
            break;
            bool = false;
            break;
            this.A = false;
            if (!a(f)) {
              break label637;
            }
            if ((this.s[this.u] < '0') || (this.s[this.u] > '3')) {
              break label632;
            }
            this.u = (1 + this.u);
          } while (a(j));
          bool = false;
          break;
          bool = false;
          break;
        } while (a(h));
        if ((this.s[this.u] < '1') || (this.s[this.u] > '4')) {
          break label700;
        }
        this.u = (1 + this.u);
      } while (a(k));
      label490:
      label495:
      label632:
      label637:
      bool = false;
      label559:
      label564:
      continue;
      label700:
      bool = false;
    }
    int i1 = this.u;
    int i2 = this.u;
    this.G = 0;
    if ((i1 == this.t) || (this.s[i1] == '/'))
    {
      if ((i1 != i2) || (i1 == this.t)) {
        break label773;
      }
      i2 = i1 + 1;
    }
    for (;;)
    {
      if (i1 == this.t) {
        break label830;
      }
      i1++;
      break;
      label773:
      if (this.G >= 8)
      {
        this.D = false;
        return;
      }
      this.H[this.G] = i2;
      this.I[this.G] = (i1 - i2);
      i2 = i1 + 1;
      this.G = (1 + this.G);
    }
    label830:
    if ((this.G > 1) && (this.I[0] == o.length) && (a(this.H[0], o))) {}
    for (int i3 = 1;; i3 = 0)
    {
      if ((i3 == 0) && (this.G == 5))
      {
        this.w = this.H[4];
        this.E = 0;
      }
      for (int i4 = 1;; i4 = 0)
      {
        if (i4 == 0) {
          break label1029;
        }
        this.C = true;
        this.D = true;
        return;
        if ((i3 != 0) && (this.G == 6))
        {
          this.w = this.H[5];
          this.E = 0;
          break;
        }
        if ((i3 == 0) && (this.G == 6))
        {
          this.w = this.H[4];
          this.E = this.I[4];
          break;
        }
        if ((i3 != 0) && (this.G == 7))
        {
          this.w = this.H[5];
          this.E = this.I[5];
          break;
        }
      }
      label1029:
      if ((this.G > 1) && (((this.I[0] == m.length) && (a(this.H[0], m))) || ((this.I[0] == n.length) && (a(this.H[0], n))))) {}
      for (int i5 = 1;; i5 = 0)
      {
        int i7;
        int i8;
        int i9;
        if ((i5 == 0) && (this.G == 1))
        {
          i7 = this.H[0];
          i8 = this.I[0];
          i9 = i7;
          label1131:
          if (i9 >= this.t) {
            break label1261;
          }
          if (this.s[i9] != '=') {
            break label1255;
          }
          label1152:
          this.x = i9;
          if (this.x == -1) {
            break label1267;
          }
          this.w = (1 + this.x);
          label1176:
          if (this.x == -1) {
            break label1322;
          }
        }
        for (this.E = (i8 - (this.w - i7));; this.E = 0)
        {
          for (int i6 = 1;; i6 = 0)
          {
            if (i6 == 0) {
              break label1347;
            }
            this.C = false;
            this.D = true;
            return;
            if ((i5 != 0) && (this.G == 2))
            {
              i7 = this.H[1];
              i8 = this.I[1];
              break;
            }
          }
          label1255:
          i9++;
          break label1131;
          label1261:
          i9 = -1;
          break label1152;
          label1267:
          this.x = b(i7, p);
          if (this.x == -1) {
            this.x = b(i7, q);
          }
          if (this.x == -1) {
            break label1176;
          }
          this.w = (3 + this.x);
          break label1176;
          label1322:
          this.x = (i8 + i7);
          this.w = this.x;
        }
        label1347:
        this.D = false;
        return;
      }
    }
  }
  
  private final void b(StringBuilder paramStringBuilder)
  {
    int i1 = this.w;
    int i2 = this.w + this.E;
    while (i1 < i2)
    {
      int i3;
      if (this.s[i1] == 'f') {
        i3 = 1;
      }
      while ((i1 < i2) && (this.s[i1] != '-'))
      {
        if (i3 != 0) {
          paramStringBuilder.append(this.s[i1]);
        }
        i1++;
        continue;
        i3 = 0;
      }
      if (i3 != 0) {
        paramStringBuilder.append('-');
      }
      i1++;
    }
  }
  
  final String a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, RectF paramRectF, int paramInt7, int paramInt8)
  {
    for (;;)
    {
      String str;
      StringBuilder localStringBuilder;
      int i1;
      try
      {
        b(paramString);
        boolean bool1 = this.D;
        if (!bool1)
        {
          str = null;
          return str;
        }
        localStringBuilder = new StringBuilder(50 + this.t);
        if ((paramInt1 & 0x2000) == 0) {
          break label916;
        }
        i1 = 1;
      }
      finally {}
      boolean bool2 = this.A;
      int i3 = 0;
      if (bool2) {
        if ((paramInt7 <= 0) && (i1 == 0))
        {
          i3 = 0;
          if (i2 == 0) {}
        }
        else
        {
          localStringBuilder.append(this.s, 0, this.v);
          if ((this.B) || (i2 == 0) || (this.z)) {
            continue;
          }
          localStringBuilder.append(e);
          localStringBuilder.append((char)(49 + paramInt7 % 3));
          int i5 = 3 + this.v;
          localStringBuilder.append(this.s, i5, this.F - i5);
          i3 = this.F;
        }
      }
      if (this.C)
      {
        localStringBuilder.append(this.s, i3, this.w - i3);
        int i4 = localStringBuilder.length();
        if ((paramInt2 != 0) || ((paramInt3 == 0) && (paramInt4 == 0))) {
          localStringBuilder.append('s').append(paramInt2).append('-');
        }
        if (paramInt3 != 0) {
          localStringBuilder.append('w').append(paramInt3).append('-');
        }
        if (paramInt4 != 0) {
          localStringBuilder.append('h').append(paramInt4).append('-');
        }
        if ((paramInt1 & 0x20) != 0) {
          localStringBuilder.append("rw-");
        }
        if ((paramInt1 & 0x4000) != 0) {
          localStringBuilder.append("rwa-");
        }
        if ((paramInt1 & 0x1) != 0) {
          localStringBuilder.append("c-");
        }
        if ((paramInt1 & 0x2) != 0) {
          localStringBuilder.append("d-");
        }
        if ((paramInt1 & 0x10) != 0) {
          localStringBuilder.append("k-");
        }
        if ((paramInt1 & 0x4) != 0) {
          localStringBuilder.append("no-");
        }
        if ((paramInt1 & 0x40) != 0) {
          localStringBuilder.append("nu-");
        }
        if ((paramInt1 & 0x8) != 0) {
          localStringBuilder.append("p-");
        }
        if ((paramInt1 & 0x1000) != 0) {
          localStringBuilder.append("lf-");
        }
        if ((paramInt1 & 0x100) != 0) {
          localStringBuilder.append("fSoften=0,25,0-");
        }
        if ((paramInt1 & 0x200) != 0) {
          localStringBuilder.append("ip-");
        }
        if ((paramInt1 & 0x800) != 0) {
          localStringBuilder.append("rj-");
        }
        if ((0x8000 & paramInt1) != 0) {
          localStringBuilder.append("fBoxBlur=2,24,24-");
        }
        if ((0x10000 & paramInt1) != 0) {
          localStringBuilder.append("al-");
        }
        if ((0x20000 & paramInt1) != 0)
        {
          localStringBuilder.append("rh-");
          break label878;
          localStringBuilder.append(paramInt6).append('-');
          label542:
          if (((paramInt1 & 0x400) != 0) && (paramRectF != null))
          {
            localStringBuilder.append("fcrop64=1,");
            localStringBuilder.append(a(paramRectF.left));
            localStringBuilder.append(a(paramRectF.top));
            localStringBuilder.append(a(paramRectF.right));
            localStringBuilder.append(a(paramRectF.bottom));
            localStringBuilder.append('-');
          }
          if (paramInt8 >= 0) {
            localStringBuilder.append('a').append(paramInt8).append('-');
          }
          a(localStringBuilder);
          b(localStringBuilder);
          if (localStringBuilder.length() > i4) {
            localStringBuilder.setLength(-1 + localStringBuilder.length());
          }
          if ((this.C) && (this.E == 0)) {
            localStringBuilder.append('/');
          }
          localStringBuilder.append(this.s, this.w + this.E, this.t - (this.w + this.E));
          str = localStringBuilder.toString();
          continue;
          if ((i1 != 0) && (!this.z))
          {
            localStringBuilder.append(d).append('2');
            continue;
          }
          localStringBuilder.append(c);
          localStringBuilder.append((char)(51 + paramInt7 % 4));
          continue;
        }
      }
      else
      {
        localStringBuilder.append(this.s, i3, this.x - i3);
        localStringBuilder.append('=');
        continue;
        localStringBuilder.append('v');
        continue;
        localStringBuilder.append('l');
        continue;
      }
      for (;;)
      {
        if ((paramInt1 & 0x80) == 0) {
          break label922;
        }
        i2 = 1;
        break;
        label878:
        if ((paramInt5 == -1) || (paramInt6 == -1)) {
          break label542;
        }
        switch (paramInt5)
        {
        }
        label916:
        i1 = 0;
      }
      label922:
      int i2 = 0;
    }
  }
  
  final boolean a(String paramString)
  {
    try
    {
      b(paramString);
      boolean bool = this.y;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iqy
 * JD-Core Version:    0.7.0.1
 */