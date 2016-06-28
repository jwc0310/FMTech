import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

public final class ao
{
  private static Method a;
  
  static
  {
    try
    {
      a = SharedPreferences.Editor.class.getMethod("apply", new Class[0]);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      a = null;
    }
  }
  
  private static SharedPreferences a(Context paramContext)
  {
    if (Build.VERSION.SDK_INT < 11) {}
    for (int i = 0;; i = 4) {
      return paramContext.getSharedPreferences("multidex.version", i);
    }
  }
  
  public static List<File> a(Context paramContext, ApplicationInfo paramApplicationInfo, File paramFile, boolean paramBoolean)
  {
    new StringBuilder("MultiDexExtractor.load(").append(paramApplicationInfo.sourceDir).append(", ").append(paramBoolean).append(")");
    File localFile1 = new File(paramApplicationInfo.sourceDir);
    File localFile2 = new File(paramApplicationInfo.sourceDir);
    long l = efj.a(localFile2);
    if (l == -1L) {
      l -= 1L;
    }
    int i;
    if (!paramBoolean)
    {
      SharedPreferences localSharedPreferences = a(paramContext);
      if ((localSharedPreferences.getLong("timestamp", -1L) != b(localFile2)) || (localSharedPreferences.getLong("crc", -1L) != l))
      {
        i = 1;
        if (i != 0) {
          break label185;
        }
      }
    }
    for (;;)
    {
      try
      {
        List localList2 = a(paramContext, localFile1, paramFile);
        localList1 = localList2;
        new StringBuilder("load found ").append(localList1.size()).append(" secondary dex files");
        return localList1;
      }
      catch (IOException localIOException) {}
      i = 0;
      break;
      label185:
      List localList1 = a(localFile1, paramFile);
      a(paramContext, b(localFile1), l, 1 + localList1.size());
    }
  }
  
  private static List<File> a(Context paramContext, File paramFile1, File paramFile2)
  {
    String str = paramFile1.getName() + ".classes";
    int i = a(paramContext).getInt("dex.number", 1);
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 2; j <= i; j++)
    {
      File localFile = new File(paramFile2, str + j + ".zip");
      if (localFile.isFile())
      {
        localArrayList.add(localFile);
        if (!a(localFile))
        {
          new StringBuilder("Invalid zip file: ").append(localFile);
          throw new IOException("Invalid ZIP file.");
        }
      }
      else
      {
        throw new IOException("Missing extracted secondary dex file '" + localFile.getPath() + "'");
      }
    }
    return localArrayList;
  }
  
  private static List<File> a(File paramFile1, File paramFile2)
  {
    String str1 = paramFile1.getName() + ".classes";
    a(paramFile2, str1);
    localArrayList = new ArrayList();
    localZipFile = new ZipFile(paramFile1);
    try
    {
      localObject2 = localZipFile.getEntry("classes" + 2 + ".dex");
      i = 2;
    }
    finally
    {
      for (;;)
      {
        int n;
        boolean bool;
        try
        {
          File localFile;
          localZipFile.close();
          throw localObject1;
          int m = i + 1;
          ZipEntry localZipEntry = localZipFile.getEntry("classes" + m + ".dex");
          Object localObject2 = localZipEntry;
          int i = m;
          continue;
          try
          {
            localZipFile.close();
            return localArrayList;
          }
          catch (IOException localIOException2)
          {
            return localArrayList;
          }
        }
        catch (IOException localIOException1)
        {
          continue;
        }
        int j = bool;
        int k = n;
        continue;
        String str2 = "failed";
      }
    }
    if (localObject2 != null)
    {
      localFile = new File(paramFile2, str1 + i + ".zip");
      localArrayList.add(localFile);
      new StringBuilder("Extraction is needed for file ").append(localFile);
      j = 0;
      for (k = 0; (k < 3) && (j == 0); k = n)
      {
        n = k + 1;
        a(localZipFile, (ZipEntry)localObject2, localFile, str1);
        bool = a(localFile);
        StringBuilder localStringBuilder = new StringBuilder("Extraction ");
        if (!bool) {
          break label418;
        }
        str2 = "success";
        localStringBuilder.append(str2).append(" - length ").append(localFile.getAbsolutePath()).append(": ").append(localFile.length());
        if (bool) {
          break label407;
        }
        localFile.delete();
        if (!localFile.exists()) {
          break label407;
        }
        new StringBuilder("Failed to delete corrupted secondary dex '").append(localFile.getPath()).append("'");
        j = bool;
      }
      if (j == 0) {
        throw new IOException("Could not create zip file " + localFile.getAbsolutePath() + " for secondary dex (" + i + ")");
      }
    }
  }
  
  private static void a(Context paramContext, long paramLong1, long paramLong2, int paramInt)
  {
    SharedPreferences.Editor localEditor = a(paramContext).edit();
    localEditor.putLong("timestamp", paramLong1);
    localEditor.putLong("crc", paramLong2);
    localEditor.putInt("dex.number", paramInt);
    if (a != null) {}
    try
    {
      a.invoke(localEditor, new Object[0]);
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      localEditor.commit();
      return;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      label67:
      break label67;
    }
  }
  
  private static void a(File paramFile, String paramString)
  {
    paramFile.mkdir();
    if (!paramFile.isDirectory()) {
      throw new IOException("Failed to create dex directory " + paramFile.getPath());
    }
    File[] arrayOfFile = paramFile.listFiles(new ap(paramString));
    if (arrayOfFile == null)
    {
      new StringBuilder("Failed to list secondary dex dir content (").append(paramFile.getPath()).append(").");
      return;
    }
    int i = arrayOfFile.length;
    int j = 0;
    label88:
    File localFile;
    if (j < i)
    {
      localFile = arrayOfFile[j];
      new StringBuilder("Trying to delete old file ").append(localFile.getPath()).append(" of size ").append(localFile.length());
      if (localFile.delete()) {
        break label167;
      }
      new StringBuilder("Failed to delete old file ").append(localFile.getPath());
    }
    for (;;)
    {
      j++;
      break label88;
      break;
      label167:
      new StringBuilder("Deleted old file ").append(localFile.getPath());
    }
  }
  
  /* Error */
  private static void a(ZipFile paramZipFile, ZipEntry paramZipEntry, File paramFile, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 277	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   5: astore 4
    //   7: aload_3
    //   8: ldc 136
    //   10: aload_2
    //   11: invokevirtual 281	java/io/File:getParentFile	()Ljava/io/File;
    //   14: invokestatic 285	java/io/File:createTempFile	(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   17: astore 5
    //   19: new 42	java/lang/StringBuilder
    //   22: dup
    //   23: ldc_w 287
    //   26: invokespecial 48	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   29: aload 5
    //   31: invokevirtual 163	java/io/File:getPath	()Ljava/lang/String;
    //   34: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: pop
    //   38: new 289	java/util/zip/ZipOutputStream
    //   41: dup
    //   42: new 291	java/io/BufferedOutputStream
    //   45: dup
    //   46: new 293	java/io/FileOutputStream
    //   49: dup
    //   50: aload 5
    //   52: invokespecial 294	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   55: invokespecial 297	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   58: invokespecial 298	java/util/zip/ZipOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   61: astore 7
    //   63: new 300	java/util/zip/ZipEntry
    //   66: dup
    //   67: ldc_w 302
    //   70: invokespecial 303	java/util/zip/ZipEntry:<init>	(Ljava/lang/String;)V
    //   73: astore 8
    //   75: aload 8
    //   77: aload_1
    //   78: invokevirtual 306	java/util/zip/ZipEntry:getTime	()J
    //   81: invokevirtual 310	java/util/zip/ZipEntry:setTime	(J)V
    //   84: aload 7
    //   86: aload 8
    //   88: invokevirtual 314	java/util/zip/ZipOutputStream:putNextEntry	(Ljava/util/zip/ZipEntry;)V
    //   91: sipush 16384
    //   94: newarray byte
    //   96: astore 13
    //   98: aload 4
    //   100: aload 13
    //   102: invokevirtual 320	java/io/InputStream:read	([B)I
    //   105: istore 14
    //   107: iload 14
    //   109: iconst_m1
    //   110: if_icmpeq +25 -> 135
    //   113: aload 7
    //   115: aload 13
    //   117: iconst_0
    //   118: iload 14
    //   120: invokevirtual 324	java/util/zip/ZipOutputStream:write	([BII)V
    //   123: aload 4
    //   125: aload 13
    //   127: invokevirtual 320	java/io/InputStream:read	([B)I
    //   130: istore 14
    //   132: goto -25 -> 107
    //   135: aload 7
    //   137: invokevirtual 327	java/util/zip/ZipOutputStream:closeEntry	()V
    //   140: aload 7
    //   142: invokevirtual 328	java/util/zip/ZipOutputStream:close	()V
    //   145: new 42	java/lang/StringBuilder
    //   148: dup
    //   149: ldc_w 330
    //   152: invokespecial 48	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   155: aload_2
    //   156: invokevirtual 163	java/io/File:getPath	()Ljava/lang/String;
    //   159: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: pop
    //   163: aload 5
    //   165: aload_2
    //   166: invokevirtual 333	java/io/File:renameTo	(Ljava/io/File;)Z
    //   169: ifne +79 -> 248
    //   172: new 40	java/io/IOException
    //   175: dup
    //   176: new 42	java/lang/StringBuilder
    //   179: dup
    //   180: ldc_w 335
    //   183: invokespecial 48	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   186: aload 5
    //   188: invokevirtual 195	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   191: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: ldc_w 337
    //   197: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: aload_2
    //   201: invokevirtual 195	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   204: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: ldc_w 339
    //   210: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   213: invokevirtual 123	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   216: invokespecial 158	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   219: athrow
    //   220: astore 10
    //   222: aload 4
    //   224: invokeinterface 342 1 0
    //   229: aload 5
    //   231: invokevirtual 207	java/io/File:delete	()Z
    //   234: pop
    //   235: aload 10
    //   237: athrow
    //   238: astore 9
    //   240: aload 7
    //   242: invokevirtual 328	java/util/zip/ZipOutputStream:close	()V
    //   245: aload 9
    //   247: athrow
    //   248: aload 4
    //   250: invokeinterface 342 1 0
    //   255: aload 5
    //   257: invokevirtual 207	java/io/File:delete	()Z
    //   260: pop
    //   261: return
    //   262: astore 16
    //   264: goto -9 -> 255
    //   267: astore 11
    //   269: goto -40 -> 229
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	272	0	paramZipFile	ZipFile
    //   0	272	1	paramZipEntry	ZipEntry
    //   0	272	2	paramFile	File
    //   0	272	3	paramString	String
    //   5	244	4	localInputStream	java.io.InputStream
    //   17	239	5	localFile	File
    //   61	180	7	localZipOutputStream	java.util.zip.ZipOutputStream
    //   73	14	8	localZipEntry	ZipEntry
    //   238	8	9	localObject1	Object
    //   220	16	10	localObject2	Object
    //   267	1	11	localIOException1	IOException
    //   96	30	13	arrayOfByte	byte[]
    //   105	26	14	i	int
    //   262	1	16	localIOException2	IOException
    // Exception table:
    //   from	to	target	type
    //   38	63	220	finally
    //   140	220	220	finally
    //   240	248	220	finally
    //   63	107	238	finally
    //   113	132	238	finally
    //   135	140	238	finally
    //   248	255	262	java/io/IOException
    //   222	229	267	java/io/IOException
  }
  
  static boolean a(File paramFile)
  {
    try
    {
      ZipFile localZipFile = new ZipFile(paramFile);
      try
      {
        localZipFile.close();
        return true;
      }
      catch (IOException localIOException1)
      {
        new StringBuilder("Failed to close zip file: ").append(paramFile.getAbsolutePath());
      }
    }
    catch (ZipException localZipException)
    {
      for (;;)
      {
        new StringBuilder("File ").append(paramFile.getAbsolutePath()).append(" is not a valid zip file.");
      }
    }
    catch (IOException localIOException2)
    {
      for (;;)
      {
        new StringBuilder("Got an IOException trying to open zip file: ").append(paramFile.getAbsolutePath());
      }
    }
    return false;
  }
  
  private static long b(File paramFile)
  {
    long l = paramFile.lastModified();
    if (l == -1L) {
      l -= 1L;
    }
    return l;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ao
 * JD-Core Version:    0.7.0.1
 */