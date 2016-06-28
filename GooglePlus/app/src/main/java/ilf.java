import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ilf
  implements Parcelable
{
  public static final Parcelable.Creator<ilf> CREATOR = new ilg();
  public String a;
  public String b = "com.google.android.libraries.social.login.LoginRequest.DEFAULT_ERROR_TOAST";
  public int c = -1;
  public boolean d;
  public String e;
  public boolean f;
  public boolean g;
  public boolean h;
  public boolean i;
  public boolean j;
  public int k;
  public String l;
  public String m;
  public String n;
  public String o;
  public String p;
  public String q;
  public ikp r;
  public Class<? extends ikr> s;
  public Bundle t;
  public List<Class<? extends ilh>> u;
  
  public ilf()
  {
    this.d = true;
    this.k = -1;
    this.u = new ArrayList();
  }
  
  public ilf(Parcel paramParcel)
  {
    this.d = bool1;
    this.k = -1;
    this.u = new ArrayList();
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.e = paramParcel.readString();
    boolean bool2;
    boolean bool3;
    label90:
    boolean bool4;
    label106:
    boolean bool5;
    if (paramParcel.readInt() > 0)
    {
      bool2 = bool1;
      this.f = bool2;
      if (paramParcel.readInt() <= 0) {
        break label312;
      }
      bool3 = bool1;
      this.g = bool3;
      if (paramParcel.readInt() <= 0) {
        break label318;
      }
      bool4 = bool1;
      this.h = bool4;
      if (paramParcel.readInt() <= 0) {
        break label324;
      }
      bool5 = bool1;
      label122:
      this.i = bool5;
      if (paramParcel.readInt() <= 0) {
        break label330;
      }
    }
    for (;;)
    {
      for (;;)
      {
        this.j = bool1;
        this.k = paramParcel.readInt();
        this.l = paramParcel.readString();
        this.m = paramParcel.readString();
        this.n = paramParcel.readString();
        this.c = paramParcel.readInt();
        this.o = paramParcel.readString();
        this.p = paramParcel.readString();
        this.q = paramParcel.readString();
        this.r = ((ikp)paramParcel.readParcelable(getClass().getClassLoader()));
        String str = paramParcel.readString();
        this.t = paramParcel.readBundle();
        String[] arrayOfString = paramParcel.createStringArray();
        if (str != null) {}
        try
        {
          this.s = Class.forName(str);
          if (arrayOfString.length <= 0) {
            break;
          }
          this.u = new ArrayList(arrayOfString.length);
          while (i1 < arrayOfString.length)
          {
            this.u.add(Class.forName(arrayOfString[i1]));
            i1++;
          }
          bool2 = false;
        }
        catch (ClassNotFoundException localClassNotFoundException)
        {
          label312:
          label318:
          label324:
          label330:
          if (!Log.isLoggable("LoginRequest", 6)) {
            break;
          }
          Log.e("LoginRequest", "Could not deserialize class", localClassNotFoundException);
        }
      }
      bool3 = false;
      break label90;
      bool4 = false;
      break label106;
      bool5 = false;
      break label122;
      bool1 = false;
    }
  }
  
  public final ilf a(Context paramContext, Intent paramIntent)
  {
    this.k = paramIntent.getIntExtra("account_id", -1);
    fpp localfpp = ((fpo)mbb.a(paramContext, fpo.class)).a(paramContext, paramIntent);
    if (localfpp != null)
    {
      this.l = localfpp.a;
      this.m = localfpp.b;
    }
    String str1 = paramIntent.getStringExtra("viewerid");
    Object localObject;
    if (str1 != null) {
      localObject = paramIntent.getStringExtra("effectiveid");
    }
    for (;;)
    {
      if (str1 != null)
      {
        this.n = str1;
        this.m = ((String)localObject);
      }
      return this;
      Uri localUri = paramIntent.getData();
      localObject = null;
      if (localUri != null) {
        try
        {
          str1 = localUri.getQueryParameter("viewerid");
          localObject = null;
          if (str1 != null)
          {
            String str2 = localUri.getQueryParameter("effectiveid");
            localObject = str2;
          }
        }
        catch (UnsupportedOperationException localUnsupportedOperationException)
        {
          localObject = null;
        }
      }
    }
  }
  
  public final ilf a(Class<? extends ikr> paramClass)
  {
    this.s = paramClass;
    this.t = null;
    return this;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i1 = 1;
    int i2 = 0;
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.e);
    int i3;
    int i4;
    label55:
    int i5;
    label71:
    int i6;
    if (this.f)
    {
      i3 = i1;
      paramParcel.writeInt(i3);
      if (!this.g) {
        break label284;
      }
      i4 = i1;
      paramParcel.writeInt(i4);
      if (!this.h) {
        break label290;
      }
      i5 = i1;
      paramParcel.writeInt(i5);
      if (!this.i) {
        break label296;
      }
      i6 = i1;
      label87:
      paramParcel.writeInt(i6);
      if (!this.j) {
        break label302;
      }
      label100:
      paramParcel.writeInt(i1);
      paramParcel.writeInt(this.k);
      paramParcel.writeString(this.l);
      paramParcel.writeString(this.m);
      paramParcel.writeString(this.n);
      paramParcel.writeInt(this.c);
      paramParcel.writeString(this.o);
      paramParcel.writeString(this.p);
      paramParcel.writeString(this.q);
      paramParcel.writeParcelable(this.r, 0);
      if (this.s == null) {
        break label307;
      }
    }
    String[] arrayOfString;
    label284:
    label290:
    label296:
    label302:
    label307:
    for (String str = this.s.getName();; str = null)
    {
      paramParcel.writeString(str);
      paramParcel.writeBundle(this.t);
      arrayOfString = new String[this.u.size()];
      Iterator localIterator = this.u.iterator();
      while (localIterator.hasNext())
      {
        Class localClass = (Class)localIterator.next();
        int i7 = i2 + 1;
        arrayOfString[i2] = localClass.getName();
        i2 = i7;
      }
      i3 = 0;
      break;
      i4 = 0;
      break label55;
      i5 = 0;
      break label71;
      i6 = 0;
      break label87;
      i1 = 0;
      break label100;
    }
    paramParcel.writeStringArray(arrayOfString);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ilf
 * JD-Core Version:    0.7.0.1
 */