package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import efj;
import ejg;
import fdi;
import fdj;
import fdl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public final class PlaceImpl
  implements SafeParcelable, fdi
{
  public static final fdj CREATOR = new fdj();
  final int a;
  final String b;
  final Bundle c;
  @Deprecated
  final PlaceLocalization d;
  final LatLng e;
  final float f;
  final LatLngBounds g;
  final String h;
  final Uri i;
  final boolean j;
  final float k;
  final int l;
  final long m;
  final List<Integer> n;
  final List<Integer> o;
  final String p;
  final String q;
  final String r;
  final String s;
  final List<String> t;
  final boolean u;
  public fdl v;
  private Locale w;
  
  public PlaceImpl(int paramInt1, String paramString1, List<Integer> paramList1, List<Integer> paramList2, Bundle paramBundle, String paramString2, String paramString3, String paramString4, String paramString5, List<String> paramList, LatLng paramLatLng, float paramFloat1, LatLngBounds paramLatLngBounds, String paramString6, Uri paramUri, boolean paramBoolean1, float paramFloat2, int paramInt2, long paramLong, boolean paramBoolean2, PlaceLocalization paramPlaceLocalization)
  {
    this.a = paramInt1;
    this.b = paramString1;
    this.o = Collections.unmodifiableList(paramList1);
    this.n = paramList2;
    if (paramBundle != null)
    {
      this.c = paramBundle;
      this.p = paramString2;
      this.q = paramString3;
      this.r = paramString4;
      this.s = paramString5;
      if (paramList == null) {
        break label174;
      }
      label68:
      this.t = paramList;
      this.e = paramLatLng;
      this.f = paramFloat1;
      this.g = paramLatLngBounds;
      if (paramString6 == null) {
        break label182;
      }
    }
    for (;;)
    {
      this.h = paramString6;
      this.i = paramUri;
      this.j = paramBoolean1;
      this.k = paramFloat2;
      this.l = paramInt2;
      this.m = paramLong;
      Collections.unmodifiableMap(new HashMap());
      this.w = null;
      this.u = paramBoolean2;
      this.d = paramPlaceLocalization;
      return;
      paramBundle = new Bundle();
      break;
      label174:
      paramList = Collections.emptyList();
      break label68;
      label182:
      paramString6 = "UTC";
    }
  }
  
  public final String a()
  {
    a("getId");
    return this.b;
  }
  
  final void a(String paramString)
  {
    if ((this.u) && (this.v != null))
    {
      fdl localfdl = this.v;
      String str = this.b;
      synchronized (localfdl.d)
      {
        if (localfdl.e == null)
        {
          localfdl.e = new ArrayList();
          localfdl.f = new ArrayList();
          localfdl.b.postDelayed(localfdl.c, fdl.a);
        }
        localfdl.e.add(str);
        localfdl.f.add(paramString);
        if (localfdl.e.size() >= 10000)
        {
          localfdl.c.run();
          localfdl.b.removeCallbacks(localfdl.c);
          return;
        }
        return;
      }
    }
  }
  
  public final List<Integer> b()
  {
    a("getPlaceTypes");
    return this.o;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final LatLng e()
  {
    a("getLatLng");
    return this.e;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    PlaceImpl localPlaceImpl;
    do
    {
      return true;
      if (!(paramObject instanceof PlaceImpl)) {
        return false;
      }
      localPlaceImpl = (PlaceImpl)paramObject;
    } while ((this.b.equals(localPlaceImpl.b)) && (efj.a(null, null)) && (this.m == localPlaceImpl.m));
    return false;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this.b;
    arrayOfObject[1] = null;
    arrayOfObject[2] = Long.valueOf(this.m);
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final String toString()
  {
    return new ejg(this).a("id", this.b).a("placeTypes", this.o).a("locale", null).a("name", this.p).a("address", this.q).a("phoneNumber", this.r).a("latlng", this.e).a("viewport", this.g).a("websiteUri", this.i).a("isPermanentlyClosed", Boolean.valueOf(this.j)).a("priceLevel", Integer.valueOf(this.l)).a("timestampSecs", Long.valueOf(this.m)).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i1 = efj.m(paramParcel, 20293);
    a("getId");
    efj.a(paramParcel, 1, this.b, false);
    efj.a(paramParcel, 2, this.c, false);
    a("getLocalization");
    efj.a(paramParcel, 3, this.d, paramInt, false);
    a("getLatLng");
    efj.a(paramParcel, 4, this.e, paramInt, false);
    a("getLevelNumber");
    float f1 = this.f;
    efj.b(paramParcel, 5, 4);
    paramParcel.writeFloat(f1);
    a("getViewport");
    efj.a(paramParcel, 6, this.g, paramInt, false);
    efj.a(paramParcel, 7, this.h, false);
    a("getWebsiteUri");
    efj.a(paramParcel, 8, this.i, paramInt, false);
    a("isPermanentlyClosed");
    efj.a(paramParcel, 9, this.j);
    a("getRating");
    float f2 = this.k;
    efj.b(paramParcel, 10, 4);
    paramParcel.writeFloat(f2);
    a("getPriceLevel");
    int i2 = this.l;
    efj.b(paramParcel, 11, 4);
    paramParcel.writeInt(i2);
    long l1 = this.m;
    efj.b(paramParcel, 12, 8);
    paramParcel.writeLong(l1);
    a("getTypesDeprecated");
    efj.a(paramParcel, 13, this.n, false);
    a("getAddress");
    efj.a(paramParcel, 14, (String)this.q, false);
    a("getPhoneNumber");
    efj.a(paramParcel, 15, this.r, false);
    a("getAttributions");
    efj.b(paramParcel, 17, this.t, false);
    a("getRegularOpenHours");
    efj.a(paramParcel, 16, this.s, false);
    int i3 = this.a;
    efj.b(paramParcel, 1000, 4);
    paramParcel.writeInt(i3);
    a("getName");
    efj.a(paramParcel, 19, (String)this.p, false);
    efj.a(paramParcel, 18, this.u);
    a("getPlaceTypes");
    efj.a(paramParcel, 20, this.o, false);
    efj.n(paramParcel, i1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.places.internal.PlaceImpl
 * JD-Core Version:    0.7.0.1
 */