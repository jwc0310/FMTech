import java.net.Socket;
import java.util.concurrent.Callable;

final class mal
  implements Callable<Void>
{
  private final Socket a;
  
  public mal(maj parammaj, Socket paramSocket)
  {
    this.a = paramSocket;
  }
  
  /* Error */
  private Void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 15	mal:b	Lmaj;
    //   4: getfield 33	maj:e	Ljava/util/concurrent/Executor;
    //   7: ifnonnull +11 -> 18
    //   10: invokestatic 39	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   13: ldc 41
    //   15: invokevirtual 45	java/lang/Thread:setName	(Ljava/lang/String;)V
    //   18: new 47	org/apache/http/impl/DefaultHttpServerConnection
    //   21: dup
    //   22: invokespecial 48	org/apache/http/impl/DefaultHttpServerConnection:<init>	()V
    //   25: astore_1
    //   26: aload_1
    //   27: aload_0
    //   28: getfield 20	mal:a	Ljava/net/Socket;
    //   31: aload_0
    //   32: getfield 15	mal:b	Lmaj;
    //   35: getfield 52	maj:c	Lorg/apache/http/params/HttpParams;
    //   38: invokevirtual 56	org/apache/http/impl/DefaultHttpServerConnection:bind	(Ljava/net/Socket;Lorg/apache/http/params/HttpParams;)V
    //   41: new 58	org/apache/http/protocol/BasicHttpContext
    //   44: dup
    //   45: invokespecial 59	org/apache/http/protocol/BasicHttpContext:<init>	()V
    //   48: astore 13
    //   50: invokestatic 63	java/lang/Thread:interrupted	()Z
    //   53: ifne +34 -> 87
    //   56: aload_1
    //   57: invokevirtual 66	org/apache/http/impl/DefaultHttpServerConnection:isOpen	()Z
    //   60: ifeq +27 -> 87
    //   63: aload_0
    //   64: getfield 15	mal:b	Lmaj;
    //   67: getfield 70	maj:d	Lorg/apache/http/protocol/HttpService;
    //   70: aload_1
    //   71: aload 13
    //   73: invokevirtual 76	org/apache/http/protocol/HttpService:handleRequest	(Lorg/apache/http/HttpServerConnection;Lorg/apache/http/protocol/HttpContext;)V
    //   76: goto -26 -> 50
    //   79: astore 11
    //   81: aload_1
    //   82: invokevirtual 79	org/apache/http/impl/DefaultHttpServerConnection:shutdown	()V
    //   85: aconst_null
    //   86: areturn
    //   87: aload_1
    //   88: invokevirtual 79	org/apache/http/impl/DefaultHttpServerConnection:shutdown	()V
    //   91: goto -6 -> 85
    //   94: astore 14
    //   96: goto -11 -> 85
    //   99: astore 7
    //   101: aload 7
    //   103: instanceof 81
    //   106: ifeq +45 -> 151
    //   109: aload 7
    //   111: invokevirtual 85	java/io/IOException:getMessage	()Ljava/lang/String;
    //   114: ldc 87
    //   116: invokevirtual 93	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   119: ifne +20 -> 139
    //   122: aload 7
    //   124: invokevirtual 85	java/io/IOException:getMessage	()Ljava/lang/String;
    //   127: ldc 95
    //   129: invokevirtual 93	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   132: istore 10
    //   134: iload 10
    //   136: ifeq +15 -> 151
    //   139: aload_1
    //   140: invokevirtual 79	org/apache/http/impl/DefaultHttpServerConnection:shutdown	()V
    //   143: goto -58 -> 85
    //   146: astore 9
    //   148: goto -63 -> 85
    //   151: ldc 97
    //   153: ldc 99
    //   155: aload 7
    //   157: invokestatic 104	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   160: pop
    //   161: goto -22 -> 139
    //   164: astore 5
    //   166: aload_1
    //   167: invokevirtual 79	org/apache/http/impl/DefaultHttpServerConnection:shutdown	()V
    //   170: aload 5
    //   172: athrow
    //   173: astore_2
    //   174: ldc 97
    //   176: ldc 106
    //   178: aload_2
    //   179: invokestatic 104	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   182: pop
    //   183: aload_1
    //   184: invokevirtual 79	org/apache/http/impl/DefaultHttpServerConnection:shutdown	()V
    //   187: goto -102 -> 85
    //   190: astore 4
    //   192: goto -107 -> 85
    //   195: astore 12
    //   197: goto -112 -> 85
    //   200: astore 6
    //   202: goto -32 -> 170
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	205	0	this	mal
    //   25	159	1	localDefaultHttpServerConnection	org.apache.http.impl.DefaultHttpServerConnection
    //   173	6	2	localHttpException	org.apache.http.HttpException
    //   190	1	4	localIOException1	java.io.IOException
    //   164	7	5	localObject	Object
    //   200	1	6	localIOException2	java.io.IOException
    //   99	57	7	localIOException3	java.io.IOException
    //   146	1	9	localIOException4	java.io.IOException
    //   132	3	10	bool	boolean
    //   79	1	11	localConnectionClosedException	org.apache.http.ConnectionClosedException
    //   195	1	12	localIOException5	java.io.IOException
    //   48	24	13	localBasicHttpContext	org.apache.http.protocol.BasicHttpContext
    //   94	1	14	localIOException6	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   26	50	79	org/apache/http/ConnectionClosedException
    //   50	76	79	org/apache/http/ConnectionClosedException
    //   87	91	94	java/io/IOException
    //   26	50	99	java/io/IOException
    //   50	76	99	java/io/IOException
    //   139	143	146	java/io/IOException
    //   26	50	164	finally
    //   50	76	164	finally
    //   101	134	164	finally
    //   151	161	164	finally
    //   174	183	164	finally
    //   26	50	173	org/apache/http/HttpException
    //   50	76	173	org/apache/http/HttpException
    //   183	187	190	java/io/IOException
    //   81	85	195	java/io/IOException
    //   166	170	200	java/io/IOException
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mal
 * JD-Core Version:    0.7.0.1
 */