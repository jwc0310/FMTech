public final class kiw
  implements gnd, gne
{
  public final boolean a(gnb paramgnb)
  {
    if ((paramgnb == null) || (paramgnb.b())) {}
    label172:
    for (;;)
    {
      return false;
      int i = paramgnb.c.length;
      int j = paramgnb.b.length;
      int k = paramgnb.d.length;
      int m = paramgnb.e.length;
      int n;
      if (i > 0) {
        if ((j == 0) && (k == 0) && (m == 0)) {
          n = 1;
        }
      }
      for (;;)
      {
        if (n == 0) {
          break label172;
        }
        if (i == 1)
        {
          int i1 = paramgnb.c[0].c;
          if ((i1 == 5) || (i1 == 8) || (i1 == 9)) {
            break;
          }
        }
        return true;
        n = 0;
        continue;
        if (j > 0)
        {
          if ((k == 0) && (m == 0)) {
            n = 1;
          } else {
            n = 0;
          }
        }
        else if (k > 0)
        {
          if (m == 0) {
            n = 1;
          } else {
            n = 0;
          }
        }
        else if (m > 0) {
          n = 1;
        } else {
          n = 0;
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kiw
 * JD-Core Version:    0.7.0.1
 */