import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class rfb
  extends Format
{
  private static final String[] h = { "number", "date", "time", "spellout", "ordinal", "duration" };
  private static final String[] i = { "", "currency", "percent", "integer" };
  private static final String[] j = { "", "short", "medium", "long", "full" };
  private static final Locale k = new Locale("");
  static final long serialVersionUID = 7136212545847378652L;
  transient Locale a;
  transient rgb b;
  transient Map<Integer, Format> c;
  private transient DateFormat d;
  private transient NumberFormat e;
  private transient rfg f;
  private transient rfg g;
  
  /* Error */
  private rfb(String paramString, Locale paramLocale)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 78	java/text/Format:<init>	()V
    //   4: aload_0
    //   5: aload_2
    //   6: putfield 80	rfb:a	Ljava/util/Locale;
    //   9: aload_0
    //   10: getfield 82	rfb:b	Lrgb;
    //   13: ifnonnull +20 -> 33
    //   16: aload_0
    //   17: new 84	rgb
    //   20: dup
    //   21: aload_1
    //   22: invokespecial 85	rgb:<init>	(Ljava/lang/String;)V
    //   25: putfield 82	rfb:b	Lrgb;
    //   28: aload_0
    //   29: invokespecial 87	rfb:b	()V
    //   32: return
    //   33: aload_0
    //   34: getfield 82	rfb:b	Lrgb;
    //   37: aload_1
    //   38: invokevirtual 90	rgb:a	(Ljava/lang/String;)Lrgb;
    //   41: pop
    //   42: goto -14 -> 28
    //   45: astore_3
    //   46: aload_0
    //   47: getfield 82	rfb:b	Lrgb;
    //   50: ifnull +10 -> 60
    //   53: aload_0
    //   54: getfield 82	rfb:b	Lrgb;
    //   57: invokevirtual 92	rgb:a	()V
    //   60: aload_0
    //   61: getfield 94	rfb:c	Ljava/util/Map;
    //   64: ifnull +12 -> 76
    //   67: aload_0
    //   68: getfield 94	rfb:c	Ljava/util/Map;
    //   71: invokeinterface 99 1 0
    //   76: aload_3
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	rfb
    //   0	78	1	paramString	String
    //   0	78	2	paramLocale	Locale
    //   45	32	3	localRuntimeException	java.lang.RuntimeException
    // Exception table:
    //   from	to	target	type
    //   9	28	45	java/lang/RuntimeException
    //   28	32	45	java/lang/RuntimeException
    //   33	42	45	java/lang/RuntimeException
  }
  
  private static double a(rgb paramrgb, int paramInt, String paramString, ParsePosition paramParsePosition)
  {
    int m = paramParsePosition.getIndex();
    double d1 = (0.0D / 0.0D);
    int n = m;
    double d2;
    int i5;
    int i6;
    int i7;
    int i8;
    int i10;
    int i1;
    int i12;
    double d4;
    label216:
    int i11;
    if (((rge)paramrgb.c.get(paramInt)).a != rgf.g)
    {
      d2 = paramrgb.b((rge)paramrgb.c.get(paramInt));
      int i2 = paramInt + 2;
      int i3 = paramrgb.b(i2);
      String str = paramrgb.b;
      rge localrge1 = (rge)paramrgb.c.get(i2);
      int i4 = localrge1.b + localrge1.c;
      i5 = i2;
      i6 = 0;
      i7 = i4;
      i8 = i5 + 1;
      rge localrge2 = (rge)paramrgb.c.get(i8);
      if ((i8 != i3) && (localrge2.a != rgf.c)) {
        break label326;
      }
      int i9 = localrge2.b - i7;
      if ((i9 != 0) && (!paramString.regionMatches(m, str, i7, i9))) {
        i10 = -1;
      }
      for (;;)
      {
        if (i10 >= 0)
        {
          i1 = m + i10;
          if (i1 > n) {
            if (i1 != paramString.length())
            {
              i12 = i1;
              d4 = d2;
              paramInt = i3 + 1;
              double d5 = d4;
              n = i12;
              d1 = d5;
              break;
              i10 = i6 + i9;
              if (i8 == i3) {
                continue;
              }
              i11 = localrge2.b + localrge2.c;
            }
          }
        }
      }
    }
    for (;;)
    {
      i6 = i10;
      i7 = i11;
      i5 = i8;
      break;
      d2 = d1;
      i1 = n;
      if (i1 == m)
      {
        paramParsePosition.setErrorIndex(m);
        return d2;
      }
      paramParsePosition.setIndex(i1);
      return d2;
      double d3 = d1;
      i12 = n;
      d4 = d3;
      break label216;
      label326:
      i11 = i7;
      i10 = i6;
    }
  }
  
  private final int a(int paramInt)
  {
    if (paramInt != 0) {
      paramInt = this.b.b(paramInt);
    }
    rgf localrgf;
    do
    {
      rgb localrgb = this.b;
      paramInt++;
      localrgf = ((rge)localrgb.c.get(paramInt)).a;
      if (localrgf == rgf.f) {
        return paramInt;
      }
    } while (localrgf != rgf.b);
    return -1;
  }
  
  private static final int a(String paramString, String[] paramArrayOfString)
  {
    String str = rez.a(paramString).toLowerCase(k);
    for (int m = 0; m < paramArrayOfString.length; m++) {
      if (str.equals(paramArrayOfString[m])) {
        return m;
      }
    }
    return -1;
  }
  
  private static int a(rgb paramrgb, int paramInt, double paramDouble)
  {
    int m = paramrgb.c.size();
    int i3;
    for (int n = paramInt + 2;; n = i3)
    {
      int i1 = 1 + paramrgb.b(n);
      double d1;
      if (i1 < m)
      {
        int i2 = i1 + 1;
        rge localrge = (rge)paramrgb.c.get(i1);
        if (localrge.a != rgf.g)
        {
          d1 = paramrgb.b(localrge);
          i3 = i2 + 1;
          int i4 = ((rge)paramrgb.c.get(i2)).b;
          if (paramrgb.b.charAt(i4) != '<') {
            break label117;
          }
          if (paramDouble > d1) {
            continue;
          }
        }
      }
      label117:
      while (paramDouble < d1) {
        return n;
      }
    }
  }
  
  public static final String a(Locale paramLocale, String paramString, Object... paramVarArgs)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramString.length());
    new rfb(paramString, paramLocale).a(0, null, null, null, paramVarArgs, new rfc(localStringBuilder), null);
    return localStringBuilder.toString();
  }
  
  private final void a(int paramInt, String paramString, ParsePosition paramParsePosition, Object[] paramArrayOfObject, Map<String, Object> paramMap)
  {
    if (paramString == null) {
      return;
    }
    String str1 = this.b.b;
    rge localrge1 = (rge)this.b.c.get(0);
    int m = localrge1.b + localrge1.c;
    int n = paramParsePosition.getIndex();
    ParsePosition localParsePosition = new ParsePosition(0);
    int i1 = m;
    int i2 = n;
    int i3 = 1;
    rge localrge2 = (rge)this.b.c.get(i3);
    rgf localrgf = localrge2.a;
    int i4 = localrge2.b - i1;
    int i5;
    if ((i4 == 0) || (str1.regionMatches(i1, paramString, i2, i4)))
    {
      i5 = i2 + i4;
      if (localrgf == rgf.b) {
        paramParsePosition.setIndex(i5);
      }
    }
    else
    {
      paramParsePosition.setErrorIndex(i2);
      return;
    }
    int i6;
    int i7;
    if ((localrgf == rgf.c) || (localrgf == rgf.d))
    {
      i6 = localrge2.b + localrge2.c;
      i7 = i3;
    }
    int i10;
    rgd localrgd;
    Object localObject1;
    Object localObject2;
    int i13;
    Object localObject3;
    int i17;
    int i16;
    for (int i8 = i5;; i8 = i17)
    {
      int i9 = i7 + 1;
      i1 = i6;
      i2 = i8;
      i3 = i9;
      break;
      i10 = this.b.b(i3);
      localrgd = localrge2.a();
      rgb localrgb = this.b;
      int i11 = i3 + 1;
      rge localrge3 = (rge)localrgb.c.get(i11);
      localObject1 = null;
      int i12;
      if (paramArrayOfObject != null)
      {
        int i18 = localrge3.d;
        localObject2 = Integer.valueOf(i18);
        i12 = i18;
        i13 = i11 + 1;
        if (this.c == null) {
          break label472;
        }
        Format localFormat = (Format)this.c.get(Integer.valueOf(i13 - 2));
        if (localFormat == null) {
          break label472;
        }
        localParsePosition.setIndex(i5);
        localObject3 = localFormat.parseObject(paramString, localParsePosition);
        if (localParsePosition.getIndex() == i5) {
          paramParsePosition.setErrorIndex(i5);
        }
      }
      else
      {
        if (localrge3.a == rgf.i) {}
        for (String str2 = this.b.a(localrge3);; str2 = Integer.toString(localrge3.d))
        {
          localObject1 = str2;
          localObject2 = str2;
          i12 = 0;
          break;
        }
      }
      i17 = localParsePosition.getIndex();
      i16 = 1;
      if (i16 != 0)
      {
        if (paramArrayOfObject == null) {
          break label772;
        }
        paramArrayOfObject[i12] = localObject3;
      }
      label431:
      rge localrge4 = (rge)this.b.c.get(i10);
      i6 = localrge4.b + localrge4.c;
      i7 = i10;
    }
    label472:
    int i14;
    if ((localrgd == rgd.a) || ((this.c != null) && (this.c.containsKey(Integer.valueOf(i13 - 2)))))
    {
      String str3 = b(i10);
      if (str3.length() != 0) {}
      for (i14 = paramString.indexOf(str3, i5); i14 < 0; i14 = paramString.length())
      {
        paramParsePosition.setErrorIndex(i5);
        return;
      }
      localObject3 = paramString.substring(i5, i14);
      String str4 = String.valueOf(localObject2.toString());
      if (((String)localObject3).equals(2 + String.valueOf(str4).length() + "{" + str4 + "}")) {
        break label792;
      }
    }
    for (int i15 = 1;; i15 = 0)
    {
      i16 = i15;
      i17 = i14;
      break;
      if (localrgd == rgd.c)
      {
        localParsePosition.setIndex(i5);
        double d1 = a(this.b, i13, paramString, localParsePosition);
        if (localParsePosition.getIndex() == i5)
        {
          paramParsePosition.setErrorIndex(i5);
          return;
        }
        localObject3 = Double.valueOf(d1);
        i17 = localParsePosition.getIndex();
        i16 = 1;
        break;
      }
      if ((localrgd.a()) || (localrgd == rgd.e)) {
        throw new UnsupportedOperationException("Parsing of plural/select/selectordinal argument is not supported.");
      }
      String str5 = String.valueOf(localrgd);
      throw new IllegalStateException(19 + String.valueOf(str5).length() + "unexpected argType " + str5);
      label772:
      if (paramMap == null) {
        break label431;
      }
      paramMap.put(localObject1, localObject3);
      break label431;
      label792:
      localObject3 = null;
    }
  }
  
  private final void a(int paramInt, rff paramrff, Object[] paramArrayOfObject1, Map<String, Object> paramMap, Object[] paramArrayOfObject2, rfc paramrfc)
  {
    if (this.b.a == rgc.a) {}
    for (int m = 1; m == 0; m = 0)
    {
      a(paramInt, paramrff, paramArrayOfObject1, paramMap, paramArrayOfObject2, paramrfc, null);
      return;
    }
    throw new UnsupportedOperationException("JDK apostrophe mode not supported");
  }
  
  private final void a(int paramInt, rff paramrff, Object[] paramArrayOfObject1, Map<String, Object> paramMap, Object[] paramArrayOfObject2, rfc paramrfc, FieldPosition paramFieldPosition)
  {
    String str1 = this.b.b;
    rge localrge1 = (rge)this.b.c.get(paramInt);
    int m = localrge1.b + localrge1.c;
    int n = paramInt + 1;
    int i1 = m;
    Object localObject1 = paramFieldPosition;
    rge localrge2 = (rge)this.b.c.get(n);
    rgf localrgf = localrge2.a;
    int i2 = localrge2.b;
    try
    {
      paramrfc.a.append(str1, i1, i2);
      paramrfc.b += i2 - i1;
      if (localrgf == rgf.b) {
        return;
      }
    }
    catch (IOException localIOException)
    {
      throw new mbd(localIOException);
    }
    int i3 = localrge2.b + localrge2.c;
    int i4;
    int i5;
    if (localrgf == rgf.e) {
      if (paramrff.h)
      {
        paramrfc.a(paramrff.f, paramrff.c, paramrff.g);
        i4 = n;
        i5 = i3;
      }
    }
    for (;;)
    {
      int i6 = i4 + 1;
      i1 = i5;
      n = i6;
      break;
      paramrfc.a(a(), paramrff.c);
      i4 = n;
      i5 = i3;
      continue;
      if (localrgf == rgf.f)
      {
        int i7 = this.b.b(n);
        rgd localrgd = localrge2.a();
        rgb localrgb1 = this.b;
        int i8 = n + 1;
        rge localrge3 = (rge)localrgb1.c.get(i8);
        String str2 = this.b.a(localrge3);
        int i14;
        if (paramArrayOfObject1 != null)
        {
          i14 = localrge3.d;
          if (paramrfc.c == null) {
            break label1343;
          }
        }
        label405:
        label668:
        label1336:
        label1343:
        for (Integer localInteger = Integer.valueOf(i14);; localInteger = null)
        {
          Object localObject3;
          Object localObject2;
          int i9;
          label345:
          int i10;
          if ((i14 >= 0) && (i14 < paramArrayOfObject1.length))
          {
            localObject3 = paramArrayOfObject1[i14];
            localObject2 = localInteger;
            i9 = 0;
            i10 = i8 + 1;
            int i11 = paramrfc.b;
            if (i9 == 0) {
              break label668;
            }
            paramrfc.a(2 + String.valueOf(str2).length() + "{" + str2 + "}");
            if ((paramrfc.c != null) && (i11 < paramrfc.b)) {
              paramrfc.c.add(new rfd(localObject2, i11, paramrfc.b));
            }
            if ((localObject1 == null) || (!rfe.a.equals(((FieldPosition)localObject1).getFieldAttribute()))) {
              break label1336;
            }
            ((FieldPosition)localObject1).setBeginIndex(i11);
            ((FieldPosition)localObject1).setEndIndex(paramrfc.b);
          }
          for (Object localObject4 = null;; localObject4 = localObject1)
          {
            rge localrge4 = (rge)this.b.c.get(i7);
            int i12 = localrge4.b + localrge4.c;
            localObject1 = localObject4;
            i5 = i12;
            i4 = i7;
            break;
            localObject2 = localInteger;
            i9 = 1;
            localObject3 = null;
            break label345;
            if (paramArrayOfObject2 != null) {
              for (int i13 = 0;; i13 += 2)
              {
                if (i13 < paramArrayOfObject2.length)
                {
                  if (!str2.equals(paramArrayOfObject2[i13].toString())) {
                    continue;
                  }
                  localObject3 = paramArrayOfObject2[(i13 + 1)];
                  localObject2 = str2;
                  i9 = 0;
                  break;
                }
                i9 = 1;
                localObject2 = str2;
                localObject3 = null;
                break;
              }
            }
            if ((paramMap != null) && (paramMap.containsKey(str2)))
            {
              localObject3 = paramMap.get(str2);
              localObject2 = str2;
              i9 = 0;
              break label345;
            }
            i9 = 1;
            localObject2 = str2;
            localObject3 = null;
            break label345;
            if (localObject3 == null)
            {
              paramrfc.a("null");
              break label405;
            }
            if ((paramrff != null) && (paramrff.e == i10 - 2))
            {
              if (paramrff.d == 0.0D)
              {
                paramrfc.a(paramrff.f, paramrff.c, paramrff.g);
                break label405;
              }
              paramrfc.a(paramrff.f, localObject3);
              break label405;
            }
            if (this.c != null)
            {
              Format localFormat = (Format)this.c.get(Integer.valueOf(i10 - 2));
              if (localFormat != null)
              {
                paramrfc.a(localFormat, localObject3);
                break label405;
              }
            }
            if ((localrgd == rgd.a) || ((this.c != null) && (this.c.containsKey(Integer.valueOf(i10 - 2)))))
            {
              if ((localObject3 instanceof Number))
              {
                paramrfc.a(a(), localObject3);
                break label405;
              }
              if ((localObject3 instanceof Date))
              {
                if (this.d == null) {
                  this.d = DateFormat.getDateTimeInstance(3, 3, this.a);
                }
                paramrfc.a(this.d, localObject3);
                break label405;
              }
              paramrfc.a(localObject3.toString());
              break label405;
            }
            if (localrgd == rgd.c)
            {
              if (!(localObject3 instanceof Number))
              {
                String str5 = String.valueOf(localObject3);
                throw new IllegalArgumentException(18 + String.valueOf(str5).length() + "'" + str5 + "' is not a Number");
              }
              double d3 = ((Number)localObject3).doubleValue();
              a(a(this.b, i10, d3), null, paramArrayOfObject1, paramMap, paramArrayOfObject2, paramrfc);
              break label405;
            }
            if (localrgd.a())
            {
              if (!(localObject3 instanceof Number))
              {
                String str4 = String.valueOf(localObject3);
                throw new IllegalArgumentException(18 + String.valueOf(str4).length() + "'" + str4 + "' is not a Number");
              }
              rfg localrfg;
              label1108:
              Number localNumber;
              rgb localrgb2;
              rge localrge5;
              if (localrgd == rgd.d)
              {
                if (this.f == null) {
                  this.f = new rfg(this, rfv.a);
                }
                localrfg = this.f;
                localNumber = (Number)localObject3;
                localrgb2 = this.b;
                localrge5 = (rge)localrgb2.c.get(i10);
                if (!localrge5.a.a()) {
                  break label1246;
                }
              }
              label1246:
              for (double d1 = localrgb2.b(localrge5);; d1 = 0.0D)
              {
                rff localrff = new rff(i10, str2, localNumber, d1);
                rgb localrgb3 = this.b;
                double d2 = localNumber.doubleValue();
                a(rfh.a(localrgb3, i10, localrfg, localrff, d2), localrff, paramArrayOfObject1, paramMap, paramArrayOfObject2, paramrfc);
                break;
                if (this.g == null) {
                  this.g = new rfg(this, rfv.b);
                }
                localrfg = this.g;
                break label1108;
              }
            }
            if (localrgd == rgd.e)
            {
              a(rgg.a(this.b, i10, localObject3.toString()), null, paramArrayOfObject1, paramMap, paramArrayOfObject2, paramrfc);
              break label405;
            }
            String str3 = String.valueOf(localrgd);
            throw new IllegalStateException(19 + String.valueOf(str3).length() + "unexpected argType " + str3);
          }
        }
      }
      i4 = n;
      i5 = i3;
    }
  }
  
  private final void a(Object paramObject, rfc paramrfc, FieldPosition paramFieldPosition)
  {
    if ((paramObject == null) || ((paramObject instanceof Map)))
    {
      a(null, (Map)paramObject, paramrfc, paramFieldPosition);
      return;
    }
    a((Object[])paramObject, null, paramrfc, paramFieldPosition);
  }
  
  private final void a(Object[] paramArrayOfObject, Map<String, Object> paramMap, rfc paramrfc, FieldPosition paramFieldPosition)
  {
    if ((paramArrayOfObject != null) && (this.b.d)) {
      throw new IllegalArgumentException("This method is not available in MessageFormat objects that use alphanumeric argument names.");
    }
    a(0, null, paramArrayOfObject, paramMap, null, paramrfc, paramFieldPosition);
  }
  
  private final String b(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    String str = this.b.b;
    rge localrge1 = (rge)this.b.c.get(paramInt);
    int m = localrge1.b + localrge1.c;
    int n = paramInt + 1;
    int i1 = m;
    for (int i2 = n;; i2++)
    {
      rge localrge2 = (rge)this.b.c.get(i2);
      rgf localrgf = localrge2.a;
      localStringBuilder.append(str, i1, localrge2.b);
      if ((localrgf == rgf.f) || (localrgf == rgf.b)) {
        return localStringBuilder.toString();
      }
      i1 = localrge2.b + localrge2.c;
    }
  }
  
  private final void b()
  {
    if (this.c != null) {
      this.c.clear();
    }
    int m = -2 + this.b.c.size();
    int n = 1;
    int i3;
    String str2;
    int i1;
    label160:
    Object localObject;
    if (n < m)
    {
      rge localrge1 = (rge)this.b.c.get(n);
      if ((localrge1.a != rgf.f) || (localrge1.a() != rgd.b)) {
        break label655;
      }
      int i2 = n + 2;
      rgb localrgb1 = this.b;
      rgb localrgb2 = this.b;
      i3 = i2 + 1;
      String str1 = localrgb1.a((rge)localrgb2.c.get(i2));
      rge localrge2 = (rge)this.b.c.get(i3);
      if (localrge2.a != rgf.k) {
        break label644;
      }
      str2 = this.b.a(localrge2);
      i1 = i3 + 1;
      switch (a(str1, h))
      {
      default: 
        throw new IllegalArgumentException(22 + String.valueOf(str1).length() + "Unknown format type \"" + str1 + "\"");
      case 0: 
        switch (a(str2, i))
        {
        default: 
          localObject = new DecimalFormat(str2, new DecimalFormatSymbols(this.a));
          label302:
          if (this.c == null) {
            this.c = new HashMap();
          }
          this.c.put(Integer.valueOf(n), localObject);
        }
        break;
      }
    }
    for (;;)
    {
      n = i1 + 1;
      break;
      localObject = NumberFormat.getInstance(this.a);
      break label302;
      localObject = NumberFormat.getCurrencyInstance(this.a);
      break label302;
      localObject = NumberFormat.getPercentInstance(this.a);
      break label302;
      localObject = NumberFormat.getIntegerInstance(this.a);
      break label302;
      switch (a(str2, j))
      {
      default: 
        localObject = new SimpleDateFormat(str2, this.a);
        break;
      case 0: 
        localObject = DateFormat.getDateInstance(2, this.a);
        break;
      case 1: 
        localObject = DateFormat.getDateInstance(3, this.a);
        break;
      case 2: 
        localObject = DateFormat.getDateInstance(2, this.a);
        break;
      case 3: 
        localObject = DateFormat.getDateInstance(1, this.a);
        break;
      case 4: 
        localObject = DateFormat.getDateInstance(0, this.a);
        break;
        switch (a(str2, j))
        {
        default: 
          localObject = new SimpleDateFormat(str2, this.a);
          break;
        case 0: 
          localObject = DateFormat.getTimeInstance(2, this.a);
          break;
        case 1: 
          localObject = DateFormat.getTimeInstance(3, this.a);
          break;
        case 2: 
          localObject = DateFormat.getTimeInstance(2, this.a);
          break;
        case 3: 
          localObject = DateFormat.getTimeInstance(1, this.a);
          break;
        case 4: 
          localObject = DateFormat.getTimeInstance(0, this.a);
          break;
          return;
          label644:
          str2 = "";
          i1 = i3;
          break label160;
          label655:
          i1 = n;
        }
        break;
      }
    }
  }
  
  final NumberFormat a()
  {
    if (this.e == null) {
      this.e = NumberFormat.getInstance(this.a);
    }
    return this.e;
  }
  
  public final StringBuffer format(Object paramObject, StringBuffer paramStringBuffer, FieldPosition paramFieldPosition)
  {
    a(paramObject, new rfc(paramStringBuffer), paramFieldPosition);
    return paramStringBuffer;
  }
  
  public AttributedCharacterIterator formatToCharacterIterator(Object paramObject)
  {
    if (paramObject == null) {
      throw new NullPointerException("formatToCharacterIterator must be passed non-null object");
    }
    StringBuilder localStringBuilder = new StringBuilder();
    rfc localrfc = new rfc(localStringBuilder);
    localrfc.c = new ArrayList();
    a(paramObject, localrfc, null);
    AttributedString localAttributedString = new AttributedString(localStringBuilder.toString());
    Iterator localIterator = localrfc.c.iterator();
    while (localIterator.hasNext())
    {
      rfd localrfd = (rfd)localIterator.next();
      localAttributedString.addAttribute(localrfd.a, localrfd.b, localrfd.c, localrfd.d);
    }
    return localAttributedString.getIterator();
  }
  
  public int hashCode()
  {
    return this.b.b.hashCode();
  }
  
  public Object parseObject(String paramString, ParsePosition paramParsePosition)
  {
    int n;
    int i1;
    int i2;
    int i5;
    if (!this.b.d)
    {
      if (this.b.d) {
        throw new IllegalArgumentException("This method is not available in MessageFormat objects that use named argument.");
      }
      n = -1;
      i1 = 0;
      i2 = a(i1);
      if (i2 >= 0)
      {
        rgb localrgb = this.b;
        int i4 = i2 + 1;
        i5 = ((rge)localrgb.c.get(i4)).d;
        if (i5 <= n) {
          break label171;
        }
      }
    }
    for (;;)
    {
      n = i5;
      i1 = i2;
      break;
      Object[] arrayOfObject = new Object[n + 1];
      int i3 = paramParsePosition.getIndex();
      a(0, paramString, paramParsePosition, arrayOfObject, null);
      if (paramParsePosition.getIndex() == i3) {}
      HashMap localHashMap;
      int m;
      do
      {
        return null;
        return arrayOfObject;
        localHashMap = new HashMap();
        m = paramParsePosition.getIndex();
        a(0, paramString, paramParsePosition, null, localHashMap);
      } while (paramParsePosition.getIndex() == m);
      return localHashMap;
      label171:
      i5 = n;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     rfb
 * JD-Core Version:    0.7.0.1
 */