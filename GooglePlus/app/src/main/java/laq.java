import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class laq
  implements kyn
{
  private static final String[] a = { "post_visibility", "joinability", "square_streams" };
  private static final String[] b = { "auto_subscribe" };
  private static final String[] c = { "token", "member_count" };
  private static final String[] d = { "qualified_id", "membership_status" };
  private static SparseIntArray g;
  private Context e;
  private kyx f;
  
  public laq(Context paramContext)
  {
    this.e = paramContext;
    this.f = ((kyx)mbb.a(paramContext, kyx.class));
  }
  
  private static int a(SQLiteDatabase paramSQLiteDatabase, String paramString, Collection<odu> paramCollection)
  {
    ContentValues localContentValues = new ContentValues(5);
    Iterator localIterator = paramCollection.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      odu localodu = (odu)localIterator.next();
      localContentValues.put("link_square_id", paramString);
      if (localodu.a == null)
      {
        String str6 = String.valueOf("t:");
        String str7 = String.valueOf(localodu.e.a);
        if (str7.length() != 0) {}
        for (String str8 = str6.concat(str7);; str8 = new String(str6))
        {
          localContentValues.put("qualified_id", str8);
          localContentValues.put("name", localodu.e.b);
          localContentValues.put("avatar", "");
          localContentValues.put("membership_status", Integer.valueOf(localodu.d));
          paramSQLiteDatabase.insertWithOnConflict("square_contact", null, localContentValues, 5);
          i++;
          if (!Log.isLoggable("SquaresDataServiceImpl", 3)) {
            break;
          }
          String str4 = String.valueOf(localodu.a);
          String str5 = String.valueOf(localodu.c);
          new StringBuilder(22 + String.valueOf(str4).length() + String.valueOf(str5).length()).append("Insert user: id=").append(str4).append(" name=").append(str5);
          break;
        }
      }
      String str1 = String.valueOf("g:");
      String str2 = String.valueOf(localodu.a);
      if (str2.length() != 0) {}
      for (String str3 = str1.concat(str2);; str3 = new String(str1))
      {
        localContentValues.put("qualified_id", str3);
        localContentValues.put("name", localodu.c);
        localContentValues.put("avatar", hdo.a(localodu.b));
        break;
      }
    }
    return i;
  }
  
  private final void a(int paramInt, String paramString, kzc[] paramArrayOfkzc)
  {
    if (paramArrayOfkzc != null)
    {
      int i = paramArrayOfkzc.length;
      for (int j = 0; j < i; j++)
      {
        String str2 = efj.a(null, null, false, paramString, paramArrayOfkzc[j].a, 0, null);
        lmp.g(this.e, paramInt, str2);
      }
    }
    String str1 = efj.a(null, null, false, paramString, null, 0, null);
    lmp.g(this.e, paramInt, str1);
  }
  
  private final void a(SQLiteDatabase paramSQLiteDatabase, String paramString, int paramInt1, int paramInt2)
  {
    if (paramInt1 == 1) {
      a(paramSQLiteDatabase, paramString, 2, paramInt2);
    }
    for (;;)
    {
      switch (paramInt1)
      {
      default: 
        return;
        if (paramInt1 == 2) {
          a(paramSQLiteDatabase, paramString, 3, paramInt2);
        }
        break;
      }
    }
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramInt2);
    arrayOfObject[1] = paramString;
    arrayOfObject[2] = Integer.valueOf(paramInt1);
    paramSQLiteDatabase.execSQL("UPDATE square_member_status SET member_count = member_count + ? WHERE square_id=? AND membership_status=?", arrayOfObject);
  }
  
  private static void a(SQLiteDatabase paramSQLiteDatabase, String paramString, odl[] paramArrayOfodl)
  {
    int i = paramArrayOfodl.length;
    int j = 0;
    odl localodl;
    int k;
    String str;
    if (j < i)
    {
      localodl = paramArrayOfodl[j];
      odu[] arrayOfodu = localodl.d;
      if (arrayOfodu == null) {
        break label142;
      }
      k = localodl.b.intValue();
      if (arrayOfodu.length >= localodl.b.intValue()) {
        break label136;
      }
      str = localodl.c;
    }
    for (;;)
    {
      int m = localodl.a;
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("square_id", paramString);
      localContentValues.put("membership_status", Integer.valueOf(m));
      localContentValues.put("token", str);
      localContentValues.put("member_count", Integer.valueOf(k));
      paramSQLiteDatabase.insertWithOnConflict("square_member_status", null, localContentValues, 5);
      j++;
      break;
      return;
      label136:
      str = null;
      continue;
      label142:
      k = 0;
      str = null;
    }
  }
  
  private static boolean a(Cursor paramCursor, kyf paramkyf)
  {
    String str1 = paramCursor.getString(1);
    String str2 = paramCursor.getString(2);
    String str3 = paramCursor.getString(3);
    String str4 = paramCursor.getString(4);
    String str5 = paramCursor.getString(30);
    int i = paramCursor.getInt(5);
    int j = paramCursor.getInt(6);
    int k = paramCursor.getInt(7);
    int m = paramCursor.getInt(10);
    int n = paramCursor.getInt(27);
    int i1;
    int i2;
    label121:
    int i3;
    label135:
    int i4;
    label149:
    int i5;
    label163:
    int i6;
    label177:
    int i7;
    if (paramCursor.getInt(8) != 0)
    {
      i1 = 1;
      if (paramCursor.getInt(11) == 0) {
        break label358;
      }
      i2 = 1;
      if (paramCursor.getInt(12) == 0) {
        break label364;
      }
      i3 = 1;
      if (paramCursor.getInt(13) == 0) {
        break label370;
      }
      i4 = 1;
      if (paramCursor.getInt(14) == 0) {
        break label376;
      }
      i5 = 1;
      if (paramCursor.getInt(15) == 0) {
        break label382;
      }
      i6 = 1;
      if (paramCursor.getInt(16) == 0) {
        break label388;
      }
      i7 = 1;
      label191:
      if (paramCursor.getInt(17) == 0) {
        break label394;
      }
    }
    int i9;
    int i10;
    kzc[] arrayOfkzc;
    odr localodr1;
    qek localqek1;
    label388:
    label394:
    for (int i8 = 1;; i8 = 0)
    {
      i9 = paramCursor.getInt(25);
      i10 = paramCursor.getInt(26);
      arrayOfkzc = kzc.a(paramCursor.getBlob(18));
      localodr1 = jht.c(paramCursor.getBlob(31));
      localqek1 = (qek)hqv.a(new qek(), paramCursor.getBlob(32));
      if ((mfx.a(str1, paramkyf.b)) && (mfx.a(str2, paramkyf.f)) && (mfx.a(str3, paramkyf.e)) && (mfx.a(str4, paramkyf.i)) && (k == paramkyf.g) && (i == paramkyf.h) && (mfx.a(str5, paramkyf.c))) {
        break label400;
      }
      return true;
      i1 = 0;
      break;
      label358:
      i2 = 0;
      break label121;
      label364:
      i3 = 0;
      break label135;
      label370:
      i4 = 0;
      break label149;
      label376:
      i5 = 0;
      break label163;
      label382:
      i6 = 0;
      break label177;
      i7 = 0;
      break label191;
    }
    label400:
    if ((i1 != paramkyf.n) || (i2 != paramkyf.o) || (i3 != paramkyf.p) || (i4 != 0) || (i5 != 0) || (i6 != paramkyf.v) || (i7 != paramkyf.w)) {
      return true;
    }
    if (m != paramkyf.j) {
      return true;
    }
    if (i8 != paramkyf.k) {
      return true;
    }
    if (j != efj.a(Integer.valueOf(paramkyf.d))) {
      return true;
    }
    if (paramkyf.t != null)
    {
      oeh localoeh = paramkyf.t;
      int i16;
      int i15;
      if (localoeh != null)
      {
        odw[] arrayOfodw1 = localoeh.a;
        if ((arrayOfodw1 == null) || (arrayOfodw1.length == 0))
        {
          i16 = 1;
          if (i16 == 0) {
            break label573;
          }
        }
      }
      else
      {
        if ((arrayOfkzc != null) && (arrayOfkzc.length != 0)) {
          break label567;
        }
        i15 = 1;
      }
      label567:
      label695:
      for (;;)
      {
        if (i15 != 0) {
          break label701;
        }
        return true;
        i16 = 0;
        break;
        i15 = 0;
        continue;
        label573:
        if (arrayOfkzc == null)
        {
          i15 = 0;
        }
        else
        {
          odw[] arrayOfodw2 = localoeh.a;
          if (arrayOfodw2.length != arrayOfkzc.length)
          {
            i15 = 0;
          }
          else
          {
            int i17 = 0;
            int i18 = arrayOfkzc.length;
            for (;;)
            {
              if (i17 >= i18) {
                break label695;
              }
              kzc localkzc = arrayOfkzc[i17];
              odw localodw = arrayOfodw2[i17];
              if ((!mfx.a(localkzc.a, localodw.a)) || (!mfx.a(localkzc.b, localodw.b)) || (!mfx.a(localkzc.c, localodw.c)))
              {
                i15 = 0;
                break;
              }
              i17++;
            }
            i15 = 1;
          }
        }
      }
    }
    label701:
    if (((i9 != paramkyf.l) && (paramkyf.l != -2147483648)) || ((i10 != paramkyf.m) && (paramkyf.m != -2147483648))) {
      return true;
    }
    if ((n != paramkyf.s) && (paramkyf.s != -2147483648)) {
      return true;
    }
    odr localodr2 = paramkyf.r;
    int i11;
    if ((localodr1 != null) || (localodr2 != null)) {
      if ((localodr1 == null) || (localodr2 == null)) {
        i11 = 0;
      }
    }
    while (i11 == 0)
    {
      return true;
      if (localodr1.a.length != localodr2.a.length)
      {
        i11 = 0;
      }
      else
      {
        for (int i14 = 0;; i14++)
        {
          if (i14 >= localodr1.a.length) {
            break label913;
          }
          odq localodq1 = localodr1.a[i14];
          odq localodq2 = localodr2.a[i14];
          if ((!mfx.a(localodq1.a, localodq2.a)) || (!mfx.a(localodq1.b, localodq2.b)) || (!mfx.a(localodq1.c, localodq2.c)))
          {
            i11 = 0;
            break;
          }
        }
        label913:
        i11 = 1;
      }
    }
    qek localqek2 = paramkyf.q;
    int i12;
    if ((localqek1 != null) || (localqek2 != null)) {
      if ((localqek1 == null) || (localqek2 == null)) {
        i12 = 0;
      }
    }
    while (i12 == 0)
    {
      return true;
      if (!TextUtils.equals(localqek1.a, localqek2.a)) {
        i12 = 0;
      } else {
        i12 = 1;
      }
    }
    int i13 = paramCursor.getInt(9);
    String str6 = paramCursor.getString(20);
    String str7 = paramCursor.getString(21);
    String str8 = paramCursor.getString(22);
    String str9 = paramCursor.getString(29);
    return (i13 != paramkyf.y) || (!TextUtils.equals(str6, paramkyf.z)) || (!TextUtils.equals(str7, paramkyf.A)) || (!TextUtils.equals(str8, paramkyf.B)) || (!TextUtils.equals(str9, paramkyf.u));
  }
  
  private static boolean a(kyf paramkyf)
  {
    if ((paramkyf != null) && (!TextUtils.isEmpty(paramkyf.a))) {
      return true;
    }
    if (Log.isLoggable("SquaresDataServiceImpl", 6)) {
      Log.e("SquaresDataServiceImpl", "Invalid ViewerSquare");
    }
    return false;
  }
  
  private static ContentValues b(kyf paramkyf)
  {
    int i = 1;
    int j = 0;
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("square_id", paramkyf.a);
    localContentValues.put("square_name", paramkyf.b);
    localContentValues.put("tagline", paramkyf.f);
    localContentValues.put("photo_url", paramkyf.e);
    localContentValues.put("about_text", paramkyf.i);
    localContentValues.put("joinability", Integer.valueOf(paramkyf.h));
    localContentValues.put("membership_status", Integer.valueOf(paramkyf.g));
    localContentValues.put("restricted_domain", paramkyf.c);
    localContentValues.put("post_visibility", Integer.valueOf(paramkyf.j));
    int k;
    int m;
    label148:
    int n;
    label170:
    int i1;
    label214:
    int i2;
    label236:
    int i3;
    if (paramkyf.n)
    {
      k = i;
      localContentValues.put("is_member", Integer.valueOf(k));
      if (!paramkyf.o) {
        break label382;
      }
      m = i;
      localContentValues.put("can_see_members", Integer.valueOf(m));
      if (!paramkyf.p) {
        break label388;
      }
      n = i;
      localContentValues.put("can_see_posts", Integer.valueOf(n));
      localContentValues.put("can_join", Integer.valueOf(0));
      localContentValues.put("can_request_to_join", Integer.valueOf(0));
      if (!paramkyf.v) {
        break label394;
      }
      i1 = i;
      localContentValues.put("can_share", Integer.valueOf(i1));
      if (!paramkyf.w) {
        break label400;
      }
      i2 = i;
      localContentValues.put("can_invite", Integer.valueOf(i2));
      localContentValues.put("member_count", Integer.valueOf(paramkyf.d));
      if (!paramkyf.k) {
        break label406;
      }
      i3 = i;
      label271:
      localContentValues.put("notifications_enabled", Integer.valueOf(i3));
      if (paramkyf.t == null) {
        break label428;
      }
      odw[] arrayOfodw1 = paramkyf.t.a;
      if ((arrayOfodw1 != null) && (arrayOfodw1.length != 0)) {
        break label412;
      }
    }
    label388:
    label394:
    label400:
    label406:
    label412:
    for (;;)
    {
      label310:
      if (i == 0)
      {
        odw[] arrayOfodw2 = paramkyf.t.a;
        kzc[] arrayOfkzc = new kzc[arrayOfodw2.length];
        for (;;)
        {
          if (j < arrayOfkzc.length)
          {
            odw localodw = arrayOfodw2[j];
            arrayOfkzc[j] = new kzc(localodw.a, localodw.b, localodw.c);
            j++;
            continue;
            k = 0;
            break;
            label382:
            m = 0;
            break label148;
            n = 0;
            break label170;
            i1 = 0;
            break label214;
            i2 = 0;
            break label236;
            i3 = 0;
            break label271;
            i = 0;
            break label310;
          }
        }
        localContentValues.put("square_streams", kzc.a(arrayOfkzc));
      }
    }
    label428:
    if (paramkyf.l != -2147483648) {
      localContentValues.put("auto_subscribe", Integer.valueOf(paramkyf.l));
    }
    if (paramkyf.m != -2147483648) {
      localContentValues.put("disable_subscription", Integer.valueOf(paramkyf.m));
    }
    if (paramkyf.s != -2147483648) {
      localContentValues.put("unread_count", Integer.valueOf(paramkyf.s));
    }
    localContentValues.put("related_links", jht.a(paramkyf.r));
    qek localqek = paramkyf.q;
    if (localqek != null) {
      localContentValues.put("location", qat.a(localqek));
    }
    for (;;)
    {
      if (paramkyf.C != null) {
        localContentValues.put("facepile", mab.b(paramkyf.C));
      }
      if (paramkyf.z != null) {
        localContentValues.put("inviter_gaia_id", paramkyf.z);
      }
      if (paramkyf.A != null) {
        localContentValues.put("inviter_name", paramkyf.A);
      }
      if (paramkyf.B != null) {
        localContentValues.put("inviter_photo_url", paramkyf.B);
      }
      if (paramkyf.y != 0) {
        localContentValues.put("list_category", Integer.valueOf(paramkyf.y));
      }
      if (paramkyf.x != -2147483648) {
        localContentValues.put("sort_index", Integer.valueOf(paramkyf.x));
      }
      if (!TextUtils.isEmpty(paramkyf.u)) {
        localContentValues.put("suggestion_id", paramkyf.u);
      }
      return localContentValues;
      localContentValues.putNull("location");
    }
  }
  
  public final int a(int paramInt, String paramString, odl[] paramArrayOfodl)
  {
    int i = 0;
    if (paramArrayOfodl == null) {
      return 0;
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.e, paramInt);
    localSQLiteDatabase.beginTransaction();
    for (;;)
    {
      int k;
      try
      {
        a(localSQLiteDatabase, paramString, paramArrayOfodl);
        int j = paramArrayOfodl.length;
        k = 0;
        if (k < j)
        {
          odl localodl = paramArrayOfodl[k];
          if (localodl.d != null) {
            i += a(localSQLiteDatabase, paramString, Arrays.asList(localodl.d));
          }
        }
        else
        {
          localSQLiteDatabase.setTransactionSuccessful();
          localSQLiteDatabase.endTransaction();
          Uri localUri = this.f.b(paramString);
          this.e.getContentResolver().notifyChange(localUri, null);
          return i;
        }
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
      k++;
    }
  }
  
  public final int a(int paramInt, kyf[] paramArrayOfkyf1, kyf[] paramArrayOfkyf2, kyf[] paramArrayOfkyf3)
  {
    HashMap localHashMap1 = new HashMap();
    if ((paramArrayOfkyf3 != null) && (paramArrayOfkyf3.length > 0)) {}
    for (int i = 1; i != 0; i = 0)
    {
      int i5 = 0;
      int i6 = paramArrayOfkyf3.length;
      while (i5 < i6)
      {
        kyf localkyf5 = paramArrayOfkyf3[i5];
        localkyf5.x = i5;
        localkyf5.y = 3;
        if (a(localkyf5)) {
          localHashMap1.put(localkyf5.a, localkyf5);
        }
        i5++;
      }
    }
    if (paramArrayOfkyf1 != null)
    {
      int i3 = 0;
      int i4 = paramArrayOfkyf1.length;
      while (i3 < i4)
      {
        kyf localkyf4 = paramArrayOfkyf1[i3];
        localkyf4.x = i3;
        localkyf4.y = 1;
        if (a(localkyf4)) {
          localHashMap1.put(localkyf4.a, localkyf4);
        }
        i3++;
      }
    }
    if (paramArrayOfkyf2 != null)
    {
      int i1 = 0;
      int i2 = paramArrayOfkyf2.length;
      while (i1 < i2)
      {
        kyf localkyf3 = paramArrayOfkyf2[i1];
        localkyf3.x = i1;
        localkyf3.y = 2;
        if (a(localkyf3)) {
          localHashMap1.put(localkyf3.a, localkyf3);
        }
        i1++;
      }
    }
    long l = System.currentTimeMillis();
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.e, paramInt);
    localSQLiteDatabase.beginTransaction();
    HashMap localHashMap2;
    ArrayList localArrayList;
    Cursor localCursor;
    String str4;
    kyf localkyf2;
    try
    {
      localHashMap2 = new HashMap();
      localArrayList = new ArrayList();
      StringBuilder localStringBuilder1 = new StringBuilder();
      if (paramArrayOfkyf2 != null) {
        localStringBuilder1.append("is_member!=0 OR ");
      }
      if (paramArrayOfkyf1 != null)
      {
        localStringBuilder1.append("membership_status = ");
        localStringBuilder1.append(5).append(" OR ");
      }
      if (i != 0)
      {
        localStringBuilder1.append("list_category = ");
        localStringBuilder1.append(3).append(" OR ");
      }
      localStringBuilder1.setLength(-4 + localStringBuilder1.length());
      localCursor = localSQLiteDatabase.query("squares", kzq.c, localStringBuilder1.toString(), null, null, null, null);
      try
      {
        for (;;)
        {
          if (!localCursor.moveToNext()) {
            break label576;
          }
          str4 = localCursor.getString(0);
          localkyf2 = (kyf)localHashMap1.remove(str4);
          if (localkyf2 != null) {
            break;
          }
          localArrayList.add(str4);
        }
        localObject1 = finally;
      }
      finally
      {
        localCursor.close();
      }
      if (!a(localCursor, localkyf2)) {
        break label543;
      }
    }
    finally
    {
      localSQLiteDatabase.endTransaction();
    }
    Object localObject3 = b(localkyf2);
    if (Log.isLoggable("SquaresDataServiceImpl", 3))
    {
      String str5 = String.valueOf(((ContentValues)localObject3).getAsString("square_name"));
      new StringBuilder(24 + String.valueOf(str4).length() + String.valueOf(str5).length()).append("Update square: id=").append(str4).append(" name=").append(str5);
    }
    for (;;)
    {
      localHashMap2.put(str4, localObject3);
      break;
      label543:
      ContentValues localContentValues = new ContentValues(2);
      localContentValues.put("sort_index", Integer.valueOf(localkyf2.x));
      localObject3 = localContentValues;
    }
    label576:
    localCursor.close();
    int m;
    if (!localArrayList.isEmpty())
    {
      StringBuilder localStringBuilder2 = new StringBuilder();
      int j = localArrayList.size();
      String[] arrayOfString = new String[j];
      localStringBuilder2.append("square_id IN (");
      for (int k = 0; k < j; k++)
      {
        localStringBuilder2.append("?,");
        arrayOfString[k] = ((String)localArrayList.get(k));
      }
      localStringBuilder2.setLength(-1 + localStringBuilder2.length());
      localStringBuilder2.append(')');
      localSQLiteDatabase.delete("squares", localStringBuilder2.toString(), arrayOfString);
      m = j + 0;
      if (Log.isLoggable("SquaresDataServiceImpl", 3)) {
        new StringBuilder(26).append("Delete ").append(j).append(" squares");
      }
    }
    for (;;)
    {
      Iterator localIterator1 = localHashMap2.entrySet().iterator();
      while (localIterator1.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator1.next();
        String str3 = (String)localEntry.getKey();
        localSQLiteDatabase.update("squares", (ContentValues)localEntry.getValue(), "square_id=?", new String[] { str3 });
        m++;
      }
      Iterator localIterator2 = localHashMap1.values().iterator();
      int n = m;
      while (localIterator2.hasNext())
      {
        kyf localkyf1 = (kyf)localIterator2.next();
        localSQLiteDatabase.insertWithOnConflict("squares", null, b(localkyf1), 5);
        n++;
        if (Log.isLoggable("SquaresDataServiceImpl", 3))
        {
          String str1 = String.valueOf(localkyf1.a);
          String str2 = String.valueOf(localkyf1.b);
          new StringBuilder(24 + String.valueOf(str1).length() + String.valueOf(str2).length()).append("Insert square: id=").append(str1).append(" name=").append(str2);
        }
      }
      localSQLiteDatabase.setTransactionSuccessful();
      localSQLiteDatabase.endTransaction();
      if ((paramArrayOfkyf1 != null) || (paramArrayOfkyf2 != null)) {
        ((kzr)mbb.a(this.e, kzr.class)).a.a(paramInt, "last_squares_sync_time", l);
      }
      if (i != 0) {
        ((kzr)mbb.a(this.e, kzr.class)).a.a(paramInt, "last_suggestions_sync_time", l);
      }
      if (n != 0)
      {
        Uri localUri = this.f.a();
        this.e.getContentResolver().notifyChange(localUri, null);
        ((kyk)mbb.a(this.e, kyk.class)).a(paramInt, null);
      }
      return n;
      m = 0;
    }
  }
  
  public final Cursor a(int paramInt1, String paramString1, int paramInt2, String[] paramArrayOfString, String paramString2)
  {
    Object localObject;
    switch (paramInt2)
    {
    default: 
      String[] arrayOfString6 = new String[3];
      arrayOfString6[0] = Integer.toString(1);
      arrayOfString6[1] = Integer.toString(2);
      arrayOfString6[2] = Integer.toString(3);
      localObject = arrayOfString6;
    }
    StringBuilder localStringBuilder;
    for (;;)
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("membership_status IN (");
      for (int i = 0; i < localObject.length; i++) {
        localStringBuilder.append("?,");
      }
      String[] arrayOfString5 = new String[1];
      arrayOfString5[0] = Integer.toString(6);
      localObject = arrayOfString5;
      continue;
      String[] arrayOfString4 = new String[1];
      arrayOfString4[0] = Integer.toString(5);
      localObject = arrayOfString4;
      continue;
      String[] arrayOfString3 = new String[1];
      arrayOfString3[0] = Integer.toString(4);
      localObject = arrayOfString3;
      continue;
      String[] arrayOfString1 = new String[2];
      arrayOfString1[0] = Integer.toString(1);
      arrayOfString1[1] = Integer.toString(2);
      localObject = arrayOfString1;
    }
    localStringBuilder.setLength(-1 + localStringBuilder.length());
    localStringBuilder.append(')');
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("square_contact");
    localSQLiteQueryBuilder.appendWhere("link_square_id");
    localSQLiteQueryBuilder.appendWhere("=?");
    String[] arrayOfString2 = (String[])efj.a(new String[] { paramString1 }, (Object[])localObject);
    localSQLiteQueryBuilder.setProjectionMap(kzq.b);
    if (Log.isLoggable("SquaresDataServiceImpl", 3))
    {
      String str = String.valueOf(localSQLiteQueryBuilder.buildQuery(paramArrayOfString, localStringBuilder.toString(), arrayOfString2, null, null, null, null));
      if (str.length() == 0) {
        break label425;
      }
      "QUERY: ".concat(str);
    }
    for (;;)
    {
      Cursor localCursor = localSQLiteQueryBuilder.query(hsb.b(this.e, paramInt1), paramArrayOfString, localStringBuilder.toString(), arrayOfString2, null, null, "square_contact.membership_status, name", null);
      if (Log.isLoggable("SquaresDataServiceImpl", 3))
      {
        int j = localCursor.getCount();
        new StringBuilder(26).append("QUERY results: ").append(j);
      }
      localCursor.setNotificationUri(this.e.getContentResolver(), this.f.b(paramString1));
      return localCursor;
      label425:
      new String("QUERY: ");
    }
  }
  
  public final Cursor a(int paramInt, String paramString, String[] paramArrayOfString)
  {
    Cursor localCursor = hsb.b(this.e, paramInt).query("squares", paramArrayOfString, "square_id=?", new String[] { paramString }, null, null, null);
    localCursor.setNotificationUri(this.e.getContentResolver(), this.f.a(paramString));
    return localCursor;
  }
  
  public final void a(int paramInt)
  {
    hsb.a(this.e, paramInt).delete("my_visible_squares", null, null);
  }
  
  public final void a(int paramInt, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.e, paramInt);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("invitation_dismissed", Integer.valueOf(1));
    if (localSQLiteDatabase.update("squares", localContentValues, "square_id=?", new String[] { paramString }) > 0)
    {
      Uri localUri = this.f.a();
      this.e.getContentResolver().notifyChange(localUri, null);
    }
  }
  
  public final void a(int paramInt1, String paramString, int paramInt2)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.e, paramInt1);
    localSQLiteDatabase.beginTransaction();
    ContentValues localContentValues;
    boolean bool;
    int i;
    for (;;)
    {
      try
      {
        localContentValues = new ContentValues();
        Cursor localCursor1;
        if ((paramInt2 == 3) || (paramInt2 == 2))
        {
          localContentValues.put("membership_status", Integer.valueOf(3));
          localContentValues.put("is_member", Integer.valueOf(1));
          localContentValues.put("list_category", Integer.valueOf(2));
          localContentValues.put("can_see_members", Integer.valueOf(1));
          localContentValues.put("can_see_posts", Integer.valueOf(1));
          localContentValues.put("can_join", Integer.valueOf(0));
          localContentValues.put("can_request_to_join", Integer.valueOf(0));
          localCursor1 = localSQLiteDatabase.query("squares", b, "square_id=?", new String[] { paramString }, null, null, null);
        }
        int j;
        label195:
        Uri localUri;
        if (paramInt2 != 0) {
          break label343;
        }
      }
      finally
      {
        try
        {
          if (!localCursor1.moveToNext()) {
            break;
          }
          j = localCursor1.getInt(0);
          if (j != 0)
          {
            bool = true;
            localCursor1.close();
            localContentValues.put("notifications_enabled", Boolean.valueOf(bool));
            i = 1;
            if (i != 0) {
              localSQLiteDatabase.update("squares", localContentValues, "square_id=?", new String[] { paramString });
            }
            localSQLiteDatabase.setTransactionSuccessful();
            localSQLiteDatabase.endTransaction();
            if (i != 0)
            {
              localUri = this.f.a();
              this.e.getContentResolver().notifyChange(localUri, null);
            }
            return;
          }
          bool = false;
          continue;
          localSQLiteDatabase.endTransaction();
        }
        finally
        {
          localCursor1.close();
        }
      }
      localContentValues.put("membership_status", Integer.valueOf(4));
      localContentValues.put("can_request_to_join", Integer.valueOf(0));
      i = 1;
      continue;
      label343:
      if (paramInt2 == 20)
      {
        localContentValues.put("membership_status", Integer.valueOf(0));
        localContentValues.put("can_request_to_join", Integer.valueOf(1));
        i = 1;
      }
      else if (paramInt2 == 15)
      {
        localContentValues.put("notifications_enabled", Integer.valueOf(1));
        i = 1;
      }
      else
      {
        if (paramInt2 != 16) {
          break label756;
        }
        localContentValues.put("notifications_enabled", Integer.valueOf(0));
        i = 1;
      }
    }
    label426:
    Cursor localCursor2 = localSQLiteDatabase.query("squares", a, "square_id=?", new String[] { paramString }, null, null, null);
    for (;;)
    {
      try
      {
        if (!localCursor2.moveToNext()) {
          break label738;
        }
        if (localCursor2.getInt(0) != 0) {
          break label773;
        }
        i4 = 1;
        int i5 = localCursor2.getInt(1);
        kzc[] arrayOfkzc2 = kzc.a(localCursor2.getBlob(2));
        k = i5;
        m = i4;
        arrayOfkzc1 = arrayOfkzc2;
        localCursor2.close();
        localContentValues.put("membership_status", Integer.valueOf(0));
        localContentValues.put("is_member", Integer.valueOf(0));
        if (m != 0)
        {
          n = 1;
          localContentValues.put("can_see_members", Integer.valueOf(n));
          if (m == 0) {
            break label720;
          }
          i1 = 1;
          localContentValues.put("can_see_posts", Integer.valueOf(i1));
          if (k != 0) {
            break label726;
          }
          i2 = 1;
          localContentValues.put("can_join", Integer.valueOf(i2));
          if (k != 1) {
            break label732;
          }
          i3 = 1;
          localContentValues.put("can_request_to_join", Integer.valueOf(i3));
          localContentValues.put("can_share", Integer.valueOf(0));
          localContentValues.put("can_invite", Integer.valueOf(0));
          if ((m == 0) && (paramInt2 == 5))
          {
            a(paramInt1, paramString, arrayOfkzc1);
            localContentValues.putNull("square_streams");
            localContentValues.putNull("related_links");
          }
          localContentValues.put("list_category", Integer.valueOf(0));
          i = 1;
          break label195;
        }
      }
      finally
      {
        localCursor2.close();
      }
      int n = 0;
      continue;
      label720:
      int i1 = 0;
      continue;
      label726:
      int i2 = 0;
      continue;
      label732:
      int i3 = 0;
      continue;
      label738:
      int k = -1;
      kzc[] arrayOfkzc1 = null;
      int m = 0;
      continue;
      bool = false;
      break;
      label756:
      if (paramInt2 == 5) {
        break label426;
      }
      i = 0;
      if (paramInt2 != 21) {
        break label195;
      }
      break label426;
      label773:
      int i4 = 0;
    }
  }
  
  public final void a(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    if (g == null)
    {
      SparseIntArray localSparseIntArray = new SparseIntArray();
      localSparseIntArray.put(1, 3);
      localSparseIntArray.put(4, 7);
      localSparseIntArray.put(6, 0);
      localSparseIntArray.put(7, 6);
      localSparseIntArray.put(8, 0);
      localSparseIntArray.put(9, 2);
      localSparseIntArray.put(10, 1);
      localSparseIntArray.put(12, 2);
      localSparseIntArray.put(13, 3);
      localSparseIntArray.put(14, 3);
      localSparseIntArray.put(22, 0);
      g = localSparseIntArray;
    }
    int i = g.get(paramInt2);
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.e, paramInt1);
    localSQLiteDatabase.beginTransaction();
    for (;;)
    {
      try
      {
        String[] arrayOfString = { paramString1, paramString2 };
        Cursor localCursor = localSQLiteDatabase.query("square_contact", new String[] { "membership_status" }, "link_square_id=? AND qualified_id=?", arrayOfString, null, null, null);
        if (localCursor == null) {
          break label431;
        }
        if (!localCursor.moveToFirst()) {
          break label425;
        }
        j = localCursor.getInt(0);
        localCursor.close();
        k = j;
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("membership_status", Integer.valueOf(i));
        localSQLiteDatabase.update("square_contact", localContentValues, "link_square_id=? AND qualified_id=?", arrayOfString);
        if (((giz)mbb.a(this.e, giz.class)).a(paramInt1).b("gaia_id").equals(efj.t(paramString2)))
        {
          localContentValues.clear();
          localContentValues.put("membership_status", Integer.valueOf(i));
          localSQLiteDatabase.update("squares", localContentValues, "square_id=?", new String[] { paramString1 });
          m = 1;
          a(localSQLiteDatabase, paramString1, k, -1);
          a(localSQLiteDatabase, paramString1, i, 1);
          localSQLiteDatabase.setTransactionSuccessful();
          localSQLiteDatabase.endTransaction();
          Uri localUri1 = this.f.b(paramString1);
          this.e.getContentResolver().notifyChange(localUri1, null);
          if (m != 0)
          {
            Uri localUri2 = this.f.a();
            this.e.getContentResolver().notifyChange(localUri2, null);
          }
          return;
        }
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
      int m = 0;
      continue;
      label425:
      int j = -1;
      continue;
      label431:
      int k = -1;
    }
  }
  
  public final void a(int paramInt, String paramString, omv paramomv)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.e, paramInt);
    ContentValues localContentValues = new ContentValues();
    if (paramomv.b != -2147483648) {
      if (paramomv.b != 2) {
        break label149;
      }
    }
    label149:
    for (int i = 1;; i = 0)
    {
      localContentValues.put("notifications_enabled", Integer.valueOf(i));
      if (paramomv.a != -2147483648)
      {
        localContentValues.put("volume", Integer.valueOf(paramomv.a));
        localContentValues.put("last_volume_sync", Long.valueOf(System.currentTimeMillis()));
      }
      if (localContentValues.size() > 0) {
        if (localSQLiteDatabase.update("squares", localContentValues, "square_id=?", new String[] { paramString }) > 0)
        {
          Uri localUri = this.f.a();
          this.e.getContentResolver().notifyChange(localUri, null);
        }
      }
      return;
    }
  }
  
  public final boolean a(int paramInt, String paramString1, String paramString2)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2))) {
      return false;
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.e, paramInt);
    ContentValues localContentValues = new ContentValues(2);
    localContentValues.put("gaia_id", paramString1);
    localContentValues.put("square_id", paramString2);
    localSQLiteDatabase.insertWithOnConflict("user_visible_squares", null, localContentValues, 5);
    return true;
  }
  
  public final boolean a(int paramInt, kyf paramkyf)
  {
    if (!a(paramkyf)) {
      return false;
    }
    long l = System.currentTimeMillis();
    String str1 = paramkyf.a;
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.e, paramInt);
    localSQLiteDatabase.beginTransaction();
    label409:
    label539:
    label543:
    for (;;)
    {
      int i;
      int j;
      ContentValues localContentValues1;
      int k;
      try
      {
        localCursor = localSQLiteDatabase.query("squares", kzq.d, "square_id=?", new String[] { str1 }, null, null, null);
        try
        {
          if (!localCursor.moveToNext()) {
            break label512;
          }
          if (!a(localCursor, paramkyf))
          {
            localList = paramkyf.C;
            if (!localCursor.isNull(33))
            {
              i = 1;
              if ((localList == null) || (localList.size() <= 0)) {
                continue;
              }
              j = 1;
              break label521;
            }
          }
          else
          {
            localContentValues3 = b(paramkyf);
            bool2 = true;
            if (Log.isLoggable("SquaresDataServiceImpl", 3))
            {
              String str3 = String.valueOf(paramkyf.b);
              new StringBuilder(24 + String.valueOf(str1).length() + String.valueOf(str3).length()).append("Update square: id=").append(str1).append(" name=").append(str3);
            }
            localContentValues3.put("last_sync", Long.valueOf(l));
            localContentValues3.put("unread_count", Integer.valueOf(0));
            ContentValues localContentValues4 = localContentValues3;
            bool1 = bool2;
            localContentValues1 = localContentValues4;
            localCursor.close();
            if (localContentValues1 == null) {
              break label409;
            }
            localSQLiteDatabase.update("squares", localContentValues1, "square_id=?", new String[] { str1 });
            localSQLiteDatabase.setTransactionSuccessful();
            localSQLiteDatabase.endTransaction();
            Uri localUri = this.f.a();
            this.e.getContentResolver().notifyChange(localUri, null);
            ((kyk)mbb.a(this.e, kyk.class)).a(paramInt, null);
            return bool1;
          }
          i = 0;
          continue;
          j = 0;
        }
        finally
        {
          List localList;
          ContentValues localContentValues3;
          boolean bool2;
          localCursor.close();
        }
        if ((j == 0) || (mab.d(localCursor.getBlob(33)).equals(localList))) {
          break label539;
        }
        k = 1;
      }
      finally
      {
        Cursor localCursor;
        localSQLiteDatabase.endTransaction();
      }
      localContentValues3 = new ContentValues();
      bool2 = false;
      continue;
      ContentValues localContentValues2 = b(paramkyf);
      localContentValues2.put("last_sync", Long.valueOf(l));
      localSQLiteDatabase.insert("squares", null, localContentValues2);
      boolean bool1 = true;
      if (Log.isLoggable("SquaresDataServiceImpl", 3))
      {
        String str2 = String.valueOf(paramkyf.b);
        new StringBuilder(24 + String.valueOf(str1).length() + String.valueOf(str2).length()).append("Insert square: id=").append(str1).append(" name=").append(str2);
        continue;
        bool1 = false;
        localContentValues1 = null;
        continue;
        if (j != i) {
          for (k = 1;; k = 0)
          {
            if (k == 0) {
              break label543;
            }
            break;
          }
        }
      }
    }
  }
  
  public final int b(int paramInt, String paramString, odl[] paramArrayOfodl)
  {
    if (paramArrayOfodl == null) {
      return 0;
    }
    HashMap localHashMap = new HashMap();
    int i = paramArrayOfodl.length;
    for (int j = 0; j < i; j++)
    {
      odu[] arrayOfodu = paramArrayOfodl[j].d;
      if (arrayOfodu != null)
      {
        int i2 = arrayOfodu.length;
        int i3 = 0;
        if (i3 < i2)
        {
          odu localodu2 = arrayOfodu[i3];
          if (localodu2.a != null)
          {
            str5 = String.valueOf("g:");
            str6 = String.valueOf(localodu2.a);
            if (str6.length() != 0)
            {
              str7 = str5.concat(str6);
              localHashMap.put(str7, localodu2);
            }
          }
          while (localodu2.e == null) {
            for (;;)
            {
              String str5;
              String str6;
              i3++;
              break;
              String str7 = new String(str5);
            }
          }
          String str2 = String.valueOf("t:");
          String str3 = String.valueOf(localodu2.e.a);
          if (str3.length() != 0) {}
          for (String str4 = str2.concat(str3);; str4 = new String(str2))
          {
            localHashMap.put(str4, localodu2);
            break;
          }
        }
      }
    }
    long l = System.currentTimeMillis();
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.e, paramInt);
    localSQLiteDatabase.beginTransaction();
    for (;;)
    {
      ArrayList localArrayList;
      Cursor localCursor;
      int n;
      String str1;
      try
      {
        localArrayList = new ArrayList();
        localCursor = localSQLiteDatabase.query("square_contact", d, "link_square_id=?", new String[] { paramString }, null, null, null, Integer.toString(201));
        if (localCursor.getCount() > 200)
        {
          n = 0 + localSQLiteDatabase.delete("square_contact", "link_square_id=?", new String[] { paramString });
          a(localSQLiteDatabase, paramString, paramArrayOfodl);
          int i1 = n + a(localSQLiteDatabase, paramString, localHashMap.values());
          ContentValues localContentValues = new ContentValues(1);
          localContentValues.put("last_members_sync", Long.valueOf(l));
          localSQLiteDatabase.update("squares", localContentValues, "square_id=?", new String[] { paramString });
          localSQLiteDatabase.setTransactionSuccessful();
          localSQLiteDatabase.endTransaction();
          Uri localUri = this.f.b(paramString);
          this.e.getContentResolver().notifyChange(localUri, null);
          return i1;
        }
        odu localodu1;
        try
        {
          if (!localCursor.moveToNext()) {
            break label522;
          }
          str1 = localCursor.getString(0);
          localodu1 = (odu)localHashMap.get(str1);
          if (localodu1 == null)
          {
            localArrayList.add(str1);
            localHashMap.remove(str1);
            continue;
            localObject1 = finally;
          }
        }
        finally
        {
          localCursor.close();
        }
        if (localCursor.getInt(1) != localodu1.d) {
          continue;
        }
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
      localHashMap.remove(str1);
      continue;
      label522:
      localCursor.close();
      if (!localArrayList.isEmpty())
      {
        StringBuilder localStringBuilder = new StringBuilder();
        int k = localArrayList.size();
        String[] arrayOfString = new String[k + 1];
        localStringBuilder.append("link_square_id=? AND ");
        localStringBuilder.append("qualified_id IN (");
        arrayOfString[0] = paramString;
        for (int m = 0; m < k; m++)
        {
          localStringBuilder.append("?,");
          arrayOfString[(m + 1)] = ((String)localArrayList.get(m));
        }
        localStringBuilder.setLength(-1 + localStringBuilder.length());
        localStringBuilder.append(')');
        n = 0 + localSQLiteDatabase.delete("square_contact", localStringBuilder.toString(), arrayOfString);
        if (Log.isLoggable("SquaresDataServiceImpl", 3)) {
          new StringBuilder(33).append("Delete ").append(k).append(" square members");
        }
      }
      else
      {
        n = 0;
      }
    }
  }
  
  public final long b(int paramInt, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.e, paramInt);
    try
    {
      long l = DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT last_members_sync  FROM squares WHERE square_id=?", new String[] { paramString });
      return l;
    }
    catch (SQLiteDoneException localSQLiteDoneException) {}
    return -1L;
  }
  
  public final Cursor b(int paramInt1, String paramString, int paramInt2)
  {
    int i;
    switch (paramInt2)
    {
    default: 
      i = 3;
    }
    for (;;)
    {
      SQLiteDatabase localSQLiteDatabase = hsb.b(this.e, paramInt1);
      String[] arrayOfString1 = c;
      String[] arrayOfString2 = new String[2];
      arrayOfString2[0] = paramString;
      arrayOfString2[1] = Integer.toString(i);
      return localSQLiteDatabase.query("square_member_status", arrayOfString1, "square_id=? AND membership_status=?", arrayOfString2, null, null, null);
      i = 6;
      continue;
      i = 5;
      continue;
      i = 4;
      continue;
      i = 2;
    }
  }
  
  public final void b(int paramInt)
  {
    hsb.a(this.e, paramInt).delete("my_visible_squares_on_home_page", null, null);
  }
  
  public final boolean b(int paramInt, String paramString1, String paramString2)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2))) {
      return false;
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.e, paramInt);
    ContentValues localContentValues = new ContentValues(2);
    localContentValues.put("gaia_id", paramString1);
    localContentValues.put("square_id", paramString2);
    localSQLiteDatabase.insertWithOnConflict("user_visible_squares_on_home_page", null, localContentValues, 5);
    return true;
  }
  
  public final long c(int paramInt, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.e, paramInt);
    try
    {
      long l = DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT last_volume_sync  FROM squares WHERE square_id=?", new String[] { paramString });
      return l;
    }
    catch (SQLiteDoneException localSQLiteDoneException) {}
    return -1L;
  }
  
  public final Cursor c(int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.e, paramInt);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("my_visible_squares_on_home_page_view");
    return localSQLiteQueryBuilder.query(localSQLiteDatabase, lej.a, null, null, null, null, null);
  }
  
  public final Cursor d(int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.e, paramInt);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("my_visible_squares_view");
    return localSQLiteQueryBuilder.query(localSQLiteDatabase, lej.a, null, null, null, null, null);
  }
  
  /* Error */
  public final boolean d(int paramInt, String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_0
    //   3: getfield 51	laq:e	Landroid/content/Context;
    //   6: iload_1
    //   7: invokestatic 455	hsb:a	(Landroid/content/Context;I)Landroid/database/sqlite/SQLiteDatabase;
    //   10: astore 4
    //   12: aload 4
    //   14: invokevirtual 458	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   17: aload 4
    //   19: ldc_w 525
    //   22: ldc_w 600
    //   25: iconst_1
    //   26: anewarray 21	java/lang/String
    //   29: dup
    //   30: iconst_0
    //   31: aload_2
    //   32: aastore
    //   33: invokevirtual 579	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   36: ifle +15 -> 51
    //   39: aload 4
    //   41: invokevirtual 471	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   44: aload 4
    //   46: invokevirtual 474	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   49: iload_3
    //   50: ireturn
    //   51: iconst_0
    //   52: istore_3
    //   53: goto -14 -> 39
    //   56: astore 5
    //   58: aload 4
    //   60: invokevirtual 474	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   63: aload 5
    //   65: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	laq
    //   0	66	1	paramInt	int
    //   0	66	2	paramString	String
    //   1	52	3	bool	boolean
    //   10	49	4	localSQLiteDatabase	SQLiteDatabase
    //   56	8	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   17	39	56	finally
    //   39	44	56	finally
  }
  
  public final Cursor e(int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.e, paramInt);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("my_joined_or_moderated_squares_view");
    return localSQLiteQueryBuilder.query(localSQLiteDatabase, kzm.a, null, null, null, null, null);
  }
  
  public final boolean e(int paramInt, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.e, paramInt);
    ContentValues localContentValues = new ContentValues(1);
    localContentValues.put("square_id", paramString);
    localSQLiteDatabase.insertWithOnConflict("my_visible_squares", null, localContentValues, 5);
    return true;
  }
  
  public final boolean f(int paramInt, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.e, paramInt);
    ContentValues localContentValues = new ContentValues(1);
    localContentValues.put("square_id", paramString);
    localSQLiteDatabase.insertWithOnConflict("my_visible_squares_on_home_page", null, localContentValues, 5);
    return true;
  }
  
  public final void g(int paramInt, String paramString)
  {
    hsb.a(this.e, paramInt).delete("user_visible_squares", "gaia_id = ? ", new String[] { paramString });
  }
  
  public final void h(int paramInt, String paramString)
  {
    hsb.a(this.e, paramInt).delete("user_visible_squares_on_home_page", "gaia_id = ? ", new String[] { paramString });
  }
  
  public final Cursor i(int paramInt, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.e, paramInt);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("user_visible_squares_on_home_page_view");
    return localSQLiteQueryBuilder.query(localSQLiteDatabase, lej.a, "gaia_id = ? ", new String[] { paramString }, null, null, null);
  }
  
  public final Cursor j(int paramInt, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.e, paramInt);
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("user_visible_squares_view");
    return localSQLiteQueryBuilder.query(localSQLiteDatabase, lej.a, "gaia_id = ? ", new String[] { paramString }, null, null, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     laq
 * JD-Core Version:    0.7.0.1
 */