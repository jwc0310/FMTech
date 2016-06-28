import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class cmw
  implements Parcelable
{
  public static final Parcelable.Creator<cmw> CREATOR = new cmx();
  public nwn a;
  public nwo b;
  public nwp c;
  public boolean d = false;
  public boolean e = true;
  
  /* Error */
  public cmw(Parcel paramParcel)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: invokespecial 31	java/lang/Object:<init>	()V
    //   6: aload_0
    //   7: iconst_0
    //   8: putfield 33	cmw:d	Z
    //   11: aload_0
    //   12: iload_2
    //   13: putfield 35	cmw:e	Z
    //   16: aload_1
    //   17: invokevirtual 41	android/os/Parcel:readInt	()I
    //   20: istore_3
    //   21: iload_3
    //   22: ifeq +175 -> 197
    //   25: iload_3
    //   26: newarray byte
    //   28: astore 13
    //   30: aload_1
    //   31: aload 13
    //   33: invokevirtual 45	android/os/Parcel:readByteArray	([B)V
    //   36: aload_0
    //   37: new 47	nwn
    //   40: dup
    //   41: invokespecial 48	nwn:<init>	()V
    //   44: aload 13
    //   46: iconst_0
    //   47: aload 13
    //   49: arraylength
    //   50: invokestatic 53	qat:b	(Lqat;[BII)Lqat;
    //   53: checkcast 47	nwn
    //   56: putfield 55	cmw:a	Lnwn;
    //   59: aload_1
    //   60: invokevirtual 41	android/os/Parcel:readInt	()I
    //   63: istore 4
    //   65: iload 4
    //   67: ifeq +153 -> 220
    //   70: iload 4
    //   72: newarray byte
    //   74: astore 10
    //   76: aload_1
    //   77: aload 10
    //   79: invokevirtual 45	android/os/Parcel:readByteArray	([B)V
    //   82: aload_0
    //   83: new 57	nwo
    //   86: dup
    //   87: invokespecial 58	nwo:<init>	()V
    //   90: aload 10
    //   92: iconst_0
    //   93: aload 10
    //   95: arraylength
    //   96: invokestatic 53	qat:b	(Lqat;[BII)Lqat;
    //   99: checkcast 57	nwo
    //   102: putfield 60	cmw:b	Lnwo;
    //   105: aload_1
    //   106: invokevirtual 41	android/os/Parcel:readInt	()I
    //   109: istore 5
    //   111: iload 5
    //   113: ifeq +130 -> 243
    //   116: iload 5
    //   118: newarray byte
    //   120: astore 7
    //   122: aload_1
    //   123: aload 7
    //   125: invokevirtual 45	android/os/Parcel:readByteArray	([B)V
    //   128: aload_0
    //   129: new 62	nwp
    //   132: dup
    //   133: invokespecial 63	nwp:<init>	()V
    //   136: aload 7
    //   138: iconst_0
    //   139: aload 7
    //   141: arraylength
    //   142: invokestatic 53	qat:b	(Lqat;[BII)Lqat;
    //   145: checkcast 62	nwp
    //   148: putfield 65	cmw:c	Lnwp;
    //   151: aload_1
    //   152: invokevirtual 69	android/os/Parcel:readByte	()B
    //   155: iload_2
    //   156: if_icmpne +95 -> 251
    //   159: iload_2
    //   160: istore 6
    //   162: aload_0
    //   163: iload 6
    //   165: putfield 33	cmw:d	Z
    //   168: aload_1
    //   169: invokevirtual 69	android/os/Parcel:readByte	()B
    //   172: iload_2
    //   173: if_icmpne +84 -> 257
    //   176: aload_0
    //   177: iload_2
    //   178: putfield 35	cmw:e	Z
    //   181: return
    //   182: astore 14
    //   184: ldc 71
    //   186: ldc 73
    //   188: aload 14
    //   190: invokestatic 78	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   193: pop
    //   194: goto -135 -> 59
    //   197: aload_0
    //   198: aconst_null
    //   199: putfield 55	cmw:a	Lnwn;
    //   202: goto -143 -> 59
    //   205: astore 11
    //   207: ldc 71
    //   209: ldc 73
    //   211: aload 11
    //   213: invokestatic 78	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   216: pop
    //   217: goto -112 -> 105
    //   220: aload_0
    //   221: aconst_null
    //   222: putfield 60	cmw:b	Lnwo;
    //   225: goto -120 -> 105
    //   228: astore 8
    //   230: ldc 71
    //   232: ldc 73
    //   234: aload 8
    //   236: invokestatic 78	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   239: pop
    //   240: goto -89 -> 151
    //   243: aload_0
    //   244: aconst_null
    //   245: putfield 65	cmw:c	Lnwp;
    //   248: goto -97 -> 151
    //   251: iconst_0
    //   252: istore 6
    //   254: goto -92 -> 162
    //   257: iconst_0
    //   258: istore_2
    //   259: goto -83 -> 176
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	262	0	this	cmw
    //   0	262	1	paramParcel	Parcel
    //   1	258	2	i	int
    //   20	6	3	j	int
    //   63	8	4	k	int
    //   109	8	5	m	int
    //   160	93	6	n	int
    //   120	20	7	arrayOfByte1	byte[]
    //   228	7	8	localqas1	qas
    //   74	20	10	arrayOfByte2	byte[]
    //   205	7	11	localqas2	qas
    //   28	20	13	arrayOfByte3	byte[]
    //   182	7	14	localqas3	qas
    // Exception table:
    //   from	to	target	type
    //   36	59	182	qas
    //   82	105	205	qas
    //   128	151	228	qas
  }
  
  public cmw(nwn paramnwn, nwo paramnwo, nwp paramnwp, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramnwn;
    this.b = paramnwo;
    this.c = paramnwp;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    label60:
    label89:
    int j;
    if (this.a != null)
    {
      byte[] arrayOfByte3 = qat.a(this.a);
      paramParcel.writeInt(arrayOfByte3.length);
      paramParcel.writeByteArray(arrayOfByte3);
      if (this.b == null) {
        break label128;
      }
      byte[] arrayOfByte2 = qat.a(this.b);
      paramParcel.writeInt(arrayOfByte2.length);
      paramParcel.writeByteArray(arrayOfByte2);
      if (this.c == null) {
        break label136;
      }
      byte[] arrayOfByte1 = qat.a(this.c);
      paramParcel.writeInt(arrayOfByte1.length);
      paramParcel.writeByteArray(arrayOfByte1);
      if (!this.d) {
        break label144;
      }
      j = i;
      label99:
      paramParcel.writeByte((byte)j);
      if (!this.e) {
        break label150;
      }
    }
    for (;;)
    {
      paramParcel.writeByte((byte)i);
      return;
      paramParcel.writeInt(0);
      break;
      label128:
      paramParcel.writeInt(0);
      break label60;
      label136:
      paramParcel.writeInt(0);
      break label89;
      label144:
      j = 0;
      break label99;
      label150:
      i = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cmw
 * JD-Core Version:    0.7.0.1
 */