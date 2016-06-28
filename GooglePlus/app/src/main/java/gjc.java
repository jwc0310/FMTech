import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class gjc
  implements gje
{
  public final String a;
  public final int b;
  public final Map<String, gkd> c;
  public final Map<String, ?> d = this.f.a.getAll();
  public boolean e;
  
  public gjc(gjt paramgjt, int paramInt)
  {
    this(paramgjt, paramInt, "", new HashMap());
  }
  
  public gjc(int paramInt, String paramString, Map<String, gkd> paramMap)
  {
    this.b = paramString;
    this.a = String.valueOf(paramMap).concat(".");
    Object localObject;
    this.c = localObject;
  }
  
  public static String a(int paramInt, String paramString)
  {
    return 11 + String.valueOf(paramString).length() + paramInt + paramString;
  }
  
  public int a(String paramString, int paramInt)
  {
    return ((Integer)a(paramString, Integer.valueOf(paramInt))).intValue();
  }
  
  public long a(String paramString, long paramLong)
  {
    return ((Long)a(paramString, Long.valueOf(0L))).longValue();
  }
  
  public Object a(String paramString, Object paramObject)
  {
    String str1 = g(paramString);
    gkd localgkd = (gkd)this.c.get(str1);
    if (localgkd != null) {
      paramObject = localgkd.a(paramObject);
    }
    String str2;
    do
    {
      return paramObject;
      str2 = a(this.b, str1);
    } while (!this.d.containsKey(str2));
    return this.d.get(str2);
  }
  
  public String a(String paramString1, String paramString2)
  {
    return (String)a(paramString1, paramString2);
  }
  
  public void a(int paramInt, SharedPreferences.Editor paramEditor)
  {
    Iterator localIterator = this.c.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      ((gkd)this.c.get(str)).a(paramEditor, a(paramInt, str));
    }
  }
  
  public void a(String paramString, gkd paramgkd)
  {
    this.c.put(g(paramString), paramgkd);
  }
  
  public boolean a()
  {
    return c("logged_in");
  }
  
  public boolean a(String paramString)
  {
    String str = g(paramString);
    gkd localgkd = (gkd)this.c.get(str);
    if (localgkd != null) {
      return localgkd != gjt.b;
    }
    return this.f.a.contains(a(this.b, str));
  }
  
  public boolean a(String paramString, boolean paramBoolean)
  {
    return ((Boolean)a(paramString, Boolean.valueOf(paramBoolean))).booleanValue();
  }
  
  public gjc b(String paramString, int paramInt)
  {
    a(paramString, new gke(paramInt));
    return this;
  }
  
  public gjc b(String paramString, long paramLong)
  {
    a(paramString, new gkf(paramLong));
    return this;
  }
  
  public gjc b(String paramString1, String paramString2)
  {
    a(paramString1, new gki(paramString2));
    return this;
  }
  
  public gjc b(String paramString, boolean paramBoolean)
  {
    a(paramString, new gkc(paramBoolean));
    return this;
  }
  
  public String b(String paramString)
  {
    return a(paramString, null);
  }
  
  public boolean b()
  {
    return c("logged_out");
  }
  
  public gjc c()
  {
    this.e = true;
    return this;
  }
  
  public boolean c(String paramString)
  {
    return a(paramString, false);
  }
  
  public int d()
  {
    int i = this.b;
    if ((this.e) && (this.b != -1)) {}
    for (int j = 1; j != 0; j = 0)
    {
      Iterator localIterator3 = this.f.c().iterator();
      while (localIterator3.hasNext()) {
        ((giw)localIterator3.next()).a(this.b);
      }
    }
    for (;;)
    {
      synchronized (this.f)
      {
        int k = this.f.b(b("account_name"), b("effective_gaia_id"));
        if (k == this.b) {
          break label651;
        }
        if (k == -1)
        {
          break label651;
          if (m != 0) {
            break label151;
          }
          throw new gjf("Duplicate account.");
        }
      }
      int m = 0;
      continue;
      label151:
      int n;
      if ((i == -1) || (j != 0))
      {
        n = this.f.d();
        this.f.h(n);
      }
      for (int i1 = n;; i1 = i)
      {
        SharedPreferences.Editor localEditor = this.f.a.edit();
        if (j != 0)
        {
          gjt localgjt2 = this.f;
          int i2 = this.b;
          String str1 = 12 + i2 + ".";
          String str2 = 12 + i1 + ".";
          Iterator localIterator1 = localgjt2.a.getAll().entrySet().iterator();
          while (localIterator1.hasNext())
          {
            Map.Entry localEntry = (Map.Entry)localIterator1.next();
            String str3 = (String)localEntry.getKey();
            if (str3.startsWith(str1))
            {
              String str4 = String.valueOf(str2);
              String str5 = String.valueOf(str3.substring(str1.length()));
              if (str5.length() != 0) {}
              Object localObject2;
              for (String str6 = str4.concat(str5);; str6 = new String(str4))
              {
                localObject2 = localEntry.getValue();
                if (!(localObject2 instanceof String)) {
                  break label414;
                }
                localEditor.putString(str6, (String)localObject2);
                break;
              }
              label414:
              if ((localObject2 instanceof Boolean)) {
                localEditor.putBoolean(str6, ((Boolean)localObject2).booleanValue());
              } else if ((localObject2 instanceof Integer)) {
                localEditor.putInt(str6, ((Integer)localObject2).intValue());
              } else if ((localObject2 instanceof Long)) {
                localEditor.putLong(str6, ((Long)localObject2).longValue());
              } else if ((localObject2 instanceof Float)) {
                localEditor.putFloat(str6, ((Float)localObject2).floatValue());
              } else if ((localObject2 instanceof Set)) {
                localEditor.putStringSet(str6, (Set)localObject2);
              }
            }
          }
          this.f.g(this.b);
        }
        a(i1, localEditor);
        localEditor.apply();
        this.f.e();
        if (i1 != this.b)
        {
          Iterator localIterator2 = this.f.c().iterator();
          while (localIterator2.hasNext()) {
            localIterator2.next();
          }
        }
        this.f.f();
        return i1;
      }
      label651:
      m = 1;
    }
  }
  
  public gjc e(String paramString)
  {
    a(paramString, gjt.b);
    return this;
  }
  
  public gjc f(String paramString)
  {
    gjt localgjt = this.f;
    int i = this.b;
    String str1 = String.valueOf(this.a);
    String str2 = String.valueOf(paramString);
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1)) {
      return new gjc(localgjt, i, str3, this.c);
    }
  }
  
  public String g(String paramString)
  {
    String str1 = String.valueOf(this.a);
    String str2 = String.valueOf(paramString);
    if (str2.length() != 0) {
      return str1.concat(str2);
    }
    return new String(str1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gjc
 * JD-Core Version:    0.7.0.1
 */