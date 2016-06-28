import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class bvf
{
  public static final Uri a = Uri.parse("content://EsPhotoData/trash");
  private static File b;
  
  private static Uri a(Context paramContext, SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    Cursor localCursor = paramSQLiteDatabase.query("photos", bvh.a, "fingerprint = ? AND restore_rows NOT NULL", new String[] { paramString1 }, null, null, null);
    for (;;)
    {
      int i;
      try
      {
        boolean bool1 = localCursor.moveToFirst();
        if (!bool1) {
          return null;
        }
        byte[] arrayOfByte = localCursor.getBlob(0);
        Parcel localParcel = Parcel.obtain();
        localParcel.unmarshall(arrayOfByte, 0, arrayOfByte.length);
        localParcel.setDataPosition(0);
        jqu[] arrayOfjqu = (jqu[])localParcel.createTypedArray(jqu.CREATOR);
        localParcel.recycle();
        long l = localCursor.getLong(1);
        Uri localUri = null;
        if (paramString2 != null)
        {
          localUri = null;
          if (arrayOfjqu != null) {}
        }
        else
        {
          return localUri;
        }
        i = 0;
        int j = arrayOfjqu.length;
        localUri = null;
        if (i >= j) {
          continue;
        }
        jqu localjqu = arrayOfjqu[i];
        if (localjqu.a != 3) {
          break label284;
        }
        ContentValues[] arrayOfContentValues = localjqu.b;
        if ((arrayOfContentValues == null) || (arrayOfContentValues.length != 1)) {
          break label284;
        }
        ContentValues localContentValues = new ContentValues();
        localContentValues.putAll(arrayOfContentValues[0]);
        localContentValues.remove("_id");
        localContentValues.put("_data", paramString2);
        ContentResolver localContentResolver = paramContext.getContentResolver();
        if ((0x20 & l) != 0L)
        {
          bool2 = true;
          localUri = efj.a(localContentResolver, localContentValues, bool2);
          paramContext.getContentResolver().update(localUri, localContentValues, null, null);
          continue;
        }
        boolean bool2 = false;
      }
      finally
      {
        localCursor.close();
      }
      continue;
      label284:
      i++;
    }
  }
  
  public static File a(Context paramContext, String paramString)
  {
    return new File(c(paramContext), paramString);
  }
  
  private static String a(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramInt; i++)
    {
      if (i > 0) {
        localStringBuilder.append(" OR ");
      }
      localStringBuilder.append("fingerprint = ? ");
    }
    return localStringBuilder.toString();
  }
  
  public static void a(Context paramContext)
  {
    SQLiteDatabase localSQLiteDatabase = bvd.a(paramContext).getWritableDatabase();
    long l = System.currentTimeMillis();
    String[] arrayOfString1 = bvg.a;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = String.valueOf(l);
    Cursor localCursor = localSQLiteDatabase.query("photos", arrayOfString1, "local_path IS NOT NULL AND cleanup_time < ?", arrayOfString2, null, null, null);
    ArrayList localArrayList = new ArrayList(localCursor.getCount());
    try
    {
      while (localCursor.moveToNext()) {
        localArrayList.add(localCursor.getString(localCursor.getColumnIndexOrThrow("fingerprint")));
      }
      a(paramContext, -1, localArrayList, true, false, null);
    }
    finally
    {
      localCursor.close();
    }
  }
  
  private static void a(Context paramContext, int paramInt, SQLiteDatabase paramSQLiteDatabase, okn[] paramArrayOfokn, ContentValues paramContentValues)
  {
    if (paramArrayOfokn == null) {
      return;
    }
    int i = 0;
    while (i < paramArrayOfokn.length)
    {
      okn localokn = paramArrayOfokn[i];
      ojf localojf;
      ojd localojd;
      String str;
      String[] arrayOfString;
      if (localokn.b(okm.a) != null)
      {
        localojf = ((okm)localokn.b(okm.a)).b;
        if (localojf != null)
        {
          localojd = localokn.e;
          if (localojf != null)
          {
            str = jqx.a(localojf);
            if (!TextUtils.isEmpty(str)) {
              arrayOfString = new String[] { str };
            }
          }
        }
      }
      try
      {
        ArrayList localArrayList = new ArrayList();
        paramContentValues.clear();
        paramContentValues.put("remote_url", localojd.a);
        paramContentValues.put("account_id", Integer.valueOf(paramInt));
        paramContentValues.put("fingerprint", str);
        paramContentValues.put("cleanup_time", Long.valueOf(5184000000L + System.currentTimeMillis()));
        if (localojf.l != null) {
          paramContentValues.put("media_attr", Long.valueOf(32L));
        }
        Cursor localCursor2 = paramSQLiteDatabase.query("photos", bvi.a, "fingerprint = ?", arrayOfString, null, null, null);
        localCursor1 = localCursor2;
        if (localCursor1 != null) {}
        try
        {
          int j;
          if (localCursor1.getCount() > 0)
          {
            j = 1;
            label218:
            if ((j != 0) && (localCursor1.moveToFirst()) && (!localCursor1.isNull(2))) {
              localArrayList.addAll(mab.d(localCursor1.getBlob(2)));
            }
            if (!localArrayList.contains(localojf.d)) {
              localArrayList.add(localojf.d);
            }
            paramContentValues.put("photo_ids", mab.b(localArrayList));
            if (j == 0) {
              break label341;
            }
            paramSQLiteDatabase.update("photos", paramContentValues, "fingerprint = ?", arrayOfString);
          }
          for (;;)
          {
            if (localCursor1 != null) {
              localCursor1.close();
            }
            i++;
            break;
            j = 0;
            break label218;
            label341:
            paramSQLiteDatabase.insert("photos", null, paramContentValues);
          }
          if (localCursor1 == null) {
            break label368;
          }
        }
        finally {}
      }
      finally
      {
        for (;;)
        {
          label368:
          Cursor localCursor1 = null;
        }
      }
    }
    localCursor1.close();
    throw localObject1;
  }
  
  public static void a(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE photos (_id INTEGER PRIMARY KEY AUTOINCREMENT,fingerprint TEXT NOT NULL, local_path TEXT, account_id INTEGER NOT NULL DEFAULT -1, remote_url TEXT, photo_ids BLOB, media_attr INTEGER NOT NULL DEFAULT '0', cleanup_time INTEGER NOT NULL DEFAULT CURRENT_TIMESTAMP, restore_rows BLOB);");
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase, ContentValues paramContentValues)
  {
    paramContentValues.putNull("remote_url");
    paramContentValues.put("account_id", Integer.valueOf(-1));
    paramContentValues.putNull("photo_ids");
    paramSQLiteDatabase.update("photos", paramContentValues, null, null);
    paramSQLiteDatabase.delete("photos", "local_path IS NULL", null);
  }
  
  /* Error */
  private static void a(File paramFile1, File paramFile2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_1
    //   3: invokevirtual 337	java/io/File:exists	()Z
    //   6: ifne +8 -> 14
    //   9: aload_1
    //   10: invokevirtual 340	java/io/File:createNewFile	()Z
    //   13: pop
    //   14: new 342	java/io/FileInputStream
    //   17: dup
    //   18: aload_0
    //   19: invokespecial 345	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   22: invokevirtual 349	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   25: astore 5
    //   27: new 351	java/io/FileOutputStream
    //   30: dup
    //   31: aload_1
    //   32: invokespecial 352	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   35: invokevirtual 353	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   38: astore 6
    //   40: aload 6
    //   42: aload 5
    //   44: lconst_0
    //   45: aload 5
    //   47: invokevirtual 358	java/nio/channels/FileChannel:size	()J
    //   50: invokevirtual 362	java/nio/channels/FileChannel:transferFrom	(Ljava/nio/channels/ReadableByteChannel;JJ)J
    //   53: pop2
    //   54: aload 5
    //   56: ifnull +8 -> 64
    //   59: aload 5
    //   61: invokevirtual 363	java/nio/channels/FileChannel:close	()V
    //   64: aload 6
    //   66: ifnull +8 -> 74
    //   69: aload 6
    //   71: invokevirtual 363	java/nio/channels/FileChannel:close	()V
    //   74: return
    //   75: astore_3
    //   76: aconst_null
    //   77: astore 4
    //   79: aload_2
    //   80: ifnull +7 -> 87
    //   83: aload_2
    //   84: invokevirtual 363	java/nio/channels/FileChannel:close	()V
    //   87: aload 4
    //   89: ifnull +8 -> 97
    //   92: aload 4
    //   94: invokevirtual 363	java/nio/channels/FileChannel:close	()V
    //   97: aload_3
    //   98: athrow
    //   99: astore_3
    //   100: aload 5
    //   102: astore_2
    //   103: aconst_null
    //   104: astore 4
    //   106: goto -27 -> 79
    //   109: astore 7
    //   111: aload 5
    //   113: astore_2
    //   114: aload 6
    //   116: astore 4
    //   118: aload 7
    //   120: astore_3
    //   121: goto -42 -> 79
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	124	0	paramFile1	File
    //   0	124	1	paramFile2	File
    //   1	113	2	localObject1	Object
    //   75	23	3	localObject2	Object
    //   99	1	3	localObject3	Object
    //   120	1	3	localObject4	Object
    //   77	40	4	localFileChannel1	java.nio.channels.FileChannel
    //   25	87	5	localFileChannel2	java.nio.channels.FileChannel
    //   38	77	6	localFileChannel3	java.nio.channels.FileChannel
    //   109	10	7	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   14	27	75	finally
    //   27	40	99	finally
    //   40	54	109	finally
  }
  
  private static void a(StringBuilder paramStringBuilder, String paramString, ArrayList<?> paramArrayList)
  {
    paramStringBuilder.append(paramString).append(" IN (");
    for (int i = -1 + paramArrayList.size(); i >= 0; i--)
    {
      Object localObject = paramArrayList.get(i);
      paramStringBuilder.append('\'').append(localObject.toString()).append('\'');
      if (i > 0) {
        paramStringBuilder.append(',');
      }
    }
    paramStringBuilder.append(')');
  }
  
  public static boolean a(Context paramContext, int paramInt)
  {
    localSQLiteDatabase = bvd.a(paramContext).getWritableDatabase();
    localSQLiteDatabase.beginTransaction();
    for (;;)
    {
      try
      {
        ContentValues localContentValues = new ContentValues();
        a(localSQLiteDatabase, localContentValues);
        String str = null;
        bmi localbmi = new bmi(paramContext, paramInt, str);
        localbmi.i();
        if (localbmi.n()) {
          continue;
        }
        bool = true;
        if (bool)
        {
          str = localbmi.a;
          a(paramContext, paramInt, localSQLiteDatabase, localbmi.b, localContentValues);
        }
        if ((bool) && (!TextUtils.isEmpty(str))) {
          continue;
        }
        if (bool) {
          localSQLiteDatabase.setTransactionSuccessful();
        }
      }
      catch (Exception localException)
      {
        localSQLiteDatabase.endTransaction();
        boolean bool = false;
        continue;
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
      if (bool) {
        paramContext.getContentResolver().notifyChange(a, null);
      }
      return bool;
      bool = false;
    }
  }
  
  public static boolean a(Context paramContext, int paramInt, ArrayList<String> paramArrayList, boolean paramBoolean1, boolean paramBoolean2, ArrayList<Uri> paramArrayList1)
  {
    if ((paramArrayList == null) || (paramArrayList.isEmpty())) {
      return true;
    }
    localSQLiteDatabase = bvd.a(paramContext).getWritableDatabase();
    localObject1 = null;
    ArrayList localArrayList1 = new ArrayList();
    ContentValues localContentValues = new ContentValues();
    ArrayList localArrayList2 = new ArrayList();
    localSQLiteDatabase.beginTransaction();
    try
    {
      Cursor localCursor = localSQLiteDatabase.query("photos", bvi.a, a(paramArrayList.size()), (String[])paramArrayList.toArray(new String[paramArrayList.size()]), null, null, null);
      localObject1 = localCursor;
    }
    catch (Exception localException1)
    {
      HashSet localHashSet;
      String str1;
      List localList;
      int k;
      String str2;
      long[] arrayOfLong;
      int i;
      blh localblh;
      label425:
      label484:
      localObject3 = null;
      return false;
    }
    finally
    {
      if (localObject1 != null) {
        localObject1.close();
      }
      localSQLiteDatabase.endTransaction();
    }
    try
    {
      localHashSet = new HashSet();
      bool1 = true;
    }
    catch (Exception localException2)
    {
      localObject3 = localObject1;
      break label495;
      bool2 = bool1;
      break label425;
      for (bool3 = bool1;; bool3 = false)
      {
        bool1 = bool3;
        break;
      }
      if (j == 0) {
        break label484;
      }
      bool2 = true;
      break label425;
    }
    if (localObject1.moveToNext())
    {
      str1 = localObject1.getString(0);
      if ((!paramBoolean1) && (!localObject1.isNull(2)))
      {
        localList = mab.d(localObject1.getBlob(2));
        for (k = -1 + localList.size(); k >= 0; k--) {
          localArrayList1.add(Long.valueOf(Long.parseLong((String)localList.get(k))));
        }
        localArrayList2.add(str1);
      }
      if (!localObject1.isNull(1))
      {
        str2 = localObject1.getString(1);
        if (!localHashSet.contains(str2))
        {
          if ((!bool1) || (!a(paramContext, localSQLiteDatabase, localContentValues, str1, str2, paramBoolean2, paramArrayList1))) {
            break label563;
          }
          bool3 = true;
          break label556;
        }
      }
    }
    else if (localArrayList1.size() > 0)
    {
      arrayOfLong = new long[localArrayList1.size()];
      for (i = 0; i < localArrayList1.size(); i++) {
        arrayOfLong[i] = ((Long)localArrayList1.get(i)).longValue();
      }
      if (bool1)
      {
        localblh = new blh(paramContext, paramInt, arrayOfLong, paramBoolean2);
        localblh.i();
        if (!localblh.n())
        {
          localContentValues.clear();
          localContentValues.putNull("remote_url");
          localContentValues.putNull("photo_ids");
          localSQLiteDatabase.update("photos", localContentValues, a(localArrayList2.size()), (String[])localArrayList2.toArray(new String[localArrayList2.size()]));
          j = 1;
          break label569;
        }
      }
      for (;;)
      {
        localSQLiteDatabase.delete("photos", "photo_ids IS NULL AND local_path IS NULL", null);
        localSQLiteDatabase.setTransactionSuccessful();
        if (localObject1 != null) {
          localObject1.close();
        }
        localSQLiteDatabase.endTransaction();
        if (bool2) {
          paramContext.getContentResolver().notifyChange(a, null);
        }
        return bool2;
        j = 0;
        break;
        bool2 = false;
      }
    }
  }
  
  private static boolean a(Context paramContext, SQLiteDatabase paramSQLiteDatabase, ContentValues paramContentValues, String paramString1, String paramString2, boolean paramBoolean, List<Uri> paramList)
  {
    File localFile1 = new File(c(paramContext), paramString1);
    File localFile2 = iph.a(new File(c(paramContext), paramString1));
    if (paramBoolean) {}
    try
    {
      File localFile3 = new File(paramString2);
      a(localFile1, localFile3);
      Uri localUri = a(paramContext, paramSQLiteDatabase, paramString1, localFile3.getAbsolutePath());
      if (localUri != null) {
        if (paramList != null) {
          paramList.add(localUri);
        }
      }
      for (;;)
      {
        localFile1.delete();
        if (localFile2.exists()) {
          localFile2.delete();
        }
        paramContentValues.clear();
        paramContentValues.putNull("local_path");
        paramSQLiteDatabase.update("photos", paramContentValues, "fingerprint = ?", new String[] { paramString1 });
        return true;
        paramContext.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(localFile3)));
      }
      return false;
    }
    catch (Exception localException) {}
  }
  
  public static boolean a(Context paramContext, Uri paramUri, File paramFile, String paramString)
  {
    try
    {
      a(paramFile, new File(c(paramContext), paramString));
      if (paramUri != null)
      {
        boolean bool1 = paramUri.toString().contains("/video/");
        if (bool1) {
          i = 1;
        }
      }
    }
    catch (Exception localException)
    {
      int i;
      int j;
      Bitmap localBitmap1;
      Object localObject;
      label80:
      label127:
      SQLiteDatabase localSQLiteDatabase;
      ContentValues localContentValues;
      Parcel localParcel;
      boolean bool2;
      label281:
      String str = String.valueOf(paramUri);
      Log.e("TrashPhotosManager", 60 + String.valueOf(str).length() + "Problem creating thumbnail and copying local file to trash: " + str, localException);
      return false;
    }
    try
    {
      if (efj.PX == 0) {
        efj.PX = paramContext.getResources().getDimensionPixelSize(efj.PY);
      }
      j = efj.PX;
      localBitmap1 = efj.a(paramContext, paramUri, null);
      localObject = null;
      if (localBitmap1 != null) {
        break label281;
      }
      if (localObject != null)
      {
        FileOutputStream localFileOutputStream = new FileOutputStream(iph.a(new File(c(paramContext), paramString)));
        ((Bitmap)localObject).compress(Bitmap.CompressFormat.JPEG, 100, localFileOutputStream);
        localFileOutputStream.close();
      }
    }
    catch (IOException localIOException)
    {
      break label127;
    }
    localSQLiteDatabase = bvd.a(paramContext).getWritableDatabase();
    localContentValues = new ContentValues();
    localParcel = Parcel.obtain();
    localParcel.writeTypedArray(a(paramContext, paramUri), 0);
    localContentValues.put("fingerprint", paramString);
    localContentValues.put("local_path", paramFile.getAbsolutePath());
    localContentValues.put("restore_rows", localParcel.marshall());
    localParcel.recycle();
    localContentValues.put("cleanup_time", Long.valueOf(5184000000L + System.currentTimeMillis()));
    if (i != 0) {
      localContentValues.put("media_attr", Long.valueOf(32L));
    }
    if (-1L != localSQLiteDatabase.insert("photos", null, localContentValues)) {}
    for (bool2 = true;; bool2 = false)
    {
      if (bool2) {
        paramContext.getContentResolver().notifyChange(a, null);
      }
      return bool2;
      i = 0;
      break;
      localObject = efj.a(paramContext.getContentResolver(), paramUri, localBitmap1);
      if ((((Bitmap)localObject).getWidth() == j) && (((Bitmap)localObject).getHeight() == j)) {
        break label80;
      }
      Bitmap localBitmap2 = mfo.a((Bitmap)localObject, j, j, null);
      if (localBitmap2 == localObject) {
        break label80;
      }
      ((Bitmap)localObject).recycle();
      localObject = localBitmap2;
      break label80;
    }
  }
  
  public static boolean a(Context paramContext, ArrayList<String> paramArrayList)
  {
    SQLiteDatabase localSQLiteDatabase = bvd.a(paramContext).getWritableDatabase();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SELECT COUNT(*) FROM photos").append(" WHERE ");
    a(localStringBuilder, "fingerprint", paramArrayList);
    localStringBuilder.append(" AND local_path").append(" NOT NULL");
    return 0L < DatabaseUtils.longForQuery(localSQLiteDatabase, localStringBuilder.toString(), null);
  }
  
  private static String[] a(ContentResolver paramContentResolver, Uri paramUri)
  {
    Cursor localCursor = paramContentResolver.query(paramUri, null, null, null, null);
    Object localObject1 = null;
    if (localCursor != null) {}
    try
    {
      String[] arrayOfString = localCursor.getColumnNames();
      localObject1 = arrayOfString;
      return localObject1;
    }
    finally
    {
      if (localCursor != null) {
        localCursor.close();
      }
    }
  }
  
  private static jqu[] a(Context paramContext, Uri paramUri)
  {
    jqu localjqu = new jqu();
    localjqu.a = 3;
    ContentResolver localContentResolver = paramContext.getContentResolver();
    if (a(localContentResolver, paramUri) == null) {
      return null;
    }
    Cursor localCursor = localContentResolver.query(paramUri, a(localContentResolver, paramUri), null, null, null);
    if (localCursor != null) {}
    try
    {
      if (localCursor.moveToFirst())
      {
        ContentValues localContentValues = new ContentValues();
        DatabaseUtils.cursorRowToContentValues(localCursor, localContentValues);
        localjqu.b = new ContentValues[] { localContentValues };
      }
      if (localCursor != null) {
        localCursor.close();
      }
      return new jqu[] { localjqu };
    }
    finally
    {
      if (localCursor != null) {
        localCursor.close();
      }
    }
  }
  
  public static void b(Context paramContext)
  {
    a(bvd.a(paramContext).getWritableDatabase(), new ContentValues());
  }
  
  private static File c(Context paramContext)
  {
    if (b == null) {
      b = new File(paramContext.getFilesDir(), "trash_photos");
    }
    if (!b.exists()) {}
    try
    {
      b.mkdir();
      return b;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str = String.valueOf(b);
        Log.e("TrashPhotosManager", 38 + String.valueOf(str).length() + "Cannot create trash photos directory: " + str, localException);
        b = null;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bvf
 * JD-Core Version:    0.7.0.1
 */