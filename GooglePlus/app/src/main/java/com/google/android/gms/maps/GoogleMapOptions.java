package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import efj;
import feu;
import fks;

public final class GoogleMapOptions
  implements SafeParcelable
{
  public static final fks CREATOR = new fks();
  final int a;
  Boolean b;
  Boolean c;
  int d = -1;
  CameraPosition e;
  Boolean f;
  Boolean g;
  Boolean h;
  Boolean i;
  public Boolean j;
  Boolean k;
  Boolean l;
  Boolean m;
  
  public GoogleMapOptions()
  {
    this.a = 1;
  }
  
  public GoogleMapOptions(int paramInt1, byte paramByte1, byte paramByte2, int paramInt2, CameraPosition paramCameraPosition, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte paramByte7, byte paramByte8, byte paramByte9, byte paramByte10)
  {
    this.a = paramInt1;
    this.b = efj.a(paramByte1);
    this.c = efj.a(paramByte2);
    this.d = paramInt2;
    this.e = paramCameraPosition;
    this.f = efj.a(paramByte3);
    this.g = efj.a(paramByte4);
    this.h = efj.a(paramByte5);
    this.i = efj.a(paramByte6);
    this.j = efj.a(paramByte7);
    this.k = efj.a(paramByte8);
    this.l = efj.a(paramByte9);
    this.m = efj.a(paramByte10);
  }
  
  public static GoogleMapOptions a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet == null) {
      return null;
    }
    TypedArray localTypedArray = paramContext.getResources().obtainAttributes(paramAttributeSet, feu.a);
    GoogleMapOptions localGoogleMapOptions = new GoogleMapOptions();
    if (localTypedArray.hasValue(feu.h)) {
      localGoogleMapOptions.d = localTypedArray.getInt(feu.h, -1);
    }
    if (localTypedArray.hasValue(feu.q)) {
      localGoogleMapOptions.b = Boolean.valueOf(localTypedArray.getBoolean(feu.q, false));
    }
    if (localTypedArray.hasValue(feu.p)) {
      localGoogleMapOptions.c = Boolean.valueOf(localTypedArray.getBoolean(feu.p, false));
    }
    if (localTypedArray.hasValue(feu.i)) {
      localGoogleMapOptions.g = Boolean.valueOf(localTypedArray.getBoolean(feu.i, true));
    }
    if (localTypedArray.hasValue(feu.k)) {
      localGoogleMapOptions.k = Boolean.valueOf(localTypedArray.getBoolean(feu.k, true));
    }
    if (localTypedArray.hasValue(feu.l)) {
      localGoogleMapOptions.h = Boolean.valueOf(localTypedArray.getBoolean(feu.l, true));
    }
    if (localTypedArray.hasValue(feu.m)) {
      localGoogleMapOptions.j = Boolean.valueOf(localTypedArray.getBoolean(feu.m, true));
    }
    if (localTypedArray.hasValue(feu.o)) {
      localGoogleMapOptions.i = Boolean.valueOf(localTypedArray.getBoolean(feu.o, true));
    }
    if (localTypedArray.hasValue(feu.n)) {
      localGoogleMapOptions.f = Boolean.valueOf(localTypedArray.getBoolean(feu.n, true));
    }
    if (localTypedArray.hasValue(feu.g)) {
      localGoogleMapOptions.l = Boolean.valueOf(localTypedArray.getBoolean(feu.g, false));
    }
    if (localTypedArray.hasValue(feu.j)) {
      localGoogleMapOptions.m = Boolean.valueOf(localTypedArray.getBoolean(feu.j, true));
    }
    localGoogleMapOptions.e = CameraPosition.a(paramContext, paramAttributeSet);
    localTypedArray.recycle();
    return localGoogleMapOptions;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int n = efj.m(paramParcel, 20293);
    int i1 = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(i1);
    int i2 = efj.a(this.b);
    efj.b(paramParcel, 2, 4);
    paramParcel.writeInt(i2);
    int i3 = efj.a(this.c);
    efj.b(paramParcel, 3, 4);
    paramParcel.writeInt(i3);
    int i4 = this.d;
    efj.b(paramParcel, 4, 4);
    paramParcel.writeInt(i4);
    efj.a(paramParcel, 5, this.e, paramInt, false);
    int i5 = efj.a(this.f);
    efj.b(paramParcel, 6, 4);
    paramParcel.writeInt(i5);
    int i6 = efj.a(this.g);
    efj.b(paramParcel, 7, 4);
    paramParcel.writeInt(i6);
    int i7 = efj.a(this.h);
    efj.b(paramParcel, 8, 4);
    paramParcel.writeInt(i7);
    int i8 = efj.a(this.i);
    efj.b(paramParcel, 9, 4);
    paramParcel.writeInt(i8);
    int i9 = efj.a(this.j);
    efj.b(paramParcel, 10, 4);
    paramParcel.writeInt(i9);
    int i10 = efj.a(this.k);
    efj.b(paramParcel, 11, 4);
    paramParcel.writeInt(i10);
    int i11 = efj.a(this.l);
    efj.b(paramParcel, 12, 4);
    paramParcel.writeInt(i11);
    int i12 = efj.a(this.m);
    efj.b(paramParcel, 14, 4);
    paramParcel.writeInt(i12);
    efj.n(paramParcel, n);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.GoogleMapOptions
 * JD-Core Version:    0.7.0.1
 */