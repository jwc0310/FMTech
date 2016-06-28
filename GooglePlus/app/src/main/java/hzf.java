import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class hzf
  implements hze
{
  private final Context a;
  private final hzb b;
  private final ArrayList<hyg> c = new ArrayList();
  
  hzf(Context paramContext)
  {
    this.a = paramContext;
    this.b = new hzb(paramContext);
  }
  
  private final String a(nng[] paramArrayOfnng)
  {
    if ((paramArrayOfnng == null) || (paramArrayOfnng.length == 0)) {
      return "";
    }
    int j;
    int m;
    int k;
    for (;;)
    {
      try
      {
        int i = paramArrayOfnng.length;
        if (i < 0) {
          break;
        }
        j = qal.d(i);
      }
      catch (IOException localIOException)
      {
        nng localnng2;
        int i1;
        byte[] arrayOfByte;
        qal localqal;
        int n;
        String str;
        Log.e("ExperimentLoader", "Failed to serialize experiment data", localIOException);
        return "";
      }
      if (m < paramArrayOfnng.length)
      {
        localnng2 = paramArrayOfnng[m];
        i1 = localnng2.a();
        localnng2.ak = i1;
        k += i1 + qal.d(i1);
        m++;
      }
      else
      {
        arrayOfByte = new byte[k];
        localqal = new qal(arrayOfByte, 0, arrayOfByte.length);
        localqal.a(paramArrayOfnng.length);
        for (n = 0; n < paramArrayOfnng.length; n++)
        {
          nng localnng1 = paramArrayOfnng[n];
          if (localnng1.ak < 0) {
            localnng1.ak = localnng1.a();
          }
          localqal.c(localnng1.ak);
          localnng1.a(localqal);
        }
        str = Base64.encodeToString(arrayOfByte, 0);
        return str;
      }
    }
    for (;;)
    {
      k = j + 0;
      m = 0;
      break;
      j = 10;
    }
  }
  
  private static nng[] b(String paramString)
  {
    int i = 0;
    nng[] arrayOfnng;
    if ((paramString == null) || (paramString.length() == 0)) {
      arrayOfnng = null;
    }
    for (;;)
    {
      return arrayOfnng;
      try
      {
        byte[] arrayOfByte = Base64.decode(paramString, 0);
        qak localqak = new qak(arrayOfByte, 0, arrayOfByte.length);
        int j = localqak.i();
        arrayOfnng = new nng[j];
        while (i < j)
        {
          nng localnng = new nng();
          localqak.a(localnng);
          arrayOfnng[i] = localnng;
          i++;
        }
        return null;
      }
      catch (Throwable localThrowable)
      {
        Log.e("ExperimentLoader", "Unable to parse experiments", localThrowable);
      }
    }
  }
  
  public final Map<String, String> a(String paramString)
  {
    String str1 = this.b.a.getSharedPreferences("accounts", 0).getString(hzb.a(paramString), null);
    if (str1 != null) {}
    for (nng[] arrayOfnng = b(str1);; arrayOfnng = null)
    {
      if (arrayOfnng == null) {
        return null;
      }
      int i = arrayOfnng.length;
      HashMap localHashMap = new HashMap(i);
      int j = 0;
      nng localnng;
      int k;
      String str2;
      if (j < i)
      {
        localnng = arrayOfnng[j];
        k = localnng.b;
        if ((k == -2147483648) || (k == 1)) {
          str2 = "true";
        }
      }
      for (;;)
      {
        if (str2 != null) {
          localHashMap.put(localnng.a, str2);
        }
        j++;
        break;
        if (k == 4)
        {
          if (localnng.c != null) {
            str2 = localnng.c.c;
          } else {
            str2 = null;
          }
        }
        else
        {
          if (k == 3)
          {
            if ((localnng.c != null) && (localnng.c.b != null)) {
              str2 = Double.toString(localnng.c.b.doubleValue());
            }
          }
          else if ((k == 2) && (localnng.c != null) && (localnng.c.a != null))
          {
            str2 = Long.toString(localnng.c.a.longValue());
            continue;
            return localHashMap;
          }
          str2 = null;
        }
      }
    }
  }
  
  public final void a(hyg paramhyg)
  {
    this.c.add(paramhyg);
  }
  
  public final void a(String paramString, nng[] paramArrayOfnng)
  {
    String str1 = a(paramArrayOfnng);
    hzb localhzb = this.b;
    SharedPreferences localSharedPreferences1 = localhzb.a.getSharedPreferences("accounts", 0);
    String str2 = hzb.a(paramString);
    if (!TextUtils.equals(localSharedPreferences1.getString(str2, null), str1))
    {
      SharedPreferences.Editor localEditor2 = localSharedPreferences1.edit();
      localEditor2.putString(str2, str1);
      localEditor2.apply();
    }
    long l = ((hgs)mbb.a(localhzb.a, hgs.class)).a();
    SharedPreferences localSharedPreferences2 = localhzb.a.getSharedPreferences("accounts", 0);
    String str3 = hzb.b(paramString);
    SharedPreferences.Editor localEditor1 = localSharedPreferences2.edit();
    localEditor1.putLong(str3, l);
    localEditor1.apply();
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext()) {
      ((hyg)localIterator.next()).g();
    }
  }
  
  public final boolean a(List<String> paramList, String paramString)
  {
    hzp localhzp = new hzp(this.a, new kcg(paramString, null), paramList);
    localhzp.i();
    try
    {
      localhzp.d("ExperimentLoader");
      boolean bool = localhzp.x;
      qat localqat = null;
      if (bool) {
        localqat = localhzp.w;
      }
      a(paramString, ((mts)localqat).a.a);
      return true;
    }
    catch (IOException localIOException) {}
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hzf
 * JD-Core Version:    0.7.0.1
 */