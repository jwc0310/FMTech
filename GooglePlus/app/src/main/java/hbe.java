import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.libraries.social.autobackup.AutoBackupEnvironment;
import com.google.android.libraries.social.autobackup.MediaRecordEntry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class hbe
{
  private static final Uri[] d;
  private static final String[] e = { "_id", "mime_type" };
  final Context a;
  public final Set<hbg> b;
  final giz c;
  private final hci f;
  private final hco g;
  private final hcb h;
  
  static
  {
    Uri[] arrayOfUri = new Uri[4];
    arrayOfUri[0] = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    arrayOfUri[1] = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
    arrayOfUri[2] = itf.b;
    arrayOfUri[3] = itf.a;
    d = arrayOfUri;
  }
  
  hbe(Context paramContext)
  {
    this.a = paramContext;
    this.f = ((hci)mbb.a(paramContext, hci.class));
    this.g = hco.a(paramContext);
    this.b = new HashSet();
    this.c = ((giz)mbb.a(paramContext, giz.class));
    this.h = ((hcb)mbb.a(this.a, hcb.class));
  }
  
  private final int a(int paramInt, List<hbf> paramList)
  {
    gjb localgjb = this.c.a(paramInt);
    ArrayList localArrayList = new ArrayList(paramList.size());
    Iterator localIterator1 = paramList.iterator();
    while (localIterator1.hasNext()) {
      localArrayList.add(((hbf)localIterator1.next()).a);
    }
    int i = 0;
    jrv localjrv = new jrv(this.a, paramInt, localgjb.b("gaia_id"), localArrayList);
    localjrv.i();
    SQLiteDatabase localSQLiteDatabase = this.f.getWritableDatabase();
    localSQLiteDatabase.beginTransaction();
    for (;;)
    {
      try
      {
        Iterator localIterator2 = paramList.iterator();
        if (localIterator2.hasNext())
        {
          hbf localhbf = (hbf)localIterator2.next();
          String str = localhbf.a;
          MediaRecordEntry localMediaRecordEntry = localhbf.b;
          if (localjrv.a.containsKey(str))
          {
            localMediaRecordEntry.id = 0L;
            localMediaRecordEntry.mFingerprint = str;
            localMediaRecordEntry.mUploadAccountId = paramInt;
            localMediaRecordEntry.mUploadState = 400;
            localMediaRecordEntry.mUploadStatus = 34;
            MediaRecordEntry.a.a(localSQLiteDatabase, localMediaRecordEntry);
            j = i + 1;
            if (!Log.isLoggable("iu.FingerprintManager", 4)) {
              break label290;
            }
            long l = localMediaRecordEntry.id;
            new StringBuilder(57).append("+++ Found previously uploaded media: ").append(l);
            break label290;
          }
        }
        else
        {
          localSQLiteDatabase.setTransactionSuccessful();
          return i;
        }
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
      int j = i;
      label290:
      i = j;
    }
  }
  
  private final List<hbf> a(int paramInt, long paramLong)
  {
    Cursor localCursor = hbm.a(this.f.getReadableDatabase(), paramInt, paramLong, 100);
    ArrayList localArrayList;
    for (;;)
    {
      try
      {
        localArrayList = new ArrayList(100);
        if (!localCursor.moveToNext()) {
          break;
        }
        MediaRecordEntry localMediaRecordEntry = MediaRecordEntry.a(localCursor);
        String str1 = localMediaRecordEntry.mFingerprint;
        if (str1 == null)
        {
          Context localContext = this.a;
          str2 = localMediaRecordEntry.mMediaUrl;
          if (efj.p(str2))
          {
            String str3 = String.valueOf(efj.f(localContext, str2));
            if (str3.length() != 0) {
              str2 = "file://".concat(str3);
            }
          }
          else
          {
            Uri localUri = Uri.parse(str2);
            str1 = this.g.a(localUri.toString(), false);
          }
        }
        else
        {
          if (str1 == null) {
            continue;
          }
          localArrayList.add(new hbf(str1, localMediaRecordEntry));
          continue;
        }
        String str2 = new String("file://");
      }
      finally
      {
        localCursor.close();
      }
    }
    localCursor.close();
    return localArrayList;
  }
  
  private void b()
  {
    Iterator localIterator = this.c.a(new String[] { "logged_in" }).iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      try
      {
        if (!((AutoBackupEnvironment)mbb.a(this.a, AutoBackupEnvironment.class)).a) {
          return;
        }
        if (!((giz)mbb.a(this.a, giz.class)).a(i).c("has_synced_photo_uploads"))
        {
          List localList = a(i, -1L);
          int j = 0;
          while (!localList.isEmpty())
          {
            j += a(i, localList);
            localList = a(i, ((hbf)localList.get(-1 + localList.size())).b.id);
          }
          if (Log.isLoggable("iu.FingerprintManager", 4)) {
            new StringBuilder(69).append("Synced photo uploads, account=").append(i).append(", matched photos=").append(j);
          }
          if (j > 0) {
            this.a.getContentResolver().notifyChange(hbu.b, null);
          }
          hcb.a(this.a, i, true);
        }
      }
      catch (gjd localgjd) {}
    }
  }
  
  public final int a()
  {
    for (;;)
    {
      long l;
      Set localSet;
      int n;
      Cursor localCursor;
      int i4;
      int i5;
      int i6;
      try
      {
        ContentResolver localContentResolver = this.a.getContentResolver();
        i = 0;
        j = 0;
        k = 0;
        l = System.currentTimeMillis();
        localSet = this.g.a();
        Uri[] arrayOfUri = d;
        int m = arrayOfUri.length;
        n = 0;
        if (n >= m) {
          break label526;
        }
        Uri localUri = arrayOfUri[n];
        if (Log.isLoggable("iu.FingerprintManager", 4))
        {
          String str7 = String.valueOf(localUri);
          new StringBuilder(34 + String.valueOf(str7).length()).append("Start processing media store URI: ").append(str7);
        }
        localCursor = localContentResolver.query(localUri, e, null, null, null);
        if (localCursor == null) {
          break label719;
        }
        i4 = k;
        i5 = j;
        i6 = i;
        try
        {
          if (!localCursor.moveToNext()) {
            break label504;
          }
          String str1 = ContentUris.withAppendedId(localUri, localCursor.getLong(0)).toString();
          if (Log.isLoggable("iu.FingerprintManager", 2))
          {
            String str6 = String.valueOf(str1);
            if (str6.length() != 0) {
              "processing media: ".concat(str6);
            }
          }
          else
          {
            String str2 = localCursor.getString(1);
            boolean bool1 = efj.n(str2);
            if ((bool1) && (!localSet.remove(str1)))
            {
              String str3 = this.g.a(str1, true);
              if ((TextUtils.isEmpty(str1)) || (TextUtils.isEmpty(str3)))
              {
                i4++;
                if (Log.isLoggable("iu.FingerprintManager", 4))
                {
                  String str5 = String.valueOf("Not inserting fingerprint into all photos because has empty content uri or fingerprint. uri: ");
                  if (TextUtils.isEmpty(str1)) {
                    break label478;
                  }
                  bool2 = true;
                  if (TextUtils.isEmpty(str3)) {
                    break label484;
                  }
                  bool3 = true;
                  StringBuilder localStringBuilder = new StringBuilder(24 + String.valueOf(str5).length());
                  localStringBuilder.append(str5).append(bool2).append(" fingerprint: ").append(bool3);
                }
              }
              i5++;
              if (Log.isLoggable("iu.FingerprintManager", 3))
              {
                String str4 = String.valueOf(str1);
                if (str4.length() == 0) {
                  break label490;
                }
                "generated fingerprint for: ".concat(str4);
              }
            }
            if ((bool1) || (!Log.isLoggable("iu.FingerprintManager", 3))) {
              break label733;
            }
            new StringBuilder(36 + String.valueOf(str1).length() + String.valueOf(str2).length()).append("non media mime type; media: ").append(str1).append(", type: ").append(str2);
            break label733;
          }
          new String("processing media: ");
          continue;
          localObject1 = finally;
        }
        finally
        {
          localCursor.close();
        }
        boolean bool2 = false;
      }
      finally {}
      label478:
      continue;
      label484:
      boolean bool3 = false;
      continue;
      label490:
      new String("generated fingerprint for: ");
      continue;
      label504:
      localCursor.close();
      int i1 = i4;
      int i2 = i5;
      int i3 = i6;
      break label739;
      label526:
      this.g.a(localSet);
      int i7 = 0 + localSet.size();
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext()) {
        ((hbg)localIterator.next()).a();
      }
      if (((hbn)mbb.a(this.a, hbn.class)).c()) {
        b();
      }
      if (Log.isLoggable("iu.FingerprintManager", 4))
      {
        String str8 = String.valueOf(efj.a(System.currentTimeMillis() - l));
        if (str8.length() == 0) {
          break label705;
        }
        "Finished generating fingerprints; ".concat(str8);
      }
      for (;;)
      {
        new StringBuilder(91).append("  numSeen=").append(i).append(" numGenerated=").append(j).append(" numDeleted=").append(i7).append(" numFailed=").append(k);
        return i;
        label705:
        new String("Finished generating fingerprints; ");
      }
      label719:
      i1 = k;
      i2 = j;
      i3 = i;
      break label739;
      label733:
      i6++;
      continue;
      label739:
      n++;
      int k = i1;
      int j = i2;
      int i = i3;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hbe
 * JD-Core Version:    0.7.0.1
 */