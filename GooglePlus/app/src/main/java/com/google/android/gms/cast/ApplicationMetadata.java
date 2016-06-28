package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import edd;
import edr;
import efj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ApplicationMetadata
  implements SafeParcelable
{
  public static final Parcelable.Creator<ApplicationMetadata> CREATOR = new edr();
  final int a;
  public String b;
  String c;
  List<WebImage> d;
  List<String> e;
  String f;
  Uri g;
  
  private ApplicationMetadata()
  {
    this.a = 1;
    this.d = new ArrayList();
    this.e = new ArrayList();
  }
  
  public ApplicationMetadata(int paramInt, String paramString1, String paramString2, List<WebImage> paramList, List<String> paramList1, String paramString3, Uri paramUri)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramList;
    this.e = paramList1;
    this.f = paramString3;
    this.g = paramUri;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    ApplicationMetadata localApplicationMetadata;
    do
    {
      return true;
      if (!(paramObject instanceof ApplicationMetadata)) {
        return false;
      }
      localApplicationMetadata = (ApplicationMetadata)paramObject;
    } while ((edd.a(this.b, localApplicationMetadata.b)) && (edd.a(this.d, localApplicationMetadata.d)) && (edd.a(this.c, localApplicationMetadata.c)) && (edd.a(this.e, localApplicationMetadata.e)) && (edd.a(this.f, localApplicationMetadata.f)) && (edd.a(this.g, localApplicationMetadata.g)));
    return false;
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = this.b;
    arrayOfObject[2] = this.c;
    arrayOfObject[3] = this.d;
    arrayOfObject[4] = this.e;
    arrayOfObject[5] = this.f;
    arrayOfObject[6] = this.g;
    return Arrays.hashCode(arrayOfObject);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder("applicationId: ").append(this.b).append(", name: ").append(this.c).append(", images.count: ");
    int i;
    StringBuilder localStringBuilder2;
    int j;
    if (this.d == null)
    {
      i = 0;
      localStringBuilder2 = localStringBuilder1.append(i).append(", namespaces.count: ");
      List localList = this.e;
      j = 0;
      if (localList != null) {
        break label115;
      }
    }
    for (;;)
    {
      return j + ", senderAppIdentifier: " + this.f + ", senderAppLaunchUrl: " + this.g;
      i = this.d.size();
      break;
      label115:
      j = this.e.size();
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.a;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    efj.a(paramParcel, 2, this.b, false);
    efj.a(paramParcel, 3, this.c, false);
    efj.c(paramParcel, 4, this.d, false);
    efj.b(paramParcel, 5, this.e, false);
    efj.a(paramParcel, 6, this.f, false);
    efj.a(paramParcel, 7, this.g, paramInt, false);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.ApplicationMetadata
 * JD-Core Version:    0.7.0.1
 */