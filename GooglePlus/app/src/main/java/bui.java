import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class bui
  implements Parcelable
{
  public static final Parcelable.Creator<bui> CREATOR = new buj();
  public final String a;
  public final int b;
  public final bug[] c;
  public gnb d;
  public final int[] e;
  public final String f;
  
  bui(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readInt();
    this.c = ((bug[])paramParcel.createTypedArray(bug.CREATOR));
    this.d = ((gnb)paramParcel.readParcelable(gnb.class.getClassLoader()));
    this.e = paramParcel.createIntArray();
    this.f = paramParcel.readString();
  }
  
  bui(String paramString1, int paramInt, bug[] paramArrayOfbug, gnb paramgnb, int[] paramArrayOfInt, String paramString2)
  {
    this.a = paramString1;
    this.b = paramInt;
    this.c = paramArrayOfbug;
    this.d = paramgnb;
    this.e = paramArrayOfInt;
    this.f = paramString2;
  }
  
  public static gnb a(Context paramContext, int paramInt, ome paramome)
  {
    if (paramome == null) {
      return null;
    }
    return efj.a(paramContext, paramInt, paramome, true);
  }
  
  public static int[] a(ome paramome)
  {
    if (paramome != null)
    {
      oku[] arrayOfoku = paramome.b;
      if (arrayOfoku != null)
      {
        int i = arrayOfoku.length;
        for (int j = 0; j < i; j++)
        {
          oku localoku = arrayOfoku[j];
          if (localoku.a == 7) {
            return localoku.b;
          }
        }
      }
    }
    return null;
  }
  
  public final int a()
  {
    if (this.c == null) {
      return 0;
    }
    return this.c.length;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return Arrays.asList(this.c).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeInt(this.b);
    paramParcel.writeTypedArray(this.c, 0);
    paramParcel.writeParcelable(this.d, paramInt);
    paramParcel.writeIntArray(this.e);
    paramParcel.writeString(this.f);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bui
 * JD-Core Version:    0.7.0.1
 */