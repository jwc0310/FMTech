package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import ehl;
import java.io.File;

public class BitmapTeleporter
  implements SafeParcelable
{
  public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new ehl();
  final int a;
  ParcelFileDescriptor b;
  final int c;
  public File d;
  private Bitmap e;
  
  public BitmapTeleporter(int paramInt1, ParcelFileDescriptor paramParcelFileDescriptor, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramParcelFileDescriptor;
    this.c = paramInt2;
    this.e = null;
  }
  
  public BitmapTeleporter(Bitmap paramBitmap)
  {
    this.a = 1;
    this.b = null;
    this.c = 0;
    this.e = paramBitmap;
  }
  
  /* Error */
  private final java.io.FileOutputStream a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 45	com/google/android/gms/common/data/BitmapTeleporter:d	Ljava/io/File;
    //   4: ifnonnull +13 -> 17
    //   7: new 47	java/lang/IllegalStateException
    //   10: dup
    //   11: ldc 49
    //   13: invokespecial 52	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   16: athrow
    //   17: ldc 54
    //   19: ldc 56
    //   21: aload_0
    //   22: getfield 45	com/google/android/gms/common/data/BitmapTeleporter:d	Ljava/io/File;
    //   25: invokestatic 62	java/io/File:createTempFile	(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   28: astore_2
    //   29: new 64	java/io/FileOutputStream
    //   32: dup
    //   33: aload_2
    //   34: invokespecial 67	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   37: astore_3
    //   38: aload_0
    //   39: aload_2
    //   40: ldc 68
    //   42: invokestatic 74	android/os/ParcelFileDescriptor:open	(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;
    //   45: putfield 33	com/google/android/gms/common/data/BitmapTeleporter:b	Landroid/os/ParcelFileDescriptor;
    //   48: aload_2
    //   49: invokevirtual 78	java/io/File:delete	()Z
    //   52: pop
    //   53: aload_3
    //   54: areturn
    //   55: astore_1
    //   56: new 47	java/lang/IllegalStateException
    //   59: dup
    //   60: ldc 80
    //   62: aload_1
    //   63: invokespecial 83	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   66: athrow
    //   67: astore 4
    //   69: new 47	java/lang/IllegalStateException
    //   72: dup
    //   73: ldc 85
    //   75: invokespecial 52	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	BitmapTeleporter
    //   55	8	1	localIOException	java.io.IOException
    //   28	21	2	localFile	File
    //   37	17	3	localFileOutputStream	java.io.FileOutputStream
    //   67	1	4	localFileNotFoundException	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   17	29	55	java/io/IOException
    //   29	48	67	java/io/FileNotFoundException
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  /* Error */
  public void writeToParcel(android.os.Parcel paramParcel, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 33	com/google/android/gms/common/data/BitmapTeleporter:b	Landroid/os/ParcelFileDescriptor;
    //   4: ifnonnull +107 -> 111
    //   7: aload_0
    //   8: getfield 37	com/google/android/gms/common/data/BitmapTeleporter:e	Landroid/graphics/Bitmap;
    //   11: astore 7
    //   13: aload 7
    //   15: invokevirtual 94	android/graphics/Bitmap:getRowBytes	()I
    //   18: aload 7
    //   20: invokevirtual 97	android/graphics/Bitmap:getHeight	()I
    //   23: imul
    //   24: invokestatic 103	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   27: astore 8
    //   29: aload 7
    //   31: aload 8
    //   33: invokevirtual 107	android/graphics/Bitmap:copyPixelsToBuffer	(Ljava/nio/Buffer;)V
    //   36: aload 8
    //   38: invokevirtual 111	java/nio/ByteBuffer:array	()[B
    //   41: astore 9
    //   43: new 113	java/io/DataOutputStream
    //   46: dup
    //   47: aload_0
    //   48: invokespecial 115	com/google/android/gms/common/data/BitmapTeleporter:a	()Ljava/io/FileOutputStream;
    //   51: invokespecial 118	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   54: astore 10
    //   56: aload 10
    //   58: aload 9
    //   60: arraylength
    //   61: invokevirtual 122	java/io/DataOutputStream:writeInt	(I)V
    //   64: aload 10
    //   66: aload 7
    //   68: invokevirtual 125	android/graphics/Bitmap:getWidth	()I
    //   71: invokevirtual 122	java/io/DataOutputStream:writeInt	(I)V
    //   74: aload 10
    //   76: aload 7
    //   78: invokevirtual 97	android/graphics/Bitmap:getHeight	()I
    //   81: invokevirtual 122	java/io/DataOutputStream:writeInt	(I)V
    //   84: aload 10
    //   86: aload 7
    //   88: invokevirtual 129	android/graphics/Bitmap:getConfig	()Landroid/graphics/Bitmap$Config;
    //   91: invokevirtual 135	android/graphics/Bitmap$Config:toString	()Ljava/lang/String;
    //   94: invokevirtual 138	java/io/DataOutputStream:writeUTF	(Ljava/lang/String;)V
    //   97: aload 10
    //   99: aload 9
    //   101: invokevirtual 142	java/io/DataOutputStream:write	([B)V
    //   104: aload 10
    //   106: invokeinterface 147 1 0
    //   111: iload_2
    //   112: iconst_1
    //   113: ior
    //   114: istore_3
    //   115: aload_1
    //   116: sipush 20293
    //   119: invokestatic 153	efj:m	(Landroid/os/Parcel;I)I
    //   122: istore 4
    //   124: aload_0
    //   125: getfield 31	com/google/android/gms/common/data/BitmapTeleporter:a	I
    //   128: istore 5
    //   130: aload_1
    //   131: iconst_1
    //   132: iconst_4
    //   133: invokestatic 156	efj:b	(Landroid/os/Parcel;II)V
    //   136: aload_1
    //   137: iload 5
    //   139: invokevirtual 159	android/os/Parcel:writeInt	(I)V
    //   142: aload_1
    //   143: iconst_2
    //   144: aload_0
    //   145: getfield 33	com/google/android/gms/common/data/BitmapTeleporter:b	Landroid/os/ParcelFileDescriptor;
    //   148: iload_3
    //   149: iconst_0
    //   150: invokestatic 162	efj:a	(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V
    //   153: aload_0
    //   154: getfield 35	com/google/android/gms/common/data/BitmapTeleporter:c	I
    //   157: istore 6
    //   159: aload_1
    //   160: iconst_3
    //   161: iconst_4
    //   162: invokestatic 156	efj:b	(Landroid/os/Parcel;II)V
    //   165: aload_1
    //   166: iload 6
    //   168: invokevirtual 159	android/os/Parcel:writeInt	(I)V
    //   171: aload_1
    //   172: iload 4
    //   174: invokestatic 165	efj:n	(Landroid/os/Parcel;I)V
    //   177: aload_0
    //   178: aconst_null
    //   179: putfield 33	com/google/android/gms/common/data/BitmapTeleporter:b	Landroid/os/ParcelFileDescriptor;
    //   182: return
    //   183: astore 13
    //   185: new 47	java/lang/IllegalStateException
    //   188: dup
    //   189: ldc 167
    //   191: aload 13
    //   193: invokespecial 83	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   196: athrow
    //   197: astore 11
    //   199: aload 10
    //   201: invokeinterface 147 1 0
    //   206: aload 11
    //   208: athrow
    //   209: astore 14
    //   211: goto -100 -> 111
    //   214: astore 12
    //   216: goto -10 -> 206
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	219	0	this	BitmapTeleporter
    //   0	219	1	paramParcel	android.os.Parcel
    //   0	219	2	paramInt	int
    //   114	35	3	i	int
    //   122	51	4	j	int
    //   128	10	5	k	int
    //   157	10	6	m	int
    //   11	76	7	localBitmap	Bitmap
    //   27	10	8	localByteBuffer	java.nio.ByteBuffer
    //   41	59	9	arrayOfByte	byte[]
    //   54	146	10	localDataOutputStream	java.io.DataOutputStream
    //   197	10	11	localObject	Object
    //   214	1	12	localIOException1	java.io.IOException
    //   183	9	13	localIOException2	java.io.IOException
    //   209	1	14	localIOException3	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   56	104	183	java/io/IOException
    //   56	104	197	finally
    //   185	197	197	finally
    //   104	111	209	java/io/IOException
    //   199	206	214	java/io/IOException
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.BitmapTeleporter
 * JD-Core Version:    0.7.0.1
 */