import android.util.Base64;
import java.util.Arrays;

public final class jpt
  implements ioy
{
  private final oih a;
  private String b;
  
  public jpt(oih paramoih)
  {
    this.a = paramoih;
  }
  
  public static boolean a(oih paramoih)
  {
    return (paramoih != null) && (efj.a(paramoih.a));
  }
  
  public static boolean b(oih paramoih)
  {
    if (a(paramoih))
    {
      qmg localqmg = paramoih.a;
      int i5;
      label120:
      int j;
      label155:
      label173:
      int i;
      if (efj.a(localqmg)) {
        if (efj.a(localqmg))
        {
          qml[] arrayOfqml2 = localqmg.a;
          int i4 = arrayOfqml2.length;
          i5 = 0;
          if (i5 < i4)
          {
            qml localqml2 = arrayOfqml2[i5];
            if ((localqml2.a != null) && (localqml2.a.a != null))
            {
              int[] arrayOfInt2 = localqml2.a.a;
              int i6 = arrayOfInt2.length;
              int i7 = 0;
              int i8 = 0;
              int i9 = 0;
              if (i7 < i6)
              {
                int i10 = arrayOfInt2[i7];
                int i11;
                if (i10 == 1)
                {
                  i11 = 1;
                  i9 |= i11;
                  if (i10 != 3) {
                    break label155;
                  }
                }
                for (int i12 = 1;; i12 = 0)
                {
                  i8 |= i12;
                  i7++;
                  break;
                  i11 = 0;
                  break label120;
                }
              }
              if ((i9 != 0) && (i8 == 0))
              {
                j = 1;
                if (j == 0) {
                  break label196;
                }
                i = 1;
              }
            }
          }
        }
      }
      for (;;)
      {
        if (i == 0) {
          break label328;
        }
        return true;
        i5++;
        break;
        j = 0;
        break label173;
        label196:
        qml[] arrayOfqml1 = localqmg.a;
        int k = arrayOfqml1.length;
        for (int m = 0;; m++)
        {
          if (m >= k) {
            break label323;
          }
          qml localqml1 = arrayOfqml1[m];
          if ((localqml1.a == null) || (localqml1.a.a == null))
          {
            i = 1;
            break;
          }
          int[] arrayOfInt1 = localqml1.a.a;
          int n = arrayOfInt1.length;
          int i1 = 0;
          int i2 = 0;
          if (i1 < n)
          {
            if (arrayOfInt1[i1] == 3) {}
            for (int i3 = 1;; i3 = 0)
            {
              i2 |= i3;
              i1++;
              break;
            }
          }
          if (i2 == 0)
          {
            i = 1;
            break;
          }
        }
        label323:
        i = 0;
      }
    }
    label328:
    return false;
  }
  
  public static boolean c(oih paramoih)
  {
    if (!a(paramoih)) {}
    for (;;)
    {
      return false;
      qml[] arrayOfqml = paramoih.a.a;
      int i = arrayOfqml.length;
      for (int j = 0; j < i; j++) {
        if (efj.a(arrayOfqml[j], 1)) {
          return true;
        }
      }
    }
  }
  
  public final String a()
  {
    if (this.b == null) {
      this.b = Base64.encodeToString(qat.a(this.a), 0);
    }
    return this.b;
  }
  
  public final boolean a(ioy paramioy)
  {
    if ((paramioy instanceof jpt))
    {
      oih localoih1 = this.a;
      oih localoih2 = ((jpt)paramioy).a;
      boolean bool;
      if (localoih1 == localoih2) {
        bool = true;
      }
      while (bool)
      {
        return true;
        if ((localoih1 == null) || (localoih2 == null))
        {
          bool = false;
        }
        else if (localoih1.getClass() != localoih2.getClass())
        {
          bool = false;
        }
        else
        {
          int i = localoih1.a();
          localoih1.ak = i;
          int j = localoih2.a();
          localoih2.ak = j;
          if (j != i)
          {
            bool = false;
          }
          else
          {
            byte[] arrayOfByte1 = new byte[i];
            byte[] arrayOfByte2 = new byte[i];
            qat.a(localoih1, arrayOfByte1, 0, i);
            qat.a(localoih2, arrayOfByte2, 0, i);
            bool = Arrays.equals(arrayOfByte1, arrayOfByte2);
          }
        }
      }
    }
    return false;
  }
  
  public final String toString()
  {
    return this.a.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jpt
 * JD-Core Version:    0.7.0.1
 */