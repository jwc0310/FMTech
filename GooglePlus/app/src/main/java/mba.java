import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class mba
  implements mbk
{
  private static final int a = 7;
  private static final int b = 7;
  private final mbk[] c;
  
  public mba(Context paramContext, Set<String> paramSet)
  {
    String str1 = paramContext.getPackageName();
    try
    {
      ApplicationInfo localApplicationInfo2 = paramContext.getPackageManager().getApplicationInfo(str1, 128);
      localApplicationInfo1 = localApplicationInfo2;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      ArrayList localArrayList;
      for (;;)
      {
        HashSet localHashSet;
        Iterator localIterator;
        String str2;
        Log.wtf(String.format("Could not find application info for package: %s", new Object[] { str1 }), localNameNotFoundException);
        ApplicationInfo localApplicationInfo1 = null;
        continue;
        Bundle localBundle = localApplicationInfo1.metaData;
        continue;
        if (str2.startsWith("module:"))
        {
          String str3 = str2.substring(b);
          localHashSet.add(str3);
          if ((paramSet == null) || (!paramSet.contains(str3)))
          {
            String str4 = String.valueOf("gen_binder.");
            String str5 = String.valueOf(str3.replace('.', '$'));
            if (str5.length() != 0) {}
            for (String str6 = str4.concat(str5);; str6 = new String(str4))
            {
              localArrayList.add(a(str6));
              if ((paramSet == null) || (!Log.isLoggable("Binder", 5))) {
                break;
              }
              String str7 = String.valueOf(str3);
              if (str7.length() == 0) {
                break label340;
              }
              "***WARNING*** Root module does not include ".concat(str7);
              break;
            }
            label340:
            new String("***WARNING*** Root module does not include ");
          }
        }
      }
      label353:
      this.c = ((mbk[])localArrayList.toArray(new mbk[localArrayList.size()]));
    }
    if (localApplicationInfo1 == null)
    {
      localBundle = null;
      localArrayList = new ArrayList();
      localHashSet = new HashSet();
      if (localBundle == null) {
        break label353;
      }
      localIterator = localApplicationInfo1.metaData.keySet().iterator();
      for (;;)
      {
        if (!localIterator.hasNext()) {
          break label353;
        }
        str2 = (String)localIterator.next();
        if (str2.startsWith("MODULE.")) {
          localArrayList.add(a(localBundle.getString(str2)));
        }
        if (!str2.startsWith("MODULE:")) {
          break;
        }
        localArrayList.add(a(str2.substring(a)));
      }
    }
  }
  
  private static mbk a(String paramString)
  {
    String str1;
    try
    {
      mbk localmbk = (mbk)Class.forName(paramString).newInstance();
      return localmbk;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      String str5 = String.valueOf(paramString);
      if (str5.length() != 0) {}
      for (String str6 = "Failed to add stitch module ".concat(str5);; str6 = new String("Failed to add stitch module ")) {
        throw new RuntimeException(str6, localIllegalAccessException);
      }
    }
    catch (InstantiationException localInstantiationException)
    {
      String str3 = String.valueOf(paramString);
      if (str3.length() != 0) {}
      for (String str4 = "Failed to add stitch module ".concat(str3);; str4 = new String("Failed to add stitch module ")) {
        throw new RuntimeException(str4, localInstantiationException);
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      str1 = String.valueOf(paramString);
      if (str1.length() == 0) {}
    }
    for (String str2 = "Failed to add stitch module ".concat(str1);; str2 = new String("Failed to add stitch module ")) {
      throw new RuntimeException(str2, localClassNotFoundException);
    }
  }
  
  public final void a(Context paramContext, Class<?> paramClass, mbb parammbb)
  {
    for (int i = 0; i < this.c.length; i++) {
      this.c[i].a(paramContext, paramClass, parammbb);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mba
 * JD-Core Version:    0.7.0.1
 */