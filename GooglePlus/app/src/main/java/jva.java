import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;

final class jva
  implements jtm
{
  private final Context a;
  
  public jva(Context paramContext)
  {
    this.a = paramContext;
  }
  
  /* Error */
  public final void a(int paramInt, String paramString, lly paramlly)
  {
    // Byte code:
    //   0: invokestatic 23	efj:l	()V
    //   3: aload_3
    //   4: ifnonnull +4 -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield 15	jva:a	Landroid/content/Context;
    //   12: iload_1
    //   13: invokestatic 28	hsb:a	(Landroid/content/Context;I)Landroid/database/sqlite/SQLiteDatabase;
    //   16: astore 4
    //   18: aload 4
    //   20: invokevirtual 33	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   23: new 35	android/content/ContentValues
    //   26: dup
    //   27: iconst_1
    //   28: invokespecial 38	android/content/ContentValues:<init>	(I)V
    //   31: astore 5
    //   33: aload 5
    //   35: ldc 40
    //   37: aload_3
    //   38: invokestatic 45	lly:a	(Llly;)[B
    //   41: invokevirtual 49	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   44: aload 4
    //   46: ldc 51
    //   48: aload 5
    //   50: ldc 53
    //   52: iconst_1
    //   53: anewarray 55	java/lang/String
    //   56: dup
    //   57: iconst_0
    //   58: aload_2
    //   59: aastore
    //   60: invokevirtual 59	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   63: pop
    //   64: aload 4
    //   66: invokevirtual 62	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   69: aload 4
    //   71: invokevirtual 65	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   74: return
    //   75: astore 7
    //   77: aload 4
    //   79: invokevirtual 65	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   82: return
    //   83: astore 6
    //   85: aload 4
    //   87: invokevirtual 65	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   90: aload 6
    //   92: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	93	0	this	jva
    //   0	93	1	paramInt	int
    //   0	93	2	paramString	String
    //   0	93	3	paramlly	lly
    //   16	70	4	localSQLiteDatabase	SQLiteDatabase
    //   31	18	5	localContentValues	ContentValues
    //   83	8	6	localObject	Object
    //   75	1	7	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   23	69	75	java/io/IOException
    //   23	69	83	finally
  }
  
  public final void a(int paramInt, String paramString, nuc paramnuc, boolean paramBoolean)
  {
    efj.l();
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.a, paramInt);
    localSQLiteDatabase.beginTransaction();
    for (;;)
    {
      int k;
      try
      {
        Cursor localCursor = localSQLiteDatabase.query("activities", new String[] { "embed", "content_flags" }, "activity_id=?", new String[] { paramString }, null, null, null);
        if (localCursor == null) {
          return;
        }
        if ((localCursor.moveToFirst()) && ((0x200000 & localCursor.getLong(1)) != 0L) && (!localCursor.isNull(0)))
        {
          byte[] arrayOfByte = localCursor.getBlob(0);
          lly locallly2;
          if (arrayOfByte == null)
          {
            locallly2 = null;
            locallly1 = locallly2;
            if (locallly1 != null) {}
          }
          else
          {
            ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
            if (localByteBuffer == null)
            {
              locallly2 = null;
              continue;
            }
            locallly2 = new lly();
            locallly2.i = localByteBuffer.getInt();
            locallly2.j = localByteBuffer.getInt();
            if (localByteBuffer.get() != 1) {
              break label673;
            }
            j = 1;
            locallly2.a = lly.d(localByteBuffer);
            locallly2.b = lly.d(localByteBuffer);
            locallly2.c = lly.d(localByteBuffer);
            locallly2.d = lly.d(localByteBuffer);
            locallly2.k = localByteBuffer.getInt();
            locallly2.e = localByteBuffer.getLong();
            if (localByteBuffer.get() != 1) {
              break label679;
            }
            bool = true;
            locallly2.f = bool;
            locallly2.l = localByteBuffer.getInt();
            if (j != 0)
            {
              locallly2.g = new llx();
              locallly2.g.a(localByteBuffer);
            }
            if (locallly2.i > 0)
            {
              locallly2.h = new llz[locallly2.i];
              k = 0;
              if (k < locallly2.i)
              {
                locallly2.h[k] = new llz();
                llz localllz2 = locallly2.h[k];
                if (localByteBuffer.get() != 1) {
                  break label685;
                }
                m = 1;
                localllz2.a = llz.d(localByteBuffer);
                localllz2.b = llz.d(localByteBuffer);
                localllz2.c = localByteBuffer.getLong();
                if (m == 0) {
                  break label667;
                }
                localllz2.d = new llx();
                localllz2.d.a(localByteBuffer);
                break label667;
              }
            }
            locallly2.m = localByteBuffer.getInt();
            locallly2.n = localByteBuffer.getInt();
            continue;
          }
        }
        int i;
        nug localnug;
        llz localllz1;
        ContentValues localContentValues;
        ContentResolver localContentResolver;
        lly locallly1 = null;
      }
      catch (IOException localIOException)
      {
        return;
        locallly1.e = Math.max(0L, efj.a(paramnuc.b));
        i = 0;
        if (i < paramnuc.a.length)
        {
          localnug = paramnuc.a[i].c;
          localllz1 = locallly1.h[i];
          if (localnug == null) {
            break label691;
          }
          l = localnug.a.longValue();
          localllz1.c = Math.max(0L, efj.a(Long.valueOf(l)));
          i++;
          continue;
        }
        localContentValues = new ContentValues(1);
        localContentValues.put("embed", lly.a(locallly1));
        localSQLiteDatabase.update("activities", localContentValues, "activity_id=?", new String[] { paramString });
        if (paramBoolean)
        {
          localContentResolver = this.a.getContentResolver();
          localContentResolver.notifyChange(Uri.withAppendedPath(lnf.b, paramString), null);
          localContentResolver.notifyChange(lnf.a, null);
        }
        localSQLiteDatabase.setTransactionSuccessful();
        return;
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
      continue;
      label667:
      k++;
      continue;
      label673:
      int j = 0;
      continue;
      label679:
      boolean bool = false;
      continue;
      label685:
      int m = 0;
      continue;
      label691:
      long l = 0L;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jva
 * JD-Core Version:    0.7.0.1
 */