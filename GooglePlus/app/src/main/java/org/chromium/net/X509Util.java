package org.chromium.net;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;
import org.chromium.base.annotations.JNINamespace;
import rjl;
import rjm;
import rjn;
import rjo;

@JNINamespace
public class X509Util
{
  static rjn a;
  static KeyStore b;
  static final Object c = new Object();
  private static CertificateFactory d;
  private static rjn e;
  private static rjl f;
  private static KeyStore g;
  private static File h;
  private static Set<Pair<X500Principal, PublicKey>> i;
  private static boolean j;
  private static boolean k = false;
  private static final char[] l = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  
  private static String a(X500Principal paramX500Principal)
  {
    byte[] arrayOfByte = MessageDigest.getInstance("MD5").digest(paramX500Principal.getEncoded());
    char[] arrayOfChar = new char[8];
    for (int m = 0; m < 4; m++)
    {
      arrayOfChar[(m * 2)] = l[(0xF & arrayOfByte[(3 - m)] >> 4)];
      arrayOfChar[(1 + m * 2)] = l[(0xF & arrayOfByte[(3 - m)])];
    }
    return new String(arrayOfChar);
  }
  
  public static X509Certificate a(byte[] paramArrayOfByte)
  {
    a();
    return (X509Certificate)d.generateCertificate(new ByteArrayInputStream(paramArrayOfByte));
  }
  
  /* Error */
  public static AndroidCertVerifyResult a(byte[][] paramArrayOfByte, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +14 -> 15
    //   4: aload_0
    //   5: arraylength
    //   6: ifeq +9 -> 15
    //   9: aload_0
    //   10: iconst_0
    //   11: aaload
    //   12: ifnonnull +30 -> 42
    //   15: new 105	java/lang/IllegalArgumentException
    //   18: dup
    //   19: new 107	java/lang/StringBuilder
    //   22: dup
    //   23: ldc 109
    //   25: invokespecial 112	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   28: aload_0
    //   29: invokestatic 118	java/util/Arrays:deepToString	([Ljava/lang/Object;)Ljava/lang/String;
    //   32: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   38: invokespecial 127	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   41: athrow
    //   42: invokestatic 81	org/chromium/net/X509Util:a	()V
    //   45: aload_0
    //   46: arraylength
    //   47: anewarray 96	java/security/cert/X509Certificate
    //   50: astore 4
    //   52: iconst_0
    //   53: istore 5
    //   55: iload 5
    //   57: aload_0
    //   58: arraylength
    //   59: if_icmpge +43 -> 102
    //   62: aload 4
    //   64: iload 5
    //   66: aload_0
    //   67: iload 5
    //   69: aaload
    //   70: invokestatic 129	org/chromium/net/X509Util:a	([B)Ljava/security/cert/X509Certificate;
    //   73: aastore
    //   74: iinc 5 1
    //   77: goto -22 -> 55
    //   80: astore_3
    //   81: new 131	org/chromium/net/AndroidCertVerifyResult
    //   84: dup
    //   85: iconst_m1
    //   86: invokespecial 134	org/chromium/net/AndroidCertVerifyResult:<init>	(I)V
    //   89: areturn
    //   90: astore 6
    //   92: new 131	org/chromium/net/AndroidCertVerifyResult
    //   95: dup
    //   96: bipush 251
    //   98: invokespecial 134	org/chromium/net/AndroidCertVerifyResult:<init>	(I)V
    //   101: areturn
    //   102: aload 4
    //   104: iconst_0
    //   105: aaload
    //   106: invokevirtual 137	java/security/cert/X509Certificate:checkValidity	()V
    //   109: aload 4
    //   111: iconst_0
    //   112: aaload
    //   113: invokestatic 140	org/chromium/net/X509Util:b	(Ljava/security/cert/X509Certificate;)Z
    //   116: ifne +52 -> 168
    //   119: new 131	org/chromium/net/AndroidCertVerifyResult
    //   122: dup
    //   123: bipush 250
    //   125: invokespecial 134	org/chromium/net/AndroidCertVerifyResult:<init>	(I)V
    //   128: astore 10
    //   130: aload 10
    //   132: areturn
    //   133: astore 9
    //   135: new 131	org/chromium/net/AndroidCertVerifyResult
    //   138: dup
    //   139: bipush 253
    //   141: invokespecial 134	org/chromium/net/AndroidCertVerifyResult:<init>	(I)V
    //   144: areturn
    //   145: astore 8
    //   147: new 131	org/chromium/net/AndroidCertVerifyResult
    //   150: dup
    //   151: bipush 252
    //   153: invokespecial 134	org/chromium/net/AndroidCertVerifyResult:<init>	(I)V
    //   156: areturn
    //   157: astore 7
    //   159: new 131	org/chromium/net/AndroidCertVerifyResult
    //   162: dup
    //   163: iconst_m1
    //   164: invokespecial 134	org/chromium/net/AndroidCertVerifyResult:<init>	(I)V
    //   167: areturn
    //   168: getstatic 34	org/chromium/net/X509Util:c	Ljava/lang/Object;
    //   171: astore 11
    //   173: aload 11
    //   175: monitorenter
    //   176: getstatic 142	org/chromium/net/X509Util:e	Lrjn;
    //   179: ifnonnull +27 -> 206
    //   182: new 131	org/chromium/net/AndroidCertVerifyResult
    //   185: dup
    //   186: iconst_m1
    //   187: invokespecial 134	org/chromium/net/AndroidCertVerifyResult:<init>	(I)V
    //   190: astore 13
    //   192: aload 11
    //   194: monitorexit
    //   195: aload 13
    //   197: areturn
    //   198: astore 12
    //   200: aload 11
    //   202: monitorexit
    //   203: aload 12
    //   205: athrow
    //   206: getstatic 142	org/chromium/net/X509Util:e	Lrjn;
    //   209: aload 4
    //   211: aload_1
    //   212: aload_2
    //   213: invokeinterface 147 4 0
    //   218: astore 23
    //   220: aload 23
    //   222: astore 19
    //   224: aload 19
    //   226: invokeinterface 153 1 0
    //   231: istore 20
    //   233: iconst_0
    //   234: istore 21
    //   236: iload 20
    //   238: ifle +27 -> 265
    //   241: aload 19
    //   243: iconst_m1
    //   244: aload 19
    //   246: invokeinterface 153 1 0
    //   251: iadd
    //   252: invokeinterface 157 2 0
    //   257: checkcast 96	java/security/cert/X509Certificate
    //   260: invokestatic 159	org/chromium/net/X509Util:a	(Ljava/security/cert/X509Certificate;)Z
    //   263: istore 21
    //   265: new 131	org/chromium/net/AndroidCertVerifyResult
    //   268: dup
    //   269: iconst_0
    //   270: iload 21
    //   272: aload 19
    //   274: invokespecial 162	org/chromium/net/AndroidCertVerifyResult:<init>	(IZLjava/util/List;)V
    //   277: astore 22
    //   279: aload 11
    //   281: monitorexit
    //   282: aload 22
    //   284: areturn
    //   285: astore 14
    //   287: getstatic 164	org/chromium/net/X509Util:a	Lrjn;
    //   290: aload 4
    //   292: aload_1
    //   293: aload_2
    //   294: invokeinterface 147 4 0
    //   299: astore 18
    //   301: aload 18
    //   303: astore 19
    //   305: goto -81 -> 224
    //   308: astore 15
    //   310: new 107	java/lang/StringBuilder
    //   313: dup
    //   314: ldc 166
    //   316: invokespecial 112	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   319: aload 14
    //   321: invokevirtual 169	java/security/cert/CertificateException:getMessage	()Ljava/lang/String;
    //   324: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   327: pop
    //   328: new 131	org/chromium/net/AndroidCertVerifyResult
    //   331: dup
    //   332: bipush 254
    //   334: invokespecial 134	org/chromium/net/AndroidCertVerifyResult:<init>	(I)V
    //   337: astore 17
    //   339: aload 11
    //   341: monitorexit
    //   342: aload 17
    //   344: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	345	0	paramArrayOfByte	byte[][]
    //   0	345	1	paramString1	String
    //   0	345	2	paramString2	String
    //   80	1	3	localCertificateException1	java.security.cert.CertificateException
    //   50	241	4	arrayOfX509Certificate	X509Certificate[]
    //   53	22	5	m	int
    //   90	1	6	localCertificateException2	java.security.cert.CertificateException
    //   157	1	7	localCertificateException3	java.security.cert.CertificateException
    //   145	1	8	localCertificateNotYetValidException	java.security.cert.CertificateNotYetValidException
    //   133	1	9	localCertificateExpiredException	java.security.cert.CertificateExpiredException
    //   128	3	10	localAndroidCertVerifyResult1	AndroidCertVerifyResult
    //   198	6	12	localObject2	Object
    //   190	6	13	localAndroidCertVerifyResult2	AndroidCertVerifyResult
    //   285	35	14	localCertificateException4	java.security.cert.CertificateException
    //   308	1	15	localCertificateException5	java.security.cert.CertificateException
    //   337	6	17	localAndroidCertVerifyResult3	AndroidCertVerifyResult
    //   299	3	18	localList1	List
    //   222	82	19	localObject3	Object
    //   231	6	20	n	int
    //   234	37	21	bool	boolean
    //   277	6	22	localAndroidCertVerifyResult4	AndroidCertVerifyResult
    //   218	3	23	localList2	List
    // Exception table:
    //   from	to	target	type
    //   42	45	80	java/security/cert/CertificateException
    //   55	74	90	java/security/cert/CertificateException
    //   102	130	133	java/security/cert/CertificateExpiredException
    //   102	130	145	java/security/cert/CertificateNotYetValidException
    //   102	130	157	java/security/cert/CertificateException
    //   176	195	198	finally
    //   200	203	198	finally
    //   206	220	198	finally
    //   224	233	198	finally
    //   241	265	198	finally
    //   265	282	198	finally
    //   287	301	198	finally
    //   310	342	198	finally
    //   206	220	285	java/security/cert/CertificateException
    //   287	301	308	java/security/cert/CertificateException
  }
  
  static rjn a(KeyStore paramKeyStore)
  {
    TrustManagerFactory localTrustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
    localTrustManagerFactory.init(paramKeyStore);
    for (TrustManager localTrustManager : localTrustManagerFactory.getTrustManagers()) {
      if ((localTrustManager instanceof X509TrustManager)) {
        try
        {
          if (Build.VERSION.SDK_INT >= 17) {
            return new rjo((X509TrustManager)localTrustManager);
          }
          rjm localrjm = new rjm((X509TrustManager)localTrustManager);
          return localrjm;
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          String str = localTrustManager.getClass().getName();
          Log.e("X509Util", "Error creating trust manager (" + str + "): " + localIllegalArgumentException);
        }
      }
    }
    Log.e("X509Util", "Could not find suitable trust manager");
    return null;
  }
  
  static void a()
  {
    synchronized (c)
    {
      c();
      return;
    }
  }
  
  private static boolean a(X509Certificate paramX509Certificate)
  {
    if (g == null) {}
    Pair localPair;
    int m;
    String str2;
    do
    {
      return false;
      localPair = new Pair(paramX509Certificate.getSubjectX500Principal(), paramX509Certificate.getPublicKey());
      if (i.contains(localPair)) {
        return true;
      }
      String str1 = a(paramX509Certificate.getSubjectX500Principal());
      m = 0;
      str2 = str1 + '.' + m;
    } while (!new File(h, str2).exists());
    Certificate localCertificate = g.getCertificate("system:" + str2);
    if (localCertificate != null)
    {
      if ((localCertificate instanceof X509Certificate)) {
        break label181;
      }
      String str3 = localCertificate.getClass().getName();
      Log.e("X509Util", "Anchor " + str2 + " not an X509Certificate: " + str3);
    }
    label181:
    X509Certificate localX509Certificate;
    do
    {
      m++;
      break;
      localX509Certificate = (X509Certificate)localCertificate;
    } while ((!paramX509Certificate.getSubjectX500Principal().equals(localX509Certificate.getSubjectX500Principal())) || (!paramX509Certificate.getPublicKey().equals(localX509Certificate.getPublicKey())));
    i.add(localPair);
    return true;
  }
  
  private static boolean b(X509Certificate paramX509Certificate)
  {
    List localList;
    try
    {
      localList = paramX509Certificate.getExtendedKeyUsage();
      if (localList == null) {
        return true;
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      return false;
    }
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((str.equals("1.3.6.1.5.5.7.3.1")) || (str.equals("2.5.29.37.0")) || (str.equals("2.16.840.1.113730.4.1")) || (str.equals("1.3.6.1.4.1.311.10.3.3"))) {
        return true;
      }
    }
    return false;
  }
  
  /* Error */
  private static void c()
  {
    // Byte code:
    //   0: getstatic 83	org/chromium/net/X509Util:d	Ljava/security/cert/CertificateFactory;
    //   3: ifnonnull +12 -> 15
    //   6: ldc_w 328
    //   9: invokestatic 331	java/security/cert/CertificateFactory:getInstance	(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;
    //   12: putstatic 83	org/chromium/net/X509Util:d	Ljava/security/cert/CertificateFactory;
    //   15: getstatic 142	org/chromium/net/X509Util:e	Lrjn;
    //   18: ifnonnull +10 -> 28
    //   21: aconst_null
    //   22: invokestatic 333	org/chromium/net/X509Util:a	(Ljava/security/KeyStore;)Lrjn;
    //   25: putstatic 142	org/chromium/net/X509Util:e	Lrjn;
    //   28: getstatic 335	org/chromium/net/X509Util:j	Z
    //   31: ifne +70 -> 101
    //   34: ldc_w 337
    //   37: invokestatic 340	java/security/KeyStore:getInstance	(Ljava/lang/String;)Ljava/security/KeyStore;
    //   40: putstatic 231	org/chromium/net/X509Util:g	Ljava/security/KeyStore;
    //   43: getstatic 231	org/chromium/net/X509Util:g	Ljava/security/KeyStore;
    //   46: aconst_null
    //   47: invokevirtual 344	java/security/KeyStore:load	(Ljava/security/KeyStore$LoadStoreParameter;)V
    //   50: new 263	java/io/File
    //   53: dup
    //   54: new 107	java/lang/StringBuilder
    //   57: dup
    //   58: invokespecial 255	java/lang/StringBuilder:<init>	()V
    //   61: ldc_w 346
    //   64: invokestatic 352	java/lang/System:getenv	(Ljava/lang/String;)Ljava/lang/String;
    //   67: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: ldc_w 354
    //   73: invokevirtual 122	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   79: invokespecial 355	java/io/File:<init>	(Ljava/lang/String;)V
    //   82: putstatic 265	org/chromium/net/X509Util:h	Ljava/io/File;
    //   85: getstatic 231	org/chromium/net/X509Util:g	Ljava/security/KeyStore;
    //   88: ifnull +103 -> 191
    //   91: iconst_1
    //   92: istore_3
    //   93: iload_3
    //   94: invokestatic 359	org/chromium/net/X509Util:nativeRecordCertVerifyCapabilitiesHistogram	(Z)V
    //   97: iconst_1
    //   98: putstatic 335	org/chromium/net/X509Util:j	Z
    //   101: getstatic 246	org/chromium/net/X509Util:i	Ljava/util/Set;
    //   104: ifnonnull +13 -> 117
    //   107: new 361	java/util/HashSet
    //   110: dup
    //   111: invokespecial 362	java/util/HashSet:<init>	()V
    //   114: putstatic 246	org/chromium/net/X509Util:i	Ljava/util/Set;
    //   117: getstatic 364	org/chromium/net/X509Util:b	Ljava/security/KeyStore;
    //   120: ifnonnull +19 -> 139
    //   123: invokestatic 367	java/security/KeyStore:getDefaultType	()Ljava/lang/String;
    //   126: invokestatic 340	java/security/KeyStore:getInstance	(Ljava/lang/String;)Ljava/security/KeyStore;
    //   129: putstatic 364	org/chromium/net/X509Util:b	Ljava/security/KeyStore;
    //   132: getstatic 364	org/chromium/net/X509Util:b	Ljava/security/KeyStore;
    //   135: aconst_null
    //   136: invokevirtual 344	java/security/KeyStore:load	(Ljava/security/KeyStore$LoadStoreParameter;)V
    //   139: getstatic 164	org/chromium/net/X509Util:a	Lrjn;
    //   142: ifnonnull +12 -> 154
    //   145: getstatic 364	org/chromium/net/X509Util:b	Ljava/security/KeyStore;
    //   148: invokestatic 333	org/chromium/net/X509Util:a	(Ljava/security/KeyStore;)Lrjn;
    //   151: putstatic 164	org/chromium/net/X509Util:a	Lrjn;
    //   154: getstatic 369	org/chromium/net/X509Util:f	Lrjl;
    //   157: ifnonnull +33 -> 190
    //   160: new 371	rjl
    //   163: dup
    //   164: invokespecial 372	rjl:<init>	()V
    //   167: putstatic 369	org/chromium/net/X509Util:f	Lrjl;
    //   170: invokestatic 376	org/chromium/net/X509Util:nativeGetApplicationContext	()Landroid/content/Context;
    //   173: getstatic 369	org/chromium/net/X509Util:f	Lrjl;
    //   176: new 378	android/content/IntentFilter
    //   179: dup
    //   180: ldc_w 380
    //   183: invokespecial 381	android/content/IntentFilter:<init>	(Ljava/lang/String;)V
    //   186: invokevirtual 387	android/content/Context:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   189: pop
    //   190: return
    //   191: iconst_0
    //   192: istore_3
    //   193: goto -100 -> 93
    //   196: astore_1
    //   197: goto -58 -> 139
    //   200: astore_2
    //   201: goto -116 -> 85
    //   204: astore 4
    //   206: goto -156 -> 50
    // Local variable table:
    //   start	length	slot	name	signature
    //   196	1	1	localIOException1	java.io.IOException
    //   200	1	2	localKeyStoreException	java.security.KeyStoreException
    //   92	101	3	bool	boolean
    //   204	1	4	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   132	139	196	java/io/IOException
    //   34	43	200	java/security/KeyStoreException
    //   43	50	200	java/security/KeyStoreException
    //   50	85	200	java/security/KeyStoreException
    //   43	50	204	java/io/IOException
  }
  
  private static native Context nativeGetApplicationContext();
  
  private static native void nativeNotifyKeyChainChanged();
  
  private static native void nativeRecordCertVerifyCapabilitiesHistogram(boolean paramBoolean);
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.net.X509Util
 * JD-Core Version:    0.7.0.1
 */