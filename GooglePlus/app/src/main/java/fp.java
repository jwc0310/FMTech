import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

public class fp
  extends fj<Cursor>
{
  public Uri d;
  public String[] e;
  public String f;
  public String[] g;
  public String h;
  private fv r = new fv(this);
  private Cursor s;
  private jb t;
  
  public fp(Context paramContext)
  {
    super(paramContext);
  }
  
  public fp(Context paramContext, Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    super(paramContext);
    this.d = paramUri;
    this.e = paramArrayOfString1;
    this.f = paramString1;
    this.g = paramArrayOfString2;
    this.h = paramString2;
  }
  
  public void a(Cursor paramCursor)
  {
    if (this.o) {
      if (paramCursor != null) {
        paramCursor.close();
      }
    }
    Cursor localCursor;
    do
    {
      return;
      localCursor = this.s;
      this.s = paramCursor;
      if (this.m) {
        super.b(paramCursor);
      }
    } while ((localCursor == null) || (localCursor == paramCursor) || (localCursor.isClosed()));
    localCursor.close();
  }
  
  public final void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mUri=");
    paramPrintWriter.println(this.d);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mProjection=");
    paramPrintWriter.println(Arrays.toString(this.e));
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mSelection=");
    paramPrintWriter.println(this.f);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mSelectionArgs=");
    paramPrintWriter.println(Arrays.toString(this.g));
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mSortOrder=");
    paramPrintWriter.println(this.h);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mCursor=");
    paramPrintWriter.println(this.s);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mContentChanged=");
    paramPrintWriter.println(this.p);
  }
  
  /* Error */
  public final void e()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 116	fj:e	()V
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield 118	fp:t	Ljb;
    //   10: ifnull +19 -> 29
    //   13: aload_0
    //   14: getfield 118	fp:t	Ljb;
    //   17: astore_2
    //   18: aload_2
    //   19: monitorenter
    //   20: aload_2
    //   21: getfield 122	jb:a	Z
    //   24: ifeq +8 -> 32
    //   27: aload_2
    //   28: monitorexit
    //   29: aload_0
    //   30: monitorexit
    //   31: return
    //   32: aload_2
    //   33: iconst_1
    //   34: putfield 122	jb:a	Z
    //   37: aload_2
    //   38: getfield 125	jb:b	Ljava/lang/Object;
    //   41: astore 4
    //   43: aload_2
    //   44: monitorexit
    //   45: aload 4
    //   47: ifnull +11 -> 58
    //   50: aload 4
    //   52: checkcast 127	android/os/CancellationSignal
    //   55: invokevirtual 130	android/os/CancellationSignal:cancel	()V
    //   58: aload_2
    //   59: monitorenter
    //   60: aload_2
    //   61: invokevirtual 135	java/lang/Object:notifyAll	()V
    //   64: aload_2
    //   65: monitorexit
    //   66: goto -37 -> 29
    //   69: astore 5
    //   71: aload_2
    //   72: monitorexit
    //   73: aload 5
    //   75: athrow
    //   76: astore_1
    //   77: aload_0
    //   78: monitorexit
    //   79: aload_1
    //   80: athrow
    //   81: astore_3
    //   82: aload_2
    //   83: monitorexit
    //   84: aload_3
    //   85: athrow
    //   86: astore 6
    //   88: aload_2
    //   89: monitorenter
    //   90: aload_2
    //   91: invokevirtual 135	java/lang/Object:notifyAll	()V
    //   94: aload_2
    //   95: monitorexit
    //   96: aload 6
    //   98: athrow
    //   99: astore 7
    //   101: aload_2
    //   102: monitorexit
    //   103: aload 7
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	fp
    //   76	4	1	localObject1	java.lang.Object
    //   17	85	2	localjb	jb
    //   81	4	3	localObject2	java.lang.Object
    //   41	10	4	localObject3	java.lang.Object
    //   69	5	5	localObject4	java.lang.Object
    //   86	11	6	localObject5	java.lang.Object
    //   99	5	7	localObject6	java.lang.Object
    // Exception table:
    //   from	to	target	type
    //   60	66	69	finally
    //   71	73	69	finally
    //   6	20	76	finally
    //   29	31	76	finally
    //   58	60	76	finally
    //   73	76	76	finally
    //   77	79	76	finally
    //   84	86	76	finally
    //   88	90	76	finally
    //   96	99	76	finally
    //   103	106	76	finally
    //   20	29	81	finally
    //   32	45	81	finally
    //   82	84	81	finally
    //   50	58	86	finally
    //   90	96	99	finally
    //   101	103	99	finally
  }
  
  /* Error */
  public Cursor f()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 140	fj:b	Lfk;
    //   6: ifnull +22 -> 28
    //   9: iconst_1
    //   10: istore_2
    //   11: iload_2
    //   12: ifeq +21 -> 33
    //   15: new 142	jc
    //   18: dup
    //   19: invokespecial 144	jc:<init>	()V
    //   22: athrow
    //   23: astore_1
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_1
    //   27: athrow
    //   28: iconst_0
    //   29: istore_2
    //   30: goto -19 -> 11
    //   33: aload_0
    //   34: new 120	jb
    //   37: dup
    //   38: invokespecial 145	jb:<init>	()V
    //   41: putfield 118	fp:t	Ljb;
    //   44: aload_0
    //   45: monitorexit
    //   46: aload_0
    //   47: getfield 149	fu:l	Landroid/content/Context;
    //   50: invokevirtual 155	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   53: astore 5
    //   55: aload_0
    //   56: getfield 33	fp:d	Landroid/net/Uri;
    //   59: astore 6
    //   61: aload_0
    //   62: getfield 35	fp:e	[Ljava/lang/String;
    //   65: astore 7
    //   67: aload_0
    //   68: getfield 37	fp:f	Ljava/lang/String;
    //   71: astore 8
    //   73: aload_0
    //   74: getfield 39	fp:g	[Ljava/lang/String;
    //   77: astore 9
    //   79: aload_0
    //   80: getfield 41	fp:h	Ljava/lang/String;
    //   83: astore 10
    //   85: aload_0
    //   86: getfield 118	fp:t	Ljb;
    //   89: astore 11
    //   91: getstatic 160	fl:a	Lfm;
    //   94: aload 5
    //   96: aload 6
    //   98: aload 7
    //   100: aload 8
    //   102: aload 9
    //   104: aload 10
    //   106: aload 11
    //   108: invokevirtual 165	fm:a	(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljb;)Landroid/database/Cursor;
    //   111: astore 12
    //   113: aload 12
    //   115: ifnull +22 -> 137
    //   118: aload 12
    //   120: invokeinterface 169 1 0
    //   125: pop
    //   126: aload 12
    //   128: aload_0
    //   129: getfield 30	fp:r	Lfv;
    //   132: invokeinterface 173 2 0
    //   137: aload_0
    //   138: monitorenter
    //   139: aload_0
    //   140: aconst_null
    //   141: putfield 118	fp:t	Ljb;
    //   144: aload_0
    //   145: monitorexit
    //   146: aload 12
    //   148: areturn
    //   149: astore 14
    //   151: aload 12
    //   153: invokeinterface 55 1 0
    //   158: aload 14
    //   160: athrow
    //   161: astore_3
    //   162: aload_0
    //   163: monitorenter
    //   164: aload_0
    //   165: aconst_null
    //   166: putfield 118	fp:t	Ljb;
    //   169: aload_0
    //   170: monitorexit
    //   171: aload_3
    //   172: athrow
    //   173: astore 13
    //   175: aload_0
    //   176: monitorexit
    //   177: aload 13
    //   179: athrow
    //   180: astore 4
    //   182: aload_0
    //   183: monitorexit
    //   184: aload 4
    //   186: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	187	0	this	fp
    //   23	4	1	localObject1	java.lang.Object
    //   10	20	2	i	int
    //   161	11	3	localObject2	java.lang.Object
    //   180	5	4	localObject3	java.lang.Object
    //   53	42	5	localContentResolver	android.content.ContentResolver
    //   59	38	6	localUri	Uri
    //   65	34	7	arrayOfString1	String[]
    //   71	30	8	str1	String
    //   77	26	9	arrayOfString2	String[]
    //   83	22	10	str2	String
    //   89	18	11	localjb	jb
    //   111	41	12	localCursor	Cursor
    //   173	5	13	localObject4	java.lang.Object
    //   149	10	14	localRuntimeException	java.lang.RuntimeException
    // Exception table:
    //   from	to	target	type
    //   2	9	23	finally
    //   15	23	23	finally
    //   24	26	23	finally
    //   33	46	23	finally
    //   118	137	149	java/lang/RuntimeException
    //   46	113	161	finally
    //   118	137	161	finally
    //   151	161	161	finally
    //   139	146	173	finally
    //   175	177	173	finally
    //   164	171	180	finally
    //   182	184	180	finally
  }
  
  public void g()
  {
    if (this.s != null) {
      a(this.s);
    }
    if ((m()) || (this.s == null)) {
      a();
    }
  }
  
  public void h()
  {
    k();
  }
  
  public void i()
  {
    super.i();
    h();
    if ((this.s != null) && (!this.s.isClosed())) {
      this.s.close();
    }
    this.s = null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fp
 * JD-Core Version:    0.7.0.1
 */