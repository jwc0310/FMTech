package com.google.android.libraries.social.autobackup;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings.System;
import android.text.TextUtils;
import android.util.Log;
import efj;
import giz;
import gjb;
import hau;
import hba;
import hbu;
import hbw;
import hcd;
import hci;
import hcl;
import ial;
import iao;
import iaw;
import iuh;
import iuj;
import iuk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kl;
import mbb;
import mcq;

public final class AutoBackupProvider
  extends ContentProvider
{
  private static final mcq a = new mcq("debug.iu.auto_backup_provider");
  private static final String b = MediaRecordEntry.a.a;
  private static final String[] c = { "_id" };
  private static final Object d = new Object();
  private static final hbw e = new hbw();
  private static final Map<String, String> g = new kl();
  private static final Set<String> h = new HashSet();
  private static final Set<String> i = new HashSet();
  private static final kl<String, String> j;
  private static final kl<String, String> k;
  private final UriMatcher f = new UriMatcher(-1);
  
  static
  {
    h.addAll(Arrays.asList(new String[] { "quota_limit", "quota_used", "full_size_disabled", "upload_full_resolution", "quota_unlimited", "last_quota_update_timestamp" }));
    g.put("_id", "_id");
    g.put("upload_account_id", "upload_account_id");
    g.put("album_id", "album_id");
    g.put("bytes_total", "bytes_total");
    g.put("bytes_uploaded", "bytes_uploaded");
    g.put("media_url", "media_url");
    g.put("event_id", "event_id");
    g.put("fingerprint", "fingerprint");
    g.put("media_id", "media_id");
    g.put("upload_state", "upload_state");
    g.put("upload_reason", "upload_reason");
    g.put("upload_finish_time", "upload_finish_time");
    g.put("allow_full_res", "allow_full_res");
    i.addAll(Arrays.asList(new String[] { "instant_share_state", "instant_upload_state", "manual_upload_state", "upload_all_state" }));
    j = new kl();
    k = new kl();
    j.put("auto_upload_account_id", "-1");
    j.put("auto_upload_account_type", null);
    j.put("auto_upload_enabled", "0");
    j.put("sync_on_wifi_only", "1");
    j.put("video_upload_wifi_only", "1");
    j.put("local_folder_auto_backup", "0");
    j.put("sync_on_roaming", "0");
    j.put("sync_on_battery", "1");
    j.put("instant_share_eventid", null);
    j.put("instant_share_account_id", "-1");
    j.put("instant_share_starttime", "0");
    j.put("instant_share_endtime", "0");
    j.put("upload_full_resolution", "1");
    j.put("max_mobile_upload_size", Long.toString(157286400L));
    j.put("instant_upload_state", Integer.toString(0));
    j.put("instant_share_state", Integer.toString(0));
    j.put("upload_all_state", Integer.toString(0));
    j.put("manual_upload_state", Integer.toString(0));
    j.put("quota_limit", Long.toString(-1L));
    j.put("quota_used", Long.toString(-1L));
    j.put("quota_unlimited", "0");
    j.put("full_size_disabled", "1");
    j.put("gms_disabled_auto_backup", "0");
    j.put("last_quota_update_timestamp", "-1");
    k.put("sync_photo_on_mobile", "0");
  }
  
  private static int a(Context paramContext, Uri paramUri)
  {
    int m = iaw.a(paramUri.getQueryParameter("account_id"), -1);
    if (m == -1) {
      m = ((hba)mbb.a(paramContext, hba.class)).d();
    }
    return m;
  }
  
  private final int a(String paramString, String[] paramArrayOfString)
  {
    hau localhau = (hau)mbb.b(getContext(), hau.class);
    int m;
    if (localhau == null) {
      m = 0;
    }
    do
    {
      return m;
      Cursor localCursor = a(b, g, c, paramString, paramArrayOfString, null, null);
      try
      {
        while (localCursor.moveToNext())
        {
          long l = localCursor.getLong(0);
          localhau.c.obtainMessage(4, Long.valueOf(l)).sendToTarget();
        }
        m = ((hci)mbb.a(getContext(), hci.class)).getWritableDatabase().delete(b, paramString, paramArrayOfString);
      }
      finally
      {
        localCursor.close();
      }
    } while (m <= 0);
    getContext().getContentResolver().notifyChange(hbu.a(getContext()), null);
    return m;
  }
  
  private final Cursor a(Uri paramUri, String[] paramArrayOfString)
  {
    int m = a(getContext(), paramUri);
    MatrixCursor localMatrixCursor;
    Object[] arrayOfObject;
    SharedPreferences localSharedPreferences;
    int i1;
    int i2;
    String str1;
    for (;;)
    {
      synchronized (d)
      {
        localMatrixCursor = new MatrixCursor(paramArrayOfString);
        arrayOfObject = new Object[paramArrayOfString.length];
        Context localContext = getContext();
        localSharedPreferences = localContext.getSharedPreferences("iu_settings", 0);
        a(localContext, localSharedPreferences);
        int n = paramArrayOfString.length;
        i1 = 0;
        i2 = 0;
        if (i1 >= n) {
          break label346;
        }
        str1 = paramArrayOfString[i1];
        if (j.containsKey(str1)) {
          break;
        }
        if (k.containsKey(str1))
        {
          arrayOfObject[i1] = k.get(str1);
          break label390;
        }
        String str3 = String.valueOf(str1);
        if (str3.length() != 0)
        {
          str4 = "unknown column: ".concat(str3);
          throw new IllegalArgumentException(str4);
        }
      }
      String str4 = new String("unknown column: ");
    }
    label220:
    int i4;
    hba localhba;
    if ((!"quota_limit".equals(str1)) && (!"quota_used".equals(str1)) && (!"full_size_disabled".equals(str1)))
    {
      if (!"quota_unlimited".equals(str1)) {
        break label415;
      }
      break label396;
      if ("auto_upload_account_id".equals(str1))
      {
        arrayOfObject[i1] = Integer.valueOf(((hba)mbb.a(getContext(), hba.class)).d());
        i2 = i4;
      }
      else if ("auto_upload_enabled".equals(str1))
      {
        localhba = (hba)mbb.a(getContext(), hba.class);
        if (m == -1)
        {
          if (!localhba.c()) {
            break label434;
          }
          break label427;
        }
      }
    }
    for (;;)
    {
      arrayOfObject[i1] = str2;
      i2 = i4;
      if (localhba.d() != m)
      {
        break label434;
        arrayOfObject[i1] = a(localSharedPreferences, m, str1);
        i2 = i4;
        break label390;
        label346:
        localMatrixCursor.addRow(arrayOfObject);
        if ((i2 != 0) && ("1".equals(paramUri.getQueryParameter("reload_quota_info")))) {
          e.a(getContext(), m);
        }
        return localMatrixCursor;
        label390:
        i1++;
        break;
        label396:
        label415:
        for (int i3 = 1;; i3 = 0)
        {
          if ((i2 == 0) && (i3 == 0)) {
            break label421;
          }
          i4 = 1;
          break;
        }
        label421:
        i4 = 0;
        break label220;
      }
      label427:
      String str2 = "1";
      continue;
      label434:
      str2 = "0";
    }
  }
  
  private final Cursor a(String paramString1, Map<String, String> paramMap, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4)
  {
    SQLiteDatabase localSQLiteDatabase = ((hci)mbb.a(getContext(), hci.class)).getReadableDatabase();
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables(paramString1);
    localSQLiteQueryBuilder.setProjectionMap(paramMap);
    return localSQLiteQueryBuilder.query(localSQLiteDatabase, paramArrayOfString1, paramString2, paramArrayOfString2, null, null, paramString3, paramString4);
  }
  
  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    int m = ((giz)mbb.a(paramContext, giz.class)).a(null);
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("iu_settings", 0);
    if (!localSharedPreferences.getBoolean("migrated_from_account_name_to_account_id", false))
    {
      giz localgiz = (giz)mbb.a(paramContext, giz.class);
      localSharedPreferences.edit().putBoolean("migrated_from_account_name_to_account_id", true).apply();
      String str1 = localSharedPreferences.getString("auto_upload_account_name", null);
      if (!TextUtils.isEmpty(str1))
      {
        int i2 = localgiz.a(str1);
        localSharedPreferences.edit().putString("auto_upload_account_id", Integer.toString(i2)).apply();
      }
      String str2 = localSharedPreferences.getString("instant_share_account_name", null);
      if (!TextUtils.isEmpty(str2))
      {
        int i1 = localgiz.a(str2);
        localSharedPreferences.edit().putString("instant_share_account_id", Integer.toString(i1)).apply();
      }
      SharedPreferences.Editor localEditor = localSharedPreferences.edit();
      Iterator localIterator1 = localgiz.a().iterator();
      while (localIterator1.hasNext())
      {
        int n = ((Integer)localIterator1.next()).intValue();
        String str3 = localgiz.a(n).b("account_name");
        Iterator localIterator2 = h.iterator();
        while (localIterator2.hasNext())
        {
          String str4 = (String)localIterator2.next();
          String str5 = 1 + String.valueOf(str3).length() + String.valueOf(str4).length() + str3 + "." + str4;
          String str6 = 12 + String.valueOf(str4).length() + n + "." + str4;
          String str7 = localSharedPreferences.getString(str5, null);
          if (str7 != null) {
            localEditor.putString(str6, str7);
          }
        }
      }
      localEditor.apply();
    }
    return a(localSharedPreferences, m, paramString2);
  }
  
  private static String a(SharedPreferences paramSharedPreferences, int paramInt, String paramString)
  {
    String str1;
    String str2;
    String str3;
    if (h.contains(paramString))
    {
      str1 = 12 + paramInt + ".";
      str2 = String.valueOf(str1);
      str3 = String.valueOf(paramString);
      if (str3.length() == 0) {
        break label90;
      }
    }
    label90:
    for (String str4 = str2.concat(str3);; str4 = new String(str2))
    {
      return paramSharedPreferences.getString(str4, (String)j.get(paramString));
      str1 = "";
      break;
    }
  }
  
  public static void a(Context paramContext)
  {
    ContentResolver localContentResolver = paramContext.getContentResolver();
    ContentValues localContentValues = new ContentValues(j.size());
    AccountManager localAccountManager = AccountManager.get(paramContext);
    giz localgiz = (giz)mbb.a(paramContext, giz.class);
    label142:
    for (Account localAccount : localAccountManager.getAccountsByType("com.google"))
    {
      Iterator localIterator = j.keySet().iterator();
      if (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        String str2 = localAccount.name;
        int i2;
        String str3;
        if (("quota_limit".equals(str1)) || ("quota_used".equals(str1)) || ("full_size_disabled".equals(str1)))
        {
          i2 = 1;
          str3 = String.valueOf("com.google.android.picasasync.");
          if (i2 == 0) {
            break label262;
          }
        }
        for (String str4 = String.valueOf(str2).concat(".");; str4 = "")
        {
          String str5 = Settings.System.getString(localContentResolver, 0 + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str1).length() + str3 + str4 + str1);
          if (str5 == null) {
            str5 = (String)j.get(str1);
          }
          localContentValues.put(str1, str5);
          break;
          i2 = 0;
          break label142;
        }
      }
      int i1 = localgiz.a(localAccount.name);
      if (i1 != -1) {
        a(paramContext, i1, localContentValues);
      }
    }
    label262:
  }
  
  public static void a(Context paramContext, int paramInt, iuk paramiuk)
  {
    ContentValues localContentValues = new ContentValues(3);
    if (paramiuk.a != -1L) {
      localContentValues.put("quota_limit", Long.toString(paramiuk.a));
    }
    if (paramiuk.b != -1L) {
      localContentValues.put("quota_used", Long.toString(paramiuk.b));
    }
    String str1;
    if (paramiuk.c)
    {
      str1 = "1";
      localContentValues.put("quota_unlimited", str1);
      if (!paramiuk.d) {
        break label199;
      }
    }
    label199:
    for (String str2 = "1";; str2 = "0")
    {
      localContentValues.put("full_size_disabled", str2);
      if (a(paramContext, paramInt, localContentValues))
      {
        Intent localIntent = new Intent(paramContext, PicasaQuotaChangedReceiver.class);
        localIntent.setAction("com.google.android.libraries.social.autobackup.QUOTA_CHANGED");
        localIntent.putExtra("account_id", paramInt);
        localIntent.putExtra("quota_limit", (int)paramiuk.a);
        localIntent.putExtra("quota_used", (int)paramiuk.b);
        localIntent.putExtra("full_size_disabled", paramiuk.d);
        localIntent.putExtra("quota_unlimited", paramiuk.c);
        paramContext.sendBroadcast(localIntent);
      }
      return;
      str1 = "0";
      break;
    }
  }
  
  private static void a(Context paramContext, SharedPreferences paramSharedPreferences)
  {
    if (paramSharedPreferences.getBoolean("migrated_from_account_name_to_account_id", false)) {
      return;
    }
    giz localgiz = (giz)mbb.a(paramContext, giz.class);
    paramSharedPreferences.edit().putBoolean("migrated_from_account_name_to_account_id", true).apply();
    String str1 = paramSharedPreferences.getString("auto_upload_account_name", null);
    if (!TextUtils.isEmpty(str1))
    {
      int i1 = localgiz.a(str1);
      paramSharedPreferences.edit().putString("auto_upload_account_id", Integer.toString(i1)).apply();
    }
    String str2 = paramSharedPreferences.getString("instant_share_account_name", null);
    if (!TextUtils.isEmpty(str2))
    {
      int n = localgiz.a(str2);
      paramSharedPreferences.edit().putString("instant_share_account_id", Integer.toString(n)).apply();
    }
    SharedPreferences.Editor localEditor = paramSharedPreferences.edit();
    Iterator localIterator1 = localgiz.a().iterator();
    while (localIterator1.hasNext())
    {
      int m = ((Integer)localIterator1.next()).intValue();
      String str3 = localgiz.a(m).b("account_name");
      Iterator localIterator2 = h.iterator();
      while (localIterator2.hasNext())
      {
        String str4 = (String)localIterator2.next();
        String str5 = 1 + String.valueOf(str3).length() + String.valueOf(str4).length() + str3 + "." + str4;
        String str6 = 12 + String.valueOf(str4).length() + m + "." + str4;
        String str7 = paramSharedPreferences.getString(str5, null);
        if (str7 != null) {
          localEditor.putString(str6, str7);
        }
      }
    }
    localEditor.apply();
  }
  
  private static boolean a(ContentValues paramContentValues, String paramString)
  {
    try
    {
      int m = Integer.parseInt(paramContentValues.getAsString(paramString));
      return m != 0;
    }
    catch (NumberFormatException localNumberFormatException) {}
    return paramContentValues.getAsBoolean(paramString).booleanValue();
  }
  
  private static boolean a(Context paramContext, int paramInt, ContentValues paramContentValues)
  {
    ContentResolver localContentResolver = paramContext.getContentResolver();
    boolean bool1 = false;
    int m = 0;
    hcl localhcl = hcl.a(paramContext);
    SharedPreferences localSharedPreferences;
    SharedPreferences.Editor localEditor2;
    synchronized (d)
    {
      localSharedPreferences = paramContext.getSharedPreferences("iu_settings", 0);
      if (localSharedPreferences.getBoolean("migrated_from_account_name_to_account_id", false)) {
        break label426;
      }
      giz localgiz = (giz)mbb.a(paramContext, giz.class);
      localSharedPreferences.edit().putBoolean("migrated_from_account_name_to_account_id", true).apply();
      String str11 = localSharedPreferences.getString("auto_upload_account_name", null);
      if (!TextUtils.isEmpty(str11))
      {
        int i4 = localgiz.a(str11);
        localSharedPreferences.edit().putString("auto_upload_account_id", Integer.toString(i4)).apply();
      }
      String str12 = localSharedPreferences.getString("instant_share_account_name", null);
      if (!TextUtils.isEmpty(str12))
      {
        int i3 = localgiz.a(str12);
        localSharedPreferences.edit().putString("instant_share_account_id", Integer.toString(i3)).apply();
      }
      localEditor2 = localSharedPreferences.edit();
      Iterator localIterator3 = localgiz.a().iterator();
      String str16;
      String str17;
      do
      {
        int i2;
        String str13;
        Iterator localIterator4;
        while (!localIterator4.hasNext())
        {
          if (!localIterator3.hasNext()) {
            break;
          }
          i2 = ((Integer)localIterator3.next()).intValue();
          str13 = localgiz.a(i2).b("account_name");
          localIterator4 = h.iterator();
        }
        String str14 = (String)localIterator4.next();
        String str15 = 1 + String.valueOf(str13).length() + String.valueOf(str14).length() + str13 + "." + str14;
        str16 = 12 + String.valueOf(str14).length() + i2 + "." + str14;
        str17 = localSharedPreferences.getString(str15, null);
      } while (str17 == null);
      localEditor2.putString(str16, str17);
    }
    localEditor2.apply();
    label426:
    SharedPreferences.Editor localEditor1 = localSharedPreferences.edit();
    hba localhba = (hba)mbb.a(paramContext, hba.class);
    List localList = localhba.e();
    Iterator localIterator1 = paramContentValues.valueSet().iterator();
    String str3;
    label639:
    String str7;
    Integer localInteger1;
    Integer localInteger2;
    label720:
    String str8;
    label780:
    label795:
    label864:
    boolean bool3;
    int i1;
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator1.next();
      if (!j.containsKey(localEntry.getKey()))
      {
        if (!k.containsKey(localEntry.getKey()))
        {
          String str9 = String.valueOf((String)localEntry.getKey());
          if (str9.length() != 0) {}
          for (String str10 = "unknown setting: ".concat(str9);; str10 = new String("unknown setting: ")) {
            throw new IllegalArgumentException(str10);
          }
        }
      }
      else
      {
        String str2 = (String)localEntry.getKey();
        boolean bool2 = h.contains(str2);
        if ((!bool2) || (paramInt != -1))
        {
          if (!bool2) {
            break label1136;
          }
          str3 = 12 + paramInt + ".";
          String str4 = String.valueOf(str3);
          String str5 = String.valueOf(str2);
          String str6;
          if (str5.length() != 0)
          {
            str6 = str4.concat(str5);
            if (localEntry.getValue() != null) {
              break label780;
            }
          }
          boolean bool4;
          for (str7 = null;; str7 = localEntry.getValue().toString())
          {
            if (!"auto_upload_enabled".equals(str2)) {
              break label1111;
            }
            bool4 = a(paramContentValues, "auto_upload_enabled");
            localInteger1 = paramContentValues.getAsInteger("auto_upload_account_id");
            if (localInteger1 != null) {
              break label1104;
            }
            localInteger2 = Integer.valueOf(-1);
            if ((!bool4) || (localInteger2.intValue() != -1)) {
              break label795;
            }
            str7 = "0";
            if (!a.a) {
              break label795;
            }
            Log.e("iu.IUProvider", paramContentValues.toString());
            throw new IllegalArgumentException();
            str6 = new String(str4);
            break;
          }
          str8 = str7;
          Iterator localIterator2 = localList.iterator();
          while (localIterator2.hasNext()) {
            localhba.a(((Integer)localIterator2.next()).intValue(), false);
          }
          if ((bool4) && (localInteger2.intValue() != -1)) {
            localhba.d(localInteger2.intValue());
          }
          if (iaw.a(localSharedPreferences.getString(str6, null), str8)) {
            break label1125;
          }
          localEditor1.putString(str6, str8);
          bool3 = true;
          if (i.contains(str6)) {
            break label1118;
          }
          i1 = 1;
          break label1144;
        }
      }
    }
    int n;
    if ((paramContentValues.containsKey("quota_limit")) && (paramContentValues.containsKey("quota_used")) && (paramContentValues.containsKey("quota_unlimited")) && (paramContentValues.containsKey("full_size_disabled")))
    {
      String str1 = String.valueOf("last_quota_update_timestamp");
      localEditor1.putString(12 + String.valueOf(str1).length() + paramInt + "." + str1, String.valueOf(System.currentTimeMillis()));
      n = 1;
    }
    label1155:
    for (;;)
    {
      label1015:
      localEditor1.apply();
      label1104:
      label1111:
      label1118:
      label1125:
      label1136:
      label1144:
      do
      {
        if (bool1)
        {
          Cursor localCursor = localhcl.d.i();
          Message.obtain(localhcl.e, 4, localCursor).sendToTarget();
        }
        if (m != 0)
        {
          hau localhau = (hau)mbb.b(paramContext, hau.class);
          if (localhau != null) {
            localhau.c.sendEmptyMessageDelayed(1, 0L);
          }
          localContentResolver.notifyChange(hbu.b(paramContext), null);
        }
        return bool1;
        n = 0;
        break label1155;
        localInteger2 = localInteger1;
        break label720;
        str8 = str7;
        break label864;
        i1 = m;
        break label1144;
        i1 = m;
        bool3 = bool1;
        break label1144;
        str3 = "";
        break label639;
        m = i1;
        bool1 = bool3;
        break;
        if (bool1) {
          break label1015;
        }
      } while (n == 0);
    }
  }
  
  public final void attachInfo(Context paramContext, ProviderInfo paramProviderInfo)
  {
    super.attachInfo(paramContext, paramProviderInfo);
    this.f.addURI(paramProviderInfo.authority, "uploads", 5);
    this.f.addURI(paramProviderInfo.authority, "upload_all", 9);
    this.f.addURI(paramProviderInfo.authority, "iu", 17);
    this.f.addURI(paramProviderInfo.authority, "settings", 11);
    this.f.addURI(paramProviderInfo.authority, "media", 19);
  }
  
  public final int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    switch (this.f.match(paramUri))
    {
    default: 
      String str = String.valueOf(paramUri);
      throw new IllegalArgumentException(16 + String.valueOf(str).length() + "unsupported uri:" + str);
    case 5: 
      int n = iaw.a(paramUri.getQueryParameter("account_id"), -1);
      if (n != -1)
      {
        hau localhau2 = (hau)mbb.b(getContext(), hau.class);
        if (localhau2 != null) {
          localhau2.c.obtainMessage(5, Integer.valueOf(n)).sendToTarget();
        }
      }
      return 0;
    case 19: 
      return a(paramString, paramArrayOfString);
    case 9: 
      int m = iaw.a(paramUri.getQueryParameter("account_id"), -1);
      if (m != -1)
      {
        hau localhau1 = (hau)mbb.b(getContext(), hau.class);
        if (localhau1 != null) {
          localhau1.c.obtainMessage(3, Integer.valueOf(m)).sendToTarget();
        }
      }
      return 0;
    }
    ContentValues localContentValues = new ContentValues();
    Iterator localIterator = j.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localContentValues.put((String)localEntry.getKey(), (String)localEntry.getValue());
    }
    if (a(getContext(), -1, localContentValues)) {
      return 1;
    }
    return 0;
  }
  
  public final String getType(Uri paramUri)
  {
    switch (this.f.match(paramUri))
    {
    default: 
      String str = String.valueOf(paramUri);
      throw new IllegalArgumentException(13 + String.valueOf(str).length() + "Invalid URI: " + str);
    case 5: 
      return "vnd.android.cursor.dir/vnd.google.android.apps.plus.iu.upload";
    case 9: 
      return "vnd.android.cursor.dir/vnd.google.android.apps.plus.iu.upload_all";
    case 17: 
      return "vnd.android.cursor.dir/vnd.google.android.apps.plus.iu.iu";
    }
    return "vnd.android.cursor.item/vnd.google.android.apps.plus.iu.media";
  }
  
  public final Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    String str1 = String.valueOf(paramUri);
    int m = iuh.a(7 + String.valueOf(str1).length() + "INSERT " + str1);
    try
    {
      switch (this.f.match(paramUri))
      {
      default: 
        String str7 = String.valueOf(paramUri);
        throw new IllegalArgumentException(16 + String.valueOf(str7).length() + "unsupported uri:" + str7);
      }
    }
    finally
    {
      getContext().getContentResolver().notifyChange(hbu.e(getContext()), null);
      iuh.a(m);
    }
    hcl localhcl = hcl.a(getContext());
    ContentValues localContentValues = efj.a(paramContentValues, g);
    String str2 = localContentValues.getAsString("media_url");
    if (str2 == null) {
      throw new IllegalArgumentException("must specify a media url");
    }
    SQLiteDatabase localSQLiteDatabase = localhcl.c.getWritableDatabase();
    Long localLong = localContentValues.getAsLong("_id");
    localContentValues.remove("_id");
    Object localObject2 = null;
    Object localObject3;
    label354:
    String str5;
    if (localLong != null)
    {
      long l1 = localLong.longValue();
      MediaRecordEntry localMediaRecordEntry = new MediaRecordEntry();
      iao localiao = MediaRecordEntry.a;
      String str3 = localiao.a;
      String[] arrayOfString1 = localiao.b;
      String[] arrayOfString2 = new String[1];
      arrayOfString2[0] = Long.toString(l1);
      Cursor localCursor = localSQLiteDatabase.query(str3, arrayOfString1, "_id=?", arrayOfString2, null, null, null);
      boolean bool = localCursor.moveToFirst();
      int i1 = 0;
      if (bool)
      {
        localiao.a(localCursor, localMediaRecordEntry);
        i1 = 1;
      }
      localCursor.close();
      if (i1 != 0) {
        localObject2 = localMediaRecordEntry;
      }
    }
    else
    {
      if (localObject2 != null) {
        break label610;
      }
      localObject3 = MediaRecordEntry.a(localContentValues);
      if (efj.p(str2))
      {
        String str4 = String.valueOf(efj.e(localhcl.b, str2));
        if (str4.length() == 0) {
          break label628;
        }
        str5 = "file://".concat(str4);
        label395:
        ((MediaRecordEntry)localObject3).mMediaUrl = str5;
        String str6 = efj.c(localhcl.b, Uri.parse(str2));
        if ((!TextUtils.isEmpty(str6)) && (TextUtils.isEmpty(((MediaRecordEntry)localObject3).mMimeType))) {
          ((MediaRecordEntry)localObject3).mMimeType = str6;
        }
      }
      if (!localContentValues.containsKey("upload_reason")) {
        break label711;
      }
    }
    label711:
    for (int i2 = localContentValues.getAsInteger("upload_reason").intValue();; i2 = 10)
    {
      ((MediaRecordEntry)localObject3).mUploadReason = i2;
      ((MediaRecordEntry)localObject3).mUploadState = 100;
      long l2 = MediaRecordEntry.a.a(localSQLiteDatabase, (ial)localObject3);
      localhcl.c();
      if (Log.isLoggable("iu.UploadsManager", 4))
      {
        long l3 = ((MediaRecordEntry)localObject3).id;
        new StringBuilder(51).append("+++ ADD record; manual upload: ").append(l3);
      }
      hau localhau = (hau)mbb.b(localhcl.b, hau.class);
      if (localhau != null) {
        localhau.c.sendEmptyMessageDelayed(1, 500L);
      }
      Uri localUri2 = hbu.a(getContext(), l2);
      getContext().getContentResolver().notifyChange(hbu.e(getContext()), null);
      iuh.a(m);
      return localUri2;
      localObject2 = null;
      break;
      label610:
      MediaRecordEntry.a.a(localContentValues, localObject2);
      localObject3 = localObject2;
      break label354;
      label628:
      str5 = new String("file://");
      break label395;
      int n = paramContentValues.getAsInteger("account_id").intValue();
      Message.obtain(hcl.a(getContext()).e, 3, Integer.valueOf(n)).sendToTarget();
      Uri localUri1 = hbu.d(getContext());
      getContext().getContentResolver().notifyChange(hbu.e(getContext()), null);
      iuh.a(m);
      return localUri1;
    }
  }
  
  public final boolean onCreate()
  {
    return true;
  }
  
  public final Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    String str1 = String.valueOf(paramUri);
    int m = iuh.a(6 + String.valueOf(str1).length() + "QUERY " + str1);
    try
    {
      switch (this.f.match(paramUri))
      {
      default: 
        String str4 = String.valueOf(paramUri);
        throw new IllegalArgumentException(13 + String.valueOf(str4).length() + "Invalid URI: " + str4);
      }
    }
    finally
    {
      iuh.a(m);
    }
    Object localObject2 = a(b, g, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2, paramUri.getQueryParameter("limit"));
    for (;;)
    {
      int n = ((Cursor)localObject2).getCount();
      ArrayList localArrayList = (ArrayList)iuh.b.get();
      int i1 = localArrayList.size();
      if (i1 > 0)
      {
        iuj localiuj = (iuj)localArrayList.get(i1 - 1);
        localiuj.b = (n + localiuj.b);
      }
      iuh.a(m);
      return localObject2;
      localObject2 = a(b, null, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2, paramUri.getQueryParameter("limit"));
      continue;
      localObject2 = a(paramUri, paramArrayOfString1);
      continue;
      String str3 = paramUri.getQueryParameter("account_id");
      localObject2 = hcl.a(getContext()).a(str3);
      continue;
      String str2 = paramUri.getQueryParameter("account_id");
      Cursor localCursor = hcl.a(getContext()).c(str2);
      localObject2 = localCursor;
    }
  }
  
  public final int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    switch (this.f.match(paramUri))
    {
    default: 
      String str = String.valueOf(paramUri);
      throw new IllegalArgumentException(16 + String.valueOf(str).length() + "unsupported uri:" + str);
    }
    Context localContext = getContext();
    if (a(localContext, a(localContext, paramUri), paramContentValues)) {
      return 1;
    }
    return 0;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.autobackup.AutoBackupProvider
 * JD-Core Version:    0.7.0.1
 */