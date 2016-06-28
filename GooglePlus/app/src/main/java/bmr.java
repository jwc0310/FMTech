import android.content.ContentResolver;
import android.content.Context;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public final class bmr
  extends kde<ncr, ncs>
{
  private static final Bundle a;
  private final String b;
  private final String c;
  private final byte[] d;
  private final String e;
  private final String f;
  private String g;
  private RectF h;
  private long z;
  
  static
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("uploadType", "multipart");
    a = localBundle;
  }
  
  public bmr(Context paramContext, kcg paramkcg, String paramString1, String paramString2, String paramString3, RectF paramRectF)
  {
    this(paramContext, paramkcg, paramString1, paramString2, null, null, null);
    this.h = paramRectF;
    this.g = paramString3;
  }
  
  private bmr(Context paramContext, kcg paramkcg, String paramString1, String paramString2, String paramString3, String paramString4, byte[] paramArrayOfByte)
  {
    super(paramContext, paramkcg, "uploadmedia", new ncr(), new ncs());
    this.b = paramString1;
    this.c = paramString2;
    this.f = null;
    this.e = null;
    this.h = null;
    this.g = null;
    this.d = paramArrayOfByte;
  }
  
  public bmr(Context paramContext, kcg paramkcg, String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    this(paramContext, paramkcg, paramString1, paramString2, null, null, paramArrayOfByte);
  }
  
  /* Error */
  private static long a(ContentResolver paramContentResolver, String paramString)
  {
    // Byte code:
    //   0: invokestatic 74	efj:l	()V
    //   3: aload_1
    //   4: invokestatic 80	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   7: astore_2
    //   8: aload_0
    //   9: aload_2
    //   10: ldc 82
    //   12: invokevirtual 88	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    //   15: astore_3
    //   16: aload_3
    //   17: invokevirtual 94	android/os/ParcelFileDescriptor:getStatSize	()J
    //   20: lstore 5
    //   22: lload 5
    //   24: ldc2_w 95
    //   27: lcmp
    //   28: ifeq +10 -> 38
    //   31: aload_3
    //   32: invokevirtual 99	android/os/ParcelFileDescriptor:close	()V
    //   35: lload 5
    //   37: lreturn
    //   38: aload_3
    //   39: invokevirtual 99	android/os/ParcelFileDescriptor:close	()V
    //   42: aload_0
    //   43: aload_2
    //   44: iconst_1
    //   45: anewarray 101	java/lang/String
    //   48: dup
    //   49: iconst_0
    //   50: ldc 103
    //   52: aastore
    //   53: aconst_null
    //   54: aconst_null
    //   55: aconst_null
    //   56: invokevirtual 107	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   59: astore 7
    //   61: aload 7
    //   63: invokeinterface 113 1 0
    //   68: pop
    //   69: aload 7
    //   71: iconst_0
    //   72: invokeinterface 117 2 0
    //   77: lstore 18
    //   79: lload 18
    //   81: lconst_0
    //   82: lcmp
    //   83: ifle +22 -> 105
    //   86: aload 7
    //   88: invokeinterface 118 1 0
    //   93: lload 18
    //   95: lreturn
    //   96: astore 4
    //   98: aload_3
    //   99: invokevirtual 99	android/os/ParcelFileDescriptor:close	()V
    //   102: aload 4
    //   104: athrow
    //   105: aload 7
    //   107: invokeinterface 118 1 0
    //   112: aload_0
    //   113: aload_2
    //   114: invokevirtual 122	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   117: astore 11
    //   119: lconst_0
    //   120: lstore 12
    //   122: aload 11
    //   124: ldc2_w 123
    //   127: invokevirtual 130	java/io/InputStream:skip	(J)J
    //   130: lstore 15
    //   132: lload 15
    //   134: lconst_0
    //   135: lcmp
    //   136: ifle +47 -> 183
    //   139: lload 12
    //   141: lload 15
    //   143: ladd
    //   144: lstore 12
    //   146: goto -24 -> 122
    //   149: astore 9
    //   151: ldc 132
    //   153: ldc 134
    //   155: aload 9
    //   157: invokestatic 139	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   160: pop
    //   161: aload 7
    //   163: invokeinterface 118 1 0
    //   168: goto -56 -> 112
    //   171: astore 8
    //   173: aload 7
    //   175: invokeinterface 118 1 0
    //   180: aload 8
    //   182: athrow
    //   183: aload 11
    //   185: invokevirtual 140	java/io/InputStream:close	()V
    //   188: lload 12
    //   190: lreturn
    //   191: astore 14
    //   193: aload 11
    //   195: invokevirtual 140	java/io/InputStream:close	()V
    //   198: aload 14
    //   200: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	201	0	paramContentResolver	ContentResolver
    //   0	201	1	paramString	String
    //   7	107	2	localUri	Uri
    //   15	84	3	localParcelFileDescriptor	android.os.ParcelFileDescriptor
    //   96	7	4	localObject1	java.lang.Object
    //   20	16	5	l1	long
    //   59	115	7	localCursor	android.database.Cursor
    //   171	10	8	localObject2	java.lang.Object
    //   149	7	9	localException	java.lang.Exception
    //   117	77	11	localInputStream	InputStream
    //   120	69	12	l2	long
    //   191	8	14	localObject3	java.lang.Object
    //   130	12	15	l3	long
    //   77	17	18	l4	long
    // Exception table:
    //   from	to	target	type
    //   16	22	96	finally
    //   61	79	149	java/lang/Exception
    //   61	79	171	finally
    //   151	161	171	finally
    //   122	132	191	finally
  }
  
  public final boolean a_(String paramString)
  {
    return false;
  }
  
  public final void b(ByteBuffer paramByteBuffer, String paramString)
  {
    if (Log.isLoggable("HttpOperation", 6))
    {
      if (!"profile".equals(this.c)) {
        break label37;
      }
      Log.e("HttpOperation", "Failed to upload and set profile photo");
    }
    for (;;)
    {
      super.b(paramByteBuffer, paramString);
      return;
      label37:
      if ("scrapbook".equals(this.c)) {
        Log.e("HttpOperation", "Failed to upload and set cover photo");
      }
    }
  }
  
  public final String c()
  {
    return efj.a(this.j, "plusi", u(), false, true, a);
  }
  
  public final String d()
  {
    return "multipart/related; boundary=onetwothreefourfivesixseven";
  }
  
  public final byte[] e()
  {
    return null;
  }
  
  public final ReadableByteChannel f()
  {
    byte[] arrayOfByte = super.e();
    InputStream localInputStream;
    long l;
    if (this.g != null)
    {
      ContentResolver localContentResolver = this.j.getContentResolver();
      localInputStream = localContentResolver.openInputStream(Uri.parse(this.g));
      l = a(localContentResolver, this.g);
      new StringBuilder(59).append("Multipart with streaming data, length: ").append(l);
    }
    for (bkd localbkd = new bkd(arrayOfByte, localInputStream, "image/jpeg", l);; localbkd = new bkd(arrayOfByte, this.d, "image/jpeg"))
    {
      this.z = localbkd.i;
      return Channels.newChannel(new SequenceInputStream(new bke(localbkd)));
      int i = this.d.length;
      new StringBuilder(48).append("Multipart with payload data, length: ").append(i);
    }
  }
  
  public final long g()
  {
    return this.z;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bmr
 * JD-Core Version:    0.7.0.1
 */