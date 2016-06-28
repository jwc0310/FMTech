package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import efj;
import fck;

public class ClientIdentity
  implements SafeParcelable
{
  public static final fck CREATOR = new fck();
  final int a;
  public final int b;
  public final String c;
  
  public ClientIdentity(int paramInt1, int paramInt2, String paramString)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    ClientIdentity localClientIdentity;
    do
    {
      return true;
      if ((paramObject == null) || (!(paramObject instanceof ClientIdentity))) {
        return false;
      }
      localClientIdentity = (ClientIdentity)paramObject;
    } while ((localClientIdentity.b == this.b) && (efj.a(localClientIdentity.c, this.c)));
    return false;
  }
  
  public int hashCode()
  {
    return this.b;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.b);
    arrayOfObject[1] = this.c;
    return String.format("%d:%s", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = efj.m(paramParcel, 20293);
    int j = this.b;
    efj.b(paramParcel, 1, 4);
    paramParcel.writeInt(j);
    int k = this.a;
    efj.b(paramParcel, 1000, 4);
    paramParcel.writeInt(k);
    efj.a(paramParcel, 2, this.c, false);
    efj.n(paramParcel, i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.internal.ClientIdentity
 * JD-Core Version:    0.7.0.1
 */