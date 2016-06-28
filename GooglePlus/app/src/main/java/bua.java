import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import com.google.android.apps.photos.content.GooglePhotosImageProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class bua
{
  private static final String[] a = { "cluster_id", "title", "subtitle", "cluster_count", "media_attr" };
  private static final String[] b = { "timestamp" };
  private static final String[] c = { "last_aam_snapshot", "seen_aams" };
  private static AsyncTask<Void, Void, Void> d;
  private static final String[] e = { "filename", "representation_type" };
  private static final int f = aaw.fJ;
  private static final SparseIntArray g = new SparseIntArray();
  
  public static Uri a(Context paramContext, Uri paramUri)
  {
    String str;
    if (!GooglePhotosImageProvider.a().equals(paramUri.getAuthority()))
    {
      str = null;
      if (str != null) {
        break label59;
      }
    }
    label59:
    Uri localUri;
    do
    {
      Iterator localIterator;
      while (!localIterator.hasNext())
      {
        return paramUri;
        if (paramUri.getPathSegments().size() < 2)
        {
          str = null;
          break;
        }
        str = Uri.decode((String)paramUri.getPathSegments().get(1));
        break;
        localIterator = ((giz)mbb.a(paramContext, giz.class)).a(new String[] { "logged_in" }).iterator();
      }
      localUri = c(paramContext, ((Integer)localIterator.next()).intValue(), str);
    } while (localUri == null);
    return localUri;
  }
  
  static Pair<Long, Long> a(Context paramContext, int paramInt, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return Pair.create(Long.valueOf(-1L), Long.valueOf(-1L));
    }
    String[] arrayOfString = b;
    Cursor localCursor = bqj.a(paramContext, paramInt).getWritableDatabase().query(true, "all_tiles", arrayOfString, "view_id = ? AND type = 4", new String[] { paramString }, null, null, "view_order", null);
    long l1 = -1L;
    long l2 = -1L;
    for (;;)
    {
      try
      {
        if (localCursor.moveToNext())
        {
          long l3 = localCursor.getLong(0);
          if (l3 != 0L)
          {
            if ((l2 == -1L) || (l2 < l3)) {
              l2 = l3;
            }
            if ((l1 == -1L) || (l1 > l3))
            {
              l1 = l3;
              l4 = l2;
              l2 = l4;
            }
          }
        }
        else
        {
          return Pair.create(Long.valueOf(l1), Long.valueOf(l2));
        }
      }
      finally
      {
        localCursor.close();
      }
      long l4 = l2;
    }
  }
  
  private static String a(int paramInt)
  {
    String str = String.valueOf("mm_utils\\");
    return 11 + String.valueOf(str).length() + str + paramInt;
  }
  
  public static List<ivi> a(Context paramContext, int paramInt, String paramString, boolean paramBoolean)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
    Cursor localCursor1 = bss.a(localSQLiteDatabase, paramString);
    Cursor localCursor2 = bss.b(localSQLiteDatabase, paramString);
    Cursor localCursor3 = bss.c(localSQLiteDatabase, paramString);
    try
    {
      List localList = a(paramContext, false, new Cursor[] { localCursor1, localCursor2, localCursor3 });
      return localList;
    }
    finally
    {
      localCursor1.close();
      localCursor2.close();
      if (localCursor3 != null) {
        localCursor3.close();
      }
    }
  }
  
  private static List<ivi> a(Context paramContext, boolean paramBoolean, Cursor... paramVarArgs)
  {
    iab localiab = ((ifj)mbb.a(paramContext, ifj.class)).f();
    HashSet localHashSet = new HashSet();
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < 3; i++)
    {
      Cursor localCursor = paramVarArgs[i];
      for (;;)
      {
        if ((localCursor != null) && (localCursor.moveToNext()))
        {
          ipm localipm = jrf.a(localCursor.getLong(0));
          ivk localivk;
          label131:
          String str1;
          String str3;
          switch (bue.a[localipm.ordinal()])
          {
          default: 
            throw new IllegalArgumentException("Unknown media type");
          case 1: 
            localivk = ivk.a;
            str1 = localCursor.getString(2);
            if ((!localHashSet.contains(str1)) && (!TextUtils.isEmpty(str1)) && (localivk != null)) {
              if (localivk == ivk.b) {
                str3 = localCursor.getString(1);
              }
            }
            break;
          case 2: 
          case 3: 
          case 4: 
            try
            {
              ojf localojf1 = new ojf();
              byte[] arrayOfByte = localCursor.getBlob(3);
              localojf2 = (ojf)qat.b(localojf1, arrayOfByte, 0, arrayOfByte.length);
              if (!a(paramContext, str3, localojf2))
              {
                localUri1 = GooglePhotosImageProvider.a(paramContext, str1, localipm);
                if (!localCursor.isNull(5))
                {
                  localUri2 = Uri.parse(localCursor.getString(5));
                  if ((paramBoolean) && (localUri2 == null)) {
                    continue;
                  }
                  if (localUri2 == null) {
                    break label460;
                  }
                  localArrayList.add(new ivi(localUri2, localivk));
                  localHashSet.add(str1);
                  continue;
                  localivk = ivk.b;
                  break label131;
                  localivk = null;
                }
              }
            }
            catch (qas localqas)
            {
              for (;;)
              {
                Uri localUri1;
                Log.e("MovieMakerUtils", "Failed to parse photo data", localqas);
                ojf localojf2 = null;
                continue;
                boolean bool = localCursor.isNull(4);
                Uri localUri2 = null;
                if (!bool)
                {
                  String str2 = localCursor.getString(4);
                  localUri2 = Uri.parse(str2);
                  if ("content".equals(localUri2.getScheme()))
                  {
                    File localFile2 = GooglePhotosImageProvider.a(localUri2, paramContext);
                    if ((localFile2 != null) && (localFile2.exists())) {}
                  }
                  else
                  {
                    File localFile1;
                    do
                    {
                      localUri2 = null;
                      break;
                      localFile1 = localiab.a(str2);
                    } while ((localFile1 == null) || (!localFile1.exists()));
                    localUri2 = GooglePhotosImageProvider.a(paramContext, Uri.fromFile(localFile1).toString(), localipm);
                    continue;
                    label460:
                    localUri2 = localUri1;
                  }
                }
              }
            }
          }
        }
      }
    }
    return localArrayList;
  }
  
  public static Set<String> a(Context paramContext, int paramInt, boolean paramBoolean)
  {
    HashSet localHashSet = new HashSet();
    Cursor localCursor = b(paramContext, paramInt, null);
    for (;;)
    {
      try
      {
        if (!localCursor.moveToNext()) {
          break;
        }
        int i;
        if ((0x100000 & localCursor.getLong(4)) != 0L)
        {
          i = 1;
          if (1 == i) {
            localHashSet.add(localCursor.getString(0));
          }
        }
        else
        {
          i = 0;
        }
      }
      finally
      {
        localCursor.close();
      }
    }
    localCursor.close();
    return localHashSet;
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    b(paramContext, paramInt, false);
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences(a(paramInt), 0);
    SharedPreferences.Editor localEditor = localSharedPreferences.edit();
    localEditor.putInt("version", 1);
    for (String str : c) {
      if (localSharedPreferences.contains(str)) {
        localEditor.remove(str);
      }
    }
    localEditor.apply();
    paramContext.getSharedPreferences(a(paramInt), 0).edit().clear().apply();
  }
  
  @TargetApi(11)
  public static void a(Context paramContext, int paramInt, boolean paramBoolean, buf parambuf)
  {
    if (!((iwb)mbb.a(paramContext, iwb.class)).a(paramInt)) {
      return;
    }
    new bud(paramContext, paramInt, paramBoolean, parambuf).execute(new Void[0]);
  }
  
  public static boolean a(Context paramContext, String paramString, ojf paramojf)
  {
    Integer localInteger;
    int i;
    boolean bool2;
    if (paramojf != null)
    {
      localInteger = Integer.valueOf(paramojf.I);
      if (localInteger == null)
      {
        i = 0;
        if (i != 8) {
          break label44;
        }
        bool2 = true;
      }
    }
    label44:
    boolean bool1;
    do
    {
      return bool2;
      i = localInteger.intValue();
      break;
      bool1 = TextUtils.isEmpty(paramString);
      bool2 = false;
    } while (bool1);
    return ((ivl)mbb.a(paramContext, ivl.class)).e();
  }
  
  private static Cursor b(Context paramContext, int paramInt, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = bqj.a(paramContext, paramInt).getWritableDatabase();
    gjb localgjb = ((giz)mbb.a(paramContext, giz.class)).a(paramInt);
    String[] arrayOfString1 = new String[1];
    arrayOfString1[0] = localgjb.b("gaia_id");
    String[] arrayOfString2 = { jrf.a(0, arrayOfString1) };
    try
    {
      Cursor localCursor = localSQLiteDatabase.query(true, "all_tiles", a, "view_id = ?  AND type = 2 AND view_order > 50100 AND (NOT media_attr & 4194304)", arrayOfString2, null, null, "view_order", null);
      String str4;
      String str5;
      String str6;
      return localCursor;
    }
    finally
    {
      if (Log.isLoggable("MovieMakerUtils", 3))
      {
        String str1 = String.valueOf("[getClusterCursor], selection: ");
        String str2 = String.valueOf(Arrays.toString(arrayOfString2));
        String str3 = String.valueOf(Arrays.toString(a));
        new StringBuilder(28 + String.valueOf(str1).length() + String.valueOf("view_id = ?  AND type = 2 AND view_order > 50100 AND (NOT media_attr & 4194304)").length() + String.valueOf(str2).length() + String.valueOf(str3).length()).append(str1).append("view_id = ?  AND type = 2 AND view_order > 50100 AND (NOT media_attr & 4194304)").append(", selectionArgs: ").append(str2).append(", columns: ").append(str3);
      }
    }
  }
  
  public static List<ive> b(Context paramContext, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = b(paramContext, paramInt, null);
    for (;;)
    {
      try
      {
        gjb localgjb = ((giz)mbb.a(paramContext, giz.class)).a(paramInt);
        if (!localCursor.moveToNext()) {
          break;
        }
        ivg localivg = new ivg(localgjb.b("gaia_id"), localCursor.getString(0));
        String str1 = localCursor.getString(1);
        String str2 = localCursor.getString(2);
        int i = localCursor.getInt(3);
        boolean bool;
        if ((0x100000 & localCursor.getLong(4)) != 0L)
        {
          bool = true;
          localArrayList.add(new ive(localivg, str1, str2, i, bool));
        }
        else
        {
          bool = false;
        }
      }
      finally
      {
        localCursor.close();
      }
    }
    localCursor.close();
    return localArrayList;
  }
  
  public static void b(Context paramContext, int paramInt, boolean paramBoolean)
  {
    if (paramInt == -1) {}
    SharedPreferences.Editor localEditor;
    for (;;)
    {
      return;
      synchronized (g)
      {
        int i = g.indexOfKey(paramInt);
        if (i >= 0) {
          g.removeAt(i);
        }
        ((NotificationManager)paramContext.getSystemService("notification")).cancel(Integer.toString(paramInt), f);
        if (paramBoolean)
        {
          new bua();
          if (((iwb)mbb.a(paramContext, iwb.class)).a(paramInt))
          {
            SharedPreferences localSharedPreferences1 = paramContext.getSharedPreferences(a(paramInt), 0);
            localEditor = localSharedPreferences1.edit();
            localEditor.putInt("version", 1);
            String[] arrayOfString = c;
            int j = arrayOfString.length;
            int k = 0;
            if (k < j)
            {
              String str = arrayOfString[k];
              if (localSharedPreferences1.contains(str)) {
                localEditor.remove(str);
              }
              k++;
            }
          }
        }
      }
    }
    localEditor.apply();
    SharedPreferences localSharedPreferences2 = paramContext.getSharedPreferences(a(paramInt), 0);
    long l = System.currentTimeMillis();
    localSharedPreferences2.edit().putLong("last_new_system_app_dismiss_time", l).apply();
    ((ivl)mbb.a(paramContext, ivl.class)).h();
  }
  
  private static Uri c(Context paramContext, int paramInt, String paramString)
  {
    String str1 = jqx.a(paramContext, paramString, paramInt);
    if (str1 != null)
    {
      Uri localUri3 = Uri.parse(str1);
      if (("content".equals(localUri3.getScheme())) && ("media".equals(localUri3.getAuthority())) && (GooglePhotosImageProvider.a(localUri3, paramContext) != null)) {
        return localUri3;
      }
    }
    Cursor localCursor = bqj.a(paramContext, paramInt).getReadableDatabase().query("media_cache", e, "image_url = ? AND representation_type IN(2, 8)", new String[] { paramString }, null, null, null);
    try
    {
      iab localiab = ((ifj)mbb.a(paramContext, ifj.class)).f();
      if (localCursor.moveToFirst())
      {
        String str2 = localCursor.getString(0);
        if (localCursor.getInt(1) == 8) {}
        for (ipm localipm = ipm.b;; localipm = ipm.a)
        {
          Uri localUri1 = Uri.parse(str2);
          if (!"content".equals(localUri1.getScheme())) {
            break;
          }
          File localFile2 = GooglePhotosImageProvider.a(localUri1, paramContext);
          if (localFile2 == null) {
            break label256;
          }
          boolean bool = localFile2.exists();
          if (!bool) {
            break label256;
          }
          return localUri1;
        }
        File localFile1 = localiab.a(str2);
        if ((localFile1 != null) && (localFile1.exists()))
        {
          Uri localUri2 = GooglePhotosImageProvider.a(paramContext, Uri.fromFile(localFile1).toString(), localipm);
          return localUri2;
        }
      }
      label256:
      return null;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  public static void c(Context paramContext, int paramInt)
  {
    if (!((iwb)mbb.a(paramContext, iwb.class)).a(paramInt)) {
      return;
    }
    if (d != null) {
      d.cancel(true);
    }
    d = new bub(paramContext, paramInt).execute(new Void[0]);
  }
  
  @TargetApi(11)
  public static void c(Context paramContext, int paramInt, boolean paramBoolean)
  {
    a(paramContext, paramInt, paramBoolean, null);
  }
  
  public static void d(Context paramContext, int paramInt)
  {
    iwb localiwb = (iwb)mbb.a(paramContext, iwb.class);
    if ((Build.VERSION.SDK_INT < 11) || (!localiwb.a(paramInt))) {}
    ArrayList localArrayList2;
    for (Object localObject = Collections.emptyList(); ((List)localObject).size() > 0; localObject = localArrayList2)
    {
      ivl localivl = (ivl)mbb.a(paramContext, ivl.class);
      if ((((iwb)mbb.a(paramContext, iwb.class)).a(paramInt)) && (localivl != null)) {
        localivl.f();
      }
      return;
      SharedPreferences localSharedPreferences1 = paramContext.getSharedPreferences(a(paramInt), 0);
      SharedPreferences.Editor localEditor = localSharedPreferences1.edit();
      localEditor.putInt("version", 1);
      for (String str2 : c) {
        if (localSharedPreferences1.contains(str2)) {
          localEditor.remove(str2);
        }
      }
      localEditor.apply();
      SharedPreferences localSharedPreferences2 = paramContext.getSharedPreferences(a(paramInt), 0);
      long l1 = localSharedPreferences2.getLong("aam_cluster_max_view_timestamp", 0L);
      ArrayList localArrayList1 = new ArrayList();
      Iterator localIterator = a(paramContext, paramInt, true).iterator();
      while (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        Pair localPair = a(paramContext, paramInt, str1);
        long l2 = ((Long)localPair.first).longValue();
        ((ivl)mbb.a(paramContext, ivl.class)).h();
        if (l2 > l1) {
          localArrayList1.add(new Pair(localPair.second, str1));
        }
      }
      localSharedPreferences2.edit().putInt("new_aam_count", localArrayList1.size()).apply();
      Collections.sort(localArrayList1, new buc());
      localArrayList2 = new ArrayList(localArrayList1.size());
      int k = localArrayList1.size();
      for (int m = 0; m < k; m++) {
        localArrayList2.add(((Pair)localArrayList1.get(m)).second);
      }
      ((ivl)mbb.a(paramContext, ivl.class)).h();
    }
    b(paramContext, paramInt, false);
  }
  
  @TargetApi(11)
  public static int e(Context paramContext, int paramInt)
  {
    if (Build.VERSION.SDK_INT < 11) {
      return 0;
    }
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences(a(paramInt), 0);
    SharedPreferences.Editor localEditor = localSharedPreferences.edit();
    localEditor.putInt("version", 1);
    for (String str : c) {
      if (localSharedPreferences.contains(str)) {
        localEditor.remove(str);
      }
    }
    localEditor.apply();
    return paramContext.getSharedPreferences(a(paramInt), 0).getInt("new_aam_count", 0);
  }
  
  public static boolean f(Context paramContext, int paramInt)
  {
    ivl localivl = (ivl)mbb.a(paramContext, ivl.class);
    if ((((iwb)mbb.a(paramContext, iwb.class)).a(paramInt)) && (localivl != null)) {
      localivl.g();
    }
    return false;
  }
  
  static SharedPreferences g(Context paramContext, int paramInt)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences(a(paramInt), 0);
    SharedPreferences.Editor localEditor = localSharedPreferences.edit();
    localEditor.putInt("version", 1);
    for (String str : c) {
      if (localSharedPreferences.contains(str)) {
        localEditor.remove(str);
      }
    }
    localEditor.apply();
    return paramContext.getSharedPreferences(a(paramInt), 0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bua
 * JD-Core Version:    0.7.0.1
 */