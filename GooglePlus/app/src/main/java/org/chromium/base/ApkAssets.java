package org.chromium.base;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;

@JNINamespace
public class ApkAssets
{
  @CalledByNative
  public static long[] open(Context paramContext, String paramString)
  {
    AssetFileDescriptor localAssetFileDescriptor = null;
    for (;;)
    {
      try
      {
        localAssetFileDescriptor = paramContext.getAssets().openNonAssetFd(paramString);
        arrayOfLong = new long[3];
        arrayOfLong[0] = localAssetFileDescriptor.getParcelFileDescriptor().detachFd();
        arrayOfLong[1] = localAssetFileDescriptor.getStartOffset();
        arrayOfLong[2] = localAssetFileDescriptor.getLength();
      }
      catch (IOException localIOException2)
      {
        Log.e("ApkAssets", "Error while loading asset " + paramString + ": " + localIOException2);
        long[] arrayOfLong = new long[3];
        arrayOfLong[0] = -1L;
        arrayOfLong[1] = -1L;
        arrayOfLong[2] = -1L;
        if (localAssetFileDescriptor == null) {
          continue;
        }
        try
        {
          localAssetFileDescriptor.close();
          return arrayOfLong;
        }
        catch (IOException localIOException3)
        {
          Log.e("ApkAssets", "Unable to close AssetFileDescriptor", localIOException3);
          return arrayOfLong;
        }
      }
      finally
      {
        if (localAssetFileDescriptor == null) {
          break label165;
        }
      }
      try
      {
        localAssetFileDescriptor.close();
        return arrayOfLong;
      }
      catch (IOException localIOException4)
      {
        Log.e("ApkAssets", "Unable to close AssetFileDescriptor", localIOException4);
        return arrayOfLong;
      }
    }
    try
    {
      localAssetFileDescriptor.close();
      label165:
      throw localObject;
    }
    catch (IOException localIOException1)
    {
      for (;;)
      {
        Log.e("ApkAssets", "Unable to close AssetFileDescriptor", localIOException1);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.base.ApkAssets
 * JD-Core Version:    0.7.0.1
 */