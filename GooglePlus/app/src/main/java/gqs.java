import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;

public final class gqs
  implements Parcelable, gqm
{
  public static final Parcelable.Creator<gqs> CREATOR = new gqt();
  static final ArrayList<Integer> a;
  public final String b;
  public final int c;
  public Bundle d;
  private final int e;
  private final ArrayList<gqp> f;
  
  static
  {
    Integer[] arrayOfInteger = new Integer[2];
    arrayOfInteger[0] = Integer.valueOf(1);
    arrayOfInteger[1] = Integer.valueOf(2);
    a = new ArrayList(Arrays.asList(arrayOfInteger));
  }
  
  gqs(Parcel paramParcel)
  {
    this.e = paramParcel.readInt();
    this.d = paramParcel.readBundle();
    this.f = gqp.a(paramParcel);
    this.b = paramParcel.readString();
    this.c = paramParcel.readInt();
  }
  
  gqs(gqu paramgqu)
  {
    this.b = paramgqu.b;
    this.c = paramgqu.c;
    this.f = null;
    this.e = paramgqu.d;
    this.d = null;
  }
  
  public static gqu b()
  {
    return new gqu();
  }
  
  public final int a()
  {
    return this.e;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.e);
    paramParcel.writeBundle(this.d);
    gqp.a(paramParcel, this.f);
    paramParcel.writeString(this.b);
    paramParcel.writeInt(this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gqs
 * JD-Core Version:    0.7.0.1
 */