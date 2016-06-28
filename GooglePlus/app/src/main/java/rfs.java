import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;

@Deprecated
public final class rfs
{
  @Deprecated
  public final rfz a;
  @Deprecated
  private Set<rfr> b;
  @Deprecated
  private boolean c;
  
  private rfs(rfz paramrfz, Set<rfr> paramSet, boolean paramBoolean)
  {
    this.a = paramrfz;
    this.b = paramSet;
    this.c = paramBoolean;
  }
  
  static rfs a(String paramString)
  {
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    if (paramString.startsWith("integer")) {}
    int k;
    boolean bool;
    String str2;
    for (rfz localrfz = rfz.a;; localrfz = rfz.b)
    {
      String str1 = paramString.substring(7).trim();
      String[] arrayOfString1 = rfj.c.split(str1);
      int i = arrayOfString1.length;
      int j = 0;
      k = 0;
      bool = true;
      for (;;)
      {
        if (j >= i) {
          break label363;
        }
        str2 = arrayOfString1[j];
        if ((!str2.equals("…")) && (!str2.equals("..."))) {
          break;
        }
        k = 1;
        bool = false;
        j++;
      }
      if (!paramString.startsWith("decimal")) {
        break;
      }
    }
    throw new IllegalArgumentException("Samples must start with 'integer' or 'decimal'");
    if (k != 0)
    {
      String str5 = String.valueOf(str2);
      if (str5.length() != 0) {}
      for (String str6 = "Can only have … at the end of samples: ".concat(str5);; str6 = new String("Can only have … at the end of samples: ")) {
        throw new IllegalArgumentException(str6);
      }
    }
    String[] arrayOfString2 = rfj.d.split(str2);
    String str3;
    switch (arrayOfString2.length)
    {
    default: 
      str3 = String.valueOf(str2);
      if (str3.length() == 0) {
        break;
      }
    }
    for (String str4 = "Ill-formed number range: ".concat(str3);; str4 = new String("Ill-formed number range: "))
    {
      throw new IllegalArgumentException(str4);
      rfq localrfq3 = new rfq(arrayOfString2[0]);
      a(localrfz, localrfq3);
      localLinkedHashSet.add(new rfr(localrfq3, localrfq3));
      break;
      rfq localrfq1 = new rfq(arrayOfString2[0]);
      rfq localrfq2 = new rfq(arrayOfString2[1]);
      a(localrfz, localrfq1);
      a(localrfz, localrfq2);
      localLinkedHashSet.add(new rfr(localrfq1, localrfq2));
      break;
    }
    label363:
    return new rfs(localrfz, Collections.unmodifiableSet(localLinkedHashSet), bool);
  }
  
  private static void a(rfz paramrfz, rfq paramrfq)
  {
    int i = 1;
    int j;
    if (paramrfz == rfz.a)
    {
      j = i;
      if (paramrfq.b != 0) {
        break label73;
      }
    }
    for (;;)
    {
      if (j == i) {
        return;
      }
      String str = String.valueOf(paramrfq);
      throw new IllegalArgumentException(25 + String.valueOf(str).length() + "Ill-formed number range: " + str);
      j = 0;
      break;
      label73:
      i = 0;
    }
  }
  
  @Deprecated
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("@").append(this.a.toString().toLowerCase(Locale.ENGLISH));
    Iterator localIterator = this.b.iterator();
    int i = 1;
    if (localIterator.hasNext())
    {
      rfr localrfr = (rfr)localIterator.next();
      if (i != 0) {
        i = 0;
      }
      for (;;)
      {
        localStringBuilder.append(' ').append(localrfr);
        break;
        localStringBuilder.append(",");
      }
    }
    if (!this.c) {
      localStringBuilder.append(", …");
    }
    return localStringBuilder.toString();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     rfs
 * JD-Core Version:    0.7.0.1
 */