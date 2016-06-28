import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.photos.phone.PhotosHomeActivity;
import com.google.android.apps.plus.phone.HomeActivity;
import com.google.android.apps.plus.phone.HostStreamOneUpActivity;
import com.google.android.apps.plus.phone.HostStreamSingleAlbumTileActivity;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class dam
  implements Parcelable
{
  public static final Parcelable.Creator<dam> CREATOR = new dan();
  private static final Pattern e = Pattern.compile("[^\\u0009\\u000A\\u000B\\u000C\\u000D\\u0020\\u0085\\u00A0\\u1680\\u180E\\u2000\\u2001\\u2002\\u2003\\u2004\\u2005\\u2006\\u2007\\u2008\\u2009\\u200A\\u2028\\u2029\\u202F\\u205F\\u3000]*");
  public int a = 0;
  String b;
  String c;
  String d;
  private String f;
  private String g;
  private long h;
  private String i;
  private int j;
  private boolean k;
  private String l;
  private String m;
  private String n;
  private String o;
  private String p;
  private String q;
  
  public dam(Uri paramUri)
  {
    a(paramUri);
  }
  
  dam(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.f = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    this.g = paramParcel.readString();
    this.h = paramParcel.readLong();
    this.i = paramParcel.readString();
    this.l = paramParcel.readString();
    this.m = paramParcel.readString();
    this.n = paramParcel.readString();
    this.o = paramParcel.readString();
  }
  
  public dam(String paramString)
  {
    a(Uri.parse(paramString));
  }
  
  private final int a(String paramString)
  {
    int i1 = this.a;
    if (("completemyprofile".equals(paramString)) || ("profilephoto".equals(paramString))) {
      i1 = 33;
    }
    do
    {
      return i1;
      if ("coverphoto".equals(paramString)) {
        return 39;
      }
      if ("tagline".equals(paramString)) {
        return 40;
      }
    } while (!"contact".equals(paramString));
    return 41;
  }
  
  private final void a(Uri paramUri)
  {
    int i1 = 1;
    if (!efj.a(paramUri))
    {
      this.a = 31;
      return;
    }
    List localList1 = paramUri.getPathSegments();
    this.f = paramUri.getQueryParameter("authkey");
    int i2 = localList1.size();
    if ((i2 >= 2) && ("u".equals(localList1.get(0))))
    {
      localList1 = localList1.subList(2, i2);
      i2 -= 2;
    }
    int i5;
    List localList2;
    if ((i2 >= 2) && ("app".equals(localList1.get(0))) && ("basic".equals(localList1.get(i1))))
    {
      List localList3 = localList1.subList(2, i2);
      i5 = i2 - 2;
      localList2 = localList3;
    }
    for (int i3 = i5;; i3 = i2)
    {
      if ((i3 > 0) && ("photos".equals(localList2.get(0))))
      {
        int i4 = localList2.size();
        if (i4 == i1)
        {
          this.a = 3;
          return;
        }
        if (i4 == 2)
        {
          String str24 = (String)localList2.get(i1);
          if (("fromphone".equals(str24)) || ("instantupload".equals(str24)))
          {
            this.a = 12;
            return;
          }
          if ("yourphotos".equals(str24))
          {
            this.a = 42;
            return;
          }
          if (!"search".equals(str24)) {
            break;
          }
          this.a = 32;
          return;
        }
        if (i4 == 3)
        {
          String str22 = (String)localList2.get(i1);
          String str23 = (String)localList2.get(2);
          if ("of".equals(str22))
          {
            this.a = 13;
            this.b = str23;
            return;
          }
          if ("search".equals(str22))
          {
            this.a = 32;
            this.o = str23;
            return;
          }
          if ("posts".equals(str23))
          {
            this.a = 14;
            this.b = str22;
            return;
          }
          if (!"albums".equals(str23)) {
            break;
          }
          this.a = 7;
          this.b = str22;
          return;
        }
        if (i4 == 4)
        {
          String str18 = (String)localList2.get(0);
          String str19 = (String)localList2.get(i1);
          String str20 = (String)localList2.get(2);
          String str21 = (String)localList2.get(3);
          if (("photos".equals(str18)) && ("photo".equals(str20)))
          {
            this.a = 19;
            this.b = str19;
            this.h = b(str21);
            return;
          }
          if ((!"albums".equals(str20)) && (!"album".equals(str20))) {
            break;
          }
          this.b = str19;
          if ("profile".equals(str21))
          {
            this.a = 17;
            return;
          }
          if ("posts".equals(str21))
          {
            this.a = 14;
            return;
          }
          this.g = str21;
          if (this.g == null) {
            break;
          }
          this.a = 15;
          return;
        }
        if (i4 != 5) {
          break;
        }
        String str14 = (String)localList2.get(i1);
        String str15 = (String)localList2.get(2);
        String str16 = (String)localList2.get(3);
        String str17 = (String)localList2.get(4);
        if (!"albums".equals(str15)) {
          break;
        }
        this.b = str14;
        if ("profile".equals(str16))
        {
          this.h = b(str17);
          if (this.h == 0L) {
            break;
          }
          this.a = 18;
          return;
        }
        if ("posts".equals(str16))
        {
          this.h = b(str17);
          if (this.h == 0L) {
            break;
          }
          this.a = 19;
          return;
        }
        this.g = str16;
        this.h = b(str17);
        if ((this.g == null) || (this.h == 0L)) {
          break;
        }
        this.a = 16;
        return;
      }
      if (i3 == 0)
      {
        this.a = i1;
        return;
      }
      String str1 = (String)localList2.get(0);
      if ("settings".equals(str1)) {
        break;
      }
      if (i3 == i1)
      {
        if ("stream".equals(str1))
        {
          this.a = 2;
          return;
        }
        if ("me".equals(str1))
        {
          this.a = 4;
          return;
        }
        if ("circles".equals(str1))
        {
          this.a = 9;
          return;
        }
        if ("communities".equals(str1))
        {
          this.a = 45;
          return;
        }
        if (("hot".equals(str1)) || ("explore".equals(str1)))
        {
          this.a = 25;
          return;
        }
        if ("events".equals(str1))
        {
          this.a = 28;
          return;
        }
        if ("share".equals(str1))
        {
          String str12 = paramUri.getQueryParameter("url");
          if (str12 == null)
          {
            if (Log.isLoggable("EsUrlParser", 6))
            {
              String str13 = String.valueOf(paramUri);
              Log.e("EsUrlParser", 47 + String.valueOf(str13).length() + "Received share url with invalid url parameter: " + str13);
            }
            str12 = "";
          }
          dam localdam = new dam(str12);
          if (localdam.a == 10)
          {
            this.b = localdam.b;
            this.d = localdam.d;
            this.a = 38;
            return;
          }
          this.p = str12;
          this.a = 35;
          return;
        }
        if ("+".equals(str1))
        {
          this.a = i1;
          return;
        }
        if ((str1.length() > 0) && ("0123456789+".indexOf(str1.charAt(0)) != -1))
        {
          this.b = str1;
          this.a = 20;
          return;
        }
        this.a = 31;
        return;
      }
      if (i3 == 2)
      {
        String str9 = (String)localList2.get(i1);
        if (("posts".equals(str9)) || ("stream".equals(str9)))
        {
          this.a = 5;
          this.b = str1;
          return;
        }
        if ("about".equals(str9))
        {
          this.a = 6;
          this.b = str1;
          return;
        }
        if ("collections".equals(str9))
        {
          this.a = 43;
          this.b = str1;
          return;
        }
        if ("photos".equals(str9))
        {
          this.a = 7;
          this.b = str1;
          return;
        }
        if ("reviews".equals(str9))
        {
          this.a = 8;
          this.b = str1;
          return;
        }
        if ((("circles".equals(str1)) || ("people".equals(str1))) && ("find".equals(str9)))
        {
          this.a = 26;
          return;
        }
        if (("communities".equals(str1)) && ("member".equals(str9)))
        {
          this.a = 44;
          return;
        }
        if (("communities".equals(str1)) && ("recommended".equals(str9)))
        {
          this.a = 45;
          return;
        }
        if (("communities".equals(str1)) && ("yours".equals(str9)))
        {
          this.a = 46;
          return;
        }
        if ("events".equals(str1))
        {
          a(str9, null, null, paramUri, i1);
          return;
        }
        if (!"s".equals(str1)) {
          break;
        }
        this.o = str9;
        String str10 = this.o;
        if ((str10.charAt(0) == '#') && (e.matcher(str10).matches())) {
          label1424:
          if (i1 == 0) {
            break label1463;
          }
        }
        label1463:
        for (this.a = 37;; this.a = 36)
        {
          String str11 = paramUri.getQueryParameter("blob");
          if (TextUtils.isEmpty(str11)) {
            break;
          }
          this.q = str11;
          return;
          i1 = 0;
          break label1424;
        }
      }
      if (i3 == 3)
      {
        String str5 = (String)localList2.get(i1);
        String str6 = (String)localList2.get(2);
        if ("posts".equals(str5))
        {
          this.a = 10;
          this.b = str1;
          this.d = str6;
          return;
        }
        if ("digest".equals(str5))
        {
          this.a = 5;
          this.b = str1;
          return;
        }
        if (("notifications".equals(str1)) && ("all".equals(str5)))
        {
          String str8 = paramUri.getQueryParameter("mute");
          if (TextUtils.isEmpty(str8)) {
            break;
          }
          this.a = 24;
          this.c = str8;
          return;
        }
        if ("events".equals(str1))
        {
          if ("gallery".equals(str5))
          {
            a(str6, null, null, paramUri, 2);
            return;
          }
          a(str5, str6, null, paramUri, i1);
          return;
        }
        if ("op".equals(str5))
        {
          this.b = str1;
          this.a = a(str6);
          return;
        }
        if ((!"s".equals(str1)) || (!"posts".equals(str6))) {
          break;
        }
        this.a = 36;
        this.o = str5;
        String str7 = paramUri.getQueryParameter("blob");
        if (TextUtils.isEmpty(str7)) {
          break;
        }
        this.q = str7;
        return;
      }
      if (i3 == 4)
      {
        if ((!"about".equals(localList2.get(i1))) || (!"op".equals(localList2.get(2)))) {
          break;
        }
        this.b = str1;
        this.a = a((String)localList2.get(3));
        return;
      }
      if (i3 != 5) {
        break;
      }
      String str2 = (String)localList2.get(i1);
      String str3 = (String)localList2.get(2);
      localList2.get(3);
      String str4 = (String)localList2.get(4);
      if ((!"events".equals(str1)) || (!"rsvp".equals(str3))) {
        break;
      }
      a(str2, null, str4, paramUri, i1);
      return;
      localList2 = localList1;
    }
  }
  
  private final void a(String paramString1, String paramString2, String paramString3, Uri paramUri, int paramInt)
  {
    this.a = 27;
    this.m = paramString2;
    this.i = paramString1;
    this.l = paramString3;
    if (!TextUtils.isEmpty(paramUri.getQueryParameter("phid"))) {}
    for (boolean bool = true;; bool = false)
    {
      this.k = bool;
      this.n = paramUri.getQueryParameter("gpinv");
      this.j = paramInt;
      return;
    }
  }
  
  private static boolean a(Context paramContext, int paramInt, String paramString)
  {
    giz localgiz = (giz)mbb.a(paramContext, giz.class);
    if (localgiz.c(paramInt)) {
      return TextUtils.equals(localgiz.a(paramInt).b("gaia_id"), paramString);
    }
    return false;
  }
  
  private static long b(String paramString)
  {
    try
    {
      long l1 = Long.parseLong(paramString);
      return l1;
    }
    catch (NumberFormatException localNumberFormatException) {}
    return 0L;
  }
  
  public final Intent a(Context paramContext, int paramInt, Bundle paramBundle, boolean paramBoolean)
  {
    Intent localIntent6;
    switch (this.a)
    {
    case 11: 
    case 21: 
    case 22: 
    case 23: 
    case 29: 
    case 30: 
    case 31: 
    case 34: 
    default: 
      localIntent6 = new Intent("android.intent.action.VIEW", Uri.parse(this.p));
    case 1: 
    case 9: 
    case 26: 
    case 2: 
    case 25: 
    case 4: 
    case 3: 
    case 42: 
    case 10: 
      do
      {
        return localIntent6;
        return efj.c(paramContext, paramInt);
        return efj.g(paramContext, paramInt);
        return efj.m(paramContext, paramInt);
        return efj.c(paramContext, paramInt);
        return efj.i(paramContext, paramInt);
        giz localgiz = (giz)mbb.a(paramContext, giz.class);
        String str31;
        if (localgiz.c(paramInt))
        {
          String str32 = String.valueOf(localgiz.a(paramInt).b("gaia_id"));
          if (str32.length() != 0) {
            str31 = "g:".concat(str32);
          }
        }
        while (str31 != null)
        {
          return efj.a(paramContext, paramInt, str31, null, 0, false);
          str31 = new String("g:");
          continue;
          str31 = null;
        }
        return null;
        return efj.a(paramContext, paramInt, 0);
        Intent localIntent7 = new Intent(paramContext, PhotosHomeActivity.class);
        localIntent7.setAction("android.intent.action.VIEW");
        localIntent7.putExtra("destination", 1);
        localIntent7.putExtra("account_id", paramInt);
        localIntent7.putExtra("photo_picker_mode", 0);
        localIntent7.putExtra("starting_tab_index", 1);
        return localIntent7;
        localIntent6 = efj.b(paramContext, paramInt, this.c);
      } while ((paramBundle == null) || (!paramBundle.containsKey("com.google.android.apps.plus.HIDE_ACTION_BAR_LOGO")));
      localIntent6.putExtra("com.google.android.apps.plus.HIDE_ACTION_BAR_LOGO", paramBundle.getBoolean("com.google.android.apps.plus.HIDE_ACTION_BAR_LOGO"));
      return localIntent6;
    case 5: 
    case 20: 
      String str29 = String.valueOf(this.b);
      if (str29.length() != 0) {}
      for (String str30 = "g:".concat(str29);; str30 = new String("g:")) {
        return efj.a(paramContext, paramInt, str30, null, 0, false);
      }
    case 6: 
      String str27 = String.valueOf(this.b);
      if (str27.length() != 0) {}
      for (String str28 = "g:".concat(str27);; str28 = new String("g:")) {
        return efj.a(paramContext, paramInt, str28, null, 1, false);
      }
    case 7: 
      String str25 = String.valueOf(this.b);
      if (str25.length() != 0) {}
      for (String str26 = "g:".concat(str25);; str26 = new String("g:")) {
        return efj.a(paramContext, paramInt, str26, null, 2, false);
      }
    case 8: 
      String str23 = String.valueOf(this.b);
      if (str23.length() != 0) {}
      for (String str24 = "g:".concat(str23);; str24 = new String("g:")) {
        return efj.a(paramContext, paramInt, str24, null, 3, false);
      }
    case 43: 
      String str21 = String.valueOf(this.b);
      if (str21.length() != 0) {}
      for (String str22 = "g:".concat(str21);; str22 = new String("g:")) {
        return efj.a(paramContext, paramInt, str22, null, 8, false);
      }
    case 33: 
      if (a(paramContext, paramInt, this.b))
      {
        String str19 = String.valueOf(this.b);
        if (str19.length() != 0) {}
        for (String str20 = "g:".concat(str19);; str20 = new String("g:"))
        {
          localIntent6 = efj.a(paramContext, paramInt, str20, null, 4, false);
          if ((paramBundle == null) || (!paramBundle.containsKey("local_folders_only"))) {
            break;
          }
          localIntent6.putExtra("local_folders_only", paramBundle.getBoolean("local_folders_only"));
          return localIntent6;
        }
      }
      return null;
    case 39: 
      if (a(paramContext, paramInt, this.b))
      {
        String str17 = String.valueOf(this.b);
        if (str17.length() != 0) {}
        for (String str18 = "g:".concat(str17);; str18 = new String("g:"))
        {
          localIntent6 = efj.a(paramContext, paramInt, str18, null, 5, false);
          if ((paramBundle == null) || (!paramBundle.containsKey("local_folders_only"))) {
            break;
          }
          localIntent6.putExtra("local_folders_only", paramBundle.getBoolean("local_folders_only"));
          return localIntent6;
        }
      }
      return new Intent("android.intent.action.VIEW", Uri.parse(this.p));
    case 40: 
      if (a(paramContext, paramInt, this.b))
      {
        String str15 = String.valueOf(this.b);
        if (str15.length() != 0) {}
        for (String str16 = "g:".concat(str15);; str16 = new String("g:")) {
          return efj.a(paramContext, paramInt, str16, null, 6, false);
        }
      }
      return new Intent("android.intent.action.VIEW", Uri.parse(this.p));
    case 41: 
      if (a(paramContext, paramInt, this.b))
      {
        String str13 = String.valueOf(this.b);
        if (str13.length() != 0) {}
        for (String str14 = "g:".concat(str13);; str14 = new String("g:")) {
          return efj.a(paramContext, paramInt, str14, null, 7, false);
        }
      }
      return new Intent("android.intent.action.VIEW", Uri.parse(this.p));
    case 12: 
      return efj.a(paramContext, paramInt, 0);
    case 13: 
      if (a(paramContext, paramInt, this.b))
      {
        String str12 = this.b;
        Intent localIntent5 = new Intent(paramContext, PhotosHomeActivity.class);
        localIntent5.setAction("android.intent.action.VIEW");
        localIntent5.putExtra("destination", 5);
        localIntent5.putExtra("account_id", paramInt);
        localIntent5.putExtra("gaia_id", str12);
        localIntent5.putExtra("photo_picker_mode", 0);
        return localIntent5;
      }
      String str10 = String.valueOf(this.b);
      if (str10.length() != 0) {}
      for (String str11 = "g:".concat(str10);; str11 = new String("g:")) {
        return efj.a(paramContext, paramInt, str11, null, 2, false);
      }
    case 32: 
      return efj.k(paramContext, paramInt, this.o);
    case 14: 
      String str9 = jrf.a(null, this.b, "posts", "ALBUM");
      jqa localjqa3 = new jqa(paramContext, HostStreamSingleAlbumTileActivity.class, paramInt);
      localjqa3.a = jrf.a(3, new String[] { str9 });
      localjqa3.o = this.f;
      return localjqa3.a();
    case 15: 
      String str8 = jrf.a(null, this.b, this.g, "ALBUM");
      jqa localjqa2 = new jqa(paramContext, HostStreamSingleAlbumTileActivity.class, paramInt);
      localjqa2.a = jrf.a(3, new String[] { str8 });
      localjqa2.o = this.f;
      return localjqa2.a();
    case 17: 
      String str7 = jrf.a(null, this.b, "profile", "ALBUM");
      jqa localjqa1 = new jqa(paramContext, HostStreamSingleAlbumTileActivity.class, paramInt);
      localjqa1.a = jrf.a(3, new String[] { str7 });
      localjqa1.o = this.f;
      return localjqa1.a();
    case 16: 
      String str6 = jrf.a(3, new String[] { jrf.a(null, this.b, this.g, "ALBUM") });
      bdo localbdo3 = new bdo(paramContext, paramInt);
      localbdo3.e = str6;
      localbdo3.d = Long.toString(this.h);
      localbdo3.o = this.f;
      return localbdo3.a();
    case 18: 
      String str5 = jrf.a(3, new String[] { jrf.a(null, this.b, "profile", "ALBUM") });
      bdo localbdo2 = new bdo(paramContext, paramInt);
      localbdo2.e = str5;
      localbdo2.d = Long.toString(this.h);
      localbdo2.o = this.f;
      return localbdo2.a();
    case 19: 
      String str4 = jrf.a(3, new String[] { jrf.a(null, this.b, "posts", "ALBUM") });
      bdo localbdo1 = new bdo(paramContext, paramInt);
      localbdo1.e = str4;
      localbdo1.d = Long.toString(this.h);
      localbdo1.o = this.f;
      return localbdo1.a();
    case 24: 
      String str3 = this.c;
      Intent localIntent4 = new Intent(paramContext, HostStreamOneUpActivity.class);
      localIntent4.putExtra("account_id", paramInt);
      localIntent4.putExtra("activity_id", str3);
      localIntent4.putExtra("mute", true);
      return localIntent4;
    case 28: 
      return efj.f(paramContext, paramInt);
    case 27: 
      String str1 = this.i;
      String str2 = this.m;
      if (this.k) {}
      for (int i1 = 1;; i1 = 0) {
        return efj.a(paramContext, paramInt, str1, str2, i1, this.n, -2147483648, this.f, false, this.j);
      }
    case 35: 
      return efj.d(paramContext, paramInt, this.p);
    case 38: 
      if (!TextUtils.isEmpty(null)) {}
      for (boolean bool = true;; bool = false) {
        return efj.a(paramContext, paramInt, this.c, bool, bool, null, null);
      }
    case 36: 
      return efj.b(paramContext, paramInt, this.o, this.q);
    case 37: 
      return efj.j(paramContext, paramInt, this.o);
    case 44: 
      Intent localIntent3 = new Intent(paramContext, HomeActivity.class);
      if (paramInt != -1) {
        localIntent3.putExtra("account_id", paramInt);
      }
      localIntent3.putExtra("destination", 11);
      return localIntent3;
    case 45: 
      Intent localIntent2 = new Intent(paramContext, HomeActivity.class);
      if (paramInt != -1) {
        localIntent2.putExtra("account_id", paramInt);
      }
      localIntent2.putExtra("destination", 9);
      return localIntent2;
    }
    Intent localIntent1 = new Intent(paramContext, HomeActivity.class);
    if (paramInt != -1) {
      localIntent1.putExtra("account_id", paramInt);
    }
    localIntent1.putExtra("destination", 12);
    return localIntent1;
  }
  
  public final boolean a()
  {
    return (this.b != null) && (this.b.startsWith("+"));
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    paramParcel.writeString(this.f);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.g);
    paramParcel.writeLong(this.h);
    paramParcel.writeString(this.i);
    paramParcel.writeString(this.l);
    paramParcel.writeString(this.m);
    paramParcel.writeString(this.n);
    paramParcel.writeString(this.o);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dam
 * JD-Core Version:    0.7.0.1
 */