package com.google.android.libraries.photoeditor.core;

import android.content.ContentResolver;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import com.google.android.libraries.photoeditor.util.BitmapHelper;
import gem;
import gfb;
import gff;
import gfg;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@UsedByNative
public enum NativeCore
  implements gem
{
  private static final BitmapFactory.Options d;
  public gfg b;
  public gff c;
  private ContextWrapper e;
  private gfb f;
  private boolean g;
  
  static
  {
    NativeCore[] arrayOfNativeCore = new NativeCore[1];
    arrayOfNativeCore[0] = a;
    h = arrayOfNativeCore;
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    d = localOptions;
    localOptions.inPreferredConfig = Bitmap.Config.ARGB_8888;
    d.inDither = false;
    d.inScaled = false;
    d.inPreferQualityOverSpeed = true;
    d.inMutable = false;
    d.inPurgeable = true;
  }
  
  private NativeCore()
  {
    try
    {
      System.loadLibrary("photoeditor_native");
      return;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      Log.e("NativeCore", "Exception: ", localUnsatisfiedLinkError);
      verifyLibraryHasBeenLoadedProperly();
    }
  }
  
  /* Error */
  private final Bitmap a(String paramString)
  {
    // Byte code:
    //   0: new 94	java/io/File
    //   3: dup
    //   4: new 94	java/io/File
    //   7: dup
    //   8: aload_0
    //   9: getfield 96	com/google/android/libraries/photoeditor/core/NativeCore:e	Landroid/content/ContextWrapper;
    //   12: invokevirtual 102	android/content/ContextWrapper:getCacheDir	()Ljava/io/File;
    //   15: ldc 104
    //   17: invokespecial 107	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   20: aload_1
    //   21: invokespecial 107	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   24: astore_2
    //   25: aload_2
    //   26: invokevirtual 111	java/io/File:exists	()Z
    //   29: ifeq +15 -> 44
    //   32: aload_2
    //   33: invokevirtual 115	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   36: invokestatic 120	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   39: astore 9
    //   41: aload 9
    //   43: areturn
    //   44: aload_0
    //   45: getfield 96	com/google/android/libraries/photoeditor/core/NativeCore:e	Landroid/content/ContextWrapper;
    //   48: invokevirtual 124	android/content/ContextWrapper:getAssets	()Landroid/content/res/AssetManager;
    //   51: astore_3
    //   52: aload_3
    //   53: aload_1
    //   54: invokevirtual 130	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   57: astore 11
    //   59: aload 11
    //   61: astore 5
    //   63: aload 5
    //   65: ifnull +32 -> 97
    //   68: aload 5
    //   70: invokestatic 134	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   73: astore 14
    //   75: aload 14
    //   77: astore 9
    //   79: aload 5
    //   81: ifnull -40 -> 41
    //   84: aload 5
    //   86: invokevirtual 139	java/io/InputStream:close	()V
    //   89: aload 9
    //   91: areturn
    //   92: astore 15
    //   94: aload 9
    //   96: areturn
    //   97: aconst_null
    //   98: astore 9
    //   100: aload 5
    //   102: ifnull -61 -> 41
    //   105: aload 5
    //   107: invokevirtual 139	java/io/InputStream:close	()V
    //   110: aconst_null
    //   111: areturn
    //   112: astore 12
    //   114: aconst_null
    //   115: areturn
    //   116: astore 8
    //   118: aconst_null
    //   119: astore 5
    //   121: aconst_null
    //   122: astore 9
    //   124: aload 5
    //   126: ifnull -85 -> 41
    //   129: aload 5
    //   131: invokevirtual 139	java/io/InputStream:close	()V
    //   134: aconst_null
    //   135: areturn
    //   136: astore 10
    //   138: aconst_null
    //   139: areturn
    //   140: astore 4
    //   142: aconst_null
    //   143: astore 5
    //   145: aload 4
    //   147: astore 6
    //   149: aload 5
    //   151: ifnull +8 -> 159
    //   154: aload 5
    //   156: invokevirtual 139	java/io/InputStream:close	()V
    //   159: aload 6
    //   161: athrow
    //   162: astore 7
    //   164: goto -5 -> 159
    //   167: astore 6
    //   169: goto -20 -> 149
    //   172: astore 13
    //   174: goto -53 -> 121
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	177	0	this	NativeCore
    //   0	177	1	paramString	String
    //   24	9	2	localFile	File
    //   51	2	3	localAssetManager	AssetManager
    //   140	6	4	localObject1	Object
    //   61	94	5	localInputStream1	InputStream
    //   147	13	6	localObject2	Object
    //   167	1	6	localObject3	Object
    //   162	1	7	localIOException1	IOException
    //   116	1	8	localIOException2	IOException
    //   39	84	9	localObject4	Object
    //   136	1	10	localIOException3	IOException
    //   57	3	11	localInputStream2	InputStream
    //   112	1	12	localIOException4	IOException
    //   172	1	13	localIOException5	IOException
    //   73	3	14	localBitmap	Bitmap
    //   92	1	15	localIOException6	IOException
    // Exception table:
    //   from	to	target	type
    //   84	89	92	java/io/IOException
    //   105	110	112	java/io/IOException
    //   52	59	116	java/io/IOException
    //   129	134	136	java/io/IOException
    //   52	59	140	finally
    //   154	159	162	java/io/IOException
    //   68	75	167	finally
    //   68	75	172	java/io/IOException
  }
  
  private final void a()
  {
    if (this.e == null)
    {
      Log.e("NativeCore", "ContextWrapper is not ready!");
      throw new IllegalStateException("Context has not been initialized (use initContext())");
    }
  }
  
  private final native int activateOnScreenFilter(int paramInt, boolean paramBoolean);
  
  private final native int contextActionStatic(long paramLong, int paramInt);
  
  @UsedByNative
  public static int createRGBX8TextureFromBitmap(int paramInt1, int paramInt2, int paramInt3, Bitmap paramBitmap)
  {
    if ((paramBitmap == null) || (paramBitmap.isRecycled())) {
      throw new IllegalArgumentException();
    }
    return createRGBX8TextureFromBitmap(paramInt1, paramInt2, paramInt3, paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight());
  }
  
  public static native int createRGBX8TextureFromBitmap(int paramInt1, int paramInt2, int paramInt3, Bitmap paramBitmap, int paramInt4, int paramInt5, int paramInt6, int paramInt7);
  
  public static native void deactivateOffScreenFilter();
  
  public static native void deleteOffscreenContext();
  
  public static native void deleteTexture(int paramInt);
  
  public static native float getDefaultValue(int paramInt1, int paramInt2);
  
  public static native float getMaxValue(int paramInt1, int paramInt2);
  
  public static native float getMinValue(int paramInt1, int paramInt2);
  
  public static native int initOffscreenContext();
  
  private final native int nativeContextAction(long paramLong, int paramInt);
  
  @UsedByNative
  private static native long nativeTransformFilterParameter(boolean paramBoolean, int paramInt1, int paramInt2, long paramLong1, long paramLong2);
  
  public static native void offscreenContextMakeCurrent();
  
  public static native Bitmap offscreenFilterHundredPercentRegion(FilterParameter paramFilterParameter, Bitmap paramBitmap, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public static native Bitmap offscreenFilterPreviewToBitmap(FilterParameter paramFilterParameter, TilesProvider paramTilesProvider, int paramInt1, int paramInt2);
  
  public static native void offscreenPrepareToApplyImage();
  
  public static native void onSurfaceChanged();
  
  @UsedByNative
  public static native int onscreenFilterTileToScreen(FilterParameter paramFilterParameter, TilesProvider paramTilesProvider, Tile paramTile, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
  
  public static native Bitmap scaleImage(Bitmap paramBitmap, int paramInt1, int paramInt2);
  
  public static native void setRenderScaleMode(int paramInt);
  
  public static native void transformFilterParameterToImageSpace(FilterChain paramFilterChain, FilterParameter paramFilterParameter);
  
  @UsedByNative
  public static native void verifyLibraryHasBeenLoadedProperly();
  
  public final float a(int paramInt1, int paramInt2)
  {
    return getMinValue(paramInt1, paramInt2);
  }
  
  /* Error */
  public final int a(FilterParameter paramFilterParameter, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: monitorenter
    //   2: aload_1
    //   3: checkcast 217	com/google/android/libraries/photoeditor/core/NativeFilterParameter
    //   6: astore 4
    //   8: aload_1
    //   9: invokeinterface 222 1 0
    //   14: bipush 10
    //   16: if_icmpne +20 -> 36
    //   19: aload_0
    //   20: aload 4
    //   22: invokevirtual 226	com/google/android/libraries/photoeditor/core/NativeFilterParameter:getHandle	()J
    //   25: iload_2
    //   26: invokespecial 228	com/google/android/libraries/photoeditor/core/NativeCore:contextActionStatic	(JI)I
    //   29: istore 5
    //   31: aload_1
    //   32: monitorexit
    //   33: iload 5
    //   35: ireturn
    //   36: aload_0
    //   37: aload 4
    //   39: invokevirtual 226	com/google/android/libraries/photoeditor/core/NativeFilterParameter:getHandle	()J
    //   42: iload_2
    //   43: invokespecial 230	com/google/android/libraries/photoeditor/core/NativeCore:nativeContextAction	(JI)I
    //   46: istore 5
    //   48: goto -17 -> 31
    //   51: astore_3
    //   52: aload_1
    //   53: monitorexit
    //   54: aload_3
    //   55: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	NativeCore
    //   0	56	1	paramFilterParameter	FilterParameter
    //   0	56	2	paramInt	int
    //   51	4	3	localObject	Object
    //   6	32	4	localNativeFilterParameter	NativeFilterParameter
    //   29	18	5	i	int
    // Exception table:
    //   from	to	target	type
    //   2	31	51	finally
    //   31	33	51	finally
    //   36	48	51	finally
    //   52	54	51	finally
  }
  
  public final FilterParameter a(int paramInt)
  {
    return FilterFactory.createFilterParameter(paramInt);
  }
  
  public final void a(gfb paramgfb)
  {
    this.f = ((gfb)paramgfb);
  }
  
  public final native int activateOffScreenFilter(int paramInt);
  
  @UsedByNative
  public final boolean activateOnScreenFilterChecked(FilterParameter paramFilterParameter, boolean paramBoolean)
  {
    int i = activateOnScreenFilter(paramFilterParameter.getFilterType(), paramBoolean);
    if (i < 0) {
      throw new IllegalStateException();
    }
    if (i == 0) {
      a(paramFilterParameter, 7);
    }
    return i == 0;
  }
  
  public final float b(int paramInt1, int paramInt2)
  {
    return getMaxValue(paramInt1, paramInt2);
  }
  
  public final Object c(int paramInt1, int paramInt2)
  {
    return Float.valueOf(getDefaultValue(paramInt1, paramInt2));
  }
  
  public final native void cleanUp();
  
  @UsedByNative
  public final void cleanUpContext()
  {
    this.e = null;
  }
  
  @UsedByNative
  public final Bitmap createAutorotatedTexture(String paramString, int paramInt, float paramFloat)
  {
    int i = 1;
    Object localObject = a(paramString);
    int j = ((Bitmap)localObject).getWidth();
    int k = ((Bitmap)localObject).getHeight();
    float f1 = j / k;
    int m;
    if ((f1 != 1.0F) && (paramFloat != 1.0F))
    {
      if (f1 <= 1.0F) {
        break label116;
      }
      m = i;
      if (paramFloat <= 1.0F) {
        break label122;
      }
    }
    for (;;)
    {
      if (m != i)
      {
        Matrix localMatrix = new Matrix();
        localMatrix.postRotate(-90.0F);
        Bitmap localBitmap = Bitmap.createBitmap((Bitmap)localObject, 0, 0, j, k, localMatrix, false);
        ((Bitmap)localObject).recycle();
        localObject = localBitmap;
      }
      return localObject;
      label116:
      m = 0;
      break;
      label122:
      i = 0;
    }
  }
  
  public final native boolean frameShouldShuffle(int paramInt);
  
  @UsedByNative
  public final String getCacheDir()
  {
    a();
    return this.e.getCacheDir().toString();
  }
  
  @UsedByNative
  public final boolean getCompare()
  {
    try
    {
      boolean bool = this.g;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  @UsedByNative
  public final Bitmap getPreviewSrcImage(int paramInt1, int paramInt2)
  {
    Bitmap localBitmap;
    if (this.f == null) {
      localBitmap = null;
    }
    do
    {
      return localBitmap;
      localBitmap = this.f.d();
    } while ((paramInt1 <= 0) || (paramInt2 <= 0));
    return BitmapHelper.a(Bitmap.createScaledBitmap(localBitmap, paramInt1, paramInt2, true));
  }
  
  @UsedByNative
  public final String getRawResourcesPath()
  {
    a();
    return this.e.getFilesDir().toString();
  }
  
  @UsedByNative
  public final Bitmap getScaledSrcImage(int paramInt1, int paramInt2)
  {
    if (this.f == null) {
      return null;
    }
    Bitmap localBitmap = this.f.c();
    if (localBitmap == null)
    {
      Log.e("NativeCore", "getScaledSrcImage failed");
      return null;
    }
    int i = localBitmap.getWidth();
    int j = localBitmap.getHeight();
    if ((paramInt1 > i) || (paramInt2 > j) || ((paramInt1 == i) && (paramInt2 == j)) || ((paramInt1 == -1) && (paramInt2 == -1))) {
      return localBitmap;
    }
    return BitmapHelper.a(Bitmap.createScaledBitmap(localBitmap, paramInt1, paramInt2, true));
  }
  
  @UsedByNative
  public final boolean getSourceImageExtraBoolean(long paramLong, String paramString, boolean paramBoolean)
  {
    if (this.f != null) {}
    for (Bundle localBundle = this.f.a;; localBundle = null)
    {
      if (localBundle != null) {
        paramBoolean = localBundle.getBoolean(paramString, paramBoolean);
      }
      return paramBoolean;
    }
  }
  
  @UsedByNative
  public final int getSourceImageExtraInt(long paramLong, String paramString, int paramInt)
  {
    if (this.f != null) {}
    for (Bundle localBundle = this.f.a;; localBundle = null)
    {
      if (localBundle != null) {
        paramInt = localBundle.getInt(paramString, paramInt);
      }
      return paramInt;
    }
  }
  
  @UsedByNative
  public final long getSourceImageExtraLong(long paramLong1, String paramString, long paramLong2)
  {
    if (this.f != null) {}
    for (Bundle localBundle = this.f.a;; localBundle = null)
    {
      if (localBundle != null) {
        paramLong2 = localBundle.getLong(paramString, paramLong2);
      }
      return paramLong2;
    }
  }
  
  @UsedByNative
  public final String getSourceImageExtraString(long paramLong, String paramString)
  {
    if (this.f != null) {}
    for (Bundle localBundle = this.f.a;; localBundle = null)
    {
      String str = null;
      if (localBundle != null) {
        str = localBundle.getString(paramString);
      }
      return str;
    }
  }
  
  @UsedByNative
  public final long getStreamLength(String paramString)
  {
    a();
    try
    {
      Uri localUri = Uri.parse(paramString);
      long l1 = this.e.getContentResolver().openFileDescriptor(localUri, "r").getStatSize();
      if (l1 < 0L)
      {
        byte[] arrayOfByte = new byte[1048576];
        InputStream localInputStream = this.e.getContentResolver().openInputStream(localUri);
        long l2 = 0L;
        try
        {
          for (;;)
          {
            int i = localInputStream.read(arrayOfByte);
            if (i == -1) {
              break;
            }
            l2 += i;
          }
          return l2;
        }
        finally
        {
          localInputStream.close();
        }
      }
      return l1;
    }
    catch (IOException localIOException)
    {
      Log.e("NativeCore", "getStreamLength IOException");
      l1 = 0L;
    }
  }
  
  @UsedByNative
  public final Bitmap loadBitmap(String paramString)
  {
    Bitmap localBitmap = null;
    a();
    try
    {
      InputStream localInputStream = this.e.getContentResolver().openInputStream(Uri.parse(paramString));
      localBitmap = BitmapFactory.decodeStream(localInputStream, null, d);
      localInputStream.close();
      return localBitmap;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      return localBitmap;
    }
    catch (IOException localIOException)
    {
      return localBitmap;
    }
    catch (FileNotFoundException localFileNotFoundException) {}
    return localBitmap;
  }
  
  @UsedByNative
  public final Bitmap loadBitmapResource(String paramString)
  {
    a();
    Bitmap localBitmap = a(paramString);
    if (localBitmap == null) {
      throw new IllegalStateException();
    }
    return BitmapHelper.a(localBitmap);
  }
  
  @UsedByNative
  public final byte[] loadRawResource(String paramString)
  {
    a();
    Resources localResources = this.e.getResources();
    int i = localResources.getIdentifier(paramString, "raw", this.e.getPackageName());
    if (i == 0) {}
    InputStream localInputStream;
    ByteArrayOutputStream localByteArrayOutputStream;
    for (;;)
    {
      try
      {
        localInputStream = this.e.getAssets().open(paramString);
        localByteArrayOutputStream = new ByteArrayOutputStream();
        byte[] arrayOfByte1 = new byte[16384];
        int j = localInputStream.read(arrayOfByte1);
        if (j == -1) {
          break;
        }
        localByteArrayOutputStream.write(arrayOfByte1, 0, j);
        continue;
        localInputStream = localResources.openRawResource(i);
      }
      catch (IOException localIOException)
      {
        localIOException.printStackTrace();
        return new byte[0];
      }
    }
    localInputStream.close();
    byte[] arrayOfByte2 = localByteArrayOutputStream.toByteArray();
    return arrayOfByte2;
  }
  
  @UsedByNative
  public final void onFilterChainProgressChanged(int paramInt, float paramFloat1, float paramFloat2) {}
  
  @UsedByNative
  public final void onPreviewProgressChanged(float paramFloat1, float paramFloat2)
  {
    if (this.c != null)
    {
      if (paramFloat1 < 0.0F) {
        this.c.D();
      }
    }
    else {
      return;
    }
    if (paramFloat1 < paramFloat2)
    {
      gff localgff = this.c;
      Math.round(paramFloat1);
      Math.round(paramFloat2);
      localgff.c_();
      return;
    }
    this.c.a(null);
  }
  
  @UsedByNative
  public final InputStream openInputStream(String paramString)
  {
    a();
    try
    {
      InputStream localInputStream = this.e.getContentResolver().openInputStream(Uri.parse(paramString));
      return localInputStream;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      Log.e("NativeCore", "getInputStream FileNotFoundException");
    }
    return null;
  }
  
  @UsedByNative
  public final boolean recycleBitmap(Bitmap paramBitmap)
  {
    if ((this.f == null) || ((paramBitmap != this.f.c()) && (paramBitmap != this.f.d())))
    {
      if (!paramBitmap.isRecycled()) {
        paramBitmap.recycle();
      }
      return true;
    }
    return false;
  }
  
  public final native Bitmap renderFilterChain(Bitmap paramBitmap, FilterChain paramFilterChain, int paramInt, boolean paramBoolean);
  
  @UsedByNative
  public final void requestRerender()
  {
    if (this.b != null) {
      this.b.a();
    }
  }
  
  public final native Bitmap rotateImage(Bitmap paramBitmap, int paramInt, boolean paramBoolean);
  
  @UsedByNative
  public final void setCompare(boolean paramBoolean)
  {
    try
    {
      this.g = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  @UsedByNative
  public final void setUpContext(ContextWrapper paramContextWrapper)
  {
    this.e = paramContextWrapper;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.photoeditor.core.NativeCore
 * JD-Core Version:    0.7.0.1
 */