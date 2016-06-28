package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import ejg;
import fdk;
import java.util.Arrays;
import java.util.List;

@Deprecated
public final class PlaceLocalization
  implements SafeParcelable
{
  public static final fdk CREATOR = new fdk();
  public final int a;
  public final String b;
  public final String c;
  public final String d;
  public final String e;
  public final List<String> f;
  
  public PlaceLocalization(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, List<String> paramList)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramString4;
    this.f = paramList;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    PlaceLocalization localPlaceLocalization;
    do
    {
      return true;
      if (!(paramObject instanceof PlaceLocalization)) {
        return false;
      }
      localPlaceLocalization = (PlaceLocalization)paramObject;
    } while ((efj.a(this.b, localPlaceLocalization.b)) && (efj.a(this.c, localPlaceLocalization.c)) && (efj.a(this.d, localPlaceLocalization.d)) && (efj.a(this.e, localPlaceLocalization.e)) && (efj.a(this.f, localPlaceLocalization.f)));
    return false;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this.b;
    arrayOfObject[1] = this.c;
    arrayOfObject[2] = this.d;
    arrayOfObject[3] = this.e;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final String toString()
  {
    return new ejg(this).a("name", this.b).a("address", this.c).a("internationalPhoneNumber", this.d).a("regularOpenHours", this.e).a("attributions", this.f).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    efj.a(paramParcel, 1, this.b, false);
    int j = this.a;
    efj.b(paramParcel, 1000, 4);
    paramParcel.writeInt(j);
    efj.a(paramParcel, 2, this.c, false);
    efj.a(paramParcel, 3, this.d, false);
    efj.a(paramParcel, 4, this.e, false);
    efj.b(paramParcel, 5, this.f, false);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.places.internal.PlaceLocalization
 * JD-Core Version:    0.7.0.1
 */