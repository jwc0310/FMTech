import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class jiq
  implements Parcelable
{
  public static final Parcelable.Creator<jiq> CREATOR = new jir();
  private static final String[] o = { "person_id", "lookup_key", "gaia_id", "name", "profile_type", "avatar", "packed_circle_ids", "matched_email", "email", "phone", "phone_type", "snippet", "in_same_visibility_group", "verified", "auto_complete_index", "auto_complete_suggestion", "is_local_result" };
  public String a;
  public String b;
  public String c;
  public final HashMap<String, String> d = new HashMap();
  public boolean e = false;
  public final ArrayList<jis> f = new ArrayList();
  public final ArrayList<jit> g = new ArrayList();
  public boolean h = false;
  public final ArrayList<jiv> i = new ArrayList();
  public final HashSet<String> j = new HashSet();
  public final ArrayList<jiv> k = new ArrayList();
  public final HashSet<String> l = new HashSet();
  public boolean m;
  public boolean n;
  private hqr p;
  
  public jiq()
  {
    this.n = true;
  }
  
  public jiq(Parcel paramParcel)
  {
    this.n = bool;
    this.c = paramParcel.readString();
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    if (paramParcel.readInt() != 0) {}
    for (;;)
    {
      this.n = bool;
      a(paramParcel, this.k, this.l);
      a(paramParcel, this.i, this.j);
      return;
      bool = false;
    }
  }
  
  public static int a(int paramInt)
  {
    if ((paramInt != 1) && (paramInt != 2))
    {
      if (Log.isLoggable("PeopleSearchResults", 5)) {
        new StringBuilder(31).append("invalid profileType ").append(paramInt);
      }
      paramInt = 1;
    }
    return paramInt;
  }
  
  private static String a(String paramString)
  {
    String str = paramString.toLowerCase();
    if (str.endsWith("@gmail.com")) {
      str = str.replace(".", "");
    }
    return str;
  }
  
  private static void a(Parcel paramParcel, List<jiv> paramList)
  {
    int i1 = paramList.size();
    paramParcel.writeInt(i1);
    int i2 = 0;
    if (i2 < i1)
    {
      jiv localjiv = (jiv)paramList.get(i2);
      paramParcel.writeString(localjiv.f);
      paramParcel.writeString(localjiv.g);
      paramParcel.writeString(localjiv.h);
      paramParcel.writeInt(localjiv.i);
      paramParcel.writeString(localjiv.j);
      paramParcel.writeString(localjiv.a);
      int i3;
      if (localjiv.b)
      {
        i3 = 1;
        label96:
        paramParcel.writeInt(i3);
        if (!localjiv.k) {
          break label149;
        }
      }
      label149:
      for (int i4 = 1;; i4 = 0)
      {
        paramParcel.writeInt(i4);
        paramParcel.writeInt(localjiv.c);
        paramParcel.writeString(localjiv.d);
        i2++;
        break;
        i3 = 0;
        break label96;
      }
    }
  }
  
  private static void a(Parcel paramParcel, List<jiv> paramList, Set<String> paramSet)
  {
    int i1 = paramParcel.readInt();
    int i2 = 0;
    if (i2 < i1)
    {
      String str1 = paramParcel.readString();
      String str2 = paramParcel.readString();
      String str3 = paramParcel.readString();
      int i3 = paramParcel.readInt();
      String str4 = paramParcel.readString();
      String str5 = paramParcel.readString();
      boolean bool1;
      label60:
      boolean bool2;
      label70:
      jiv localjiv;
      if (paramParcel.readInt() != 0)
      {
        bool1 = true;
        if (paramParcel.readInt() == 0) {
          break label164;
        }
        bool2 = true;
        localjiv = new jiv(str1, str2, str3, i3, str4, str5, bool1, bool2, paramParcel.readInt(), paramParcel.readString());
        if (!paramSet.contains(localjiv.f)) {
          break label183;
        }
        if (Log.isLoggable("PeopleSearchResults", 5))
        {
          String str6 = String.valueOf(localjiv.f);
          if (str6.length() == 0) {
            break label170;
          }
          "duplicate IDs ".concat(str6);
        }
      }
      for (;;)
      {
        i2++;
        break;
        bool1 = false;
        break label60;
        label164:
        bool2 = false;
        break label70;
        label170:
        new String("duplicate IDs ");
        continue;
        label183:
        paramList.add(localjiv);
        paramSet.add(localjiv.f);
      }
    }
  }
  
  private final Object[] a(jiv paramjiv, Set<String> paramSet1, Set<String> paramSet2)
  {
    int i1 = 1;
    String str1 = paramjiv.g;
    if (paramSet1.contains(str1)) {
      return null;
    }
    String str2 = (String)this.d.get(str1);
    if (TextUtils.isEmpty(str2)) {
      str2 = null;
    }
    Object[] arrayOfObject = new Object[17];
    arrayOfObject[0] = paramjiv.f;
    arrayOfObject[i1] = null;
    arrayOfObject[2] = paramjiv.g;
    arrayOfObject[3] = paramjiv.h;
    arrayOfObject[4] = Integer.valueOf(paramjiv.i);
    arrayOfObject[5] = paramjiv.j;
    arrayOfObject[6] = str2;
    arrayOfObject[7] = null;
    arrayOfObject[8] = null;
    arrayOfObject[9] = null;
    arrayOfObject[10] = null;
    arrayOfObject[11] = paramjiv.a;
    int i2;
    if (paramjiv.b)
    {
      i2 = i1;
      arrayOfObject[12] = Integer.valueOf(i2);
      if (!paramjiv.k) {
        break label249;
      }
    }
    for (;;)
    {
      arrayOfObject[13] = Integer.valueOf(i1);
      arrayOfObject[14] = Integer.valueOf(paramjiv.c);
      arrayOfObject[15] = paramjiv.d;
      arrayOfObject[16] = Integer.valueOf(0);
      this.p.a(arrayOfObject);
      paramSet1.add(str1);
      paramSet2.add(paramjiv.h);
      return arrayOfObject;
      i2 = 0;
      break;
      label249:
      i1 = 0;
    }
  }
  
  public static void b() {}
  
  public final void a()
  {
    this.g.clear();
    this.h = false;
    this.m = false;
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((TextUtils.isEmpty(paramString1)) || (paramString1.equals(this.c))) {
      return;
    }
    StringBuilder localStringBuilder;
    if (paramString5 != null)
    {
      localStringBuilder = new StringBuilder();
      int i2;
      for (int i1 = 0; i1 < paramString5.length(); i1 = i2 + 1)
      {
        i2 = paramString5.indexOf('|', i1);
        if (i2 == -1) {
          i2 = paramString5.length();
        }
        String str2 = paramString5.substring(i1, i2);
        if (paramString5.indexOf(str2, i2 + 1) == -1)
        {
          localStringBuilder.append(str2);
          localStringBuilder.append('|');
        }
      }
      localStringBuilder.setLength(-1 + localStringBuilder.length());
    }
    for (String str1 = localStringBuilder.toString();; str1 = paramString5)
    {
      this.g.add(new jit(paramString1, paramString2, paramString3, paramInt, paramString4, str1, paramString6, null, null, paramBoolean1, paramBoolean2));
      return;
    }
  }
  
  public final boolean a(String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, String paramString5, boolean paramBoolean1, boolean paramBoolean2, int paramInt2, String paramString6)
  {
    if ((TextUtils.isEmpty(paramString1)) || (paramString1.equals(this.c)) || (this.l.contains(paramString1))) {
      return false;
    }
    this.l.add(paramString1);
    this.k.add(new jiv(paramString1, paramString2, paramString3, a(paramInt1), paramString4, paramString5, paramBoolean1, paramBoolean2, paramInt2, paramString6));
    this.m = false;
    return true;
  }
  
  public final Cursor c()
  {
    if (this.m) {
      return this.p;
    }
    this.p = new hqr(o);
    this.m = true;
    if ((!this.h) || (!this.e)) {
      return this.p;
    }
    HashSet localHashSet1 = new HashSet();
    HashSet localHashSet2 = new HashSet();
    HashSet localHashSet3 = new HashSet();
    if (this.n)
    {
      Iterator localIterator4 = this.g.iterator();
      while (localIterator4.hasNext())
      {
        jit localjit = (jit)localIterator4.next();
        String str3 = localjit.g;
        label130:
        Object[] arrayOfObject3;
        int i1;
        if (localHashSet1.contains(str3))
        {
          if (localjit.b != null) {
            localHashSet3.add(a(localjit.b));
          }
        }
        else
        {
          arrayOfObject3 = new Object[17];
          arrayOfObject3[0] = localjit.f;
          arrayOfObject3[1] = null;
          arrayOfObject3[2] = str3;
          arrayOfObject3[3] = localjit.h;
          arrayOfObject3[4] = Integer.valueOf(localjit.i);
          arrayOfObject3[5] = localjit.j;
          arrayOfObject3[6] = localjit.a;
          arrayOfObject3[7] = localjit.b;
          arrayOfObject3[8] = null;
          arrayOfObject3[9] = localjit.c;
          arrayOfObject3[10] = localjit.d;
          arrayOfObject3[11] = null;
          if (!localjit.e) {
            break label363;
          }
          i1 = 1;
          label274:
          arrayOfObject3[12] = Integer.valueOf(i1);
          if (!localjit.k) {
            break label369;
          }
        }
        label363:
        label369:
        for (int i2 = 1;; i2 = 0)
        {
          arrayOfObject3[13] = Integer.valueOf(i2);
          arrayOfObject3[14] = Integer.valueOf(-1);
          arrayOfObject3[15] = "";
          arrayOfObject3[16] = Integer.valueOf(1);
          this.p.a(arrayOfObject3);
          localHashSet1.add(str3);
          localHashSet2.add(localjit.h);
          break label130;
          break;
          i1 = 0;
          break label274;
        }
      }
      Iterator localIterator5 = this.k.iterator();
      while (localIterator5.hasNext())
      {
        jiv localjiv2 = (jiv)localIterator5.next();
        if (!TextUtils.isEmpty((String)this.d.get(localjiv2.g))) {
          a(localjiv2, localHashSet1, localHashSet2);
        }
      }
      Iterator localIterator6 = this.i.iterator();
      while (localIterator6.hasNext())
      {
        jiv localjiv1 = (jiv)localIterator6.next();
        if (!TextUtils.isEmpty((String)this.d.get(localjiv1.g))) {
          a(localjiv1, localHashSet1, localHashSet2);
        }
      }
    }
    if (!this.f.isEmpty())
    {
      HashMap localHashMap = new HashMap();
      Iterator localIterator1 = this.f.iterator();
      while (localIterator1.hasNext())
      {
        jis localjis = (jis)localIterator1.next();
        if (!localHashSet2.contains(localjis.h))
        {
          String str1 = localjis.b;
          if (!localHashSet3.contains(a(str1)))
          {
            Object[] arrayOfObject1 = (Object[])localHashMap.get(str1);
            if (arrayOfObject1 != null)
            {
              String str2 = (String)arrayOfObject1[3];
              if (((TextUtils.isEmpty(str2)) || (str2.equalsIgnoreCase(str1))) && (!TextUtils.isEmpty(localjis.h)))
              {
                arrayOfObject1[0] = localjis.f;
                arrayOfObject1[1] = localjis.a;
                arrayOfObject1[3] = localjis.h;
                if (arrayOfObject1[9] == null) {
                  arrayOfObject1[9] = localjis.c;
                }
                if (arrayOfObject1[10] == null) {
                  arrayOfObject1[10] = localjis.d;
                }
              }
            }
            else
            {
              Object[] arrayOfObject2 = new Object[17];
              arrayOfObject2[0] = localjis.f;
              arrayOfObject2[1] = localjis.a;
              arrayOfObject2[2] = null;
              arrayOfObject2[3] = localjis.h;
              arrayOfObject2[4] = Integer.valueOf(1);
              arrayOfObject2[5] = null;
              arrayOfObject2[6] = null;
              arrayOfObject2[7] = null;
              arrayOfObject2[8] = localjis.b;
              arrayOfObject2[9] = localjis.c;
              arrayOfObject2[10] = localjis.d;
              arrayOfObject2[11] = null;
              arrayOfObject2[12] = Integer.valueOf(0);
              arrayOfObject2[13] = Integer.valueOf(0);
              arrayOfObject2[14] = Integer.valueOf(-1);
              arrayOfObject2[15] = "";
              arrayOfObject2[16] = Integer.valueOf(1);
              this.p.a(arrayOfObject2);
              localHashMap.put(str1, arrayOfObject2);
            }
          }
        }
      }
    }
    Iterator localIterator2 = this.k.iterator();
    while (localIterator2.hasNext()) {
      a((jiv)localIterator2.next(), localHashSet1, localHashSet2);
    }
    Iterator localIterator3 = this.i.iterator();
    while (localIterator3.hasNext()) {
      a((jiv)localIterator3.next(), localHashSet1, localHashSet2);
    }
    return this.p;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    if (this.n) {}
    for (int i1 = 1;; i1 = 0)
    {
      paramParcel.writeInt(i1);
      a(paramParcel, this.k);
      a(paramParcel, this.i);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jiq
 * JD-Core Version:    0.7.0.1
 */