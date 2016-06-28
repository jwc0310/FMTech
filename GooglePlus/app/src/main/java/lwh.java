import android.text.SpannableStringBuilder;
import android.text.style.BulletSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.URLSpan;
import android.util.Log;
import java.nio.ByteBuffer;

public final class lwh
  extends mab
{
  private Object[] a;
  private int[] b;
  private int[] c;
  private int[] d;
  private String e;
  
  private lwh(Object[] paramArrayOfObject, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3, String paramString)
  {
    this.a = paramArrayOfObject;
    this.b = paramArrayOfInt1;
    this.c = paramArrayOfInt2;
    this.d = paramArrayOfInt3;
    this.e = paramString;
  }
  
  public static SpannableStringBuilder a(ByteBuffer paramByteBuffer)
  {
    int i = 0;
    int j = paramByteBuffer.getInt();
    String str1;
    Object[] arrayOfObject;
    int[] arrayOfInt1;
    int[] arrayOfInt2;
    int[] arrayOfInt3;
    int m;
    label63:
    Object localObject;
    if (j > 0)
    {
      byte[] arrayOfByte = new byte[j];
      paramByteBuffer.get(arrayOfByte);
      str1 = mab.e(arrayOfByte);
      int k = paramByteBuffer.getInt();
      arrayOfObject = new Object[k];
      arrayOfInt1 = new int[k];
      arrayOfInt2 = new int[k];
      arrayOfInt3 = new int[k];
      m = 0;
      if (m >= k) {
        break label348;
      }
      int i1 = paramByteBuffer.getInt();
      switch (i1)
      {
      default: 
        Log.e("DbSpanned", 29 + "Unknown span type " + i1);
        localObject = null;
      }
    }
    for (;;)
    {
      arrayOfObject[m] = localObject;
      arrayOfInt1[m] = paramByteBuffer.getInt();
      arrayOfInt2[m] = paramByteBuffer.getInt();
      arrayOfInt3[m] = paramByteBuffer.getInt();
      m++;
      break label63;
      str1 = null;
      break;
      localObject = new StrikethroughSpan();
      continue;
      localObject = new lxf(d(paramByteBuffer));
      continue;
      String str2 = d(paramByteBuffer);
      if (paramByteBuffer.get() == 1) {}
      for (boolean bool = true;; bool = false)
      {
        lxw locallxw = new lxw(str2);
        locallxw.b = bool;
        localObject = locallxw;
        break;
      }
      localObject = new URLSpan(d(paramByteBuffer));
      continue;
      localObject = new StyleSpan(paramByteBuffer.getInt());
      continue;
      localObject = new BulletSpan();
      continue;
      localObject = new ForegroundColorSpan(paramByteBuffer.getInt());
      continue;
      localObject = new SuperscriptSpan();
    }
    label348:
    if (str1 != null) {}
    SpannableStringBuilder localSpannableStringBuilder;
    for (;;)
    {
      lwh locallwh = new lwh(arrayOfObject, arrayOfInt1, arrayOfInt2, arrayOfInt3, str1);
      localSpannableStringBuilder = new SpannableStringBuilder(locallwh.e);
      int n = locallwh.a.length;
      while (i < n)
      {
        if (locallwh.a[i] != null) {
          localSpannableStringBuilder.setSpan(locallwh.a[i], locallwh.b[i], locallwh.c[i], locallwh.d[i]);
        }
        i++;
      }
      str1 = "";
    }
    return localSpannableStringBuilder;
  }
  
  /* Error */
  public static byte[] a(android.text.Spanned paramSpanned)
  {
    // Byte code:
    //   0: new 121	java/io/ByteArrayOutputStream
    //   3: dup
    //   4: sipush 256
    //   7: invokespecial 122	java/io/ByteArrayOutputStream:<init>	(I)V
    //   10: astore_1
    //   11: new 124	java/io/DataOutputStream
    //   14: dup
    //   15: aload_1
    //   16: invokespecial 127	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   19: astore_2
    //   20: aload_0
    //   21: invokevirtual 128	java/lang/Object:toString	()Ljava/lang/String;
    //   24: astore 7
    //   26: aload 7
    //   28: ifnull +173 -> 201
    //   31: aload 7
    //   33: ldc 130
    //   35: invokevirtual 136	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   38: astore 8
    //   40: aload_2
    //   41: aload 8
    //   43: arraylength
    //   44: invokevirtual 139	java/io/DataOutputStream:writeInt	(I)V
    //   47: aload_2
    //   48: aload 8
    //   50: invokevirtual 143	java/io/DataOutputStream:write	([B)V
    //   53: aload_0
    //   54: iconst_0
    //   55: aload_0
    //   56: invokeinterface 148 1 0
    //   61: ldc 43
    //   63: invokeinterface 152 4 0
    //   68: astore 9
    //   70: new 121	java/io/ByteArrayOutputStream
    //   73: dup
    //   74: sipush 256
    //   77: invokespecial 122	java/io/ByteArrayOutputStream:<init>	(I)V
    //   80: astore 10
    //   82: new 124	java/io/DataOutputStream
    //   85: dup
    //   86: aload 10
    //   88: invokespecial 127	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   91: astore 11
    //   93: iconst_0
    //   94: istore 12
    //   96: iconst_0
    //   97: istore 13
    //   99: iload 12
    //   101: aload 9
    //   103: arraylength
    //   104: if_icmpge +375 -> 479
    //   107: aload 9
    //   109: iload 12
    //   111: aaload
    //   112: astore 16
    //   114: aload 11
    //   116: invokevirtual 155	java/io/DataOutputStream:size	()I
    //   119: istore 17
    //   121: aload 16
    //   123: instanceof 70
    //   126: ifeq +91 -> 217
    //   129: aload 11
    //   131: iconst_0
    //   132: invokevirtual 139	java/io/DataOutputStream:writeInt	(I)V
    //   135: aload 11
    //   137: invokevirtual 155	java/io/DataOutputStream:size	()I
    //   140: iload 17
    //   142: if_icmpeq +386 -> 528
    //   145: iconst_1
    //   146: istore 18
    //   148: iload 18
    //   150: ifeq +283 -> 433
    //   153: iload 13
    //   155: iconst_1
    //   156: iadd
    //   157: istore 21
    //   159: aload 11
    //   161: aload_0
    //   162: aload 16
    //   164: invokeinterface 159 2 0
    //   169: invokevirtual 139	java/io/DataOutputStream:writeInt	(I)V
    //   172: aload 11
    //   174: aload_0
    //   175: aload 16
    //   177: invokeinterface 162 2 0
    //   182: invokevirtual 139	java/io/DataOutputStream:writeInt	(I)V
    //   185: aload 11
    //   187: aload_0
    //   188: aload 16
    //   190: invokeinterface 165 2 0
    //   195: invokevirtual 139	java/io/DataOutputStream:writeInt	(I)V
    //   198: goto +320 -> 518
    //   201: aload_2
    //   202: iconst_0
    //   203: invokevirtual 139	java/io/DataOutputStream:writeInt	(I)V
    //   206: goto -153 -> 53
    //   209: astore 5
    //   211: aload_2
    //   212: invokevirtual 168	java/io/DataOutputStream:close	()V
    //   215: aconst_null
    //   216: areturn
    //   217: aload 16
    //   219: instanceof 73
    //   222: ifeq +41 -> 263
    //   225: aload 11
    //   227: iconst_1
    //   228: invokevirtual 139	java/io/DataOutputStream:writeInt	(I)V
    //   231: aload 11
    //   233: aload 16
    //   235: checkcast 73	lxf
    //   238: invokevirtual 171	lxf:getURL	()Ljava/lang/String;
    //   241: getstatic 173	lxf:a	Ljava/lang/String;
    //   244: invokevirtual 174	java/lang/String:length	()I
    //   247: invokevirtual 178	java/lang/String:substring	(I)Ljava/lang/String;
    //   250: invokestatic 181	lwh:a	(Ljava/io/DataOutputStream;Ljava/lang/String;)V
    //   253: goto -118 -> 135
    //   256: astore_3
    //   257: aload_2
    //   258: invokevirtual 168	java/io/DataOutputStream:close	()V
    //   261: aload_3
    //   262: athrow
    //   263: aload 16
    //   265: instanceof 84
    //   268: ifeq +39 -> 307
    //   271: aload 11
    //   273: iconst_2
    //   274: invokevirtual 139	java/io/DataOutputStream:writeInt	(I)V
    //   277: aload 16
    //   279: checkcast 84	lxw
    //   282: astore 22
    //   284: aload 11
    //   286: aload 22
    //   288: invokevirtual 182	lxw:getURL	()Ljava/lang/String;
    //   291: invokestatic 181	lwh:a	(Ljava/io/DataOutputStream;Ljava/lang/String;)V
    //   294: aload 11
    //   296: aload 22
    //   298: getfield 88	lxw:b	Z
    //   301: invokevirtual 186	java/io/DataOutputStream:writeBoolean	(Z)V
    //   304: goto -169 -> 135
    //   307: aload 16
    //   309: instanceof 90
    //   312: ifeq +25 -> 337
    //   315: aload 11
    //   317: iconst_3
    //   318: invokevirtual 139	java/io/DataOutputStream:writeInt	(I)V
    //   321: aload 11
    //   323: aload 16
    //   325: checkcast 90	android/text/style/URLSpan
    //   328: invokevirtual 187	android/text/style/URLSpan:getURL	()Ljava/lang/String;
    //   331: invokestatic 181	lwh:a	(Ljava/io/DataOutputStream;Ljava/lang/String;)V
    //   334: goto -199 -> 135
    //   337: aload 16
    //   339: instanceof 93
    //   342: ifeq +25 -> 367
    //   345: aload 11
    //   347: iconst_4
    //   348: invokevirtual 139	java/io/DataOutputStream:writeInt	(I)V
    //   351: aload 11
    //   353: aload 16
    //   355: checkcast 93	android/text/style/StyleSpan
    //   358: invokevirtual 190	android/text/style/StyleSpan:getStyle	()I
    //   361: invokevirtual 139	java/io/DataOutputStream:writeInt	(I)V
    //   364: goto -229 -> 135
    //   367: aload 16
    //   369: instanceof 96
    //   372: ifeq +12 -> 384
    //   375: aload 11
    //   377: iconst_5
    //   378: invokevirtual 139	java/io/DataOutputStream:writeInt	(I)V
    //   381: goto -246 -> 135
    //   384: aload 16
    //   386: instanceof 99
    //   389: ifeq +26 -> 415
    //   392: aload 11
    //   394: bipush 6
    //   396: invokevirtual 139	java/io/DataOutputStream:writeInt	(I)V
    //   399: aload 11
    //   401: aload 16
    //   403: checkcast 99	android/text/style/ForegroundColorSpan
    //   406: invokevirtual 193	android/text/style/ForegroundColorSpan:getForegroundColor	()I
    //   409: invokevirtual 139	java/io/DataOutputStream:writeInt	(I)V
    //   412: goto -277 -> 135
    //   415: aload 16
    //   417: instanceof 102
    //   420: ifeq -285 -> 135
    //   423: aload 11
    //   425: bipush 7
    //   427: invokevirtual 139	java/io/DataOutputStream:writeInt	(I)V
    //   430: goto -295 -> 135
    //   433: aload 16
    //   435: invokevirtual 197	java/lang/Object:getClass	()Ljava/lang/Class;
    //   438: invokestatic 201	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   441: astore 19
    //   443: new 47	java/lang/StringBuilder
    //   446: dup
    //   447: bipush 37
    //   449: aload 19
    //   451: invokestatic 201	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   454: invokevirtual 174	java/lang/String:length	()I
    //   457: iadd
    //   458: invokespecial 50	java/lang/StringBuilder:<init>	(I)V
    //   461: ldc 203
    //   463: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   466: aload 19
    //   468: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   471: pop
    //   472: iload 13
    //   474: istore 21
    //   476: goto +42 -> 518
    //   479: aload_2
    //   480: iload 13
    //   482: invokevirtual 139	java/io/DataOutputStream:writeInt	(I)V
    //   485: aload 10
    //   487: aload_2
    //   488: invokevirtual 206	java/io/ByteArrayOutputStream:writeTo	(Ljava/io/OutputStream;)V
    //   491: aload_1
    //   492: invokevirtual 210	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   495: astore 14
    //   497: aload_2
    //   498: invokevirtual 168	java/io/DataOutputStream:close	()V
    //   501: aload 14
    //   503: areturn
    //   504: astore 15
    //   506: aload 14
    //   508: areturn
    //   509: astore 6
    //   511: aconst_null
    //   512: areturn
    //   513: astore 4
    //   515: goto -254 -> 261
    //   518: iinc 12 1
    //   521: iload 21
    //   523: istore 13
    //   525: goto -426 -> 99
    //   528: iconst_0
    //   529: istore 18
    //   531: goto -383 -> 148
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	534	0	paramSpanned	android.text.Spanned
    //   10	482	1	localByteArrayOutputStream1	java.io.ByteArrayOutputStream
    //   19	479	2	localDataOutputStream1	java.io.DataOutputStream
    //   256	6	3	localObject1	Object
    //   513	1	4	localIOException1	java.io.IOException
    //   209	1	5	localIOException2	java.io.IOException
    //   509	1	6	localIOException3	java.io.IOException
    //   24	8	7	str1	String
    //   38	11	8	arrayOfByte1	byte[]
    //   68	40	9	arrayOfObject	Object[]
    //   80	406	10	localByteArrayOutputStream2	java.io.ByteArrayOutputStream
    //   91	333	11	localDataOutputStream2	java.io.DataOutputStream
    //   94	425	12	i	int
    //   97	427	13	j	int
    //   495	12	14	arrayOfByte2	byte[]
    //   504	1	15	localIOException4	java.io.IOException
    //   112	322	16	localObject2	Object
    //   119	24	17	k	int
    //   146	384	18	m	int
    //   441	26	19	str2	String
    //   157	365	21	n	int
    //   282	15	22	locallxw	lxw
    // Exception table:
    //   from	to	target	type
    //   20	26	209	java/io/IOException
    //   31	53	209	java/io/IOException
    //   53	93	209	java/io/IOException
    //   99	135	209	java/io/IOException
    //   135	145	209	java/io/IOException
    //   159	198	209	java/io/IOException
    //   201	206	209	java/io/IOException
    //   217	253	209	java/io/IOException
    //   263	304	209	java/io/IOException
    //   307	334	209	java/io/IOException
    //   337	364	209	java/io/IOException
    //   367	381	209	java/io/IOException
    //   384	412	209	java/io/IOException
    //   415	430	209	java/io/IOException
    //   433	472	209	java/io/IOException
    //   479	497	209	java/io/IOException
    //   20	26	256	finally
    //   31	53	256	finally
    //   53	93	256	finally
    //   99	135	256	finally
    //   135	145	256	finally
    //   159	198	256	finally
    //   201	206	256	finally
    //   217	253	256	finally
    //   263	304	256	finally
    //   307	334	256	finally
    //   337	364	256	finally
    //   367	381	256	finally
    //   384	412	256	finally
    //   415	430	256	finally
    //   433	472	256	finally
    //   479	497	256	finally
    //   497	501	504	java/io/IOException
    //   211	215	509	java/io/IOException
    //   257	261	513	java/io/IOException
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lwh
 * JD-Core Version:    0.7.0.1
 */