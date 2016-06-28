public final class jr
{
  static kb a = kc.c;
  static final jr b = new jr(false, 2, a);
  static final jr c = new jr(true, 2, a);
  private static final String f = Character.toString('‎');
  private static final String g = Character.toString('‏');
  public final boolean d;
  public final kb e;
  private final int h;
  
  jr(boolean paramBoolean, int paramInt, kb paramkb)
  {
    this.d = paramBoolean;
    this.h = paramInt;
    this.e = paramkb;
  }
  
  private final String a(String paramString, kb paramkb)
  {
    boolean bool = paramkb.a(paramString, 0, paramString.length());
    if (!this.d)
    {
      int n;
      int i1;
      int i2;
      if (!bool)
      {
        jt localjt2 = new jt(paramString, false);
        localjt2.d = localjt2.c;
        n = 0;
        i1 = 0;
        for (;;)
        {
          if (localjt2.d > 0) {
            switch (localjt2.a())
            {
            case 9: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            default: 
              if (n == 0) {
                n = i1;
              }
              break;
            case 0: 
              if (i1 == 0) {
                i2 = -1;
              }
              break;
            }
          }
        }
      }
      for (;;)
      {
        if (i2 != 1) {
          break label267;
        }
        return f;
        if (n != 0) {
          break;
        }
        n = i1;
        break;
        if (n == i1)
        {
          i2 = -1;
        }
        else
        {
          i1--;
          break;
          if (i1 == 0)
          {
            i2 = 1;
          }
          else
          {
            if (n != 0) {
              break;
            }
            n = i1;
            break;
            if (n == i1)
            {
              i2 = 1;
            }
            else
            {
              i1--;
              break;
              i1++;
              break;
              i2 = 0;
            }
          }
        }
      }
    }
    label267:
    if (this.d)
    {
      jt localjt1;
      int i;
      int j;
      if (bool)
      {
        localjt1 = new jt(paramString, false);
        localjt1.d = localjt1.c;
        i = 0;
        j = 0;
      }
      for (;;)
      {
        int k = localjt1.d;
        int m = 0;
        if (k > 0) {}
        switch (localjt1.a())
        {
        case 9: 
        case 3: 
        case 4: 
        case 5: 
        case 6: 
        case 7: 
        case 8: 
        case 10: 
        case 11: 
        case 12: 
        case 13: 
        default: 
          if (i == 0) {
            i = j;
          }
          break;
        case 0: 
          if (j == 0) {
            m = -1;
          }
        case 14: 
        case 15: 
        case 1: 
        case 2: 
        case 16: 
        case 17: 
          for (;;)
          {
            if (m != -1) {
              break label525;
            }
            return g;
            if (i != 0) {
              break;
            }
            i = j;
            break;
            if (i == j)
            {
              m = -1;
            }
            else
            {
              j--;
              break;
              if (j == 0)
              {
                m = 1;
              }
              else
              {
                if (i != 0) {
                  break;
                }
                i = j;
                break;
                if (i != j) {
                  break label513;
                }
                m = 1;
              }
            }
          }
          j--;
          break;
        case 18: 
          j++;
        }
      }
    }
    label513:
    label525:
    return "";
  }
  
  public static jr a()
  {
    js localjs = new js();
    if ((localjs.b == 2) && (localjs.c == a))
    {
      if (localjs.a) {
        return c;
      }
      return b;
    }
    return new jr(localjs.a, localjs.b, localjs.c);
  }
  
  private final String b(String paramString, kb paramkb)
  {
    boolean bool = paramkb.a(paramString, 0, paramString.length());
    if (!this.d)
    {
      jt localjt2;
      int i6;
      int i7;
      int i8;
      if (!bool)
      {
        localjt2 = new jt(paramString, false);
        localjt2.d = 0;
        i6 = 0;
        i7 = 0;
        i8 = 0;
        for (;;)
        {
          label48:
          if ((localjt2.d < localjt2.c) && (i6 == 0))
          {
            localjt2.e = localjt2.a.charAt(localjt2.d);
            int i9;
            if (Character.isHighSurrogate(localjt2.e))
            {
              int i15 = Character.codePointAt(localjt2.a, localjt2.d);
              localjt2.d += Character.charCount(i15);
              i9 = Character.getDirectionality(i15);
            }
            for (;;)
            {
              switch (i9)
              {
              case 9: 
              case 3: 
              case 4: 
              case 5: 
              case 6: 
              case 7: 
              case 8: 
              case 10: 
              case 11: 
              case 12: 
              case 13: 
              default: 
                i6 = i7;
                break label48;
                localjt2.d = (1 + localjt2.d);
                i9 = jt.a(localjt2.e);
                if (localjt2.b) {
                  if (localjt2.e == '<')
                  {
                    int i11 = localjt2.d;
                    for (;;)
                    {
                      if (localjt2.d >= localjt2.c) {
                        break label432;
                      }
                      String str5 = localjt2.a;
                      int i12 = localjt2.d;
                      localjt2.d = (i12 + 1);
                      localjt2.e = str5.charAt(i12);
                      if (localjt2.e == '>')
                      {
                        i9 = 12;
                        break;
                      }
                      if ((localjt2.e == '"') || (localjt2.e == '\''))
                      {
                        int i13 = localjt2.e;
                        char c4;
                        do
                        {
                          if (localjt2.d >= localjt2.c) {
                            break;
                          }
                          String str6 = localjt2.a;
                          int i14 = localjt2.d;
                          localjt2.d = (i14 + 1);
                          c4 = str6.charAt(i14);
                          localjt2.e = c4;
                        } while (c4 != i13);
                      }
                    }
                    label432:
                    localjt2.d = i11;
                    localjt2.e = '<';
                    i9 = 13;
                  }
                  else if (localjt2.e == '&')
                  {
                    char c3;
                    do
                    {
                      if (localjt2.d >= localjt2.c) {
                        break;
                      }
                      String str4 = localjt2.a;
                      int i10 = localjt2.d;
                      localjt2.d = (i10 + 1);
                      c3 = str4.charAt(i10);
                      localjt2.e = c3;
                    } while (c3 != ';');
                    i9 = 12;
                  }
                }
                break;
              }
            }
            i7++;
            i8 = -1;
            continue;
            i7++;
            i8 = 1;
            continue;
            i7--;
            i8 = 0;
            continue;
            if (i7 == 0) {
              i8 = -1;
            }
          }
        }
      }
      for (;;)
      {
        if (i8 != 1) {
          break label709;
        }
        return f;
        i6 = i7;
        break;
        if (i7 == 0)
        {
          i8 = 1;
        }
        else
        {
          i6 = i7;
          break;
          if (i6 != 0)
          {
            if (i8 == 0) {
              for (;;)
              {
                if (localjt2.d <= 0) {
                  break label703;
                }
                switch (localjt2.a())
                {
                default: 
                  break;
                case 14: 
                case 15: 
                  if (i6 == i7)
                  {
                    i8 = -1;
                    break;
                  }
                  i7--;
                  break;
                case 16: 
                case 17: 
                  if (i6 == i7)
                  {
                    i8 = 1;
                    break;
                  }
                  i7--;
                  break;
                case 18: 
                  i7++;
                }
              }
            }
          }
          else {
            label703:
            i8 = 0;
          }
        }
      }
    }
    label709:
    if (this.d)
    {
      jt localjt1;
      int i;
      int j;
      int k;
      if (bool)
      {
        localjt1 = new jt(paramString, false);
        localjt1.d = 0;
        i = 0;
        j = 0;
        k = 0;
        for (;;)
        {
          label746:
          if ((localjt1.d < localjt1.c) && (i == 0))
          {
            localjt1.e = localjt1.a.charAt(localjt1.d);
            int m;
            if (Character.isHighSurrogate(localjt1.e))
            {
              int i5 = Character.codePointAt(localjt1.a, localjt1.d);
              localjt1.d += Character.charCount(i5);
              m = Character.getDirectionality(i5);
            }
            for (;;)
            {
              switch (m)
              {
              case 9: 
              case 3: 
              case 4: 
              case 5: 
              case 6: 
              case 7: 
              case 8: 
              case 10: 
              case 11: 
              case 12: 
              case 13: 
              default: 
                i = j;
                break label746;
                localjt1.d = (1 + localjt1.d);
                m = jt.a(localjt1.e);
                if (localjt1.b) {
                  if (localjt1.e == '<')
                  {
                    int i1 = localjt1.d;
                    for (;;)
                    {
                      if (localjt1.d >= localjt1.c) {
                        break label1132;
                      }
                      String str2 = localjt1.a;
                      int i2 = localjt1.d;
                      localjt1.d = (i2 + 1);
                      localjt1.e = str2.charAt(i2);
                      if (localjt1.e == '>')
                      {
                        m = 12;
                        break;
                      }
                      if ((localjt1.e == '"') || (localjt1.e == '\''))
                      {
                        int i3 = localjt1.e;
                        char c2;
                        do
                        {
                          if (localjt1.d >= localjt1.c) {
                            break;
                          }
                          String str3 = localjt1.a;
                          int i4 = localjt1.d;
                          localjt1.d = (i4 + 1);
                          c2 = str3.charAt(i4);
                          localjt1.e = c2;
                        } while (c2 != i3);
                      }
                    }
                    label1132:
                    localjt1.d = i1;
                    localjt1.e = '<';
                    m = 13;
                  }
                  else if (localjt1.e == '&')
                  {
                    char c1;
                    do
                    {
                      if (localjt1.d >= localjt1.c) {
                        break;
                      }
                      String str1 = localjt1.a;
                      int n = localjt1.d;
                      localjt1.d = (n + 1);
                      c1 = str1.charAt(n);
                      localjt1.e = c1;
                    } while (c1 != ';');
                    m = 12;
                  }
                }
                break;
              }
            }
            j++;
            k = -1;
            continue;
            j++;
            k = 1;
            continue;
            j--;
            k = 0;
            continue;
            if (j == 0) {
              k = -1;
            }
          }
        }
      }
      for (;;)
      {
        if (k != -1) {
          break label1409;
        }
        return g;
        i = j;
        break;
        if (j == 0)
        {
          k = 1;
        }
        else
        {
          i = j;
          break;
          if (i != 0)
          {
            if (k == 0) {
              for (;;)
              {
                if (localjt1.d <= 0) {
                  break label1403;
                }
                switch (localjt1.a())
                {
                default: 
                  break;
                case 14: 
                case 15: 
                  if (i == j)
                  {
                    k = -1;
                    break;
                  }
                  j--;
                  break;
                case 16: 
                case 17: 
                  if (i == j)
                  {
                    k = 1;
                    break;
                  }
                  j--;
                  break;
                case 18: 
                  j++;
                }
              }
            }
          }
          else {
            label1403:
            k = 0;
          }
        }
      }
    }
    label1409:
    return "";
  }
  
  public final String a(String paramString)
  {
    kb localkb1 = this.e;
    if (paramString == null) {
      return null;
    }
    boolean bool = localkb1.a(paramString, 0, paramString.length());
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0x2 & this.h;
    int j = 0;
    if (i != 0) {
      j = 1;
    }
    kb localkb3;
    if (j != 0)
    {
      if (bool)
      {
        localkb3 = kc.b;
        localStringBuilder.append(b(paramString, localkb3));
      }
    }
    else
    {
      if (bool == this.d) {
        break label162;
      }
      if (!bool) {
        break label154;
      }
      int k = 8235;
      label94:
      localStringBuilder.append(k);
      localStringBuilder.append(paramString);
      localStringBuilder.append('‬');
      label118:
      if (!bool) {
        break label172;
      }
    }
    label154:
    label162:
    label172:
    for (kb localkb2 = kc.b;; localkb2 = kc.a)
    {
      localStringBuilder.append(a(paramString, localkb2));
      return localStringBuilder.toString();
      localkb3 = kc.a;
      break;
      int m = 8234;
      break label94;
      localStringBuilder.append(paramString);
      break label118;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jr
 * JD-Core Version:    0.7.0.1
 */