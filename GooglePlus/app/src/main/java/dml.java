import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public final class dml
{
  private final giz a;
  private Context b;
  private ftz c;
  
  private dml(Context paramContext)
  {
    this.b = paramContext;
    this.c = ((ftz)mbb.a(paramContext, ftz.class));
    this.a = ((giz)mbb.a(paramContext, giz.class));
  }
  
  private final String a(int paramInt)
  {
    SharedPreferences localSharedPreferences = this.b.getSharedPreferences("com.google.android.plus.GCM", 0);
    String str1 = localSharedPreferences.getString("regIds", null);
    long l = localSharedPreferences.getLong("reg_timestamp", 0L);
    if ((TextUtils.isEmpty(str1)) || (System.currentTimeMillis() - l > 86400000L)) {}
    for (int i = 1;; i = 0)
    {
      gxx localgxx = (gxx)mbb.a(this.b, gxx.class);
      label214:
      String str2;
      if (i != 0)
      {
        try
        {
          String str4 = this.c.a("862067606707");
          str3 = str4;
          try
          {
            if (TextUtils.isEmpty(str3)) {
              break label285;
            }
            if (Log.isLoggable("GcmManager", 3))
            {
              String str5 = String.valueOf(str3);
              if (str5.length() == 0) {
                break label214;
              }
              "Registered for GCM - regId: ".concat(str5);
            }
            for (;;)
            {
              SharedPreferences.Editor localEditor = localSharedPreferences.edit();
              localEditor.putString("regIds", str3);
              localEditor.putLong("reg_timestamp", System.currentTimeMillis());
              localEditor.commit();
              gxw localgxw3 = new gxw(this.b, paramInt);
              localgxw3.c = gxz.bs;
              localgxw3.d = gya.w;
              localgxx.a(localgxw3);
              return str3;
              new String("Registered for GCM - regId: ");
            }
            localgxw1 = new gxw(this.b, paramInt);
          }
          catch (IOException localIOException2) {}
        }
        catch (IOException localIOException1)
        {
          for (;;)
          {
            gxw localgxw1;
            String str3 = str1;
            localObject = localIOException1;
          }
        }
        localgxw1.c = gxz.bt;
        localgxw1.d = gya.w;
        localgxx.a(localgxw1);
        Log.e("GcmManager", "Failed to subscribe to GCM group ", localIOException2);
        str2 = str3;
      }
      for (;;)
      {
        return str2;
        label285:
        gxw localgxw2 = new gxw(this.b, paramInt);
        localgxw2.c = gxz.by;
        localgxw2.d = gya.w;
        localgxx.a(localgxw2);
        str2 = str3;
        continue;
        Object localObject;
        str2 = str1;
      }
    }
  }
  
  private final String a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (Log.isLoggable("GcmManager", 3))
    {
      String str3 = String.valueOf(this.a.a(paramInt).b("account_name"));
      new StringBuilder(65 + String.valueOf(paramString1).length() + String.valueOf(str3).length() + String.valueOf(paramString2).length() + String.valueOf(paramString3).length() + String.valueOf(paramString4).length()).append("executeHttpOperation ").append(paramString1).append(" account: ").append(str3).append(" regId: ").append(paramString2).append(" group: ").append(paramString3).append(" notificationKey: ").append(paramString4);
    }
    icd localicd = new icd(this.b, new kcg(this.b, paramInt), paramString1, paramString2, paramString3, paramString4, "862067606707");
    localicd.i();
    localicd.c("GcmManager");
    Context localContext = this.b;
    int i = localicd.t;
    int j;
    int k;
    String str1;
    Bundle localBundle;
    if (!localicd.n())
    {
      j = 1;
      k = localicd.o;
      str1 = localicd.p;
      if (TextUtils.equals("add", paramString1))
      {
        if (j == 0) {
          break label327;
        }
        localBundle = null;
        if (i <= 1) {
          break label403;
        }
        if (j == 0) {
          break label395;
        }
      }
    }
    Object localObject;
    label395:
    for (gxz localgxz2 = gxz.bw;; localgxz2 = gxz.bx)
    {
      localObject = localgxz2;
      gxx localgxx = (gxx)mbb.a(localContext, gxx.class);
      gxw localgxw = new gxw(localContext, paramInt);
      localgxw.c = ((gxz)localObject);
      localgxw.d = gya.w;
      if (localBundle != null) {
        localgxw.h.putAll(localBundle);
      }
      localgxx.a(localgxw);
      return localicd.a;
      j = 0;
      break;
      label327:
      if (TextUtils.isEmpty(str1)) {}
      for (String str2 = String.valueOf(k);; str2 = 12 + String.valueOf(str1).length() + k + " " + str1)
      {
        localBundle = gxy.a("extra_error_code", str2);
        break;
      }
    }
    label403:
    if (j != 0) {}
    for (gxz localgxz1 = gxz.bu;; localgxz1 = gxz.bv)
    {
      localObject = localgxz1;
      break;
    }
  }
  
  private static String a(Set<String> paramSet)
  {
    if ((paramSet == null) || (paramSet.isEmpty())) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramSet.iterator();
    while (localIterator.hasNext())
    {
      localStringBuilder.append((String)localIterator.next());
      localStringBuilder.append(' ');
    }
    return localStringBuilder.toString();
  }
  
  public static Set<String> a(String paramString)
  {
    HashSet localHashSet = new HashSet();
    if (!TextUtils.isEmpty(paramString))
    {
      StringTokenizer localStringTokenizer = new StringTokenizer(paramString);
      while (localStringTokenizer.hasMoreTokens()) {
        localHashSet.add(localStringTokenizer.nextToken());
      }
    }
    return localHashSet;
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    dml localdml = new dml(paramContext);
    String str1;
    if (paramInt != -1)
    {
      str1 = localdml.a(paramInt);
      if (!TextUtils.isEmpty(str1)) {
        break label46;
      }
      Log.e("GcmManager", "Failed to subscribe to GCM: The registraion ID is null.");
    }
    label46:
    label475:
    label993:
    label1005:
    for (;;)
    {
      localdml.c.a();
      return;
      SharedPreferences localSharedPreferences1 = localdml.b.getSharedPreferences("com.google.android.plus.GCM", 0);
      Set localSet1 = a(localSharedPreferences1.getString("destinations", null));
      List localList = localdml.a.a(new String[] { "logged_in" });
      HashSet localHashSet = new HashSet(localSet1);
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator1 = localList.iterator();
      while (localIterator1.hasNext())
      {
        int k = ((Integer)localIterator1.next()).intValue();
        String str13 = localdml.a.a(k).b("gaia_id");
        if (!localSet1.contains(str13)) {
          localArrayList.add(Integer.valueOf(k));
        }
        localHashSet.remove(str13);
      }
      Iterator localIterator2 = localArrayList.iterator();
      while (localIterator2.hasNext())
      {
        int i = ((Integer)localIterator2.next()).intValue();
        gjb localgjb1 = localdml.a.a(i);
        gjb localgjb2 = localdml.a.a(i);
        String str4 = localgjb2.b("account_name");
        String str5 = localgjb2.b("gaia_id");
        if (Log.isLoggable("GcmManager", 3)) {
          new StringBuilder(49 + String.valueOf(str1).length() + String.valueOf(str4).length() + String.valueOf(str5).length()).append("addDestinationToGroup - regId: ").append(str1).append(" account: ").append(str4).append(" group: ").append(str5);
        }
        bgp.c(localdml.b, i, false);
        String str6 = localdml.a(i, "add", str1, str5, null);
        String str10;
        String str12;
        if (!TextUtils.isEmpty(str6))
        {
          SharedPreferences localSharedPreferences2 = localdml.b.getSharedPreferences("com.google.android.plus.GCM", 0);
          Set localSet2 = a(localSharedPreferences2.getString("destinations", null));
          localSet2.add(str5);
          SharedPreferences.Editor localEditor2 = localSharedPreferences2.edit();
          str10 = String.valueOf("sendTo_");
          String str11 = String.valueOf(str5);
          if (str11.length() != 0)
          {
            str12 = str10.concat(str11);
            localEditor2.putString(str12, str6);
            localEditor2.putString("destinations", a(localSet2));
            localEditor2.commit();
            a(localSharedPreferences2, str5);
          }
        }
        for (int j = 1;; j = 0)
        {
          if (j == 0) {
            break label643;
          }
          if (!Log.isLoggable("GcmManager", 3)) {
            break;
          }
          String str8 = String.valueOf(localgjb1.b("account_name"));
          String str9 = String.valueOf(localgjb1.b("gaia_id"));
          new StringBuilder(47 + String.valueOf(str8).length() + String.valueOf(str9).length()).append("Added unregistered destination ").append(str8).append(" [").append(str9).append("] to GCM group");
          break;
          str12 = new String(str10);
          break label475;
        }
        if (Log.isLoggable("GcmManager", 3))
        {
          String str7 = String.valueOf(localgjb1.b("gaia_id"));
          Log.e("GcmManager", 52 + String.valueOf(str7).length() + "Failed to add unregistered destination " + str7 + " to GCM group");
        }
        else
        {
          Log.e("GcmManager", "Failed to add unregistered destination to GCM group");
        }
      }
      Iterator localIterator3 = localHashSet.iterator();
      while (localIterator3.hasNext())
      {
        String str3 = (String)localIterator3.next();
        if (localdml.a(str1, paramInt, str3))
        {
          if (Log.isLoggable("GcmManager", 3)) {
            new StringBuilder(48 + String.valueOf(str3).length()).append("Removed unregistered destination ").append(str3).append(" from GCM group");
          }
        }
        else if (Log.isLoggable("GcmManager", 3)) {
          Log.e("GcmManager", 57 + String.valueOf(str3).length() + "Failed to remove unregistered destination " + str3 + " from GCM group");
        } else {
          Log.e("GcmManager", "Failed to remove unregistered destination from GCM group");
        }
      }
      if (Log.isLoggable("GcmManager", 3))
      {
        String str2 = String.valueOf(localSharedPreferences1.getString("destinations", null));
        if (str2.length() == 0) {
          break label993;
        }
        "Updated destinations: ".concat(str2);
      }
      for (;;)
      {
        for (;;)
        {
          if (!localList.isEmpty()) {
            break label1005;
          }
          try
          {
            localdml.c.b();
            SharedPreferences.Editor localEditor1 = localdml.b.getSharedPreferences("com.google.android.plus.GCM", 0).edit();
            localEditor1.clear();
            localEditor1.commit();
          }
          catch (IOException localIOException)
          {
            Log.e("GcmManager", "Failed to clear GCM registration");
          }
        }
        break;
        new String("Updated destinations: ");
      }
    }
  }
  
  private static void a(SharedPreferences paramSharedPreferences, String paramString)
  {
    Set localSet = a(paramSharedPreferences.getString("destinations", null));
    localSet.add(paramString);
    SharedPreferences.Editor localEditor = paramSharedPreferences.edit();
    String str = a(localSet);
    if (Log.isLoggable("GcmManager", 3)) {
      new StringBuilder(59 + String.valueOf(paramString).length() + String.valueOf(str).length()).append("Add a new destination ").append(paramString).append(". The registered destinations are <").append(str).append(">.");
    }
    localEditor.putString("destinations", str);
    localEditor.commit();
  }
  
  private final boolean a(String paramString1, int paramInt, String paramString2)
  {
    if (Log.isLoggable("GcmManager", 3))
    {
      String str8 = String.valueOf(this.a.a(paramInt).b("account_name"));
      new StringBuilder(60 + String.valueOf(paramString1).length() + String.valueOf(str8).length() + String.valueOf(paramString2).length()).append("removeDestinationFromGroup - regId: ").append(paramString1).append(" account: ").append(str8).append(" destination: ").append(paramString2);
    }
    SharedPreferences localSharedPreferences = this.b.getSharedPreferences("com.google.android.plus.GCM", 0);
    String str1 = String.valueOf("sendTo_");
    String str2 = String.valueOf(paramString2);
    if (str2.length() != 0) {}
    String str4;
    for (String str3 = str1.concat(str2);; str3 = new String(str1))
    {
      str4 = localSharedPreferences.getString(str3, null);
      if (!TextUtils.isEmpty(str4)) {
        break;
      }
      return false;
    }
    try
    {
      if (!TextUtils.isEmpty(a(paramInt, "remove", paramString1, paramString2, str4)))
      {
        Set localSet = a(localSharedPreferences.getString("destinations", null));
        localSet.remove(paramString2);
        SharedPreferences.Editor localEditor = localSharedPreferences.edit();
        String str5 = String.valueOf("sendTo_");
        String str6 = String.valueOf(paramString2);
        if (str6.length() != 0) {}
        for (String str7 = str5.concat(str6);; str7 = new String(str5))
        {
          localEditor.remove(str7);
          localEditor.putString("destinations", a(localSet));
          localEditor.commit();
          return true;
        }
      }
      return false;
    }
    catch (Exception localException)
    {
      Log.e("GcmManager", "removeDestinationFromGroup failed", localException);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dml
 * JD-Core Version:    0.7.0.1
 */