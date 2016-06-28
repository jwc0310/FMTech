import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;

public final class lmb
  extends mab
  implements Parcelable
{
  public static final Parcelable.Creator<lmb> CREATOR = new lmc();
  public String a;
  public String b;
  public String c;
  public boolean d;
  public boolean e;
  private String f;
  
  private lmb() {}
  
  lmb(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.f = paramParcel.readString();
    this.c = paramParcel.readString();
    boolean bool2;
    if (paramParcel.readInt() != 0)
    {
      bool2 = bool1;
      this.d = bool2;
      if (paramParcel.readInt() == 0) {
        break label70;
      }
    }
    for (;;)
    {
      this.e = bool1;
      return;
      bool2 = false;
      break;
      label70:
      bool1 = false;
    }
  }
  
  public lmb(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.f = paramString3;
    this.c = paramString4;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
  }
  
  public lmb(qed paramqed)
  {
    this.a = a(paramqed.f, paramqed.b);
    this.b = paramqed.d;
    this.f = paramqed.e;
    this.c = efj.E(paramqed.c);
    this.d = bool;
    if ((paramqed.g != null) && (paramqed.g.a != null)) {}
    for (;;)
    {
      this.e = bool;
      return;
      bool = false;
    }
  }
  
  public lmb(qee paramqee)
  {
    this.a = a(paramqee.f, paramqee.b);
    this.b = paramqee.d;
    this.f = paramqee.e;
    this.c = efj.E(paramqee.c);
    if ((paramqee.g != null) && (paramqee.g.a != null)) {}
    for (boolean bool = true;; bool = false)
    {
      this.e = bool;
      return;
    }
  }
  
  private static String a(String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString1)) {
      return paramString1;
    }
    if ((paramString2 != null) && (paramString2.startsWith("communities/"))) {
      return paramString2.substring(12);
    }
    return null;
  }
  
  public static lmb a(byte[] paramArrayOfByte)
  {
    int i = 1;
    if (paramArrayOfByte == null) {
      return null;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    lmb locallmb = new lmb();
    locallmb.a = d(localByteBuffer);
    locallmb.b = d(localByteBuffer);
    locallmb.f = d(localByteBuffer);
    locallmb.c = d(localByteBuffer);
    int j;
    if (localByteBuffer.get() == i)
    {
      j = i;
      locallmb.d = j;
      if (localByteBuffer.get() != i) {
        break label91;
      }
    }
    for (;;)
    {
      locallmb.e = i;
      return locallmb;
      j = 0;
      break;
      label91:
      i = 0;
    }
  }
  
  public static byte[] a(lmb paramlmb)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(128);
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    a(localDataOutputStream, paramlmb.a);
    a(localDataOutputStream, paramlmb.b);
    a(localDataOutputStream, paramlmb.f);
    a(localDataOutputStream, paramlmb.c);
    localDataOutputStream.writeBoolean(paramlmb.d);
    localDataOutputStream.writeBoolean(paramlmb.e);
    byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
    localDataOutputStream.close();
    return arrayOfByte;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.f);
    paramParcel.writeString(this.c);
    int j;
    if (this.d)
    {
      j = i;
      paramParcel.writeInt(j);
      if (!this.e) {
        break label69;
      }
    }
    for (;;)
    {
      paramParcel.writeInt(i);
      return;
      j = 0;
      break;
      label69:
      i = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lmb
 * JD-Core Version:    0.7.0.1
 */