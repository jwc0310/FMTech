package com.google.android.gms.feedback;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import evn;
import java.io.File;

public class FileTeleporter
  implements SafeParcelable
{
  public static final Parcelable.Creator<FileTeleporter> CREATOR = new evn();
  final int a;
  ParcelFileDescriptor b;
  final String c;
  final String d;
  public File e;
  
  public FileTeleporter(int paramInt, ParcelFileDescriptor paramParcelFileDescriptor, String paramString1, String paramString2)
  {
    this.a = paramInt;
    this.b = paramParcelFileDescriptor;
    this.c = paramString1;
    this.d = paramString2;
  }
  
  /* Error */
  private final java.io.FileOutputStream a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 44	com/google/android/gms/feedback/FileTeleporter:e	Ljava/io/File;
    //   4: ifnonnull +13 -> 17
    //   7: new 46	java/lang/IllegalStateException
    //   10: dup
    //   11: ldc 48
    //   13: invokespecial 51	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   16: athrow
    //   17: ldc 53
    //   19: ldc 55
    //   21: aload_0
    //   22: getfield 44	com/google/android/gms/feedback/FileTeleporter:e	Ljava/io/File;
    //   25: invokestatic 61	java/io/File:createTempFile	(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   28: astore_2
    //   29: new 63	java/io/FileOutputStream
    //   32: dup
    //   33: aload_2
    //   34: invokespecial 66	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   37: astore_3
    //   38: aload_0
    //   39: aload_2
    //   40: ldc 67
    //   42: invokestatic 73	android/os/ParcelFileDescriptor:open	(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;
    //   45: putfield 33	com/google/android/gms/feedback/FileTeleporter:b	Landroid/os/ParcelFileDescriptor;
    //   48: aload_2
    //   49: invokevirtual 77	java/io/File:delete	()Z
    //   52: pop
    //   53: aload_3
    //   54: areturn
    //   55: astore_1
    //   56: new 46	java/lang/IllegalStateException
    //   59: dup
    //   60: ldc 79
    //   62: aload_1
    //   63: invokespecial 82	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   66: athrow
    //   67: astore 4
    //   69: new 46	java/lang/IllegalStateException
    //   72: dup
    //   73: ldc 84
    //   75: invokespecial 51	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	FileTeleporter
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
    //   1: getfield 33	com/google/android/gms/feedback/FileTeleporter:b	Landroid/os/ParcelFileDescriptor;
    //   4: ifnonnull +48 -> 52
    //   7: new 90	java/io/DataOutputStream
    //   10: dup
    //   11: aload_0
    //   12: invokespecial 92	com/google/android/gms/feedback/FileTeleporter:a	()Ljava/io/FileOutputStream;
    //   15: invokespecial 95	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   18: astore_3
    //   19: aload_3
    //   20: aconst_null
    //   21: arraylength
    //   22: invokevirtual 99	java/io/DataOutputStream:writeInt	(I)V
    //   25: aload_3
    //   26: aload_0
    //   27: getfield 35	com/google/android/gms/feedback/FileTeleporter:c	Ljava/lang/String;
    //   30: invokevirtual 102	java/io/DataOutputStream:writeUTF	(Ljava/lang/String;)V
    //   33: aload_3
    //   34: aload_0
    //   35: getfield 37	com/google/android/gms/feedback/FileTeleporter:d	Ljava/lang/String;
    //   38: invokevirtual 102	java/io/DataOutputStream:writeUTF	(Ljava/lang/String;)V
    //   41: aload_3
    //   42: aconst_null
    //   43: invokevirtual 106	java/io/DataOutputStream:write	([B)V
    //   46: aload_3
    //   47: invokeinterface 111 1 0
    //   52: aload_1
    //   53: sipush 20293
    //   56: invokestatic 117	efj:m	(Landroid/os/Parcel;I)I
    //   59: istore 8
    //   61: aload_0
    //   62: getfield 31	com/google/android/gms/feedback/FileTeleporter:a	I
    //   65: istore 9
    //   67: aload_1
    //   68: iconst_1
    //   69: iconst_4
    //   70: invokestatic 120	efj:b	(Landroid/os/Parcel;II)V
    //   73: aload_1
    //   74: iload 9
    //   76: invokevirtual 123	android/os/Parcel:writeInt	(I)V
    //   79: aload_1
    //   80: iconst_2
    //   81: aload_0
    //   82: getfield 33	com/google/android/gms/feedback/FileTeleporter:b	Landroid/os/ParcelFileDescriptor;
    //   85: iload_2
    //   86: iconst_0
    //   87: invokestatic 126	efj:a	(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V
    //   90: aload_1
    //   91: iconst_3
    //   92: aload_0
    //   93: getfield 35	com/google/android/gms/feedback/FileTeleporter:c	Ljava/lang/String;
    //   96: iconst_0
    //   97: invokestatic 129	efj:a	(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //   100: aload_1
    //   101: iconst_4
    //   102: aload_0
    //   103: getfield 37	com/google/android/gms/feedback/FileTeleporter:d	Ljava/lang/String;
    //   106: iconst_0
    //   107: invokestatic 129	efj:a	(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //   110: aload_1
    //   111: iload 8
    //   113: invokestatic 132	efj:n	(Landroid/os/Parcel;I)V
    //   116: return
    //   117: astore 6
    //   119: new 46	java/lang/IllegalStateException
    //   122: dup
    //   123: ldc 134
    //   125: aload 6
    //   127: invokespecial 82	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   130: athrow
    //   131: astore 4
    //   133: aload_3
    //   134: invokeinterface 111 1 0
    //   139: aload 4
    //   141: athrow
    //   142: astore 7
    //   144: goto -92 -> 52
    //   147: astore 5
    //   149: goto -10 -> 139
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	152	0	this	FileTeleporter
    //   0	152	1	paramParcel	android.os.Parcel
    //   0	152	2	paramInt	int
    //   18	116	3	localDataOutputStream	java.io.DataOutputStream
    //   131	9	4	localObject	Object
    //   147	1	5	localIOException1	java.io.IOException
    //   117	9	6	localIOException2	java.io.IOException
    //   142	1	7	localIOException3	java.io.IOException
    //   59	53	8	i	int
    //   65	10	9	j	int
    // Exception table:
    //   from	to	target	type
    //   19	46	117	java/io/IOException
    //   19	46	131	finally
    //   119	131	131	finally
    //   46	52	142	java/io/IOException
    //   133	139	147	java/io/IOException
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.feedback.FileTeleporter
 * JD-Core Version:    0.7.0.1
 */