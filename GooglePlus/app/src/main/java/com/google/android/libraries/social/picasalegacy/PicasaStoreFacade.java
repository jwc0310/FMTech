package com.google.android.libraries.social.picasalegacy;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import jss;
import jtb;

public final class PicasaStoreFacade
{
  public static PicasaStoreFacade a;
  private static File i;
  public final Context b;
  jtb c;
  jtb d;
  private String e;
  private Uri f;
  private jss g;
  private final Object h = new Object();
  
  private PicasaStoreFacade(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
    a(true);
  }
  
  public static PicasaStoreFacade a(Context paramContext)
  {
    try
    {
      if (a == null) {
        a = new PicasaStoreFacade(paramContext);
      }
      PicasaStoreFacade localPicasaStoreFacade = a;
      return localPicasaStoreFacade;
    }
    finally {}
  }
  
  public static File a(long paramLong, String paramString)
  {
    File localFile1 = b();
    if (localFile1 == null) {}
    label165:
    for (;;)
    {
      return null;
      String str1 = 20 + String.valueOf(paramString).length() + paramLong + paramString;
      int j = (int)(paramLong % 10L);
      String str2 = String.valueOf("picasa--");
      String str3 = 11 + String.valueOf(str2).length() + str2 + j;
      for (int k = 0;; k++)
      {
        if (k >= 5) {
          break label165;
        }
        File localFile2 = new File(localFile1, str3);
        if (!localFile2.exists()) {
          break;
        }
        if (localFile2.isDirectory())
        {
          File localFile3 = new File(localFile2, str1);
          if (localFile3.exists()) {
            return localFile3;
          }
        }
        str3 = String.valueOf(str3).concat("e");
      }
    }
  }
  
  /* Error */
  public static File b()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 102	com/google/android/libraries/social/picasalegacy/PicasaStoreFacade:i	Ljava/io/File;
    //   6: ifnonnull +68 -> 74
    //   9: new 83	java/io/File
    //   12: dup
    //   13: getstatic 107	android/os/Environment:DIRECTORY_PICTURES	Ljava/lang/String;
    //   16: invokestatic 111	android/os/Environment:getExternalStoragePublicDirectory	(Ljava/lang/String;)Ljava/io/File;
    //   19: ldc 113
    //   21: invokespecial 86	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   24: astore_1
    //   25: aload_1
    //   26: putstatic 102	com/google/android/libraries/social/picasalegacy/PicasaStoreFacade:i	Ljava/io/File;
    //   29: aload_1
    //   30: invokevirtual 93	java/io/File:isDirectory	()Z
    //   33: ifne +16 -> 49
    //   36: getstatic 102	com/google/android/libraries/social/picasalegacy/PicasaStoreFacade:i	Ljava/io/File;
    //   39: invokevirtual 116	java/io/File:mkdirs	()Z
    //   42: istore 8
    //   44: iload 8
    //   46: ifeq +77 -> 123
    //   49: new 83	java/io/File
    //   52: dup
    //   53: getstatic 102	com/google/android/libraries/social/picasalegacy/PicasaStoreFacade:i	Ljava/io/File;
    //   56: ldc 118
    //   58: invokespecial 86	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   61: astore_2
    //   62: aload_2
    //   63: invokevirtual 90	java/io/File:exists	()Z
    //   66: ifne +8 -> 74
    //   69: aload_2
    //   70: invokevirtual 121	java/io/File:createNewFile	()Z
    //   73: pop
    //   74: getstatic 102	com/google/android/libraries/social/picasalegacy/PicasaStoreFacade:i	Ljava/io/File;
    //   77: astore 6
    //   79: ldc 2
    //   81: monitorexit
    //   82: aload 6
    //   84: areturn
    //   85: astore_3
    //   86: getstatic 102	com/google/android/libraries/social/picasalegacy/PicasaStoreFacade:i	Ljava/io/File;
    //   89: invokestatic 56	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   92: astore 4
    //   94: new 50	java/lang/StringBuilder
    //   97: dup
    //   98: bipush 29
    //   100: aload 4
    //   102: invokestatic 56	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   105: invokevirtual 60	java/lang/String:length	()I
    //   108: iadd
    //   109: invokespecial 63	java/lang/StringBuilder:<init>	(I)V
    //   112: ldc 123
    //   114: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: aload 4
    //   119: invokevirtual 70	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: pop
    //   123: aconst_null
    //   124: putstatic 102	com/google/android/libraries/social/picasalegacy/PicasaStoreFacade:i	Ljava/io/File;
    //   127: goto -53 -> 74
    //   130: astore_0
    //   131: ldc 2
    //   133: monitorexit
    //   134: aload_0
    //   135: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   130	5	0	localObject	Object
    //   24	6	1	localFile1	File
    //   61	9	2	localFile2	File
    //   85	1	3	localIOException	java.io.IOException
    //   92	26	4	str	String
    //   77	6	6	localFile3	File
    //   42	3	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   49	74	85	java/io/IOException
    //   3	44	130	finally
    //   49	74	130	finally
    //   74	79	130	finally
    //   86	123	130	finally
    //   123	127	130	finally
  }
  
  final jss a()
  {
    synchronized (this.h)
    {
      if (this.g == null) {
        this.g = new jss(this.b);
      }
      jss localjss = this.g;
      return localjss;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    for (;;)
    {
      Object localObject2;
      ServiceInfo localServiceInfo;
      jtb localjtb;
      try
      {
        List localList = this.b.getPackageManager().queryIntentServices(new Intent("com.google.android.picasastore.PACKAGE_METADATA_LOOKUP"), 132);
        String str1 = this.b.getPackageName();
        Iterator localIterator = localList.iterator();
        localObject2 = null;
        if (!localIterator.hasNext()) {
          break label331;
        }
        localServiceInfo = ((ResolveInfo)localIterator.next()).serviceInfo;
        if ((!localServiceInfo.enabled) || (!localServiceInfo.applicationInfo.enabled))
        {
          String str5 = String.valueOf(localServiceInfo);
          new StringBuilder(37 + String.valueOf(str5).length()).append("ignore disabled picasa sync adapter: ").append(str5);
          localjtb = null;
          if (localjtb == null) {
            continue;
          }
          if ((localObject2 == null) || (localObject2.c < localjtb.c)) {
            break label513;
          }
          if (!localjtb.a.equals(str1)) {
            continue;
          }
          this.d = localjtb;
          continue;
        }
        localBundle = localServiceInfo.metaData;
      }
      finally {}
      Bundle localBundle;
      if (localBundle == null)
      {
        String str6 = String.valueOf(localServiceInfo);
        new StringBuilder(18 + String.valueOf(str6).length()).append("missing metadata: ").append(str6);
        localjtb = null;
      }
      else
      {
        int j = localBundle.getInt("com.google.android.picasastore.priority", -1);
        String str7 = localBundle.getString("com.google.android.picasastore.authority");
        if ((j == -1) || (TextUtils.isEmpty(str7)))
        {
          String str8 = String.valueOf(localServiceInfo);
          new StringBuilder(32 + String.valueOf(str8).length()).append("missing required metadata info: ").append(str8);
          localjtb = null;
        }
        else
        {
          localjtb = new jtb(localServiceInfo.packageName, str7, j);
          continue;
          label331:
          this.c = localObject2;
          if (this.d == null) {
            throw new NullPointerException();
          }
          if (this.c == null) {
            throw new NullPointerException();
          }
          String str2 = this.c.b;
          String str3;
          if (!str2.equals(this.e))
          {
            this.e = str2;
            str3 = String.valueOf(this.e);
            if (str3.length() == 0) {
              break label499;
            }
          }
          label499:
          for (String str4 = "content://".concat(str3);; str4 = new String("content://"))
          {
            Uri localUri = Uri.parse(str4);
            Uri.withAppendedPath(localUri, "photos");
            this.f = Uri.withAppendedPath(localUri, "fingerprint");
            this.f.buildUpon().appendQueryParameter("force_recalculate", "1").build();
            this.f.buildUpon().appendQueryParameter("cache_only", "1").build();
            Uri.withAppendedPath(localUri, "albumcovers");
            return;
          }
          label513:
          localObject2 = localjtb;
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.picasalegacy.PicasaStoreFacade
 * JD-Core Version:    0.7.0.1
 */