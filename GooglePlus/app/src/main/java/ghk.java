import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public final class ghk
{
  private static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss", Locale.US);
  
  public static Bitmap a(int paramInt1, int paramInt2)
  {
    int i = Math.max(paramInt1, 32);
    int j = Math.max(paramInt2, 32);
    int k = Math.min(128, i);
    int m = Math.min(128, j);
    int[] arrayOfInt = new int[k * m];
    Random localRandom = new Random();
    for (int n = 0; n < arrayOfInt.length; n++) {
      arrayOfInt[n] = (0xFF000000 | localRandom.nextInt(16777216));
    }
    Bitmap localBitmap = Bitmap.createBitmap(arrayOfInt, k, m, Bitmap.Config.ARGB_8888);
    if ((k != i) || (m != j)) {
      localBitmap = Bitmap.createScaledBitmap(localBitmap, i, j, false);
    }
    return localBitmap;
  }
  
  public static Uri a()
  {
    File[] arrayOfFile1 = new File[3];
    arrayOfFile1[0] = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera");
    arrayOfFile1[1] = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
    arrayOfFile1[2] = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
    int i = 0;
    File localFile1 = null;
    if (i < 3)
    {
      File localFile2 = arrayOfFile1[i];
      if ((localFile2 == null) || (!localFile2.isDirectory())) {
        localFile1 = null;
      }
      for (;;)
      {
        if (localFile1 != null) {
          break label118;
        }
        i++;
        break;
        File[] arrayOfFile2 = localFile2.listFiles(new ghl());
        if ((arrayOfFile2 != null) && (arrayOfFile2.length > 0)) {
          localFile1 = arrayOfFile2[(-1 + arrayOfFile2.length)];
        } else {
          localFile1 = null;
        }
      }
    }
    label118:
    if (localFile1 != null) {
      return Uri.fromFile(localFile1);
    }
    return a(a(100, 100), "", "GeneratedSampleImage", false);
  }
  
  private static Uri a(Bitmap paramBitmap, String paramString1, String paramString2, boolean paramBoolean)
  {
    File localFile = a(paramString1, paramString2, false);
    try
    {
      FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
      paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localFileOutputStream);
      localFileOutputStream.close();
      return Uri.fromFile(localFile);
    }
    catch (IOException localIOException) {}
    return null;
  }
  
  private static File a(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (paramString2.isEmpty()) {
      throw new IllegalArgumentException("fileBaseName must not be empty");
    }
    if (paramBoolean)
    {
      String str3 = a.format(new Date());
      paramString2 = 1 + String.valueOf(paramString2).length() + String.valueOf(str3).length() + paramString2 + "_" + str3;
    }
    String str1 = String.valueOf(Environment.DIRECTORY_PICTURES);
    File localFile1 = Environment.getExternalStoragePublicDirectory(1 + String.valueOf(str1).length() + String.valueOf(paramString1).length() + str1 + "/" + paramString1);
    if (!localFile1.isDirectory()) {
      localFile1.mkdir();
    }
    try
    {
      String str2 = String.valueOf(localFile1);
      File localFile2 = new File(5 + String.valueOf(str2).length() + String.valueOf(paramString2).length() + str2 + "/" + paramString2 + ".png");
      localFile2.createNewFile();
      return localFile2;
    }
    catch (IOException localIOException) {}
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ghk
 * JD-Core Version:    0.7.0.1
 */