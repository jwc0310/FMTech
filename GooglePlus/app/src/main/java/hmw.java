import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;

public final class hmw
  extends mab
  implements Parcelable
{
  public static final Parcelable.Creator<hmw> CREATOR = new hmx();
  public String a;
  public String b;
  public String c;
  public String d;
  public String e;
  public String f;
  public int g;
  public int h;
  private String i;
  private String j;
  
  private hmw() {}
  
  hmw(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    this.e = paramParcel.readString();
    this.f = paramParcel.readString();
    this.i = paramParcel.readString();
    this.g = paramParcel.readInt();
    this.h = paramParcel.readInt();
    this.j = paramParcel.readString();
  }
  
  public hmw(qda paramqda, Context paramContext)
  {
    String str1;
    String str3;
    if (paramqda.e != null)
    {
      str1 = paramqda.e;
      this.a = str1;
      this.i = paramqda.b;
      this.b = paramqda.c;
      if ((paramqda.d != null) && (paramqda.d.length > 0))
      {
        qdo localqdo = (qdo)paramqda.d[0].b(qdo.a);
        if (localqdo != null)
        {
          this.c = localqdo.d;
          this.d = localqdo.c;
          if (localqdo.e != null)
          {
            qdl localqdl2 = (qdl)localqdo.e.b(qdl.a);
            if (localqdl2 == null) {
              break label295;
            }
            str3 = localqdl2.b;
            label128:
            this.e = str3;
          }
        }
      }
      if (paramqda.f != null)
      {
        qdl localqdl1 = (qdl)paramqda.f.b(qdl.a);
        String str2 = null;
        if (localqdl1 != null) {
          str2 = localqdl1.b;
        }
        this.f = str2;
      }
      if ((paramqda.j == null) || (paramqda.j.a == null)) {
        break label350;
      }
      if ((paramqda.j.a.a != null) && (paramqda.j.a.b != null) && (paramqda.j.a.c != null)) {
        break label301;
      }
      this.g = paramContext.getResources().getColor(efj.Iz);
    }
    for (;;)
    {
      this.h = paramqda.i;
      if ((paramqda.g != null) && (paramqda.g.a != null)) {
        this.j = paramqda.g.a.a;
      }
      return;
      str1 = paramqda.h;
      break;
      label295:
      str3 = null;
      break label128;
      label301:
      this.g = Color.rgb(paramqda.j.a.a.intValue(), paramqda.j.a.b.intValue(), paramqda.j.a.c.intValue());
      continue;
      label350:
      this.g = paramContext.getResources().getColor(efj.Iz);
    }
  }
  
  public static hmw a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    hmw localhmw = new hmw();
    localhmw.a = d(localByteBuffer);
    localhmw.b = d(localByteBuffer);
    localhmw.c = d(localByteBuffer);
    localhmw.d = d(localByteBuffer);
    localhmw.e = d(localByteBuffer);
    localhmw.f = d(localByteBuffer);
    localhmw.i = d(localByteBuffer);
    localhmw.g = localByteBuffer.getInt();
    localhmw.h = localByteBuffer.getInt();
    localhmw.j = d(localByteBuffer);
    return localhmw;
  }
  
  public static byte[] a(hmw paramhmw)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(128);
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    a(localDataOutputStream, paramhmw.a);
    a(localDataOutputStream, paramhmw.b);
    a(localDataOutputStream, paramhmw.c);
    a(localDataOutputStream, paramhmw.d);
    a(localDataOutputStream, paramhmw.e);
    a(localDataOutputStream, paramhmw.f);
    a(localDataOutputStream, paramhmw.i);
    localDataOutputStream.writeInt(paramhmw.g);
    localDataOutputStream.writeInt(paramhmw.h);
    a(localDataOutputStream, paramhmw.j);
    byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
    localDataOutputStream.close();
    return arrayOfByte;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    hmw localhmw;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      localhmw = (hmw)paramObject;
    } while ((efj.c(this.a, localhmw.a)) && (efj.c(this.b, localhmw.b)) && (efj.c(this.i, localhmw.i)) && (efj.c(this.f, localhmw.f)) && (efj.c(this.c, localhmw.c)) && (efj.c(this.d, localhmw.d)) && (efj.c(this.e, localhmw.e)) && (this.g == localhmw.g) && (this.h == localhmw.h) && (efj.c(this.j, localhmw.j)));
    return false;
  }
  
  public final int hashCode()
  {
    int k;
    int n;
    label35:
    int i2;
    label59:
    int i4;
    label85:
    int i6;
    label111:
    int i8;
    label137:
    int i9;
    if (this.a != null)
    {
      k = this.a.hashCode();
      int m = k * 31;
      if (this.b == null) {
        break label223;
      }
      n = this.b.hashCode();
      int i1 = 31 * (n + m);
      if (this.f == null) {
        break label228;
      }
      i2 = this.f.hashCode();
      int i3 = 31 * (i2 + i1);
      if (this.i == null) {
        break label234;
      }
      i4 = this.i.hashCode();
      int i5 = 31 * (i4 + i3);
      if (this.c == null) {
        break label240;
      }
      i6 = this.c.hashCode();
      int i7 = 31 * (i6 + i5);
      if (this.d == null) {
        break label246;
      }
      i8 = this.d.hashCode();
      i9 = 31 * (i8 + i7);
      if (this.e == null) {
        break label252;
      }
    }
    label223:
    label228:
    label234:
    label240:
    label246:
    label252:
    for (int i10 = this.e.hashCode();; i10 = 0)
    {
      int i11 = 31 * (31 * (31 * (i10 + i9) + this.g) + this.h);
      String str = this.j;
      int i12 = 0;
      if (str != null) {
        i12 = this.j.hashCode();
      }
      return i11 + i12;
      k = 0;
      break;
      n = 0;
      break label35;
      i2 = 0;
      break label59;
      i4 = 0;
      break label85;
      i6 = 0;
      break label111;
      i8 = 0;
      break label137;
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.e);
    paramParcel.writeString(this.f);
    paramParcel.writeString(this.i);
    paramParcel.writeInt(this.g);
    paramParcel.writeInt(this.h);
    paramParcel.writeString(this.j);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hmw
 * JD-Core Version:    0.7.0.1
 */