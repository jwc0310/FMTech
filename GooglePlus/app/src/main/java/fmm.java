import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;

public abstract class fmm
  extends Binder
  implements fml
{
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.people.internal.IPeopleService");
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi29 = fmj.a(paramParcel1.readStrongBinder());
      boolean bool30;
      if (paramParcel1.readInt() != 0)
      {
        bool30 = true;
        if (paramParcel1.readInt() == 0) {
          break label559;
        }
      }
      for (boolean bool31 = true;; bool31 = false)
      {
        a(localfmi29, bool30, bool31, paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
        bool30 = false;
        break;
      }
    case 305: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi28 = fmj.a(paramParcel1.readStrongBinder());
      boolean bool28;
      if (paramParcel1.readInt() != 0)
      {
        bool28 = true;
        if (paramParcel1.readInt() == 0) {
          break label634;
        }
      }
      for (boolean bool29 = true;; bool29 = false)
      {
        a(localfmi28, bool28, bool29, paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
        bool28 = false;
        break;
      }
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      a(fmj.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi27 = fmj.a(paramParcel1.readStrongBinder());
      String str57 = paramParcel1.readString();
      String str58 = paramParcel1.readString();
      String str59 = paramParcel1.readString();
      ArrayList localArrayList7 = paramParcel1.createStringArrayList();
      int i11 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool27 = true;; bool27 = false)
      {
        a(localfmi27, str57, str58, str59, localArrayList7, i11, bool27, paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
      }
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      a(fmj.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi26 = fmj.a(paramParcel1.readStrongBinder());
      long l4 = paramParcel1.readLong();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool26 = true;; bool26 = false)
      {
        a(localfmi26, l4, bool26);
        paramParcel2.writeNoException();
        return true;
      }
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi25 = fmj.a(paramParcel1.readStrongBinder());
      String str54 = paramParcel1.readString();
      String str55 = paramParcel1.readString();
      String str56 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool25 = true;; bool25 = false)
      {
        a(localfmi25, str54, str55, str56, bool25);
        paramParcel2.writeNoException();
        return true;
      }
    case 603: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi24 = fmj.a(paramParcel1.readStrongBinder());
      String str51 = paramParcel1.readString();
      String str52 = paramParcel1.readString();
      String str53 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool24 = true;; bool24 = false)
      {
        b(localfmi24, str51, str52, str53, bool24);
        paramParcel2.writeNoException();
        return true;
      }
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      Uri localUri3;
      if (paramParcel1.readInt() != 0)
      {
        localUri3 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        Bundle localBundle9 = a(localUri3);
        paramParcel2.writeNoException();
        if (localBundle9 == null) {
          break label1062;
        }
        paramParcel2.writeInt(1);
        localBundle9.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        return true;
        localUri3 = null;
        break;
        paramParcel2.writeInt(0);
      }
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi23 = fmj.a(paramParcel1.readStrongBinder());
      String str48 = paramParcel1.readString();
      String str49 = paramParcel1.readString();
      String str50 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool23 = true;; bool23 = false)
      {
        a(localfmi23, str48, str49, str50, bool23, paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      }
    case 201: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi22 = fmj.a(paramParcel1.readStrongBinder());
      String str45 = paramParcel1.readString();
      String str46 = paramParcel1.readString();
      String str47 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool22 = true;; bool22 = false)
      {
        a(localfmi22, str45, str46, str47, bool22, paramParcel1.readInt(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      }
    case 202: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi21 = fmj.a(paramParcel1.readStrongBinder());
      String str42 = paramParcel1.readString();
      String str43 = paramParcel1.readString();
      String str44 = paramParcel1.readString();
      int i10 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool21 = true;; bool21 = false)
      {
        a(localfmi21, str42, str43, str44, i10, bool21, paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      }
    case 203: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi20 = fmj.a(paramParcel1.readStrongBinder());
      String str38 = paramParcel1.readString();
      String str39 = paramParcel1.readString();
      String str40 = paramParcel1.readString();
      int i7 = paramParcel1.readInt();
      boolean bool19;
      int i8;
      int i9;
      String str41;
      if (paramParcel1.readInt() != 0)
      {
        bool19 = true;
        i8 = paramParcel1.readInt();
        i9 = paramParcel1.readInt();
        str41 = paramParcel1.readString();
        if (paramParcel1.readInt() == 0) {
          break label1422;
        }
      }
      for (boolean bool20 = true;; bool20 = false)
      {
        a(localfmi20, str38, str39, str40, i7, bool19, i8, i9, str41, bool20);
        paramParcel2.writeNoException();
        return true;
        bool19 = false;
        break;
      }
    case 402: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi19 = fmj.a(paramParcel1.readStrongBinder());
      String str34 = paramParcel1.readString();
      String str35 = paramParcel1.readString();
      String str36 = paramParcel1.readString();
      int i4 = paramParcel1.readInt();
      boolean bool17;
      int i5;
      int i6;
      String str37;
      if (paramParcel1.readInt() != 0)
      {
        bool17 = true;
        i5 = paramParcel1.readInt();
        i6 = paramParcel1.readInt();
        str37 = paramParcel1.readString();
        if (paramParcel1.readInt() == 0) {
          break label1549;
        }
      }
      for (boolean bool18 = true;; bool18 = false)
      {
        a(localfmi19, str34, str35, str36, i4, bool17, i5, i6, str37, bool18, paramParcel1.readInt(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
        bool17 = false;
        break;
      }
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi18 = fmj.a(paramParcel1.readStrongBinder());
      String str33 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool16 = true;; bool16 = false)
      {
        a(localfmi18, str33, bool16, paramParcel1.createStringArray());
        paramParcel2.writeNoException();
        return true;
      }
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi17 = fmj.a(paramParcel1.readStrongBinder());
      boolean bool15;
      if (paramParcel1.readInt() != 0)
      {
        bool15 = true;
        Bundle localBundle8 = a(localfmi17, bool15, paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        if (localBundle8 == null) {
          break label1688;
        }
        paramParcel2.writeInt(1);
        localBundle8.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        return true;
        bool15 = false;
        break;
        paramParcel2.writeInt(0);
      }
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      Bundle localBundle7 = a(paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      if (localBundle7 != null)
      {
        paramParcel2.writeInt(1);
        localBundle7.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        return true;
        paramParcel2.writeInt(0);
      }
    case 13: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi16 = fmj.a(paramParcel1.readStrongBinder());
      String str31 = paramParcel1.readString();
      String str32 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (Uri localUri2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);; localUri2 = null)
      {
        a(localfmi16, str31, str32, localUri2);
        paramParcel2.writeNoException();
        return true;
      }
    case 14: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      a(fmj.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.createStringArrayList(), paramParcel1.createStringArrayList());
      paramParcel2.writeNoException();
      return true;
    case 15: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool14 = true;; bool14 = false)
      {
        a(bool14);
        paramParcel2.writeNoException();
        return true;
      }
    case 16: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      boolean bool13 = a();
      paramParcel2.writeNoException();
      if (bool13) {}
      for (int i3 = 1;; i3 = 0)
      {
        paramParcel2.writeInt(i3);
        return true;
      }
    case 17: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      Bundle localBundle6 = b(paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      if (localBundle6 != null)
      {
        paramParcel2.writeInt(1);
        localBundle6.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        return true;
        paramParcel2.writeInt(0);
      }
    case 18: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi15 = fmj.a(paramParcel1.readStrongBinder());
      String str29 = paramParcel1.readString();
      String str30 = paramParcel1.readString();
      Uri localUri1;
      if (paramParcel1.readInt() != 0)
      {
        localUri1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label2069;
        }
      }
      for (boolean bool12 = true;; bool12 = false)
      {
        a(localfmi15, str29, str30, localUri1, bool12);
        paramParcel2.writeNoException();
        return true;
        localUri1 = null;
        break;
      }
    case 19: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi14 = fmj.a(paramParcel1.readStrongBinder());
      String str25 = paramParcel1.readString();
      String str26 = paramParcel1.readString();
      String str27 = paramParcel1.readString();
      int i2 = paramParcel1.readInt();
      String str28 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool11 = true;; bool11 = false)
      {
        a(localfmi14, str25, str26, str27, i2, str28, bool11);
        paramParcel2.writeNoException();
        return true;
      }
    case 20: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      Bundle localBundle5 = a(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readLong());
      paramParcel2.writeNoException();
      if (localBundle5 != null)
      {
        paramParcel2.writeInt(1);
        localBundle5.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        return true;
        paramParcel2.writeInt(0);
      }
    case 21: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi13 = fmj.a(paramParcel1.readStrongBinder());
      String str22 = paramParcel1.readString();
      String str23 = paramParcel1.readString();
      String str24 = paramParcel1.readString();
      ArrayList localArrayList6 = paramParcel1.createStringArrayList();
      int i1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool10 = true;; bool10 = false)
      {
        a(localfmi13, str22, str23, str24, localArrayList6, i1, bool10, paramParcel1.readLong(), paramParcel1.readString(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      }
    case 401: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi12 = fmj.a(paramParcel1.readStrongBinder());
      String str19 = paramParcel1.readString();
      String str20 = paramParcel1.readString();
      String str21 = paramParcel1.readString();
      ArrayList localArrayList5 = paramParcel1.createStringArrayList();
      int n = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool9 = true;; bool9 = false)
      {
        a(localfmi12, str19, str20, str21, localArrayList5, n, bool9, paramParcel1.readLong(), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      }
    case 404: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi11 = fmj.a(paramParcel1.readStrongBinder());
      String str16 = paramParcel1.readString();
      String str17 = paramParcel1.readString();
      String str18 = paramParcel1.readString();
      ArrayList localArrayList4 = paramParcel1.createStringArrayList();
      int m = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool8 = true;; bool8 = false)
      {
        a(localfmi11, str16, str17, str18, localArrayList4, m, bool8, paramParcel1.readLong(), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      }
    case 22: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      b(fmj.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 23: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi10 = fmj.a(paramParcel1.readStrongBinder());
      String str13 = paramParcel1.readString();
      String str14 = paramParcel1.readString();
      String str15 = paramParcel1.readString();
      ArrayList localArrayList2 = paramParcel1.createStringArrayList();
      ArrayList localArrayList3 = paramParcel1.createStringArrayList();
      if (paramParcel1.readInt() != 0) {}
      for (FavaDiagnosticsEntity localFavaDiagnosticsEntity = ejk.a(paramParcel1);; localFavaDiagnosticsEntity = null)
      {
        a(localfmi10, str13, str14, str15, localArrayList2, localArrayList3, localFavaDiagnosticsEntity);
        paramParcel2.writeNoException();
        return true;
      }
    case 24: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      a(fmj.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 25: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      a(fmj.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 403: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      a(fmj.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 26: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      String str11 = paramParcel1.readString();
      String str12 = paramParcel1.readString();
      long l3 = paramParcel1.readLong();
      boolean bool7;
      if (paramParcel1.readInt() != 0)
      {
        bool7 = true;
        Bundle localBundle4 = a(str11, str12, l3, bool7);
        paramParcel2.writeNoException();
        if (localBundle4 == null) {
          break label2823;
        }
        paramParcel2.writeInt(1);
        localBundle4.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        return true;
        bool7 = false;
        break;
        paramParcel2.writeInt(0);
      }
    case 205: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      String str9 = paramParcel1.readString();
      String str10 = paramParcel1.readString();
      long l2 = paramParcel1.readLong();
      boolean bool5;
      boolean bool6;
      if (paramParcel1.readInt() != 0)
      {
        bool5 = true;
        if (paramParcel1.readInt() == 0) {
          break label2920;
        }
        bool6 = true;
        Bundle localBundle3 = a(str9, str10, l2, bool5, bool6);
        paramParcel2.writeNoException();
        if (localBundle3 == null) {
          break label2926;
        }
        paramParcel2.writeInt(1);
        localBundle3.writeToParcel(paramParcel2, 1);
      }
      for (;;)
      {
        return true;
        bool5 = false;
        break;
        bool6 = false;
        break label2875;
        paramParcel2.writeInt(0);
      }
    case 101: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      b(fmj.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 102: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      c(fmj.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 27: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      a(fmj.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 701: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi9 = fmj.a(paramParcel1.readStrongBinder());
      String str5 = paramParcel1.readString();
      String str6 = paramParcel1.readString();
      String str7 = paramParcel1.readString();
      String str8 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool4 = true;; bool4 = false)
      {
        a(localfmi9, str5, str6, str7, str8, bool4);
        paramParcel2.writeNoException();
        return true;
      }
    case 28: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      a(fmj.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.createStringArrayList());
      paramParcel2.writeNoException();
      return true;
    case 29: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      a(fmj.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 204: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      a(fmj.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 301: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      b(fmj.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 302: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi8 = fmj.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle2 = null)
      {
        a(localfmi8, localBundle2);
        paramParcel2.writeNoException();
        return true;
      }
    case 303: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      a(fmj.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readString());
      paramParcel2.writeNoException();
      return true;
    case 304: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi7 = fmj.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {}
      for (Bundle localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localBundle1 = null)
      {
        b(localfmi7, localBundle1);
        paramParcel2.writeNoException();
        return true;
      }
    case 501: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi6 = fmj.a(paramParcel1.readStrongBinder());
      AccountToken localAccountToken2;
      ArrayList localArrayList1;
      if (paramParcel1.readInt() != 0)
      {
        localAccountToken2 = flx.a(paramParcel1);
        localArrayList1 = paramParcel1.createStringArrayList();
        if (paramParcel1.readInt() == 0) {
          break label3498;
        }
      }
      for (ParcelableGetOptions localParcelableGetOptions = fmb.a(paramParcel1);; localParcelableGetOptions = null)
      {
        a(localfmi6, localAccountToken2, localArrayList1, localParcelableGetOptions);
        paramParcel2.writeNoException();
        return true;
        localAccountToken2 = null;
        break;
      }
    case 502: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      eit localeit10 = b(fmj.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      if (localeit10 != null) {}
      for (IBinder localIBinder10 = localeit10.asBinder();; localIBinder10 = null)
      {
        paramParcel2.writeStrongBinder(localIBinder10);
        return true;
      }
    case 503: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi5 = fmj.a(paramParcel1.readStrongBinder());
      long l1 = paramParcel1.readLong();
      boolean bool3;
      eit localeit9;
      if (paramParcel1.readInt() != 0)
      {
        bool3 = true;
        localeit9 = b(localfmi5, l1, bool3);
        paramParcel2.writeNoException();
        if (localeit9 == null) {
          break label3642;
        }
      }
      for (IBinder localIBinder9 = localeit9.asBinder();; localIBinder9 = null)
      {
        paramParcel2.writeStrongBinder(localIBinder9);
        return true;
        bool3 = false;
        break;
      }
    case 504: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      eit localeit8 = b(fmj.a(paramParcel1.readStrongBinder()), paramParcel1.readString());
      paramParcel2.writeNoException();
      if (localeit8 != null) {}
      for (IBinder localIBinder8 = localeit8.asBinder();; localIBinder8 = null)
      {
        paramParcel2.writeStrongBinder(localIBinder8);
        return true;
      }
    case 505: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      eit localeit7 = b(fmj.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      if (localeit7 != null) {}
      for (IBinder localIBinder7 = localeit7.asBinder();; localIBinder7 = null)
      {
        paramParcel2.writeStrongBinder(localIBinder7);
        return true;
      }
    case 506: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      eit localeit6 = c(fmj.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      if (localeit6 != null) {}
      for (IBinder localIBinder6 = localeit6.asBinder();; localIBinder6 = null)
      {
        paramParcel2.writeStrongBinder(localIBinder6);
        return true;
      }
    case 507: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi4 = fmj.a(paramParcel1.readStrongBinder());
      String str1 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      boolean bool1;
      boolean bool2;
      eit localeit5;
      if (paramParcel1.readInt() != 0)
      {
        bool1 = true;
        String str3 = paramParcel1.readString();
        String str4 = paramParcel1.readString();
        int i = paramParcel1.readInt();
        int j = paramParcel1.readInt();
        int k = paramParcel1.readInt();
        if (paramParcel1.readInt() == 0) {
          break label3968;
        }
        bool2 = true;
        localeit5 = a(localfmi4, str1, str2, bool1, str3, str4, i, j, k, bool2);
        paramParcel2.writeNoException();
        if (localeit5 == null) {
          break label3974;
        }
      }
      for (IBinder localIBinder5 = localeit5.asBinder();; localIBinder5 = null)
      {
        paramParcel2.writeStrongBinder(localIBinder5);
        return true;
        bool1 = false;
        break;
        bool2 = false;
        break label3910;
      }
    case 508: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      fmi localfmi3 = fmj.a(paramParcel1.readStrongBinder());
      AvatarReference localAvatarReference;
      ParcelableLoadImageOptions localParcelableLoadImageOptions;
      eit localeit4;
      if (paramParcel1.readInt() != 0)
      {
        localAvatarReference = fnr.a(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label4073;
        }
        localParcelableLoadImageOptions = fmo.a(paramParcel1);
        localeit4 = a(localfmi3, localAvatarReference, localParcelableLoadImageOptions);
        paramParcel2.writeNoException();
        if (localeit4 == null) {
          break label4079;
        }
      }
      for (IBinder localIBinder4 = localeit4.asBinder();; localIBinder4 = null)
      {
        paramParcel2.writeStrongBinder(localIBinder4);
        return true;
        localAvatarReference = null;
        break;
        localParcelableLoadImageOptions = null;
        break label4029;
      }
    case 509: 
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      eit localeit3 = a(fmj.a(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readInt());
      paramParcel2.writeNoException();
      if (localeit3 != null) {}
      for (IBinder localIBinder3 = localeit3.asBinder();; localIBinder3 = null)
      {
        paramParcel2.writeStrongBinder(localIBinder3);
        return true;
      }
    case 601: 
      label559:
      label634:
      paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
      label1062:
      label2875:
      label2920:
      label2926:
      label4079:
      fmi localfmi2 = fmj.a(paramParcel1.readStrongBinder());
      label1422:
      label1688:
      label3498:
      label3642:
      label3910:
      label4073:
      AccountToken localAccountToken1;
      label1549:
      label2069:
      label4029:
      ParcelableListOptions localParcelableListOptions;
      label2823:
      label4193:
      eit localeit2;
      label3968:
      label3974:
      if (paramParcel1.readInt() != 0)
      {
        localAccountToken1 = flx.a(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label4237;
        }
        localParcelableListOptions = fmc.a(paramParcel1);
        localeit2 = a(localfmi2, localAccountToken1, localParcelableListOptions);
        paramParcel2.writeNoException();
        if (localeit2 == null) {
          break label4243;
        }
      }
      label4237:
      label4243:
      for (IBinder localIBinder2 = localeit2.asBinder();; localIBinder2 = null)
      {
        paramParcel2.writeStrongBinder(localIBinder2);
        return true;
        localAccountToken1 = null;
        break;
        localParcelableListOptions = null;
        break label4193;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.people.internal.IPeopleService");
    fmi localfmi1 = fmj.a(paramParcel1.readStrongBinder());
    DataHolder localDataHolder;
    eit localeit1;
    if (paramParcel1.readInt() != 0)
    {
      localDataHolder = ehk.a(paramParcel1);
      localeit1 = a(localfmi1, localDataHolder, paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readLong());
      paramParcel2.writeNoException();
      if (localeit1 == null) {
        break label4335;
      }
    }
    label4335:
    for (IBinder localIBinder1 = localeit1.asBinder();; localIBinder1 = null)
    {
      paramParcel2.writeStrongBinder(localIBinder1);
      return true;
      localDataHolder = null;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fmm
 * JD-Core Version:    0.7.0.1
 */