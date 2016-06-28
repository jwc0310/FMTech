import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

public final class rfj
  implements Serializable
{
  public static final rfj b;
  static final Pattern c;
  static final Pattern d = Pattern.compile("\\s*~\\s*");
  private static final rfo e = new rfk();
  private static final rfx f = new rfx("other", e, null, null);
  private static Pattern g;
  private static Pattern h;
  private static Pattern i;
  private static Pattern j = Pattern.compile("\\s*;\\s*");
  private static final long serialVersionUID = 1L;
  final rfy a;
  
  static
  {
    b = new rfj(new rfy().a(f));
    g = Pattern.compile("\\s*\\Q\\E@\\s*");
    h = Pattern.compile("\\s*or\\s*");
    i = Pattern.compile("\\s*and\\s*");
    c = Pattern.compile("\\s*,\\s*");
    Pattern.compile("\\s*\\Q..\\E\\s*");
  }
  
  private rfj(rfy paramrfy)
  {
    this.a = paramrfy;
    Collections.unmodifiableSet(paramrfy.a());
  }
  
  private static String a(double paramDouble)
  {
    long l = paramDouble;
    if (paramDouble == l) {
      return String.valueOf(l);
    }
    return String.valueOf(paramDouble);
  }
  
  private static String a(String[] paramArrayOfString, int paramInt, String paramString)
  {
    if (paramInt < paramArrayOfString.length) {
      return paramArrayOfString[paramInt];
    }
    throw new ParseException(26 + String.valueOf(paramString).length() + "missing token at end of '" + paramString + "'", -1);
  }
  
  private static ParseException a(String paramString1, String paramString2)
  {
    return new ParseException(25 + String.valueOf(paramString1).length() + String.valueOf(paramString2).length() + "unexpected token '" + paramString1 + "' in '" + paramString2 + "'", -1);
  }
  
  public static rfj a(String paramString)
  {
    String str = paramString.trim();
    if (str.length() == 0) {
      return b;
    }
    return new rfj(d(str));
  }
  
  public static rfj a(Locale paramLocale, int paramInt)
  {
    rga localrga = rga.c;
    localrga.a();
    Map localMap;
    String str;
    rfj localrfj;
    if (paramInt == rfv.a)
    {
      localMap = localrga.a;
      str = (String)localMap.get(paramLocale.getLanguage());
      if ((str != null) && (str.trim().length() != 0)) {
        break label67;
      }
      localrfj = b;
    }
    label67:
    do
    {
      return localrfj;
      localMap = localrga.b;
      break;
      localrfj = localrga.a(str);
    } while (localrfj != null);
    return b;
  }
  
  static rfx b(String paramString)
  {
    Object localObject = null;
    boolean bool1 = true;
    if (paramString.length() == 0) {
      return f;
    }
    String str1 = paramString.toLowerCase(Locale.ENGLISH);
    int k = str1.indexOf(':');
    if (k == -1) {
      throw new ParseException(34 + String.valueOf(str1).length() + "missing ':' in rule description '" + str1 + "'", 0);
    }
    String str2 = str1.substring(0, k).trim();
    if (!e(str2)) {
      throw new ParseException(22 + String.valueOf(str2).length() + "keyword '" + str2 + " is not valid", 0);
    }
    String str3 = str1.substring(k + 1).trim();
    String[] arrayOfString = g.split(str3);
    String str7;
    rfs localrfs;
    label233:
    boolean bool2;
    switch (arrayOfString.length)
    {
    default: 
      String str6 = String.valueOf(str3);
      if (str6.length() != 0)
      {
        str7 = "Too many samples in ".concat(str6);
        throw new IllegalArgumentException(str7);
      }
      break;
    case 1: 
      localrfs = null;
      bool2 = str2.equals("other");
      if (arrayOfString[0].length() != 0) {}
      break;
    }
    for (;;)
    {
      if (bool2 == bool1) {
        break label412;
      }
      throw new IllegalArgumentException("The keyword 'other' must have no constraints, just samples.");
      localrfs = rfs.a(arrayOfString[bool1]);
      rfz localrfz1 = localrfs.a;
      rfz localrfz2 = rfz.b;
      localObject = null;
      if (localrfz1 != localrfz2) {
        break label233;
      }
      localObject = localrfs;
      localrfs = null;
      break label233;
      localrfs = rfs.a(arrayOfString[bool1]);
      localObject = rfs.a(arrayOfString[2]);
      if ((localrfs.a == rfz.a) && (((rfs)localObject).a == rfz.b)) {
        break label233;
      }
      String str4 = String.valueOf(str3);
      if (str4.length() != 0) {}
      for (String str5 = "Must have @integer then @decimal in ".concat(str4);; str5 = new String("Must have @integer then @decimal in ")) {
        throw new IllegalArgumentException(str5);
      }
      str7 = new String("Too many samples in ");
      break;
      bool1 = false;
    }
    label412:
    if (bool2) {}
    for (rfo localrfo = e;; localrfo = c(arrayOfString[0])) {
      return new rfx(str2, localrfo, localrfs, (rfs)localObject);
    }
  }
  
  private static rfo c(String paramString)
  {
    String[] arrayOfString1 = h.split(paramString);
    int k = 0;
    Object localObject1 = null;
    Object localObject2;
    int m;
    rfo localrfo;
    label141:
    label183:
    rft localrft;
    label293:
    int i4;
    int i5;
    label421:
    boolean bool1;
    label531:
    label535:
    int i6;
    String str4;
    boolean bool4;
    boolean bool5;
    Object localObject5;
    label727:
    double d1;
    long l1;
    int i13;
    Object localObject6;
    long l3;
    int i14;
    long l2;
    int i7;
    label928:
    double d4;
    label1112:
    Object localObject7;
    label1144:
    long[] arrayOfLong;
    if (k < arrayOfString1.length)
    {
      localObject2 = null;
      String[] arrayOfString2 = i.split(arrayOfString1[k]);
      m = 0;
      int n = arrayOfString2.length;
      if (m < n)
      {
        localrfo = e;
        String str1 = arrayOfString2[m].trim();
        int i1 = -1;
        ArrayList localArrayList1 = new ArrayList();
        int i2 = 0;
        if (i2 < str1.length())
        {
          int i18 = str1.charAt(i2);
          int i19;
          if ((i18 <= 32) && ((i18 == 32) || (i18 == 9) || (i18 == 10) || (i18 == 12) || (i18 == 13)))
          {
            i19 = 1;
            if (i19 == 0) {
              break label183;
            }
            if (i1 >= 0)
            {
              localArrayList1.add(str1.substring(i1, i2));
              i1 = -1;
            }
          }
          for (;;)
          {
            i2++;
            break;
            i19 = 0;
            break label141;
            if ((i18 <= 61) && (i18 >= 33) && ((i18 == 33) || (i18 == 37) || (i18 == 44) || (i18 == 46) || (i18 == 61))) {}
            for (int i20 = 1;; i20 = 0)
            {
              if (i20 == 0) {
                break label293;
              }
              if (i1 >= 0) {
                localArrayList1.add(str1.substring(i1, i2));
              }
              localArrayList1.add(str1.substring(i2, i2 + 1));
              i1 = -1;
              break;
            }
            if (i1 < 0) {
              i1 = i2;
            }
          }
        }
        if (i1 >= 0) {
          localArrayList1.add(str1.substring(i1));
        }
        String[] arrayOfString3 = (String[])localArrayList1.toArray(new String[localArrayList1.size()]);
        String str2 = arrayOfString3[0];
        try
        {
          localrft = rft.valueOf(str2);
          if (1 >= arrayOfString3.length) {
            break label1381;
          }
          str3 = arrayOfString3[1];
          if ((!"mod".equals(str3)) && (!"%".equals(str3))) {
            break label1372;
          }
          int i3 = Integer.parseInt(arrayOfString3[2]);
          str3 = a(arrayOfString3, 3, str1);
          i4 = i3;
          i5 = 4;
          if ("not".equals(str3))
          {
            bool1 = false;
            i17 = i5 + 1;
            str3 = a(arrayOfString3, i5, str1);
            if (!"=".equals(str3)) {
              break label531;
            }
            throw a(str3, str1);
          }
        }
        catch (Exception localException)
        {
          throw a(str2, str1);
        }
        if (!"!".equals(str3)) {
          break label1366;
        }
        bool1 = false;
        int i17 = i5 + 1;
        String str3 = a(arrayOfString3, i5, str1);
        if (!"=".equals(str3)) {
          throw a(str3, str1);
        }
        i5 = i17;
        boolean bool3;
        if (("is".equals(str3)) || ("in".equals(str3)) || ("=".equals(str3)))
        {
          boolean bool2 = "is".equals(str3);
          if ((bool2) && (!bool1)) {
            throw a(str3, str1);
          }
          i6 = i5 + 1;
          str4 = a(arrayOfString3, i5, str1);
          bool3 = bool2;
          bool4 = true;
        }
        for (;;)
        {
          if ("not".equals(str4)) {
            if ((!bool3) && (!bool1))
            {
              throw a(str4, str1);
              if ("within".equals(str3))
              {
                int i16 = i5 + 1;
                str4 = a(arrayOfString3, i5, str1);
                i6 = i16;
                bool3 = false;
                bool4 = false;
              }
              else
              {
                throw a(str3, str1);
              }
            }
            else
            {
              ArrayList localArrayList2;
              double d2;
              if (!bool1)
              {
                bool5 = true;
                int i15 = i6 + 1;
                localObject5 = a(arrayOfString3, i6, str1);
                i6 = i15;
                localArrayList2 = new ArrayList();
                d1 = -9.223372036854776E+018D;
                d2 = 9.223372036854776E+018D;
              }
              for (;;)
              {
                l1 = Long.parseLong((String)localObject5);
                if (i6 >= arrayOfString3.length) {
                  break label1336;
                }
                int i11 = i6 + 1;
                String str7 = a(arrayOfString3, i6, str1);
                if (str7.equals("."))
                {
                  int i12 = i11 + 1;
                  String str8 = a(arrayOfString3, i11, str1);
                  if (!str8.equals("."))
                  {
                    throw a(str8, str1);
                    bool5 = false;
                    break;
                  }
                  i13 = i12 + 1;
                  localObject6 = a(arrayOfString3, i12, str1);
                  l3 = Long.parseLong((String)localObject6);
                  if (i13 >= arrayOfString3.length) {
                    break label1325;
                  }
                  i14 = i13 + 1;
                  localObject6 = a(arrayOfString3, i13, str1);
                  if (((String)localObject6).equals(",")) {
                    break label1314;
                  }
                  throw a((String)localObject6, str1);
                }
                if (!str7.equals(",")) {
                  throw a(str7, str1);
                }
                l2 = l1;
                i7 = i11;
                localObject6 = str7;
                if (l1 > l2) {
                  throw a(41 + l1 + "~" + l2, str1);
                }
                if ((i4 != 0) && (l2 >= i4)) {
                  throw a(36 + l2 + ">mod=" + i4, str1);
                }
                localArrayList2.add(Long.valueOf(l1));
                localArrayList2.add(Long.valueOf(l2));
                double d3 = l1;
                d4 = Math.min(d2, d3);
                d1 = Math.max(d1, l2);
                int i8 = arrayOfString3.length;
                if (i7 >= i8) {
                  break label1112;
                }
                int i10 = i7 + 1;
                String str6 = a(arrayOfString3, i7, str1);
                d2 = d4;
                i6 = i10;
                localObject5 = str6;
              }
              if (((String)localObject6).equals(",")) {
                throw a((String)localObject6, str1);
              }
              if (localArrayList2.size() == 2)
              {
                localObject7 = null;
                if ((d4 != d1) && (bool3) && (!bool5)) {
                  throw a("is not <range>", str1);
                }
              }
              else
              {
                arrayOfLong = new long[localArrayList2.size()];
                for (int i9 = 0; i9 < arrayOfLong.length; i9++) {
                  arrayOfLong[i9] = ((Long)localArrayList2.get(i9)).longValue();
                }
              }
            }
          }
        }
      }
    }
    label1314:
    label1325:
    label1336:
    label1366:
    label1372:
    label1381:
    for (Object localObject4 = new rfw(i4, bool5, localrft, bool4, d4, d1, (long[])localObject7);; localObject4 = localrfo)
    {
      if (localObject2 == null) {}
      for (localObject2 = localObject4;; localObject2 = new rfm((rfo)localObject2, (rfo)localObject4))
      {
        m++;
        break;
      }
      if (localObject1 == null) {}
      for (Object localObject3 = localObject2;; localObject3 = new rfu(localObject1, (rfo)localObject2))
      {
        k++;
        localObject1 = localObject3;
        break;
      }
      return localObject1;
      localObject7 = arrayOfLong;
      break label1144;
      l2 = l3;
      i7 = i14;
      break label928;
      i7 = i13;
      l2 = l3;
      break label928;
      l2 = l1;
      localObject6 = localObject5;
      i7 = i6;
      break label928;
      String str5 = str4;
      bool5 = bool1;
      localObject5 = str5;
      break label727;
      bool1 = true;
      break label535;
      i5 = 2;
      i4 = 0;
      break label421;
    }
  }
  
  private static rfy d(String paramString)
  {
    rfy localrfy = new rfy();
    if (paramString.endsWith(";")) {
      paramString = paramString.substring(0, -1 + paramString.length());
    }
    String[] arrayOfString = j.split(paramString);
    int k = 0;
    if (k < arrayOfString.length)
    {
      rfx localrfx = b(arrayOfString[k].trim());
      boolean bool1 = localrfy.a;
      if ((localrfx.c != null) || (localrfx.d != null)) {}
      for (boolean bool2 = true;; bool2 = false)
      {
        localrfy.a = (bool2 | bool1);
        localrfy.a(localrfx);
        k++;
        break;
      }
    }
    Object localObject1 = null;
    Iterator localIterator = localrfy.b.iterator();
    Object localObject2;
    if (localIterator.hasNext())
    {
      localObject2 = (rfx)localIterator.next();
      if (!"other".equals(((rfx)localObject2).a)) {
        break label200;
      }
      localIterator.remove();
    }
    for (;;)
    {
      localObject1 = localObject2;
      break;
      if (localObject1 == null) {
        localObject1 = b("other:");
      }
      localrfy.b.add(localObject1);
      return localrfy;
      label200:
      localObject2 = localObject1;
    }
  }
  
  private static boolean e(String paramString)
  {
    for (int k = 0; k < paramString.length(); k++)
    {
      int m = paramString.charAt(k);
      if ((97 > m) || (m > 122)) {
        return false;
      }
    }
    return true;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof rfj))
    {
      rfj localrfj = (rfj)paramObject;
      if ((localrfj != null) && (toString().equals(localrfj.toString()))) {}
      for (int k = 1; k != 0; k = 0) {
        return true;
      }
    }
    return false;
  }
  
  @Deprecated
  public final int hashCode()
  {
    return this.a.hashCode();
  }
  
  public final String toString()
  {
    return this.a.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     rfj
 * JD-Core Version:    0.7.0.1
 */